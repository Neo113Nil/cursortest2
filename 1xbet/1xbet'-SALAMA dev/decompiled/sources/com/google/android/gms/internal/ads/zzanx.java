package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
final class zzanx implements zzadu {
    private final zzanu zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzanx(zzanu zzanuVar, int i7, long j, long j3) {
        this.zza = zzanuVar;
        this.zzb = i7;
        this.zzc = j;
        long j7 = (j3 - j) / ((long) zzanuVar.zzd);
        this.zzd = j7;
        this.zze = zzb(j7);
    }

    private final long zzb(long j) {
        return zzen.zzu(j * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long j3 = (((long) this.zza.zzc) * j) / (((long) this.zzb) * 1000000);
        int i7 = zzen.zza;
        long jMax = Math.max(0L, Math.min(j3, this.zzd - 1));
        long j7 = ((long) this.zza.zzd) * jMax;
        long jZzb = zzb(jMax);
        zzadv zzadvVar = new zzadv(jZzb, this.zzc + j7);
        if (jZzb >= j || jMax == this.zzd - 1) {
            return new zzads(zzadvVar, zzadvVar);
        }
        long j8 = jMax + 1;
        return new zzads(zzadvVar, new zzadv(zzb(j8), (j8 * ((long) this.zza.zzd)) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
