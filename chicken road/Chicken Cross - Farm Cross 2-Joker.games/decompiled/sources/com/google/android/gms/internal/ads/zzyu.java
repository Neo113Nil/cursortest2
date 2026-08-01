package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzyu implements zzxm, zzagk, zzaca, zzacf, zzze {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzyt zzB;
    private zzahk zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhs zze;
    private final zzus zzf;
    private final zzxy zzg;
    private final zzun zzh;
    private final zzym zzi;
    private final zzabp zzj;
    private final long zzk;
    private final long zzl;
    private final zzyh zzn;
    private zzxl zzs;
    private zzajo zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzaci zzm = new zzaci("ProgressiveMediaPeriod");
    private final zzdt zzo = new zzdt(zzdp.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyq
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzyu.this.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzyu.this.zzE();
        }
    };
    private final Handler zzr = zzfm.zzd(null);
    private zzys[] zzw = new zzys[0];
    private zzzf[] zzv = new zzzf[0];
    private zzyk[] zzu = new zzyk[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzo("application/x-icy");
        zzc = zztVar.zzQ();
    }

    public zzyu(Uri uri, zzhs zzhsVar, zzyh zzyhVar, zzus zzusVar, zzun zzunVar, zzabz zzabzVar, zzxy zzxyVar, zzym zzymVar, zzabp zzabpVar, String str, int i, boolean z, int i2, zzv zzvVar, long j, zzaco zzacoVar) {
        this.zzd = uri;
        this.zze = zzhsVar;
        this.zzf = zzusVar;
        this.zzh = zzunVar;
        this.zzg = zzxyVar;
        this.zzi = zzymVar;
        this.zzj = zzabpVar;
        this.zzk = i;
        this.zzn = zzyhVar;
        this.zzl = j;
    }

    private final void zzR(int i) {
        zzaa();
        zzyt zzytVar = this.zzB;
        boolean[] zArr = zzytVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzv zza = zzytVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzxk(1, zzas.zzf(zza.zzp), zza, 0, null, zzfm.zzs(this.zzL), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i]) && !this.zzv[i].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzzf zzzfVar : this.zzv) {
                    zzzfVar.zzg(false);
                }
                zzxl zzxlVar = this.zzs;
                zzxlVar.getClass();
                zzxlVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzaht zzU(zzys zzysVar) {
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            if (zzysVar.equals(this.zzw[i])) {
                return this.zzv[i];
            }
        }
        if (this.zzx) {
            int i2 = zzysVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzeh.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzage();
        }
        zzzf zzzfVar = new zzzf(this.zzj, this.zzf, this.zzh);
        zzyk zzykVar = new zzyk(zzzfVar);
        zzzfVar.zzz(this);
        int i3 = length + 1;
        zzys[] zzysVarArr = (zzys[]) Arrays.copyOf(this.zzw, i3);
        zzysVarArr[length] = zzysVar;
        String str = zzfm.zza;
        this.zzw = zzysVarArr;
        zzzf[] zzzfVarArr = (zzzf[]) Arrays.copyOf(this.zzv, i3);
        zzzfVarArr[length] = zzzfVar;
        this.zzv = zzzfVarArr;
        zzyk[] zzykVarArr = (zzyk[]) Arrays.copyOf(this.zzu, i3);
        zzykVarArr[length] = zzykVar;
        this.zzu = zzykVarArr;
        return zzykVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzzf zzzfVar : this.zzv) {
            if (zzzfVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            zzv zzo = this.zzv[i4].zzo();
            zzo.getClass();
            int zzf = zzas.zzf(zzo.zzp);
            int zzab = zzab(zzf);
            int zzab2 = zzab(i2);
            if (zzab > zzab2) {
                i2 = zzf;
            }
            if (zzab > zzab2) {
                i3 = i4;
            }
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zzv zzo2 = this.zzv[i5].zzo();
            zzo2.getClass();
            String str = zzo2.zzp;
            boolean zza = zzas.zza(str);
            boolean z = zza || zzas.zzb(str);
            zArr[i5] = z;
            this.zzz = z | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzajo zzajoVar = this.zzt;
            if (zzajoVar != null) {
                if (zza || this.zzw[i5].zzb) {
                    zzap zzapVar = zzo2.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzajoVar) : zzapVar.zzg(zzajoVar);
                    zzt zza2 = zzo2.zza();
                    zza2.zzl(zzapVar2);
                    zzo2 = zza2.zzQ();
                }
                if (zza && zzo2.zzh == -1 && zzo2.zzi == -1 && (i = zzajoVar.zza) != -1) {
                    zzt zza3 = zzo2.zza();
                    zza3.zzi(i);
                    zzo2 = zza3.zzQ();
                }
            }
            zzv zzb2 = zzo2.zzb(this.zzf.zzb(zzo2));
            if (i5 != i3) {
                zzt zza4 = zzb2.zza();
                zza4.zzm(Integer.toString(i3));
                zzb2 = zza4.zzQ();
            }
            zzbgVarArr[i5] = new zzbg(Integer.toString(i5), zzb2);
            this.zzI = zzb2.zzv | this.zzI;
            this.zzv[i5].zzi(Long.MIN_VALUE);
        }
        this.zzB = new zzyt(new zzzr(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzyi(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzxl zzxlVar = this.zzs;
        zzxlVar.getClass();
        zzxlVar.zzp(this);
    }

    private final void zzW() {
        zzyl zzylVar = new zzyl(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzguk.zzi(zzZ());
            long j = this.zzD;
            if (j != -9223372036854775807L && this.zzM > j) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzahk zzahkVar = this.zzC;
            zzahkVar.getClass();
            zzylVar.zzd(zzahkVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzzf zzzfVar : this.zzv) {
                zzzfVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzylVar, this, zzabz.zza(this.zzF));
    }

    private final int zzX() {
        int i = 0;
        for (zzzf zzzfVar : this.zzv) {
            i += zzzfVar.zzj();
        }
        return i;
    }

    private final long zzY(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzzf[] zzzfVarArr = this.zzv;
            if (i >= zzzfVarArr.length) {
                return j;
            }
            if (!z) {
                zzyt zzytVar = this.zzB;
                zzytVar.getClass();
                i = zzytVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzzfVarArr[i].zzp());
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        zzguk.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ void zzA(zzace zzaceVar, long j, long j2, boolean z) {
        zzyl zzylVar = (zzyl) zzaceVar;
        zzip zzf = zzylVar.zzf();
        zzxf zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzylVar.zze();
        this.zzg.zzf(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)));
        if (z) {
            return;
        }
        for (zzzf zzzfVar : this.zzv) {
            zzzfVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzxl zzxlVar = this.zzs;
            zzxlVar.getClass();
            zzxlVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ void zzB(zzace zzaceVar, long j, long j2) {
        zzyl zzylVar = (zzyl) zzaceVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long zzY = zzY(true);
            long j3 = zzY == Long.MIN_VALUE ? 0L : zzY + 10000;
            this.zzD = j3;
            this.zzi.zzb(j3, this.zzC, this.zzE);
        }
        zzip zzf = zzylVar.zzf();
        zzxf zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzylVar.zze();
        this.zzg.zze(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)));
        this.zzP = true;
        zzxl zzxlVar = this.zzs;
        zzxlVar.getClass();
        zzxlVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ void zzC(zzace zzaceVar, long j, long j2, int i) {
        zzxf zzxfVar;
        zzyl zzylVar = (zzyl) zzaceVar;
        zzip zzf = zzylVar.zzf();
        if (i == 0) {
            long zze = zzylVar.zze();
            zzhw zzh = zzylVar.zzh();
            zzxfVar = new zzxf(zze, zzh, zzh.zza, Collections.emptyMap(), j, 0L, 0L);
        } else {
            zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        }
        this.zzg.zzd(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)), i);
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzyu.this.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzajo zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzajo zzajoVar) {
        this.zzt = zzajoVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzzf zzzfVar : this.zzv) {
                zzzfVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        long j;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzyt zzytVar = this.zzB;
                if (zzytVar.zzb[i] && zzytVar.zzc[i] && !this.zzv[i].zzq()) {
                    j = Math.min(j, this.zzv[i].zzp());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzY(false);
        }
        return j == Long.MIN_VALUE ? this.zzL : j;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        if (this.zzP) {
            return false;
        }
        zzaci zzaciVar = this.zzm;
        if (zzaciVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zza = this.zzo.zza();
        if (zzaciVar.zze()) {
            return zza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzxm, com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzg() {
        for (zzzf zzzfVar : this.zzv) {
            zzzfVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzh(int i) {
        return !zzT() && this.zzv[i].zzr(this.zzP);
    }

    final void zzi(int i) throws IOException {
        this.zzv[i].zzl();
        zzj();
    }

    final void zzj() throws IOException {
        this.zzm.zzh(zzabz.zza(this.zzF));
    }

    final int zzk(int i, zzma zzmaVar, zziy zziyVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int zzs = this.zzv[i].zzs(zzmaVar, zziyVar, i2, this.zzP);
        if (zzs == -3) {
            zzS(i);
        }
        return zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzl(zzxl zzxlVar, long j) {
        this.zzs = zzxlVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() throws IOException {
        zzj();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzo(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j) {
        zzabe zzabeVar;
        zzaa();
        zzyt zzytVar = this.zzB;
        zzzr zzzrVar = zzytVar.zza;
        boolean[] zArr3 = zzytVar.zzc;
        int i = this.zzJ;
        int i2 = 0;
        for (int i3 = 0; i3 < zzabeVarArr.length; i3++) {
            zzzg zzzgVar = zzzgVarArr[i3];
            if (zzzgVar != null && (zzabeVarArr[i3] == null || !zArr[i3])) {
                int zze = ((zzyr) zzzgVar).zze();
                zzguk.zzi(zArr3[zze]);
                this.zzJ--;
                zArr3[zze] = false;
                zzzgVarArr[i3] = null;
            }
        }
        boolean z = !this.zzG ? j == 0 || this.zzA : i != 0;
        for (int i4 = 0; i4 < zzabeVarArr.length; i4++) {
            if (zzzgVarArr[i4] == null && (zzabeVar = zzabeVarArr[i4]) != null) {
                zzguk.zzi(zzabeVar.zze() == 1);
                zzguk.zzi(zzabeVar.zzf(0) == 0);
                int zzb2 = zzzrVar.zzb(zzabeVar.zza());
                zzguk.zzi(!zArr3[zzb2]);
                this.zzJ++;
                zArr3[zzb2] = true;
                this.zzI = zzabeVar.zzc().zzv | this.zzI;
                zzzgVarArr[i4] = new zzyr(this, zzb2);
                zArr2[i4] = true;
                if (!z) {
                    zzzf zzzfVar = this.zzv[zzb2];
                    z = (zzzfVar.zzn() == 0 || zzzfVar.zzu(j, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzaci zzaciVar = this.zzm;
            if (zzaciVar.zze()) {
                zzzf[] zzzfVarArr = this.zzv;
                int length = zzzfVarArr.length;
                while (i2 < length) {
                    zzzfVarArr[i2].zzy();
                    i2++;
                }
                zzaciVar.zzf();
            } else {
                this.zzP = false;
                for (zzzf zzzfVar2 : this.zzv) {
                    zzzfVar2.zzg(false);
                }
            }
        } else if (z) {
            j = zzt(j);
            while (i2 < zzzgVarArr.length) {
                if (zzzgVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzG = true;
        return j;
    }

    final int zzp(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzzf zzzfVar = this.zzv[i];
        int zzv = zzzfVar.zzv(j, this.zzP);
        zzzfVar.zzw(zzv);
        if (zzv != 0) {
            return zzv;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j, boolean z) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            this.zzv[i].zzx(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht zzs(int i, int i2) {
        return zzU(new zzys(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzt(long j) {
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j = 0;
        }
        this.zzH = false;
        long j2 = this.zzL;
        this.zzL = j;
        if (zzZ()) {
            this.zzM = j;
            return j;
        }
        if (this.zzF != 7 && (this.zzP || this.zzm.zze())) {
            int length = this.zzv.length;
            for (int i = 0; i < length; i++) {
                zzzf zzzfVar = this.zzv[i];
                if (this.zzu[i].zzf() && (zzzfVar.zzn() != 0 || j2 != j)) {
                    if (this.zzA ? zzzfVar.zzt(zzzfVar.zzm()) : zzzfVar.zzu(j, this.zzP)) {
                        continue;
                    } else if (!zArr[i] && this.zzz) {
                    }
                }
            }
            return j;
        }
        this.zzN = false;
        this.zzM = j;
        this.zzP = false;
        this.zzI = false;
        zzaci zzaciVar = this.zzm;
        if (zzaciVar.zze()) {
            for (zzzf zzzfVar2 : this.zzv) {
                zzzfVar2.zzy();
            }
            zzaciVar.zzf();
        } else {
            zzaciVar.zzc();
            for (zzzf zzzfVar3 : this.zzv) {
                zzzfVar3.zzg(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r18 == Long.MIN_VALUE) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzxm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzu(long j, zznm zznmVar) {
        boolean z;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzahi zzc2 = this.zzC.zzc(j);
        zzahl zzahlVar = zzc2.zza;
        zzahl zzahlVar2 = zzc2.zzb;
        long j2 = zznmVar.zzd;
        if (j2 == 0) {
            long j3 = zznmVar.zze;
            return j;
        }
        String str = zzfm.zza;
        long j4 = j - j2;
        long j5 = j2 ^ j;
        boolean z2 = (j ^ j4) >= 0;
        boolean z3 = j5 >= 0;
        long j6 = Long.MAX_VALUE;
        long j7 = z3 | z2 ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j8 = Long.MIN_VALUE;
        if (j7 == Long.MIN_VALUE) {
            if (j4 == Long.MIN_VALUE) {
                j4 = Long.MIN_VALUE;
            }
            j7 = Long.MIN_VALUE;
            long j9 = zznmVar.zze;
            if (j == Long.MIN_VALUE) {
                j8 = j;
            }
            if (j != Long.MAX_VALUE) {
                int i = (j8 > Long.MAX_VALUE ? 1 : (j8 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j6 = j;
            }
            long j10 = zzahlVar.zzb;
            z = j7 > j10 && j10 <= j6;
            long j11 = zzahlVar2.zzb;
            boolean z4 = j7 > j11 && j11 <= j6;
            if (z || !z4) {
                if (!z) {
                    return z4 ? j11 : j7;
                }
            } else if (Math.abs(j10 - j) > Math.abs(j11 - j)) {
                return j11;
            }
            return j10;
        }
        if (j7 == Long.MAX_VALUE) {
            if (j4 == Long.MAX_VALUE) {
                j7 = Long.MAX_VALUE;
            }
            j7 = Long.MIN_VALUE;
        }
        long j92 = zznmVar.zze;
        if (j == Long.MIN_VALUE) {
        }
        if (j != Long.MAX_VALUE) {
        }
        long j102 = zzahlVar.zzb;
        if (j7 > j102) {
        }
        long j112 = zzahlVar2.zzb;
        if (j7 > j112) {
        }
        if (z) {
        }
        if (!z) {
        }
        return j102;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzw(final zzahk zzahkVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzyu.this.zzF(zzahkVar);
            }
        });
    }

    final zzaht zzx() {
        return zzU(new zzys(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final /* bridge */ /* synthetic */ zzacc zzz(zzace zzaceVar, long j, long j2, IOException iOException, int i) {
        long min;
        zzacc zza;
        zzahk zzahkVar;
        zzyl zzylVar = (zzyl) zzaceVar;
        zzip zzf = zzylVar.zzf();
        zzxf zzxfVar = new zzxf(zzylVar.zze(), zzylVar.zzh(), zzf.zzg(), zzf.zzh(), j, j2, zzf.zzf());
        zzylVar.zzg();
        String str = zzfm.zza;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof zzat) || (th instanceof FileNotFoundException) || (th instanceof zzig) || (th instanceof zzach) || ((th instanceof zzht) && ((zzht) th).zza == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            zza = zzaci.zzb;
        } else {
            int zzX = zzX();
            boolean z = zzX > this.zzO;
            if (this.zzK || !((zzahkVar = this.zzC) == null || zzahkVar.zza() == -9223372036854775807L)) {
                this.zzO = zzX;
            } else {
                boolean z2 = this.zzy;
                if (!z2 || zzT()) {
                    this.zzH = z2;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzzf zzzfVar : this.zzv) {
                        zzzfVar.zzg(false);
                    }
                    zzylVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zza = zzaci.zza;
                }
            }
            zza = zzaci.zza(z, min);
        }
        boolean zza2 = zza.zza();
        this.zzg.zzg(zzxfVar, new zzxk(1, -1, null, 0, null, zzfm.zzs(zzylVar.zzg()), zzfm.zzs(this.zzD)), iOException, !zza2);
        if (!zza2) {
            zzylVar.zze();
        }
        return zza;
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzxl zzxlVar = this.zzs;
        zzxlVar.getClass();
        zzxlVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzahk zzahkVar) {
        this.zzC = this.zzt == null ? zzahkVar : new zzahj(-9223372036854775807L, 0L);
        this.zzD = zzahkVar.zza();
        boolean z = false;
        if (!this.zzK && zzahkVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzE = z;
        this.zzF = true == z ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzahkVar, z);
        } else {
            zzD();
        }
    }
}
