package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzacc {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzacc(long j, long j3, long j7, long j8, long j9, long j10, long j11) {
        this.zza = j;
        this.zzb = j3;
        this.zze = j8;
        this.zzf = j9;
        this.zzg = j10;
        this.zzc = j11;
        this.zzh = zzf(j3, 0L, j8, j9, j10, j11);
    }

    public static long zzf(long j, long j3, long j7, long j8, long j9, long j10) {
        if (j8 + 1 >= j9 || 1 + j3 >= j7) {
            return j8;
        }
        long j11 = (long) (((j9 - j8) / (j7 - j3)) * (j - j3));
        int i7 = zzen.zza;
        return Math.max(j8, Math.min(((j8 + j11) - j10) - (j11 / 20), j9 - 1));
    }

    public static /* bridge */ /* synthetic */ void zzg(zzacc zzaccVar, long j, long j3) {
        zzaccVar.zze = j;
        zzaccVar.zzg = j3;
        zzaccVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzacc zzaccVar, long j, long j3) {
        zzaccVar.zzd = j;
        zzaccVar.zzf = j3;
        zzaccVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
