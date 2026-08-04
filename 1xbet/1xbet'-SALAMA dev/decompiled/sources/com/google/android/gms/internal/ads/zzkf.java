package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
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
        zzle zzleVarZzh = zzle.zzh(zzyoVar);
        this.zzz = zzleVarZzh;
        this.zzA = new zzkc(zzleVarZzh);
        int length = zzlmVarArr.length;
        this.zzc = new zzlp[2];
        this.zzd = new boolean[2];
        zzlo zzloVarZze = zzynVar.zze();
        this.zzb = new zzlr[2];
        boolean z9 = false;
        for (int i9 = 2; i8 < i9; i9 = 2) {
            zzlmVarArr[i8].zzv(i8, zzorVar, zzczVar);
            this.zzc[i8] = zzlmVarArr[i8].zzm();
            this.zzc[i8].zzL(zzloVarZze);
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
        zzdj zzdjVarZzd = zzczVar.zzd(looper, null);
        this.zzw = zzdjVarZzd;
        this.zzr = new zzkr(zzlyVar, zzdjVarZzd, new zzjt(this), zzikVar);
        this.zzs = new zzld(this, zzlyVar, zzdjVarZzd, zzorVar);
        zzlf zzlfVar2 = new zzlf(null);
        this.zzj = zzlfVar2;
        Looper looperZza = zzlfVar2.zza();
        this.zzk = looperZza;
        this.zzi = zzczVar.zzd(looperZza, this);
    }

    private final long zzA(zzuq zzuqVar, long j, boolean z4, boolean z7) throws zzia {
        zzah();
        zzam(false, true);
        if (z7 || this.zzz.zze == 3) {
            zzae(2);
        }
        zzko zzkoVarZzj = this.zzr.zzj();
        zzko zzkoVarZzg = zzkoVarZzj;
        while (zzkoVarZzg != null && !zzuqVar.equals(zzkoVarZzg.zzg.zza)) {
            zzkoVarZzg = zzkoVarZzg.zzg();
        }
        if (z4 || zzkoVarZzj != zzkoVarZzg || (zzkoVarZzg != null && zzkoVarZzg.zze() + j < 0)) {
            zzF();
            if (zzkoVarZzg != null) {
                while (this.zzr.zzj() != zzkoVarZzg) {
                    this.zzr.zze();
                }
                this.zzr.zza(zzkoVarZzg);
                zzkoVarZzg.zzq(1000000000000L);
                zzI();
                zzkoVarZzg.zzh = true;
            }
        }
        zzE();
        if (zzkoVarZzg != null) {
            this.zzr.zza(zzkoVarZzg);
            if (!zzkoVarZzg.zze) {
                zzkoVarZzg.zzg = zzkoVarZzg.zzg.zzb(j);
            } else if (zzkoVarZzg.zzf) {
                j = zzkoVarZzg.zza.zze(j);
                zzkoVarZzg.zza.zzi(j - this.zzn, false);
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
        Pair pairZzl = zzbnVar.zzl(this.zzl, this.zzm, zzbnVar.zzg(this.zzI), -9223372036854775807L);
        zzuq zzuqVarZzq = this.zzr.zzq(zzbnVar, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (zzuqVarZzq.zzb()) {
            zzbnVar.zzn(zzuqVarZzq.zza, this.zzm);
            if (zzuqVarZzq.zzc == this.zzm.zze(zzuqVarZzq.zzb)) {
                this.zzm.zzh();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzuqVarZzq, Long.valueOf(j));
    }

    private static Pair zzC(zzbn zzbnVar, zzkd zzkdVar, boolean z4, int i7, boolean z7, zzbm zzbmVar, zzbl zzblVar) {
        zzbn zzbnVar2 = zzkdVar.zza;
        if (zzbnVar.zzo()) {
            return null;
        }
        zzbn zzbnVar3 = true == zzbnVar2.zzo() ? zzbnVar : zzbnVar2;
        try {
            Pair pairZzl = zzbnVar3.zzl(zzbmVar, zzblVar, zzkdVar.zzb, zzkdVar.zzc);
            if (zzbnVar.equals(zzbnVar3)) {
                return pairZzl;
            }
            if (zzbnVar.zza(pairZzl.first) != -1) {
                return (zzbnVar3.zzn(pairZzl.first, zzblVar).zzf && zzbnVar3.zze(zzblVar.zzc, zzbmVar, 0L).zzn == zzbnVar3.zza(pairZzl.first)) ? zzbnVar.zzl(zzbmVar, zzblVar, zzbnVar.zzn(pairZzl.first, zzblVar).zzc, zzkdVar.zzc) : pairZzl;
            }
            int iZzb = zzb(zzbmVar, zzblVar, i7, z7, pairZzl.first, zzbnVar3, zzbnVar);
            if (iZzb != -1) {
                return zzbnVar.zzl(zzbmVar, zzblVar, iZzb, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    private final zzle zzD(zzuq zzuqVar, long j, long j3, long j7, boolean z4, int i7) {
        List listZzn;
        zzyo zzyoVar;
        zzwv zzwvVar;
        this.zzP = (!this.zzP && j == this.zzz.zzs && zzuqVar.equals(this.zzz.zzb)) ? false : true;
        zzX();
        zzle zzleVar = this.zzz;
        zzwv zzwvVarZzh = zzleVar.zzh;
        zzyo zzyoVarZzi = zzleVar.zzi;
        List list = zzleVar.zzj;
        if (!this.zzs.zzj()) {
            if (zzuqVar.equals(this.zzz.zzb)) {
                listZzn = list;
            } else {
                zzyoVar = this.zzf;
                zzwvVar = zzwv.zza;
                listZzn = zzfwh.zzn();
            }
            if (z4) {
                this.zzA.zzc(i7);
            }
            return this.zzz.zzc(zzuqVar, j, j3, j7, zzx(), zzwvVar, zzyoVar, listZzn);
        }
        zzko zzkoVarZzj = this.zzr.zzj();
        zzwvVarZzh = zzkoVarZzj == null ? zzwv.zza : zzkoVarZzj.zzh();
        zzyoVarZzi = zzkoVarZzj == null ? this.zzf : zzkoVarZzj.zzi();
        zzyh[] zzyhVarArr = zzyoVarZzi.zzc;
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
        zzfwh zzfwhVarZzi = z7 ? zzfweVar.zzi() : zzfwh.zzn();
        if (zzkoVarZzj != null) {
            zzkp zzkpVar = zzkoVarZzj.zzg;
            if (zzkpVar.zzc != j3) {
                zzkoVarZzj.zzg = zzkpVar.zza(j3);
            }
        }
        zzko zzkoVarZzj2 = this.zzr.zzj();
        if (zzkoVarZzj2 != null) {
            zzyo zzyoVarZzi2 = zzkoVarZzj2.zzi();
            for (int i8 = 0; i8 < 2; i8++) {
                if (zzyoVarZzi2.zzb(i8)) {
                    if (this.zzb[i8].zzb() != 1) {
                        break;
                    }
                    int i9 = zzyoVarZzi2.zzb[i8].zzb;
                }
            }
        }
        listZzn = zzfwhVarZzi;
        zzwvVar = zzwvVarZzh;
        zzyoVar = zzyoVarZzi;
        if (z4) {
            this.zzA.zzc(i7);
        }
        return this.zzz.zzc(zzuqVar, j, j3, j7, zzx(), zzwvVar, zzyoVar, listZzn);
    }

    private final void zzE() {
        if (this.zzx && zzao()) {
            zzlr[] zzlrVarArr = this.zzb;
            for (int i7 = 0; i7 < 2; i7++) {
                zzlr zzlrVar = zzlrVarArr[i7];
                int iZza = zzlrVar.zza();
                zzlrVar.zzf(this.zzo);
                this.zzK -= iZza - zzlrVar.zza();
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
            int iZza = zzlrVarArr[i7].zza();
            this.zzb[i7].zze(this.zzo);
            zzT(i7, false);
            this.zzK -= iZza;
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x020e  */
    /* JADX WARN: Code duplicated, block: B:118:0x023e A[LOOP:13: B:116:0x023b->B:118:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0361  */
    /* JADX WARN: Code duplicated, block: B:253:0x048b  */
    /* JADX WARN: Code duplicated, block: B:255:0x0492  */
    /* JADX WARN: Code duplicated, block: B:257:0x0496  */
    /* JADX WARN: Code duplicated, block: B:258:0x049c  */
    /* JADX WARN: Code duplicated, block: B:260:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:262:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:264:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:265:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:271:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:277:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:282:0x0530  */
    /* JADX WARN: Code duplicated, block: B:284:0x053d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0549  */
    /* JADX WARN: Code duplicated, block: B:287:0x0550  */
    /* JADX WARN: Code duplicated, block: B:295:0x056c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0574  */
    /* JADX WARN: Code duplicated, block: B:299:0x057e A[LOOP:9: B:298:0x057c->B:299:0x057e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:328:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134 A[EDGE_INSN: B:62:0x0134->B:139:0x0284 BREAK  A[LOOP:10: B:71:0x014f->B:75:0x015b]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99, types: [int] */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.google.android.gms.internal.ads.zzyo] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r3v45, types: [com.google.android.gms.internal.ads.zzlr[]] */
    /* JADX WARN: Type inference failed for: r3v46, types: [com.google.android.gms.internal.ads.zzlr] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v42 */
    private final void zzG() throws Throwable {
        long j;
        boolean z4;
        boolean z7;
        boolean z8;
        zzle zzleVar;
        zzko zzkoVarZzj;
        zzyh[] zzyhVarArr;
        int length;
        ?? r7;
        zzko zzkoVarZzj2;
        long jZzb;
        zzko zzkoVarZzi;
        boolean z9;
        boolean z10;
        boolean zZzj;
        int i7;
        boolean z11;
        int i8;
        boolean z12;
        zzyo zzyoVarZzi;
        zzko zzkoVarZzg;
        zzyo zzyoVarZzi2;
        zzlr[] zzlrVarArr;
        int i9;
        zzko zzkoVarZzj3;
        zzko zzkoVarZzg2;
        boolean z13;
        zzko zzkoVarZzm;
        zzkp zzkpVarZzo;
        zzdj zzdjVar = this.zzi;
        long jUptimeMillis = SystemClock.uptimeMillis();
        zzdjVar.zzf(2);
        long j3 = -9223372036854775807L;
        if (this.zzz.zza.zzo() || !this.zzs.zzj()) {
            j = -9223372036854775807L;
        } else {
            this.zzr.zzu(this.zzM);
            if (this.zzr.zzA() && (zzkpVarZzo = this.zzr.zzo(this.zzM, this.zzz)) != null) {
                zzko zzkoVarZzh = this.zzr.zzh(zzkpVarZzo);
                if (!zzkoVarZzh.zzd) {
                    zzkoVarZzh.zzm(this, zzkpVarZzo.zzb);
                } else if (zzkoVarZzh.zze) {
                    this.zzi.zzc(8, zzkoVarZzh.zza).zza();
                }
                if (this.zzr.zzj() == zzkoVarZzh) {
                    zzY(zzkpVarZzo.zzb);
                }
                zzL(false);
            }
            if (this.zzG) {
                this.zzG = zzat(this.zzr.zzi());
                zzai();
            } else {
                zzP();
            }
            if (!this.zzD && this.zzx && !this.zzU && !zzao() && (zzkoVarZzm = this.zzr.zzm()) != null && zzkoVarZzm == this.zzr.zzn() && zzkoVarZzm.zzg() != null && zzkoVarZzm.zzg().zze) {
                this.zzr.zzf();
                zzko zzkoVarZzm2 = this.zzr.zzm();
                if (zzkoVarZzm2 != null) {
                    zzyo zzyoVarZzi3 = zzkoVarZzm2.zzi();
                    int i10 = 0;
                    while (i10 < 2) {
                        if (zzyoVarZzi3.zzb(i10) && this.zzb[i10].zzD() && !this.zzb[i10].zzF()) {
                            this.zzb[i10].zzy();
                            zzH(zzkoVarZzm2, i10, false, zzkoVarZzm2.zzf());
                        }
                        i10++;
                        zzyoVarZzi3 = zzyoVarZzi3;
                    }
                    if (zzao()) {
                        this.zzT = zzkoVarZzm2.zza.zzd();
                        if (!zzkoVarZzm2.zzs()) {
                            this.zzr.zza(zzkoVarZzm2);
                            zzL(false);
                            zzP();
                        }
                    }
                }
            }
            zzko zzkoVarZzn = this.zzr.zzn();
            if (zzkoVarZzn == null) {
                z12 = false;
                break;
            }
            if (zzkoVarZzn.zzg() != null && !this.zzD) {
                zzko zzkoVarZzn2 = this.zzr.zzn();
                if (!zzkoVarZzn2.zze) {
                    z12 = false;
                    break;
                }
                int i11 = 0;
                while (true) {
                    zzlr[] zzlrVarArr2 = this.zzb;
                    if (i11 >= 2) {
                        if (!zzao()) {
                            if (!zzkoVarZzn.zzg().zze) {
                            }
                            zzyoVarZzi = zzkoVarZzn.zzi();
                            zzkoVarZzg = this.zzr.zzg();
                            zzyoVarZzi2 = zzkoVarZzg.zzi();
                            zzbn zzbnVar = this.zzz.zza;
                            zzal(zzbnVar, zzkoVarZzg.zzg.zza, zzbnVar, zzkoVarZzn.zzg.zza, -9223372036854775807L, false);
                            if (zzkoVarZzg.zze) {
                                z12 = false;
                                zzlrVarArr = this.zzb;
                                for (i9 = 0; i9 < 2; i9++) {
                                    zzlrVarArr[i9].zzl(zzyoVarZzi, zzyoVarZzi2, zzkoVarZzg.zzf());
                                }
                                break;
                                break;
                            }
                            z12 = false;
                            zzlrVarArr = this.zzb;
                            while (i9 < 2) {
                                zzlrVarArr[i9].zzl(zzyoVarZzi, zzyoVarZzi2, zzkoVarZzg.zzf());
                            }
                            break;
                            break;
                        }
                        zzkr zzkrVar = this.zzr;
                        if (zzkrVar.zzm() != zzkrVar.zzn()) {
                            if (!zzkoVarZzn.zzg().zze || this.zzM >= zzkoVarZzn.zzg().zzf()) {
                                zzyoVarZzi = zzkoVarZzn.zzi();
                                zzkoVarZzg = this.zzr.zzg();
                                zzyoVarZzi2 = zzkoVarZzg.zzi();
                                zzbn zzbnVar2 = this.zzz.zza;
                                zzal(zzbnVar2, zzkoVarZzg.zzg.zza, zzbnVar2, zzkoVarZzn.zzg.zza, -9223372036854775807L, false);
                                if (zzkoVarZzg.zze && ((this.zzx && this.zzT != -9223372036854775807L) || zzkoVarZzg.zza.zzd() != -9223372036854775807L)) {
                                    this.zzT = -9223372036854775807L;
                                    if (this.zzx && !this.zzU) {
                                        int i12 = 2;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= i12) {
                                                z12 = false;
                                                zzlrVarArr = this.zzb;
                                                while (i9 < 2) {
                                                    zzlrVarArr[i9].zzl(zzyoVarZzi, zzyoVarZzi2, zzkoVarZzg.zzf());
                                                }
                                                break;
                                                break;
                                            }
                                            if (!zzyoVarZzi2.zzb(i13) || zzay.zzf(zzyoVarZzi2.zzc[i13].zzf().zzo, zzyoVarZzi2.zzc[i13].zzf().zzk) || this.zzb[i13].zzF()) {
                                                i13++;
                                                i12 = 2;
                                            }
                                        }
                                    }
                                    long jZzf = zzkoVarZzg.zzf();
                                    zzlr[] zzlrVarArr3 = this.zzb;
                                    int i14 = 0;
                                    for (int i15 = 2; i14 < i15; i15 = 2) {
                                        zzlrVarArr3[i14].zzr(jZzf);
                                        i14++;
                                    }
                                    if (!zzkoVarZzg.zzs()) {
                                        this.zzr.zza(zzkoVarZzg);
                                        z12 = false;
                                        zzL(false);
                                        zzP();
                                        break;
                                    }
                                    z12 = false;
                                    break;
                                }
                                z12 = false;
                                zzlrVarArr = this.zzb;
                                while (i9 < 2) {
                                    zzlrVarArr[i9].zzl(zzyoVarZzi, zzyoVarZzi2, zzkoVarZzg.zzf());
                                }
                                break;
                            }
                        }
                    } else if (zzlrVarArr2[i11].zzB(zzkoVarZzn2)) {
                        i11++;
                    }
                    z12 = false;
                    break;
                }
            } else {
                z12 = false;
                if (zzkoVarZzn.zzg.zzj || this.zzD) {
                    zzlr[] zzlrVarArr4 = this.zzb;
                    for (int i16 = 0; i16 < 2; i16++) {
                        zzlr zzlrVar = zzlrVarArr4[i16];
                        if (zzlrVar.zzG(zzkoVarZzn) && zzlrVar.zzC(zzkoVarZzn)) {
                            long j7 = zzkoVarZzn.zzg.zze;
                            zzlrVar.zzs(zzkoVarZzn, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : zzkoVarZzn.zze() + j7);
                        }
                    }
                }
            }
            zzko zzkoVarZzn3 = this.zzr.zzn();
            if (zzkoVarZzn3 != null && this.zzr.zzj() != zzkoVarZzn3 && !zzkoVarZzn3.zzh) {
                zzko zzkoVarZzn4 = this.zzr.zzn();
                ?? Zzi = zzkoVarZzn4.zzi();
                ?? r8 = z12;
                int i17 = 1;
                while (true) {
                    zzlr[] zzlrVarArr5 = this.zzb;
                    if (r8 >= 2) {
                        break;
                    }
                    int iZza = zzlrVarArr5[r8].zza();
                    int iZzc = this.zzb[r8].zzc(zzkoVarZzn4, Zzi, this.zzo);
                    this.zzK -= iZza - this.zzb[r8].zza();
                    i17 &= iZzc & 1;
                    r8++;
                }
                if (i17 != 0) {
                    ?? r14 = z12;
                    while (r14 < 2) {
                        if (Zzi.zzb(r14) && !this.zzb[r14].zzG(zzkoVarZzn4)) {
                            zzH(zzkoVarZzn4, r14 == true ? 1 : 0, false, zzkoVarZzn4.zzf());
                        }
                        r14++;
                    }
                    this.zzr.zzn().zzh = true;
                }
            }
            boolean z14 = z12;
            while (zzar() && !this.zzD && (zzkoVarZzj3 = this.zzr.zzj()) != null && (zzkoVarZzg2 = zzkoVarZzj3.zzg()) != null && this.zzM >= zzkoVarZzg2.zzf() && zzkoVarZzg2.zzh) {
                if (z14) {
                    zzR();
                }
                this.zzU = z12;
                zzko zzkoVarZze = this.zzr.zze();
                zzkoVarZze.getClass();
                if (this.zzz.zzb.zza.equals(zzkoVarZze.zzg.zza.zza)) {
                    zzuq zzuqVar = this.zzz.zzb;
                    if (zzuqVar.zzb == -1) {
                        zzuq zzuqVar2 = zzkoVarZze.zzg.zza;
                        if (zzuqVar2.zzb != -1 || zzuqVar.zze == zzuqVar2.zze) {
                            z13 = z12;
                        } else {
                            z13 = true;
                        }
                    } else {
                        z13 = z12;
                    }
                } else {
                    z13 = z12;
                }
                zzkp zzkpVar = zzkoVarZze.zzg;
                zzuq zzuqVar3 = zzkpVar.zza;
                long j8 = zzkpVar.zzb;
                long j9 = j3;
                this.zzz = zzD(zzuqVar3, j8, zzkpVar.zzc, j8, !z13, 0);
                zzX();
                zzak();
                if (zzao() && zzkoVarZze == this.zzr.zzm()) {
                    zzlr[] zzlrVarArr6 = this.zzb;
                    int i18 = 0;
                    for (int i19 = 2; i18 < i19; i19 = 2) {
                        zzlrVarArr6[i18].zzk();
                        i18++;
                    }
                }
                if (this.zzz.zze == 3) {
                    zzaf();
                }
                zzyo zzyoVarZzi4 = this.zzr.zzj().zzi();
                int i20 = 0;
                for (int i21 = 2; i20 < i21; i21 = 2) {
                    if (zzyoVarZzi4.zzb(i20)) {
                        this.zzb[i20].zzh();
                    }
                    i20++;
                }
                j3 = j9;
                z12 = false;
                z14 = true;
            }
            j = j3;
            long j10 = this.zzS.zzb;
        }
        int i22 = this.zzz.zze;
        if (i22 == 1 || i22 == 4) {
            return;
        }
        zzko zzkoVarZzj4 = this.zzr.zzj();
        if (zzkoVarZzj4 == null) {
            zzaa(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        zzak();
        if (zzkoVarZzj4.zze) {
            this.zzN = zzen.zzs(SystemClock.elapsedRealtime());
            z4 = false;
            zzkoVarZzj4.zza.zzi(this.zzz.zzs - this.zzn, false);
            boolean z15 = true;
            z8 = true;
            int i23 = 0;
            while (true) {
                zzlr[] zzlrVarArr7 = this.zzb;
                if (i23 >= 2) {
                    break;
                }
                zzlr zzlrVar2 = zzlrVarArr7[i23];
                if (zzlrVar2.zza() == 0) {
                    zzT(i23, false);
                } else {
                    zzlrVar2.zzo(this.zzM, this.zzN);
                    boolean z16 = z15 && zzlrVar2.zzE();
                    boolean zZzA = zzlrVar2.zzA(zzkoVarZzj4);
                    zzT(i23, zZzA);
                    boolean z17 = z8 && zZzA;
                    if (!zZzA) {
                        zzS(i23);
                    }
                    z8 = z17;
                    z15 = z16;
                }
                i23++;
            }
            z7 = z15;
        } else {
            z4 = false;
            zzkoVarZzj4.zza.zzk();
            z7 = true;
            z8 = true;
        }
        long j11 = zzkoVarZzj4.zzg.zze;
        if (z7 && zzkoVarZzj4.zze && (j11 == j || j11 <= this.zzz.zzs)) {
            if (this.zzD) {
                this.zzD = z4;
                zzad(z4, this.zzz.zzn, z4, 5);
            }
            if (zzkoVarZzj4.zzg.zzj) {
                zzae(4);
                zzah();
            } else {
                zzleVar = this.zzz;
                if (zzleVar.zze != 2) {
                    if (this.zzK == 0) {
                        zZzj = zzap();
                    } else if (z8) {
                        if (zzleVar.zzg) {
                            zzkoVarZzj2 = this.zzr.zzj();
                            if (zzas(this.zzz.zza, zzkoVarZzj2.zzg.zza)) {
                                jZzb = this.zzW.zzb();
                            } else {
                                jZzb = j;
                            }
                            zzkoVarZzi = this.zzr.zzi();
                            if (zzkoVarZzi.zzs()) {
                                z9 = z4;
                            } else {
                                z9 = z4;
                            }
                            if (zzkoVarZzi.zzg.zza.zzb()) {
                                z10 = z4;
                            } else {
                                z10 = z4;
                            }
                            if (z9) {
                            }
                        }
                        zzae(3);
                        this.zzQ = null;
                        if (zzar()) {
                            zzam(z4, z4);
                            this.zzo.zzh();
                            zzaf();
                        }
                    } else if (this.zzz.zze == 3) {
                        zzam(zzar(), z4);
                        zzae(2);
                        if (this.zzE) {
                            for (zzkoVarZzj = this.zzr.zzj(); zzkoVarZzj != null; zzkoVarZzj = zzkoVarZzj.zzg()) {
                                zzyhVarArr = zzkoVarZzj.zzi().zzc;
                                length = zzyhVarArr.length;
                                for (r7 = z4; r7 < length; r7++) {
                                    zzyh zzyhVar = zzyhVarArr[r7];
                                }
                            }
                            this.zzW.zzc();
                        }
                        zzah();
                    }
                    if (zZzj) {
                        zzae(3);
                        this.zzQ = null;
                        if (zzar()) {
                            zzam(z4, z4);
                            this.zzo.zzh();
                            zzaf();
                        }
                    } else if (this.zzz.zze == 3) {
                        zzam(zzar(), z4);
                        zzae(2);
                        if (this.zzE) {
                            while (zzkoVarZzj != null) {
                                zzyhVarArr = zzkoVarZzj.zzi().zzc;
                                length = zzyhVarArr.length;
                                while (r7 < length) {
                                    zzyh zzyhVar2 = zzyhVarArr[r7];
                                }
                            }
                            this.zzW.zzc();
                        }
                        zzah();
                    }
                } else if (this.zzz.zze == 3) {
                    zzam(zzar(), z4);
                    zzae(2);
                    if (this.zzE) {
                        while (zzkoVarZzj != null) {
                            zzyhVarArr = zzkoVarZzj.zzi().zzc;
                            length = zzyhVarArr.length;
                            while (r7 < length) {
                                zzyh zzyhVar3 = zzyhVarArr[r7];
                            }
                        }
                        this.zzW.zzc();
                    }
                    zzah();
                }
            }
        } else {
            zzleVar = this.zzz;
            if (zzleVar.zze != 2) {
                if (this.zzK == 0) {
                    zZzj = zzap();
                } else if (z8) {
                    if (zzleVar.zzg) {
                        zzkoVarZzj2 = this.zzr.zzj();
                        if (zzas(this.zzz.zza, zzkoVarZzj2.zzg.zza)) {
                            jZzb = this.zzW.zzb();
                        } else {
                            jZzb = j;
                        }
                        zzkoVarZzi = this.zzr.zzi();
                        if (zzkoVarZzi.zzs() || !zzkoVarZzi.zzg.zzj) {
                            z9 = z4;
                        } else {
                            z9 = true;
                        }
                        if (zzkoVarZzi.zzg.zza.zzb() || zzkoVarZzi.zze) {
                            z10 = z4;
                        } else {
                            z10 = true;
                        }
                        if (z9 && !z10) {
                            zZzj = this.zzg.zzj(new zzki(this.zzu, this.zzz.zza, zzkoVarZzj2.zzg.zza, this.zzM - zzkoVarZzj2.zze(), zzy(zzkoVarZzi.zzc()), this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, jZzb));
                        }
                    }
                    zzae(3);
                    this.zzQ = null;
                    if (zzar()) {
                        zzam(z4, z4);
                        this.zzo.zzh();
                        zzaf();
                    }
                } else if (this.zzz.zze == 3) {
                    zzam(zzar(), z4);
                    zzae(2);
                    if (this.zzE) {
                        while (zzkoVarZzj != null) {
                            zzyhVarArr = zzkoVarZzj.zzi().zzc;
                            length = zzyhVarArr.length;
                            while (r7 < length) {
                                zzyh zzyhVar4 = zzyhVarArr[r7];
                            }
                        }
                        this.zzW.zzc();
                    }
                    zzah();
                }
                if (zZzj) {
                    zzae(3);
                    this.zzQ = null;
                    if (zzar()) {
                        zzam(z4, z4);
                        this.zzo.zzh();
                        zzaf();
                    }
                } else if (this.zzz.zze == 3) {
                    zzam(zzar(), z4);
                    zzae(2);
                    if (this.zzE) {
                        while (zzkoVarZzj != null) {
                            zzyhVarArr = zzkoVarZzj.zzi().zzc;
                            length = zzyhVarArr.length;
                            while (r7 < length) {
                                zzyh zzyhVar5 = zzyhVarArr[r7];
                            }
                        }
                        this.zzW.zzc();
                    }
                    zzah();
                }
            } else if (this.zzz.zze == 3 && (this.zzK != 0 ? !z8 : !zzap())) {
                zzam(zzar(), z4);
                zzae(2);
                if (this.zzE) {
                    while (zzkoVarZzj != null) {
                        zzyhVarArr = zzkoVarZzj.zzi().zzc;
                        length = zzyhVarArr.length;
                        while (r7 < length) {
                            zzyh zzyhVar6 = zzyhVarArr[r7];
                        }
                    }
                    this.zzW.zzc();
                }
                zzah();
            }
        }
        char c3 = 2;
        if (this.zzz.zze == 2) {
            int i24 = z4;
            while (true) {
                zzlr[] zzlrVarArr8 = this.zzb;
                if (i24 >= c3) {
                    break;
                }
                if (zzlrVarArr8[i24].zzG(zzkoVarZzj4)) {
                    zzS(i24);
                }
                i24++;
                c3 = 2;
            }
            zzle zzleVar2 = this.zzz;
            if (zzleVar2.zzg || zzleVar2.zzr >= 500000 || !zzat(this.zzr.zzi()) || !zzar()) {
                this.zzR = -9223372036854775807L;
            } else if (this.zzR == -9223372036854775807L) {
                this.zzR = SystemClock.elapsedRealtime();
            } else if (SystemClock.elapsedRealtime() - this.zzR >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        } else {
            this.zzR = -9223372036854775807L;
        }
        if (zzar()) {
            i7 = 3;
            if (this.zzz.zze == 3) {
                z11 = true;
            }
            zzle zzleVar3 = this.zzz;
            boolean z18 = zzleVar3.zzp;
            i8 = zzleVar3.zze;
            if (i8 != 4 && (z11 || i8 == 2 || (i8 == i7 && this.zzK != 0))) {
                zzaa(jUptimeMillis);
            }
            Trace.endSection();
        }
        i7 = 3;
        z11 = z4;
        zzle zzleVar4 = this.zzz;
        boolean z19 = zzleVar4.zzp;
        i8 = zzleVar4.zze;
        if (i8 != 4) {
            zzaa(jUptimeMillis);
        }
        Trace.endSection();
    }

    private final void zzH(zzko zzkoVar, int i7, boolean z4, long j) throws zzia {
        zzlr zzlrVar = this.zzb[i7];
        if (zzlrVar.zzH()) {
            return;
        }
        boolean z7 = zzkoVar == this.zzr.zzj();
        zzyo zzyoVarZzi = zzkoVar.zzi();
        zzlq zzlqVar = zzyoVarZzi.zzb[i7];
        zzyh zzyhVar = zzyoVarZzi.zzc[i7];
        boolean z8 = zzar() && this.zzz.zze == 3;
        boolean z9 = !z4 && z8;
        this.zzK++;
        zzlrVar.zzg(zzlqVar, zzyhVar, zzkoVar.zzc[i7], this.zzM, z9, z7, j, zzkoVar.zze(), zzkoVar.zzg.zza, this.zzo);
        zzlrVar.zzi(11, new zzjy(this), zzkoVar);
        if (z8 && z7) {
            zzlrVar.zzx();
        }
    }

    private final void zzI() throws zzia {
        zzJ(new boolean[2], this.zzr.zzn().zzf());
    }

    private final void zzJ(boolean[] zArr, long j) throws zzia {
        zzko zzkoVarZzn = this.zzr.zzn();
        zzyo zzyoVarZzi = zzkoVarZzn.zzi();
        for (int i7 = 0; i7 < 2; i7++) {
            if (!zzyoVarZzi.zzb(i7)) {
                this.zzb[i7].zzp();
            }
        }
        for (int i8 = 0; i8 < 2; i8++) {
            if (zzyoVarZzi.zzb(i8) && !this.zzb[i8].zzG(zzkoVarZzn)) {
                zzH(zzkoVarZzn, i8, zArr[i8], j);
            }
        }
    }

    private final void zzK(IOException iOException, int i7) {
        zzkr zzkrVar = this.zzr;
        zzia zziaVarZzc = zzia.zzc(iOException, i7);
        zzko zzkoVarZzj = zzkrVar.zzj();
        if (zzkoVarZzj != null) {
            zziaVarZzc = zziaVarZzc.zza(zzkoVarZzj.zzg.zza);
        }
        zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVarZzc);
        zzag(false, false);
        this.zzz = this.zzz.zze(zziaVarZzc);
    }

    private final void zzL(boolean z4) {
        zzko zzkoVarZzi = this.zzr.zzi();
        zzuq zzuqVar = zzkoVarZzi == null ? this.zzz.zzb : zzkoVarZzi.zzg.zza;
        boolean zEquals = this.zzz.zzk.equals(zzuqVar);
        if (!zEquals) {
            this.zzz = this.zzz.zzb(zzuqVar);
        }
        zzle zzleVar = this.zzz;
        zzleVar.zzq = zzkoVarZzi == null ? zzleVar.zzs : zzkoVarZzi.zzc();
        this.zzz.zzr = zzx();
        if ((!zEquals || z4) && zzkoVarZzi != null && zzkoVarZzi.zze) {
            zzaj(zzkoVarZzi.zzg.zza, zzkoVarZzi.zzh(), zzkoVarZzi.zzi());
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0387  */
    /* JADX WARN: Code duplicated, block: B:195:0x038d  */
    /* JADX WARN: Code duplicated, block: B:198:0x039f  */
    /* JADX WARN: Code duplicated, block: B:202:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:214:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:218:0x0400  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [int] */
    /* JADX WARN: Type inference failed for: r1v88 */
    private final void zzM(zzbn zzbnVar, boolean z4) throws Throwable {
        zzuq zzuqVar;
        zzbl zzblVar;
        zzbm zzbmVar;
        int i7;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int iZzg;
        boolean z10;
        long jLongValue;
        boolean z11;
        long j;
        long j3;
        long jZzz;
        zzuq zzuqVarZzi;
        boolean z12;
        boolean z13;
        boolean z14;
        int i9;
        int iZzg2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i10;
        boolean z19;
        int i11;
        Object obj;
        long j7;
        Object obj2;
        zzle zzleVar = this.zzz;
        zzkd zzkdVar = this.zzL;
        int i12 = this.zzH;
        boolean z20 = this.zzI;
        if (zzbnVar.zzo()) {
            zzuqVarZzi = zzle.zzi();
            j3 = -9223372036854775807L;
            z12 = false;
            z13 = true;
            z11 = true;
            jZzz = 0;
            z14 = false;
        } else {
            zzbl zzblVar2 = this.zzm;
            zzuq zzuqVar2 = zzleVar.zzb;
            Object obj3 = zzuqVar2.zza;
            boolean zZzaq = zzaq(zzleVar, zzblVar2);
            long jLongValue2 = (zzleVar.zzb.zzb() || zZzaq) ? zzleVar.zzc : zzleVar.zzs;
            zzbm zzbmVar2 = this.zzl;
            if (zzkdVar != null) {
                zzbmVar = zzbmVar2;
                Pair pairZzC = zzC(zzbnVar, zzkdVar, true, i12, z20, zzbmVar2, zzblVar2);
                if (pairZzC == null) {
                    iZzg2 = zzbnVar.zzg(z20);
                    jLongValue2 = jLongValue2;
                    zzblVar = zzblVar2;
                    z16 = false;
                    z18 = true;
                    z17 = false;
                } else {
                    if (zzkdVar.zzc == -9223372036854775807L) {
                        zzblVar = zzblVar2;
                        iZzg2 = zzbnVar.zzn(pairZzC.first, zzblVar).zzc;
                        jLongValue2 = jLongValue2;
                        z15 = false;
                    } else {
                        zzblVar = zzblVar2;
                        obj3 = pairZzC.first;
                        jLongValue2 = ((Long) pairZzC.second).longValue();
                        iZzg2 = -1;
                        z15 = true;
                    }
                    z16 = zzleVar.zze == 4;
                    z17 = z15;
                    z18 = false;
                }
                z8 = z18;
                z9 = z17;
                zzuqVar = zzuqVar2;
                i8 = -1;
                boolean z21 = z16;
                i7 = iZzg2;
                obj3 = obj3;
                z7 = z21;
            } else {
                zzuqVar = zzuqVar2;
                zzblVar = zzblVar2;
                zzbmVar = zzbmVar2;
                if (zzleVar.zza.zzo()) {
                    iZzg = zzbnVar.zzg(z20);
                } else if (zzbnVar.zza(obj3) == -1) {
                    int iZzb = zzb(zzbmVar, zzblVar, i12, z20, obj3, zzleVar.zza, zzbnVar);
                    if (iZzb == -1) {
                        iZzb = zzbnVar.zzg(z20);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i7 = iZzb;
                    z8 = z10;
                    obj3 = obj3;
                    jLongValue2 = jLongValue2;
                    zzuqVar = zzuqVar;
                    i8 = -1;
                    z7 = false;
                    z9 = false;
                } else if (jLongValue2 == -9223372036854775807L) {
                    iZzg = zzbnVar.zzn(obj3, zzblVar).zzc;
                } else if (zZzaq) {
                    zzuqVar = zzuqVar;
                    zzleVar.zza.zzn(zzuqVar.zza, zzblVar);
                    zzbmVar = zzbmVar;
                    if (zzleVar.zza.zze(zzblVar.zzc, zzbmVar, 0L).zzn == zzleVar.zza.zza(zzuqVar.zza)) {
                        Pair pairZzl = zzbnVar.zzl(zzbmVar, zzblVar, zzbnVar.zzn(obj3, zzblVar).zzc, jLongValue2);
                        obj3 = pairZzl.first;
                        jLongValue2 = ((Long) pairZzl.second).longValue();
                    } else {
                        jLongValue2 = jLongValue2;
                    }
                    obj3 = obj3;
                    i7 = -1;
                    i8 = -1;
                    z7 = false;
                    z8 = false;
                    z9 = true;
                } else {
                    i7 = -1;
                    i8 = -1;
                    z7 = false;
                    z8 = false;
                    z9 = false;
                }
                i7 = iZzg;
                i8 = -1;
                z7 = false;
                z8 = false;
                z9 = false;
            }
            if (i7 != i8) {
                Pair pairZzl2 = zzbnVar.zzl(zzbmVar, zzblVar, i7, -9223372036854775807L);
                obj3 = pairZzl2.first;
                jLongValue = ((Long) pairZzl2.second).longValue();
                jLongValue2 = -9223372036854775807L;
            } else {
                jLongValue = jLongValue2;
            }
            zzuq zzuqVarZzq = this.zzr.zzq(zzbnVar, obj3, jLongValue);
            int i13 = zzuqVarZzq.zze;
            boolean z22 = zzuqVar.zza.equals(obj3) && !zzuqVar.zzb() && !zzuqVarZzq.zzb() && (i13 == -1 || ((i9 = zzuqVar.zze) != -1 && i13 >= i9));
            zzbl zzblVarZzn = zzbnVar.zzn(obj3, zzblVar);
            if (!zZzaq && jLongValue2 == jLongValue2 && zzuqVar.zza.equals(zzuqVarZzq.zza)) {
                if (zzuqVar.zzb()) {
                    zzblVarZzn.zzk(zzuqVar.zzb);
                }
                if (zzuqVarZzq.zzb()) {
                    zzblVarZzn.zzk(zzuqVarZzq.zzb);
                }
            }
            z11 = true;
            if (true == z22) {
                zzuqVarZzq = zzuqVar;
            }
            if (!zzuqVarZzq.zzb()) {
                j = jLongValue;
            } else if (zzuqVarZzq.equals(zzuqVar)) {
                j = zzleVar.zzs;
            } else {
                zzbnVar.zzn(zzuqVarZzq.zza, zzblVar);
                if (zzuqVarZzq.zzc == zzblVar.zze(zzuqVarZzq.zzb)) {
                    zzblVar.zzh();
                }
                j = 0;
            }
            j3 = jLongValue2;
            jZzz = j;
            zzuqVarZzi = zzuqVarZzq;
            z12 = z7;
            z13 = z8;
            z14 = z9;
        }
        boolean z23 = (this.zzz.zzb.equals(zzuqVarZzi) && jZzz == this.zzz.zzs) ? false : z11;
        int i14 = 2;
        if (z13) {
            try {
                if (this.zzz.zze != z11) {
                    i10 = 4;
                    try {
                        zzae(4);
                    } catch (Throwable th) {
                        th = th;
                        i11 = 4;
                        obj = null;
                        zzle zzleVar2 = this.zzz;
                        zzbn zzbnVar2 = zzleVar2.zza;
                        zzuq zzuqVar3 = zzleVar2.zzb;
                        if (true != z14) {
                            j7 = -9223372036854775807L;
                        } else {
                            j7 = jZzz;
                        }
                        zzal(zzbnVar, zzuqVarZzi, zzbnVar2, zzuqVar3, j7, false);
                        if (z23) {
                            zzle zzleVar3 = this.zzz;
                            obj2 = zzleVar3.zzb.zza;
                            zzbn zzbnVar3 = zzleVar3.zza;
                            if (z23) {
                            }
                            long j8 = this.zzz.zzd;
                            if (zzbnVar.zza(obj2) != -1) {
                                i11 = 3;
                            }
                            this.zzz = zzD(zzuqVarZzi, jZzz, j3, j8, z, i11);
                        } else {
                            zzle zzleVar4 = this.zzz;
                            obj2 = zzleVar4.zzb.zza;
                            zzbn zzbnVar4 = zzleVar4.zza;
                            if (z23) {
                            }
                            long j9 = this.zzz.zzd;
                            if (zzbnVar.zza(obj2) != -1) {
                                i11 = 3;
                            }
                            this.zzz = zzD(zzuqVarZzi, jZzz, j3, j9, z, i11);
                        }
                        zzX();
                        zzZ(zzbnVar, this.zzz.zza);
                        this.zzz = this.zzz.zzg(zzbnVar);
                        if (!zzbnVar.zzo()) {
                            this.zzL = obj;
                        }
                        zzL(false);
                        this.zzi.zzi(2);
                        throw th;
                    }
                } else {
                    i10 = 4;
                }
                z19 = false;
                try {
                    zzW(false, false, false, z11);
                } catch (Throwable th2) {
                    th = th2;
                    i11 = i10;
                    obj = null;
                    zzle zzleVar5 = this.zzz;
                    zzbn zzbnVar5 = zzleVar5.zza;
                    zzuq zzuqVar4 = zzleVar5.zzb;
                    if (true != z14) {
                        j7 = -9223372036854775807L;
                    } else {
                        j7 = jZzz;
                    }
                    zzal(zzbnVar, zzuqVarZzi, zzbnVar5, zzuqVar4, j7, false);
                    if (z23) {
                        zzle zzleVar6 = this.zzz;
                        obj2 = zzleVar6.zzb.zza;
                        zzbn zzbnVar6 = zzleVar6.zza;
                        if (z23) {
                        }
                        long j10 = this.zzz.zzd;
                        if (zzbnVar.zza(obj2) != -1) {
                            i11 = 3;
                        }
                        this.zzz = zzD(zzuqVarZzi, jZzz, j3, j10, z, i11);
                    } else {
                        zzle zzleVar7 = this.zzz;
                        obj2 = zzleVar7.zzb.zza;
                        zzbn zzbnVar7 = zzleVar7.zza;
                        if (z23) {
                        }
                        long j11 = this.zzz.zzd;
                        if (zzbnVar.zza(obj2) != -1) {
                            i11 = 3;
                        }
                        this.zzz = zzD(zzuqVarZzi, jZzz, j3, j11, z, i11);
                    }
                    zzX();
                    zzZ(zzbnVar, this.zzz.zza);
                    this.zzz = this.zzz.zzg(zzbnVar);
                    if (!zzbnVar.zzo()) {
                        this.zzL = obj;
                    }
                    zzL(false);
                    this.zzi.zzi(2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i10 = 4;
                z19 = false;
                i11 = i10;
                obj = null;
                zzle zzleVar8 = this.zzz;
                zzbn zzbnVar8 = zzleVar8.zza;
                zzuq zzuqVar5 = zzleVar8.zzb;
                if (true != z14) {
                    j7 = -9223372036854775807L;
                } else {
                    j7 = jZzz;
                }
                zzal(zzbnVar, zzuqVarZzi, zzbnVar8, zzuqVar5, j7, false);
                if (z23 || j3 != this.zzz.zzc) {
                    zzle zzleVar9 = this.zzz;
                    obj2 = zzleVar9.zzb.zza;
                    zzbn zzbnVar9 = zzleVar9.zza;
                    boolean z24 = (z23 || !z4 || zzbnVar9.zzo() || zzbnVar9.zzn(obj2, this.zzm).zzf) ? false : true;
                    long j12 = this.zzz.zzd;
                    if (zzbnVar.zza(obj2) != -1) {
                        i11 = 3;
                    }
                    this.zzz = zzD(zzuqVarZzi, jZzz, j3, j12, z24, i11);
                }
                zzX();
                zzZ(zzbnVar, this.zzz.zza);
                this.zzz = this.zzz.zzg(zzbnVar);
                if (!zzbnVar.zzo()) {
                    this.zzL = obj;
                }
                zzL(false);
                this.zzi.zzi(2);
                throw th;
            }
        } else {
            i10 = 4;
            z19 = false;
        }
        zzlr[] zzlrVarArr = this.zzb;
        for (?? r7 = z19; r7 < 2; r7++) {
            zzlrVarArr[r7].zzu(zzbnVar);
        }
        try {
            if (z23) {
                i11 = i10;
                z11 = z19;
                if (!zzbnVar.zzo()) {
                    for (zzko zzkoVarZzj = this.zzr.zzj(); zzkoVarZzj != null; zzkoVarZzj = zzkoVarZzj.zzg()) {
                        if (zzkoVarZzj.zzg.zza.equals(zzuqVarZzi)) {
                            zzkoVarZzj.zzg = this.zzr.zzp(zzbnVar, zzkoVarZzj.zzg);
                            zzkoVarZzj.zzr();
                        }
                    }
                    jZzz = zzz(zzuqVarZzi, jZzz, z12);
                }
            } else {
                try {
                    i11 = i10;
                    z11 = z19;
                    try {
                        int iZzb2 = this.zzr.zzb(zzbnVar, this.zzM, this.zzr.zzn() == null ? 0L : zzw(this.zzr.zzn()), (!zzao() || this.zzr.zzm() == null) ? 0L : zzw(this.zzr.zzm()));
                        if ((iZzb2 & 1) != 0) {
                            try {
                                zzab(z11);
                                i14 = 2;
                            } catch (Throwable th4) {
                                th = th4;
                                obj = null;
                                zzle zzleVar10 = this.zzz;
                                zzbn zzbnVar10 = zzleVar10.zza;
                                zzuq zzuqVar6 = zzleVar10.zzb;
                                if (true != z14) {
                                    j7 = -9223372036854775807L;
                                } else {
                                    j7 = jZzz;
                                }
                                zzal(zzbnVar, zzuqVarZzi, zzbnVar10, zzuqVar6, j7, false);
                                if (z23) {
                                    zzle zzleVar11 = this.zzz;
                                    obj2 = zzleVar11.zzb.zza;
                                    zzbn zzbnVar11 = zzleVar11.zza;
                                    if (z23) {
                                    }
                                    long j13 = this.zzz.zzd;
                                    if (zzbnVar.zza(obj2) != -1) {
                                        i11 = 3;
                                    }
                                    this.zzz = zzD(zzuqVarZzi, jZzz, j3, j13, z24, i11);
                                } else {
                                    zzle zzleVar12 = this.zzz;
                                    obj2 = zzleVar12.zzb.zza;
                                    zzbn zzbnVar12 = zzleVar12.zza;
                                    if (z23) {
                                    }
                                    long j14 = this.zzz.zzd;
                                    if (zzbnVar.zza(obj2) != -1) {
                                        i11 = 3;
                                    }
                                    this.zzz = zzD(zzuqVarZzi, jZzz, j3, j14, z24, i11);
                                }
                                zzX();
                                zzZ(zzbnVar, this.zzz.zza);
                                this.zzz = this.zzz.zzg(zzbnVar);
                                if (!zzbnVar.zzo()) {
                                    this.zzL = obj;
                                }
                                zzL(false);
                                this.zzi.zzi(2);
                                throw th;
                            }
                        } else {
                            i14 = 2;
                            if ((iZzb2 & 2) != 0) {
                                zzE();
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i14 = 2;
                        obj = null;
                        zzle zzleVar13 = this.zzz;
                        zzbn zzbnVar13 = zzleVar13.zza;
                        zzuq zzuqVar7 = zzleVar13.zzb;
                        if (true != z14) {
                            j7 = -9223372036854775807L;
                        } else {
                            j7 = jZzz;
                        }
                        zzal(zzbnVar, zzuqVarZzi, zzbnVar13, zzuqVar7, j7, false);
                        if (z23) {
                            zzle zzleVar14 = this.zzz;
                            obj2 = zzleVar14.zzb.zza;
                            zzbn zzbnVar14 = zzleVar14.zza;
                            if (z23) {
                            }
                            long j15 = this.zzz.zzd;
                            if (zzbnVar.zza(obj2) != -1) {
                                i11 = 3;
                            }
                            this.zzz = zzD(zzuqVarZzi, jZzz, j3, j15, z24, i11);
                        } else {
                            zzle zzleVar15 = this.zzz;
                            obj2 = zzleVar15.zzb.zza;
                            zzbn zzbnVar15 = zzleVar15.zza;
                            if (z23) {
                            }
                            long j16 = this.zzz.zzd;
                            if (zzbnVar.zza(obj2) != -1) {
                                i11 = 3;
                            }
                            this.zzz = zzD(zzuqVarZzi, jZzz, j3, j16, z24, i11);
                        }
                        zzX();
                        zzZ(zzbnVar, this.zzz.zza);
                        this.zzz = this.zzz.zzg(zzbnVar);
                        if (!zzbnVar.zzo()) {
                            this.zzL = obj;
                        }
                        zzL(false);
                        this.zzi.zzi(2);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i11 = i10;
                    z11 = z19;
                }
            }
            zzle zzleVar16 = this.zzz;
            zzbn zzbnVar16 = zzleVar16.zza;
            zzuq zzuqVar8 = zzleVar16.zzb;
            long j17 = true != z14 ? -9223372036854775807L : jZzz;
            int i15 = i14;
            zzal(zzbnVar, zzuqVarZzi, zzbnVar16, zzuqVar8, j17, false);
            if (z23 || j3 != this.zzz.zzc) {
                zzle zzleVar17 = this.zzz;
                Object obj4 = zzleVar17.zzb.zza;
                zzbn zzbnVar17 = zzleVar17.zza;
                boolean z25 = (!z23 || !z4 || zzbnVar17.zzo() || zzbnVar17.zzn(obj4, this.zzm).zzf) ? z11 : true;
                long j18 = this.zzz.zzd;
                if (zzbnVar.zza(obj4) != -1) {
                    i11 = 3;
                }
                this.zzz = zzD(zzuqVarZzi, jZzz, j3, j18, z25, i11);
            }
            zzX();
            zzZ(zzbnVar, this.zzz.zza);
            this.zzz = this.zzz.zzg(zzbnVar);
            if (!zzbnVar.zzo()) {
                this.zzL = null;
            }
            zzL(z11);
            this.zzi.zzi(i15);
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
        zzko zzkoVarZzj = zzkfVar.zzr.zzj();
        while (true) {
            i7 = 0;
            if (zzkoVarZzj == null) {
                break;
            }
            zzyh[] zzyhVarArr = zzkoVarZzj.zzi().zzc;
            int length = zzyhVarArr.length;
            while (i7 < length) {
                zzyh zzyhVar = zzyhVarArr[i7];
                i7++;
            }
            zzkoVarZzj = zzkoVarZzj.zzg();
        }
        zzlr[] zzlrVarArr = zzkfVar.zzb;
        while (i7 < 2) {
            zzlrVarArr[i7].zzt(f7, zzbbVar.zzb);
            i7++;
        }
    }

    private final void zzP() {
        long jZze;
        long jZze2;
        boolean zZzh;
        if (zzat(this.zzr.zzi())) {
            zzko zzkoVarZzi = this.zzr.zzi();
            long jZzy = zzy(zzkoVarZzi.zzd());
            if (zzkoVarZzi == this.zzr.zzj()) {
                jZze = this.zzM;
                jZze2 = zzkoVarZzi.zze();
            } else {
                jZze = this.zzM - zzkoVarZzi.zze();
                jZze2 = zzkoVarZzi.zzg.zzb;
            }
            zzki zzkiVar = new zzki(this.zzu, this.zzz.zza, zzkoVarZzi.zzg.zza, jZze - jZze2, jZzy, this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, zzas(this.zzz.zza, zzkoVarZzi.zzg.zza) ? this.zzW.zzb() : -9223372036854775807L);
            boolean zZzh2 = this.zzg.zzh(zzkiVar);
            zzko zzkoVarZzj = this.zzr.zzj();
            if (zZzh2 || !zzkoVarZzj.zze || jZzy >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzkoVarZzj.zza.zzi(this.zzz.zzs, false);
                zZzh = this.zzg.zzh(zzkiVar);
            }
        } else {
            zZzh = false;
        }
        this.zzG = zZzh;
        if (zZzh) {
            zzko zzkoVarZzi2 = this.zzr.zzi();
            zzkoVarZzi2.getClass();
            zzkk zzkkVar = new zzkk();
            zzkkVar.zze(this.zzM - zzkoVarZzi2.zze());
            zzkkVar.zzf(this.zzo.zzc().zzb);
            zzkkVar.zzd(this.zzF);
            zzkoVarZzi2.zzk(new zzkm(zzkkVar, null));
        }
        zzai();
    }

    private final void zzQ() {
        this.zzr.zzt();
        zzko zzkoVarZzl = this.zzr.zzl();
        if (zzkoVarZzl != null) {
            if ((!zzkoVarZzl.zzd || zzkoVarZzl.zze) && !zzkoVarZzl.zza.zzp()) {
                if (this.zzg.zzi(this.zzz.zza, zzkoVarZzl.zzg.zza, zzkoVarZzl.zze ? zzkoVarZzl.zza.zzb() : 0L)) {
                    if (!zzkoVarZzl.zzd) {
                        zzkoVarZzl.zzm(this, zzkoVarZzl.zzg.zzb);
                        return;
                    }
                    zzkk zzkkVar = new zzkk();
                    zzkkVar.zze(this.zzM - zzkoVarZzl.zze());
                    zzkkVar.zzf(this.zzo.zzc().zzb);
                    zzkkVar.zzd(this.zzF);
                    zzkoVarZzl.zzk(new zzkm(zzkkVar, null));
                }
            }
        }
    }

    private final void zzR() {
        this.zzA.zzb(this.zzz);
        if (this.zzA.zze) {
            zziw zziwVar = this.zzV;
            zziwVar.zza.zzab(this.zzA);
            this.zzA = new zzkc(this.zzz);
        }
    }

    private final void zzS(int i7) throws Throwable {
        zzlr zzlrVar = this.zzb[i7];
        try {
            zzko zzkoVarZzj = this.zzr.zzj();
            if (zzkoVarZzj == null) {
                throw null;
            }
            zzlrVar.zzm(zzkoVarZzj);
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
                    zzkf zzkfVar = this.zza;
                    int i8 = i7;
                    zzkfVar.zzv.zzJ(i8, zzkfVar.zzb[i8].zzb(), z4);
                }
            });
        }
    }

    private final void zzU() throws zzia {
        int i7;
        boolean z4;
        float f7 = this.zzo.zzc().zzb;
        zzkr zzkrVar = this.zzr;
        zzko zzkoVarZzj = zzkrVar.zzj();
        zzko zzkoVarZzn = zzkrVar.zzn();
        zzyo zzyoVar = null;
        boolean z7 = true;
        while (zzkoVarZzj != null && zzkoVarZzj.zze) {
            zzle zzleVar = this.zzz;
            zzyo zzyoVarZzj = zzkoVarZzj.zzj(f7, zzleVar.zza, zzleVar.zzl);
            zzyo zzyoVar2 = zzkoVarZzj == this.zzr.zzj() ? zzyoVarZzj : zzyoVar;
            zzyo zzyoVarZzi = zzkoVarZzj.zzi();
            boolean z8 = false;
            if (zzyoVarZzi != null) {
                if (zzyoVarZzi.zzc.length == zzyoVarZzj.zzc.length) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= zzyoVarZzj.zzc.length) {
                            if (zzkoVarZzj != zzkoVarZzn) {
                                z8 = true;
                            }
                            z7 &= z8;
                            zzkoVarZzj = zzkoVarZzj.zzg();
                            zzyoVar = zzyoVar2;
                        } else if (zzyoVarZzj.zza(zzyoVarZzi, i8)) {
                            i8++;
                        }
                    }
                }
            }
            if (z7) {
                zzkr zzkrVar2 = this.zzr;
                zzko zzkoVarZzj2 = zzkrVar2.zzj();
                int iZza = zzkrVar2.zza(zzkoVarZzj2) & 1;
                boolean[] zArr = new boolean[2];
                zzyoVar2.getClass();
                long jZzb = zzkoVarZzj2.zzb(zzyoVar2, this.zzz.zzs, 1 == iZza, zArr);
                zzle zzleVar2 = this.zzz;
                boolean z9 = (zzleVar2.zze == 4 || jZzb == zzleVar2.zzs) ? false : true;
                zzle zzleVar3 = this.zzz;
                i7 = 2;
                this.zzz = zzD(zzleVar3.zzb, jZzb, zzleVar3.zzc, zzleVar3.zzd, z9, 5);
                if (z9) {
                    zzY(jZzb);
                }
                zzE();
                boolean[] zArr2 = new boolean[2];
                int i9 = 0;
                while (true) {
                    zzlr[] zzlrVarArr = this.zzb;
                    if (i9 >= 2) {
                        break;
                    }
                    int iZza2 = zzlrVarArr[i9].zza();
                    zArr2[i9] = this.zzb[i9].zzH();
                    this.zzb[i9].zzj(zzkoVarZzj2.zzc[i9], this.zzo, this.zzM, zArr[i9]);
                    if (iZza2 - this.zzb[i9].zza() > 0) {
                        zzT(i9, false);
                    }
                    this.zzK -= iZza2 - this.zzb[i9].zza();
                    i9++;
                }
                zzJ(zArr2, this.zzM);
                z4 = true;
                zzkoVarZzj2.zzh = true;
            } else {
                i7 = 2;
                this.zzr.zza(zzkoVarZzj);
                if (zzkoVarZzj.zze) {
                    long jMax = Math.max(zzkoVarZzj.zzg.zzb, this.zzM - zzkoVarZzj.zze());
                    if (this.zzx && zzao() && this.zzr.zzm() == zzkoVarZzj) {
                        zzE();
                    }
                    zzkoVarZzj.zza(zzyoVarZzj, jMax, false);
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

    private final void zzV() throws zzia {
        zzU();
        zzab(true);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[PHI: r2 r7 r9
      0x0092: PHI (r2v2 com.google.android.gms.internal.ads.zzuq) = (r2v1 com.google.android.gms.internal.ads.zzuq), (r2v11 com.google.android.gms.internal.ads.zzuq) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r9v2 long) = (r9v1 long), (r9v5 long) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db A[PHI: r0
      0x00db: PHI (r0v11 com.google.android.gms.internal.ads.zzbn) = 
      (r0v10 com.google.android.gms.internal.ads.zzbn)
      (r0v10 com.google.android.gms.internal.ads.zzbn)
      (r0v16 com.google.android.gms.internal.ads.zzbn)
      (r0v16 com.google.android.gms.internal.ads.zzbn)
     binds: [B:31:0x009f, B:33:0x00a3, B:35:0x00b4, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzW(boolean z4, boolean z7, boolean z8, boolean z9) {
        boolean z10;
        zzbn zzbnVar;
        zzuq zzuqVar;
        this.zzi.zzf(2);
        this.zzQ = null;
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
        long jLongValue = zzleVar.zzs;
        long j = (this.zzz.zzb.zzb() || zzaq(this.zzz, this.zzm)) ? this.zzz.zzc : this.zzz.zzs;
        if (z7) {
            this.zzL = null;
            Pair pairZzB = zzB(this.zzz.zza);
            zzuqVar2 = (zzuq) pairZzB.first;
            jLongValue = ((Long) pairZzB.second).longValue();
            j = -9223372036854775807L;
            z10 = zzuqVar2.equals(this.zzz.zzb) ? false : true;
        }
        long j3 = jLongValue;
        long j7 = j;
        this.zzr.zzs();
        this.zzG = false;
        zzbn zzbnVarZzx = this.zzz.zza;
        if (z8 && (zzbnVarZzx instanceof zzlk)) {
            zzbnVarZzx = ((zzlk) zzbnVarZzx).zzx(this.zzs.zzq());
            if (zzuqVar2.zzb != -1) {
                zzbnVarZzx.zzn(zzuqVar2.zza, this.zzm);
                zzbl zzblVar = this.zzm;
                zzbm zzbmVar = this.zzl;
                zzbnVarZzx.zze(zzblVar.zzc, zzbmVar, 0L);
                if (zzbmVar.zzb()) {
                    zzbnVar = zzbnVarZzx;
                    zzuqVar = new zzuq(zzuqVar2.zza, zzuqVar2.zzd);
                } else {
                    zzbnVar = zzbnVarZzx;
                    zzuqVar = zzuqVar2;
                }
            } else {
                zzbnVar = zzbnVarZzx;
                zzuqVar = zzuqVar2;
            }
        } else {
            zzbnVar = zzbnVarZzx;
            zzuqVar = zzuqVar2;
        }
        zzle zzleVar2 = this.zzz;
        int i8 = zzleVar2.zze;
        zzia zziaVar = z9 ? null : zzleVar2.zzf;
        zzwv zzwvVar = z10 ? zzwv.zza : zzleVar2.zzh;
        zzyo zzyoVar = z10 ? this.zzf : zzleVar2.zzi;
        List listZzn = z10 ? zzfwh.zzn() : zzleVar2.zzj;
        zzle zzleVar3 = this.zzz;
        this.zzz = new zzle(zzbnVar, zzuqVar, j7, j3, i8, zziaVar, false, zzwvVar, zzyoVar, listZzn, zzuqVar, zzleVar3.zzl, zzleVar3.zzm, zzleVar3.zzn, zzleVar3.zzo, j3, 0L, j3, 0L, false);
        if (z8) {
            this.zzr.zzv();
            this.zzs.zzh();
        }
    }

    private final void zzX() {
        zzko zzkoVarZzj = this.zzr.zzj();
        boolean z4 = false;
        if (zzkoVarZzj != null && zzkoVarZzj.zzg.zzi && this.zzC) {
            z4 = true;
        }
        this.zzD = z4;
    }

    private final void zzY(long j) {
        zzko zzkoVarZzj = this.zzr.zzj();
        long jZze = j + (zzkoVarZzj == null ? 1000000000000L : zzkoVarZzj.zze());
        this.zzM = jZze;
        this.zzo.zzf(jZze);
        zzlr[] zzlrVarArr = this.zzb;
        for (int i7 = 0; i7 < 2; i7++) {
            zzlrVarArr[i7].zzq(zzkoVarZzj, this.zzM);
        }
        for (zzko zzkoVarZzj2 = this.zzr.zzj(); zzkoVarZzj2 != null; zzkoVarZzj2 = zzkoVarZzj2.zzg()) {
            for (zzyh zzyhVar : zzkoVarZzj2.zzi().zzc) {
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

    private final void zzab(boolean z4) throws zzia {
        zzuq zzuqVar = this.zzr.zzj().zzg.zza;
        long jZzA = zzA(zzuqVar, this.zzz.zzs, true, false);
        if (jZzA != this.zzz.zzs) {
            zzle zzleVar = this.zzz;
            this.zzz = zzD(zzuqVar, jZzA, zzleVar.zzc, zzleVar.zzd, z4, 5);
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
        for (zzko zzkoVarZzj = this.zzr.zzj(); zzkoVarZzj != null; zzkoVarZzj = zzkoVarZzj.zzg()) {
            for (zzyh zzyhVar : zzkoVarZzj.zzi().zzc) {
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
        zzko zzkoVarZzj = this.zzr.zzj();
        if (zzkoVarZzj == null) {
            return;
        }
        zzyo zzyoVarZzi = zzkoVarZzj.zzi();
        for (int i7 = 0; i7 < 2; i7++) {
            if (zzyoVarZzi.zzb(i7)) {
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
        zzko zzkoVarZzi = this.zzr.zzi();
        boolean z4 = true;
        if (!this.zzG && (zzkoVarZzi == null || !zzkoVarZzi.zza.zzp())) {
            z4 = false;
        }
        zzle zzleVar = this.zzz;
        if (z4 != zzleVar.zzg) {
            this.zzz = zzleVar.zza(z4);
        }
    }

    private final void zzaj(zzuq zzuqVar, zzwv zzwvVar, zzyo zzyoVar) {
        long jZze;
        long jZze2;
        zzko zzkoVarZzi = this.zzr.zzi();
        zzkoVarZzi.getClass();
        if (zzkoVarZzi == this.zzr.zzj()) {
            jZze = this.zzM;
            jZze2 = zzkoVarZzi.zze();
        } else {
            jZze = this.zzM - zzkoVarZzi.zze();
            jZze2 = zzkoVarZzi.zzg.zzb;
        }
        this.zzg.zzf(new zzki(this.zzu, this.zzz.zza, zzuqVar, jZze - jZze2, zzy(zzkoVarZzi.zzc()), this.zzo.zzc().zzb, this.zzz.zzl, this.zzE, zzas(this.zzz.zza, zzkoVarZzi.zzg.zza) ? this.zzW.zzb() : -9223372036854775807L), zzwvVar, zzyoVar.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ae, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzak() {
        zzkb zzkbVar;
        zzko zzkoVarZzj = this.zzr.zzj();
        if (zzkoVarZzj == null) {
            return;
        }
        long jZzd = zzkoVarZzj.zze ? zzkoVarZzj.zza.zzd() : -9223372036854775807L;
        if (jZzd != -9223372036854775807L) {
            if (!zzkoVarZzj.zzs()) {
                this.zzr.zza(zzkoVarZzj);
                zzL(false);
                zzP();
            }
            zzY(jZzd);
            if (jZzd != this.zzz.zzs) {
                zzle zzleVar = this.zzz;
                this.zzz = zzD(zzleVar.zzb, jZzd, zzleVar.zzc, jZzd, true, 5);
            }
        } else {
            long jZzb = this.zzo.zzb(zzkoVarZzj != this.zzr.zzn());
            this.zzM = jZzb;
            long jZze = jZzb - zzkoVarZzj.zze();
            long j = this.zzz.zzs;
            if (!this.zzp.isEmpty() && !this.zzz.zzb.zzb()) {
                if (this.zzP) {
                    j--;
                    this.zzP = false;
                }
                zzle zzleVar2 = this.zzz;
                int iZza = zzleVar2.zza.zza(zzleVar2.zzb.zza);
                int iMin = Math.min(this.zzO, this.zzp.size());
                if (iMin > 0) {
                    zzkbVar = (zzkb) this.zzp.get(iMin - 1);
                    while (zzkbVar != null && (iZza < 0 || (iZza == 0 && j < 0))) {
                        int i7 = iMin - 1;
                        if (i7 > 0) {
                            zzkbVar = (zzkb) this.zzp.get(iMin - 2);
                            iMin = i7;
                        } else {
                            iMin = i7;
                            zzkbVar = null;
                        }
                    }
                    if (iMin < this.zzp.size()) {
                    }
                    this.zzO = iMin;
                } else {
                    zzkbVar = null;
                }
            }
            if (this.zzo.zzj()) {
                boolean z4 = !this.zzA.zzc;
                zzle zzleVar3 = this.zzz;
                this.zzz = zzD(zzleVar3.zzb, jZze, zzleVar3.zzc, jZze, z4, 6);
            } else {
                zzle zzleVar4 = this.zzz;
                zzleVar4.zzs = jZze;
                zzleVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzz.zzq = this.zzr.zzi().zzc();
        this.zzz.zzr = zzx();
        zzle zzleVar5 = this.zzz;
        if (zzleVar5.zzl && zzleVar5.zze == 3 && zzas(zzleVar5.zza, zzleVar5.zzb)) {
            zzle zzleVar6 = this.zzz;
            if (zzleVar6.zzo.zzb == 1.0f) {
                float fZza = this.zzW.zza(zzv(zzleVar6.zza, zzleVar6.zzb.zza, zzleVar6.zzs), this.zzz.zzr);
                if (this.zzo.zzc().zzb != fZza) {
                    zzac(new zzbb(fZza, this.zzz.zzo.zzc));
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
        long jElapsedRealtime = -9223372036854775807L;
        if (z4 && !z7) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzF = jElapsedRealtime;
    }

    private final synchronized void zzan(zzftz zzftzVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z4 = false;
        while (!((Boolean) zzftzVar.zza()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
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
        zzko zzkoVarZzj = this.zzr.zzj();
        long j = zzkoVarZzj.zzg.zze;
        if (!zzkoVarZzj.zze) {
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
        int iZza = zzbnVar.zza(obj);
        int iZzb = zzbnVar.zzb();
        int iZzi = iZza;
        int iZza2 = -1;
        for (int i9 = 0; i9 < iZzb && iZza2 == -1; i9++) {
            iZzi = zzbnVar.zzi(iZzi, zzblVar, zzbmVar, i7, z4);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzbnVar2.zza(zzbnVar.zzf(iZzi));
        }
        if (iZza2 == -1) {
            return -1;
        }
        return zzbnVar2.zzd(iZza2, zzblVar, false).zzc;
    }

    public static /* synthetic */ zzko zzd(zzkf zzkfVar, zzkp zzkpVar, long j) {
        zzyw zzywVarZzk = zzkfVar.zzg.zzk();
        long j3 = zzkfVar.zzS.zzb;
        zzyo zzyoVar = zzkfVar.zzf;
        zzld zzldVar = zzkfVar.zzs;
        return new zzko(zzkfVar.zzc, j, zzkfVar.zze, zzywVarZzk, zzldVar, zzkpVar, zzyoVar, -9223372036854775807L);
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
        long jZze = zzkoVar.zze();
        if (zzkoVar.zze) {
            int i7 = 0;
            while (true) {
                zzlr[] zzlrVarArr = this.zzb;
                if (i7 >= 2) {
                    break;
                }
                if (zzlrVarArr[i7].zzG(zzkoVar)) {
                    long jZzd = this.zzb[i7].zzd(zzkoVar);
                    if (jZzd == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZze = Math.max(jZzd, jZze);
                }
                i7++;
            }
        }
        return jZze;
    }

    private final long zzx() {
        return zzy(this.zzz.zzq);
    }

    private final long zzy(long j) {
        zzko zzkoVarZzi = this.zzr.zzi();
        if (zzkoVarZzi == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzM - zzkoVarZzi.zze()));
    }

    private final long zzz(zzuq zzuqVar, long j, boolean z4) {
        zzkr zzkrVar = this.zzr;
        return zzA(zzuqVar, j, zzkrVar.zzj() != zzkrVar.zzn(), z4);
    }

    /* JADX WARN: Code duplicated, block: B:298:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:300:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:301:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:302:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:316:0x0604  */
    /* JADX WARN: Code duplicated, block: B:331:0x063e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0642  */
    /* JADX WARN: Code duplicated, block: B:335:0x0650  */
    /* JADX WARN: Code duplicated, block: B:338:0x0666 A[ADDED_TO_REGION, LOOP:4: B:338:0x0666->B:341:0x066e, LOOP_START, PHI: r3
      0x0666: PHI (r3v8 com.google.android.gms.internal.ads.zzko) = (r3v6 com.google.android.gms.internal.ads.zzko), (r3v9 com.google.android.gms.internal.ads.zzko) binds: [B:336:0x0663, B:341:0x066e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:339:0x0668  */
    /* JADX WARN: Code duplicated, block: B:344:0x067f  */
    /* JADX WARN: Code duplicated, block: B:345:0x0689  */
    /* JADX WARN: Code duplicated, block: B:347:0x068d  */
    /* JADX WARN: Code duplicated, block: B:350:0x069e  */
    /* JADX WARN: Code duplicated, block: B:352:0x06aa A[LOOP:5: B:352:0x06aa->B:354:0x06b6, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:354:0x06b6 A[LOOP:5: B:352:0x06aa->B:354:0x06b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:381:0x06bc A[SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        RuntimeException runtimeException;
        IOException iOException;
        IOException iOException2;
        zzrj zzrjVar;
        zzia zziaVarZza;
        zzfy zzfyVar;
        zzaz zzazVar;
        int i7;
        zzia zziaVar;
        zzia zziaVar2;
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzlr[] zzlrVarArr;
        int i8;
        zzkr zzkrVar3;
        zzko zzkoVarZzm;
        zzko zzkoVarZzj;
        int i9;
        zzko zzkoVarZzn;
        zzlr[] zzlrVarArr2;
        int i10;
        zzuq zzuqVar;
        int i11;
        long j;
        long j3;
        zzuq zzuqVar2;
        boolean z4;
        Throwable th;
        long j7;
        long jZza;
        long j8;
        zzle zzleVar;
        int i12;
        zzle zzleVarZzD;
        boolean z7 = true;
        try {
            try {
                try {
                    switch (message.what) {
                        case 1:
                            z7 = true;
                            boolean z8 = message.arg1 != 0;
                            int i13 = message.arg2;
                            zzad(z8, i13 >> 4, true, i13 & 15);
                            zzR();
                            return z7;
                        case 2:
                            z7 = true;
                            zzG();
                            zzR();
                            return z7;
                        case 3:
                            z7 = true;
                            zzkd zzkdVar = (zzkd) message.obj;
                            this.zzA.zza(1);
                            Pair pairZzC = zzC(this.zzz.zza, zzkdVar, true, this.zzH, this.zzI, this.zzl, this.zzm);
                            if (pairZzC == null) {
                                Pair pairZzB = zzB(this.zzz.zza);
                                zzuqVar2 = (zzuq) pairZzB.first;
                                long jLongValue = ((Long) pairZzB.second).longValue();
                                z4 = !this.zzz.zza.zzo();
                                j = -9223372036854775807L;
                                j3 = jLongValue;
                            } else {
                                Object obj = pairZzC.first;
                                long jLongValue2 = ((Long) pairZzC.second).longValue();
                                long j9 = zzkdVar.zzc == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
                                zzuq zzuqVarZzq = this.zzr.zzq(this.zzz.zza, obj, jLongValue2);
                                if (zzuqVarZzq.zzb()) {
                                    this.zzz.zza.zzn(zzuqVarZzq.zza, this.zzm);
                                    if (this.zzm.zze(zzuqVarZzq.zzb) == zzuqVarZzq.zzc) {
                                        this.zzm.zzh();
                                    }
                                    j = j9;
                                    zzuqVar2 = zzuqVarZzq;
                                    z4 = true;
                                    j3 = 0;
                                } else {
                                    j = j9;
                                    j3 = jLongValue2;
                                    zzuqVar2 = zzuqVarZzq;
                                    z4 = zzkdVar.zzc == -9223372036854775807L;
                                }
                            }
                            try {
                                if (!this.zzz.zza.zzo()) {
                                    if (pairZzC == null) {
                                        if (this.zzz.zze != 1) {
                                            zzae(4);
                                        }
                                        zzW(false, true, false, true);
                                    } else {
                                        if (zzuqVar2.equals(this.zzz.zzb)) {
                                            zzko zzkoVarZzj2 = this.zzr.zzj();
                                            jZza = (zzkoVarZzj2 == null || !zzkoVarZzj2.zze || j3 == 0) ? j3 : zzkoVarZzj2.zza.zza(j3, this.zzy);
                                            if (zzen.zzv(jZza) == zzen.zzv(this.zzz.zzs) && ((i12 = (zzleVar = this.zzz).zze) == 2 || i12 == 3)) {
                                                long j10 = zzleVar.zzs;
                                                zzleVarZzD = zzD(zzuqVar2, j10, j, j10, z4, 2);
                                            }
                                        } else {
                                            jZza = j3;
                                        }
                                        long jZzz = zzz(zzuqVar2, jZza, this.zzz.zze == 4);
                                        z4 |= j3 != jZzz;
                                        try {
                                            zzle zzleVar2 = this.zzz;
                                            zzbn zzbnVar = zzleVar2.zza;
                                            zzal(zzbnVar, zzuqVar2, zzbnVar, zzleVar2.zzb, j, true);
                                            j8 = jZzz;
                                            zzleVarZzD = zzD(zzuqVar2, j8, j, j8, z4, 2);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j7 = jZzz;
                                            this.zzz = zzD(zzuqVar2, j7, j, j7, z4, 2);
                                            throw th;
                                        }
                                    }
                                    this.zzz = zzleVarZzD;
                                    zzR();
                                    return z7;
                                }
                                this.zzL = zzkdVar;
                                j8 = j3;
                                zzleVarZzD = zzD(zzuqVar2, j8, j, j8, z4, 2);
                                this.zzz = zzleVarZzD;
                                zzR();
                                return z7;
                            } catch (Throwable th3) {
                                th = th3;
                                j7 = j3;
                            }
                            break;
                        case 4:
                            z7 = true;
                            zzac((zzbb) message.obj);
                            zzN(this.zzo.zzc(), true);
                            zzR();
                            return z7;
                        case 5:
                            z7 = true;
                            this.zzy = (zzls) message.obj;
                            zzR();
                            return z7;
                        case 6:
                            z7 = true;
                            zzag(false, true);
                            zzR();
                            return z7;
                        case 7:
                            try {
                                zzW(true, false, true, false);
                                for (int i14 = 0; i14 < 2; i14++) {
                                    this.zzc[i14].zzq();
                                    this.zzb[i14].zzn();
                                }
                                this.zzg.zzd(this.zzu);
                                this.zze.zzj();
                                zzae(1);
                                this.zzj.zzb();
                                synchronized (this) {
                                    this.zzB = true;
                                    notifyAll();
                                    break;
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
                                zzko zzkoVarZzi = this.zzr.zzi();
                                if (zzkoVarZzi == null) {
                                    throw null;
                                }
                                if (!zzkoVarZzi.zze) {
                                    float f7 = this.zzo.zzc().zzb;
                                    zzle zzleVar3 = this.zzz;
                                    zzkoVarZzi.zzl(f7, zzleVar3.zza, zzleVar3.zzl);
                                }
                                zzaj(zzkoVarZzi.zzg.zza, zzkoVarZzi.zzh(), zzkoVarZzi.zzi());
                                if (zzkoVarZzi == this.zzr.zzj()) {
                                    zzY(zzkoVarZzi.zzg.zzb);
                                    zzI();
                                    zzkoVarZzi.zzh = true;
                                    zzle zzleVar4 = this.zzz;
                                    zzuq zzuqVar3 = zzleVar4.zzb;
                                    long j11 = zzkoVarZzi.zzg.zzb;
                                    this.zzz = zzD(zzuqVar3, j11, zzleVar4.zzc, j11, false, 5);
                                }
                                zzP();
                                zzazVar = e;
                                if (zzazVar.zzb != z7) {
                                    i11 = zzbbd.zzq.zzf;
                                } else if (true != zzazVar.zza) {
                                    i11 = 3003;
                                } else {
                                    i11 = 3001;
                                }
                                zzK(zzazVar, i11);
                            } else {
                                z7 = true;
                                zzko zzkoVarZzk = this.zzr.zzk(zzuoVar);
                                if (zzkoVarZzk != null) {
                                    zzcv.zzf(!zzkoVarZzk.zze);
                                    float f8 = this.zzo.zzc().zzb;
                                    zzle zzleVar5 = this.zzz;
                                    zzkoVarZzk.zzl(f8, zzleVar5.zza, zzleVar5.zzl);
                                    if (this.zzr.zzz(zzuoVar)) {
                                        zzQ();
                                    }
                                }
                            }
                            zzR();
                            return z7;
                        case 9:
                            zzuo zzuoVar2 = (zzuo) message.obj;
                            if (this.zzr.zzy(zzuoVar2)) {
                                this.zzr.zzu(this.zzM);
                                zzP();
                            } else if (this.zzr.zzz(zzuoVar2)) {
                                zzQ();
                            }
                            z7 = true;
                            zzR();
                            return z7;
                        case 10:
                            zzU();
                            z7 = true;
                            zzR();
                            return z7;
                        case 11:
                            int i15 = message.arg1;
                            this.zzH = i15;
                            int iZzc = this.zzr.zzc(this.zzz.zza, i15);
                            if ((iZzc & 1) != 0) {
                                zzab(true);
                            } else if ((iZzc & 2) != 0) {
                                zzE();
                            }
                            zzL(false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 12:
                            boolean z9 = message.arg1 != 0;
                            this.zzI = z9;
                            int iZzd = this.zzr.zzd(this.zzz.zza, z9);
                            if ((iZzd & 1) != 0) {
                                zzab(true);
                            } else if ((iZzd & 2) != 0) {
                                zzE();
                            }
                            zzL(false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 13:
                            boolean z10 = message.arg1 != 0;
                            AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                            if (this.zzJ != z10) {
                                this.zzJ = z10;
                                if (!z10) {
                                    zzlr[] zzlrVarArr3 = this.zzb;
                                    for (int i16 = 0; i16 < 2; i16++) {
                                        zzlrVarArr3[i16].zzp();
                                    }
                                }
                            }
                            if (atomicBoolean != null) {
                                synchronized (this) {
                                    atomicBoolean.set(true);
                                    notifyAll();
                                    break;
                                }
                            }
                            z7 = true;
                            zzR();
                            return z7;
                        case 14:
                            zzli zzliVar = (zzli) message.obj;
                            if (zzliVar.zzb() == this.zzk) {
                                zzau(zzliVar);
                                int i17 = this.zzz.zze;
                                if (i17 == 3 || i17 == 2) {
                                    this.zzi.zzi(2);
                                }
                            } else {
                                this.zzi.zzc(15, zzliVar).zza();
                            }
                            z7 = true;
                            zzR();
                            return z7;
                        case 15:
                            final zzli zzliVar2 = (zzli) message.obj;
                            Looper looperZzb = zzliVar2.zzb();
                            if (looperZzb.getThread().isAlive()) {
                                this.zzq.zzd(looperZzb, null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzkf.zzf(this.zza, zzliVar2);
                                    }
                                });
                            } else {
                                zzdq.zzf("TAG", "Trying to send message on a dead thread.");
                                zzliVar2.zzh(false);
                            }
                            z7 = true;
                            zzR();
                            return z7;
                        case 16:
                            zzN((zzbb) message.obj, false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 17:
                            zzjz zzjzVar = (zzjz) message.obj;
                            this.zzA.zza(1);
                            if (zzjzVar.zzb != -1) {
                                this.zzL = new zzkd(new zzlk(zzjzVar.zza, zzjzVar.zzd), zzjzVar.zzb, zzjzVar.zzc);
                            }
                            zzM(this.zzs.zzn(zzjzVar.zza, zzjzVar.zzd), false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 18:
                            zzjz zzjzVar2 = (zzjz) message.obj;
                            int iZza = message.arg1;
                            this.zzA.zza(1);
                            zzld zzldVar = this.zzs;
                            if (iZza == -1) {
                                iZza = zzldVar.zza();
                            }
                            zzM(zzldVar.zzk(iZza, zzjzVar2.zza, zzjzVar2.zzd), false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 19:
                            zzka zzkaVar = (zzka) message.obj;
                            this.zzA.zza(1);
                            zzld zzldVar2 = this.zzs;
                            int i18 = zzkaVar.zza;
                            zzM(zzldVar2.zzl(0, 0, 0, null), false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 20:
                            int i19 = message.arg1;
                            int i20 = message.arg2;
                            zzwn zzwnVar = (zzwn) message.obj;
                            this.zzA.zza(1);
                            zzM(this.zzs.zzm(i19, i20, zzwnVar), false);
                            z7 = true;
                            zzR();
                            return z7;
                        case zzbbd.zzt.zzm /* 21 */:
                            zzwn zzwnVar2 = (zzwn) message.obj;
                            this.zzA.zza(1);
                            zzM(this.zzs.zzo(zzwnVar2), false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 22:
                            zzM(this.zzs.zzb(), true);
                            z7 = true;
                            zzR();
                            return z7;
                        case 23:
                            this.zzC = message.arg1 != 0;
                            zzX();
                            if (this.zzD && this.zzr.zzn() != this.zzr.zzj()) {
                                zzab(true);
                                zzL(false);
                            }
                            z7 = true;
                            zzR();
                            return z7;
                        case 24:
                        default:
                            return false;
                        case 25:
                            zzV();
                            z7 = true;
                            zzR();
                            return z7;
                        case 26:
                            zzV();
                            z7 = true;
                            zzR();
                            return z7;
                        case 27:
                            int i21 = message.arg1;
                            int i22 = message.arg2;
                            List list = (List) message.obj;
                            this.zzA.zza(1);
                            zzM(this.zzs.zzc(i21, i22, list), false);
                            z7 = true;
                            zzR();
                            return z7;
                        case 28:
                            zzik zzikVar = (zzik) message.obj;
                            this.zzS = zzikVar;
                            this.zzr.zzw(this.zzz.zza, zzikVar);
                            z7 = true;
                            zzR();
                            return z7;
                        case 29:
                            this.zzA.zza(1);
                            zzW(false, false, false, true);
                            this.zzg.zzc(this.zzu);
                            zzae(true != this.zzz.zza.zzo() ? 2 : 4);
                            this.zzs.zzg(this.zzh.zze());
                            this.zzi.zzi(2);
                            z7 = true;
                            zzR();
                            return z7;
                        case 30:
                            Pair pair = (Pair) message.obj;
                            Object obj2 = pair.first;
                            AtomicBoolean atomicBoolean2 = (AtomicBoolean) pair.second;
                            zzlr[] zzlrVarArr4 = this.zzb;
                            for (int i23 = 0; i23 < 2; i23++) {
                                zzlrVarArr4[i23].zzv(obj2);
                            }
                            int i24 = this.zzz.zze;
                            if (i24 == 3 || i24 == 2) {
                                this.zzi.zzi(2);
                            }
                            if (atomicBoolean2 != null) {
                                synchronized (this) {
                                    atomicBoolean2.set(true);
                                    notifyAll();
                                    break;
                                }
                            }
                            z7 = true;
                            zzR();
                            return z7;
                        case 31:
                            this.zze.zzk((zze) message.obj);
                            z7 = true;
                            zzR();
                            return z7;
                        case 32:
                            float fFloatValue = ((Float) message.obj).floatValue();
                            zzlr[] zzlrVarArr5 = this.zzb;
                            for (int i25 = 0; i25 < 2; i25++) {
                                zzlrVarArr5[i25].zzw(fFloatValue);
                            }
                            z7 = true;
                            zzR();
                            return z7;
                    }
                } catch (zzaz e7) {
                    zzazVar = e7;
                    if (zzazVar.zzb != z7) {
                        i11 = zzbbd.zzq.zzf;
                    } else if (true != zzazVar.zza) {
                        i11 = 3003;
                    } else {
                        i11 = 3001;
                    }
                    zzK(zzazVar, i11);
                } catch (zzfy e8) {
                    zzfyVar = e8;
                    zzK(zzfyVar, zzfyVar.zza);
                } catch (zzia e9) {
                    zziaVarZza = e9;
                    if (zziaVarZza.zzc == z7 && (zzkoVarZzn = this.zzr.zzn()) != null && zziaVarZza.zzh == null) {
                        zzlrVarArr2 = this.zzb;
                        i10 = zziaVarZza.zze;
                        if (zzlrVarArr2[i10 % 2].zzI(i10) || zzkoVarZzn.zzg() == null) {
                            zzuqVar = zzkoVarZzn.zzg.zza;
                        } else {
                            zzuqVar = zzkoVarZzn.zzg().zzg.zza;
                        }
                        zziaVarZza = zziaVarZza.zza(zzuqVar);
                    }
                    if (!zziaVarZza.zzi && (this.zzQ == null || (i9 = zziaVarZza.zza) == 5004 || i9 == 5003)) {
                        zzdq.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zziaVarZza);
                        zzia zziaVar3 = this.zzQ;
                        if (zziaVar3 != null) {
                            zziaVar3.addSuppressed(zziaVarZza);
                            zziaVarZza = this.zzQ;
                        } else {
                            this.zzQ = zziaVarZza;
                        }
                        zzdj zzdjVar = this.zzi;
                        zzdjVar.zzk(zzdjVar.zzc(25, zziaVarZza));
                    } else if (zziaVarZza.zzc == z7) {
                        zzlrVarArr = this.zzb;
                        i8 = zziaVarZza.zze;
                        if (zzlrVarArr[i8 % 2].zzI(i8)) {
                            this.zzU = z7;
                            zzE();
                            zzkrVar3 = this.zzr;
                            zzkoVarZzm = zzkrVar3.zzm();
                            zzkoVarZzj = zzkrVar3.zzj();
                            if (zzkrVar3.zzj() != zzkoVarZzm) {
                                while (zzkoVarZzj != null && zzkoVarZzj.zzg() != zzkoVarZzm) {
                                    zzkoVarZzj = zzkoVarZzj.zzg();
                                }
                            }
                            this.zzr.zza(zzkoVarZzj);
                            if (this.zzz.zze != 4) {
                                zzP();
                                this.zzi.zzi(2);
                            }
                        } else {
                            zziaVar = this.zzQ;
                            if (zziaVar != null) {
                                zziaVar.addSuppressed(zziaVarZza);
                                zziaVarZza = this.zzQ;
                            }
                            zziaVar2 = zziaVarZza;
                            zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar2);
                            if (zziaVar2.zzc == z7) {
                                zzkrVar = this.zzr;
                                if (zzkrVar.zzj() != zzkrVar.zzn()) {
                                    while (true) {
                                        zzkrVar2 = this.zzr;
                                        if (zzkrVar2.zzj() != zzkrVar2.zzn()) {
                                            this.zzr.zze();
                                        } else {
                                            zzko zzkoVarZzj3 = this.zzr.zzj();
                                            zzkoVarZzj3.getClass();
                                            zzR();
                                            zzkp zzkpVar = zzkoVarZzj3.zzg;
                                            zzuq zzuqVar4 = zzkpVar.zza;
                                            long j12 = zzkpVar.zzb;
                                            this.zzz = zzD(zzuqVar4, j12, zzkpVar.zzc, j12, true, 0);
                                        }
                                    }
                                }
                            }
                            zzag(z7, false);
                            this.zzz = this.zzz.zze(zziaVar2);
                        }
                    } else {
                        zziaVar = this.zzQ;
                        if (zziaVar != null) {
                            zziaVar.addSuppressed(zziaVarZza);
                            zziaVarZza = this.zzQ;
                        }
                        zziaVar2 = zziaVarZza;
                        zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar2);
                        if (zziaVar2.zzc == z7) {
                            zzkrVar = this.zzr;
                            if (zzkrVar.zzj() != zzkrVar.zzn()) {
                                while (true) {
                                    zzkrVar2 = this.zzr;
                                    if (zzkrVar2.zzj() != zzkrVar2.zzn()) {
                                        this.zzr.zze();
                                    } else {
                                        zzko zzkoVarZzj4 = this.zzr.zzj();
                                        zzkoVarZzj4.getClass();
                                        zzR();
                                        zzkp zzkpVar2 = zzkoVarZzj4.zzg;
                                        zzuq zzuqVar5 = zzkpVar2.zza;
                                        long j13 = zzkpVar2.zzb;
                                        this.zzz = zzD(zzuqVar5, j13, zzkpVar2.zzc, j13, true, 0);
                                    }
                                }
                            }
                        }
                        zzag(z7, false);
                        this.zzz = this.zzz.zze(zziaVar2);
                    }
                } catch (zzrj e10) {
                    zzrjVar = e10;
                    zzK(zzrjVar, zzrjVar.zza);
                } catch (zztq e11) {
                    iOException2 = e11;
                    zzK(iOException2, 1002);
                } catch (IOException e12) {
                    iOException = e12;
                    zzK(iOException, 2000);
                } catch (RuntimeException e13) {
                    runtimeException = e13;
                    i7 = 1004;
                    if (!(runtimeException instanceof IllegalStateException) && !(runtimeException instanceof IllegalArgumentException)) {
                        i7 = zzbbd.zzq.zzf;
                    }
                    zzia zziaVarZzd = zzia.zzd(runtimeException, i7);
                    zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVarZzd);
                    zzag(z7, false);
                    this.zzz = this.zzz.zze(zziaVarZzd);
                }
            } catch (zzaz e14) {
                e = e14;
                zzazVar = e;
                if (zzazVar.zzb != z7) {
                    i11 = zzbbd.zzq.zzf;
                } else if (true != zzazVar.zza) {
                    i11 = 3003;
                } else {
                    i11 = 3001;
                }
                zzK(zzazVar, i11);
            } catch (zzfy e15) {
                e = e15;
                zzfyVar = e;
                zzK(zzfyVar, zzfyVar.zza);
            } catch (zzia e16) {
                e = e16;
                zziaVarZza = e;
                if (zziaVarZza.zzc == z7) {
                    zzlrVarArr2 = this.zzb;
                    i10 = zziaVarZza.zze;
                    if (zzlrVarArr2[i10 % 2].zzI(i10)) {
                        zzuqVar = zzkoVarZzn.zzg.zza;
                    } else {
                        zzuqVar = zzkoVarZzn.zzg.zza;
                    }
                    zziaVarZza = zziaVarZza.zza(zzuqVar);
                }
                if (!zziaVarZza.zzi) {
                    if (zziaVarZza.zzc == z7) {
                        zzlrVarArr = this.zzb;
                        i8 = zziaVarZza.zze;
                        if (zzlrVarArr[i8 % 2].zzI(i8)) {
                            this.zzU = z7;
                            zzE();
                            zzkrVar3 = this.zzr;
                            zzkoVarZzm = zzkrVar3.zzm();
                            zzkoVarZzj = zzkrVar3.zzj();
                            if (zzkrVar3.zzj() != zzkoVarZzm) {
                                while (zzkoVarZzj != null) {
                                    zzkoVarZzj = zzkoVarZzj.zzg();
                                }
                            }
                            this.zzr.zza(zzkoVarZzj);
                            if (this.zzz.zze != 4) {
                                zzP();
                                this.zzi.zzi(2);
                            }
                        } else {
                            zziaVar = this.zzQ;
                            if (zziaVar != null) {
                                zziaVar.addSuppressed(zziaVarZza);
                                zziaVarZza = this.zzQ;
                            }
                            zziaVar2 = zziaVarZza;
                            zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar2);
                            if (zziaVar2.zzc == z7) {
                                zzkrVar = this.zzr;
                                if (zzkrVar.zzj() != zzkrVar.zzn()) {
                                    while (true) {
                                        zzkrVar2 = this.zzr;
                                        if (zzkrVar2.zzj() != zzkrVar2.zzn()) {
                                            this.zzr.zze();
                                        } else {
                                            zzko zzkoVarZzj5 = this.zzr.zzj();
                                            zzkoVarZzj5.getClass();
                                            zzR();
                                            zzkp zzkpVar3 = zzkoVarZzj5.zzg;
                                            zzuq zzuqVar6 = zzkpVar3.zza;
                                            long j14 = zzkpVar3.zzb;
                                            this.zzz = zzD(zzuqVar6, j14, zzkpVar3.zzc, j14, true, 0);
                                        }
                                    }
                                }
                            }
                            zzag(z7, false);
                            this.zzz = this.zzz.zze(zziaVar2);
                        }
                    } else {
                        zziaVar = this.zzQ;
                        if (zziaVar != null) {
                            zziaVar.addSuppressed(zziaVarZza);
                            zziaVarZza = this.zzQ;
                        }
                        zziaVar2 = zziaVarZza;
                        zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar2);
                        if (zziaVar2.zzc == z7) {
                            zzkrVar = this.zzr;
                            if (zzkrVar.zzj() != zzkrVar.zzn()) {
                                while (true) {
                                    zzkrVar2 = this.zzr;
                                    if (zzkrVar2.zzj() != zzkrVar2.zzn()) {
                                        this.zzr.zze();
                                    } else {
                                        zzko zzkoVarZzj6 = this.zzr.zzj();
                                        zzkoVarZzj6.getClass();
                                        zzR();
                                        zzkp zzkpVar4 = zzkoVarZzj6.zzg;
                                        zzuq zzuqVar7 = zzkpVar4.zza;
                                        long j15 = zzkpVar4.zzb;
                                        this.zzz = zzD(zzuqVar7, j15, zzkpVar4.zzc, j15, true, 0);
                                    }
                                }
                            }
                        }
                        zzag(z7, false);
                        this.zzz = this.zzz.zze(zziaVar2);
                    }
                } else if (zziaVarZza.zzc == z7) {
                    zzlrVarArr = this.zzb;
                    i8 = zziaVarZza.zze;
                    if (zzlrVarArr[i8 % 2].zzI(i8)) {
                        this.zzU = z7;
                        zzE();
                        zzkrVar3 = this.zzr;
                        zzkoVarZzm = zzkrVar3.zzm();
                        zzkoVarZzj = zzkrVar3.zzj();
                        if (zzkrVar3.zzj() != zzkoVarZzm) {
                            while (zzkoVarZzj != null) {
                                zzkoVarZzj = zzkoVarZzj.zzg();
                            }
                        }
                        this.zzr.zza(zzkoVarZzj);
                        if (this.zzz.zze != 4) {
                            zzP();
                            this.zzi.zzi(2);
                        }
                    } else {
                        zziaVar = this.zzQ;
                        if (zziaVar != null) {
                            zziaVar.addSuppressed(zziaVarZza);
                            zziaVarZza = this.zzQ;
                        }
                        zziaVar2 = zziaVarZza;
                        zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar2);
                        if (zziaVar2.zzc == z7) {
                            zzkrVar = this.zzr;
                            if (zzkrVar.zzj() != zzkrVar.zzn()) {
                                while (true) {
                                    zzkrVar2 = this.zzr;
                                    if (zzkrVar2.zzj() != zzkrVar2.zzn()) {
                                        this.zzr.zze();
                                    } else {
                                        zzko zzkoVarZzj7 = this.zzr.zzj();
                                        zzkoVarZzj7.getClass();
                                        zzR();
                                        zzkp zzkpVar5 = zzkoVarZzj7.zzg;
                                        zzuq zzuqVar8 = zzkpVar5.zza;
                                        long j16 = zzkpVar5.zzb;
                                        this.zzz = zzD(zzuqVar8, j16, zzkpVar5.zzc, j16, true, 0);
                                    }
                                }
                            }
                        }
                        zzag(z7, false);
                        this.zzz = this.zzz.zze(zziaVar2);
                    }
                } else {
                    zziaVar = this.zzQ;
                    if (zziaVar != null) {
                        zziaVar.addSuppressed(zziaVarZza);
                        zziaVarZza = this.zzQ;
                    }
                    zziaVar2 = zziaVarZza;
                    zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVar2);
                    if (zziaVar2.zzc == z7) {
                        zzkrVar = this.zzr;
                        if (zzkrVar.zzj() != zzkrVar.zzn()) {
                            while (true) {
                                zzkrVar2 = this.zzr;
                                if (zzkrVar2.zzj() != zzkrVar2.zzn()) {
                                    this.zzr.zze();
                                } else {
                                    zzko zzkoVarZzj8 = this.zzr.zzj();
                                    zzkoVarZzj8.getClass();
                                    zzR();
                                    zzkp zzkpVar6 = zzkoVarZzj8.zzg;
                                    zzuq zzuqVar9 = zzkpVar6.zza;
                                    long j17 = zzkpVar6.zzb;
                                    this.zzz = zzD(zzuqVar9, j17, zzkpVar6.zzc, j17, true, 0);
                                }
                            }
                        }
                    }
                    zzag(z7, false);
                    this.zzz = this.zzz.zze(zziaVar2);
                }
            } catch (zzrj e17) {
                e = e17;
                zzrjVar = e;
                zzK(zzrjVar, zzrjVar.zza);
            } catch (zztq e18) {
                e = e18;
                iOException2 = e;
                zzK(iOException2, 1002);
            } catch (IOException e19) {
                e = e19;
                iOException = e;
                zzK(iOException, 2000);
            } catch (RuntimeException e20) {
                e = e20;
                runtimeException = e;
                i7 = 1004;
                if (!(runtimeException instanceof IllegalStateException)) {
                    i7 = zzbbd.zzq.zzf;
                }
                zzia zziaVarZzd2 = zzia.zzd(runtimeException, i7);
                zzdq.zzd("ExoPlayerImplInternal", "Playback error", zziaVarZzd2);
                zzag(z7, false);
                this.zzz = this.zzz.zze(zziaVarZzd2);
            }
        } catch (zzaz e21) {
            e = e21;
        } catch (zzfy e22) {
            e = e22;
        } catch (zzia e23) {
            e = e23;
        } catch (zzrj e24) {
            e = e24;
        } catch (zztq e25) {
            e = e25;
        } catch (IOException e26) {
            e = e26;
        } catch (RuntimeException e27) {
            e = e27;
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
                    return Boolean.valueOf(this.zza.zzB);
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
