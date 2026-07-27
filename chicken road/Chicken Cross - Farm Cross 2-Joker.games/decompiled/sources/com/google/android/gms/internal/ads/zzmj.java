package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzmj {
    private final zznq zzc;
    private final zzea zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjx zzh;
    private zzmg zzi;
    private zzmg zzj;
    private zzmg zzk;
    private zzmg zzl;
    private zzmg zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzlr zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzmj(zznq zznqVar, zzea zzeaVar, zzlr zzlrVar, zzjx zzjxVar) {
        this.zzc = zznqVar;
        this.zzd = zzeaVar;
        this.zzr = zzlrVar;
        this.zzh = zzjxVar;
    }

    private static zzxo zzA(zzbf zzbfVar, Object obj, long j, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int zze = zzbdVar.zze(j);
        return zze == -1 ? new zzxo(obj, j2, zzbdVar.zzf(j)) : new zzxo(obj, zze, zzbdVar.zzd(zze), j2);
    }

    private final void zzB() {
        int i = zzgxm.zzd;
        final zzgxj zzgxjVar = new zzgxj();
        for (zzmg zzmgVar = this.zzi; zzmgVar != null; zzmgVar = zzmgVar.zzp()) {
            zzgxjVar.zzf(zzmgVar.zzg.zza);
        }
        zzmg zzmgVar2 = this.zzj;
        final zzxo zzxoVar = zzmgVar2 == null ? null : zzmgVar2.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzmj.this.zzz(zzgxjVar, zzxoVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzmg zzmgVar = (zzmg) this.zzq.get(i);
            if (zzmgVar.zzb.equals(obj)) {
                return zzmgVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzmg zzmgVar = this.zzi;
        if (zzmgVar == null) {
            return 0;
        }
        int zze = zzbfVar.zze(zzmgVar.zzb);
        while (true) {
            zze = zzbfVar.zzl(zze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzmgVar.getClass();
                if (zzmgVar.zzp() == null || zzmgVar.zzg.zzg) {
                    break;
                }
                zzmgVar = zzmgVar.zzp();
            }
            zzmg zzp = zzmgVar.zzp();
            if (zze == -1 || zzp == null || zzbfVar.zze(zzp.zzb) != zze) {
                break;
            }
            zzmgVar = zzp;
        }
        int zzs = zzs(zzmgVar);
        zzmgVar.zzg = zzx(zzbfVar, zzmgVar.zzg);
        return zzs;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmh zzE(zzbf zzbfVar, zzmg zzmgVar, long j) {
        int zzd;
        Object obj;
        long j2;
        long j3;
        long j4;
        zzmh zzmhVar = zzmgVar.zzg;
        long zza = zzmgVar.zza();
        long j5 = zzmhVar.zze;
        long j6 = (zza + j5) - j;
        int i = -1;
        long j7 = -9223372036854775807L;
        if (zzmhVar.zzg) {
            zzxo zzxoVar = zzmhVar.zza;
            Object obj2 = zzxoVar.zza;
            int zze = zzbfVar.zze(obj2);
            zzbd zzbdVar = this.zza;
            zzbe zzbeVar = this.zzb;
            long j8 = 0;
            int zzl = zzbfVar.zzl(zze, zzbdVar, zzbeVar, this.zzf, this.zzg);
            if (zzl != -1) {
                int i2 = zzbfVar.zzd(zzl, zzbdVar, true).zzc;
                Object obj3 = zzbdVar.zzb;
                obj3.getClass();
                long j9 = zzxoVar.zzd;
                if (zzbfVar.zzb(i2, zzbeVar, 0L).zzn == zzl) {
                    long max = zzM(zzbfVar, zzbdVar.zzc, zzbdVar.zzd, zzbeVar) ? Math.max(0L, j6) : -9223372036854775807L;
                    Pair zzn = zzbfVar.zzn(zzbeVar, zzbdVar, i2, -9223372036854775807L, max);
                    if (zzn != null) {
                        obj3 = zzn.first;
                        long longValue = ((Long) zzn.second).longValue();
                        zzmg zzp = zzmgVar.zzp();
                        if (zzp == null || !zzp.zzb.equals(obj3)) {
                            j9 = zzC(obj3);
                            if (j9 == -1) {
                                j9 = this.zze;
                                this.zze = 1 + j9;
                            }
                        } else {
                            j9 = zzp.zzg.zza.zzd;
                        }
                        j3 = longValue;
                        j4 = max;
                        j8 = -9223372036854775807L;
                    }
                } else {
                    j3 = 0;
                    j4 = -9223372036854775807L;
                }
                zzxo zzA = zzA(zzbfVar, obj3, j3, j9, zzbeVar, zzbdVar);
                if (j8 != -9223372036854775807L && zzmhVar.zzd != -9223372036854775807L) {
                    zzbfVar.zzo(obj2, zzbdVar).zzb();
                    int i3 = zzbdVar.zzg.zzd;
                }
                return zzF(zzbfVar, zzA, j8, j3, j4);
            }
        } else {
            zzxo zzxoVar2 = zzmhVar.zza;
            Object obj4 = zzxoVar2.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj4, zzbdVar2);
            if (zzxoVar2.zzb()) {
                int i4 = zzxoVar2.zzb;
                if (zzbdVar2.zzg(i4) != -1) {
                    int zza2 = zzbdVar2.zzg.zza(i4).zza(zzxoVar2.zzc);
                    if (zza2 < 0) {
                        return zzG(zzbfVar, obj4, i4, zza2, zzmhVar.zzd, zzxoVar2.zzd);
                    }
                    long j10 = zzmhVar.zzd;
                    if (j10 == -9223372036854775807L) {
                        zzbe zzbeVar2 = this.zzb;
                        long max2 = zzM(zzbfVar, zzbdVar2.zzc, zzbdVar2.zzd, zzbeVar2) ? Math.max(0L, j6) : -9223372036854775807L;
                        obj = obj4;
                        Pair zzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, max2);
                        if (zzn2 != null) {
                            j10 = ((Long) zzn2.second).longValue();
                            j2 = max2;
                        }
                    } else {
                        obj = obj4;
                        j2 = -9223372036854775807L;
                        j7 = j10;
                    }
                    zzL(zzbfVar, obj, i4);
                    return zzH(zzbfVar, obj, Math.max(0L, j10), j2, j7, zzxoVar2.zzd);
                }
            } else {
                int i5 = zzxoVar2.zze;
                if (i5 != -1) {
                    zzbdVar2.zzb();
                    if (i5 == -1) {
                        zzbdVar2.zzg.zzb(-1);
                        zzd = zzbdVar2.zzd(i);
                        zzbdVar2.zzj(i);
                        if (zzd == zzbdVar2.zzg(i)) {
                            return zzG(zzbfVar, obj4, i, zzd, j5, zzxoVar2.zzd);
                        }
                        zzL(zzbfVar, obj4, i);
                        return zzH(zzbfVar, obj4, 0L, -9223372036854775807L, j5, zzxoVar2.zzd);
                    }
                }
                i = i5;
                zzd = zzbdVar2.zzd(i);
                zzbdVar2.zzj(i);
                if (zzd == zzbdVar2.zzg(i)) {
                }
            }
        }
        return null;
    }

    private final zzmh zzF(zzbf zzbfVar, zzxo zzxoVar, long j, long j2, long j3) {
        Object obj = zzxoVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzxoVar.zzb() ? zzG(zzbfVar, obj, zzxoVar.zzb, zzxoVar.zzc, j, zzxoVar.zzd) : zzH(zzbfVar, obj, j2, j3, j, zzxoVar.zzd);
    }

    private final zzmh zzG(zzbf zzbfVar, Object obj, int i, int i2, long j, long j2) {
        zzxo zzxoVar = new zzxo(obj, i, i2, j2);
        Object obj2 = zzxoVar.zza;
        int i3 = zzxoVar.zzb;
        int i4 = zzxoVar.zzc;
        zzbd zzbdVar = this.zza;
        long zzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i3, i4);
        if (i2 == zzbdVar.zzd(i)) {
            zzbdVar.zzi();
        }
        zzbdVar.zzj(i3);
        return new zzmh(zzxoVar, (zzh == -9223372036854775807L || zzh > 0) ? 0L : Math.max(0L, (-1) + zzh), -9223372036854775807L, j, zzh, false, false, false, false);
    }

    private final zzmh zzH(zzbf zzbfVar, Object obj, long j, long j2, long j3, long j4) {
        long j5 = j;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int zzf = zzbdVar.zzf(j5);
        if (zzf != -1) {
            zzbdVar.zzj(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzj(zzf);
        }
        zzxo zzxoVar = new zzxo(obj, j4, zzf);
        boolean zzN = zzN(zzxoVar);
        boolean zzI = zzI(zzbfVar, zzxoVar);
        boolean zzJ = zzJ(zzbfVar, zzxoVar, zzN);
        long zzK = zzK(zzbfVar, zzxoVar);
        if (zzK != -9223372036854775807L && j5 >= zzK) {
            j5 = Math.max(0L, zzK - 1);
        }
        return new zzmh(zzxoVar, j5, j2, j3, zzK, false, zzN, zzI, zzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzxo zzxoVar) {
        if (!zzN(zzxoVar)) {
            return false;
        }
        Object obj = zzxoVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzxo zzxoVar, boolean z) {
        int zze = zzbfVar.zze(zzxoVar.zza);
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzd(zze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i, zzbeVar, 0L).zzi && zzbfVar.zzl(zze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(zzbf zzbfVar, zzxo zzxoVar) {
        Object obj = zzxoVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxoVar.zzb()) {
            return zzbdVar.zzh(zzxoVar.zzb, zzxoVar.zzc);
        }
        int i = zzxoVar.zze;
        if (i == -1) {
            return zzbdVar.zzd;
        }
        zzbdVar.zzc(i);
        return 0L;
    }

    private final long zzL(zzbf zzbfVar, Object obj, int i) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i);
        long j = zzbdVar.zzg.zza(i).zzi;
        return 0L;
    }

    private static boolean zzM(zzbf zzbfVar, int i, long j, zzbe zzbeVar) {
        if (j == -9223372036854775807L) {
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzi && !zzbeVar.zzk) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzN(zzxo zzxoVar) {
        return !zzxoVar.zzb() && zzxoVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i) {
        this.zzf = i;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z) {
        this.zzg = z;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjx zzjxVar) {
        this.zzh = zzjxVar;
        long j = zzjxVar.zzb;
        zzj();
    }

    public final boolean zzd(zzxm zzxmVar) {
        zzmg zzmgVar = this.zzl;
        return zzmgVar != null && zzmgVar.zza == zzxmVar;
    }

    public final boolean zze(zzxm zzxmVar) {
        zzmg zzmgVar = this.zzm;
        return zzmgVar != null && zzmgVar.zza == zzxmVar;
    }

    public final void zzf(long j) {
        zzmg zzmgVar = this.zzl;
        if (zzmgVar != null) {
            zzmgVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzmg zzmgVar = this.zzl;
        if (zzmgVar == null) {
            return true;
        }
        if (zzmgVar.zzg.zzi || !zzmgVar.zzd() || this.zzl.zzg.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzn < 100;
    }

    public final zzmh zzh(long j, zzmw zzmwVar) {
        zzmg zzmgVar = this.zzl;
        return zzmgVar == null ? zzF(zzmwVar.zza, zzmwVar.zzb, zzmwVar.zzc, zzmwVar.zzs, -9223372036854775807L) : zzE(zzmwVar.zza, zzmgVar, j);
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzmg) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzmg zzk() {
        return this.zzl;
    }

    public final zzmg zzl() {
        return this.zzm;
    }

    public final zzmg zzm() {
        return this.zzi;
    }

    public final zzmg zzn() {
        return this.zzj;
    }

    public final zzmg zzo() {
        return this.zzk;
    }

    public final zzmg zzp() {
        zzmg zzmgVar = this.zzk;
        zzmg zzmgVar2 = this.zzj;
        if (zzmgVar == zzmgVar2) {
            zzmgVar2.getClass();
            this.zzk = zzmgVar2.zzp();
        }
        zzmgVar2.getClass();
        this.zzj = zzmgVar2.zzp();
        zzB();
        zzmg zzmgVar3 = this.zzj;
        zzmgVar3.getClass();
        return zzmgVar3;
    }

    public final zzmg zzr() {
        zzmg zzmgVar = this.zzi;
        if (zzmgVar == null) {
            return null;
        }
        if (zzmgVar == this.zzj) {
            this.zzj = zzmgVar.zzp();
        }
        if (zzmgVar == this.zzk) {
            this.zzk = zzmgVar.zzp();
        }
        zzmgVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzmg zzmgVar2 = this.zzi;
            this.zzo = zzmgVar2.zzb;
            this.zzp = zzmgVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzmg zzmgVar = this.zzm;
        if (zzmgVar == null || zzmgVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzmg zzmgVar2 = (zzmg) this.zzq.get(i);
                if (!zzmgVar2.zze()) {
                    this.zzm = zzmgVar2;
                    return;
                }
            }
        }
    }

    public final zzmg zzu(zzxm zzxmVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzmg zzmgVar = (zzmg) this.zzq.get(i);
            if (zzmgVar.zza == zzxmVar) {
                return zzmgVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzmg zzmgVar = this.zzi;
        zzmgVar.getClass();
        this.zzo = zzmgVar.zzb;
        this.zzp = zzmgVar.zzg.zza.zzd;
        while (zzmgVar != null) {
            zzmgVar.zzn();
            zzmgVar = zzmgVar.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzw(zzbf zzbfVar, long j, long j2, long j3) {
        zzmh zzE;
        zzmh zzmhVar;
        zzmh zzmhVar2;
        boolean z;
        int zzs;
        zzmg zzmgVar = this.zzi;
        zzmg zzmgVar2 = null;
        while (zzmgVar != null) {
            zzmh zzmhVar3 = zzmgVar.zzg;
            if (zzmgVar2 != null) {
                zzE = zzE(zzbfVar, zzmgVar2, j);
                if (zzE != null && zzmhVar3.zza.equals(zzE.zza)) {
                    long j4 = zzmhVar3.zzb;
                    long j5 = zzE.zzb;
                    if (j4 == j5) {
                        zzmhVar = zzmhVar3;
                    } else {
                        long j6 = zzmhVar3.zzc;
                        if (j6 != -9223372036854775807L) {
                            zzmhVar = zzmhVar3;
                            long j7 = zzE.zzc;
                            if (j7 != -9223372036854775807L) {
                                if (Math.abs((j5 - j7) - (j4 - j6)) >= 5000000) {
                                }
                            }
                        }
                    }
                    if (j4 != j5) {
                        zzmhVar2 = zzmhVar;
                        zzE = zzE.zza(j4, zzmhVar2.zzc);
                    } else {
                        zzmhVar2 = zzmhVar;
                    }
                }
                return zzs(zzmgVar2);
            }
            zzE = zzx(zzbfVar, zzmhVar3);
            zzmhVar2 = zzmhVar3;
            zzmgVar.zzg = zzE.zzb(zzmhVar2.zzd);
            long j8 = zzmhVar2.zze;
            long j9 = zzE.zze;
            if (j8 != j9) {
                long zza = j9 == -9223372036854775807L ? Long.MAX_VALUE : j9 + zzmgVar.zza();
                if (zzmgVar == this.zzj) {
                    boolean z2 = zzmgVar.zzg.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zza) {
                        z = true;
                        boolean z3 = zzmgVar != this.zzk && (j3 == Long.MIN_VALUE || j3 >= zza);
                        zzs = zzs(zzmgVar);
                        if (zzs == 0) {
                            return zzs;
                        }
                        int i = (!z || (j8 == -9223372036854775807L && zzmhVar2.zza.zze == -1)) ? 0 : 1;
                        return z3 ? i | 2 : i;
                    }
                }
                z = false;
                if (zzmgVar != this.zzk) {
                }
                zzs = zzs(zzmgVar);
                if (zzs == 0) {
                }
            } else {
                zzmgVar2 = zzmgVar;
                zzmgVar = zzmgVar.zzp();
            }
        }
        return 0;
    }

    public final zzmh zzx(zzbf zzbfVar, zzmh zzmhVar) {
        zzxo zzxoVar = zzmhVar.zza;
        boolean zzN = zzN(zzxoVar);
        boolean zzI = zzI(zzbfVar, zzxoVar);
        boolean zzJ = zzJ(zzbfVar, zzxoVar, zzN);
        long zzK = zzK(zzbfVar, zzxoVar);
        Object obj = zzxoVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxoVar.zzb()) {
            zzbdVar.zzj(zzxoVar.zzb);
        } else {
            int i = zzxoVar.zze;
            if (i != -1) {
                zzbdVar.zzj(i);
            }
        }
        return new zzmh(zzxoVar, zzmhVar.zzb, zzmhVar.zzc, zzmhVar.zzd, zzK, false, zzN, zzI, zzJ);
    }

    public final zzxo zzy(zzmw zzmwVar, zzbf zzbfVar, Object obj, long j, boolean z, boolean z2) {
        long zzC;
        int zze;
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(zze, zzbdVar, false).zzc != i) {
            zzmg zzmgVar = this.zzi;
            while (true) {
                if (zzmgVar == null) {
                    zzmg zzmgVar2 = this.zzi;
                    while (true) {
                        if (zzmgVar2 != null) {
                            int zze2 = zzbfVar.zze(zzmgVar2.zzb);
                            if (zze2 != -1 && zzbfVar.zzd(zze2, zzbdVar, false).zzc == i) {
                                zzC = zzmgVar2.zzg.zza.zzd;
                                break;
                            }
                            zzmgVar2 = zzmgVar2.zzp();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzmgVar.zzb.equals(obj)) {
                        zzC = zzmgVar.zzg.zza.zzd;
                        break;
                    }
                    zzmgVar = zzmgVar.zzp();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        if (!z && !z2) {
            zzxo zzxoVar = zzmwVar.zzb;
            zzxo zzA = zzA(zzbfVar, obj, j, j2, this.zzb, zzbdVar);
            if (zzxoVar.zzb() && zzxoVar.equals(zzA)) {
                return zzxoVar;
            }
            zzbfVar.zzo(obj, zzbdVar);
            return new zzxo(obj, j2, zzbdVar.zzf(j));
        }
        zzbfVar.zzo(obj, zzbdVar);
        int i2 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        Object obj3 = obj;
        for (int zze3 = zzbfVar.zze(obj); zze3 >= zzbeVar.zzn; zze3--) {
            zzbfVar.zzd(zze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                obj3 = zzbdVar.zzb;
                obj3.getClass();
            }
        }
        zzxo zzA2 = zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
        int i3 = zzA2.zzb;
        if (i3 == -1 || z) {
            return zzA2;
        }
        Object obj4 = zzA2.zza;
        zzbfVar.zzo(obj4, zzbdVar);
        long j3 = zzbdVar.zzg.zza(i3).zza;
        return j != 0 ? new zzxo(obj4, zzA2.zzd, zzbdVar.zzf(j)) : zzA2;
    }

    final /* synthetic */ void zzz(zzgxj zzgxjVar, zzxo zzxoVar) {
        this.zzc.zzz(zzgxjVar.zzi(), zzxoVar);
    }

    public final zzmg zzi(zzmh zzmhVar) {
        zzmg zzmgVar;
        zzmg zzmgVar2 = this.zzl;
        long zza = zzmgVar2 == null ? 1000000000000L : (zzmgVar2.zza() + zzmgVar2.zzg.zze) - zzmhVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzmgVar = null;
                break;
            }
            zzmh zzmhVar2 = ((zzmg) this.zzq.get(i)).zzg;
            long j = zzmhVar2.zze;
            long j2 = zzmhVar.zze;
            if ((j == -9223372036854775807L || j == j2) && zzmhVar2.zzb == zzmhVar.zzb && zzmhVar2.zza.equals(zzmhVar.zza)) {
                zzmgVar = (zzmg) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzmgVar == null) {
            zzmgVar = this.zzr.zza(zzmhVar, zza);
        } else {
            zzmgVar.zzg = zzmhVar;
            zzmgVar.zzb(zza);
        }
        zzmg zzmgVar3 = this.zzl;
        if (zzmgVar3 != null) {
            zzmgVar3.zzo(zzmgVar);
        } else {
            this.zzi = zzmgVar;
            this.zzj = zzmgVar;
            this.zzk = zzmgVar;
        }
        this.zzo = null;
        this.zzl = zzmgVar;
        this.zzn++;
        zzB();
        return zzmgVar;
    }

    public final void zzq() {
        zzmg zzp;
        zzmg zzmgVar = this.zzk;
        if (zzmgVar == null || (zzp = zzmgVar.zzp()) == null) {
            throw null;
        }
        this.zzk = zzp;
        zzB();
    }

    public final int zzs(zzmg zzmgVar) {
        zzmgVar.getClass();
        int i = 0;
        if (zzmgVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzmgVar;
        while (zzmgVar.zzp() != null) {
            zzmgVar = zzmgVar.zzp();
            zzmgVar.getClass();
            if (zzmgVar == this.zzj) {
                zzmg zzmgVar2 = this.zzi;
                this.zzj = zzmgVar2;
                this.zzk = zzmgVar2;
                i = 3;
            }
            if (zzmgVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzmgVar.zzn();
            this.zzn--;
        }
        zzmg zzmgVar3 = this.zzl;
        zzmgVar3.getClass();
        zzmgVar3.zzo(null);
        zzB();
        return i;
    }
}
