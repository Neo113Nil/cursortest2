package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzboo {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzboo.class.getName());
    private final java.lang.String zzb;
    private final java.util.concurrent.atomic.AtomicLong zzc;

    public zzboo(java.lang.String str, long j) {
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.zzc = atomicLong;
        com.google.common.base.Preconditions.checkArgument(true, "value must be positive");
        this.zzb = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }

    public final com.google.android.libraries.places.internal.zzbon zza() {
        return new com.google.android.libraries.places.internal.zzbon(this, this.zzc.get(), null);
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicLong zzd() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.String zzc() {
        return this.zzb;
    }
}
