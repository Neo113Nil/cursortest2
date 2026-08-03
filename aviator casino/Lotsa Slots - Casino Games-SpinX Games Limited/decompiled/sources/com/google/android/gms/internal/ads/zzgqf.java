package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgqf {
    private final com.google.android.gms.internal.ads.zzgfh zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private long zzc = -1;
    private long zzd = -1;
    private java.lang.Throwable zze = null;
    private final int zzf;

    zzgqf(int i, com.google.android.gms.internal.ads.zzgcn zzgcnVar, com.google.android.gms.internal.ads.zzgfh zzgfhVar) {
        this.zzf = i;
        this.zza = zzgfhVar;
    }

    public final void zza() {
        if (this.zzb.get()) {
            throw new java.lang.IllegalStateException("Finished trace.");
        }
        this.zzc = android.os.SystemClock.uptimeMillis();
    }

    public final void zzb(java.lang.Throwable th) {
        if (this.zzb.get()) {
            throw new java.lang.IllegalStateException("Finished trace.");
        }
        this.zze = th;
    }

    public final void zzc() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zzb;
        if (atomicBoolean.getAndSet(true)) {
            throw new java.lang.IllegalStateException("Finished trace.");
        }
        this.zzd = android.os.SystemClock.uptimeMillis();
        this.zza.zzb(this.zzf - 1, atomicBoolean.get() ? this.zzd - this.zzc : -1L, this.zze, null);
    }
}
