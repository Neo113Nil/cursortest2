package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzoj extends com.google.android.gms.measurement.internal.zzor {
    private final android.app.AlarmManager zza;
    private com.google.android.gms.measurement.internal.zzay zzb;
    private java.lang.Integer zzc;

    protected zzoj(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
        this.zza = (android.app.AlarmManager) this.zzu.zzaY().getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
    }

    private final com.google.android.gms.measurement.internal.zzay zzf() {
        if (this.zzb == null) {
            this.zzb = new com.google.android.gms.measurement.internal.zzoi(this, this.zzg.zzaf());
        }
        return this.zzb;
    }

    private final void zzh() {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzi());
        }
    }

    private final int zzi() {
        if (this.zzc == null) {
            java.lang.String packageName = this.zzu.zzaY().getPackageName();
            java.lang.String.valueOf(packageName);
            this.zzc = java.lang.Integer.valueOf("measurement".concat(java.lang.String.valueOf(packageName)).hashCode());
        }
        return this.zzc.intValue();
    }

    private final android.app.PendingIntent zzj() {
        android.content.Context zzaY = this.zzu.zzaY();
        return android.app.PendingIntent.getBroadcast(zzaY, 0, new android.content.Intent().setClassName(zzaY, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcg.zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        android.app.AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzh();
        return false;
    }

    public final void zzc(long j) {
        zzay();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaU();
        android.content.Context zzaY = zzibVar.zzaY();
        if (!com.google.android.gms.measurement.internal.zzpo.zzau(zzaY)) {
            zzibVar.zzaV().zzj().zza("Receiver not registered/enabled");
        }
        if (!com.google.android.gms.measurement.internal.zzpo.zzQ(zzaY, false)) {
            zzibVar.zzaV().zzj().zza("Service not registered/enabled");
        }
        zzd();
        zzibVar.zzaV().zzk().zzb("Scheduling upload, millis", java.lang.Long.valueOf(j));
        long elapsedRealtime = zzibVar.zzaZ().elapsedRealtime() + j;
        zzibVar.zzc();
        if (j < java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzL.zzb(null)).longValue()) && !zzf().zzc()) {
            zzf().zzb(j);
        }
        zzibVar.zzaU();
        if (android.os.Build.VERSION.SDK_INT < 24) {
            android.app.AlarmManager alarmManager = this.zza;
            if (alarmManager != null) {
                zzibVar.zzc();
                alarmManager.setInexactRepeating(2, elapsedRealtime, java.lang.Math.max(((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzG.zzb(null)).longValue(), j), zzj());
                return;
            }
            return;
        }
        android.content.Context zzaY2 = zzibVar.zzaY();
        android.content.ComponentName componentName = new android.content.ComponentName(zzaY2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int zzi = zzi();
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzch.zza(zzaY2, new android.app.job.JobInfo.Builder(zzi, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void zzd() {
        zzay();
        this.zzu.zzaV().zzk().zza("Unscheduling upload");
        android.app.AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzf().zzd();
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            zzh();
        }
    }
}
