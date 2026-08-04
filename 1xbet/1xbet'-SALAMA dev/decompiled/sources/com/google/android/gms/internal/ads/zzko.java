package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzko {
    public final zzuo zza;
    public final Object zzb;
    public final zzwk[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzkp zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzlp[] zzj;
    private final zzyn zzk;
    private final zzld zzl;
    private zzko zzm;
    private zzwv zzn;
    private zzyo zzo;
    private long zzp;

    public zzko(zzlp[] zzlpVarArr, long j, zzyn zzynVar, zzyw zzywVar, zzld zzldVar, zzkp zzkpVar, zzyo zzyoVar, long j3) {
        this.zzj = zzlpVarArr;
        this.zzp = j;
        this.zzk = zzynVar;
        this.zzl = zzldVar;
        zzuq zzuqVar = zzkpVar.zza;
        this.zzb = zzuqVar.zza;
        this.zzg = zzkpVar;
        this.zzn = zzwv.zza;
        this.zzo = zzyoVar;
        this.zzc = new zzwk[2];
        this.zzi = new boolean[2];
        long j7 = zzkpVar.zzb;
        long j8 = zzkpVar.zzd;
        zzuo zzuoVarZzp = zzldVar.zzp(zzuqVar, zzywVar, j7);
        this.zza = j8 != -9223372036854775807L ? new zztu(zzuoVarZzp, true, 0L, j8) : zzuoVarZzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i7 = 0;
        while (true) {
            zzyo zzyoVar = this.zzo;
            if (i7 >= zzyoVar.zza) {
                return;
            }
            zzyoVar.zzb(i7);
            zzyh zzyhVar = this.zzo.zzc[i7];
            i7++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i7 = 0;
        while (true) {
            zzyo zzyoVar = this.zzo;
            if (i7 >= zzyoVar.zza) {
                return;
            }
            zzyoVar.zzb(i7);
            zzyh zzyhVar = this.zzo.zzc[i7];
            i7++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza(zzyo zzyoVar, long j, boolean z4) {
        return zzb(zzyoVar, j, false, new boolean[2]);
    }

    public final long zzb(zzyo zzyoVar, long j, boolean z4, boolean[] zArr) {
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= zzyoVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z4 || !zzyoVar.zza(this.zzo, i7)) {
                z7 = false;
            }
            zArr2[i7] = z7;
            i7++;
        }
        int i8 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzj;
            if (i8 >= 2) {
                break;
            }
            zzlpVarArr[i8].zzb();
            i8++;
        }
        zzu();
        this.zzo = zzyoVar;
        zzv();
        long jZzf = this.zza.zzf(zzyoVar.zzc, this.zzi, this.zzc, zArr, j);
        int i9 = 0;
        while (true) {
            zzlp[] zzlpVarArr2 = this.zzj;
            if (i9 >= 2) {
                break;
            }
            zzlpVarArr2[i9].zzb();
            i9++;
        }
        this.zzf = false;
        int i10 = 0;
        while (true) {
            zzwk[] zzwkVarArr = this.zzc;
            if (i10 >= 2) {
                return jZzf;
            }
            if (zzwkVarArr[i10] != null) {
                zzcv.zzf(zzyoVar.zzb(i10));
                this.zzj[i10].zzb();
                this.zzf = true;
            } else {
                zzcv.zzf(zzyoVar.zzc[i10] == null);
            }
            i10++;
        }
    }

    public final long zzc() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzg.zze : jZzb;
    }

    public final long zzd() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    public final zzko zzg() {
        return this.zzm;
    }

    public final zzwv zzh() {
        return this.zzn;
    }

    public final zzyo zzi() {
        return this.zzo;
    }

    public final zzyo zzj(float f7, zzbn zzbnVar, boolean z4) {
        zzyo zzyoVarZzo = this.zzk.zzo(this.zzj, this.zzn, this.zzg.zza, zzbnVar);
        for (int i7 = 0; i7 < zzyoVarZzo.zza; i7++) {
            boolean z7 = true;
            if (zzyoVarZzo.zzb(i7)) {
                if (zzyoVarZzo.zzc[i7] == null) {
                    this.zzj[i7].zzb();
                    z7 = false;
                }
                zzcv.zzf(z7);
            } else {
                zzcv.zzf(zzyoVarZzo.zzc[i7] == null);
            }
        }
        for (zzyh zzyhVar : zzyoVarZzo.zzc) {
        }
        return zzyoVarZzo;
    }

    public final void zzk(zzkm zzkmVar) {
        zzcv.zzf(zzw());
        this.zza.zzo(zzkmVar);
    }

    public final void zzl(float f7, zzbn zzbnVar, boolean z4) {
        this.zze = true;
        this.zzn = this.zza.zzg();
        zzyo zzyoVarZzj = zzj(f7, zzbnVar, z4);
        zzkp zzkpVar = this.zzg;
        long jMax = zzkpVar.zzb;
        long j = zzkpVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZza = zza(zzyoVarZzj, jMax, false);
        long j3 = this.zzp;
        zzkp zzkpVar2 = this.zzg;
        this.zzp = (zzkpVar2.zzb - jZza) + j3;
        this.zzg = zzkpVar2.zzb(jZza);
    }

    public final void zzm(zzun zzunVar, long j) {
        this.zzd = true;
        this.zza.zzl(zzunVar, j);
    }

    public final void zzn(long j) {
        zzcv.zzf(zzw());
        if (this.zze) {
            this.zza.zzm(j - this.zzp);
        }
    }

    public final void zzo() {
        zzu();
        zzuo zzuoVar = this.zza;
        try {
            boolean z4 = zzuoVar instanceof zztu;
            zzld zzldVar = this.zzl;
            if (z4) {
                zzldVar.zzi(((zztu) zzuoVar).zza);
            } else {
                zzldVar.zzi(zzuoVar);
            }
        } catch (RuntimeException e7) {
            zzdq.zzd("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    public final void zzp(zzko zzkoVar) {
        if (zzkoVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzkoVar;
        zzv();
    }

    public final void zzq(long j) {
        this.zzp = j;
    }

    public final void zzr() {
        zzuo zzuoVar = this.zza;
        if (zzuoVar instanceof zztu) {
            long j = this.zzg.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zztu) zzuoVar).zzn(0L, j);
        }
    }

    public final boolean zzs() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zzt() {
        if (this.zze) {
            return zzs() || zzc() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }
}
