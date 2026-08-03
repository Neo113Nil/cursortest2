package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class AppMeasurementService extends android.app.Service implements com.google.android.gms.measurement.internal.zzno {
    private com.google.android.gms.measurement.internal.zzns zza;

    private final com.google.android.gms.measurement.internal.zzns zzd() {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzns(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return zzd().zzd(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        zzd().zza();
    }

    @Override // android.app.Service
    public void onDestroy() {
        zzd().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        zzd();
        com.google.android.gms.measurement.internal.zzns.zzi(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        zzd().zzc(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        zzd();
        com.google.android.gms.measurement.internal.zzns.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final void zzb(android.app.job.JobParameters jobParameters, boolean z) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final void zzc(android.content.Intent intent) {
        com.google.android.gms.measurement.AppMeasurementReceiver.completeWakefulIntent(intent);
    }
}
