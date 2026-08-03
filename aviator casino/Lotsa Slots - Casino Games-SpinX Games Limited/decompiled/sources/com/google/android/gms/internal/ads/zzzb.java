package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzb implements com.google.android.gms.internal.ads.zzahk {
    private com.google.android.gms.internal.ads.zzv zzA;
    private boolean zzC;
    private final com.google.android.gms.internal.ads.zzyw zza;
    private final com.google.android.gms.internal.ads.zzun zzd;
    private final com.google.android.gms.internal.ads.zzui zze;
    private com.google.android.gms.internal.ads.zzza zzf;
    private com.google.android.gms.internal.ads.zzv zzg;
    private com.google.android.gms.internal.ads.zzug zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzx;
    private final com.google.android.gms.internal.ads.zzyx zzb = new com.google.android.gms.internal.ads.zzyx();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private com.google.android.gms.internal.ads.zzahj[] zzo = new com.google.android.gms.internal.ads.zzahj[1000];
    private final com.google.android.gms.internal.ads.zzzi zzc = new com.google.android.gms.internal.ads.zzzi(com.google.android.gms.internal.ads.zzyy.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzz = true;
    private boolean zzy = true;
    private boolean zzB = true;
    private int zzw = -1;

    protected zzzb(com.google.android.gms.internal.ads.zzabl zzablVar, com.google.android.gms.internal.ads.zzun zzunVar, com.google.android.gms.internal.ads.zzui zzuiVar) {
        this.zzd = zzunVar;
        this.zze = zzuiVar;
        this.zza = new com.google.android.gms.internal.ads.zzyw(zzablVar);
    }

    private final synchronized void zzB() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized boolean zzD(com.google.android.gms.internal.ads.zzv zzvVar) {
        this.zzz = false;
        if (java.util.Objects.equals(zzvVar, this.zzA)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzzi zzziVar = this.zzc;
        if (zzziVar.zzf() || !((com.google.android.gms.internal.ads.zzyz) zzziVar.zzc()).zza.equals(zzvVar)) {
            this.zzA = zzvVar;
        } else {
            this.zzA = ((com.google.android.gms.internal.ads.zzyz) zzziVar.zzc()).zza;
        }
        boolean z = this.zzB;
        com.google.android.gms.internal.ads.zzv zzvVar2 = this.zzA;
        java.lang.String str = zzvVar2.zzp;
        this.zzB = z & (com.google.android.gms.internal.ads.zzas.zzf(str) == 1 && com.google.android.gms.internal.ads.zzas.zzd(str, zzvVar2.zzk));
        this.zzC = false;
        return true;
    }

    private final synchronized long zzE(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzp;
        if (i2 != 0) {
            long[] jArr = this.zzn;
            int i3 = this.zzr;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzs) != i2) {
                    i2 = i + 1;
                }
                int zzL = zzL(i3, i2, j, false);
                if (zzL != -1) {
                    return zzM(zzL);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzF() {
        int i = this.zzp;
        if (i == 0) {
            return -1L;
        }
        return zzM(i);
    }

    private final void zzG() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzH(long j, int i, long j2, int i2, com.google.android.gms.internal.ads.zzahj zzahjVar) {
        int i3 = this.zzp;
        if (i3 > 0) {
            int zzN = zzN(i3 - 1);
            com.google.android.gms.internal.ads.zzgtj.zza(this.zzk[zzN] + ((long) this.zzl[zzN]) <= j2);
        }
        this.zzx = (536870912 & i) != 0;
        this.zzv = java.lang.Math.max(this.zzv, j);
        int zzN2 = zzN(this.zzp);
        this.zzn[zzN2] = j;
        this.zzk[zzN2] = j2;
        this.zzl[zzN2] = i2;
        this.zzm[zzN2] = i;
        this.zzo[zzN2] = zzahjVar;
        this.zzj[zzN2] = 0;
        com.google.android.gms.internal.ads.zzzi zzziVar = this.zzc;
        if (zzziVar.zzf() || !((com.google.android.gms.internal.ads.zzyz) zzziVar.zzc()).zza.equals(this.zzA)) {
            com.google.android.gms.internal.ads.zzv zzvVar = this.zzA;
            zzvVar.getClass();
            com.google.android.gms.internal.ads.zzv zzvVar2 = zzvVar;
            zzziVar.zzb(this.zzq + this.zzp, new com.google.android.gms.internal.ads.zzyz(zzvVar, com.google.android.gms.internal.ads.zzum.zzb, null));
        }
        int i4 = this.zzp + 1;
        this.zzp = i4;
        int i5 = this.zzi;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            com.google.android.gms.internal.ads.zzahj[] zzahjVarArr = new com.google.android.gms.internal.ads.zzahj[i6];
            int i7 = this.zzr;
            int i8 = i5 - i7;
            java.lang.System.arraycopy(this.zzk, i7, jArr2, 0, i8);
            java.lang.System.arraycopy(this.zzn, this.zzr, jArr3, 0, i8);
            java.lang.System.arraycopy(this.zzm, this.zzr, iArr, 0, i8);
            java.lang.System.arraycopy(this.zzl, this.zzr, iArr2, 0, i8);
            java.lang.System.arraycopy(this.zzo, this.zzr, zzahjVarArr, 0, i8);
            java.lang.System.arraycopy(this.zzj, this.zzr, jArr, 0, i8);
            int i9 = this.zzr;
            java.lang.System.arraycopy(this.zzk, 0, jArr2, i8, i9);
            java.lang.System.arraycopy(this.zzn, 0, jArr3, i8, i9);
            java.lang.System.arraycopy(this.zzm, 0, iArr, i8, i9);
            java.lang.System.arraycopy(this.zzl, 0, iArr2, i8, i9);
            java.lang.System.arraycopy(this.zzo, 0, zzahjVarArr, i8, i9);
            java.lang.System.arraycopy(this.zzj, 0, jArr, i8, i9);
            this.zzk = jArr2;
            this.zzn = jArr3;
            this.zzm = iArr;
            this.zzl = iArr2;
            this.zzo = zzahjVarArr;
            this.zzj = jArr;
            this.zzr = 0;
            this.zzi = i6;
        }
    }

    private final boolean zzI() {
        return this.zzs != this.zzp;
    }

    private final void zzJ(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzlw zzlwVar) {
        com.google.android.gms.internal.ads.zzv zzvVar2 = this.zzg;
        com.google.android.gms.internal.ads.zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzt;
        this.zzg = zzvVar;
        com.google.android.gms.internal.ads.zzq zzqVar2 = zzvVar.zzt;
        com.google.android.gms.internal.ads.zzun zzunVar = this.zzd;
        zzlwVar.zzb = zzvVar.zzb(zzunVar.zzb(zzvVar));
        zzlwVar.zza = this.zzh;
        if (zzvVar2 == null || !java.util.Objects.equals(zzqVar, zzqVar2)) {
            com.google.android.gms.internal.ads.zzug zza = zzunVar.zza(this.zze, zzvVar);
            this.zzh = zza;
            zzlwVar.zza = zza;
        }
    }

    private final boolean zzK(int i) {
        if (this.zzh != null) {
            return (this.zzm[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final int zzL(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzn[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzm[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzi) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzN(int i) {
        int i2 = this.zzr + i;
        int i3 = this.zzi;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzA(com.google.android.gms.internal.ads.zzv zzvVar) {
        boolean zzD = zzD(zzvVar);
        com.google.android.gms.internal.ads.zzza zzzaVar = this.zzf;
        if (zzzaVar == null || !zzD) {
            return;
        }
        zzzaVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ void zzO(long j) {
        com.google.android.gms.internal.ads.zzahk.CC.$default$zzO(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ int zza(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z) {
        int zzb;
        zzb = zzb(zzjVar, i, z, 0);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final int zzb(com.google.android.gms.internal.ads.zzj zzjVar, int i, boolean z, int i2) throws java.io.IOException {
        return this.zza.zzg(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        zzd(zzetVar, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2) {
        this.zza.zzh(zzetVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final void zze(long j, int i, int i2, int i3, com.google.android.gms.internal.ads.zzahj zzahjVar) {
        if (this.zzy) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzy = false;
            }
        }
        if (this.zzB) {
            if (j < this.zzt) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzC) {
                    java.lang.String valueOf = java.lang.String.valueOf(this.zzA);
                    java.lang.String.valueOf(valueOf);
                    com.google.android.gms.internal.ads.zzeg.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(java.lang.String.valueOf(valueOf)));
                    this.zzC = true;
                }
                i |= 1;
            }
        }
        zzH(j, i, (this.zza.zzf() - i2) - i3, i2, zzahjVar);
    }

    public final void zzf() {
        zzg(true);
        zzG();
    }

    public final void zzg(boolean z) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzw = -1;
        this.zzy = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzx = false;
        this.zzc.zze();
        if (z) {
            this.zzA = null;
            this.zzz = true;
            this.zzB = true;
        }
    }

    public final void zzh(long j) {
        this.zzt = j;
    }

    public final synchronized void zzi(long j) {
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    public final void zzk() {
        zzy();
        zzG();
    }

    public final void zzl() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzug zzugVar = this.zzh;
        if (zzugVar != null) {
            throw zzugVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq;
    }

    public final int zzn() {
        return this.zzq + this.zzs;
    }

    public final synchronized com.google.android.gms.internal.ads.zzv zzo() {
        if (this.zzz) {
            return null;
        }
        return this.zzA;
    }

    public final synchronized long zzp() {
        return this.zzv;
    }

    public final synchronized boolean zzq() {
        return this.zzx;
    }

    public final synchronized boolean zzr(boolean z) {
        int i = this.zzq + this.zzs;
        boolean z2 = true;
        if (this.zzw != -1 && i >= 0) {
            return true;
        }
        if (zzI()) {
            if (((com.google.android.gms.internal.ads.zzyz) this.zzc.zza(i)).zza != this.zzg) {
                return true;
            }
            return zzK(zzN(this.zzs));
        }
        if (!z && !this.zzx) {
            com.google.android.gms.internal.ads.zzv zzvVar = this.zzA;
            if (zzvVar == null) {
                z2 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzs(com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zziv zzivVar, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        com.google.android.gms.internal.ads.zzyx zzyxVar = this.zzb;
        int zzC = zzC(zzlwVar, zzivVar, z2, z, zzyxVar);
        if (zzC != -4) {
            return zzC;
        }
        if (!zzivVar.zzb()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zzc(zzivVar, zzyxVar);
                    this.zzs++;
                    return -4;
                }
                this.zza.zzd(zzivVar, zzyxVar);
            }
        }
        return -4;
    }

    public final synchronized boolean zzt(int i) {
        zzB();
        int i2 = this.zzq;
        if (i >= i2 && i <= this.zzp + i2 && (this.zzw == -1 || i < 0)) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzu(long j, boolean z) {
        int zzL;
        zzB();
        int i = this.zzs;
        int zzN = zzN(i);
        long j2 = this.zzv;
        if (zzI() && j >= this.zzn[zzN]) {
            if (j > j2) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzB) {
                zzL = this.zzp - i;
                int i2 = 0;
                while (true) {
                    if (i2 < zzL) {
                        if (this.zzn[zzN] >= j) {
                            zzL = i2;
                            break;
                        }
                        zzN++;
                        if (zzN == this.zzi) {
                            zzN = 0;
                        }
                        i2++;
                    } else if (!z) {
                        zzL = -1;
                    }
                }
            } else {
                zzL = zzL(zzN, this.zzp - i, j, true);
            }
            if (zzL != -1) {
                this.zzt = j;
                this.zzs += zzL;
                return true;
            }
        }
        return false;
    }

    public final synchronized int zzv(long j, boolean z) {
        int i = this.zzs;
        int zzN = zzN(i);
        if (zzI() && j >= this.zzn[zzN]) {
            if (j > this.zzv && z) {
                return this.zzp - i;
            }
            int zzL = zzL(zzN, this.zzp - i, j, true);
            if (zzL == -1) {
                return 0;
            }
            return zzL;
        }
        return 0;
    }

    public final synchronized void zzw(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzs + i <= this.zzp) {
                    z = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzs += i;
    }

    public final void zzx(long j, boolean z, boolean z2) {
        this.zza.zze(zzE(j, false, z2));
    }

    public final void zzy() {
        this.zza.zze(zzF());
    }

    public final void zzz(com.google.android.gms.internal.ads.zzza zzzaVar) {
        this.zzf = zzzaVar;
    }

    private final long zzM(int i) {
        long j = this.zzu;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzN = zzN(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = java.lang.Math.max(j2, this.zzn[zzN]);
                if ((this.zzm[zzN] & 1) != 0) {
                    break;
                }
                zzN--;
                if (zzN == -1) {
                    zzN = this.zzi - 1;
                }
            }
        }
        this.zzu = java.lang.Math.max(j, j2);
        this.zzp -= i;
        int i3 = this.zzq + i;
        this.zzq = i3;
        int i4 = this.zzr + i;
        this.zzr = i4;
        int i5 = this.zzi;
        if (i4 >= i5) {
            this.zzr = i4 - i5;
        }
        int i6 = this.zzs - i;
        this.zzs = i6;
        if (i6 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i3);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i7 = this.zzr;
        if (i7 == 0) {
            i7 = this.zzi;
        }
        return this.zzk[i7 - 1] + this.zzl[r12];
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r8.zzx != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r0 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        r10 = r8.zzA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r11 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r10 == r8.zzg) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        r11 = r10;
        zzJ(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        return -5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        return -3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized int zzC(com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zziv zzivVar, boolean z, boolean z2, com.google.android.gms.internal.ads.zzyx zzyxVar) {
        boolean z3 = false;
        zzivVar.zzd = false;
        int i = this.zzq + this.zzs;
        if (this.zzw != -1 && i >= 0) {
            z3 = true;
        }
        if (zzI() && !z3) {
            com.google.android.gms.internal.ads.zzv zzvVar = ((com.google.android.gms.internal.ads.zzyz) this.zzc.zza(i)).zza;
            if (!z && zzvVar == this.zzg) {
                int zzN = zzN(this.zzs);
                if (!zzK(zzN)) {
                    zzivVar.zzd = true;
                    return -3;
                }
                zzivVar.zzg(this.zzm[zzN]);
                if (this.zzs == this.zzp - 1 && (z2 || this.zzx)) {
                    zzivVar.zzh(536870912);
                }
                zzivVar.zze = this.zzn[zzN];
                zzyxVar.zza = this.zzl[zzN];
                zzyxVar.zzb = this.zzk[zzN];
                zzyxVar.zzc = this.zzo[zzN];
                return -4;
            }
            zzJ(zzvVar, zzlwVar);
            return -5;
        }
        zzivVar.zzg(4);
        zzivVar.zze = Long.MIN_VALUE;
        return -4;
    }
}
