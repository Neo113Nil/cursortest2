package androidx.work.impl.background.systemjob;

/* loaded from: classes2.dex */
public class SystemJobService extends android.app.job.JobService implements androidx.work.impl.ExecutionListener {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemJobService");
    private final java.util.Map<androidx.work.impl.model.WorkGenerationalId, android.app.job.JobParameters> mJobParameters = new java.util.HashMap();
    private final androidx.work.impl.StartStopTokens mStartStopTokens = new androidx.work.impl.StartStopTokens();
    private androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(getApplicationContext());
            this.mWorkManagerImpl = workManagerImpl;
            workManagerImpl.getProcessor().addExecutionListener(this);
        } catch (java.lang.IllegalStateException unused) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            androidx.work.Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters params) {
        androidx.work.WorkerParameters.RuntimeExtras runtimeExtras;
        if (this.mWorkManagerImpl == null) {
            androidx.work.Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.");
            jobFinished(params, true);
            return false;
        }
        androidx.work.impl.model.WorkGenerationalId workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(params);
        if (workGenerationalIdFromJobParameters == null) {
            androidx.work.Logger.get().error(TAG, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.mJobParameters) {
            if (this.mJobParameters.containsKey(workGenerationalIdFromJobParameters)) {
                androidx.work.Logger.get().debug(TAG, "Job is already being executed by SystemJobService: " + workGenerationalIdFromJobParameters);
                return false;
            }
            androidx.work.Logger.get().debug(TAG, "onStartJob for " + workGenerationalIdFromJobParameters);
            this.mJobParameters.put(workGenerationalIdFromJobParameters, params);
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                runtimeExtras = new androidx.work.WorkerParameters.RuntimeExtras();
                if (androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getTriggeredContentUris(params) != null) {
                    runtimeExtras.triggeredContentUris = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getTriggeredContentUris(params));
                }
                if (androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getTriggeredContentAuthorities(params) != null) {
                    runtimeExtras.triggeredContentAuthorities = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getTriggeredContentAuthorities(params));
                }
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    runtimeExtras.network = androidx.work.impl.background.systemjob.SystemJobService.Api28Impl.getNetwork(params);
                }
            } else {
                runtimeExtras = null;
            }
            this.mWorkManagerImpl.startWork(this.mStartStopTokens.tokenFor(workGenerationalIdFromJobParameters), runtimeExtras);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters params) {
        if (this.mWorkManagerImpl == null) {
            androidx.work.Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        androidx.work.impl.model.WorkGenerationalId workGenerationalIdFromJobParameters = workGenerationalIdFromJobParameters(params);
        if (workGenerationalIdFromJobParameters == null) {
            androidx.work.Logger.get().error(TAG, "WorkSpec id not found!");
            return false;
        }
        androidx.work.Logger.get().debug(TAG, "onStopJob for " + workGenerationalIdFromJobParameters);
        synchronized (this.mJobParameters) {
            this.mJobParameters.remove(workGenerationalIdFromJobParameters);
        }
        androidx.work.impl.StartStopToken remove = this.mStartStopTokens.remove(workGenerationalIdFromJobParameters);
        if (remove != null) {
            this.mWorkManagerImpl.stopWork(remove);
        }
        return !this.mWorkManagerImpl.getProcessor().isCancelled(workGenerationalIdFromJobParameters.getWorkSpecId());
    }

    @Override // androidx.work.impl.ExecutionListener
    /* renamed from: onExecuted */
    public void m4930lambda$runOnExecuted$1$androidxworkimplProcessor(androidx.work.impl.model.WorkGenerationalId id, boolean needsReschedule) {
        android.app.job.JobParameters remove;
        androidx.work.Logger.get().debug(TAG, id.getWorkSpecId() + " executed on JobScheduler");
        synchronized (this.mJobParameters) {
            remove = this.mJobParameters.remove(id);
        }
        this.mStartStopTokens.remove(id);
        if (remove != null) {
            jobFinished(remove, needsReschedule);
        }
    }

    private static androidx.work.impl.model.WorkGenerationalId workGenerationalIdFromJobParameters(android.app.job.JobParameters parameters) {
        try {
            android.os.PersistableBundle extras = parameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new androidx.work.impl.model.WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (java.lang.NullPointerException unused) {
            return null;
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.net.Uri[] getTriggeredContentUris(android.app.job.JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }

        static java.lang.String[] getTriggeredContentAuthorities(android.app.job.JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.net.Network getNetwork(android.app.job.JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }
}
