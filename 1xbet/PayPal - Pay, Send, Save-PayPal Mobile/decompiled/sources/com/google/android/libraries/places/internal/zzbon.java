package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbon {
    final /* synthetic */ com.google.android.libraries.places.internal.zzboo zza;
    private final long zzb;

    /* synthetic */ zzbon(com.google.android.libraries.places.internal.zzboo zzbooVar, long j, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbooVar);
        this.zza = zzbooVar;
        this.zzb = j;
    }

    public final void zza() {
        java.util.logging.Logger logger;
        com.google.android.libraries.places.internal.zzboo zzbooVar = this.zza;
        java.util.concurrent.atomic.AtomicLong zzd = zzbooVar.zzd();
        long j = this.zzb;
        long max = java.lang.Math.max(j + j, j);
        if (zzd.compareAndSet(j, max)) {
            java.lang.String zzc = zzbooVar.zzc();
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.Object[] objArr = {zzc, java.lang.Long.valueOf(max)};
            logger = com.google.android.libraries.places.internal.zzboo.zza;
            logger.logp(level, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", objArr);
        }
    }
}
