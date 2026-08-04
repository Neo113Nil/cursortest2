package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzade implements zzadu {
    private final zzadg zza;
    private final long zzb;

    public zzade(zzadg zzadgVar, long j) {
        this.zza = zzadgVar;
        this.zzb = j;
    }

    private final zzadv zzb(long j, long j3) {
        return new zzadv((j * 1000000) / ((long) this.zza.zze), this.zzb + j3);
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
        int iZzd = zzen.zzd(jArr, zzadgVar.zzb(j), true, false);
        zzadv zzadvVarZzb = zzb(iZzd == -1 ? 0L : jArr[iZzd], iZzd != -1 ? jArr2[iZzd] : 0L);
        if (zzadvVarZzb.zzb == j || iZzd == jArr.length - 1) {
            return new zzads(zzadvVarZzb, zzadvVarZzb);
        }
        int i7 = iZzd + 1;
        return new zzads(zzadvVarZzb, zzb(jArr[i7], jArr2[i7]));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
