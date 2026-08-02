package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
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
        zzko zzkoVar = this.zzi;
        if (zzkoVar == null) {
            return 0;
        }
        int zza = zzbnVar.zza(zzkoVar.zzb);
        while (true) {
            zza = zzbnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkoVar.getClass();
                if (zzkoVar.zzg() == null || zzkoVar.zzg.zzh) {
                    break;
                }
                zzkoVar = zzkoVar.zzg();
            }
            zzko zzg = zzkoVar.zzg();
            if (zza == -1 || zzg == null || zzbnVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkoVar = zzg;
        }
        int zza2 = zza(zzkoVar);
        zzkoVar.zzg = zzp(zzbnVar, zzkoVar.zzg);
        return zza2;
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
        long zze = (zzkoVar.zze() + zzkpVar.zze) - j;
        if (zzkpVar.zzh) {
            long j7 = 0;
            int zzi = zzbnVar.zzi(zzbnVar.zza(zzkpVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i7 = zzbnVar.zzd(zzi, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                obj.getClass();
                long j8 = zzkpVar.zza.zzd;
                if (zzbnVar.zze(i7, this.zzb, 0L).zzn == zzi) {
                    Pair zzm = zzbnVar.zzm(this.zzb, this.zza, i7, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzko zzg = zzkoVar.zzg();
                        if (zzg == null || !zzg.zzb.equals(obj)) {
                            j8 = zzD(obj);
                            if (j8 == -1) {
                                j8 = this.zze;
                                this.zze = 1 + j8;
                            }
                        } else {
                            j8 = zzg.zzg.zza.zzd;
                        }
                        j3 = longValue;
                        j7 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                }
                zzuq zzI = zzI(zzbnVar, obj, j3, j8, this.zzb, this.zza);
                if (j7 != -9223372036854775807L && zzkpVar.zzc != -9223372036854775807L) {
                    zzbnVar.zzn(zzkpVar.zza.zza, this.zza).zzb();
                    int i8 = this.zza.zzg.zzd;
                }
                return zzF(zzbnVar, zzI, j7, j3);
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
                int zze2 = zzblVar.zze(i10);
                zzblVar.zzk(i10);
                if (zze2 != this.zza.zza(zzuqVar.zze)) {
                    return zzG(zzbnVar, zzuqVar.zza, zzuqVar.zze, zze2, zzkpVar.zze, zzuqVar.zzd, false);
                }
                zzC(zzbnVar, zzuqVar.zza, zzuqVar.zze);
                return zzH(zzbnVar, zzuqVar.zza, 0L, zzkpVar.zze, zzuqVar.zzd, false);
            }
            int i11 = zzuqVar.zzb;
            if (this.zza.zza(i11) != -1) {
                int zza = this.zza.zzg.zza(i11).zza(zzuqVar.zzc);
                if (zza < 0) {
                    return zzG(zzbnVar, zzuqVar.zza, i11, zza, zzkpVar.zzc, zzuqVar.zzd, false);
                }
                long j9 = zzkpVar.zzc;
                if (j9 == -9223372036854775807L) {
                    zzbm zzbmVar = this.zzb;
                    zzbl zzblVar2 = this.zza;
                    Pair zzm2 = zzbnVar.zzm(zzbmVar, zzblVar2, zzblVar2.zzc, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm2 != null) {
                        j9 = ((Long) zzm2.second).longValue();
                    }
                }
                zzC(zzbnVar, zzuqVar.zza, zzuqVar.zzb);
                return zzH(zzbnVar, zzuqVar.zza, Math.max(0L, j9), zzkpVar.zzc, zzuqVar.zzd, false);
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
        long zzf = zzbnVar.zzn(zzuqVar.zza, this.zza).zzf(zzuqVar.zzb, zzuqVar.zzc);
        if (i8 == this.zza.zze(i7)) {
            this.zza.zzh();
        }
        this.zza.zzk(zzuqVar.zzb);
        return new zzkp(zzuqVar, (zzf == -9223372036854775807L || zzf > 0) ? 0L : Math.max(0L, (-1) + zzf), j, -9223372036854775807L, zzf, false, false, false, false, false);
    }

    private final zzkp zzH(zzbn zzbnVar, Object obj, long j, long j3, long j7, boolean z4) {
        long j8;
        long j9;
        long j10;
        long j11 = j;
        zzbnVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j11);
        if (zzc != -1) {
            this.zza.zzj(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(zzc);
        }
        zzuq zzuqVar = new zzuq(obj, j7, zzc);
        boolean zzM = zzM(zzuqVar);
        boolean zzL = zzL(zzbnVar, zzuqVar);
        boolean zzK = zzK(zzbnVar, zzuqVar, zzM);
        if (zzc != -1) {
            this.zza.zzk(zzc);
        }
        if (zzc != -1) {
            this.zza.zzg(zzc);
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
        if (j10 != -9223372036854775807L && j11 >= j10) {
            j11 = Math.max(0L, j10 - 1);
        }
        return new zzkp(zzuqVar, j11, j3, j9, j10, false, false, zzM, zzL, zzK);
    }

    private static zzuq zzI(zzbn zzbnVar, Object obj, long j, long j3, zzbm zzbmVar, zzbl zzblVar) {
        zzbnVar.zzn(obj, zzblVar);
        zzbnVar.zze(zzblVar.zzc, zzbmVar, 0L);
        zzbnVar.zza(obj);
        zzblVar.zzb();
        zzbnVar.zzn(obj, zzblVar);
        int zzd = zzblVar.zzd(j);
        return zzd == -1 ? new zzuq(obj, j3, zzblVar.zzc(j)) : new zzuq(obj, zzd, zzblVar.zze(zzd), j3);
    }

    private final void zzJ() {
        int i7 = zzfwh.zzd;
        final zzfwe zzfweVar = new zzfwe();
        for (zzko zzkoVar = this.zzi; zzkoVar != null; zzkoVar = zzkoVar.zzg()) {
            zzfweVar.zzf(zzkoVar.zzg.zza);
        }
        zzko zzkoVar2 = this.zzj;
        final zzuq zzuqVar = zzkoVar2 == null ? null : zzkoVar2.zzg.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // java.lang.Runnable
            public final void run() {
                zzkr.this.zzc.zzU(zzfweVar.zzi(), zzuqVar);
            }
        });
    }

    private final boolean zzK(zzbn zzbnVar, zzuq zzuqVar, boolean z4) {
        int zza = zzbnVar.zza(zzuqVar.zza);
        return !zzbnVar.zze(zzbnVar.zzd(zza, this.zza, false).zzc, this.zzb, 0L).zzi && zzbnVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z4;
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

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        return zza(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzbn zzbnVar, long j, long j3, long j7) {
        zzkp zzkpVar;
        int i7;
        zzko zzkoVar = this.zzi;
        zzko zzkoVar2 = null;
        while (true) {
            boolean z4 = false;
            if (zzkoVar == null) {
                return 0;
            }
            zzkp zzkpVar2 = zzkoVar.zzg;
            if (zzkoVar2 == null) {
                zzkpVar = zzp(zzbnVar, zzkpVar2);
            } else {
                zzkp zzE = zzE(zzbnVar, zzkoVar2, j);
                if (zzE == null || zzkpVar2.zzb != zzE.zzb || !zzkpVar2.zza.equals(zzE.zza)) {
                    break;
                }
                zzkpVar = zzE;
            }
            zzkoVar.zzg = zzkpVar.zza(zzkpVar2.zzc);
            if (zzx(zzkpVar2.zze, zzkpVar.zze)) {
                zzkoVar2 = zzkoVar;
                zzkoVar = zzkoVar.zzg();
            } else {
                zzkoVar.zzr();
                long j8 = zzkpVar.zze;
                long zze = j8 == -9223372036854775807L ? Long.MAX_VALUE : j8 + zzkoVar.zze();
                if (zzkoVar == this.zzj) {
                    boolean z7 = zzkoVar.zzg.zzg;
                    if (j3 == Long.MIN_VALUE || j3 >= zze) {
                        i7 = 1;
                        if (zzkoVar == this.zzk && (j7 == Long.MIN_VALUE || j7 >= zze)) {
                            z4 = true;
                        }
                        int zza = zza(zzkoVar);
                        return zza == 0 ? zza : z4 ? i7 | 2 : i7;
                    }
                }
                i7 = 0;
                if (zzkoVar == this.zzk) {
                    z4 = true;
                }
                int zza2 = zza(zzkoVar);
                if (zza2 == 0) {
                }
            }
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
        zzko zzkoVar;
        zzko zzkoVar2 = this.zzl;
        long zze = zzkoVar2 == null ? 1000000000000L : (zzkoVar2.zze() + zzkoVar2.zzg.zze) - zzkpVar.zzb;
        int i7 = 0;
        while (true) {
            if (i7 >= this.zzq.size()) {
                zzkoVar = null;
                break;
            }
            zzkp zzkpVar2 = ((zzko) this.zzq.get(i7)).zzg;
            if (zzx(zzkpVar2.zze, zzkpVar.zze) && zzkpVar2.zzb == zzkpVar.zzb && zzkpVar2.zza.equals(zzkpVar.zza)) {
                zzkoVar = (zzko) this.zzq.remove(i7);
                break;
            }
            i7++;
        }
        if (zzkoVar == null) {
            zzkoVar = zzkf.zzd(this.zzr.zza, zzkpVar, zze);
        } else {
            zzkoVar.zzg = zzkpVar;
            zzkoVar.zzq(zze);
        }
        zzko zzkoVar3 = this.zzl;
        if (zzkoVar3 != null) {
            zzkoVar3.zzp(zzkoVar);
        } else {
            this.zzi = zzkoVar;
            this.zzj = zzkoVar;
            this.zzk = zzkoVar;
        }
        this.zzo = null;
        this.zzl = zzkoVar;
        this.zzn++;
        zzJ();
        return zzkoVar;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzkp zzp(zzbn zzbnVar, zzkp zzkpVar) {
        long j;
        long j3;
        long j7;
        long j8;
        int i7;
        zzuq zzuqVar = zzkpVar.zza;
        boolean zzM = zzM(zzuqVar);
        boolean zzL = zzL(zzbnVar, zzuqVar);
        boolean zzK = zzK(zzbnVar, zzuqVar, zzM);
        zzbnVar.zzn(zzkpVar.zza.zza, this.zza);
        if (zzuqVar.zzb() || (i7 = zzuqVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzg(i7);
            j = 0;
        }
        if (zzuqVar.zzb()) {
            j3 = this.zza.zzf(zzuqVar.zzb, zzuqVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j7 = 0;
                j8 = 0;
                if (zzuqVar.zzb()) {
                    int i8 = zzuqVar.zze;
                    if (i8 != -1) {
                        this.zza.zzk(i8);
                    }
                } else {
                    this.zza.zzk(zzuqVar.zzb);
                }
                return new zzkp(zzuqVar, zzkpVar.zzb, zzkpVar.zzc, j7, j8, false, false, zzM, zzL, zzK);
            }
            j3 = this.zza.zzd;
        }
        j7 = j;
        j8 = j3;
        if (zzuqVar.zzb()) {
        }
        return new zzkp(zzuqVar, zzkpVar.zzb, zzkpVar.zzc, j7, j8, false, false, zzM, zzL, zzK);
    }

    public final zzuq zzq(zzbn zzbnVar, Object obj, long j) {
        long zzD;
        int zza;
        int i7 = zzbnVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zza = zzbnVar.zza(obj2)) == -1 || zzbnVar.zzd(zza, this.zza, false).zzc != i7) {
            zzko zzkoVar = this.zzi;
            while (true) {
                if (zzkoVar == null) {
                    zzko zzkoVar2 = this.zzi;
                    while (true) {
                        if (zzkoVar2 != null) {
                            int zza2 = zzbnVar.zza(zzkoVar2.zzb);
                            if (zza2 != -1 && zzbnVar.zzd(zza2, this.zza, false).zzc == i7) {
                                zzD = zzkoVar2.zzg.zza.zzd;
                                break;
                            }
                            zzkoVar2 = zzkoVar2.zzg();
                        } else {
                            zzD = zzD(obj);
                            if (zzD == -1) {
                                zzD = this.zze;
                                this.zze = 1 + zzD;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzD;
                                }
                            }
                        }
                    }
                } else {
                    if (zzkoVar.zzb.equals(obj)) {
                        zzD = zzkoVar.zzg.zza.zzd;
                        break;
                    }
                    zzkoVar = zzkoVar.zzg();
                }
            }
        } else {
            zzD = this.zzp;
        }
        long j3 = zzD;
        zzbnVar.zzn(obj, this.zza);
        zzbnVar.zze(this.zza.zzc, this.zzb, 0L);
        int zza3 = zzbnVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzbm zzbmVar = this.zzb;
            if (zza3 < zzbmVar.zzn) {
                return zzI(zzbnVar, obj3, j, j3, zzbmVar, this.zza);
            }
            zzbnVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzbl zzblVar = this.zza;
            if (zzblVar.zzd(zzblVar.zzd) != -1) {
                obj3 = this.zza.zzb;
                obj3.getClass();
            }
            zza3--;
        }
    }

    public final void zzs() {
        if (this.zzn == 0) {
            return;
        }
        zzko zzkoVar = this.zzi;
        zzcv.zzb(zzkoVar);
        this.zzo = zzkoVar.zzb;
        this.zzp = zzkoVar.zzg.zza.zzd;
        while (zzkoVar != null) {
            zzkoVar.zzo();
            zzkoVar = zzkoVar.zzg();
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
