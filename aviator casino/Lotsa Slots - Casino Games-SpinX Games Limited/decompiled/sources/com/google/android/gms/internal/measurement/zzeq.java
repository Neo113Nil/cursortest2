package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
abstract class zzeq implements java.lang.Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzk;

    zzeq(com.google.android.gms.internal.measurement.zzfb zzfbVar, boolean z) {
        java.util.Objects.requireNonNull(zzfbVar);
        this.zzk = zzfbVar;
        this.zzh = zzfbVar.zza.currentTimeMillis();
        this.zzi = zzfbVar.zza.elapsedRealtime();
        this.zzj = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzk.zzP()) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (java.lang.Exception e) {
            this.zzk.zzN(e, false, this.zzj);
            zzb();
        }
    }

    abstract void zza() throws android.os.RemoteException;

    protected void zzb() {
    }
}
