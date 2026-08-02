package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbsh {
    private final java.util.Random zza = new java.util.Random();
    private final long zzb;
    private final long zzc;
    private long zzd;

    public zzbsh() {
        long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
        this.zzb = nanos;
        this.zzc = java.util.concurrent.TimeUnit.MINUTES.toNanos(2L);
        this.zzd = nanos;
    }

    public final long zza() {
        long j = this.zzd;
        double d = j;
        this.zzd = java.lang.Math.min((long) (1.6d * d), this.zzc);
        double d2 = 0.2d * d;
        double d3 = d * (-0.2d);
        com.google.common.base.Preconditions.checkArgument(d2 >= d3);
        return j + ((long) ((this.zza.nextDouble() * (d2 - d3)) + d3));
    }
}
