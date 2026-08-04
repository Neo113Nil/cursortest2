package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzws implements zzuo, zzun {
    private final zzuo zza;
    private final long zzb;
    private zzun zzc;

    public zzws(zzuo zzuoVar, long j) {
        this.zza = zzuoVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zza(long j, zzls zzlsVar) {
        long j3 = this.zzb;
        return this.zza.zza(j - j3, zzlsVar) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzd() {
        long jZzd = this.zza.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zze(long j) {
        long j3 = this.zzb;
        return this.zza.zze(j - j3) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzf(zzyh[] zzyhVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j) {
        zzwk[] zzwkVarArr2 = new zzwk[zzwkVarArr.length];
        int i7 = 0;
        while (true) {
            zzwk zzwkVarZzc = null;
            if (i7 >= zzwkVarArr.length) {
                break;
            }
            zzwr zzwrVar = (zzwr) zzwkVarArr[i7];
            if (zzwrVar != null) {
                zzwkVarZzc = zzwrVar.zzc();
            }
            zzwkVarArr2[i7] = zzwkVarZzc;
            i7++;
        }
        long jZzf = this.zza.zzf(zzyhVarArr, zArr, zzwkVarArr2, zArr2, j - this.zzb);
        for (int i8 = 0; i8 < zzwkVarArr.length; i8++) {
            zzwk zzwkVar = zzwkVarArr2[i8];
            if (zzwkVar == null) {
                zzwkVarArr[i8] = null;
            } else {
                zzwk zzwkVar2 = zzwkVarArr[i8];
                if (zzwkVar2 == null || ((zzwr) zzwkVar2).zzc() != zzwkVar) {
                    zzwkVarArr[i8] = new zzwr(zzwkVar, this.zzb);
                }
            }
        }
        return jZzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final zzwv zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzh(zzwm zzwmVar) {
        zzun zzunVar = this.zzc;
        zzunVar.getClass();
        zzunVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(long j, boolean z4) {
        this.zza.zzi(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzj(zzuo zzuoVar) {
        zzun zzunVar = this.zzc;
        zzunVar.getClass();
        zzunVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzk() {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzl(zzun zzunVar, long j) {
        this.zzc = zzunVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzuo zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        long j = zzkmVar.zza;
        long j3 = this.zzb;
        zzkk zzkkVarZza = zzkmVar.zza();
        zzkkVarZza.zze(j - j3);
        return this.zza.zzo(zzkkVarZza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
