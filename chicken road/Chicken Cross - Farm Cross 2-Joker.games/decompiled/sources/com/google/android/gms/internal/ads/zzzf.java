package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzzf implements zzaht {
    private zzv zzC;
    private boolean zzE;
    private final zzza zza;
    private final zzus zzd;
    private final zzun zze;
    private zzze zzf;
    private zzv zzg;
    private zzul zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzz;
    private final zzzb zzb = new zzzb();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzahs[] zzo = new zzahs[1000];
    private final zzzm zzc = new zzzm(zzzc.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private long zzw = Long.MIN_VALUE;
    private boolean zzB = true;
    private boolean zzA = true;
    private boolean zzD = true;
    private long zzu = Long.MIN_VALUE;
    private int zzx = -1;
    private int zzy = -1;

    protected zzzf(zzabp zzabpVar, zzus zzusVar, zzun zzunVar) {
        this.zzd = zzusVar;
        this.zze = zzunVar;
        this.zza = new zzza(zzabpVar);
    }

    private final synchronized void zzB() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized boolean zzD(zzv zzvVar) {
        this.zzB = false;
        if (Objects.equals(zzvVar, this.zzC)) {
            return false;
        }
        zzzm zzzmVar = this.zzc;
        if (zzzmVar.zzf() || !((zzzd) zzzmVar.zzc()).zza.equals(zzvVar)) {
            this.zzC = zzvVar;
        } else {
            this.zzC = ((zzzd) zzzmVar.zzc()).zza;
        }
        boolean z = this.zzD;
        zzv zzvVar2 = this.zzC;
        String str = zzvVar2.zzp;
        this.zzD = z & (zzas.zzf(str) == 1 && zzas.zzd(str, zzvVar2.zzk));
        this.zzE = false;
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
                int zzM = zzM(i3, i2, j, false);
                if (zzM != -1) {
                    return zzN(zzM);
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
        return zzN(i);
    }

    private final void zzG() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzH(long j, int i, long j2, int i2, zzahs zzahsVar) {
        int i3;
        int i4 = this.zzp;
        if (i4 > 0) {
            int zzO = zzO(i4 - 1);
            zzguk.zza(this.zzk[zzO] + ((long) this.zzl[zzO]) <= j2);
        }
        int i5 = i & 536870912;
        this.zzz = i5 != 0;
        this.zzw = Math.max(this.zzw, j);
        int i6 = this.zzq;
        int i7 = this.zzp;
        int i8 = i6 + i7;
        long j3 = this.zzu;
        if (j3 != Long.MIN_VALUE && this.zzx == -1) {
            if (j >= j3) {
                int i9 = this.zzy;
                if (i9 == -1) {
                    this.zzy = i8;
                    i9 = i8;
                }
                int i10 = (i8 - i9) + 1;
                int i11 = i & 1;
                zzv zzvVar = this.zzC;
                int i12 = 16;
                if (zzvVar != null && (i3 = zzvVar.zzr) != -1) {
                    i12 = i3;
                }
                if (i10 >= i12 + 1 || i11 != 0 || i5 != 0) {
                    this.zzx = i9;
                }
            }
            this.zzy = -1;
        }
        int zzO2 = zzO(i7);
        this.zzn[zzO2] = j;
        this.zzk[zzO2] = j2;
        this.zzl[zzO2] = i2;
        this.zzm[zzO2] = i;
        this.zzo[zzO2] = zzahsVar;
        this.zzj[zzO2] = 0;
        zzzm zzzmVar = this.zzc;
        if (zzzmVar.zzf() || !((zzzd) zzzmVar.zzc()).zza.equals(this.zzC)) {
            zzv zzvVar2 = this.zzC;
            if (zzvVar2 == null) {
                throw null;
            }
            zzv zzvVar3 = zzvVar2;
            zzzmVar.zzb(this.zzq + this.zzp, new zzzd(zzvVar2, zzur.zzb, null));
        }
        int i13 = this.zzp + 1;
        this.zzp = i13;
        int i14 = this.zzi;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzahs[] zzahsVarArr = new zzahs[i15];
            int i16 = this.zzr;
            int i17 = i14 - i16;
            System.arraycopy(this.zzk, i16, jArr2, 0, i17);
            System.arraycopy(this.zzn, this.zzr, jArr3, 0, i17);
            System.arraycopy(this.zzm, this.zzr, iArr, 0, i17);
            System.arraycopy(this.zzl, this.zzr, iArr2, 0, i17);
            System.arraycopy(this.zzo, this.zzr, zzahsVarArr, 0, i17);
            System.arraycopy(this.zzj, this.zzr, jArr, 0, i17);
            int i18 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr2, i17, i18);
            System.arraycopy(this.zzn, 0, jArr3, i17, i18);
            System.arraycopy(this.zzm, 0, iArr, i17, i18);
            System.arraycopy(this.zzl, 0, iArr2, i17, i18);
            System.arraycopy(this.zzo, 0, zzahsVarArr, i17, i18);
            System.arraycopy(this.zzj, 0, jArr, i17, i18);
            this.zzk = jArr2;
            this.zzn = jArr3;
            this.zzm = iArr;
            this.zzl = iArr2;
            this.zzo = zzahsVarArr;
            this.zzj = jArr;
            this.zzr = 0;
            this.zzi = i15;
        }
    }

    private final boolean zzI() {
        return this.zzs != this.zzp;
    }

    private final boolean zzJ() {
        int i;
        return this.zzx == -1 && (i = this.zzy) != -1 && this.zzq + this.zzs >= i;
    }

    private final void zzK(zzv zzvVar, zzma zzmaVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzt;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzt;
        zzus zzusVar = this.zzd;
        zzmaVar.zzb = zzvVar.zzb(zzusVar.zzb(zzvVar));
        zzmaVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzul zza = zzusVar.zza(this.zze, zzvVar);
            this.zzh = zza;
            zzmaVar.zza = zza;
        }
    }

    private final boolean zzL(int i) {
        if (this.zzh != null) {
            return (this.zzm[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final int zzM(int i, int i2, long j, boolean z) {
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

    private final int zzO(int i) {
        int i2 = this.zzr + i;
        int i3 = this.zzi;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzA(zzv zzvVar) {
        boolean zzD = zzD(zzvVar);
        zzze zzzeVar = this.zzf;
        if (zzzeVar == null || !zzD) {
            return;
        }
        zzzeVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zzg(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzd(zzeu zzeuVar, int i, int i2) {
        this.zza.zzh(zzeuVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zze(long j, int i, int i2, int i3, zzahs zzahsVar) {
        if (this.zzA) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzA = false;
            }
        }
        if (this.zzD) {
            if (j < this.zzt) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzE) {
                    String valueOf = String.valueOf(this.zzC);
                    String.valueOf(valueOf);
                    zzeh.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(valueOf)));
                    this.zzE = true;
                }
                i |= 1;
            }
        }
        zzH(j, i, (this.zza.zzf() - i2) - i3, i2, zzahsVar);
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
        this.zzx = -1;
        this.zzy = -1;
        this.zzA = true;
        this.zzt = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = Long.MIN_VALUE;
        this.zzz = false;
        this.zzc.zze();
        if (z) {
            this.zzC = null;
            this.zzB = true;
            this.zzD = true;
        }
    }

    public final void zzh(long j) {
        this.zzt = j;
    }

    public final synchronized void zzi(long j) {
        if (this.zzu == Long.MIN_VALUE) {
            return;
        }
        this.zzu = Long.MIN_VALUE;
        this.zzx = -1;
        this.zzy = -1;
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    public final void zzk() {
        zzy();
        zzG();
    }

    public final void zzl() throws IOException {
        zzul zzulVar = this.zzh;
        if (zzulVar != null) {
            throw zzulVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq;
    }

    public final int zzn() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzo() {
        if (this.zzB) {
            return null;
        }
        return this.zzC;
    }

    public final synchronized long zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq() {
        return this.zzz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r4.zzz != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r5 = r4.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r5 == r4.zzg) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzr(boolean z) {
        int i = this.zzq + this.zzs;
        int i2 = this.zzx;
        boolean z2 = true;
        if (i2 != -1 && i >= i2) {
            return true;
        }
        if (zzI() && !zzJ()) {
            if (((zzzd) this.zzc.zza(i)).zza != this.zzg) {
                return true;
            }
            return zzL(zzO(this.zzs));
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzs(zzma zzmaVar, zziy zziyVar, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        zzzb zzzbVar = this.zzb;
        int zzC = zzC(zzmaVar, zziyVar, z2, z, zzzbVar);
        if (zzC != -4) {
            return zzC;
        }
        if (!zziyVar.zzb()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zzc(zziyVar, zzzbVar);
                    this.zzs++;
                    return -4;
                }
                this.zza.zzd(zziyVar, zzzbVar);
            }
        }
        return -4;
    }

    public final synchronized boolean zzt(int i) {
        int i2;
        int i3;
        zzB();
        int i4 = this.zzq;
        if (i >= i4 && i <= this.zzp + i4 && (((i2 = this.zzx) == -1 || i < i2) && ((i3 = this.zzy) == -1 || i < i3))) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i4;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzu(long j, boolean z) {
        int zzM;
        zzB();
        int zzO = zzO(this.zzs);
        long j2 = this.zzu;
        long min = j2 != Long.MIN_VALUE ? Math.min(this.zzw, j2) : this.zzw;
        if (zzI() && j >= this.zzn[zzO]) {
            if (j > min) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzD) {
                zzM = this.zzp - this.zzs;
                int i = 0;
                while (true) {
                    if (i < zzM) {
                        if (this.zzn[zzO] >= j) {
                            zzM = i;
                            break;
                        }
                        zzO++;
                        if (zzO == this.zzi) {
                            zzO = 0;
                        }
                        i++;
                    } else if (!z) {
                        zzM = -1;
                    }
                }
            } else {
                zzM = zzM(zzO, this.zzp - this.zzs, j, true);
            }
            if (zzM != -1) {
                this.zzt = j;
                this.zzs += zzM;
                return true;
            }
        }
        return false;
    }

    public final synchronized int zzv(long j, boolean z) {
        int i = this.zzs;
        int zzO = zzO(i);
        if (zzI() && j >= this.zzn[zzO]) {
            if (j > this.zzw && z) {
                return this.zzp - i;
            }
            int zzM = zzM(zzO, this.zzp - i, j, true);
            if (zzM == -1) {
                return 0;
            }
            return zzM;
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
            } catch (Throwable th) {
                throw th;
            }
        }
        zzguk.zza(z);
        this.zzs += i;
    }

    public final void zzx(long j, boolean z, boolean z2) {
        this.zza.zze(zzE(j, false, z2));
    }

    public final void zzy() {
        this.zza.zze(zzF());
    }

    public final void zzz(zzze zzzeVar) {
        this.zzf = zzzeVar;
    }

    private final long zzN(int i) {
        long j = this.zzv;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzO = zzO(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzn[zzO]);
                if ((this.zzm[zzO] & 1) != 0) {
                    break;
                }
                zzO--;
                if (zzO == -1) {
                    zzO = this.zzi - 1;
                }
            }
        }
        this.zzv = Math.max(j, j2);
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

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if (r6.zzz != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r2 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r8 = r6.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        if (r8 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if (r9 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        if (r8 == r6.zzg) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r9 = r8;
        zzK(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        return -5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized int zzC(zzma zzmaVar, zziy zziyVar, boolean z, boolean z2, zzzb zzzbVar) {
        int i = this.zzq + this.zzs;
        int i2 = this.zzx;
        boolean z3 = false;
        if (i2 != -1 && i >= i2) {
            z3 = true;
        }
        if (zzI() && !zzJ() && !z3) {
            zzv zzvVar = ((zzzd) this.zzc.zza(i)).zza;
            if (!z && zzvVar == this.zzg) {
                int zzO = zzO(this.zzs);
                if (zzL(zzO)) {
                    zziyVar.zzg(this.zzm[zzO]);
                    if (this.zzs == this.zzp - 1 && (z2 || this.zzz)) {
                        zziyVar.zzh(536870912);
                    }
                    zziyVar.zzd = this.zzn[zzO];
                    zzzbVar.zza = this.zzl[zzO];
                    zzzbVar.zzb = this.zzk[zzO];
                    zzzbVar.zzc = this.zzo[zzO];
                    return -4;
                }
                return -3;
            }
            zzK(zzvVar, zzmaVar);
            return -5;
        }
        zziyVar.zzg(4);
        zziyVar.zzd = Long.MIN_VALUE;
        return -4;
    }
}
