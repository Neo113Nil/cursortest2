package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
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
        super(zzusVar);
        boolean z7;
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
        Object obj2;
        Object obj3;
        obj2 = this.zze.zze;
        if (obj2 == null || !obj.equals(zzuj.zzc)) {
            return obj;
        }
        obj3 = this.zze.zze;
        return obj3;
    }

    private final boolean zzL(long j) {
        zzui zzuiVar = this.zzf;
        int zza = this.zze.zza(zzuiVar.zza.zza);
        if (zza == -1) {
            return false;
        }
        zzuj zzujVar = this.zze;
        zzbl zzblVar = this.zzd;
        zzujVar.zzd(zza, zzblVar, false);
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
        Object obj;
        Object obj2;
        obj = this.zze.zze;
        Object obj3 = zzuqVar.zza;
        if (obj != null) {
            obj2 = this.zze.zze;
            if (obj2.equals(obj3)) {
                obj3 = zzuj.zzc;
            }
        }
        return zzuqVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzE(zzbn zzbnVar) {
        long j;
        zzui zzuiVar;
        zzuq zzuqVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzbnVar);
            zzui zzuiVar2 = this.zzf;
            if (zzuiVar2 != null) {
                zzL(zzuiVar2.zzn());
            }
        } else if (zzbnVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzbnVar) : zzuj.zzr(zzbnVar, zzbm.zza, zzuj.zzc);
        } else {
            zzbnVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzb;
            zzui zzuiVar3 = this.zzf;
            if (zzuiVar3 != null) {
                long zzq = zzuiVar3.zzq();
                this.zze.zzn(zzuiVar3.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (zzq != 0) {
                    j = zzq;
                    Pair zzl = zzbnVar.zzl(this.zzc, this.zzd, 0, j);
                    Object obj2 = zzl.first;
                    long longValue = ((Long) zzl.second).longValue();
                    this.zze = !this.zzi ? this.zze.zzp(zzbnVar) : zzuj.zzr(zzbnVar, obj, obj2);
                    zzuiVar = this.zzf;
                    if (zzuiVar != null && zzL(longValue)) {
                        zzuq zzuqVar2 = zzuiVar.zza;
                        zzuqVar = zzuqVar2.zza(zzK(zzuqVar2.zza));
                    }
                }
            }
            j = 0;
            Pair zzl2 = zzbnVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj22 = zzl2.first;
            long longValue2 = ((Long) zzl2.second).longValue();
            this.zze = !this.zzi ? this.zze.zzp(zzbnVar) : zzuj.zzr(zzbnVar, obj, obj22);
            zzuiVar = this.zzf;
            if (zzuiVar != null) {
                zzuq zzuqVar22 = zzuiVar.zza;
                zzuqVar = zzuqVar22.zza(zzK(zzuqVar22.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzuqVar != null) {
            zzui zzuiVar4 = this.zzf;
            zzuiVar4.getClass();
            zzuiVar4.zzr(zzuqVar);
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
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
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
