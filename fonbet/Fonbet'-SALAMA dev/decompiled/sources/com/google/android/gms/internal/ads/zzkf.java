package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zzkf implements Handler.Callback, zzun, zzym, zzlc, zzhx, zzlg {
    private static final long zza = zzen.zzv(10000);
    private zzkc zzA;
    private boolean zzB;
    private boolean zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzJ;
    private int zzK;
    private zzkd zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private zzia zzQ;
    private zzik zzS;
    private boolean zzU;
    private final zziw zzV;
    private final zzht zzW;
    private final zzlr[] zzb;
    private final zzlp[] zzc;
    private final boolean[] zzd;
    private final zzyn zze;
    private final zzyo zzf;
    private final zzkj zzg;
    private final zzyv zzh;
    private final zzdj zzi;
    private final zzlf zzj;
    private final Looper zzk;
    private final zzbm zzl;
    private final zzbl zzm;
    private final long zzn;
    private final zzhy zzo;
    private final ArrayList zzp;
    private final zzcz zzq;
    private final zzkr zzr;
    private final zzld zzs;
    private final long zzt;
    private final zzor zzu;
    private final zzly zzv;
    private final zzdj zzw;
    private final boolean zzx;
    private zzls zzy;
    private zzle zzz;
    private long zzT = -9223372036854775807L;
    private int zzH = 0;
    private boolean zzI = false;
    private boolean zzC = false;
    private long zzR = -9223372036854775807L;
    private long zzF = -9223372036854775807L;

    public zzkf(zzlm[] zzlmVarArr, zzlm[] zzlmVarArr2, zzyn zzynVar, zzyo zzyoVar, zzkj zzkjVar, zzyv zzyvVar, int i7, boolean z4, zzly zzlyVar, zzls zzlsVar, zzht zzhtVar, long j, boolean z7, boolean z8, Looper looper, zzcz zzczVar, zziw zziwVar, zzor zzorVar, zzlf zzlfVar, zzik zzikVar) {
        this.zzV = zziwVar;
        this.zze = zzynVar;
        this.zzf = zzyoVar;
        this.zzg = zzkjVar;
        this.zzh = zzyvVar;
        int i8 = 0;
        this.zzy = zzlsVar;
        this.zzW = zzhtVar;
        this.zzt = j;
        this.zzq = zzczVar;
        this.zzu = zzorVar;
        this.zzS = zzikVar;
        this.zzv = zzlyVar;
        this.zzn = zzkjVar.zzb(zzorVar);
        zzkjVar.zzg(zzorVar);
        zzbn zzbnVar = zzbn.zza;
        zzle zzh = zzle.zzh(zzyoVar);
        this.zzz = zzh;
        this.zzA = new zzkc(zzh);
        int length = zzlmVarArr.length;
        this.zzc = new zzlp[2];
        this.zzd = new boolean[2];
        zzlo zze = zzynVar.zze();
        this.zzb = new zzlr[2];
        boolean z9 = false;
        for (int i9 = 2; i8 < i9; i9 = 2) {
            zzlmVarArr[i8].zzv(i8, zzorVar, zzczVar);
            this.zzc[i8] = zzlmVarArr[i8].zzm();
            this.zzc[i8].zzL(zze);
            zzlm zzlmVar = zzlmVarArr2[i8];
            if (zzlmVar != null) {
                zzlmVar.zzv(i8 + 2, zzorVar, zzczVar);
                z9 = true;
            }
            this.zzb[i8] = new zzlr(zzlmVarArr[i8], zzlmVarArr2[i8], i8);
            i8++;
        }
        this.zzx = z9;
        this.zzo = new zzhy(this, zzczVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbm();
        this.zzm = new zzbl();
        zzynVar.zzr(this, zzyvVar);
        this.zzP = true;
        zzdj zzd = zzczVar.zzd(looper, null);
        this.zzw = zzd;
        this.zzr = new zzkr(zzlyVar, zzd, new zzjt(this), zzikVar);
        this.zzs = new zzld(this, zzlyVar, zzd, zzorVar);
        zzlf zzlfVar2 = new zzlf(null);
        this.zzj = zzlfVar2;
        Looper zza2 = zzlfVar2.zza();
        this.zzk = zza2;
        this.zzi = zzczVar.zzd(zza2, this);
    }

    private final long zzA(zzuq zzuqVar, long j, boolean z4, boolean z7) {
        zzah();
        zzam(false, true);
        if (z7 || this.zzz.zze == 3) {
            zzae(2);
        }
        zzko zzj = this.zzr.zzj();
        zzko zzkoVar = zzj;
        while (zzkoVar != null && !zzuqVar.equals(zzkoVar.zzg.zza)) {
            zzkoVar = zzkoVar.zzg();
        }
        if (z4 || zzj != zzkoVar || (zzkoVar != null && zzkoVar.zze() + j < 0)) {
            zzF();
            if (zzkoVar != null) {
                while (this.zzr.zzj() != zzkoVar) {
                    this.zzr.zze();
                }
                this.zzr.zza(zzkoVar);
                zzkoVar.zzq(1000000000000L);
                zzI();
                zzkoVar.zzh = true;
            }
        }
        zzE();
        if (zzkoVar != null) {
            this.zzr.zza(zzkoVar);
            if (!zzkoVar.zze) {
                zzkoVar.zzg = zzkoVar.zzg.zzb(j);
            } else if (zzkoVar.zzf) {
                j = zzkoVar.zza.zze(j);
                zzkoVar.zza.zzi(j - this.zzn, false);
            }
            zzY(j);
            zzP();
        } else {
            this.zzr.zzs();
            zzY(j);
        }
        zzL(false);
        this.zzi.zzi(2);
        return j;
    }

    private final Pair zzB(zzbn zzbnVar) {
        long j = 0;
        if (zzbnVar.zzo()) {
            return Pair.create(zzle.zzi(), 0L);
        }
        Pair zzl = zzbnVar.zzl(this.zzl, this.zzm, zzbnVar.zzg(this.zzI), -9223372036854775807L);
        zzuq zzq = this.zzr.zzq(zzbnVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzq.zzb()) {
            zzbnVar.zzn(zzq.zza, this.zzm);
            if (zzq.zzc == this.zzm.zze(zzq.zzb)) {
                this.zzm.zzh();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzq, Long.valueOf(j));
    }

    private static Pair zzC(zzbn zzbnVar, zzkd zzkdVar, boolean z4, int i7, boolean z7, zzbm zzbmVar, zzbl zzblVar) {
        Pair zzl;
        zzbn zzbnVar2 = zzkdVar.zza;
        if (zzbnVar.zzo()) {
            return null;
        }
        zzbn zzbnVar3 = true == zzbnVar2.zzo() ? zzbnVar : zzbnVar2;
        try {
            zzl = zzbnVar3.zzl(zzbmVar, zzblVar, zzkdVar.zzb, zzkdVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbnVar.equals(zzbnVar3)) {
            return zzl;
        }
        if (zzbnVar.zza(zzl.first) != -1) {
            return (zzbnVar3.zzn(zzl.first, zzblVar).zzf && zzbnVar3.zze(zzblVar.zzc, zzbmVar, 0L).zzn == zzbnVar3.zza(zzl.first)) ? zzbnVar.zzl(zzbmVar, zzblVar, zzbnVar.zzn(zzl.first, zzblVar).zzc, zzkdVar.zzc) : zzl;
        }
        int zzb = zzb(zzbmVar, zzblVar, i7, z7, zzl.first, zzbnVar3, zzbnVar);
        if (zzb != -1) {
            return zzbnVar.zzl(zzbmVar, zzblVar, zzb, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzle zzD(zzuq zzuqVar, long j, long j3, long j7, boolean z4, int i7) {
        List list;
        zzyo zzyoVar;
        zzwv zzwvVar;
        this.zzP = (!this.zzP && j == this.zzz.zzs && zzuqVar.equals(this.zzz.zzb)) ? false : true;
        zzX();
        zzle zzleVar = this.zzz;
        zzwv zzwvVar2 = zzleVar.zzh;
        zzyo zzyoVar2 = zzleVar.zzi;
        List list2 = zzleVar.zzj;
        if (this.zzs.zzj()) {
            zzko zzj = this.zzr.zzj();
            zzwvVar2 = zzj == null ? zzwv.zza : zzj.zzh();
            zzyoVar2 = zzj == null ? this.zzf : zzj.zzi();
            zzyh[] zzyhVarArr = zzyoVar2.zzc;
            zzfwe zzfweVar = new zzfwe();
            boolean z7 = false;
            for (zzyh zzyhVar : zzyhVarArr) {
                if (zzyhVar != null) {
                    zzav zzavVar = zzyhVar.zze(0).zzl;
                    if (zzavVar == null) {
                        zzfweVar.zzf(new zzav(-9223372036854775807L, new zzau[0]));
                    } else {
                        zzfweVar.zzf(zzavVar);
                        z7 = true;
                    }
                }
            }
            zzfwh zzi = z7 ? zzfweVar.zzi() : zzfwh.zzn();
            if (zzj != null) {
                zzkp zzkpVar = zzj.zzg;
                if (zzkpVar.zzc != j3) {
                    zzj.zzg = zzkpVar.zza(j3);
                }
            }
            zzko zzj2 = this.zzr.zzj();
            if (zzj2 != null) {
                zzyo zzi2 = zzj2.zzi();
                for (int i8 = 0; i8 < 2; i8++) {
                    if (zzi2.zzb(i8)) {
                        if (this.zzb[i8].zzb() != 1) {
                            break;
                        }
                        int i9 = zzi2.zzb[i8].zzb;
                    }
                }
            }
            list = zzi;
        } else {
            if (!zzuqVar.equals(this.zzz.zzb)) {
                zzyoVar = this.zzf;
                zzwvVar = zzwv.zza;
                list = zzfwh.zzn();
                if (z4) {
                    this.zzA.zzc(i7);
                }
                return this.zzz.zzc(zzuqVar, j, j3, j7, zzx(), zzwvVar, zzyoVar, list);
            }
            list = list2;
        }
        zzwvVar = zzwvVar2;
        zzyoVar = zzyoVar2;
        if (z4) {
        }
        return this.zzz.zzc(zzuqVar, j, j3, j7, zzx(), zzwvVar, zzyoVar, list);
    }

    private final void zzE() {
        if (this.zzx && zzao()) {
            zzlr[] zzlrVarArr = this.zzb;
            for (int i7 = 0; i7 < 2; i7++) {
                zzlr zzlrVar = zzlrVarArr[i7];
                int zza2 = zzlrVar.zza();
                zzlrVar.zzf(this.zzo);
                this.zzK -= zza2 - zzlrVar.zza();
            }
            this.zzT = -9223372036854775807L;
        }
    }

    private final void zzF() {
        int i7 = 0;
        while (true) {
            zzlr[] zzlrVarArr = this.zzb;
            if (i7 >= 2) {
                this.zzT = -9223372036854775807L;
                return;
            }
            int zza2 = zzlrVarArr[i7].zza();
            this.zzb[i7].zze(this.zzo);
            zzT(i7, false);
            this.zzK -= zza2;
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x052e, code lost:
    
        if (r1 != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x016e, code lost:
    
        if (r1.zzm() != r1.zzn()) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0398 A[LOOP:4: B:117:0x0396->B:118:0x0398, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02aa A[LOOP:1: B:69:0x02a5->B:71:0x02aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ce A[EDGE_INSN: B:72:0x02ce->B:73:0x02ce BREAK  A[LOOP:1: B:69:0x02a5->B:71:0x02aa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d0  */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzG() {
        long j;
        boolean z4;
        boolean z7;
        boolean z8;
        boolean zzj;
        int i7;
        boolean z9;
        int i8;
        boolean z10;
        zzko zzn;
        boolean z11;
        zzko zzj2;
        zzko zzg;
        zzko zze;
        boolean z12;
        int i9;
        int i10;
        int i11;
        int i12;
        zzko zzn2;
        zzyo zzi;
        ?? r02;
        int i13;
        zzko zzm;
        zzyo zzyoVar;
        int i14;
        zzkp zzo;
        zzdj zzdjVar = this.zzi;
        long uptimeMillis = SystemClock.uptimeMillis();
        zzdjVar.zzf(2);
        long j3 = -9223372036854775807L;
        if (this.zzz.zza.zzo() || !this.zzs.zzj()) {
            j = -9223372036854775807L;
        } else {
            this.zzr.zzu(this.zzM);
            if (this.zzr.zzA() && (zzo = this.zzr.zzo(this.zzM, this.zzz)) != null) {
                zzko zzh = this.zzr.zzh(zzo);
                if (!zzh.zzd) {
                    zzh.zzm(this, zzo.zzb);
                } else if (zzh.zze) {
                    this.zzi.zzc(8, zzh.zza).zza();
                }
                if (this.zzr.zzj() == zzh) {
                    zzY(zzo.zzb);
                }
                zzL(false);
            }
            if (this.zzG) {
                this.zzG = zzat(this.zzr.zzi());
                zzai();
            } else {
                zzP();
            }
            if (!this.zzD && this.zzx && !this.zzU && !zzao() && (zzm = this.zzr.zzm()) != null && zzm == this.zzr.zzn() && zzm.zzg() != null && zzm.zzg().zze) {
                this.zzr.zzf();
                zzko zzm2 = this.zzr.zzm();
                if (zzm2 != null) {
                    zzyo zzi2 = zzm2.zzi();
                    int i15 = 0;
                    while (i15 < 2) {
                        if (zzi2.zzb(i15) && this.zzb[i15].zzD() && !this.zzb[i15].zzF()) {
                            this.zzb[i15].zzy();
                            zzyoVar = zzi2;
                            i14 = i15;
                            zzH(zzm2, i15, false, zzm2.zzf());
                        } else {
                            zzyoVar = zzi2;
                            i14 = i15;
                        }
                        i15 = i14 + 1;
                        zzi2 = zzyoVar;
                    }
                    if (zzao()) {
                        this.zzT = zzm2.zza.zzd();
                        if (!zzm2.zzs()) {
                            this.zzr.zza(zzm2);
                            zzL(false);
                            zzP();
                        }
                    }
                }
            }
            zzko zzn3 = this.zzr.zzn();
            if (zzn3 != null) {
                if (zzn3.zzg() == null || this.zzD) {
                    z10 = false;
                    if (zzn3.zzg.zzj || this.zzD) {
                        zzlr[] zzlrVarArr = this.zzb;
                        for (int i16 = 0; i16 < 2; i16++) {
                            zzlr zzlrVar = zzlrVarArr[i16];
                            if (zzlrVar.zzG(zzn3) && zzlrVar.zzC(zzn3)) {
                                long j7 = zzn3.zzg.zze;
                                zzlrVar.zzs(zzn3, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : zzn3.zze() + j7);
                            }
                        }
                    }
                } else {
                    zzko zzn4 = this.zzr.zzn();
                    if (zzn4.zze) {
                        int i17 = 0;
                        while (true) {
                            zzlr[] zzlrVarArr2 = this.zzb;
                            if (i17 >= 2) {
                                if (zzao()) {
                                    zzkr zzkrVar = this.zzr;
                                }
                                if (zzn3.zzg().zze || this.zzM >= zzn3.zzg().zzf()) {
                                    zzyo zzi3 = zzn3.zzi();
                                    zzko zzg2 = this.zzr.zzg();
                                    zzyo zzi4 = zzg2.zzi();
                                    zzbn zzbnVar = this.zzz.zza;
                                    zzal(zzbnVar, zzg2.zzg.zza, zzbnVar, zzn3.zzg.zza, -9223372036854775807L, false);
                                    if (zzg2.zze && ((this.zzx && this.zzT != -9223372036854775807L) || zzg2.zza.zzd() != -9223372036854775807L)) {
                                        this.zzT = -9223372036854775807L;
                                        if (this.zzx && !this.zzU) {
                                            int i18 = 0;
                                            for (int i19 = 2; i18 < i19; i19 = 2) {
                                                if (!zzi4.zzb(i18) || zzay.zzf(zzi4.zzc[i18].zzf().zzo, zzi4.zzc[i18].zzf().zzk) || this.zzb[i18].zzF()) {
                                                    i18++;
                                                }
                                            }
                                        }
                                        long zzf = zzg2.zzf();
                                        zzlr[] zzlrVarArr3 = this.zzb;
                                        int i20 = 0;
                                        for (int i21 = 2; i20 < i21; i21 = 2) {
                                            zzlrVarArr3[i20].zzr(zzf);
                                            i20++;
                                        }
                                        if (zzg2.zzs()) {
                                            z10 = false;
                                        } else {
                                            this.zzr.zza(zzg2);
                                            z10 = false;
                                            zzL(false);
                                            zzP();
                                        }
                                    }
                                    z10 = false;
                                    zzlr[] zzlrVarArr4 = this.zzb;
                                    for (int i22 = 0; i22 < 2; i22++) {
                                        zzlrVarArr4[i22].zzl(zzi3, zzi4, zzg2.zzf());
                                    }
                                }
                            } else if (!zzlrVarArr2[i17].zzB(zzn4)) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                zzn = this.zzr.zzn();
                if (zzn != null && this.zzr.zzj() != zzn && !zzn.zzh) {
                    zzn2 = this.zzr.zzn();
                    zzi = zzn2.zzi();
                    r02 = z10;
                    i13 = 1;
                    while (true) {
                        zzlr[] zzlrVarArr5 = this.zzb;
                        if (r02 < 2) {
                            break;
                        }
                        int zza2 = zzlrVarArr5[r02].zza();
                        int zzc = this.zzb[r02].zzc(zzn2, zzi, this.zzo);
                        this.zzK -= zza2 - this.zzb[r02].zza();
                        i13 &= zzc & 1;
                        r02++;
                    }
                    if (i13 != 0) {
                        for (int i23 = z10; i23 < 2; i23++) {
                            if (zzi.zzb(i23) && !this.zzb[i23].zzG(zzn2)) {
                                zzH(zzn2, i23, false, zzn2.zzf());
                            }
                        }
                        this.zzr.zzn().zzh = true;
                    }
                }
                z11 = z10;
                while (zzar() && !this.zzD && (zzj2 = this.zzr.zzj()) != null && (zzg = zzj2.zzg()) != null && this.zzM >= zzg.zzf() && zzg.zzh) {
                    if (z11) {
                        zzR();
                    }
                    this.zzU = z10;
                    zze = this.zzr.zze();
                    zze.getClass();
                    if (this.zzz.zzb.zza.equals(zze.zzg.zza.zza)) {
                        zzuq zzuqVar = this.zzz.zzb;
                        if (zzuqVar.zzb == -1) {
                            zzuq zzuqVar2 = zze.zzg.zza;
                            if (zzuqVar2.zzb == -1 && zzuqVar.zze != zzuqVar2.zze) {
                                z12 = true;
                                zzkp zzkpVar = zze.zzg;
                                zzuq zzuqVar3 = zzkpVar.zza;
                                long j8 = zzkpVar.zzb;
                                long j9 = j3;
                                this.zzz = zzD(zzuqVar3, j8, zzkpVar.zzc, j8, !z12, 0);
                                zzX();
                                zzak();
                                if (zzao() && zze == this.zzr.zzm()) {
                                    zzlr[] zzlrVarArr6 = this.zzb;
                                    i12 = 0;
                                    for (i11 = 2; i12 < i11; i11 = 2) {
                                        zzlrVarArr6[i12].zzk();
                                        i12++;
                                    }
                                }
                                if (this.zzz.zze == 3) {
                                    zzaf();
                                }
                                zzyo zzi5 = this.zzr.zzj().zzi();
                                i10 = 0;
                                for (i9 = 2; i10 < i9; i9 = 2) {
                                    if (zzi5.zzb(i10)) {
                                        this.zzb[i10].zzh();
                                    }
                                    i10++;
                                }
                                j3 = j9;
                                z10 = false;
                                z11 = true;
                            }
                        }
                    }
                    z12 = z10;
                    zzkp zzkpVar2 = zze.zzg;
                    zzuq zzuqVar32 = zzkpVar2.zza;
                    long j82 = zzkpVar2.zzb;
                    long j92 = j3;
                    this.zzz = zzD(zzuqVar32, j82, zzkpVar2.zzc, j82, !z12, 0);
                    zzX();
                    zzak();
                    if (zzao()) {
                        zzlr[] zzlrVarArr62 = this.zzb;
                        i12 = 0;
                        while (i12 < i11) {
                        }
                    }
                    if (this.zzz.zze == 3) {
                    }
                    zzyo zzi52 = this.zzr.zzj().zzi();
                    i10 = 0;
                    while (i10 < i9) {
                    }
                    j3 = j92;
                    z10 = false;
                    z11 = true;
                }
                j = j3;
                long j10 = this.zzS.zzb;
            }
            z10 = false;
            zzn = this.zzr.zzn();
            if (zzn != null) {
                zzn2 = this.zzr.zzn();
                zzi = zzn2.zzi();
                r02 = z10;
                i13 = 1;
                while (true) {
                    zzlr[] zzlrVarArr52 = this.zzb;
                    if (r02 < 2) {
                    }
                    int zza22 = zzlrVarArr52[r02].zza();
                    int zzc2 = this.zzb[r02].zzc(zzn2, zzi, this.zzo);
                    this.zzK -= zza22 - this.zzb[r02].zza();
                    i13 &= zzc2 & 1;
                    r02++;
                }
                if (i13 != 0) {
                }
            }
            z11 = z10;
            while (zzar()) {
                if (z11) {
                }
                this.zzU = z10;
                zze = this.zzr.zze();
                zze.getClass();
                if (this.zzz.zzb.zza.equals(zze.zzg.zza.zza)) {
                }
                z12 = z10;
                zzkp zzkpVar22 = zze.zzg;
                zzuq zzuqVar322 = zzkpVar22.zza;
                long j822 = zzkpVar22.zzb;
                long j922 = j3;
                this.zzz = zzD(zzuqVar322, j822, zzkpVar22.zzc, j822, !z12, 0);
                zzX();
                zzak();
                if (zzao()) {
                }
                if (this.zzz.zze == 3) {
                }
                zzyo zzi522 = this.zzr.zzj().zzi();
                i10 = 0;
                while (i10 < i9) {
                }
                j3 = j922;
                z10 = false;
                z11 = true;
            }
            j = j3;
            long j102 = this.zzS.zzb;
        }
        int i24 = this.zzz.zze;
        if (i24 == 1 || i24 == 4) {
            return;
        }
        zzko zzj3 = this.zzr.zzj();
        if (zzj3 == null) {
            zzaa(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        zzak();
        if (zzj3.zze) {
            this.zzN = zzen.zzs(SystemClock.elapsedRealtime());
            z4 = false;
            zzj3.zza.zzi(this.zzz.zzs - this.zzn, false);
            boolean z13 = true;
            z8 = true;
            int i25 = 0;
            while (true) {
                zzlr[] zzlrVarArr7 = this.zzb;
                if (i25 >= 2) {
                    break;
                }
                zzlr zzlrVar2 = zzlrVarArr7[i25];
                if (zzlrVar2.zza() == 0) {
                    zzT(i25, false);
                } else {
                    zzlrVar2.zzo(this.zzM, this.zzN);
                    boolean z14 = z13 && zzlrVar2.zzE();
                    boolean zzA = zzlrVar2.zzA(zzj3);
                    zzT(i25, zzA);
                    boolean z15 = z8 && zzA;
                    if (!zzA) {
                        zzS(i25);
                    }
                    z8 = z15;
                    z13 = z14;
                }
                i25++;
            }
            z7 = z13;
        } else {
            z4 = false;
            zzj3.zza.zzk();
            z7 = true;
            z8 = true;
        }
        long j11 = zzj3.zzg.zze;
        if (z7 && zzj3.zze && (j11 == j || j11 <= this.zzz.zzs)) {
            if (this.zzD) {
                this.zzD = z4;
                zzad(z4, this.zzz.zzn, z4, 5);
            }
            if (zzj3.zzg.zzj) {
                zzae(4);
                zzah();
                int i26 = 2;
                if (this.zzz.zze == 2) {
                    int i27 = z4;
                    while (true) {
                        zzlr[] zzlrVarArr8 = this.zzb;
                        if (i27 >= i26) {
                            break;
                        }
                        if (zzlrVarArr8[i27].zzG(zzj3)) {
                            zzS(i27);
                        }
                        i27++;
                        i26 = 2;
                    }
                    zzle zzleVar = this.zzz;
                    if (!zzleVar.zzg && zzleVar.zzr < 500000 && zzat(this.zzr.zzi()) && zzar()) {
                        if (this.zzR == -9223372036854775807L) {
                            this.zzR = SystemClock.elapsedRealtime();
                        } else if (SystemClock.elapsedRealtime() - this.zzR >= 4000) {
                            throw new IllegalStateException("Playback stuck buffering and not loading");
                        }
                        if (zzar()) {
                            i7 = 3;
                        } else {
                            i7 = 3;
                            if (this.zzz.zze == 3) {
                                z9 = true;
                                zzle zzleVar2 = this.zzz;
                                boolean z16 = zzleVar2.zzp;
                                i8 = zzleVar2.zze;
                                if (i8 != 4 && (z9 || i8 == 2 || (i8 == i7 && this.zzK != 0))) {
                                    zzaa(uptimeMillis);
                                }
                                Trace.endSection();
                            }
                        }
                        z9 = z4;
                        zzle zzleVar22 = this.zzz;
                        boolean z162 = zzleVar22.zzp;
                        i8 = zzleVar22.zze;
                        if (i8 != 4) {
                            zzaa(uptimeMillis);
                        }
                        Trace.endSection();
                    }
                }
                this.zzR = -9223372036854775807L;
                if (zzar()) {
                }
                z9 = z4;
                zzle zzleVar222 = this.zzz;
                boolean z1622 = zzleVar222.zzp;
                i8 = zzleVar222.zze;
                if (i8 != 4) {
                }
                Trace.endSection();
            }
        }
        zzle zzleVar3 = this.zzz;
        if (zzleVar3.zze == 2) {
            if (this.zzK == 0) {
                zzj = zzap();
            } else if (z8) {
                if (zzleVar3.zzg) {
                    zzko zzj4 = this.zzr.zzj();
                    long zzb = zzas(this.zzz.zza, zzj4.zzg.zza) ? this.zzW.zzb() : j;
                    zzko zzi6 = this.zzr.zzi();
                    boolean z17 = (zzi6.zzs() && zzi6.zzg.zzj) ? true : z4;
                    boolean z18 = (!zzi6.zzg.zza.zzb() || zzi6.zze) ? z4 : true;
                    if (!z17 && !z18) {
                        zzj = this.zzg.zzj(new zzki(this.zzu, this.zzz.zza, zzj4.zzg.zza, this.zzM - zzj4.zze(), zzy(zzi6.zzc()), this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, zzb));
                    }
                }
                zzae(3);
                this.zzQ = null;
                if (zzar()) {
                    zzam(z4, z4);
                    this.zzo.zzh();
                    zzaf();
                }
                int i262 = 2;
                if (this.zzz.zze == 2) {
                }
                this.zzR = -9223372036854775807L;
                if (zzar()) {
                }
                z9 = z4;
                zzle zzleVar2222 = this.zzz;
                boolean z16222 = zzleVar2222.zzp;
                i8 = zzleVar2222.zze;
                if (i8 != 4) {
                }
                Trace.endSection();
            }
        }
        if (this.zzz.zze == 3 && (this.zzK != 0 ? !z8 : !zzap())) {
            zzam(zzar(), z4);
            zzae(2);
            if (this.zzE) {
                for (zzko zzj5 = this.zzr.zzj(); zzj5 != null; zzj5 = zzj5.zzg()) {
                    zzyh[] zzyhVarArr = zzj5.zzi().zzc;
                    int length = zzyhVarArr.length;
                    for (?? r7 = z4; r7 < length; r7++) {
                        zzyh zzyhVar = zzyhVarArr[r7];
                    }
                }
                this.zzW.zzc();
            }
            zzah();
        }
        int i2622 = 2;
        if (this.zzz.zze == 2) {
        }
        this.zzR = -9223372036854775807L;
        if (zzar()) {
        }
        z9 = z4;
        zzle zzleVar22222 = this.zzz;
        boolean z162222 = zzleVar22222.zzp;
        i8 = zzleVar22222.zze;
        if (i8 != 4) {
        }
        Trace.endSection();
    }

    private final void zzH(zzko zzkoVar, int i7, boolean z4, long j) {
        zzlr zzlrVar = this.zzb[i7];
        if (zzlrVar.zzH()) {
            return;
        }
        boolean z7 = zzkoVar == this.zzr.zzj();
        zzyo zzi = zzkoVar.zzi();
        zzlq zzlqVar = zzi.zzb[i7];
        zzyh zzyhVar = zzi.zzc[i7];
        boolean z8 = zzar() && this.zzz.zze == 3;
        boolean z9 = !z4 && z8;
        this.zzK++;
        zzlrVar.zzg(zzlqVar, zzyhVar, zzkoVar.zzc[i7], this.zzM, z9, z7, j, zzkoVar.zze(), zzkoVar.zzg.zza, this.zzo);
        zzlrVar.zzi(11, new zzjy(this), zzkoVar);
        if (z8 && z7) {
            zzlrVar.zzx();
        }
    }

    private final void zzI() {
        zzJ(new boolean[2], this.zzr.zzn().zzf());
    }

    private final void zzJ(boolean[] zArr, long j) {
        zzko zzn = this.zzr.zzn();
        zzyo zzi = zzn.zzi();
        for (int i7 = 0; i7 < 2; i7++) {
            if (!zzi.zzb(i7)) {
                this.zzb[i7].zzp();
            }
        }
        for (int i8 = 0; i8 < 2; i8++) {
            if (zzi.zzb(i8) && !this.zzb[i8].zzG(zzn)) {
                zzH(zzn, i8, zArr[i8], j);
            }
        }
    }

    private final void zzK(IOException iOException, int i7) {
        zzkr zzkrVar = this.zzr;
        zzia zzc = zzia.zzc(iOException, i7);
        zzko zzj = zzkrVar.zzj();
        if (zzj != null) {
            zzc = zzc.zza(zzj.zzg.zza);
        }
        zzdq.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzag(false, false);
        this.zzz = this.zzz.zze(zzc);
    }

    private final void zzL(boolean z4) {
        zzko zzi = this.zzr.zzi();
        zzuq zzuqVar = zzi == null ? this.zzz.zzb : zzi.zzg.zza;
        boolean equals = this.zzz.zzk.equals(zzuqVar);
        if (!equals) {
            this.zzz = this.zzz.zzb(zzuqVar);
        }
        zzle zzleVar = this.zzz;
        zzleVar.zzq = zzi == null ? zzleVar.zzs : zzi.zzc();
        this.zzz.zzr = zzx();
        if ((!equals || z4) && zzi != null && zzi.zze) {
            zzaj(zzi.zzg.zza, zzi.zzh(), zzi.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0400  */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [int] */
    /* JADX WARN: Type inference failed for: r1v88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzM(zzbn zzbnVar, boolean z4) {
        zzbl zzblVar;
        zzbm zzbmVar;
        zzuq zzuqVar;
        Object obj;
        long j;
        int i7;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        boolean z10;
        long j3;
        boolean z11;
        long j7;
        long j8;
        long j9;
        zzuq zzuqVar2;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        boolean z19;
        int i13;
        zzkd zzkdVar;
        Object obj2;
        zzkd zzkdVar2;
        boolean z20;
        zzle zzleVar = this.zzz;
        zzkd zzkdVar3 = this.zzL;
        int i14 = this.zzH;
        boolean z21 = this.zzI;
        if (zzbnVar.zzo()) {
            zzuqVar2 = zzle.zzi();
            j8 = -9223372036854775807L;
            z12 = false;
            z13 = true;
            z11 = true;
            j9 = 0;
            z14 = false;
        } else {
            zzbl zzblVar2 = this.zzm;
            zzuq zzuqVar3 = zzleVar.zzb;
            Object obj3 = zzuqVar3.zza;
            boolean zzaq = zzaq(zzleVar, zzblVar2);
            long j10 = (zzleVar.zzb.zzb() || zzaq) ? zzleVar.zzc : zzleVar.zzs;
            zzbm zzbmVar2 = this.zzl;
            if (zzkdVar3 != null) {
                zzbmVar = zzbmVar2;
                Pair zzC = zzC(zzbnVar, zzkdVar3, true, i14, z21, zzbmVar2, zzblVar2);
                if (zzC == null) {
                    i11 = zzbnVar.zzg(z21);
                    j = j10;
                    zzblVar = zzblVar2;
                    z16 = false;
                    z18 = true;
                    z17 = false;
                } else {
                    if (zzkdVar3.zzc == -9223372036854775807L) {
                        zzblVar = zzblVar2;
                        i11 = zzbnVar.zzn(zzC.first, zzblVar).zzc;
                        j = j10;
                        z15 = false;
                    } else {
                        zzblVar = zzblVar2;
                        obj3 = zzC.first;
                        j = ((Long) zzC.second).longValue();
                        i11 = -1;
                        z15 = true;
                    }
                    z16 = zzleVar.zze == 4;
                    z17 = z15;
                    z18 = false;
                }
                z8 = z18;
                z9 = z17;
                zzuqVar = zzuqVar3;
                i8 = -1;
                boolean z22 = z16;
                i7 = i11;
                obj = obj3;
                z7 = z22;
            } else {
                zzblVar = zzblVar2;
                zzbmVar = zzbmVar2;
                if (zzleVar.zza.zzo()) {
                    i9 = zzbnVar.zzg(z21);
                } else if (zzbnVar.zza(obj3) == -1) {
                    int zzb = zzb(zzbmVar, zzblVar, i14, z21, obj3, zzleVar.zza, zzbnVar);
                    if (zzb == -1) {
                        zzb = zzbnVar.zzg(z21);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i7 = zzb;
                    z8 = z10;
                    obj = obj3;
                    j = j10;
                    zzuqVar = zzuqVar3;
                    i8 = -1;
                    z7 = false;
                    z9 = false;
                } else if (j10 == -9223372036854775807L) {
                    i9 = zzbnVar.zzn(obj3, zzblVar).zzc;
                } else if (zzaq) {
                    zzuqVar = zzuqVar3;
                    zzleVar.zza.zzn(zzuqVar.zza, zzblVar);
                    if (zzleVar.zza.zze(zzblVar.zzc, zzbmVar, 0L).zzn == zzleVar.zza.zza(zzuqVar.zza)) {
                        zzbmVar = zzbmVar;
                        Pair zzl = zzbnVar.zzl(zzbmVar, zzblVar, zzbnVar.zzn(obj3, zzblVar).zzc, j10);
                        obj3 = zzl.first;
                        j = ((Long) zzl.second).longValue();
                    } else {
                        zzbmVar = zzbmVar;
                        j = j10;
                    }
                    obj = obj3;
                    i7 = -1;
                    i8 = -1;
                    z7 = false;
                    z8 = false;
                    z9 = true;
                } else {
                    zzuqVar = zzuqVar3;
                    obj = obj3;
                    j = j10;
                    i7 = -1;
                    i8 = -1;
                    z7 = false;
                    z8 = false;
                    z9 = false;
                }
                i7 = i9;
                obj = obj3;
                j = j10;
                zzuqVar = zzuqVar3;
                i8 = -1;
                z7 = false;
                z8 = false;
                z9 = false;
            }
            if (i7 != i8) {
                Pair zzl2 = zzbnVar.zzl(zzbmVar, zzblVar, i7, -9223372036854775807L);
                obj = zzl2.first;
                j3 = ((Long) zzl2.second).longValue();
                j = -9223372036854775807L;
            } else {
                j3 = j;
            }
            zzuq zzq = this.zzr.zzq(zzbnVar, obj, j3);
            int i15 = zzq.zze;
            boolean z23 = zzuqVar.zza.equals(obj) && !zzuqVar.zzb() && !zzq.zzb() && (i15 == -1 || ((i10 = zzuqVar.zze) != -1 && i15 >= i10));
            zzbl zzn = zzbnVar.zzn(obj, zzblVar);
            if (!zzaq && j10 == j && zzuqVar.zza.equals(zzq.zza)) {
                if (zzuqVar.zzb()) {
                    zzn.zzk(zzuqVar.zzb);
                }
                if (zzq.zzb()) {
                    zzn.zzk(zzq.zzb);
                }
            }
            z11 = true;
            if (true == z23) {
                zzq = zzuqVar;
            }
            if (!zzq.zzb()) {
                j7 = j3;
            } else if (zzq.equals(zzuqVar)) {
                j7 = zzleVar.zzs;
            } else {
                zzbnVar.zzn(zzq.zza, zzblVar);
                if (zzq.zzc == zzblVar.zze(zzq.zzb)) {
                    zzblVar.zzh();
                }
                j7 = 0;
            }
            j8 = j;
            j9 = j7;
            zzuqVar2 = zzq;
            z12 = z7;
            z13 = z8;
            z14 = z9;
        }
        boolean z24 = (this.zzz.zzb.equals(zzuqVar2) && j9 == this.zzz.zzs) ? false : z11;
        int i16 = 2;
        if (z13) {
            try {
                if (this.zzz.zze != z11) {
                    i12 = 4;
                    try {
                        zzae(4);
                    } catch (Throwable th) {
                        th = th;
                        i13 = 4;
                        zzkdVar = null;
                        zzle zzleVar2 = this.zzz;
                        zzal(zzbnVar, zzuqVar2, zzleVar2.zza, zzleVar2.zzb, true != z14 ? -9223372036854775807L : j9, false);
                        if (z24) {
                        }
                        zzle zzleVar3 = this.zzz;
                        obj2 = zzleVar3.zzb.zza;
                        zzbn zzbnVar2 = zzleVar3.zza;
                        if (z24) {
                        }
                        long j11 = this.zzz.zzd;
                        if (zzbnVar.zza(obj2) != -1) {
                        }
                        zzkdVar2 = zzkdVar;
                        this.zzz = zzD(zzuqVar2, j9, j8, j11, r21, i13);
                        zzX();
                        zzZ(zzbnVar, this.zzz.zza);
                        this.zzz = this.zzz.zzg(zzbnVar);
                        if (!zzbnVar.zzo()) {
                        }
                        zzL(false);
                        this.zzi.zzi(2);
                        throw th;
                    }
                } else {
                    i12 = 4;
                }
                z19 = false;
            } catch (Throwable th2) {
                th = th2;
                i12 = 4;
                z19 = false;
                i13 = i12;
                zzkdVar = null;
                zzle zzleVar22 = this.zzz;
                zzal(zzbnVar, zzuqVar2, zzleVar22.zza, zzleVar22.zzb, true != z14 ? -9223372036854775807L : j9, false);
                if (z24 && j8 == this.zzz.zzc) {
                    zzkdVar2 = zzkdVar;
                } else {
                    zzle zzleVar32 = this.zzz;
                    obj2 = zzleVar32.zzb.zza;
                    zzbn zzbnVar22 = zzleVar32.zza;
                    boolean z25 = (z24 || !z4 || zzbnVar22.zzo() || zzbnVar22.zzn(obj2, this.zzm).zzf) ? false : true;
                    long j112 = this.zzz.zzd;
                    if (zzbnVar.zza(obj2) != -1) {
                        i13 = 3;
                    }
                    zzkdVar2 = zzkdVar;
                    this.zzz = zzD(zzuqVar2, j9, j8, j112, z25, i13);
                }
                zzX();
                zzZ(zzbnVar, this.zzz.zza);
                this.zzz = this.zzz.zzg(zzbnVar);
                if (!zzbnVar.zzo()) {
                    this.zzL = zzkdVar2;
                }
                zzL(false);
                this.zzi.zzi(2);
                throw th;
            }
            try {
                zzW(false, false, false, z11);
            } catch (Throwable th3) {
                th = th3;
                i13 = i12;
                zzkdVar = null;
                zzle zzleVar222 = this.zzz;
                zzal(zzbnVar, zzuqVar2, zzleVar222.zza, zzleVar222.zzb, true != z14 ? -9223372036854775807L : j9, false);
                if (z24) {
                }
                zzle zzleVar322 = this.zzz;
                obj2 = zzleVar322.zzb.zza;
                zzbn zzbnVar222 = zzleVar322.zza;
                if (z24) {
                }
                long j1122 = this.zzz.zzd;
                if (zzbnVar.zza(obj2) != -1) {
                }
                zzkdVar2 = zzkdVar;
                this.zzz = zzD(zzuqVar2, j9, j8, j1122, z25, i13);
                zzX();
                zzZ(zzbnVar, this.zzz.zza);
                this.zzz = this.zzz.zzg(zzbnVar);
                if (!zzbnVar.zzo()) {
                }
                zzL(false);
                this.zzi.zzi(2);
                throw th;
            }
        } else {
            i12 = 4;
            z19 = false;
        }
        zzlr[] zzlrVarArr = this.zzb;
        for (?? r12 = z19; r12 < 2; r12++) {
            zzlrVarArr[r12].zzu(zzbnVar);
        }
        try {
            if (z24) {
                i13 = i12;
                z11 = z19;
                if (!zzbnVar.zzo()) {
                    for (zzko zzj = this.zzr.zzj(); zzj != null; zzj = zzj.zzg()) {
                        if (zzj.zzg.zza.equals(zzuqVar2)) {
                            zzj.zzg = this.zzr.zzp(zzbnVar, zzj.zzg);
                            zzj.zzr();
                        }
                    }
                    j9 = zzz(zzuqVar2, j9, z12);
                }
            } else {
                try {
                    i13 = i12;
                    z11 = z19;
                    try {
                        int zzb2 = this.zzr.zzb(zzbnVar, this.zzM, this.zzr.zzn() == null ? 0L : zzw(this.zzr.zzn()), (!zzao() || this.zzr.zzm() == null) ? 0L : zzw(this.zzr.zzm()));
                        if ((zzb2 & 1) != 0) {
                            try {
                                zzab(z11);
                                i16 = 2;
                            } catch (Throwable th4) {
                                th = th4;
                                zzkdVar = null;
                                zzle zzleVar2222 = this.zzz;
                                zzal(zzbnVar, zzuqVar2, zzleVar2222.zza, zzleVar2222.zzb, true != z14 ? -9223372036854775807L : j9, false);
                                if (z24) {
                                }
                                zzle zzleVar3222 = this.zzz;
                                obj2 = zzleVar3222.zzb.zza;
                                zzbn zzbnVar2222 = zzleVar3222.zza;
                                if (z24) {
                                }
                                long j11222 = this.zzz.zzd;
                                if (zzbnVar.zza(obj2) != -1) {
                                }
                                zzkdVar2 = zzkdVar;
                                this.zzz = zzD(zzuqVar2, j9, j8, j11222, z25, i13);
                                zzX();
                                zzZ(zzbnVar, this.zzz.zza);
                                this.zzz = this.zzz.zzg(zzbnVar);
                                if (!zzbnVar.zzo()) {
                                }
                                zzL(false);
                                this.zzi.zzi(2);
                                throw th;
                            }
                        } else {
                            i16 = 2;
                            if ((zzb2 & 2) != 0) {
                                zzE();
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i16 = 2;
                        zzkdVar = null;
                        zzle zzleVar22222 = this.zzz;
                        zzal(zzbnVar, zzuqVar2, zzleVar22222.zza, zzleVar22222.zzb, true != z14 ? -9223372036854775807L : j9, false);
                        if (z24) {
                        }
                        zzle zzleVar32222 = this.zzz;
                        obj2 = zzleVar32222.zzb.zza;
                        zzbn zzbnVar22222 = zzleVar32222.zza;
                        if (z24) {
                        }
                        long j112222 = this.zzz.zzd;
                        if (zzbnVar.zza(obj2) != -1) {
                        }
                        zzkdVar2 = zzkdVar;
                        this.zzz = zzD(zzuqVar2, j9, j8, j112222, z25, i13);
                        zzX();
                        zzZ(zzbnVar, this.zzz.zza);
                        this.zzz = this.zzz.zzg(zzbnVar);
                        if (!zzbnVar.zzo()) {
                        }
                        zzL(false);
                        this.zzi.zzi(2);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i13 = i12;
                    z11 = z19;
                }
            }
            zzle zzleVar4 = this.zzz;
            zzbn zzbnVar3 = zzleVar4.zza;
            zzuq zzuqVar4 = zzleVar4.zzb;
            long j12 = true != z14 ? -9223372036854775807L : j9;
            int i17 = i16;
            zzal(zzbnVar, zzuqVar2, zzbnVar3, zzuqVar4, j12, false);
            if (z24 || j8 != this.zzz.zzc) {
                zzle zzleVar5 = this.zzz;
                Object obj4 = zzleVar5.zzb.zza;
                zzbn zzbnVar4 = zzleVar5.zza;
                boolean z26 = (!z24 || !z4 || zzbnVar4.zzo() || zzbnVar4.zzn(obj4, this.zzm).zzf) ? z11 : true;
                long j13 = this.zzz.zzd;
                if (zzbnVar.zza(obj4) != -1) {
                    i13 = 3;
                }
                z20 = z11;
                this.zzz = zzD(zzuqVar2, j9, j8, j13, z26, i13);
            } else {
                z20 = z11;
            }
            zzX();
            zzZ(zzbnVar, this.zzz.zza);
            this.zzz = this.zzz.zzg(zzbnVar);
            if (!zzbnVar.zzo()) {
                this.zzL = null;
            }
            zzL(z20);
            this.zzi.zzi(i17);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private final void zzN(zzbb zzbbVar, boolean z4) {
        zzO(zzbbVar, zzbbVar.zzb, true, z4);
    }

    private final void zzO(zzbb zzbbVar, float f7, boolean z4, boolean z7) {
        int i7;
        zzkf zzkfVar = this;
        if (z4) {
            if (z7) {
                zzkfVar.zzA.zza(1);
            }
            zzle zzleVar = zzkfVar.zzz;
            zzkfVar = this;
            zzkfVar.zzz = new zzle(zzleVar.zza, zzleVar.zzb, zzleVar.zzc, zzleVar.zzd, zzleVar.zze, zzleVar.zzf, zzleVar.zzg, zzleVar.zzh, zzleVar.zzi, zzleVar.zzj, zzleVar.zzk, zzleVar.zzl, zzleVar.zzm, zzleVar.zzn, zzbbVar, zzleVar.zzq, zzleVar.zzr, zzleVar.zzs, zzleVar.zzt, false);
        }
        float f8 = zzbbVar.zzb;
        zzko zzj = zzkfVar.zzr.zzj();
        while (true) {
            i7 = 0;
            if (zzj == null) {
                break;
            }
            zzyh[] zzyhVarArr = zzj.zzi().zzc;
            int length = zzyhVarArr.length;
            while (i7 < length) {
                zzyh zzyhVar = zzyhVarArr[i7];
                i7++;
            }
            zzj = zzj.zzg();
        }
        zzlr[] zzlrVarArr = zzkfVar.zzb;
        while (i7 < 2) {
            zzlrVarArr[i7].zzt(f7, zzbbVar.zzb);
            i7++;
        }
    }

    private final void zzP() {
        long zze;
        long j;
        boolean z4;
        if (zzat(this.zzr.zzi())) {
            zzko zzi = this.zzr.zzi();
            long zzy = zzy(zzi.zzd());
            if (zzi == this.zzr.zzj()) {
                zze = this.zzM;
                j = zzi.zze();
            } else {
                zze = this.zzM - zzi.zze();
                j = zzi.zzg.zzb;
            }
            zzki zzkiVar = new zzki(this.zzu, this.zzz.zza, zzi.zzg.zza, zze - j, zzy, this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, zzas(this.zzz.zza, zzi.zzg.zza) ? this.zzW.zzb() : -9223372036854775807L);
            boolean zzh = this.zzg.zzh(zzkiVar);
            zzko zzj = this.zzr.zzj();
            if (zzh || !zzj.zze || zzy >= 500000 || this.zzn <= 0) {
                z4 = zzh;
            } else {
                zzj.zza.zzi(this.zzz.zzs, false);
                z4 = this.zzg.zzh(zzkiVar);
            }
        } else {
            z4 = false;
        }
        this.zzG = z4;
        if (z4) {
            zzko zzi2 = this.zzr.zzi();
            zzi2.getClass();
            zzkk zzkkVar = new zzkk();
            zzkkVar.zze(this.zzM - zzi2.zze());
            zzkkVar.zzf(this.zzo.zzc().zzb);
            zzkkVar.zzd(this.zzF);
            zzi2.zzk(new zzkm(zzkkVar, null));
        }
        zzai();
    }

    private final void zzQ() {
        this.zzr.zzt();
        zzko zzl = this.zzr.zzl();
        if (zzl != null) {
            if ((!zzl.zzd || zzl.zze) && !zzl.zza.zzp()) {
                if (this.zzg.zzi(this.zzz.zza, zzl.zzg.zza, zzl.zze ? zzl.zza.zzb() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzm(this, zzl.zzg.zzb);
                        return;
                    }
                    zzkk zzkkVar = new zzkk();
                    zzkkVar.zze(this.zzM - zzl.zze());
                    zzkkVar.zzf(this.zzo.zzc().zzb);
                    zzkkVar.zzd(this.zzF);
                    zzl.zzk(new zzkm(zzkkVar, null));
                }
            }
        }
    }

    private final void zzR() {
        boolean z4;
        this.zzA.zzb(this.zzz);
        z4 = this.zzA.zze;
        if (z4) {
            zziw zziwVar = this.zzV;
            zziwVar.zza.zzab(this.zzA);
            this.zzA = new zzkc(this.zzz);
        }
    }

    private final void zzS(int i7) {
        zzlr zzlrVar = this.zzb[i7];
        try {
            zzko zzj = this.zzr.zzj();
            if (zzj == null) {
                throw null;
            }
            zzlrVar.zzm(zzj);
        } catch (IOException e7) {
            e = e7;
            zzlrVar.zzb();
            throw e;
        } catch (RuntimeException e8) {
            e = e8;
            zzlrVar.zzb();
            throw e;
        }
    }

    private final void zzT(final int i7, final boolean z4) {
        boolean[] zArr = this.zzd;
        if (zArr[i7] != z4) {
            zArr[i7] = z4;
            this.zzw.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjv
                @Override // java.lang.Runnable
                public final void run() {
                    r0.zzv.zzJ(r1, zzkf.this.zzb[i7].zzb(), z4);
                }
            });
        }
    }

    private final void zzU() {
        int i7;
        boolean z4;
        float f7 = this.zzo.zzc().zzb;
        zzkr zzkrVar = this.zzr;
        zzko zzj = zzkrVar.zzj();
        zzko zzn = zzkrVar.zzn();
        zzyo zzyoVar = null;
        boolean z7 = true;
        while (zzj != null && zzj.zze) {
            zzle zzleVar = this.zzz;
            zzyo zzj2 = zzj.zzj(f7, zzleVar.zza, zzleVar.zzl);
            zzyo zzyoVar2 = zzj == this.zzr.zzj() ? zzj2 : zzyoVar;
            zzyo zzi = zzj.zzi();
            boolean z8 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj2.zzc.length) {
                    for (int i8 = 0; i8 < zzj2.zzc.length; i8++) {
                        if (zzj2.zza(zzi, i8)) {
                        }
                    }
                    if (zzj != zzn) {
                        z8 = true;
                    }
                    z7 &= z8;
                    zzj = zzj.zzg();
                    zzyoVar = zzyoVar2;
                }
            }
            if (z7) {
                zzkr zzkrVar2 = this.zzr;
                zzko zzj3 = zzkrVar2.zzj();
                int zza2 = zzkrVar2.zza(zzj3) & 1;
                boolean[] zArr = new boolean[2];
                zzyoVar2.getClass();
                long zzb = zzj3.zzb(zzyoVar2, this.zzz.zzs, 1 == zza2, zArr);
                zzle zzleVar2 = this.zzz;
                boolean z9 = (zzleVar2.zze == 4 || zzb == zzleVar2.zzs) ? false : true;
                zzle zzleVar3 = this.zzz;
                i7 = 2;
                this.zzz = zzD(zzleVar3.zzb, zzb, zzleVar3.zzc, zzleVar3.zzd, z9, 5);
                if (z9) {
                    zzY(zzb);
                }
                zzE();
                boolean[] zArr2 = new boolean[2];
                int i9 = 0;
                while (true) {
                    zzlr[] zzlrVarArr = this.zzb;
                    if (i9 >= 2) {
                        break;
                    }
                    int zza3 = zzlrVarArr[i9].zza();
                    zArr2[i9] = this.zzb[i9].zzH();
                    this.zzb[i9].zzj(zzj3.zzc[i9], this.zzo, this.zzM, zArr[i9]);
                    if (zza3 - this.zzb[i9].zza() > 0) {
                        zzT(i9, false);
                    }
                    this.zzK -= zza3 - this.zzb[i9].zza();
                    i9++;
                }
                zzJ(zArr2, this.zzM);
                z4 = true;
                zzj3.zzh = true;
            } else {
                i7 = 2;
                this.zzr.zza(zzj);
                if (zzj.zze) {
                    long max = Math.max(zzj.zzg.zzb, this.zzM - zzj.zze());
                    if (this.zzx && zzao() && this.zzr.zzm() == zzj) {
                        zzE();
                    }
                    zzj.zza(zzj2, max, false);
                }
                z4 = true;
            }
            zzL(z4);
            if (this.zzz.zze != 4) {
                zzP();
                zzak();
                this.zzi.zzi(i7);
                return;
            }
            return;
        }
    }

    private final void zzV() {
        zzU();
        zzab(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r2.equals(r34.zzz.zzb) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzW(boolean z4, boolean z7, boolean z8, boolean z9) {
        zzbn zzbnVar;
        zzuq zzuqVar;
        this.zzi.zzf(2);
        this.zzQ = null;
        boolean z10 = true;
        zzam(false, true);
        this.zzo.zzi();
        this.zzM = 1000000000000L;
        try {
            zzF();
        } catch (zzia | RuntimeException e7) {
            zzdq.zzd("ExoPlayerImplInternal", "Disable failed.", e7);
        }
        if (z4) {
            zzlr[] zzlrVarArr = this.zzb;
            for (int i7 = 0; i7 < 2; i7++) {
                try {
                    zzlrVarArr[i7].zzp();
                } catch (RuntimeException e8) {
                    zzdq.zzd("ExoPlayerImplInternal", "Reset failed.", e8);
                }
            }
        }
        this.zzK = 0;
        zzle zzleVar = this.zzz;
        zzuq zzuqVar2 = zzleVar.zzb;
        long j = zzleVar.zzs;
        long j3 = (this.zzz.zzb.zzb() || zzaq(this.zzz, this.zzm)) ? this.zzz.zzc : this.zzz.zzs;
        if (z7) {
            this.zzL = null;
            Pair zzB = zzB(this.zzz.zza);
            zzuqVar2 = (zzuq) zzB.first;
            j = ((Long) zzB.second).longValue();
            j3 = -9223372036854775807L;
        }
        z10 = false;
        long j7 = j;
        long j8 = j3;
        this.zzr.zzs();
        this.zzG = false;
        zzbn zzbnVar2 = this.zzz.zza;
        if (z8 && (zzbnVar2 instanceof zzlk)) {
            zzbnVar2 = ((zzlk) zzbnVar2).zzx(this.zzs.zzq());
            if (zzuqVar2.zzb != -1) {
                zzbnVar2.zzn(zzuqVar2.zza, this.zzm);
                zzbl zzblVar = this.zzm;
                zzbm zzbmVar = this.zzl;
                zzbnVar2.zze(zzblVar.zzc, zzbmVar, 0L);
                if (zzbmVar.zzb()) {
                    zzbnVar = zzbnVar2;
                    zzuqVar = new zzuq(zzuqVar2.zza, zzuqVar2.zzd);
                    zzle zzleVar2 = this.zzz;
                    int i8 = zzleVar2.zze;
                    zzia zziaVar = z9 ? null : zzleVar2.zzf;
                    zzwv zzwvVar = !z10 ? zzwv.zza : zzleVar2.zzh;
                    zzyo zzyoVar = !z10 ? this.zzf : zzleVar2.zzi;
                    List zzn = !z10 ? zzfwh.zzn() : zzleVar2.zzj;
                    zzle zzleVar3 = this.zzz;
                    this.zzz = new zzle(zzbnVar, zzuqVar, j8, j7, i8, zziaVar, false, zzwvVar, zzyoVar, zzn, zzuqVar, zzleVar3.zzl, zzleVar3.zzm, zzleVar3.zzn, zzleVar3.zzo, j7, 0L, j7, 0L, false);
                    if (z8) {
                        return;
                    }
                    this.zzr.zzv();
                    this.zzs.zzh();
                    return;
                }
            }
        }
        zzbnVar = zzbnVar2;
        zzuqVar = zzuqVar2;
        zzle zzleVar22 = this.zzz;
        int i82 = zzleVar22.zze;
        zzia zziaVar2 = z9 ? null : zzleVar22.zzf;
        zzwv zzwvVar2 = !z10 ? zzwv.zza : zzleVar22.zzh;
        zzyo zzyoVar2 = !z10 ? this.zzf : zzleVar22.zzi;
        List zzn2 = !z10 ? zzfwh.zzn() : zzleVar22.zzj;
        zzle zzleVar32 = this.zzz;
        this.zzz = new zzle(zzbnVar, zzuqVar, j8, j7, i82, zziaVar2, false, zzwvVar2, zzyoVar2, zzn2, zzuqVar, zzleVar32.zzl, zzleVar32.zzm, zzleVar32.zzn, zzleVar32.zzo, j7, 0L, j7, 0L, false);
        if (z8) {
        }
    }

    private final void zzX() {
        zzko zzj = this.zzr.zzj();
        boolean z4 = false;
        if (zzj != null && zzj.zzg.zzi && this.zzC) {
            z4 = true;
        }
        this.zzD = z4;
    }

    private final void zzY(long j) {
        zzko zzj = this.zzr.zzj();
        long zze = j + (zzj == null ? 1000000000000L : zzj.zze());
        this.zzM = zze;
        this.zzo.zzf(zze);
        zzlr[] zzlrVarArr = this.zzb;
        for (int i7 = 0; i7 < 2; i7++) {
            zzlrVarArr[i7].zzq(zzj, this.zzM);
        }
        for (zzko zzj2 = this.zzr.zzj(); zzj2 != null; zzj2 = zzj2.zzg()) {
            for (zzyh zzyhVar : zzj2.zzi().zzc) {
            }
        }
    }

    private final void zzZ(zzbn zzbnVar, zzbn zzbnVar2) {
        if (zzbnVar.zzo() && zzbnVar2.zzo()) {
            return;
        }
        int size = this.zzp.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzp);
        } else {
            Object obj = ((zzkb) this.zzp.get(size)).zzb;
            int i7 = zzen.zza;
            throw null;
        }
    }

    private final void zzaa(long j) {
        this.zzi.zzj(2, j + ((this.zzz.zze != 3 || zzar()) ? zza : 1000L));
    }

    private final void zzab(boolean z4) {
        zzuq zzuqVar = this.zzr.zzj().zzg.zza;
        long zzA = zzA(zzuqVar, this.zzz.zzs, true, false);
        if (zzA != this.zzz.zzs) {
            zzle zzleVar = this.zzz;
            this.zzz = zzD(zzuqVar, zzA, zzleVar.zzc, zzleVar.zzd, z4, 5);
        }
    }

    private final void zzac(zzbb zzbbVar) {
        this.zzi.zzf(16);
        this.zzo.zzg(zzbbVar);
    }

    private final void zzad(boolean z4, int i7, boolean z7, int i8) {
        this.zzA.zza(z7 ? 1 : 0);
        this.zzz = this.zzz.zzd(z4, i8, i7);
        zzam(false, false);
        for (zzko zzj = this.zzr.zzj(); zzj != null; zzj = zzj.zzg()) {
            for (zzyh zzyhVar : zzj.zzi().zzc) {
            }
        }
        if (!zzar()) {
            zzah();
            zzak();
            this.zzr.zzu(this.zzM);
            return;
        }
        int i9 = this.zzz.zze;
        if (i9 == 3) {
            this.zzo.zzh();
            zzaf();
            this.zzi.zzi(2);
        } else if (i9 == 2) {
            this.zzi.zzi(2);
        }
    }

    private final void zzae(int i7) {
        zzle zzleVar = this.zzz;
        if (zzleVar.zze != i7) {
            if (i7 != 2) {
                this.zzR = -9223372036854775807L;
            }
            this.zzz = zzleVar.zzf(i7);
        }
    }

    private final void zzaf() {
        zzko zzj = this.zzr.zzj();
        if (zzj == null) {
            return;
        }
        zzyo zzi = zzj.zzi();
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzi.zzb(i7)) {
                this.zzb[i7].zzx();
            }
        }
    }

    private final void zzag(boolean z4, boolean z7) {
        zzW(z4 || !this.zzJ, false, true, false);
        this.zzA.zza(z7 ? 1 : 0);
        this.zzg.zze(this.zzu);
        zzae(1);
    }

    private final void zzah() {
        this.zzo.zzi();
        int i7 = 0;
        while (true) {
            zzlr[] zzlrVarArr = this.zzb;
            if (i7 >= 2) {
                return;
            }
            zzlrVarArr[i7].zzz();
            i7++;
        }
    }

    private final void zzai() {
        zzko zzi = this.zzr.zzi();
        boolean z4 = true;
        if (!this.zzG && (zzi == null || !zzi.zza.zzp())) {
            z4 = false;
        }
        zzle zzleVar = this.zzz;
        if (z4 != zzleVar.zzg) {
            this.zzz = zzleVar.zza(z4);
        }
    }

    private final void zzaj(zzuq zzuqVar, zzwv zzwvVar, zzyo zzyoVar) {
        long zze;
        long j;
        zzko zzi = this.zzr.zzi();
        zzi.getClass();
        if (zzi == this.zzr.zzj()) {
            zze = this.zzM;
            j = zzi.zze();
        } else {
            zze = this.zzM - zzi.zze();
            j = zzi.zzg.zzb;
        }
        this.zzg.zzf(new zzki(this.zzu, this.zzz.zza, zzuqVar, zze - j, zzy(zzi.zzc()), this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, zzas(this.zzz.zza, zzi.zzg.zza) ? this.zzW.zzb() : -9223372036854775807L), zzwvVar, zzyoVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ae, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzak() {
        zzkb zzkbVar;
        zzko zzj = this.zzr.zzj();
        if (zzj == null) {
            return;
        }
        long zzd = zzj.zze ? zzj.zza.zzd() : -9223372036854775807L;
        if (zzd != -9223372036854775807L) {
            if (!zzj.zzs()) {
                this.zzr.zza(zzj);
                zzL(false);
                zzP();
            }
            zzY(zzd);
            if (zzd != this.zzz.zzs) {
                zzle zzleVar = this.zzz;
                this.zzz = zzD(zzleVar.zzb, zzd, zzleVar.zzc, zzd, true, 5);
            }
        } else {
            long zzb = this.zzo.zzb(zzj != this.zzr.zzn());
            this.zzM = zzb;
            long zze = zzb - zzj.zze();
            long j = this.zzz.zzs;
            if (!this.zzp.isEmpty() && !this.zzz.zzb.zzb()) {
                if (this.zzP) {
                    j--;
                    this.zzP = false;
                }
                zzle zzleVar2 = this.zzz;
                int zza2 = zzleVar2.zza.zza(zzleVar2.zzb.zza);
                int min = Math.min(this.zzO, this.zzp.size());
                if (min > 0) {
                    zzkbVar = (zzkb) this.zzp.get(min - 1);
                    while (zzkbVar != null && (zza2 < 0 || (zza2 == 0 && j < 0))) {
                        int i7 = min - 1;
                        if (i7 > 0) {
                            zzkbVar = (zzkb) this.zzp.get(min - 2);
                            min = i7;
                        } else {
                            min = i7;
                        }
                    }
                    if (min < this.zzp.size()) {
                    }
                    this.zzO = min;
                }
                zzkbVar = null;
            }
            if (this.zzo.zzj()) {
                boolean z4 = !this.zzA.zzc;
                zzle zzleVar3 = this.zzz;
                this.zzz = zzD(zzleVar3.zzb, zze, zzleVar3.zzc, zze, z4, 6);
            } else {
                zzle zzleVar4 = this.zzz;
                zzleVar4.zzs = zze;
                zzleVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzz.zzq = this.zzr.zzi().zzc();
        this.zzz.zzr = zzx();
        zzle zzleVar5 = this.zzz;
        if (zzleVar5.zzl && zzleVar5.zze == 3 && zzas(zzleVar5.zza, zzleVar5.zzb)) {
            zzle zzleVar6 = this.zzz;
            if (zzleVar6.zzo.zzb == 1.0f) {
                float zza3 = this.zzW.zza(zzv(zzleVar6.zza, zzleVar6.zzb.zza, zzleVar6.zzs), this.zzz.zzr);
                if (this.zzo.zzc().zzb != zza3) {
                    zzac(new zzbb(zza3, this.zzz.zzo.zzc));
                    zzO(this.zzz.zzo, this.zzo.zzc().zzb, false, false);
                }
            }
        }
    }

    private final void zzal(zzbn zzbnVar, zzuq zzuqVar, zzbn zzbnVar2, zzuq zzuqVar2, long j, boolean z4) {
        if (!zzas(zzbnVar, zzuqVar)) {
            zzbb zzbbVar = zzuqVar.zzb() ? zzbb.zza : this.zzz.zzo;
            if (this.zzo.zzc().equals(zzbbVar)) {
                return;
            }
            zzac(zzbbVar);
            zzO(this.zzz.zzo, zzbbVar.zzb, false, false);
            return;
        }
        zzbnVar.zze(zzbnVar.zzn(zzuqVar.zza, this.zzm).zzc, this.zzl, 0L);
        zzht zzhtVar = this.zzW;
        zzaj zzajVar = this.zzl.zzj;
        int i7 = zzen.zza;
        zzhtVar.zzd(zzajVar);
        if (j != -9223372036854775807L) {
            this.zzW.zze(zzv(zzbnVar, zzuqVar.zza, j));
            return;
        }
        if (!Objects.equals(!zzbnVar2.zzo() ? zzbnVar2.zze(zzbnVar2.zzn(zzuqVar2.zza, this.zzm).zzc, this.zzl, 0L).zzb : null, this.zzl.zzb) || z4) {
            this.zzW.zze(-9223372036854775807L);
        }
    }

    private final void zzam(boolean z4, boolean z7) {
        this.zzE = z4;
        long j = -9223372036854775807L;
        if (z4 && !z7) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzF = j;
    }

    private final synchronized void zzan(zzftz zzftzVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z4 = false;
        while (!((Boolean) zzftzVar.zza()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzao() {
        if (!this.zzx) {
            return false;
        }
        zzlr[] zzlrVarArr = this.zzb;
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzlrVarArr[i7].zzF()) {
                return true;
            }
        }
        return false;
    }

    private final boolean zzap() {
        zzko zzj = this.zzr.zzj();
        long j = zzj.zzg.zze;
        if (!zzj.zze) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzz.zzs < j) {
            return true;
        }
        return !zzar();
    }

    private static boolean zzaq(zzle zzleVar, zzbl zzblVar) {
        zzuq zzuqVar = zzleVar.zzb;
        zzbn zzbnVar = zzleVar.zza;
        return zzbnVar.zzo() || zzbnVar.zzn(zzuqVar.zza, zzblVar).zzf;
    }

    private final boolean zzar() {
        zzle zzleVar = this.zzz;
        return zzleVar.zzl && zzleVar.zzn == 0;
    }

    private final boolean zzas(zzbn zzbnVar, zzuq zzuqVar) {
        if (!zzuqVar.zzb() && !zzbnVar.zzo()) {
            zzbnVar.zze(zzbnVar.zzn(zzuqVar.zza, this.zzm).zzc, this.zzl, 0L);
            if (this.zzl.zzb()) {
                zzbm zzbmVar = this.zzl;
                if (zzbmVar.zzi && zzbmVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean zzat(zzko zzkoVar) {
        if (zzkoVar != null) {
            try {
                if (zzkoVar.zze) {
                    zzwk[] zzwkVarArr = zzkoVar.zzc;
                    for (int i7 = 0; i7 < 2; i7++) {
                        zzwk zzwkVar = zzwkVarArr[i7];
                        if (zzwkVar != null) {
                            zzwkVar.zzd();
                        }
                    }
                } else {
                    zzkoVar.zza.zzk();
                }
                if (zzkoVar.zzd() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static final void zzau(zzli zzliVar) {
        zzliVar.zzi();
        try {
            zzliVar.zzc().zzu(zzliVar.zza(), zzliVar.zzg());
        } finally {
            zzliVar.zzh(true);
        }
    }

    public static int zzb(zzbm zzbmVar, zzbl zzblVar, int i7, boolean z4, Object obj, zzbn zzbnVar, zzbn zzbnVar2) {
        Object obj2 = zzbnVar.zze(zzbnVar.zzn(obj, zzblVar).zzc, zzbmVar, 0L).zzb;
        for (int i8 = 0; i8 < zzbnVar2.zzc(); i8++) {
            if (zzbnVar2.zze(i8, zzbmVar, 0L).zzb.equals(obj2)) {
                return i8;
            }
        }
        int zza2 = zzbnVar.zza(obj);
        int zzb = zzbnVar.zzb();
        int i9 = zza2;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            if (i10 >= zzb || i11 != -1) {
                break;
            }
            i9 = zzbnVar.zzi(i9, zzblVar, zzbmVar, i7, z4);
            if (i9 == -1) {
                i11 = -1;
                break;
            }
            i11 = zzbnVar2.zza(zzbnVar.zzf(i9));
            i10++;
        }
        if (i11 == -1) {
            return -1;
        }
        return zzbnVar2.zzd(i11, zzblVar, false).zzc;
    }

    public static /* synthetic */ zzko zzd(zzkf zzkfVar, zzkp zzkpVar, long j) {
        zzyw zzk = zzkfVar.zzg.zzk();
        long j3 = zzkfVar.zzS.zzb;
        zzyo zzyoVar = zzkfVar.zzf;
        zzld zzldVar = zzkfVar.zzs;
        return new zzko(zzkfVar.zzc, j, zzkfVar.zze, zzk, zzldVar, zzkpVar, zzyoVar, -9223372036854775807L);
    }

    public static /* synthetic */ void zzf(zzkf zzkfVar, zzli zzliVar) {
        try {
            zzau(zzliVar);
        } catch (zzia e7) {
            zzdq.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    private final long zzv(zzbn zzbnVar, Object obj, long j) {
        zzbnVar.zze(zzbnVar.zzn(obj, this.zzm).zzc, this.zzl, 0L);
        zzbm zzbmVar = this.zzl;
        if (zzbmVar.zzf != -9223372036854775807L && zzbmVar.zzb()) {
            zzbm zzbmVar2 = this.zzl;
            if (zzbmVar2.zzi) {
                long j3 = zzbmVar2.zzg;
                int i7 = zzen.zza;
                return zzen.zzs((j3 == -9223372036854775807L ? System.currentTimeMillis() : j3 + SystemClock.elapsedRealtime()) - this.zzl.zzf) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzw(zzko zzkoVar) {
        if (zzkoVar == null) {
            return 0L;
        }
        long zze = zzkoVar.zze();
        if (zzkoVar.zze) {
            int i7 = 0;
            while (true) {
                zzlr[] zzlrVarArr = this.zzb;
                if (i7 >= 2) {
                    break;
                }
                if (zzlrVarArr[i7].zzG(zzkoVar)) {
                    long zzd = this.zzb[i7].zzd(zzkoVar);
                    if (zzd == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zze = Math.max(zzd, zze);
                }
                i7++;
            }
        }
        return zze;
    }

    private final long zzx() {
        return zzy(this.zzz.zzq);
    }

    private final long zzy(long j) {
        zzko zzi = this.zzr.zzi();
        if (zzi == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzM - zzi.zze()));
    }

    private final long zzz(zzuq zzuqVar, long j, boolean z4) {
        zzkr zzkrVar = this.zzr;
        return zzA(zzuqVar, j, zzkrVar.zzj() != zzkrVar.zzn(), z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x069e  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z4;
        RuntimeException runtimeException;
        IOException iOException;
        IOException iOException2;
        zzrj zzrjVar;
        zzia zziaVar;
        zzfy zzfyVar;
        zzaz zzazVar;
        int i7;
        zzia zziaVar2;
        zzia zziaVar3;
        int i8;
        zzko zzn;
        long j;
        long j3;
        zzuq zzuqVar;
        boolean z7;
        Throwable th;
        long j7;
        long j8;
        long zzz;
        long j9;
        zzle zzleVar;
        int i9;
        zzle zzD;
        int i10;
        List list;
        zzwn zzwnVar;
        List list2;
        zzwn zzwnVar2;
        int i11;
        long j10;
        List list3;
        zzwn zzwnVar3;
        try {
        } catch (zzaz e7) {
            e = e7;
            z4 = true;
        } catch (zzfy e8) {
            e = e8;
            z4 = true;
        } catch (zzia e9) {
            e = e9;
            z4 = true;
        } catch (zzrj e10) {
            e = e10;
            z4 = true;
        } catch (zztq e11) {
            e = e11;
            z4 = true;
        } catch (IOException e12) {
            e = e12;
            z4 = true;
        } catch (RuntimeException e13) {
            e = e13;
            z4 = true;
        }
        try {
            try {
            } catch (zzaz e14) {
                zzazVar = e14;
                z4 = true;
                zzK(zzazVar, zzazVar.zzb != z4 ? z4 != zzazVar.zza ? 3003 : 3001 : zzbbd.zzq.zzf);
                zzR();
                return z4;
            } catch (zzfy e15) {
                zzfyVar = e15;
                z4 = true;
                zzK(zzfyVar, zzfyVar.zza);
                zzR();
                return z4;
            } catch (zzia e16) {
                zziaVar = e16;
                z4 = true;
                if (zziaVar.zzc == z4 && (zzn = this.zzr.zzn()) != null && zziaVar.zzh == null) {
                    zzlr[] zzlrVarArr = this.zzb;
                    int i12 = zziaVar.zze;
                    zziaVar = zziaVar.zza((zzlrVarArr[i12 % 2].zzI(i12) || zzn.zzg() == null) ? zzn.zzg.zza : zzn.zzg().zzg.zza);
                }
                if (zziaVar.zzi || !(this.zzQ == null || (i8 = zziaVar.zza) == 5004 || i8 == 5003)) {
                    if (zziaVar.zzc == z4) {
                        zzlr[] zzlrVarArr2 = this.zzb;
                        int i13 = zziaVar.zze;
                        if (zzlrVarArr2[i13 % 2].zzI(i13)) {
                            this.zzU = z4;
                            zzE();
                            zzkr zzkrVar = this.zzr;
                            zzko zzm = zzkrVar.zzm();
                            zzko zzj = zzkrVar.zzj();
                            if (zzkrVar.zzj() != zzm) {
                                while (zzj != null && zzj.zzg() != zzm) {
                                    zzj = zzj.zzg();
                                }
                            }
                            this.zzr.zza(zzj);
                            if (this.zzz.zze != 4) {
                                zzP();
                                this.zzi.zzi(2);
                            }
                        }
                    }
                    zziaVar2 = this.zzQ;
                    if (zziaVar2 != null) {
                        zziaVar2.addSuppressed(zziaVar);
                        zziaVar = this.zzQ;
                    }
                    zziaVar3 = zziaVar;
                    zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar3);
                    if (zziaVar3.zzc == z4) {
                        zzkr zzkrVar2 = this.zzr;
                        if (zzkrVar2.zzj() != zzkrVar2.zzn()) {
                            while (true) {
                                zzkr zzkrVar3 = this.zzr;
                                if (zzkrVar3.zzj() != zzkrVar3.zzn()) {
                                    this.zzr.zze();
                                } else {
                                    zzko zzj2 = this.zzr.zzj();
                                    zzj2.getClass();
                                    zzR();
                                    zzkp zzkpVar = zzj2.zzg;
                                    zzuq zzuqVar2 = zzkpVar.zza;
                                    long j11 = zzkpVar.zzb;
                                    this.zzz = zzD(zzuqVar2, j11, zzkpVar.zzc, j11, true, 0);
                                }
                            }
                        }
                    }
                    zzag(z4, false);
                    this.zzz = this.zzz.zze(zziaVar3);
                } else {
                    zzdq.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zziaVar);
                    zzia zziaVar4 = this.zzQ;
                    if (zziaVar4 != null) {
                        zziaVar4.addSuppressed(zziaVar);
                        zziaVar = this.zzQ;
                    } else {
                        this.zzQ = zziaVar;
                    }
                    zzdj zzdjVar = this.zzi;
                    zzdjVar.zzk(zzdjVar.zzc(25, zziaVar));
                }
                zzR();
                return z4;
            } catch (zzrj e17) {
                zzrjVar = e17;
                z4 = true;
                zzK(zzrjVar, zzrjVar.zza);
                zzR();
                return z4;
            } catch (zztq e18) {
                iOException2 = e18;
                z4 = true;
                zzK(iOException2, 1002);
                zzR();
                return z4;
            } catch (IOException e19) {
                iOException = e19;
                z4 = true;
                zzK(iOException, 2000);
                zzR();
                return z4;
            } catch (RuntimeException e20) {
                runtimeException = e20;
                z4 = true;
                i7 = 1004;
                if (!(runtimeException instanceof IllegalStateException) && !(runtimeException instanceof IllegalArgumentException)) {
                    i7 = zzbbd.zzq.zzf;
                }
                zzia zzd = zzia.zzd(runtimeException, i7);
                zzdq.zzd("ExoPlayerImplInternal", "Playback error", zzd);
                zzag(z4, false);
                this.zzz = this.zzz.zze(zzd);
                zzR();
                return z4;
            }
        } catch (zzaz e21) {
            e = e21;
            zzazVar = e;
            zzK(zzazVar, zzazVar.zzb != z4 ? z4 != zzazVar.zza ? 3003 : 3001 : zzbbd.zzq.zzf);
            zzR();
            return z4;
        } catch (zzfy e22) {
            e = e22;
            zzfyVar = e;
            zzK(zzfyVar, zzfyVar.zza);
            zzR();
            return z4;
        } catch (zzia e23) {
            e = e23;
            zziaVar = e;
            if (zziaVar.zzc == z4) {
                zzlr[] zzlrVarArr3 = this.zzb;
                int i122 = zziaVar.zze;
                zziaVar = zziaVar.zza((zzlrVarArr3[i122 % 2].zzI(i122) || zzn.zzg() == null) ? zzn.zzg.zza : zzn.zzg().zzg.zza);
            }
            if (zziaVar.zzi) {
            }
            if (zziaVar.zzc == z4) {
            }
            zziaVar2 = this.zzQ;
            if (zziaVar2 != null) {
            }
            zziaVar3 = zziaVar;
            zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar3);
            if (zziaVar3.zzc == z4) {
            }
            zzag(z4, false);
            this.zzz = this.zzz.zze(zziaVar3);
            zzR();
            return z4;
        } catch (zzrj e24) {
            e = e24;
            zzrjVar = e;
            zzK(zzrjVar, zzrjVar.zza);
            zzR();
            return z4;
        } catch (zztq e25) {
            e = e25;
            iOException2 = e;
            zzK(iOException2, 1002);
            zzR();
            return z4;
        } catch (IOException e26) {
            e = e26;
            iOException = e;
            zzK(iOException, 2000);
            zzR();
            return z4;
        } catch (RuntimeException e27) {
            e = e27;
            runtimeException = e;
            i7 = 1004;
            if (!(runtimeException instanceof IllegalStateException)) {
                i7 = zzbbd.zzq.zzf;
            }
            zzia zzd2 = zzia.zzd(runtimeException, i7);
            zzdq.zzd("ExoPlayerImplInternal", "Playback error", zzd2);
            zzag(z4, false);
            this.zzz = this.zzz.zze(zzd2);
            zzR();
            return z4;
        }
        switch (message.what) {
            case 1:
                z4 = true;
                boolean z8 = message.arg1 != 0;
                int i14 = message.arg2;
                zzad(z8, i14 >> 4, true, i14 & 15);
                zzR();
                return z4;
            case 2:
                z4 = true;
                zzG();
                zzR();
                return z4;
            case 3:
                z4 = true;
                zzkd zzkdVar = (zzkd) message.obj;
                this.zzA.zza(1);
                Pair zzC = zzC(this.zzz.zza, zzkdVar, true, this.zzH, this.zzI, this.zzl, this.zzm);
                if (zzC == null) {
                    Pair zzB = zzB(this.zzz.zza);
                    zzuqVar = (zzuq) zzB.first;
                    long longValue = ((Long) zzB.second).longValue();
                    z7 = !this.zzz.zza.zzo();
                    j = -9223372036854775807L;
                    j3 = longValue;
                } else {
                    Object obj = zzC.first;
                    long longValue2 = ((Long) zzC.second).longValue();
                    long j12 = zzkdVar.zzc == -9223372036854775807L ? -9223372036854775807L : longValue2;
                    zzuq zzq = this.zzr.zzq(this.zzz.zza, obj, longValue2);
                    if (zzq.zzb()) {
                        this.zzz.zza.zzn(zzq.zza, this.zzm);
                        if (this.zzm.zze(zzq.zzb) == zzq.zzc) {
                            this.zzm.zzh();
                        }
                        j = j12;
                        zzuqVar = zzq;
                        z7 = true;
                        j3 = 0;
                    } else {
                        j = j12;
                        j3 = longValue2;
                        zzuqVar = zzq;
                        z7 = zzkdVar.zzc == -9223372036854775807L;
                    }
                }
                try {
                    if (this.zzz.zza.zzo()) {
                        this.zzL = zzkdVar;
                    } else if (zzC == null) {
                        if (this.zzz.zze != 1) {
                            zzae(4);
                        }
                        zzW(false, true, false, true);
                    } else {
                        try {
                            if (zzuqVar.equals(this.zzz.zzb)) {
                                zzko zzj3 = this.zzr.zzj();
                                j8 = (zzj3 == null || !zzj3.zze || j3 == 0) ? j3 : zzj3.zza.zza(j3, this.zzy);
                                if (zzen.zzv(j8) == zzen.zzv(this.zzz.zzs) && ((i9 = (zzleVar = this.zzz).zze) == 2 || i9 == 3)) {
                                    long j13 = zzleVar.zzs;
                                    zzD = zzD(zzuqVar, j13, j, j13, z7, 2);
                                    this.zzz = zzD;
                                    zzR();
                                    return z4;
                                }
                            } else {
                                j8 = j3;
                            }
                            zzle zzleVar2 = this.zzz;
                            zzbn zzbnVar = zzleVar2.zza;
                            zzal(zzbnVar, zzuqVar, zzbnVar, zzleVar2.zzb, j, true);
                            j9 = zzz;
                            zzD = zzD(zzuqVar, j9, j, j9, z7, 2);
                            this.zzz = zzD;
                            zzR();
                            return z4;
                        } catch (Throwable th2) {
                            th = th2;
                            j7 = zzz;
                            this.zzz = zzD(zzuqVar, j7, j, j7, z7, 2);
                            throw th;
                        }
                        zzz = zzz(zzuqVar, j8, this.zzz.zze == 4);
                        z7 |= j3 != zzz;
                    }
                    j9 = j3;
                    zzD = zzD(zzuqVar, j9, j, j9, z7, 2);
                    this.zzz = zzD;
                    zzR();
                    return z4;
                } catch (Throwable th3) {
                    th = th3;
                    j7 = j3;
                }
                break;
            case 4:
                z4 = true;
                zzac((zzbb) message.obj);
                zzN(this.zzo.zzc(), true);
                zzR();
                return z4;
            case 5:
                z4 = true;
                this.zzy = (zzls) message.obj;
                zzR();
                return z4;
            case 6:
                z4 = true;
                zzag(false, true);
                zzR();
                return z4;
            case 7:
                try {
                    zzW(true, false, true, false);
                    for (int i15 = 0; i15 < 2; i15++) {
                        this.zzc[i15].zzq();
                        this.zzb[i15].zzn();
                    }
                    this.zzg.zzd(this.zzu);
                    this.zze.zzj();
                    zzae(1);
                    this.zzj.zzb();
                    synchronized (this) {
                        this.zzB = true;
                        notifyAll();
                    }
                    return true;
                } catch (Throwable th4) {
                    this.zzj.zzb();
                    synchronized (this) {
                        this.zzB = true;
                        notifyAll();
                        throw th4;
                    }
                }
            case 8:
                zzuo zzuoVar = (zzuo) message.obj;
                if (this.zzr.zzy(zzuoVar)) {
                    zzko zzi = this.zzr.zzi();
                    if (zzi == null) {
                        throw null;
                    }
                    if (!zzi.zze) {
                        float f7 = this.zzo.zzc().zzb;
                        zzle zzleVar3 = this.zzz;
                        zzi.zzl(f7, zzleVar3.zza, zzleVar3.zzl);
                    }
                    zzaj(zzi.zzg.zza, zzi.zzh(), zzi.zzi());
                    if (zzi == this.zzr.zzj()) {
                        zzY(zzi.zzg.zzb);
                        zzI();
                        zzi.zzh = true;
                        zzle zzleVar4 = this.zzz;
                        zzuq zzuqVar3 = zzleVar4.zzb;
                        long j14 = zzi.zzg.zzb;
                        z4 = true;
                        this.zzz = zzD(zzuqVar3, j14, zzleVar4.zzc, j14, false, 5);
                    } else {
                        z4 = true;
                    }
                    zzP();
                } else {
                    z4 = true;
                    zzko zzk = this.zzr.zzk(zzuoVar);
                    if (zzk != null) {
                        zzcv.zzf(!zzk.zze);
                        float f8 = this.zzo.zzc().zzb;
                        zzle zzleVar5 = this.zzz;
                        zzk.zzl(f8, zzleVar5.zza, zzleVar5.zzl);
                        if (this.zzr.zzz(zzuoVar)) {
                            zzQ();
                        }
                    }
                }
                zzR();
                return z4;
            case 9:
                zzuo zzuoVar2 = (zzuo) message.obj;
                if (this.zzr.zzy(zzuoVar2)) {
                    this.zzr.zzu(this.zzM);
                    zzP();
                } else if (this.zzr.zzz(zzuoVar2)) {
                    zzQ();
                }
                z4 = true;
                zzR();
                return z4;
            case 10:
                zzU();
                z4 = true;
                zzR();
                return z4;
            case 11:
                int i16 = message.arg1;
                this.zzH = i16;
                int zzc = this.zzr.zzc(this.zzz.zza, i16);
                if ((zzc & 1) != 0) {
                    zzab(true);
                } else if ((zzc & 2) != 0) {
                    zzE();
                }
                zzL(false);
                z4 = true;
                zzR();
                return z4;
            case 12:
                boolean z9 = message.arg1 != 0;
                this.zzI = z9;
                int zzd3 = this.zzr.zzd(this.zzz.zza, z9);
                if ((zzd3 & 1) != 0) {
                    zzab(true);
                } else if ((zzd3 & 2) != 0) {
                    zzE();
                }
                zzL(false);
                z4 = true;
                zzR();
                return z4;
            case 13:
                boolean z10 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.zzJ != z10) {
                    this.zzJ = z10;
                    if (!z10) {
                        zzlr[] zzlrVarArr4 = this.zzb;
                        for (int i17 = 0; i17 < 2; i17++) {
                            zzlrVarArr4[i17].zzp();
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                    }
                }
                z4 = true;
                zzR();
                return z4;
            case 14:
                zzli zzliVar = (zzli) message.obj;
                if (zzliVar.zzb() == this.zzk) {
                    zzau(zzliVar);
                    int i18 = this.zzz.zze;
                    if (i18 == 3 || i18 == 2) {
                        this.zzi.zzi(2);
                    }
                } else {
                    this.zzi.zzc(15, zzliVar).zza();
                }
                z4 = true;
                zzR();
                return z4;
            case 15:
                final zzli zzliVar2 = (zzli) message.obj;
                Looper zzb = zzliVar2.zzb();
                if (zzb.getThread().isAlive()) {
                    this.zzq.zzd(zzb, null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzkf.zzf(zzkf.this, zzliVar2);
                        }
                    });
                } else {
                    zzdq.zzf("TAG", "Trying to send message on a dead thread.");
                    zzliVar2.zzh(false);
                }
                z4 = true;
                zzR();
                return z4;
            case 16:
                zzN((zzbb) message.obj, false);
                z4 = true;
                zzR();
                return z4;
            case 17:
                zzjz zzjzVar = (zzjz) message.obj;
                this.zzA.zza(1);
                i10 = zzjzVar.zzb;
                if (i10 != -1) {
                    list2 = zzjzVar.zza;
                    zzwnVar2 = zzjzVar.zzd;
                    zzlk zzlkVar = new zzlk(list2, zzwnVar2);
                    i11 = zzjzVar.zzb;
                    j10 = zzjzVar.zzc;
                    this.zzL = new zzkd(zzlkVar, i11, j10);
                }
                zzld zzldVar = this.zzs;
                list = zzjzVar.zza;
                zzwnVar = zzjzVar.zzd;
                zzM(zzldVar.zzn(list, zzwnVar), false);
                z4 = true;
                zzR();
                return z4;
            case 18:
                zzjz zzjzVar2 = (zzjz) message.obj;
                int i19 = message.arg1;
                this.zzA.zza(1);
                zzld zzldVar2 = this.zzs;
                if (i19 == -1) {
                    i19 = zzldVar2.zza();
                }
                list3 = zzjzVar2.zza;
                zzwnVar3 = zzjzVar2.zzd;
                zzM(zzldVar2.zzk(i19, list3, zzwnVar3), false);
                z4 = true;
                zzR();
                return z4;
            case 19:
                zzka zzkaVar = (zzka) message.obj;
                this.zzA.zza(1);
                zzld zzldVar3 = this.zzs;
                int i20 = zzkaVar.zza;
                zzM(zzldVar3.zzl(0, 0, 0, null), false);
                z4 = true;
                zzR();
                return z4;
            case 20:
                int i21 = message.arg1;
                int i22 = message.arg2;
                zzwn zzwnVar4 = (zzwn) message.obj;
                this.zzA.zza(1);
                zzM(this.zzs.zzm(i21, i22, zzwnVar4), false);
                z4 = true;
                zzR();
                return z4;
            case zzbbd.zzt.zzm /* 21 */:
                zzwn zzwnVar5 = (zzwn) message.obj;
                this.zzA.zza(1);
                zzM(this.zzs.zzo(zzwnVar5), false);
                z4 = true;
                zzR();
                return z4;
            case 22:
                zzM(this.zzs.zzb(), true);
                z4 = true;
                zzR();
                return z4;
            case 23:
                this.zzC = message.arg1 != 0;
                zzX();
                if (this.zzD && this.zzr.zzn() != this.zzr.zzj()) {
                    zzab(true);
                    zzL(false);
                }
                z4 = true;
                zzR();
                return z4;
            case 24:
            default:
                return false;
            case 25:
                zzV();
                z4 = true;
                zzR();
                return z4;
            case 26:
                zzV();
                z4 = true;
                zzR();
                return z4;
            case 27:
                int i23 = message.arg1;
                int i24 = message.arg2;
                List list4 = (List) message.obj;
                this.zzA.zza(1);
                zzM(this.zzs.zzc(i23, i24, list4), false);
                z4 = true;
                zzR();
                return z4;
            case 28:
                zzik zzikVar = (zzik) message.obj;
                this.zzS = zzikVar;
                this.zzr.zzw(this.zzz.zza, zzikVar);
                z4 = true;
                zzR();
                return z4;
            case 29:
                this.zzA.zza(1);
                zzW(false, false, false, true);
                this.zzg.zzc(this.zzu);
                zzae(true != this.zzz.zza.zzo() ? 2 : 4);
                this.zzs.zzg(this.zzh.zze());
                this.zzi.zzi(2);
                z4 = true;
                zzR();
                return z4;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj2 = pair.first;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) pair.second;
                zzlr[] zzlrVarArr5 = this.zzb;
                for (int i25 = 0; i25 < 2; i25++) {
                    zzlrVarArr5[i25].zzv(obj2);
                }
                int i26 = this.zzz.zze;
                if (i26 == 3 || i26 == 2) {
                    this.zzi.zzi(2);
                }
                if (atomicBoolean2 != null) {
                    synchronized (this) {
                        atomicBoolean2.set(true);
                        notifyAll();
                    }
                }
                z4 = true;
                zzR();
                return z4;
            case 31:
                this.zze.zzk((zze) message.obj);
                z4 = true;
                zzR();
                return z4;
            case 32:
                float floatValue = ((Float) message.obj).floatValue();
                zzlr[] zzlrVarArr6 = this.zzb;
                for (int i27 = 0; i27 < 2; i27++) {
                    zzlrVarArr6[i27].zzw(floatValue);
                }
                z4 = true;
                zzR();
                return z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zza(zzbb zzbbVar) {
        this.zzi.zzc(16, zzbbVar).zza();
    }

    public final Looper zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final /* bridge */ /* synthetic */ void zzh(zzwm zzwmVar) {
        this.zzi.zzc(9, (zzuo) zzwmVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzi() {
        this.zzi.zzf(2);
        this.zzi.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzj(zzuo zzuoVar) {
        this.zzi.zzc(8, zzuoVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzk() {
        this.zzi.zzi(10);
    }

    public final void zzl() {
        this.zzi.zzb(29).zza();
    }

    public final void zzm(zzbn zzbnVar, int i7, long j) {
        this.zzi.zzc(3, new zzkd(zzbnVar, i7, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final synchronized void zzn(zzli zzliVar) {
        if (!this.zzB && this.zzk.getThread().isAlive()) {
            this.zzi.zzc(14, zzliVar).zza();
            return;
        }
        zzdq.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzliVar.zzh(false);
    }

    public final void zzo(zze zzeVar) {
        this.zzi.zzc(31, zzeVar).zza();
    }

    public final void zzp(boolean z4, int i7, int i8) {
        this.zzi.zzd(1, z4 ? 1 : 0, i7).zza();
    }

    public final void zzq(float f7) {
        this.zzi.zzc(32, Float.valueOf(f7)).zza();
    }

    public final void zzr() {
        this.zzi.zzb(6).zza();
    }

    public final synchronized boolean zzs() {
        if (!this.zzB && this.zzk.getThread().isAlive()) {
            this.zzi.zzi(7);
            zzan(new zzftz() { // from class: com.google.android.gms.internal.ads.zzju
                @Override // com.google.android.gms.internal.ads.zzftz
                public final Object zza() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(zzkf.this.zzB);
                    return valueOf;
                }
            }, this.zzt);
            return this.zzB;
        }
        return true;
    }

    public final synchronized boolean zzt(Object obj, long j) {
        if (!this.zzB && this.zzk.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.zzi.zzc(30, new Pair(obj, atomicBoolean)).zza();
            if (j != -9223372036854775807L) {
                zzan(new zzftz() { // from class: com.google.android.gms.internal.ads.zzjw
                    @Override // com.google.android.gms.internal.ads.zzftz
                    public final Object zza() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                }, j);
                return atomicBoolean.get();
            }
        }
        return true;
    }

    public final void zzu(List list, int i7, long j, zzwn zzwnVar) {
        this.zzi.zzc(17, new zzjz(list, zzwnVar, i7, j, null)).zza();
    }
}
