package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkManagerImpl extends androidx.work.WorkManager {
    public static final int CONTENT_URI_TRIGGER_API_LEVEL = 24;
    public static final java.lang.String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";
    final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    androidx.work.impl.WorkDatabase getHighResolutionOutputSizeshNQ4ISI;
    androidx.work.impl.utils.taskexecutor.TaskExecutor getHighSpeedVideoSizes;
    private androidx.work.Configuration getInputFormats;
    private android.content.Context getInputSizeshNQ4ISI;
    private boolean getOutputMinFrameDuration = false;
    private androidx.work.impl.Processor getOutputMinFrameDurationlomOqCM;
    private volatile androidx.work.multiprocess.RemoteWorkManager getOutputSizes;
    private java.util.List<androidx.work.impl.Scheduler> getOutputSizeshNQ4ISI;
    private androidx.work.impl.utils.PreferenceUtils getOutputStallDuration;
    private android.content.BroadcastReceiver.PendingResult getOutputStallDurationlomOqCM;
    private final androidx.work.impl.constraints.trackers.Trackers isOutputSupportedForhNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.work.Logger.tagWithPrefix("WorkManagerImpl");
    private static androidx.work.impl.WorkManagerImpl getOutputFormats = null;
    private static androidx.work.impl.WorkManagerImpl getHighSpeedVideoFpsRanges = null;
    private static final java.lang.Object getHighSpeedVideoSizesFor = new java.lang.Object();

    public static void setDelegate(androidx.work.impl.WorkManagerImpl workManagerImpl) {
        synchronized (getHighSpeedVideoSizesFor) {
            getOutputFormats = workManagerImpl;
        }
    }

    @java.lang.Deprecated
    public static androidx.work.impl.WorkManagerImpl getInstance() {
        synchronized (getHighSpeedVideoSizesFor) {
            androidx.work.impl.WorkManagerImpl workManagerImpl = getOutputFormats;
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            return getHighSpeedVideoFpsRanges;
        }
    }

    public static boolean isInitialized() {
        return getInstance() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static androidx.work.impl.WorkManagerImpl getInstance(android.content.Context context) {
        androidx.work.impl.WorkManagerImpl workManagerImpl;
        synchronized (getHighSpeedVideoSizesFor) {
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
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (androidx.work.impl.WorkManagerImpl.getHighSpeedVideoFpsRanges != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        androidx.work.impl.WorkManagerImpl.getHighSpeedVideoFpsRanges = androidx.work.impl.WorkManagerImplExtKt.createWorkManager(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        androidx.work.impl.WorkManagerImpl.getOutputFormats = androidx.work.impl.WorkManagerImpl.getHighSpeedVideoFpsRanges;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void initialize(android.content.Context context, androidx.work.Configuration configuration) {
        synchronized (getHighSpeedVideoSizesFor) {
            androidx.work.impl.WorkManagerImpl workManagerImpl = getOutputFormats;
            if (workManagerImpl != null && getHighSpeedVideoFpsRanges != null) {
                throw new java.lang.IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    public WorkManagerImpl(android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, androidx.work.impl.WorkDatabase workDatabase, java.util.List<androidx.work.impl.Scheduler> list, androidx.work.impl.Processor processor, androidx.work.impl.constraints.trackers.Trackers trackers) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (androidx.work.impl.WorkManagerImpl.Api24Impl.getHighSpeedVideoSizes(applicationContext)) {
            throw new java.lang.IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        androidx.work.Logger.setLogger(new androidx.work.Logger.LogcatLogger(configuration.getMinimumLoggingLevel()));
        this.getInputSizeshNQ4ISI = applicationContext;
        this.getHighSpeedVideoSizes = taskExecutor;
        this.getHighResolutionOutputSizeshNQ4ISI = workDatabase;
        this.getOutputMinFrameDurationlomOqCM = processor;
        this.isOutputSupportedForhNQ4ISI = trackers;
        this.getInputFormats = configuration;
        this.getOutputSizeshNQ4ISI = list;
        kotlinx.coroutines.CoroutineScope createWorkManagerScope = androidx.work.impl.WorkManagerImplExtKt.createWorkManagerScope(taskExecutor);
        this.Camera2StreamConfigurationMap = createWorkManagerScope;
        this.getOutputStallDuration = new androidx.work.impl.utils.PreferenceUtils(this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.work.impl.Schedulers.registerRescheduling(list, this.getOutputMinFrameDurationlomOqCM, taskExecutor.getSerialTaskExecutor(), this.getHighResolutionOutputSizeshNQ4ISI, configuration);
        this.getHighSpeedVideoSizes.executeOnTaskThread(new androidx.work.impl.utils.ForceStopRunnable(applicationContext, this));
        androidx.work.impl.UnfinishedWorkListenerKt.maybeLaunchUnfinishedWorkListener(createWorkManagerScope, this.getInputSizeshNQ4ISI, configuration, workDatabase);
    }

    public android.content.Context getApplicationContext() {
        return this.getInputSizeshNQ4ISI;
    }

    public androidx.work.impl.WorkDatabase getWorkDatabase() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Configuration getConfiguration() {
        return this.getInputFormats;
    }

    public java.util.List<androidx.work.impl.Scheduler> getSchedulers() {
        return this.getOutputSizeshNQ4ISI;
    }

    public androidx.work.impl.Processor getProcessor() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public androidx.work.impl.utils.taskexecutor.TaskExecutor getWorkTaskExecutor() {
        return this.getHighSpeedVideoSizes;
    }

    public androidx.work.impl.utils.PreferenceUtils getPreferenceUtils() {
        return this.getOutputStallDuration;
    }

    public androidx.work.impl.constraints.trackers.Trackers getTrackers() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation enqueue(java.util.List<? extends androidx.work.WorkRequest> list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new androidx.work.impl.WorkContinuationImpl(this, list).enqueue();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.WorkContinuation beginWith(java.util.List<androidx.work.OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new androidx.work.impl.WorkContinuationImpl(this, list);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.WorkContinuation beginUniqueWork(java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new androidx.work.impl.WorkContinuationImpl(this, str, existingWorkPolicy, list);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation enqueueUniqueWork(java.lang.String str, androidx.work.ExistingWorkPolicy existingWorkPolicy, java.util.List<androidx.work.OneTimeWorkRequest> list) {
        return new androidx.work.impl.WorkContinuationImpl(this, str, existingWorkPolicy, list).enqueue();
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation enqueueUniquePeriodicWork(java.lang.String str, androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.PeriodicWorkRequest periodicWorkRequest) {
        if (existingPeriodicWorkPolicy == androidx.work.ExistingPeriodicWorkPolicy.UPDATE) {
            return androidx.work.impl.WorkerUpdater.enqueueUniquelyNamedPeriodic(this, str, periodicWorkRequest);
        }
        return createWorkContinuationForUniquePeriodicWork(str, existingPeriodicWorkPolicy, periodicWorkRequest).enqueue();
    }

    public androidx.work.impl.WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(java.lang.String str, androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, androidx.work.PeriodicWorkRequest periodicWorkRequest) {
        androidx.work.ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == androidx.work.ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = androidx.work.ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = androidx.work.ExistingWorkPolicy.REPLACE;
        }
        return new androidx.work.impl.WorkContinuationImpl(this, str, existingWorkPolicy, java.util.Collections.singletonList(periodicWorkRequest));
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelWorkById(java.util.UUID uuid) {
        return androidx.work.impl.utils.CancelWorkRunnable.forId(uuid, this);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelAllWorkByTag(java.lang.String str) {
        return androidx.work.impl.utils.CancelWorkRunnable.forTag(str, this);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelUniqueWork(java.lang.String str) {
        return androidx.work.impl.utils.CancelWorkRunnable.forName(str, this);
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation cancelAllWork() {
        return androidx.work.impl.utils.CancelWorkRunnable.forAll(this);
    }

    @Override // androidx.work.WorkManager
    public android.app.PendingIntent createCancelPendingIntent(java.util.UUID uuid) {
        return android.app.PendingIntent.getService(this.getInputSizeshNQ4ISI, 0, androidx.work.impl.foreground.SystemForegroundDispatcher.createCancelWorkIntent(this.getInputSizeshNQ4ISI, uuid.toString()), android.os.Build.VERSION.SDK_INT >= 31 ? 167772160 : androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    @Override // androidx.work.WorkManager
    public androidx.view.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData() {
        return this.getOutputStallDuration.getLastCancelAllTimeMillisLiveData();
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Long> getLastCancelAllTimeMillis() {
        final androidx.work.impl.utils.PreferenceUtils preferenceUtils = this.getOutputStallDuration;
        androidx.work.impl.utils.taskexecutor.SerialExecutor serialTaskExecutor = this.getHighSpeedVideoSizes.getSerialTaskExecutor();
        java.util.Objects.requireNonNull(preferenceUtils);
        return androidx.work.ListenableFutureKt.executeAsync(serialTaskExecutor, "getLastCancelAllTimeMillis", new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkManagerImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(androidx.work.impl.utils.PreferenceUtils.this.getLastCancelAllTimeMillis());
            }
        });
    }

    @Override // androidx.work.WorkManager
    public androidx.work.Operation pruneWork() {
        return androidx.work.impl.utils.PruneWorkRunnableKt.pruneWork(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.work.WorkManager
    public androidx.view.LiveData<androidx.work.WorkInfo> getWorkInfoByIdLiveData(java.util.UUID uuid) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.getHighResolutionOutputSizeshNQ4ISI.workSpecDao().getWorkStatusPojoLiveDataForIds(java.util.Collections.singletonList(uuid.toString())), new androidx.arch.core.util.Function<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>, androidx.work.WorkInfo>() { // from class: androidx.work.impl.WorkManagerImpl.1
            @Override // androidx.arch.core.util.Function
            public /* synthetic */ androidx.work.WorkInfo apply(java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> list) {
                java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> list2 = list;
                if (list2 == null || list2.size() <= 0) {
                    return null;
                }
                return list2.get(0).toWorkInfo();
            }
        }, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.work.WorkManager
    public kotlinx.coroutines.flow.Flow<androidx.work.WorkInfo> getWorkInfoByIdFlow(java.util.UUID uuid) {
        return androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowDataForIds(getWorkDatabase().workSpecDao(), uuid);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkInfo> getWorkInfoById(java.util.UUID uuid) {
        return androidx.work.impl.utils.StatusRunnable.forUUID(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, uuid);
    }

    @Override // androidx.work.WorkManager
    public kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTagFlow(java.lang.String str) {
        return androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowForTag(this.getHighResolutionOutputSizeshNQ4ISI.workSpecDao(), this.getHighSpeedVideoSizes.getTaskCoroutineDispatcher(), str);
    }

    @Override // androidx.work.WorkManager
    public androidx.view.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTagLiveData(java.lang.String str) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.getHighResolutionOutputSizeshNQ4ISI.workSpecDao().getWorkStatusPojoLiveDataForTag(str), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosByTag(java.lang.String str) {
        return androidx.work.impl.utils.StatusRunnable.forTag(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, str);
    }

    @Override // androidx.work.WorkManager
    public androidx.view.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWorkLiveData(java.lang.String str) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.getHighResolutionOutputSizeshNQ4ISI.workSpecDao().getWorkStatusPojoLiveDataForName(str), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.work.WorkManager
    public kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWorkFlow(java.lang.String str) {
        return androidx.work.impl.model.WorkSpecDaoKt.getWorkStatusPojoFlowForName(this.getHighResolutionOutputSizeshNQ4ISI.workSpecDao(), this.getHighSpeedVideoSizes.getTaskCoroutineDispatcher(), str);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfosForUniqueWork(java.lang.String str) {
        return androidx.work.impl.utils.StatusRunnable.forUniqueWork(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, str);
    }

    @Override // androidx.work.WorkManager
    public androidx.view.LiveData<java.util.List<androidx.work.WorkInfo>> getWorkInfosLiveData(androidx.work.WorkQuery workQuery) {
        return androidx.work.impl.utils.LiveDataUtils.dedupedMappedLiveDataFor(this.getHighResolutionOutputSizeshNQ4ISI.rawWorkInfoDao().getWorkInfoPojosLiveData(androidx.work.impl.utils.RawQueries.toRawQuery(workQuery)), androidx.work.impl.model.WorkSpec.WORK_INFO_MAPPER, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.work.WorkManager
    public kotlinx.coroutines.flow.Flow<java.util.List<androidx.work.WorkInfo>> getWorkInfosFlow(androidx.work.WorkQuery workQuery) {
        return androidx.work.impl.model.RawWorkInfoDaoKt.getWorkInfoPojosFlow(this.getHighResolutionOutputSizeshNQ4ISI.rawWorkInfoDao(), this.getHighSpeedVideoSizes.getTaskCoroutineDispatcher(), androidx.work.impl.utils.RawQueries.toRawQuery(workQuery));
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.work.WorkInfo>> getWorkInfos(androidx.work.WorkQuery workQuery) {
        return androidx.work.impl.utils.StatusRunnable.forWorkQuerySpec(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, workQuery);
    }

    @Override // androidx.work.WorkManager
    public com.google.common.util.concurrent.ListenableFuture<androidx.work.WorkManager.UpdateResult> updateWork(androidx.work.WorkRequest workRequest) {
        return androidx.work.impl.WorkerUpdater.updateWorkImpl(this, workRequest);
    }

    public androidx.work.multiprocess.RemoteWorkManager getRemoteWorkManager() {
        if (this.getOutputSizes == null) {
            synchronized (getHighSpeedVideoSizesFor) {
                if (this.getOutputSizes == null) {
                    try {
                        this.getOutputSizes = (androidx.work.multiprocess.RemoteWorkManager) java.lang.Class.forName(REMOTE_WORK_MANAGER_CLIENT).getConstructor(android.content.Context.class, androidx.work.impl.WorkManagerImpl.class).newInstance(this.getInputSizeshNQ4ISI, this);
                    } catch (java.lang.Throwable th) {
                        androidx.work.Logger.get().debug(getHighSpeedVideoFpsRangesFor, "Unable to initialize multi-process support", th);
                    }
                    if (this.getOutputSizes == null && !android.text.TextUtils.isEmpty(this.getInputFormats.getDefaultProcessName())) {
                        throw new java.lang.IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.getOutputSizes;
    }

    public void stopForegroundWork(androidx.work.impl.model.WorkGenerationalId workGenerationalId, int i) {
        this.getHighSpeedVideoSizes.executeOnTaskThread(new androidx.work.impl.utils.StopWorkRunnable(this.getOutputMinFrameDurationlomOqCM, new androidx.work.impl.StartStopToken(workGenerationalId), true, i));
    }

    public void rescheduleEligibleWork() {
        androidx.work.TracerKt.traced(getConfiguration().getTracer(), "ReschedulingWork", new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.WorkManagerImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.this;
                androidx.work.impl.background.systemjob.SystemJobScheduler.cancelAllInAllNamespaces(workManagerImpl.getApplicationContext());
                workManagerImpl.getWorkDatabase().workSpecDao().resetScheduledState();
                androidx.work.impl.Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
                return kotlin.Unit.INSTANCE;
            }
        });
    }

    public void onForceStopRunnableCompleted() {
        synchronized (getHighSpeedVideoSizesFor) {
            this.getOutputMinFrameDuration = true;
            android.content.BroadcastReceiver.PendingResult pendingResult = this.getOutputStallDurationlomOqCM;
            if (pendingResult != null) {
                pendingResult.finish();
                this.getOutputStallDurationlomOqCM = null;
            }
        }
    }

    public void setReschedulePendingResult(android.content.BroadcastReceiver.PendingResult pendingResult) {
        synchronized (getHighSpeedVideoSizesFor) {
            android.content.BroadcastReceiver.PendingResult pendingResult2 = this.getOutputStallDurationlomOqCM;
            if (pendingResult2 != null) {
                pendingResult2.finish();
            }
            this.getOutputStallDurationlomOqCM = pendingResult;
            if (this.getOutputMinFrameDuration) {
                pendingResult.finish();
                this.getOutputStallDurationlomOqCM = null;
            }
        }
    }

    public void closeDatabase() {
        androidx.work.impl.WorkManagerImplExtKt.close(this);
    }

    /* loaded from: classes3.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.content.Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
}
