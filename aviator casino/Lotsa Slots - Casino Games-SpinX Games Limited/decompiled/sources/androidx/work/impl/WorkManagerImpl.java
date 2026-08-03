package androidx.work.impl;

/* loaded from: classes2.dex */
public class WorkManagerImpl extends androidx.work.WorkManager {
    public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
    public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
    public static final java.lang.String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";
    private androidx.work.Configuration mConfiguration;
    private android.content.Context mContext;
    private boolean mForceStopRunnableCompleted;
    private androidx.work.impl.utils.PreferenceUtils mPreferenceUtils;
    private androidx.work.impl.Processor mProcessor;
    private volatile androidx.work.multiprocess.RemoteWorkManager mRemoteWorkManager;
    private android.content.BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    private java.util.List<androidx.work.impl.Scheduler> mSchedulers;
    private final androidx.work.impl.constraints.trackers.Trackers mTrackers;
    private androidx.work.impl.WorkDatabase mWorkDatabase;
    private androidx.work.impl.utils.taskexecutor.TaskExecutor mWorkTaskExecutor;
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkManagerImpl");
    private static androidx.work.impl.WorkManagerImpl sDelegatedInstance = null;
    private static androidx.work.impl.WorkManagerImpl sDefaultInstance = null;
    private static final java.lang.Object sLock = new java.lang.Object();

    public static void setDelegate(androidx.work.impl.WorkManagerImpl delegate) {
        synchronized (sLock) {
            sDelegatedInstance = delegate;
        }
    }

    @java.lang.Deprecated
    public static androidx.work.impl.WorkManagerImpl getInstance() {
        synchronized (sLock) {
            androidx.work.impl.WorkManagerImpl workManagerImpl = sDelegatedInstance;
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            return sDefaultInstance;
        }
    }

