package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzlp extends com.google.android.gms.measurement.internal.zzg {
    private android.app.job.JobScheduler zza;

    public zzlp(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzf() {
        this.zza = (android.app.job.JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
    }

    public final void zzh(long j) {
        zzb();
        zzg();
        android.app.job.JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob(zzi()) != null) {
            this.zzu.zzaV().zzk().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.zzin zzj = zzj();
        if (zzj != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
            this.zzu.zzaV().zzk().zzb("[sgtm] Not eligible for Scion upload", zzj.name());
            return;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("[sgtm] Scheduling Scion upload, millis", java.lang.Long.valueOf(j));
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        zzibVar.zzaV().zzk().zzb("[sgtm] Scion upload job scheduled with result", ((android.app.job.JobScheduler) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza)).schedule(new android.app.job.JobInfo.Builder(zzi(), new android.content.ComponentName(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    final int zzi() {
        java.lang.String packageName = this.zzu.zzaY().getPackageName();
        java.lang.String.valueOf(packageName);
        return "measurement-client".concat(java.lang.String.valueOf(packageName)).hashCode();
    }

    final com.google.android.gms.internal.measurement.zzin zzj() {
        zzb();
        zzg();
        if (this.zza == null) {
            return com.google.android.gms.internal.measurement.zzin.MISSING_JOB_SCHEDULER;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzx()) {
            return com.google.android.gms.internal.measurement.zzin.NOT_ENABLED_IN_MANIFEST;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        return zzibVar2.zzv().zzn() >= 119000 ? !com.google.android.gms.measurement.internal.zzpo.zzR(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService") ? com.google.android.gms.internal.measurement.zzin.MEASUREMENT_SERVICE_NOT_ENABLED : android.os.Build.VERSION.SDK_INT >= 24 ? !zzibVar2.zzt().zzK() ? com.google.android.gms.internal.measurement.zzin.NON_PLAY_MODE : com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE : com.google.android.gms.internal.measurement.zzin.ANDROID_TOO_OLD : com.google.android.gms.internal.measurement.zzin.SDK_TOO_OLD;
    }
}
