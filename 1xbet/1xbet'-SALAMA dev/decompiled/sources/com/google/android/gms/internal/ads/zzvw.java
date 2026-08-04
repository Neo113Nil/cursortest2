package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzvw implements zzuo, zzacy, zzzc, zzzg, zzwh {
    private static final Map zzb;
    private static final zzz zzc;
    private zzadu zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzyw zzP;
    private final Uri zzd;
    private final zzfx zze;
    private final zzrq zzf;
    private final zzva zzg;
    private final zzrl zzh;
    private final zzvs zzi;
    private final long zzj;
    private final long zzk;
    private final zzvl zzm;
    private zzun zzr;
    private zzafv zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvv zzz;
    private final zzzk zzl = new zzzk("ProgressiveMediaPeriod");
    private final zzdc zzn = new zzdc(zzcz.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvn
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzV();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvo
        @Override // java.lang.Runnable
        public final void run() {
            zzvw.zzA(this.zza);
        }
    };
    private final Handler zzq = zzen.zzy(null);
    private zzvu[] zzu = new zzvu[0];
    private zzwj[] zzt = new zzwj[0];
    private long zzK = -9223372036854775807L;
    private int zzD = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzx zzxVar = new zzx();
        zzxVar.zzO("icy");
        zzxVar.zzad("application/x-icy");
        zzc = zzxVar.zzaj();
    }

    public zzvw(Uri uri, zzfx zzfxVar, zzvl zzvlVar, zzrq zzrqVar, zzrl zzrlVar, zzza zzzaVar, zzva zzvaVar, zzvs zzvsVar, zzyw zzywVar, String str, int i7, int i8, zzz zzzVar, long j, zzzs zzzsVar) {
        this.zzd = uri;
        this.zze = zzfxVar;
        this.zzf = zzrqVar;
        this.zzh = zzrlVar;
        this.zzg = zzvaVar;
        this.zzi = zzvsVar;
        this.zzP = zzywVar;
        this.zzj = i7;
        this.zzm = zzvlVar;
        this.zzk = j;
    }

    public static /* synthetic */ void zzA(zzvw zzvwVar) {
        if (zzvwVar.zzO) {
            return;
        }
        zzun zzunVar = zzvwVar.zzr;
        zzunVar.getClass();
        zzunVar.zzh(zzvwVar);
    }

    public static /* synthetic */ void zzC(zzvw zzvwVar, zzadu zzaduVar) {
        zzvwVar.zzA = zzvwVar.zzs == null ? zzaduVar : new zzadt(-9223372036854775807L, 0L);
        zzvwVar.zzB = zzaduVar.zza();
        boolean z4 = false;
        if (!zzvwVar.zzI && zzaduVar.zza() == -9223372036854775807L) {
            z4 = true;
        }
        zzvwVar.zzC = z4;
        zzvwVar.zzD = true == z4 ? 7 : 1;
        if (zzvwVar.zzw) {
            zzvwVar.zzi.zza(zzvwVar.zzB, zzaduVar, z4);
        } else {
            zzvwVar.zzV();
        }
    }

    public static /* bridge */ /* synthetic */ void zzF(final zzvw zzvwVar) {
        zzvwVar.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI = true;
            }
        });
    }

    private final int zzR() {
        int iZzd = 0;
        for (zzwj zzwjVar : this.zzt) {
            iZzd += zzwjVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzS(boolean z4) {
        int i7 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzwj[] zzwjVarArr = this.zzt;
            if (i7 >= zzwjVarArr.length) {
                return jMax;
            }
            if (z4) {
                jMax = Math.max(jMax, zzwjVarArr[i7].zzh());
            } else {
                zzvv zzvvVar = this.zzz;
                zzvvVar.getClass();
                if (zzvvVar.zzc[i7]) {
                    jMax = Math.max(jMax, zzwjVarArr[i7].zzh());
                }
            }
            i7++;
        }
    }

    private final zzaeb zzT(zzvu zzvuVar) {
        int length = this.zzt.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (zzvuVar.equals(this.zzu[i7])) {
                return this.zzt[i7];
            }
        }
        if (this.zzv) {
            zzdq.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + zzvuVar.zza + ") after finishing tracks.");
            return new zzacq();
        }
        zzwj zzwjVar = new zzwj(this.zzP, this.zzf, this.zzh);
        zzwjVar.zzv(this);
        int i8 = length + 1;
        zzvu[] zzvuVarArr = (zzvu[]) Arrays.copyOf(this.zzu, i8);
        zzvuVarArr[length] = zzvuVar;
        int i9 = zzen.zza;
        this.zzu = zzvuVarArr;
        zzwj[] zzwjVarArr = (zzwj[]) Arrays.copyOf(this.zzt, i8);
        zzwjVarArr[length] = zzwjVar;
        this.zzt = zzwjVarArr;
        return zzwjVar;
    }

    private final void zzU() {
        zzcv.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzV() {
        int i7;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzwj zzwjVar : this.zzt) {
            if (zzwjVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzc();
        int length = this.zzt.length;
        zzbo[] zzboVarArr = new zzbo[length];
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zzz zzzVarZzi = this.zzt[i8].zzi();
            zzzVarZzi.getClass();
            String str = zzzVarZzi.zzo;
            boolean zZzh = zzay.zzh(str);
            boolean z4 = zZzh || zzay.zzj(str);
            zArr[i8] = z4;
            this.zzx = z4 | this.zzx;
            this.zzy = this.zzk != -9223372036854775807L && length == 1 && zzay.zzi(str);
            zzafv zzafvVar = this.zzs;
            if (zzafvVar != null) {
                if (zZzh || this.zzu[i8].zzb) {
                    zzav zzavVar = zzzVarZzi.zzl;
                    zzav zzavVar2 = zzavVar == null ? new zzav(-9223372036854775807L, zzafvVar) : zzavVar.zzc(zzafvVar);
                    zzx zzxVarZzb = zzzVarZzi.zzb();
                    zzxVarZzb.zzW(zzavVar2);
                    zzzVarZzi = zzxVarZzb.zzaj();
                }
                if (zZzh && zzzVarZzi.zzh == -1 && zzzVarZzi.zzi == -1 && (i7 = zzafvVar.zza) != -1) {
                    zzx zzxVarZzb2 = zzzVarZzi.zzb();
                    zzxVarZzb2.zzA(i7);
                    zzzVarZzi = zzxVarZzb2.zzaj();
                }
            }
            zzz zzzVarZzc = zzzVarZzi.zzc(this.zzf.zza(zzzVarZzi));
            zzboVarArr[i8] = new zzbo(Integer.toString(i8), zzzVarZzc);
            this.zzG = zzzVarZzc.zzu | this.zzG;
        }
        this.zzz = new zzvv(new zzwv(zzboVarArr), zArr);
        if (this.zzy && this.zzB == -9223372036854775807L) {
            this.zzB = this.zzk;
            this.zzA = new zzvq(this, this.zzA);
        }
        this.zzi.zza(this.zzB, this.zzA, this.zzC);
        this.zzw = true;
        zzun zzunVar = this.zzr;
        zzunVar.getClass();
        zzunVar.zzj(this);
    }

    private final void zzW(int i7) {
        zzU();
        zzvv zzvvVar = this.zzz;
        boolean[] zArr = zzvvVar.zzd;
        if (zArr[i7]) {
            return;
        }
        zzz zzzVarZzb = zzvvVar.zza.zzb(i7).zzb(0);
        this.zzg.zzd(new zzum(1, zzay.zzb(zzzVarZzb.zzo), zzzVarZzb, 0, null, zzen.zzv(this.zzJ), -9223372036854775807L));
        zArr[i7] = true;
    }

    private final void zzX(int i7) {
        zzU();
        if (this.zzL) {
            if ((!this.zzx || this.zzz.zzb[i7]) && !this.zzt[i7].zzy(false)) {
                this.zzK = 0L;
                this.zzL = false;
                this.zzF = true;
                this.zzJ = 0L;
                this.zzM = 0;
                for (zzwj zzwjVar : this.zzt) {
                    zzwjVar.zzq(false);
                }
                zzun zzunVar = this.zzr;
                zzunVar.getClass();
                zzunVar.zzh(this);
            }
        }
    }

    private final void zzY() {
        zzvr zzvrVar = new zzvr(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzcv.zzf(zzZ());
            long j = this.zzB;
            if (j != -9223372036854775807L && this.zzK > j) {
                this.zzN = true;
                this.zzK = -9223372036854775807L;
                return;
            }
            zzadu zzaduVar = this.zzA;
            zzaduVar.getClass();
            zzvr.zzf(zzvrVar, zzaduVar.zzg(this.zzK).zza.zzc, this.zzK);
            for (zzwj zzwjVar : this.zzt) {
                zzwjVar.zzu(this.zzK);
            }
            this.zzK = -9223372036854775807L;
        }
        this.zzM = zzR();
        this.zzl.zza(zzvrVar, this, zzza.zza(this.zzD));
    }

    private final boolean zzZ() {
        return this.zzK != -9223372036854775807L;
    }

    private final boolean zzaa() {
        return this.zzF || zzZ();
    }

    public static /* bridge */ /* synthetic */ long zzr(zzvw zzvwVar, boolean z4) {
        return zzvwVar.zzS(true);
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void zzG() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    public final void zzH() throws IOException {
        this.zzl.zzi(zzza.zza(this.zzD));
    }

    public final void zzI(int i7) {
        this.zzt[i7].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final /* bridge */ /* synthetic */ void zzJ(zzzf zzzfVar, long j, long j3, boolean z4) {
        zzvr zzvrVar = (zzvr) zzzfVar;
        zzgw zzgwVar = zzvrVar.zzd;
        zzuh zzuhVar = new zzuh(zzvrVar.zzb, zzvrVar.zzl, zzgwVar.zzh(), zzgwVar.zzi(), j, j3, zzgwVar.zzg());
        long unused = zzvrVar.zzb;
        this.zzg.zze(zzuhVar, new zzum(1, -1, null, 0, null, zzen.zzv(zzvrVar.zzk), zzen.zzv(this.zzB)));
        if (z4) {
            return;
        }
        for (zzwj zzwjVar : this.zzt) {
            zzwjVar.zzq(false);
        }
        if (this.zzH > 0) {
            zzun zzunVar = this.zzr;
            zzunVar.getClass();
            zzunVar.zzh(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final /* bridge */ /* synthetic */ void zzK(zzzf zzzfVar, long j, long j3) {
        zzvr zzvrVar = (zzvr) zzzfVar;
        if (this.zzB == -9223372036854775807L && this.zzA != null) {
            long jZzS = zzS(true);
            long j7 = jZzS == Long.MIN_VALUE ? 0L : jZzS + 10000;
            this.zzB = j7;
            this.zzi.zza(j7, this.zzA, this.zzC);
        }
        zzgw zzgwVar = zzvrVar.zzd;
        zzuh zzuhVar = new zzuh(zzvrVar.zzb, zzvrVar.zzl, zzgwVar.zzh(), zzgwVar.zzi(), j, j3, zzgwVar.zzg());
        long unused = zzvrVar.zzb;
        this.zzg.zzf(zzuhVar, new zzum(1, -1, null, 0, null, zzen.zzv(zzvrVar.zzk), zzen.zzv(this.zzB)));
        this.zzN = true;
        zzun zzunVar = this.zzr;
        zzunVar.getClass();
        zzunVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final /* bridge */ /* synthetic */ void zzL(zzzf zzzfVar, long j, long j3, int i7) {
        zzvr zzvrVar = (zzvr) zzzfVar;
        zzgw zzgwVar = zzvrVar.zzd;
        this.zzg.zzh(i7 == 0 ? new zzuh(zzvrVar.zzb, zzvrVar.zzl, j) : new zzuh(zzvrVar.zzb, zzvrVar.zzl, zzgwVar.zzh(), zzgwVar.zzi(), j, j3, zzgwVar.zzg()), new zzum(1, -1, null, 0, null, zzen.zzv(zzvrVar.zzk), zzen.zzv(this.zzB)), i7);
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzM() {
        for (zzwj zzwjVar : this.zzt) {
            zzwjVar.zzp();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzN(zzz zzzVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzO() {
        if (this.zzw) {
            for (zzwj zzwjVar : this.zzt) {
                zzwjVar.zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void zzP(final zzadu zzaduVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvp
            @Override // java.lang.Runnable
            public final void run() {
                zzvw.zzC(this.zza, zzaduVar);
            }
        });
    }

    public final boolean zzQ(int i7) {
        return !zzaa() && this.zzt[i7].zzy(this.zzN);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zza(long j, zzls zzlsVar) {
        zzU();
        if (!this.zzA.zzh()) {
            return 0L;
        }
        zzads zzadsVarZzg = this.zzA.zzg(j);
        zzadv zzadvVar = zzadsVarZzg.zza;
        zzadv zzadvVar2 = zzadsVarZzg.zzb;
        long j3 = zzlsVar.zzc;
        if (j3 == 0) {
            if (zzlsVar.zzd == 0) {
                return j;
            }
            j3 = 0;
        }
        long j7 = zzadvVar.zzb;
        int i7 = zzen.zza;
        long j8 = j - j3;
        long j9 = zzlsVar.zzd;
        long j10 = j + j9;
        long j11 = j ^ j10;
        long j12 = j9 ^ j10;
        if (((j ^ j3) & (j ^ j8)) < 0) {
            j8 = Long.MIN_VALUE;
        }
        if ((j11 & j12) < 0) {
            j10 = Long.MAX_VALUE;
        }
        boolean z4 = j8 <= j7 && j7 <= j10;
        long j13 = zzadvVar2.zzb;
        boolean z7 = j8 <= j13 && j13 <= j10;
        if (z4 && z7) {
            if (Math.abs(j7 - j) > Math.abs(j13 - j)) {
                return j13;
            }
        } else if (!z4) {
            return z7 ? j13 : j8;
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzb() {
        long jZzS;
        zzU();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzS = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                zzvv zzvvVar = this.zzz;
                if (zzvvVar.zzb[i7] && zzvvVar.zzc[i7] && !this.zzt[i7].zzx()) {
                    jZzS = Math.min(jZzS, this.zzt[i7].zzh());
                }
            }
        } else {
            jZzS = Long.MAX_VALUE;
        }
        if (jZzS == Long.MAX_VALUE) {
            jZzS = zzS(false);
        }
        return jZzS == Long.MIN_VALUE ? this.zzJ : jZzS;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzd() {
        if (this.zzG) {
            this.zzG = false;
        } else {
            if (!this.zzF) {
                return -9223372036854775807L;
            }
            if (!this.zzN && zzR() <= this.zzM) {
                return -9223372036854775807L;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[LOOP:1: B:36:0x007a->B:37:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[LOOP:2: B:40:0x0091->B:41:0x0093, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0077, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x008a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zze(long j) {
        zzzk zzzkVar;
        int i7;
        zzU();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j = 0;
        }
        this.zzF = false;
        long j3 = this.zzJ;
        this.zzJ = j;
        if (zzZ()) {
            this.zzK = j;
            return j;
        }
        if (this.zzD == 7 || !(this.zzN || this.zzl.zzl())) {
            this.zzL = false;
            this.zzK = j;
            this.zzN = false;
            this.zzG = false;
            zzzkVar = this.zzl;
            if (zzzkVar.zzl()) {
                zzzkVar.zzh();
                for (zzwj zzwjVar : this.zzt) {
                    zzwjVar.zzq(false);
                }
                break;
            }
            for (zzwj zzwjVar2 : this.zzt) {
                zzwjVar2.zzk();
            }
            this.zzl.zzg();
            break;
        }
        int length = this.zzt.length;
        for (int i8 = 0; i8 < length; i8++) {
            zzwj zzwjVar3 = this.zzt[i8];
            if (zzwjVar3.zzb() != 0 || j3 != j) {
                if (!(this.zzy ? zzwjVar3.zzz(zzwjVar3.zza()) : zzwjVar3.zzA(j, false)) && (zArr[i8] || !this.zzx)) {
                    this.zzL = false;
                    this.zzK = j;
                    this.zzN = false;
                    this.zzG = false;
                    zzzkVar = this.zzl;
                    if (zzzkVar.zzl()) {
                        zzzkVar.zzh();
                        while (i7 < r2) {
                            zzwjVar.zzq(false);
                        }
                        break;
                        break;
                    }
                    while (i < r2) {
                        zzwjVar2.zzk();
                    }
                    this.zzl.zzg();
                    break;
                }
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final long zzf(zzyh[] zzyhVarArr, boolean[] zArr, zzwk[] zzwkVarArr, boolean[] zArr2, long j) {
        zzyh zzyhVar;
        zzU();
        zzvv zzvvVar = this.zzz;
        zzwv zzwvVar = zzvvVar.zza;
        boolean[] zArr3 = zzvvVar.zzc;
        int i7 = this.zzH;
        int i8 = 0;
        for (int i9 = 0; i9 < zzyhVarArr.length; i9++) {
            zzwk zzwkVar = zzwkVarArr[i9];
            if (zzwkVar != null && (zzyhVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((zzvt) zzwkVar).zzb;
                zzcv.zzf(zArr3[i10]);
                this.zzH--;
                zArr3[i10] = false;
                zzwkVarArr[i9] = null;
            }
        }
        boolean z4 = !this.zzE ? j == 0 || this.zzy : i7 != 0;
        for (int i11 = 0; i11 < zzyhVarArr.length; i11++) {
            if (zzwkVarArr[i11] == null && (zzyhVar = zzyhVarArr[i11]) != null) {
                zzcv.zzf(zzyhVar.zzd() == 1);
                zzcv.zzf(zzyhVar.zza(0) == 0);
                int iZza = zzwvVar.zza(zzyhVar.zzg());
                zzcv.zzf(!zArr3[iZza]);
                this.zzH++;
                zArr3[iZza] = true;
                this.zzG = zzyhVar.zzf().zzu | this.zzG;
                zzwkVarArr[i11] = new zzvt(this, iZza);
                zArr2[i11] = true;
                if (!z4) {
                    zzwj zzwjVar = this.zzt[iZza];
                    z4 = (zzwjVar.zzb() == 0 || zzwjVar.zzA(j, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            if (this.zzl.zzl()) {
                zzwj[] zzwjVarArr = this.zzt;
                int length = zzwjVarArr.length;
                while (i8 < length) {
                    zzwjVarArr[i8].zzk();
                    i8++;
                }
                this.zzl.zzg();
            } else {
                this.zzN = false;
                for (zzwj zzwjVar2 : this.zzt) {
                    zzwjVar2.zzq(false);
                }
            }
        } else if (z4) {
            j = zze(j);
            while (i8 < zzwkVarArr.length) {
                if (zzwkVarArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.zzE = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final zzwv zzg() {
        zzU();
        return this.zzz.zza;
    }

    public final int zzh(int i7, zzkh zzkhVar, zzhg zzhgVar, int i8) {
        if (zzaa()) {
            return -3;
        }
        zzW(i7);
        int iZze = this.zzt[i7].zze(zzkhVar, zzhgVar, i8, this.zzN);
        if (iZze == -3) {
            zzX(i7);
        }
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(long j, boolean z4) {
        if (this.zzy) {
            return;
        }
        zzU();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.zzt[i7].zzj(j, false, zArr[i7]);
        }
    }

    public final int zzj(int i7, long j) {
        if (zzaa()) {
            return 0;
        }
        zzW(i7);
        zzwj zzwjVar = this.zzt[i7];
        int iZzc = zzwjVar.zzc(j, this.zzN);
        zzwjVar.zzw(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        zzX(i7);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzk() throws IOException {
        zzH();
        if (this.zzN && !this.zzw) {
            throw zzaz.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzl(zzun zzunVar, long j) {
        this.zzr = zzunVar;
        this.zzn.zze();
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzo(zzkm zzkmVar) {
        if (this.zzN) {
            return false;
        }
        zzzk zzzkVar = this.zzl;
        if (zzzkVar.zzk() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zZze = this.zzn.zze();
        if (zzzkVar.zzl()) {
            return zZze;
        }
        zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzwm
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final /* bridge */ /* synthetic */ zzzd zzu(zzzf zzzfVar, long j, long j3, IOException iOException, int i7) {
        long jMin;
        zzzd zzzdVarZzb;
        zzadu zzaduVar;
        zzvr zzvrVar = (zzvr) zzzfVar;
        zzgw zzgwVar = zzvrVar.zzd;
        zzuh zzuhVar = new zzuh(zzvrVar.zzb, zzvrVar.zzl, zzgwVar.zzh(), zzgwVar.zzi(), j, j3, zzgwVar.zzg());
        long unused = zzvrVar.zzk;
        int i8 = zzen.zza;
        if ((iOException instanceof zzaz) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgn) || (iOException instanceof zzzi)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i7 - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
                break;
            }
            if ((cause instanceof zzfy) && ((zzfy) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzzdVarZzb = zzzk.zzb;
        } else {
            int iZzR = zzR();
            boolean z4 = iZzR > this.zzM;
            if (this.zzI || !((zzaduVar = this.zzA) == null || zzaduVar.zza() == -9223372036854775807L)) {
                this.zzM = iZzR;
            } else {
                boolean z7 = this.zzw;
                if (!z7 || zzaa()) {
                    this.zzF = z7;
                    this.zzJ = 0L;
                    this.zzM = 0;
                    for (zzwj zzwjVar : this.zzt) {
                        zzwjVar.zzq(false);
                    }
                    zzvr.zzf(zzvrVar, 0L, 0L);
                } else {
                    this.zzL = true;
                    zzzdVarZzb = zzzk.zza;
                }
            }
            zzzdVarZzb = zzzk.zzb(z4, jMin);
        }
        boolean zZzc = zzzdVarZzb.zzc();
        this.zzg.zzg(zzuhVar, new zzum(1, -1, null, 0, null, zzen.zzv(zzvrVar.zzk), zzen.zzv(this.zzB)), iOException, true ^ zZzc);
        if (!zZzc) {
            long unused2 = zzvrVar.zzb;
        }
        return zzzdVarZzb;
    }

    public final zzaeb zzv() {
        return zzT(new zzvu(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final zzaeb zzw(int i7, int i8) {
        return zzT(new zzvu(i7, false));
    }
}
