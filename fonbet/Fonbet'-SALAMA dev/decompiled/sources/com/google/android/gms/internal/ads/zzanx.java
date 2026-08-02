package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
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
        long j7 = (j3 - j) / zzanuVar.zzd;
        this.zzd = j7;
        this.zze = zzb(j7);
    }

    private final long zzb(long j) {
        return zzen.zzu(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        int i7 = zzen.zza;
        long max = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long zzb = zzb(max);
        zzadv zzadvVar = new zzadv(zzb, this.zzc + (this.zza.zzd * max));
        if (zzb >= j || max == this.zzd - 1) {
            return new zzads(zzadvVar, zzadvVar);
        }
        long j3 = max + 1;
        return new zzads(zzadvVar, new zzadv(zzb(j3), (j3 * this.zza.zzd) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
