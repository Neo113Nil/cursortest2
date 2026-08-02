package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzade implements zzadu {
    private final zzadg zza;
    private final long zzb;

    public zzade(zzadg zzadgVar, long j) {
        this.zza = zzadgVar;
        this.zzb = j;
    }

    private final zzadv zzb(long j, long j3) {
        return new zzadv((j * 1000000) / this.zza.zze, this.zzb + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        zzcv.zzb(this.zza.zzk);
        zzadg zzadgVar = this.zza;
        zzadf zzadfVar = zzadgVar.zzk;
        long[] jArr = zzadfVar.zza;
        long[] jArr2 = zzadfVar.zzb;
        int zzd = zzen.zzd(jArr, zzadgVar.zzb(j), true, false);
        zzadv zzb = zzb(zzd == -1 ? 0L : jArr[zzd], zzd != -1 ? jArr2[zzd] : 0L);
        if (zzb.zzb == j || zzd == jArr.length - 1) {
            return new zzads(zzb, zzb);
        }
        int i7 = zzd + 1;
        return new zzads(zzb, zzb(jArr[i7], jArr2[i7]));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
