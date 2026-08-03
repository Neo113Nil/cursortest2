package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
abstract class zzay {
    private static volatile android.os.Handler zzb;
    private final com.google.android.gms.measurement.internal.zzjf zza;
    private final java.lang.Runnable zzc;
    private volatile long zzd;

    zzay(com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjfVar);
        this.zza = zzjfVar;
        this.zzc = new com.google.android.gms.measurement.internal.zzax(this, zzjfVar);
    }

    private final android.os.Handler zzf() {
        android.os.Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (com.google.android.gms.measurement.internal.zzay.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.measurement.zzcn(this.zza.zzaY().getMainLooper());
            }
            handler = zzb;
        }
        return handler;
    }

    public abstract void zza();

    public final void zzb(long j) {
        zzd();
        if (j >= 0) {
            com.google.android.gms.measurement.internal.zzjf zzjfVar = this.zza;
            this.zzd = zzjfVar.zzaZ().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j)) {
                return;
            }
            zzjfVar.zzaV().zzb().zzb("Failed to schedule delayed post. time", java.lang.Long.valueOf(j));
        }
    }

    public final boolean zzc() {
        return this.zzd != 0;
    }

    final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    final /* synthetic */ void zze(long j) {
        this.zzd = 0L;
    }
}
