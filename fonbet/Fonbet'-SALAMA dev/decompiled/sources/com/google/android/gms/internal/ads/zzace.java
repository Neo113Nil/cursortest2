package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzace {
    public static final zzace zza = new zzace(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzace(int i7, long j, long j3) {
        this.zzb = i7;
        this.zzc = j;
        this.zzd = j3;
    }

    public static zzace zzd(long j, long j3) {
        return new zzace(-1, j, j3);
    }

    public static zzace zze(long j) {
        return new zzace(0, -9223372036854775807L, j);
    }

    public static zzace zzf(long j, long j3) {
        return new zzace(-2, j, j3);
    }
}
