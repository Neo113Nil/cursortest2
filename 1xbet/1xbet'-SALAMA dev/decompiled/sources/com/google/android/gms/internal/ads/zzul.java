package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class zzul extends zzwx {
    private final boolean zzb;
    private final zzbm zzc;
    private final zzbl zzd;
    private zzuj zze;
    private zzui zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzul(zzus zzusVar, boolean z4) {
        boolean z7;
        super(zzusVar);
        if (z4) {
            zzusVar.zzv();
            z7 = true;
        } else {
            z7 = false;
        }
        this.zzb = z7;
        this.zzc = new zzbm();
        this.zzd = new zzbl();
        zzusVar.zzM();
        this.zze = zzuj.zzq(zzusVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zze == null || !obj.equals(zzuj.zzc)) ? obj : this.zze.zze;
    }

    private final boolean zzL(long j) {
        zzui zzuiVar = this.zzf;
        int iZza = this.zze.zza(zzuiVar.zza.zza);
        if (iZza == -1) {
            return false;
        }
        zzuj zzujVar = this.zze;
        zzbl zzblVar = this.zzd;
        zzujVar.zzd(iZza, zzblVar, false);
        long j3 = zzblVar.zzd;
        if (j3 != -9223372036854775807L && j >= j3) {
            j = Math.max(0L, j3 - 1);
        }
        zzuiVar.zzs(j);
        return true;
    }

    public final zzbn zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwx
    public final zzuq zzD(zzuq zzuqVar) {
        Object obj = this.zze.zze;
        Object obj2 = zzuqVar.zza;
        if (obj != null && this.zze.zze.equals(obj2)) {
            obj2 = zzuj.zzc;
        }
        return zzuqVar.zza(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzwx
    public final void zzE(zzbn zzbnVar) {
        long j;
        zzuq zzuqVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzbnVar);
            zzui zzuiVar = this.zzf;
            if (zzuiVar != null) {
                zzL(zzuiVar.zzn());
            }
        } else if (zzbnVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzbnVar) : zzuj.zzr(zzbnVar, zzbm.zza, zzuj.zzc);
        } else {
            zzbnVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzb;
            zzui zzuiVar2 = this.zzf;
            if (zzuiVar2 != null) {
                long jZzq = zzuiVar2.zzq();
                this.zze.zzn(zzuiVar2.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (jZzq != 0) {
                    j = jZzq;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair pairZzl = zzbnVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj2 = pairZzl.first;
            long jLongValue = ((Long) pairZzl.second).longValue();
            this.zze = this.zzi ? this.zze.zzp(zzbnVar) : zzuj.zzr(zzbnVar, obj, obj2);
            zzui zzuiVar3 = this.zzf;
            if (zzuiVar3 != null && zzL(jLongValue)) {
                zzuq zzuqVar = zzuiVar3.zza;
                zzuqVarZza = zzuqVar.zza(zzK(zzuqVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzuqVarZza != null) {
            zzui zzuiVar4 = this.zzf;
            zzuiVar4.getClass();
            zzuiVar4.zzr(zzuqVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwx
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwx) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwx, com.google.android.gms.internal.ads.zzus
    public final void zzG(zzuo zzuoVar) {
        ((zzui) zzuoVar).zzt();
        if (zzuoVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwx, com.google.android.gms.internal.ads.zzus
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzui zzI(zzuq zzuqVar, zzyw zzywVar, long j) {
        zzui zzuiVar = new zzui(zzuqVar, zzywVar, j);
        zzuiVar.zzu(((zzwx) this).zza);
        if (this.zzh) {
            zzuiVar.zzr(zzuqVar.zza(zzK(zzuqVar.zza)));
        } else {
            this.zzf = zzuiVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwx) this).zza);
            }
        }
        return zzuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zztp
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzus
    public final void zzt(zzap zzapVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwt(this.zze.zzb, zzapVar));
        } else {
            this.zze = zzuj.zzq(zzapVar);
        }
        ((zzwx) this).zza.zzt(zzapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzty, com.google.android.gms.internal.ads.zzus
    public final void zzz() {
    }
}
