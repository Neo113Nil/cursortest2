package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzkr {
    private final zzly zzc;
    private final zzdj zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzik zzh;
    private zzko zzi;
    private zzko zzj;
    private zzko zzk;
    private zzko zzl;
    private zzko zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzjt zzr;
    private final zzbl zza = new zzbl();
    private final zzbm zzb = new zzbm();
    private List zzq = new ArrayList();

    public zzkr(zzly zzlyVar, zzdj zzdjVar, zzjt zzjtVar, zzik zzikVar) {
        this.zzc = zzlyVar;
        this.zzd = zzdjVar;
        this.zzr = zzjtVar;
        this.zzh = zzikVar;
    }

    private final int zzB(zzbn zzbnVar) {
        zzko zzkoVarZzg = this.zzi;
        if (zzkoVarZzg == null) {
            return 0;
        }
        int iZza = zzbnVar.zza(zzkoVarZzg.zzb);
        while (true) {
            iZza = zzbnVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkoVarZzg.getClass();
                if (zzkoVarZzg.zzg() == null || zzkoVarZzg.zzg.zzh) {
                    break;
                }
                zzkoVarZzg = zzkoVarZzg.zzg();
            }
            zzko zzkoVarZzg2 = zzkoVarZzg.zzg();
            if (iZza == -1 || zzkoVarZzg2 == null || zzbnVar.zza(zzkoVarZzg2.zzb) != iZza) {
                break;
            }
            zzkoVarZzg = zzkoVarZzg2;
        }
        int iZza2 = zza(zzkoVarZzg);
        zzkoVarZzg.zzg = zzp(zzbnVar, zzkoVarZzg.zzg);
        return iZza2;
    }

    private final long zzC(zzbn zzbnVar, Object obj, int i7) {
        zzbnVar.zzn(obj, this.zza);
        this.zza.zzg(i7);
        long j = this.zza.zzg.zza(i7).zzh;
        return 0L;
    }

    private final long zzD(Object obj) {
        for (int i7 = 0; i7 < this.zzq.size(); i7++) {
            zzko zzkoVar = (zzko) this.zzq.get(i7);
            if (zzkoVar.zzb.equals(obj)) {
                return zzkoVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzkp zzE(zzbn zzbnVar, zzko zzkoVar, long j) {
        long j3;
        zzkp zzkpVar = zzkoVar.zzg;
        long jZze = (zzkoVar.zze() + zzkpVar.zze) - j;
        if (zzkpVar.zzh) {
            long j7 = 0;
            int iZzi = zzbnVar.zzi(zzbnVar.zza(zzkpVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (iZzi != -1) {
                int i7 = zzbnVar.zzd(iZzi, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                obj.getClass();
                long jZzD = zzkpVar.zza.zzd;
                if (zzbnVar.zze(i7, this.zzb, 0L).zzn == iZzi) {
                    Pair pairZzm = zzbnVar.zzm(this.zzb, this.zza, i7, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm != null) {
                        obj = pairZzm.first;
                        long jLongValue = ((Long) pairZzm.second).longValue();
                        zzko zzkoVarZzg = zzkoVar.zzg();
                        if (zzkoVarZzg == null || !zzkoVarZzg.zzb.equals(obj)) {
                            jZzD = zzD(obj);
                            if (jZzD == -1) {
                                jZzD = this.zze;
                                this.zze = 1 + jZzD;
                            }
                        } else {
                            jZzD = zzkoVarZzg.zzg.zza.zzd;
                        }
                        j3 = jLongValue;
                        j7 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                }
                zzuq zzuqVarZzI = zzI(zzbnVar, obj, j3, jZzD, this.zzb, this.zza);
                if (j7 != -9223372036854775807L && zzkpVar.zzc != -9223372036854775807L) {
                    zzbnVar.zzn(zzkpVar.zza.zza, this.zza).zzb();
                    int i8 = this.zza.zzg.zzd;
                }
                return zzF(zzbnVar, zzuqVarZzI, j7, j3);
            }
        } else {
            zzuq zzuqVar = zzkpVar.zza;
            zzbnVar.zzn(zzuqVar.zza, this.zza);
            if (!zzuqVar.zzb()) {
                int i9 = zzuqVar.zze;
                if (i9 != -1) {
                    this.zza.zzj(i9);
                }
                zzbl zzblVar = this.zza;
                int i10 = zzuqVar.zze;
                int iZze = zzblVar.zze(i10);
                zzblVar.zzk(i10);
                if (iZze != this.zza.zza(zzuqVar.zze)) {
                    return zzG(zzbnVar, zzuqVar.zza, zzuqVar.zze, iZze, zzkpVar.zze, zzuqVar.zzd, false);
                }
                zzC(zzbnVar, zzuqVar.zza, zzuqVar.zze);
                return zzH(zzbnVar, zzuqVar.zza, 0L, zzkpVar.zze, zzuqVar.zzd, false);
            }
            int i11 = zzuqVar.zzb;
            if (this.zza.zza(i11) != -1) {
                int iZza = this.zza.zzg.zza(i11).zza(zzuqVar.zzc);
                if (iZza < 0) {
                    return zzG(zzbnVar, zzuqVar.zza, i11, iZza, zzkpVar.zzc, zzuqVar.zzd, false);
                }
                long jLongValue2 = zzkpVar.zzc;
                if (jLongValue2 == -9223372036854775807L) {
                    zzbm zzbmVar = this.zzb;
                    zzbl zzblVar2 = this.zza;
                    Pair pairZzm2 = zzbnVar.zzm(zzbmVar, zzblVar2, zzblVar2.zzc, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm2 != null) {
                        jLongValue2 = ((Long) pairZzm2.second).longValue();
                    }
                }
                zzC(zzbnVar, zzuqVar.zza, zzuqVar.zzb);
                return zzH(zzbnVar, zzuqVar.zza, Math.max(0L, jLongValue2), zzkpVar.zzc, zzuqVar.zzd, false);
            }
        }
        return null;
    }

    private final zzkp zzF(zzbn zzbnVar, zzuq zzuqVar, long j, long j3) {
        zzbnVar.zzn(zzuqVar.zza, this.zza);
        return zzuqVar.zzb() ? zzG(zzbnVar, zzuqVar.zza, zzuqVar.zzb, zzuqVar.zzc, j, zzuqVar.zzd, false) : zzH(zzbnVar, zzuqVar.zza, j3, j, zzuqVar.zzd, false);
    }

    private final zzkp zzG(zzbn zzbnVar, Object obj, int i7, int i8, long j, long j3, boolean z4) {
        zzuq zzuqVar = new zzuq(obj, i7, i8, j3);
        long jZzf = zzbnVar.zzn(zzuqVar.zza, this.zza).zzf(zzuqVar.zzb, zzuqVar.zzc);
        if (i8 == this.zza.zze(i7)) {
            this.zza.zzh();
        }
        this.zza.zzk(zzuqVar.zzb);
        return new zzkp(zzuqVar, (jZzf == -9223372036854775807L || jZzf > 0) ? 0L : Math.max(0L, (-1) + jZzf), j, -9223372036854775807L, jZzf, false, false, false, false, false);
    }

    private final zzkp zzH(zzbn zzbnVar, Object obj, long j, long j3, long j7, boolean z4) {
        long j8;
        long j9;
        long j10;
        long jMax = j;
        zzbnVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc != -1) {
            this.zza.zzj(iZzc);
        }
        if (iZzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(iZzc);
        }
        zzuq zzuqVar = new zzuq(obj, j7, iZzc);
        boolean zZzM = zzM(zzuqVar);
        boolean zZzL = zzL(zzbnVar, zzuqVar);
        boolean zZzK = zzK(zzbnVar, zzuqVar, zZzM);
        if (iZzc != -1) {
            this.zza.zzk(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzg(iZzc);
            j8 = 0;
        } else {
            j8 = -9223372036854775807L;
        }
        if (j8 != -9223372036854775807L) {
            j9 = 0;
            j10 = 0;
        } else {
            j9 = j8;
            j10 = this.zza.zzd;
        }
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        return new zzkp(zzuqVar, jMax, j3, j9, j10, false, false, zZzM, zZzL, zZzK);
    }

    private static zzuq zzI(zzbn zzbnVar, Object obj, long j, long j3, zzbm zzbmVar, zzbl zzblVar) {
        zzbnVar.zzn(obj, zzblVar);
        zzbnVar.zze(zzblVar.zzc, zzbmVar, 0L);
        zzbnVar.zza(obj);
        zzblVar.zzb();
        zzbnVar.zzn(obj, zzblVar);
        int iZzd = zzblVar.zzd(j);
        return iZzd == -1 ? new zzuq(obj, j3, zzblVar.zzc(j)) : new zzuq(obj, iZzd, zzblVar.zze(iZzd), j3);
    }

    private final void zzJ() {
        int i7 = zzfwh.zzd;
        final zzfwe zzfweVar = new zzfwe();
        for (zzko zzkoVarZzg = this.zzi; zzkoVarZzg != null; zzkoVarZzg = zzkoVarZzg.zzg()) {
            zzfweVar.zzf(zzkoVarZzg.zzg.zza);
        }
        zzko zzkoVar = this.zzj;
        final zzuq zzuqVar = zzkoVar == null ? null : zzkoVar.zzg.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc.zzU(zzfweVar.zzi(), zzuqVar);
            }
        });
    }

    private final boolean zzK(zzbn zzbnVar, zzuq zzuqVar, boolean z4) {
        int iZza = zzbnVar.zza(zzuqVar.zza);
        return !zzbnVar.zze(zzbnVar.zzd(iZza, this.zza, false).zzc, this.zzb, 0L).zzi && zzbnVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z4;
    }

    private final boolean zzL(zzbn zzbnVar, zzuq zzuqVar) {
        if (zzM(zzuqVar)) {
            return zzbnVar.zze(zzbnVar.zzn(zzuqVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzbnVar.zza(zzuqVar.zza);
        }
        return false;
    }

    private static final boolean zzM(zzuq zzuqVar) {
        return !zzuqVar.zzb() && zzuqVar.zze == -1;
    }

    public static boolean zzx(long j, long j3) {
        return j == -9223372036854775807L || j == j3;
    }

    public final boolean zzA() {
        zzko zzkoVar = this.zzl;
        if (zzkoVar == null) {
            return true;
        }
        if (zzkoVar.zzg.zzj || !zzkoVar.zzs() || this.zzl.zzg.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzn < 100;
    }

    public final int zza(zzko zzkoVar) {
        zzcv.zzb(zzkoVar);
        int i7 = 0;
        if (zzkoVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzkoVar;
        while (zzkoVar.zzg() != null) {
            zzkoVar = zzkoVar.zzg();
            zzkoVar.getClass();
            if (zzkoVar == this.zzj) {
                zzko zzkoVar2 = this.zzi;
                this.zzj = zzkoVar2;
                this.zzk = zzkoVar2;
                i7 = 3;
            }
            if (zzkoVar == this.zzk) {
                this.zzk = this.zzj;
                i7 |= 2;
            }
            zzkoVar.zzo();
            this.zzn--;
        }
        zzko zzkoVar3 = this.zzl;
        zzkoVar3.getClass();
        zzkoVar3.zzp(null);
        zzJ();
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    public final int zzb(zzbn zzbnVar, long j, long j3, long j7) {
        zzkp zzkpVarZzp;
        int i7;
        zzko zzkoVarZzg = this.zzi;
        zzko zzkoVar = null;
        while (true) {
            boolean z4 = false;
            if (zzkoVarZzg == null) {
                return 0;
            }
            zzkp zzkpVar = zzkoVarZzg.zzg;
            if (zzkoVar == null) {
                zzkpVarZzp = zzp(zzbnVar, zzkpVar);
            } else {
                zzkp zzkpVarZzE = zzE(zzbnVar, zzkoVar, j);
                if (zzkpVarZzE == null || zzkpVar.zzb != zzkpVarZzE.zzb || !zzkpVar.zza.equals(zzkpVarZzE.zza)) {
                    return zza(zzkoVar);
                }
                zzkpVarZzp = zzkpVarZzE;
            }
            zzkoVarZzg.zzg = zzkpVarZzp.zza(zzkpVar.zzc);
            if (!zzx(zzkpVar.zze, zzkpVarZzp.zze)) {
                zzkoVarZzg.zzr();
                long j8 = zzkpVarZzp.zze;
                long jZze = j8 == -9223372036854775807L ? Long.MAX_VALUE : j8 + zzkoVarZzg.zze();
                if (zzkoVarZzg == this.zzj) {
                    boolean z7 = zzkoVarZzg.zzg.zzg;
                    if (j3 == Long.MIN_VALUE || j3 >= jZze) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i7 = 0;
                }
                if (zzkoVarZzg == this.zzk && (j7 == Long.MIN_VALUE || j7 >= jZze)) {
                    z4 = true;
                }
                int iZza = zza(zzkoVarZzg);
                if (iZza != 0) {
                    return iZza;
                }
                return z4 ? i7 | 2 : i7;
            }
            zzkoVar = zzkoVarZzg;
            zzkoVarZzg = zzkoVarZzg.zzg();
        }
    }

    public final int zzc(zzbn zzbnVar, int i7) {
        this.zzf = i7;
        return zzB(zzbnVar);
    }

    public final int zzd(zzbn zzbnVar, boolean z4) {
        this.zzg = z4;
        return zzB(zzbnVar);
    }

    public final zzko zze() {
        zzko zzkoVar = this.zzi;
        if (zzkoVar == null) {
            return null;
        }
        if (zzkoVar == this.zzj) {
            this.zzj = zzkoVar.zzg();
        }
        if (zzkoVar == this.zzk) {
            this.zzk = zzkoVar.zzg();
        }
        zzkoVar.zzo();
        int i7 = this.zzn - 1;
        this.zzn = i7;
        if (i7 == 0) {
            this.zzl = null;
            zzko zzkoVar2 = this.zzi;
            this.zzo = zzkoVar2.zzb;
            this.zzp = zzkoVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        zzJ();
        return this.zzi;
    }

    public final zzko zzf() {
        zzko zzkoVar = this.zzk;
        zzcv.zzb(zzkoVar);
        this.zzk = zzkoVar.zzg();
        zzJ();
        zzko zzkoVar2 = this.zzk;
        zzcv.zzb(zzkoVar2);
        return zzkoVar2;
    }

    public final zzko zzg() {
        zzko zzkoVar = this.zzk;
        zzko zzkoVar2 = this.zzj;
        if (zzkoVar == zzkoVar2) {
            zzcv.zzb(zzkoVar2);
            this.zzk = zzkoVar2.zzg();
        }
        zzko zzkoVar3 = this.zzj;
        zzcv.zzb(zzkoVar3);
        this.zzj = zzkoVar3.zzg();
        zzJ();
        zzko zzkoVar4 = this.zzj;
        zzcv.zzb(zzkoVar4);
        return zzkoVar4;
    }

    public final zzko zzh(zzkp zzkpVar) {
        zzko zzkoVarZzd;
        zzko zzkoVar = this.zzl;
        long jZze = zzkoVar == null ? 1000000000000L : (zzkoVar.zze() + zzkoVar.zzg.zze) - zzkpVar.zzb;
        int i7 = 0;
        while (true) {
            if (i7 >= this.zzq.size()) {
                zzkoVarZzd = null;
                break;
            }
            zzkp zzkpVar2 = ((zzko) this.zzq.get(i7)).zzg;
            if (zzx(zzkpVar2.zze, zzkpVar.zze) && zzkpVar2.zzb == zzkpVar.zzb && zzkpVar2.zza.equals(zzkpVar.zza)) {
                zzkoVarZzd = (zzko) this.zzq.remove(i7);
                break;
            }
            i7++;
        }
        if (zzkoVarZzd == null) {
            zzkoVarZzd = zzkf.zzd(this.zzr.zza, zzkpVar, jZze);
        } else {
            zzkoVarZzd.zzg = zzkpVar;
            zzkoVarZzd.zzq(jZze);
        }
        zzko zzkoVar2 = this.zzl;
        if (zzkoVar2 != null) {
            zzkoVar2.zzp(zzkoVarZzd);
        } else {
            this.zzi = zzkoVarZzd;
            this.zzj = zzkoVarZzd;
            this.zzk = zzkoVarZzd;
        }
        this.zzo = null;
        this.zzl = zzkoVarZzd;
        this.zzn++;
        zzJ();
        return zzkoVarZzd;
    }

    public final zzko zzi() {
        return this.zzl;
    }

    public final zzko zzj() {
        return this.zzi;
    }

    public final zzko zzk(zzuo zzuoVar) {
        for (int i7 = 0; i7 < this.zzq.size(); i7++) {
            zzko zzkoVar = (zzko) this.zzq.get(i7);
            if (zzkoVar.zza == zzuoVar) {
                return zzkoVar;
            }
        }
        return null;
    }

    public final zzko zzl() {
        return this.zzm;
    }

    public final zzko zzm() {
        return this.zzk;
    }

    public final zzko zzn() {
        return this.zzj;
    }

    public final zzkp zzo(long j, zzle zzleVar) {
        zzko zzkoVar = this.zzl;
        return zzkoVar == null ? zzF(zzleVar.zza, zzleVar.zzb, zzleVar.zzc, zzleVar.zzs) : zzE(zzleVar.zza, zzkoVar, j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    public final zzkp zzp(zzbn zzbnVar, zzkp zzkpVar) {
        long j;
        long jZzf;
        long j3;
        long j7;
        int i7;
        int i8;
        zzuq zzuqVar = zzkpVar.zza;
        boolean zZzM = zzM(zzuqVar);
        boolean zZzL = zzL(zzbnVar, zzuqVar);
        boolean zZzK = zzK(zzbnVar, zzuqVar, zZzM);
        zzbnVar.zzn(zzkpVar.zza.zza, this.zza);
        if (zzuqVar.zzb() || (i8 = zzuqVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzg(i8);
            j = 0;
        }
        if (!zzuqVar.zzb()) {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j7 = 0;
            } else {
                jZzf = this.zza.zzd;
            }
            if (zzuqVar.zzb()) {
                this.zza.zzk(zzuqVar.zzb);
            } else {
                i7 = zzuqVar.zze;
                if (i7 != -1) {
                    this.zza.zzk(i7);
                }
            }
            return new zzkp(zzuqVar, zzkpVar.zzb, zzkpVar.zzc, j3, j7, false, false, zZzM, zZzL, zZzK);
        }
        jZzf = this.zza.zzf(zzuqVar.zzb, zzuqVar.zzc);
        j3 = j;
        j7 = jZzf;
        if (zzuqVar.zzb()) {
            this.zza.zzk(zzuqVar.zzb);
        } else {
            i7 = zzuqVar.zze;
            if (i7 != -1) {
                this.zza.zzk(i7);
            }
        }
        return new zzkp(zzuqVar, zzkpVar.zzb, zzkpVar.zzc, j3, j7, false, false, zZzM, zZzL, zZzK);
    }

    public final zzuq zzq(zzbn zzbnVar, Object obj, long j) {
        long jZzD;
        int iZza;
        int i7 = zzbnVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZza = zzbnVar.zza(obj2)) == -1 || zzbnVar.zzd(iZza, this.zza, false).zzc != i7) {
            zzko zzkoVarZzg = this.zzi;
            while (true) {
                if (zzkoVarZzg == null) {
                    zzko zzkoVarZzg2 = this.zzi;
                    while (true) {
                        if (zzkoVarZzg2 != null) {
                            int iZza2 = zzbnVar.zza(zzkoVarZzg2.zzb);
                            if (iZza2 != -1 && zzbnVar.zzd(iZza2, this.zza, false).zzc == i7) {
                                jZzD = zzkoVarZzg2.zzg.zza.zzd;
                                break;
                            }
                            zzkoVarZzg2 = zzkoVarZzg2.zzg();
                        } else {
                            jZzD = zzD(obj);
                            if (jZzD != -1) {
                                break;
                            }
                            jZzD = this.zze;
                            this.zze = 1 + jZzD;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzo = obj;
                            this.zzp = jZzD;
                            break;
                        }
                    }
                } else {
                    if (zzkoVarZzg.zzb.equals(obj)) {
                        jZzD = zzkoVarZzg.zzg.zza.zzd;
                        break;
                    }
                    zzkoVarZzg = zzkoVarZzg.zzg();
                }
            }
        } else {
            jZzD = this.zzp;
        }
        long j3 = jZzD;
        zzbnVar.zzn(obj, this.zza);
        zzbnVar.zze(this.zza.zzc, this.zzb, 0L);
        int iZza3 = zzbnVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzbm zzbmVar = this.zzb;
            if (iZza3 < zzbmVar.zzn) {
                return zzI(zzbnVar, obj3, j, j3, zzbmVar, this.zza);
            }
            zzbnVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            zzbl zzblVar = this.zza;
            if (zzblVar.zzd(zzblVar.zzd) != -1) {
                obj3 = this.zza.zzb;
                obj3.getClass();
            }
            iZza3--;
        }
    }

    public final void zzs() {
        if (this.zzn == 0) {
            return;
        }
        zzko zzkoVarZzg = this.zzi;
        zzcv.zzb(zzkoVarZzg);
        this.zzo = zzkoVarZzg.zzb;
        this.zzp = zzkoVarZzg.zzg.zza.zzd;
        while (zzkoVarZzg != null) {
            zzkoVarZzg.zzo();
            zzkoVarZzg = zzkoVarZzg.zzg();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzJ();
    }

    public final void zzt() {
        zzko zzkoVar = this.zzm;
        if (zzkoVar == null || zzkoVar.zzt()) {
            this.zzm = null;
            for (int i7 = 0; i7 < this.zzq.size(); i7++) {
                zzko zzkoVar2 = (zzko) this.zzq.get(i7);
                if (!zzkoVar2.zzt()) {
                    this.zzm = zzkoVar2;
                    return;
                }
            }
        }
    }

    public final void zzu(long j) {
        zzko zzkoVar = this.zzl;
        if (zzkoVar != null) {
            zzkoVar.zzn(j);
        }
    }

    public final void zzv() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.zzq.size(); i7++) {
            ((zzko) this.zzq.get(i7)).zzo();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final void zzw(zzbn zzbnVar, zzik zzikVar) {
        this.zzh = zzikVar;
        long j = zzikVar.zzb;
        zzv();
    }

    public final boolean zzy(zzuo zzuoVar) {
        zzko zzkoVar = this.zzl;
        return zzkoVar != null && zzkoVar.zza == zzuoVar;
    }

    public final boolean zzz(zzuo zzuoVar) {
        zzko zzkoVar = this.zzm;
        return zzkoVar != null && zzkoVar.zza == zzuoVar;
    }
}
