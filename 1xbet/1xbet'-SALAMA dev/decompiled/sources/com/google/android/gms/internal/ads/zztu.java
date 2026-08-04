package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zztu implements zzuo, zzun {
    public final zzuo zza;
    long zzb;
    private zzun zzc;
    private zztt[] zzd = new zztt[0];
    private long zze = 0;

    public zztu(zzuo zzuoVar, boolean z4, long j, long j3) {
        this.zza = zzuoVar;
        this.zzb = j3;
    }

    private static long zzr(long j, long j3, long j7) {
        long jMax = Math.max(j, j3);
        return j7 != Long.MIN_VALUE ? Math.min(jMax, j7) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zza(long j, zzls zzlsVar) {
        if (j == 0) {
            return 0L;
        }
        long j3 = zzlsVar.zzc;
        int i7 = zzen.zza;
        long jMax = Math.max(0L, Math.min(j3, j));
        long j7 = zzlsVar.zzd;
        long j8 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j7, j8 == Long.MIN_VALUE ? Long.MAX_VALUE : j8 - j));
        if (jMax != zzlsVar.zzc || jMax2 != zzlsVar.zzd) {
            zzlsVar = new zzls(jMax, jMax2);
        }
        return this.zza.zza(j, zzlsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzr(jZzd2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        for (zztt zzttVar : this.zzd) {
            if (zzttVar != null) {
                zzttVar.zzc();
            }
        }
        return zzr(this.zza.zze(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzf(zzyh[] zzyhVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j) {
        int length = zzwkVarArr.length;
        this.zzd = new zztt[length];
        zzwk[] zzwkVarArr2 = new zzwk[length];
        int i7 = 0;
        while (true) {
            zzwk zzwkVar = null;
            if (i7 >= zzwkVarArr.length) {
                break;
            }
            zztt[] zzttVarArr = this.zzd;
            zztt zzttVar = (zztt) zzwkVarArr[i7];
            zzttVarArr[i7] = zzttVar;
            if (zzttVar != null) {
                zzwkVar = zzttVar.zza;
            }
            zzwkVarArr2[i7] = zzwkVar;
            i7++;
        }
        long jZzf = this.zza.zzf(zzyhVarArr, zArr, zzwkVarArr2, zArr2, j);
        long jZzr = zzr(jZzf, j, this.zzb);
        long j3 = -9223372036854775807L;
        if (zzq()) {
            if (jZzf < j) {
                j3 = jZzr;
                break;
            }
            if (jZzf != 0) {
                for (zzyh zzyhVar : zzyhVarArr) {
                    if (zzyhVar != null) {
                        zzz zzzVarZzf = zzyhVar.zzf();
                        if (!zzay.zzf(zzzVarZzf.zzo, zzzVarZzf.zzk)) {
                            j3 = jZzr;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j3;
        for (int i8 = 0; i8 < zzwkVarArr.length; i8++) {
            zzwk zzwkVar2 = zzwkVarArr2[i8];
            if (zzwkVar2 == null) {
                this.zzd[i8] = null;
            } else {
                zztt[] zzttVarArr2 = this.zzd;
                zztt zzttVar2 = zzttVarArr2[i8];
                if (zzttVar2 == null || zzttVar2.zza != zzwkVar2) {
                    zzttVarArr2[i8] = new zztt(this, zzwkVar2);
                }
            }
            zzwkVarArr[i8] = this.zzd[i8];
        }
        return jZzr;
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
        this.zza.zzi(j, false);
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
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j3) {
        this.zzb = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        return this.zza.zzo(zzkmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }
}