    public static boolean isInitialized() {
        return getInstance() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.work.impl.WorkManagerImpl getInstance(android.content.Context context) {
        androidx.work.impl.WorkManagerImpl workManagerImpl;
        synchronized (sLock) {
            workManagerImpl = getInstance();
            if (workManagerImpl == null) {
                android.content.Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof androidx.work.Configuration.Provider) {
                    initialize(applicationContext, ((androidx.work.Configuration.Provider) applicationContext).getWorkManagerConfiguration());
                    workManagerImpl = getInstance(applicationContext);
                } else {
                    throw new java.lang.IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return workManagerImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (androidx.work.impl.WorkManagerImpl.sDefaultInstance != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        androidx.work.impl.WorkManagerImpl.sDefaultInstance = new androidx.work.impl.WorkManagerImpl(r4, r5, new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor(r5.getTaskExecutor()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        androidx.work.impl.WorkManagerImpl.sDelegatedInstance = androidx.work.impl.WorkManagerImpl.sDefaultInstance;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void initialize(android.content.Context context, androidx.work.Configuration configuration) {
        synchronized (sLock) {
            androidx.work.impl.WorkManagerImpl workManagerImpl = sDelegatedInstance;
            if (workManagerImpl != null && sDefaultInstance != null) {
                throw new java.lang.IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    public WorkManagerImpl(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor) {
        this(context, configuration, workTaskExecutor, context.getResources().getBoolean(androidx.work.R.bool.workmanager_test_configuration));
    }

    public WorkManagerImpl(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, boolean useTestDatabase) {
        this(context, configuration, workTaskExecutor, androidx.work.impl.WorkDatabase.create(context.getApplicationContext(), workTaskExecutor.getSerialTaskExecutor(), useTestDatabase));
    }

    public WorkManagerImpl(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, androidx.work.impl.WorkDatabase database) {
        android.content.Context applicationContext = context.getApplicationContext();
        androidx.work.Logger.setLogger(new androidx.work.Logger.LogcatLogger(configuration.getMinimumLoggingLevel()));
        androidx.work.impl.constraints.trackers.Trackers trackers = new androidx.work.impl.constraints.trackers.Trackers(applicationContext, workTaskExecutor);
        this.mTrackers = trackers;
        java.util.List<androidx.work.impl.Scheduler> createSchedulers = createSchedulers(applicationContext, configuration, trackers);
        internalInit(context, configuration, workTaskExecutor, database, createSchedulers, new androidx.work.impl.Processor(context, configuration, workTaskExecutor, database, createSchedulers));
    }

    public WorkManagerImpl(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, androidx.work.impl.WorkDatabase workDatabase, java.util.List<androidx.work.impl.Scheduler> schedulers, androidx.work.impl.Processor processor) {
        this(context, configuration, workTaskExecutor, workDatabase, schedulers, processor, new androidx.work.impl.constraints.trackers.Trackers(context.getApplicationContext(), workTaskExecutor));
    }

    public WorkManagerImpl(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, androidx.work.impl.WorkDatabase workDatabase, java.util.List<androidx.work.impl.Scheduler> schedulers, androidx.work.impl.Processor processor, androidx.work.impl.constraints.trackers.Trackers trackers) {
        this.mTrackers = trackers;
        internalInit(context, configuration, workTaskExecutor, workDatabase, schedulers, processor);
    }

    public android.content.Context getApplicationContext() {
        return this.mContext;
    }

    public androidx.work.impl.WorkDatabase getWorkDatabase() {
        return this.mWorkDatabase;
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Configuration getConfiguration() {
        return this.mConfiguration;
    }

    public java.util.List<androidx.work.impl.Scheduler> getSchedulers() {
        return this.mSchedulers;
    }

    public androidx.work.impl.Processor getProcessor() {
        return this.mProcessor;
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getWorkTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public androidx.work.impl.utils.PreferenceUtils getPreferenceUtils() {
        return this.mPreferenceUtils;
    }

    public androidx.work.impl.constraints.trackers.Trackers getTrackers() {
        return this.mTrackers;
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation enqueue(java.util.List<? extends androidx.work.WorkRequest> requests) {
        if (requests.isEmpty()) {
            throw new java.lang.IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new androidx.work.impl.WorkContinuationImpl(this, requests).enqueue();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.WorkContinuation beginWith(java.util.List<androidx.work.OneTimeWorkRequest> work) {
        if (work.isEmpty()) {
            throw new java.lang.IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new androidx.work.impl.WorkContinuationImpl(this, work);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.WorkContinuation beginUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> work) {
        if (work.isEmpty()) {
            throw new java.lang.IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new androidx.work.impl.WorkContinuationImpl(this, uniqueWorkName, existingWorkPolicy, work);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation enqueueUniqueWork(java.lang.String uniqueWorkName, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> work) {
        return new androidx.work.impl.WorkContinuationImpl(this, uniqueWorkName, existingWorkPolicy, work).enqueue();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation enqueueUniquePeriodicWork(java.lang.String uniqueWorkName, androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.PeriodicWorkRequest periodicWork) {
        if (existingPeriodicWorkPolicy == androidx.work.ExistingPeriodicWorkPolicy.UPDATE) {
            return androidx.work.impl.WorkerUpdater.enqueueUniquelyNamedPeriodic(this, uniqueWorkName, periodicWork);
        }
        return createWorkContinuationForUniquePeriodicWork(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).enqueue();
    }

    public androidx.work.impl.WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(java.lang.String uniqueWorkName, androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.PeriodicWorkRequest periodicWork) {
        androidx.work.ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == androidx.work.ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = androidx.work.ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = androidx.work.ExistingWorkPolicy.REPLACE;
        }
        return new androidx.work.impl.WorkContinuationImpl(this, uniqueWorkName, existingWorkPolicy, java.util.Collections.singletonList(periodicWork));
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelWorkById(java.util.UUID id) {
        androidx.work.impl.utils.CancelWorkRunnable forId = androidx.work.impl.utils.CancelWorkRunnable.forId(id, this);
        this.mWorkTaskExecutor.executeOnTaskThread(forId);
        return forId.getOperation();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelAllWorkByTag(final java.lang.String tag) {
        androidx.work.impl.utils.CancelWorkRunnable forTag = androidx.work.impl.utils.CancelWorkRunnable.forTag(tag, this);
        this.mWorkTaskExecutor.executeOnTaskThread(forTag);
        return forTag.getOperation();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelUniqueWork(java.lang.String uniqueWorkName) {
        androidx.work.impl.utils.CancelWorkRunnable forName = androidx.work.impl.utils.CancelWorkRunnable.forName(uniqueWorkName, this, true);
        this.mWorkTaskExecutor.executeOnTaskThread(forName);
        return forName.getOperation();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelAllWork() {
        androidx.work.impl.utils.CancelWorkRunnable forAll = androidx.work.impl.utils.CancelWorkRunnable.forAll(this);
        this.mWorkTaskExecutor.executeOnTaskThread(forAll);
        return forAll.getOperation();
    }

    @Override // androidx.work.WorkManager
    public android.app.PendingIntent createCancelPendingIntent(java.util.UUID id) {
        return android.app.PendingIntent.getService(this.mContext, 0, androidx.work.impl.foreground.SystemForegroundDispatcher.createCancelWorkIntent(this.mContext, id.toString()), android.os.Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    @Override // androidx.work.WorkManager
    public androidx.lifecycle.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData() {
        return this.mPreferenceUtils.getLastCancelAllTimeMillisLiveData();
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Long> getLastCancelAllTimeMillis() {
        final androidx.work.impl.utils.futures.SettableFuture create = androidx.work.impl.utils.futures.SettableFuture.create();
        final androidx.work.impl.utils.PreferenceUtils preferenceUtils = this.mPreferenceUtils;
        this.mWorkTaskExecutor.executeOnTaskThread(new java.lang.Runnable() { // from class: androidx.work.impl.WorkManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    create.set(java.lang.Long.valueOf(preferenceUtils.getLastCancelAllTimeMillis()));
                } catch (java.lang.Throwable th) {
                    create.setException(th);
                }
            }
        });
        return create;
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation pruneWork() {
        androidx.work.impl.utils.PruneWorkRunnable pruneWorkRunnable = new androidx.work.impl.utils.PruneWorkRunnable(this);
        this.mWorkTaskExecutor.executeOnTaskThread(pruneWorkRunnable);
        return pruneWorkRunnable.getOperation();
    }

    @Override // androidx.work.WorkManager
    public androidx.lifecycle.LiveData<androidx.work.WorkInfo> getWorkInfoByIdLiveData(java.util.UUID id) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(java.util.Collections.singletonList(id.toString())), new androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>, androidx.work.WorkInfo>() { // from class: androidx.work.impl.WorkManagerImpl.2
            @Override // androidx.arch.core.util.Function
            public androidx.work.WorkInfo apply(java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> input) {
                if (input == null || input.size() <= 0) {
                    return null;
                }
                return input.get(0).toWorkInfo();
            }
        }, this.mWorkTaskExecutor);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> getWorkInfoById(java.util.UUID id) {
        androidx.work.impl.utils.StatusRunnable<androidx.work.WorkInfo> forUUID = androidx.work.impl.utils.StatusRunnable.forUUID(this, id);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(forUUID);
        return forUUID.getFuture();
    }

    @Override // androidx.work.WorkManager
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTagLiveData(java.lang.String tag) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForTag(tag), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTag(java.lang.String tag) {
        androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forTag = androidx.work.impl.utils.StatusRunnable.forTag(this, tag);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(forTag);
        return forTag.getFuture();
    }

    @Override // androidx.work.WorkManager
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWorkLiveData(java.lang.String uniqueWorkName) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForName(uniqueWorkName), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWork(java.lang.String uniqueWorkName) {
        androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forUniqueWork = androidx.work.impl.utils.StatusRunnable.forUniqueWork(this, uniqueWorkName);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(forUniqueWork);
        return forUniqueWork.getFuture();
    }

    @Override // androidx.work.WorkManager
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData(androidx.work.WorkQuery workQuery) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.rawWorkInfoDao().getWorkInfoPojosLiveData(androidx.work.impl.utils.RawQueries.toRawQuery(workQuery)), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(androidx.work.WorkQuery workQuery) {
        androidx.work.impl.utils.StatusRunnable<java.util.List<androidx.work.WorkInfo>> forWorkQuerySpec = androidx.work.impl.utils.StatusRunnable.forWorkQuerySpec(this, workQuery);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(forWorkQuerySpec);
        return forWorkQuerySpec.getFuture();
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkManager.UpdateResult> updateWork(androidx.work.WorkRequest request) {
        return androidx.work.impl.WorkerUpdater.updateWorkImpl(this, request);
    }

    androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosById(java.util.List<java.lang.String> workSpecIds) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(workSpecIds), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, this.mWorkTaskExecutor);
    }

    public androidx.work.multiprocess.RemoteWorkManager getRemoteWorkManager() {
        if (this.mRemoteWorkManager == null) {
            synchronized (sLock) {
                if (this.mRemoteWorkManager == null) {
                    tryInitializeMultiProcessSupport();
                    if (this.mRemoteWorkManager == null && !android.text.TextUtils.isEmpty(this.mConfiguration.getDefaultProcessName())) {
                        throw new java.lang.IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.mRemoteWorkManager;
    }

    public void startWork(androidx.work.impl.StartStopToken workSpecId) {
        startWork(workSpecId, null);
    }

    public void startWork(androidx.work.impl.StartStopToken workSpecId, androidx.work.WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mWorkTaskExecutor.executeOnTaskThread(new androidx.work.impl.utils.StartWorkRunnable(this, workSpecId, runtimeExtras));
    }

    public void stopWork(androidx.work.impl.StartStopToken workSpecId) {
        this.mWorkTaskExecutor.executeOnTaskThread(new androidx.work.impl.utils.StopWorkRunnable(this, workSpecId, false));
    }

    public void stopForegroundWork(androidx.work.impl.model.WorkGenerationalId id) {
        this.mWorkTaskExecutor.executeOnTaskThread(new androidx.work.impl.utils.StopWorkRunnable(this, new androidx.work.impl.StartStopToken(id), true));
    }

    public void rescheduleEligibleWork() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.SystemJobScheduler.cancelAll(getApplicationContext());
        }
        getWorkDatabase().workSpecDao().resetScheduledState();
        androidx.work.impl.Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    public void onForceStopRunnableCompleted() {
        synchronized (sLock) {
            this.mForceStopRunnableCompleted = true;
            android.content.BroadcastReceiver.PendingResult pendingResult = this.mRescheduleReceiverResult;
            if (pendingResult != null) {
                pendingResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    public void setReschedulePendingResult(android.content.BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (sLock) {
            android.content.BroadcastReceiver.PendingResult pendingResult = this.mRescheduleReceiverResult;
            if (pendingResult != null) {
                pendingResult.finish();
            }
            this.mRescheduleReceiverResult = rescheduleReceiverResult;
            if (this.mForceStopRunnableCompleted) {
                rescheduleReceiverResult.finish();
                this.mRescheduleReceiverResult = null;
            }
        }
    }

    private void internalInit(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor workTaskExecutor, androidx.work.impl.WorkDatabase workDatabase, java.util.List<androidx.work.impl.Scheduler> schedulers, androidx.work.impl.Processor processor) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = workTaskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = schedulers;
        this.mProcessor = processor;
        this.mPreferenceUtils = new androidx.work.impl.utils.PreferenceUtils(workDatabase);
        this.mForceStopRunnableCompleted = false;
        if (android.os.Build.VERSION.SDK_INT >= 24 && androidx.work.impl.WorkManagerImpl.Api24Impl.isDeviceProtectedStorage(applicationContext)) {
            throw new java.lang.IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.mWorkTaskExecutor.executeOnTaskThread(new androidx.work.impl.utils.ForceStopRunnable(applicationContext, this));
    }

    public java.util.List<androidx.work.impl.Scheduler> createSchedulers(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.constraints.trackers.Trackers trackers) {
        return java.util.Arrays.asList(androidx.work.impl.Schedulers.createBestAvailableBackgroundScheduler(context, this), new androidx.work.impl.background.greedy.GreedyScheduler(context, configuration, trackers, this));
    }

    private void tryInitializeMultiProcessSupport() {
        try {
            this.mRemoteWorkManager = (androidx.work.multiprocess.RemoteWorkManager) java.lang.Class.forName(REMOTE_WORK_MANAGER_CLIENT).getConstructor(android.content.Context.class, androidx.work.impl.WorkManagerImpl.class).newInstance(this.mContext, this);
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().debug(TAG, "Unable to initialize multi-process support", th);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isDeviceProtectedStorage(android.content.Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
}
