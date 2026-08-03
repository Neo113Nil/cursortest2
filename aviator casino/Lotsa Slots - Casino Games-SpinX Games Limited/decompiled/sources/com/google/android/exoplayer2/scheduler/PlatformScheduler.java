package com.google.android.exoplayer2.scheduler;

/* loaded from: classes3.dex */
public final class PlatformScheduler implements com.google.android.exoplayer2.scheduler.Scheduler {
    private static final java.lang.String KEY_REQUIREMENTS = "requirements";
    private static final java.lang.String KEY_SERVICE_ACTION = "service_action";
    private static final java.lang.String KEY_SERVICE_PACKAGE = "service_package";
    private static final int SUPPORTED_REQUIREMENTS;
    private static final java.lang.String TAG = "PlatformScheduler";
    private final int jobId;
    private final android.app.job.JobScheduler jobScheduler;
    private final android.content.ComponentName jobServiceComponentName;

    static {
        SUPPORTED_REQUIREMENTS = (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 ? 16 : 0) | 15;
    }

    public PlatformScheduler(android.content.Context context, int i) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.jobId = i;
        this.jobServiceComponentName = new android.content.ComponentName(applicationContext, (java.lang.Class<?>) com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService.class);
        this.jobScheduler = (android.app.job.JobScheduler) com.google.android.exoplayer2.util.Assertions.checkNotNull((android.app.job.JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean schedule(com.google.android.exoplayer2.scheduler.Requirements requirements, java.lang.String str, java.lang.String str2) {
        return this.jobScheduler.schedule(buildJobInfo(this.jobId, this.jobServiceComponentName, requirements, str2, str)) == 1;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean cancel() {
        this.jobScheduler.cancel(this.jobId);
        return true;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public com.google.android.exoplayer2.scheduler.Requirements getSupportedRequirements(com.google.android.exoplayer2.scheduler.Requirements requirements) {
        return requirements.filterRequirements(SUPPORTED_REQUIREMENTS);
    }

    private static android.app.job.JobInfo buildJobInfo(int i, android.content.ComponentName componentName, com.google.android.exoplayer2.scheduler.Requirements requirements, java.lang.String str, java.lang.String str2) {
        com.google.android.exoplayer2.scheduler.Requirements filterRequirements = requirements.filterRequirements(SUPPORTED_REQUIREMENTS);
        if (!filterRequirements.equals(requirements)) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring unsupported requirements: " + (filterRequirements.getRequirements() ^ requirements.getRequirements()));
        }
        android.app.job.JobInfo.Builder builder = new android.app.job.JobInfo.Builder(i, componentName);
        if (requirements.isUnmeteredNetworkRequired()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.isNetworkRequired()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 && requirements.isStorageNotLowRequired()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString(KEY_SERVICE_ACTION, str);
        persistableBundle.putString(KEY_SERVICE_PACKAGE, str2);
        persistableBundle.putInt("requirements", requirements.getRequirements());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    public static final class PlatformSchedulerService extends android.app.job.JobService {
        @Override // android.app.job.JobService
        public boolean onStopJob(android.app.job.JobParameters jobParameters) {
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(android.app.job.JobParameters jobParameters) {
            android.os.PersistableBundle extras = jobParameters.getExtras();
            int notMetRequirements = new com.google.android.exoplayer2.scheduler.Requirements(extras.getInt("requirements")).getNotMetRequirements(this);
            if (notMetRequirements == 0) {
                com.google.android.exoplayer2.util.Util.startForegroundService(this, new android.content.Intent((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(extras.getString(com.google.android.exoplayer2.scheduler.PlatformScheduler.KEY_SERVICE_ACTION))).setPackage((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(extras.getString(com.google.android.exoplayer2.scheduler.PlatformScheduler.KEY_SERVICE_PACKAGE))));
                return false;
            }
            com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.scheduler.PlatformScheduler.TAG, "Requirements not met: " + notMetRequirements);
            jobFinished(jobParameters, true);
            return false;
        }
    }
}
