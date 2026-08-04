package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzacj implements zzadu {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacj(long j, long j3, int i7, int i8, boolean z4) {
        long jZzc;
        this.zza = j;
        this.zzb = j3;
        this.zzc = i8 == -1 ? 1 : i8;
        this.zze = i7;
        if (j == -1) {
            this.zzd = -1L;
            jZzc = -9223372036854775807L;
        } else {
            this.zzd = j - j3;
            jZzc = zzc(j, j3, i7);
        }
        this.zzf = jZzc;
    }

    private static long zzc(long j, long j3, int i7) {
        return (Math.max(0L, j - j3) * 8000000) / ((long) i7);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long j3 = this.zzd;
        if (j3 == -1) {
            zzadv zzadvVar = new zzadv(0L, this.zzb);
            return new zzads(zzadvVar, zzadvVar);
        }
        long j7 = ((long) this.zze) * j;
        long j8 = this.zzc;
        long jMin = ((j7 / 8000000) / j8) * j8;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j8);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzb = zzb(jMax);
        zzadv zzadvVar2 = new zzadv(jZzb, jMax);
        if (this.zzd != -1 && jZzb < j) {
            long j9 = jMax + ((long) this.zzc);
            if (j9 < this.zza) {
                return new zzads(zzadvVar2, new zzadv(zzb(j9), j9));
            }
        }
        return new zzads(zzadvVar2, zzadvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
