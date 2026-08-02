package androidx.work.impl.background.systemjob;

/* loaded from: classes3.dex */
public class SystemJobService extends android.app.job.JobService implements androidx.work.impl.ExecutionListener {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.work.Logger.tagWithPrefix("SystemJobService");
    private androidx.work.impl.WorkLauncher getHighSpeedVideoFpsRanges;
    private androidx.work.impl.WorkManagerImpl getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<androidx.work.impl.model.WorkGenerationalId, android.app.job.JobParameters> Camera2StreamConfigurationMap = new java.util.HashMap();
    private final androidx.work.impl.StartStopTokens getHighSpeedVideoSizes = androidx.work.impl.StartStopTokens.create(false);

    static int getHighSpeedVideoSizes(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return androidx.work.WorkInfo.STOP_REASON_UNKNOWN;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            androidx.work.impl.WorkManagerImpl workManagerImpl = androidx.work.impl.WorkManagerImpl.getInstance(getApplicationContext());
            this.getHighSpeedVideoFpsRangesFor = workManagerImpl;
            androidx.work.impl.Processor processor = workManagerImpl.getProcessor();
            this.getHighSpeedVideoFpsRanges = new androidx.work.impl.WorkLauncherImpl(processor, this.getHighSpeedVideoFpsRangesFor.getWorkTaskExecutor());
            processor.addExecutionListener(this);
        } catch (java.lang.IllegalStateException e) {
            if (!android.app.Application.class.equals(getApplication().getClass())) {
                throw new java.lang.IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            androidx.work.Logger.get().warning(getHighResolutionOutputSizeshNQ4ISI, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        androidx.work.impl.WorkManagerImpl workManagerImpl = this.getHighSpeedVideoFpsRangesFor;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        getHighSpeedVideoFpsRanges("onStartJob");
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            androidx.work.Logger.get().debug(getHighResolutionOutputSizeshNQ4ISI, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        androidx.work.impl.model.WorkGenerationalId highSpeedVideoSizes = getHighSpeedVideoSizes(jobParameters);
        if (highSpeedVideoSizes == null) {
            androidx.work.Logger.get().error(getHighResolutionOutputSizeshNQ4ISI, "WorkSpec id not found!");
            return false;
        }
        if (this.Camera2StreamConfigurationMap.containsKey(highSpeedVideoSizes)) {
            androidx.work.Logger.get().debug(getHighResolutionOutputSizeshNQ4ISI, "Job is already being executed by SystemJobService: ".concat(java.lang.String.valueOf(highSpeedVideoSizes)));
            return false;
        }
        androidx.work.Logger.get().debug(getHighResolutionOutputSizeshNQ4ISI, "onStartJob for ".concat(java.lang.String.valueOf(highSpeedVideoSizes)));
        this.Camera2StreamConfigurationMap.put(highSpeedVideoSizes, jobParameters);
        androidx.work.WorkerParameters.RuntimeExtras runtimeExtras = new androidx.work.WorkerParameters.RuntimeExtras();
        if (androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(jobParameters) != null) {
            runtimeExtras.triggeredContentUris = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(jobParameters));
        }
        if (androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getHighSpeedVideoFpsRanges(jobParameters) != null) {
            runtimeExtras.triggeredContentAuthorities = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.Api24Impl.getHighSpeedVideoFpsRanges(jobParameters));
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            runtimeExtras.network = androidx.work.impl.background.systemjob.SystemJobService.Api28Impl.getHighSpeedVideoFpsRangesFor(jobParameters);
        }
        this.getHighSpeedVideoFpsRanges.startWork(this.getHighSpeedVideoSizes.tokenFor(highSpeedVideoSizes), runtimeExtras);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        getHighSpeedVideoFpsRanges("onStopJob");
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            androidx.work.Logger.get().debug(getHighResolutionOutputSizeshNQ4ISI, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        androidx.work.impl.model.WorkGenerationalId highSpeedVideoSizes = getHighSpeedVideoSizes(jobParameters);
        if (highSpeedVideoSizes == null) {
            androidx.work.Logger.get().error(getHighResolutionOutputSizeshNQ4ISI, "WorkSpec id not found!");
            return false;
        }
        androidx.work.Logger.get().debug(getHighResolutionOutputSizeshNQ4ISI, "onStopJob for ".concat(java.lang.String.valueOf(highSpeedVideoSizes)));
        this.Camera2StreamConfigurationMap.remove(highSpeedVideoSizes);
        androidx.work.impl.StartStopToken remove = this.getHighSpeedVideoSizes.remove(highSpeedVideoSizes);
        if (remove != null) {
            this.getHighSpeedVideoFpsRanges.stopWorkWithReason(remove, android.os.Build.VERSION.SDK_INT >= 31 ? androidx.work.impl.background.systemjob.SystemJobService.Api31Impl.getHighSpeedVideoSizes(jobParameters) : androidx.work.WorkInfo.STOP_REASON_UNKNOWN);
        }
        return !this.getHighSpeedVideoFpsRangesFor.getProcessor().isCancelled(highSpeedVideoSizes.getWorkSpecId());
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(androidx.work.impl.model.WorkGenerationalId workGenerationalId, boolean z) {
        getHighSpeedVideoFpsRanges("onExecuted");
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(workGenerationalId.getWorkSpecId());
        sb.append(" executed on JobScheduler");
        logger.debug(str, sb.toString());
        android.app.job.JobParameters remove = this.Camera2StreamConfigurationMap.remove(workGenerationalId);
        this.getHighSpeedVideoSizes.remove(workGenerationalId);
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    private static androidx.work.impl.model.WorkGenerationalId getHighSpeedVideoSizes(android.app.job.JobParameters jobParameters) {
        try {
            android.os.PersistableBundle extras = jobParameters.getExtras();
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

        static android.net.Uri[] getHighResolutionOutputSizeshNQ4ISI(android.app.job.JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }

        static java.lang.String[] getHighSpeedVideoFpsRanges(android.app.job.JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.net.Network getHighSpeedVideoFpsRangesFor(android.app.job.JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static int getHighSpeedVideoSizes(android.app.job.JobParameters jobParameters) {
            return androidx.work.impl.background.systemjob.SystemJobService.getHighSpeedVideoSizes(jobParameters.getStopReason());
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot invoke ");
        sb.append(str);
        sb.append(" on a background thread");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
