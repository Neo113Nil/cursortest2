package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzacj implements zzadu {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacj(long j, long j3, int i7, int i8, boolean z4) {
        long zzc;
        this.zza = j;
        this.zzb = j3;
        this.zzc = i8 == -1 ? 1 : i8;
        this.zze = i7;
        if (j == -1) {
            this.zzd = -1L;
            zzc = -9223372036854775807L;
        } else {
            this.zzd = j - j3;
            zzc = zzc(j, j3, i7);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j, long j3, int i7) {
        return (Math.max(0L, j - j3) * 8000000) / i7;
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
        long j7 = this.zzc;
        long j8 = (((this.zze * j) / 8000000) / j7) * j7;
        if (j3 != -1) {
            j8 = Math.min(j8, j3 - j7);
        }
        long max = this.zzb + Math.max(j8, 0L);
        long zzb = zzb(max);
        zzadv zzadvVar2 = new zzadv(zzb, max);
        if (this.zzd != -1 && zzb < j) {
            long j9 = max + this.zzc;
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
