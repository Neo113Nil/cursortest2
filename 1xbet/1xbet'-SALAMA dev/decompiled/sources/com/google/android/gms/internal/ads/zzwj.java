package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzwj implements zzaeb {
    private boolean zzA;
    private zzrr zzB;
    private final zzwd zza;
    private final zzrq zzd;
    private final zzrl zze;
    private zzwh zzf;
    private zzz zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzz zzy;
    private final zzwf zzb = new zzwf();
    private int zzh = zzbbd.zzq.zzf;
    private long[] zzi = new long[zzbbd.zzq.zzf];
    private long[] zzj = new long[zzbbd.zzq.zzf];
    private long[] zzm = new long[zzbbd.zzq.zzf];
    private int[] zzl = new int[zzbbd.zzq.zzf];
    private int[] zzk = new int[zzbbd.zzq.zzf];
    private zzaea[] zzn = new zzaea[zzbbd.zzq.zzf];
    private final zzwq zzc = new zzwq(new zzdd() { // from class: com.google.android.gms.internal.ads.zzwe
        @Override // com.google.android.gms.internal.ads.zzdd
        public final void zza(Object obj) {
            zzrp zzrpVar = ((zzwg) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    public zzwj(zzyw zzywVar, zzrq zzrqVar, zzrl zzrlVar) {
        this.zzd = zzrqVar;
        this.zze = zzrlVar;
        this.zza = new zzwd(zzywVar);
    }

    private final int zzB(int i7, int i8, long j, boolean z4) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j3 = this.zzm[i7];
            if (j3 > j) {
                break;
            }
            if (!z4 || (this.zzl[i7] & 1) != 0) {
                i9 = i10;
                if (j3 == j) {
                    break;
                }
            }
            i7++;
            if (i7 == this.zzh) {
                i7 = 0;
            }
        }
        return i9;
    }

    private final int zzC(int i7) {
        int i8 = this.zzq + i7;
        int i9 = this.zzh;
        return i8 < i9 ? i8 : i8 - i9;
    }

    private final synchronized int zzD(zzkh zzkhVar, zzhg zzhgVar, boolean z4, boolean z7, zzwf zzwfVar) {
        try {
            zzhgVar.zzd = false;
            if (!zzL()) {
                if (!z7 && !this.zzv) {
                    zzz zzzVar = this.zzy;
                    if (zzzVar == null || (!z4 && zzzVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzzVar, zzkhVar);
                    return -5;
                }
                zzhgVar.zzc(4);
                zzhgVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzz zzzVar2 = ((zzwg) this.zzc.zza(this.zzp + this.zzr)).zza;
            if (!z4 && zzzVar2 == this.zzg) {
                int iZzC = zzC(this.zzr);
                if (!zzM(iZzC)) {
                    zzhgVar.zzd = true;
                    return -3;
                }
                zzhgVar.zzc(this.zzl[iZzC]);
                if (this.zzr == this.zzo - 1 && (z7 || this.zzv)) {
                    zzhgVar.zza(536870912);
                }
                zzhgVar.zze = this.zzm[iZzC];
                zzwfVar.zza = this.zzk[iZzC];
                zzwfVar.zzb = this.zzj[iZzC];
                zzwfVar.zzc = this.zzn[iZzC];
                return -4;
            }
            zzI(zzzVar2, zzkhVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long zzE(long j, boolean z4, boolean z7) {
        int i7;
        try {
            int i8 = this.zzo;
            if (i8 != 0) {
                long[] jArr = this.zzm;
                int i9 = this.zzq;
                if (j >= jArr[i9]) {
                    if (z7 && (i7 = this.zzr) != i8) {
                        i8 = i7 + 1;
                    }
                    int iZzB = zzB(i9, i8, j, false);
                    if (iZzB != -1) {
                        return zzG(iZzB);
                    }
                }
            }
            return -1L;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long zzF() {
        int i7 = this.zzo;
        if (i7 == 0) {
            return -1L;
        }
        return zzG(i7);
    }

    private final long zzG(int i7) {
        long j = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i7 != 0) {
            int iZzC = zzC(i7 - 1);
            for (int i8 = 0; i8 < i7; i8++) {
                jMax = Math.max(jMax, this.zzm[iZzC]);
                if ((this.zzl[iZzC] & 1) != 0) {
                    break;
                }
                iZzC--;
                if (iZzC == -1) {
                    iZzC = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, jMax);
        this.zzo -= i7;
        int i9 = this.zzp + i7;
        this.zzp = i9;
        int i10 = this.zzq + i7;
        this.zzq = i10;
        int i11 = this.zzh;
        if (i10 >= i11) {
            this.zzq = i10 - i11;
        }
        int i12 = this.zzr - i7;
        this.zzr = i12;
        if (i12 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i9);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i13 = this.zzq;
        if (i13 == 0) {
            i13 = this.zzh;
        }
        int i14 = i13 - 1;
        return this.zzj[i14] + ((long) this.zzk[i14]);
    }

    private final synchronized void zzH(long j, int i7, long j3, int i8, zzaea zzaeaVar) {
        try {
            int i9 = this.zzo;
            if (i9 > 0) {
                int iZzC = zzC(i9 - 1);
                zzcv.zzd(this.zzj[iZzC] + ((long) this.zzk[iZzC]) <= j3);
            }
            this.zzv = (536870912 & i7) != 0;
            this.zzu = Math.max(this.zzu, j);
            int iZzC2 = zzC(this.zzo);
            this.zzm[iZzC2] = j;
            this.zzj[iZzC2] = j3;
            this.zzk[iZzC2] = i8;
            this.zzl[iZzC2] = i7;
            this.zzn[iZzC2] = zzaeaVar;
            this.zzi[iZzC2] = 0;
            if (this.zzc.zzf() || !((zzwg) this.zzc.zzb()).zza.equals(this.zzy)) {
                zzz zzzVar = this.zzy;
                if (zzzVar == null) {
                    throw null;
                }
                this.zzc.zzc(this.zzp + this.zzo, new zzwg(zzzVar, this.zzd.zzb(this.zze, zzzVar), null));
            }
            int i10 = this.zzo + 1;
            this.zzo = i10;
            int i11 = this.zzh;
            if (i10 == i11) {
                int i12 = i11 + zzbbd.zzq.zzf;
                long[] jArr = new long[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr = new int[i12];
                int[] iArr2 = new int[i12];
                zzaea[] zzaeaVarArr = new zzaea[i12];
                int i13 = this.zzq;
                int i14 = i11 - i13;
                System.arraycopy(this.zzj, i13, jArr2, 0, i14);
                System.arraycopy(this.zzm, this.zzq, jArr3, 0, i14);
                System.arraycopy(this.zzl, this.zzq, iArr, 0, i14);
                System.arraycopy(this.zzk, this.zzq, iArr2, 0, i14);
                System.arraycopy(this.zzn, this.zzq, zzaeaVarArr, 0, i14);
                System.arraycopy(this.zzi, this.zzq, jArr, 0, i14);
                int i15 = this.zzq;
                System.arraycopy(this.zzj, 0, jArr2, i14, i15);
                System.arraycopy(this.zzm, 0, jArr3, i14, i15);
                System.arraycopy(this.zzl, 0, iArr, i14, i15);
                System.arraycopy(this.zzk, 0, iArr2, i14, i15);
                System.arraycopy(this.zzn, 0, zzaeaVarArr, i14, i15);
                System.arraycopy(this.zzi, 0, jArr, i14, i15);
                this.zzj = jArr2;
                this.zzm = jArr3;
                this.zzl = iArr;
                this.zzk = iArr2;
                this.zzn = zzaeaVarArr;
                this.zzi = jArr;
                this.zzq = 0;
                this.zzh = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzI(zzz zzzVar, zzkh zzkhVar) {
        zzz zzzVar2 = this.zzg;
        zzs zzsVar = zzzVar2 == null ? null : zzzVar2.zzs;
        this.zzg = zzzVar;
        zzs zzsVar2 = zzzVar.zzs;
        zzkhVar.zza = zzzVar.zzc(this.zzd.zza(zzzVar));
        zzkhVar.zzb = this.zzB;
        if (zzzVar2 != null) {
            int i7 = zzen.zza;
            if (Objects.equals(zzsVar, zzsVar2)) {
                return;
            }
        }
        zzrr zzrrVarZzc = this.zzd.zzc(this.zze, zzzVar);
        this.zzB = zzrrVarZzc;
        zzkhVar.zzb = zzrrVarZzc;
    }

    private final void zzJ() {
        if (this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i7) {
        if (this.zzB != null) {
            return (this.zzl[i7] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzN(zzz zzzVar) {
        try {
            this.zzx = false;
            zzz zzzVar2 = this.zzy;
            int i7 = zzen.zza;
            if (Objects.equals(zzzVar, zzzVar2)) {
                return false;
            }
            if (this.zzc.zzf() || !((zzwg) this.zzc.zzb()).zza.equals(zzzVar)) {
                this.zzy = zzzVar;
            } else {
                this.zzy = ((zzwg) this.zzc.zzb()).zza;
            }
            boolean z4 = this.zzz;
            zzz zzzVar3 = this.zzy;
            this.zzz = z4 & zzay.zzf(zzzVar3.zzo, zzzVar3.zzk);
            this.zzA = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046 A[EDGE_INSN: B:25:0x0046->B:28:0x0054 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047 A[EDGE_INSN: B:26:0x0047->B:28:0x0054 BREAK  A[LOOP:0: B:14:0x002c->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0049 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x003d A[SYNTHETIC] */
    public final synchronized boolean zzA(long j, boolean z4) {
        int iZzB;
        int i7;
        try {
            zzK();
            int i8 = this.zzr;
            int iZzC = zzC(i8);
            if (zzL() && j >= this.zzm[iZzC]) {
                if (j <= this.zzu) {
                    if (this.zzz) {
                        iZzB = this.zzo - i8;
                        i7 = 0;
                        while (true) {
                            if (i7 < iZzB) {
                                if (z4) {
                                    iZzB = -1;
                                    break;
                                }
                                break;
                            }
                            if (this.zzm[iZzC] < j) {
                                iZzB = i7;
                                break;
                            }
                            iZzC++;
                            if (iZzC == this.zzh) {
                                iZzC = 0;
                            }
                            i7++;
                        }
                    } else {
                        iZzB = zzB(iZzC, this.zzo - i8, j, true);
                    }
                    if (iZzB == -1) {
                        this.zzs = j;
                        this.zzr += iZzB;
                        return true;
                    }
                } else if (z4) {
                    z4 = true;
                    if (this.zzz) {
                        iZzB = this.zzo - i8;
                        i7 = 0;
                        while (true) {
                            if (i7 < iZzB) {
                                if (z4) {
                                    iZzB = -1;
                                    break;
                                }
                                break;
                                break;
                            }
                            if (this.zzm[iZzC] < j) {
                                iZzB = i7;
                                break;
                            }
                            iZzC++;
                            if (iZzC == this.zzh) {
                                iZzC = 0;
                            }
                            i7++;
                        }
                    } else {
                        iZzB = zzB(iZzC, this.zzo - i8, j, true);
                    }
                    if (iZzB == -1) {
                        this.zzs = j;
                        this.zzr += iZzB;
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j, boolean z4) {
        int i7 = this.zzr;
        int iZzC = zzC(i7);
        if (zzL() && j >= this.zzm[iZzC]) {
            if (j > this.zzu && z4) {
                return this.zzo - i7;
            }
            int iZzB = zzB(iZzC, this.zzo - i7, j, true);
            if (iZzB == -1) {
                return 0;
            }
            return iZzB;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r9 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zze(zzkh zzkhVar, zzhg zzhgVar, int i7, boolean z4) {
        int iZzD = zzD(zzkhVar, zzhgVar, (i7 & 2) != 0, z4, this.zzb);
        if (iZzD != -4) {
            return iZzD;
        }
        if (!zzhgVar.zzf()) {
            int i8 = i7 & 1;
            if ((i7 & 4) == 0) {
                if (i8 == 0) {
                    this.zza.zze(zzhgVar, this.zzb);
                    this.zzr++;
                    return -4;
                }
                this.zza.zzd(zzhgVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ int zzf(zzl zzlVar, int i7, boolean z4) {
        return zzadz.zza(this, zzlVar, i7, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzg(zzl zzlVar, int i7, boolean z4, int i8) {
        return this.zza.zza(zzlVar, i7, z4);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzz zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j, boolean z4, boolean z7) {
        this.zza.zzc(zzE(j, false, z7));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzm(zzz zzzVar) {
        boolean zZzN = zzN(zzzVar);
        zzwh zzwhVar = this.zzf;
        if (zzwhVar == null || !zZzN) {
            return;
        }
        zzwhVar.zzN(zzzVar);
    }

    public final void zzn() throws zzrj {
        zzrr zzrrVar = this.zzB;
        if (zzrrVar != null) {
            throw zzrrVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z4) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z4) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final /* synthetic */ void zzr(zzed zzedVar, int i7) {
        zzadz.zzb(this, zzedVar, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzs(zzed zzedVar, int i7, int i8) {
        this.zza.zzh(zzedVar, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzt(long j, int i7, int i8, int i9, zzaea zzaeaVar) {
        if (this.zzw) {
            if ((i7 & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzz) {
            if (j < this.zzs) {
                return;
            }
            if ((i7 & 1) == 0) {
                if (!this.zzA) {
                    zzdq.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzy)));
                    this.zzA = true;
                }
                i7 |= 1;
            }
        }
        int i10 = i7;
        zzH(j, i10, (this.zza.zzb() - ((long) i8)) - ((long) i9), i8, zzaeaVar);
    }

    public final void zzu(long j) {
        this.zzs = j;
    }

    public final void zzv(zzwh zzwhVar) {
        this.zzf = zzwhVar;
    }

    public final synchronized void zzw(int i7) {
        boolean z4 = false;
        if (i7 >= 0) {
            try {
                if (this.zzr + i7 <= this.zzo) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzcv.zzd(z4);
        this.zzr += i7;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z4) {
        boolean z7 = true;
        if (zzL()) {
            if (((zzwg) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzM(zzC(this.zzr));
        }
        if (!z4 && !this.zzv) {
            zzz zzzVar = this.zzy;
            if (zzzVar == null) {
                z7 = false;
            } else if (zzzVar == this.zzg) {
                return false;
            }
        }
        return z7;
    }

    public final synchronized boolean zzz(int i7) {
        zzK();
        int i8 = this.zzp;
        if (i7 >= i8 && i7 <= this.zzo + i8) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i7 - i8;
            return true;
        }
        return false;
    }
}
