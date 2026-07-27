package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
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
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzly implements Handler.Callback, zzxl, zzabk, zzmu, zzjk, zzmy, zzcc, zzaea {
    private static final long zza = zzfm.zzs(10000);
    private boolean zzA;
    private zznm zzB;
    private boolean zzD;
    private boolean zzE;
    private zzlx zzF;
    private int zzG;
    private zzmw zzH;
    private zzlv zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzM;
    private boolean zzO;
    private boolean zzR;
    private int zzS;
    private zzlx zzT;
    private long zzU;
    private long zzV;
    private int zzW;
    private boolean zzX;
    private zzjn zzY;
    private zzjx zzaa;
    private boolean zzac;
    private final zzjg zzae;
    private final zzni[] zzb;
    private final zzng[] zzc;
    private final boolean[] zzd;
    private final zzabl zze;
    private final zzabm zzf;
    private final zzmc zzg;
    private final zzea zzh;
    private final zzmx zzi;
    private final Looper zzj;
    private final zzbe zzk;
    private final zzbd zzl;
    private final long zzm;
    private final zzjl zzn;
    private final ArrayList zzo;
    private final zzdp zzp;
    private final zzlw zzq;
    private final zzmj zzr;
    private final zzmv zzs;
    private final long zzt;
    private final zzqj zzu;
    private final boolean zzv;
    private final zznq zzw;
    private final zzea zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzab = -9223372036854775807L;
    private int zzP = 0;
    private boolean zzQ = false;
    private boolean zzK = false;
    private float zzad = 1.0f;
    private zznl zzC = zznl.zza;
    private long zzZ = -9223372036854775807L;
    private long zzN = -9223372036854775807L;

    public zzly(Context context, zzne[] zzneVarArr, zzne[] zzneVarArr2, zzabl zzablVar, zzabm zzabmVar, zzmc zzmcVar, zzabu zzabuVar, int i, boolean z, zznq zznqVar, zznm zznmVar, zzjg zzjgVar, long j, boolean z2, boolean z3, Looper looper, zzdp zzdpVar, zzlw zzlwVar, zzqj zzqjVar, zzmx zzmxVar, zzjx zzjxVar, final zzaea zzaeaVar, boolean z4) {
        this.zzq = zzlwVar;
        this.zze = zzablVar;
        this.zzf = zzabmVar;
        this.zzg = zzmcVar;
        int i2 = 0;
        this.zzB = zznmVar;
        this.zzae = zzjgVar;
        this.zzt = j;
        this.zzv = z3;
        this.zzp = zzdpVar;
        this.zzu = zzqjVar;
        this.zzaa = zzjxVar;
        this.zzw = zznqVar;
        this.zzA = z4;
        this.zzm = zzmcVar.zzf(zzqjVar);
        zzmcVar.zzg(zzqjVar);
        zzbf zzbfVar = zzbf.zza;
        this.zzH = zzmw.zza(zzabmVar);
        this.zzI = new zzlv(this.zzH);
        int length = zzneVarArr.length;
        this.zzc = new zzng[2];
        this.zzd = new boolean[2];
        zznf zzg = zzablVar.zzg();
        this.zzb = new zzni[2];
        boolean z5 = false;
        while (true) {
            int length2 = zzneVarArr.length;
            if (i2 >= 2) {
                this.zzy = z5;
                this.zzn = new zzjl(this, zzdpVar);
                this.zzo = new ArrayList();
                this.zzk = new zzbe();
                this.zzl = new zzbd();
                zzablVar.zzs(this, zzabuVar);
                this.zzX = true;
                zzea zzd = zzdpVar.zzd(looper, null);
                this.zzx = zzd;
                this.zzr = new zzmj(zznqVar, zzd, new zzlr(this), zzjxVar);
                this.zzs = new zzmv(this, zznqVar, zzd, zzqjVar, zzabuVar);
                zzmx zzmxVar2 = new zzmx(null);
                this.zzi = zzmxVar2;
                Looper zza2 = zzmxVar2.zza();
                this.zzj = zza2;
                zzea zzd2 = zzdpVar.zzd(zza2, this);
                this.zzh = zzd2;
                this.zzz = new zzcd(context, zza2, this);
                zzd2.zzd(35, new zzaea() { // from class: com.google.android.gms.internal.ads.zzlm
                    @Override // com.google.android.gms.internal.ads.zzaea
                    public final /* synthetic */ void zzcS(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
                        zzly.this.zzcS(j2, j3, zzvVar, mediaFormat);
                    }
                }).zza();
                zzd2.zzd(39, new zzuv(this) { // from class: com.google.android.gms.internal.ads.zzln
                }).zza();
                return;
            }
            zzneVarArr[i2].zzc(i2, zzqjVar, zzdpVar);
            this.zzc[i2] = zzneVarArr[i2].zzb();
            this.zzc[i2].zzv(zzg);
            zzne zzneVar = zzneVarArr2[i2];
            if (zzneVar != null) {
                zzneVar.zzc(i2, zzqjVar, zzdpVar);
                z5 = true;
            }
            this.zzb[i2] = new zzni(zzneVarArr[i2], zzneVarArr2[i2], i2);
            i2++;
        }
    }

    private final void zzA(IOException iOException, int i) {
        zzmj zzmjVar = this.zzr;
        zzjn zza2 = zzjn.zza(iOException, i);
        zzmg zzm = zzmjVar.zzm();
        if (zzm != null) {
            zza2 = zza2.zzd(zzm.zzg.zza);
        }
        zzeh.zzf("ExoPlayerImplInternal", "Playback error", zza2);
        zzW(false, false);
        this.zzH = this.zzH.zzf(zza2);
    }

    private final void zzB(int i) {
        zzmw zzmwVar = this.zzH;
        if (zzmwVar.zze != i) {
            if (i != 2) {
                this.zzZ = -9223372036854775807L;
            }
            if (i != 3) {
                boolean z = zzmwVar.zzp;
            }
            this.zzH = this.zzH.zze(i);
        }
    }

    private final void zzC(int i) {
        this.zzI.zzb(this.zzH);
        if (this.zzI.zzd()) {
            if (!this.zzH.zza.zzg()) {
                zzmw zzmwVar = this.zzH;
                boolean z = zzmwVar.zza.zze(zzmwVar.zzb.zza) != -1;
                Locale locale = Locale.US;
                zzmw zzmwVar2 = this.zzH;
                zzguk.zzj(z, String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", zzmwVar2.zzb.zza, zzmwVar2.zza.getClass().getName(), Integer.valueOf(this.zzH.zza.zza()), Integer.valueOf(i)));
            }
            this.zzq.zza(this.zzI);
            this.zzI = new zzlv(this.zzH);
        }
    }

    private final void zzD(float f) throws zzjn {
        this.zzad = f;
        float zza2 = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzni[] zzniVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzniVarArr[i].zzL(zza2);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws zzjn {
        this.zzI.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws zzjn {
        zzmw zzmwVar = this.zzH;
        zzG(zzmwVar.zzl, zzmwVar.zzn, zzmwVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws zzjn {
        zzH(z, this.zzz.zzc(z, this.zzH.zze), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzH(boolean z, int i, int i2, int i3) throws zzjn {
        boolean z2;
        zzmw zzmwVar;
        zzmg zzm;
        if (z) {
            if (i != -1) {
                z2 = true;
                if (i != -1) {
                    i3 = 2;
                } else if (i3 == 2) {
                    i3 = 1;
                }
                boolean z3 = this.zzD;
                if (i != 0) {
                    i2 = 1;
                } else if (i2 == 1) {
                    i2 = z3 ? 4 : 0;
                }
                zzmwVar = this.zzH;
                if (zzmwVar.zzl != z2 && zzmwVar.zzn == i2 && zzmwVar.zzm == i3) {
                    return;
                }
                this.zzH = zzmwVar.zzi(z2, i3, i2);
                zzaC(false, false);
                zzmj zzmjVar = this.zzr;
                for (zzm = zzmjVar.zzm(); zzm != null; zzm = zzm.zzp()) {
                    for (zzabe zzabeVar : zzm.zzr().zzc) {
                    }
                }
                if (zzax()) {
                    zzK();
                    zzL();
                    boolean z4 = this.zzH.zzp;
                    zzmjVar.zzf(this.zzU);
                    return;
                }
                int i4 = this.zzH.zze;
                if (i4 == 3) {
                    this.zzn.zza();
                    zzJ();
                    this.zzh.zzh(2);
                    return;
                } else {
                    if (i4 == 2) {
                        this.zzh.zzh(2);
                        return;
                    }
                    return;
                }
            }
            i = -1;
        }
        z2 = false;
        if (i != -1) {
        }
        boolean z32 = this.zzD;
        if (i != 0) {
        }
        zzmwVar = this.zzH;
        if (zzmwVar.zzl != z2) {
        }
        this.zzH = zzmwVar.zzi(z2, i3, i2);
        zzaC(false, false);
        zzmj zzmjVar2 = this.zzr;
        while (zzm != null) {
        }
        if (zzax()) {
        }
    }

    private final void zzI(boolean z) throws zzjn {
        zzxo zzxoVar = this.zzr.zzm().zzg.zza;
        long zzT = zzT(zzxoVar, this.zzH.zzs, true, false);
        if (zzT != this.zzH.zzs) {
            zzmw zzmwVar = this.zzH;
            this.zzH = zzao(zzxoVar, zzT, zzmwVar.zzc, zzmwVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws zzjn {
        zzmg zzm = this.zzr.zzm();
        if (zzm == null) {
            return;
        }
        zzabm zzr = zzm.zzr();
        int i = 0;
        while (true) {
            zzni[] zzniVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzr.zza(i)) {
                zzniVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zzjn {
        this.zzn.zzb();
        int i = 0;
        while (true) {
            zzni[] zzniVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzniVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ac, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() throws zzjn {
        zzlu zzluVar;
        zzmj zzmjVar = this.zzr;
        zzmg zzm = zzmjVar.zzm();
        if (zzm == null) {
            return;
        }
        long zzr = zzm.zze ? zzm.zza.zzr() : -9223372036854775807L;
        if (zzr != -9223372036854775807L) {
            if (!zzm.zzd()) {
                zzmjVar.zzs(zzm);
                zzab();
                zzas(false);
                zzam();
            }
            zzU(zzr, true);
            if (zzr != this.zzH.zzs) {
                zzmw zzmwVar = this.zzH;
                this.zzH = zzao(zzmwVar.zzb, zzr, zzmwVar.zzc, zzr, true, 5);
            }
        } else {
            zzjl zzjlVar = this.zzn;
            long zzf = zzjlVar.zzf(zzm != zzmjVar.zzn());
            this.zzU = zzf;
            long zza2 = zzf - zzm.zza();
            long j = this.zzH.zzs;
            ArrayList arrayList = this.zzo;
            if (!arrayList.isEmpty() && !this.zzH.zzb.zzb()) {
                if (this.zzX) {
                    j--;
                    this.zzX = false;
                }
                zzmw zzmwVar2 = this.zzH;
                int zze = zzmwVar2.zza.zze(zzmwVar2.zzb.zza);
                int min = Math.min(this.zzW, arrayList.size());
                if (min > 0) {
                    zzluVar = (zzlu) arrayList.get(min - 1);
                    while (zzluVar != null && (zze < 0 || (zze == 0 && j < 0))) {
                        int i = min - 1;
                        if (i > 0) {
                            zzluVar = (zzlu) arrayList.get(min - 2);
                            min = i;
                        } else {
                            min = i;
                        }
                    }
                    if (min < arrayList.size()) {
                    }
                    this.zzW = min;
                }
                zzluVar = null;
            }
            if (zzjlVar.zzh()) {
                boolean z = !this.zzI.zzc;
                zzmw zzmwVar3 = this.zzH;
                this.zzH = zzao(zzmwVar3.zzb, zza2, zzmwVar3.zzc, zza2, z, 6);
            } else {
                zzmw zzmwVar4 = this.zzH;
                zzmwVar4.zzs = zza2;
                zzmwVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzH.zzq = zzmjVar.zzk().zzf();
        this.zzH.zzr = zzat();
        zzmw zzmwVar5 = this.zzH;
        if (zzmwVar5.zzl && zzmwVar5.zze == 3 && zzP(zzmwVar5.zza, zzmwVar5.zzb)) {
            zzmw zzmwVar6 = this.zzH;
            if (zzmwVar6.zzo.zzb == 1.0f) {
                float zzd = this.zzae.zzd(zzO(zzmwVar6.zza, zzmwVar6.zzb.zza, zzmwVar6.zzs), this.zzH.zzr);
                zzjl zzjlVar2 = this.zzn;
                if (zzjlVar2.zzj().zzb != zzd) {
                    zzM(new zzav(zzd, this.zzH.zzo.zzc));
                    zzal(this.zzH.zzo, zzjlVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(zzav zzavVar) {
        this.zzh.zzk(16);
        this.zzn.zzi(zzavVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzly.this.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzl).zzc;
        zzbe zzbeVar = this.zzk;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfm.zza;
        return zzfm.zzt((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzxo zzxoVar) {
        if (!zzxoVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzxoVar.zza, this.zzl).zzc;
            zzbe zzbeVar = this.zzk;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            r2 = this.zzH.zze != 3 ? zza : 1000L;
            zzni[] zzniVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                r2 = Math.min(r2, zzfm.zzs(zzniVarArr[i].zzk(this.zzU, this.zzV)));
            }
            if (this.zzH.zzj()) {
                zzmj zzmjVar = this.zzr;
                if ((zzmjVar.zzm() != null ? zzmjVar.zzm().zzp() : null) != null) {
                    if (this.zzU + (zzfm.zzt(r2) * this.zzH.zzo.zzb) >= r0.zzc()) {
                        r2 = Math.min(r2, zza);
                    }
                }
            }
        } else if (this.zzH.zze != 3 || zzax()) {
            r2 = zza;
        }
        this.zzh.zzj(2, j + r2);
    }

    private final void zzR(zzlx zzlxVar) throws zzjn {
        zzbe zzbeVar;
        boolean z;
        zzxo zzxoVar;
        long j;
        long j2;
        boolean z2;
        long j3;
        long j4;
        long zzS;
        long j5;
        zzmw zzmwVar;
        int i;
        if (this.zzE) {
            if (this.zzF != null) {
                this.zzG++;
                this.zzI.zza(1);
            }
            this.zzF = zzlxVar;
            return;
        }
        this.zzI.zza(1);
        zzbf zzbfVar = this.zzH.zza;
        int i2 = this.zzP;
        boolean z3 = this.zzQ;
        zzbe zzbeVar2 = this.zzk;
        zzbd zzbdVar = this.zzl;
        Pair zzaD = zzaD(zzbfVar, zzlxVar, true, i2, z3, zzbeVar2, zzbdVar);
        if (zzaD == null) {
            Pair zzY = zzY(this.zzH.zza);
            zzxoVar = (zzxo) zzY.first;
            long longValue = ((Long) zzY.second).longValue();
            z = !this.zzH.zza.zzg();
            zzbeVar = zzbeVar2;
            j = longValue;
            j2 = -9223372036854775807L;
        } else {
            Object obj = zzaD.first;
            long longValue2 = ((Long) zzaD.second).longValue();
            long j6 = zzlxVar.zzc;
            long j7 = j6 == -9223372036854775807L ? -9223372036854775807L : longValue2;
            zzmj zzmjVar = this.zzr;
            zzmw zzmwVar2 = this.zzH;
            zzbeVar = zzbeVar2;
            long j8 = j7;
            zzxo zzy = zzmjVar.zzy(zzmwVar2, zzmwVar2.zza, obj, longValue2, true, false);
            if (zzy.zzb()) {
                this.zzH.zza.zzo(zzy.zza, zzbdVar);
                int i3 = zzy.zzb;
                if (zzbdVar.zzd(i3) == zzy.zzc) {
                    zzbdVar.zzi();
                }
                zza zza2 = zzbdVar.zzg.zza(i3);
                long j9 = zza2.zza;
                long j10 = zza2.zzi;
                zzxoVar = zzy;
                j2 = Math.max(j8, 0L);
                z = true;
                j = 0;
            } else {
                z = j6 == -9223372036854775807L;
                zzxoVar = zzy;
                j = longValue2;
                j2 = j8;
            }
        }
        try {
            if (this.zzH.zza.zzg()) {
                this.zzT = zzlxVar;
            } else if (zzaD == null) {
                if (this.zzH.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                try {
                    if (zzxoVar.equals(this.zzH.zzb)) {
                        zzmg zzm = this.zzr.zzm();
                        if (zzm == null || !zzm.zze || j == 0) {
                            j4 = j;
                        } else {
                            zzxm zzxmVar = zzm.zza;
                            long j11 = zzbeVar.zzm;
                            if (this.zzD && j11 != -9223372036854775807L) {
                                Double d = this.zzC.zzc;
                            }
                            j4 = zzxmVar.zzu(j, this.zzB);
                        }
                        if (zzfm.zzs(j4) == zzfm.zzs(this.zzH.zzs) && ((i = (zzmwVar = this.zzH).zze) == 2 || i == 3)) {
                            z2 = z;
                            j5 = zzmwVar.zzs;
                            this.zzH = zzao(zzxoVar, j5, j2, j5, z2, 2);
                        }
                    } else {
                        j4 = j;
                    }
                    zzmw zzmwVar3 = this.zzH;
                    zzbf zzbfVar2 = zzmwVar3.zza;
                    zzag(zzbfVar2, zzxoVar, zzbfVar2, zzmwVar3.zzb, j2, true);
                    j5 = zzS;
                    this.zzH = zzao(zzxoVar, j5, j2, j5, z2, 2);
                } catch (Throwable th) {
                    th = th;
                    j3 = zzS;
                    this.zzH = zzao(zzxoVar, j3, j2, j3, z2, 2);
                    throw th;
                }
                zzS = zzS(zzxoVar, j4, this.zzH.zze == 4);
                z2 = z | (j != zzS);
            }
            z2 = z;
            j5 = j;
            this.zzH = zzao(zzxoVar, j5, j2, j5, z2, 2);
        } catch (Throwable th2) {
            th = th2;
            z2 = z;
            j3 = j;
        }
    }

    private final long zzS(zzxo zzxoVar, long j, boolean z) throws zzjn {
        zzmj zzmjVar = this.zzr;
        return zzT(zzxoVar, j, zzmjVar.zzm() != zzmjVar.zzn(), z);
    }

    private final long zzT(zzxo zzxoVar, long j, boolean z, boolean z2) throws zzjn {
        zzK();
        boolean z3 = true;
        zzaC(false, true);
        if (z2 || this.zzH.zze == 3) {
            zzB(2);
        }
        zzmj zzmjVar = this.zzr;
        zzmg zzm = zzmjVar.zzm();
        zzmg zzmgVar = zzm;
        while (zzmgVar != null && !zzxoVar.equals(zzmgVar.zzg.zza)) {
            zzmgVar = zzmgVar.zzp();
        }
        if (z || zzm != zzmgVar || (zzmgVar != null && zzmgVar.zza() + j < 0)) {
            zzaa();
            if (zzmgVar != null) {
                while (zzmjVar.zzm() != zzmgVar) {
                    zzmjVar.zzr();
                }
                zzmjVar.zzs(zzmgVar);
                zzmgVar.zzb(1000000000000L);
                zzap();
                zzmgVar.zzh = true;
            }
        }
        zzab();
        if (this.zzD) {
            zzni[] zzniVarArr = this.zzb;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                zzni zzniVar = zzniVarArr[i];
                if (zzniVar.zzM()) {
                    if (zzniVar.zze() == 2) {
                        this.zzE = true;
                        break;
                    }
                    zzniVar.zze();
                }
                i++;
            }
        }
        if (zzmgVar != null) {
            zzmjVar.zzs(zzmgVar);
            if (!zzmgVar.zze) {
                zzmgVar.zzg = zzmgVar.zzg.zza(j, -9223372036854775807L);
            } else if (zzmgVar.zzf) {
                if (this.zzD) {
                    boolean z4 = this.zzC.zzi;
                    if (!this.zzH.zza.zzg() && zzmgVar.zzg.zza.equals(this.zzH.zzb)) {
                        long zza2 = zzmgVar.zza() + j;
                        zzni[] zzniVarArr2 = this.zzb;
                        boolean z5 = true;
                        for (int i2 = 0; i2 < 2; i2++) {
                            zzni zzniVar2 = zzniVarArr2[i2];
                            if (zzniVar2.zzM()) {
                                z5 &= zzniVar2.zzF(zzmgVar, zza2);
                            }
                        }
                        if (z5) {
                            zzxm zzxmVar = zzmgVar.zza;
                            long j2 = this.zzH.zzs;
                            zznm zznmVar = zznm.zzb;
                            if (zzxmVar.zzu(j2, zznmVar) == zzxmVar.zzu(j, zznmVar)) {
                                z3 = false;
                            }
                        }
                    }
                }
                zzxm zzxmVar2 = zzmgVar.zza;
                j = zzxmVar2.zzt(j);
                zzxmVar2.zzq(j - this.zzm, false);
            }
            zzU(j, z3);
            zzam();
        } else {
            zzmjVar.zzv();
            zzU(j, true);
        }
        zzas(false);
        this.zzh.zzh(2);
        return j;
    }

    private final void zzU(long j, boolean z) throws zzjn {
        zzmg zzm = this.zzr.zzm();
        long zza2 = j + (zzm == null ? 1000000000000L : zzm.zza());
        this.zzU = zza2;
        this.zzn.zzc(zza2);
        zzni[] zzniVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzniVarArr[i].zzE(zzm, this.zzU, z);
        }
        for (zzmg zzm2 = r0.zzm(); zzm2 != null; zzm2 = zzm2.zzp()) {
            for (zzabe zzabeVar : zzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzjn {
        int i = 0;
        while (true) {
            zzni[] zzniVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzniVarArr[i].zzz(this.zzD ? this.zzC : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzR, false, true, false);
        this.zzI.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzu);
        this.zzz.zzc(this.zzH.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r2.equals(r34.zzH.zzb) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(boolean z, boolean z2, boolean z3, boolean z4) {
        zzxo zzxoVar;
        zzbf zzbfVar;
        this.zzh.zzk(2);
        this.zzE = false;
        boolean z5 = true;
        if (this.zzF != null) {
            this.zzI.zza(1);
            this.zzF = null;
        }
        this.zzY = null;
        zzaC(false, true);
        this.zzn.zzb();
        this.zzU = 1000000000000L;
        try {
            zzaa();
        } catch (zzjn | RuntimeException e) {
            zzeh.zzf("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            zzni[] zzniVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzniVarArr[i].zzG();
                } catch (RuntimeException e2) {
                    zzeh.zzf("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzS = 0;
        zzmw zzmwVar = this.zzH;
        zzxo zzxoVar2 = zzmwVar.zzb;
        long j = zzmwVar.zzs;
        long j2 = (this.zzH.zzb.zzb() || zzaB(this.zzH, this.zzl)) ? this.zzH.zzc : this.zzH.zzs;
        if (z2) {
            this.zzT = null;
            Pair zzY = zzY(this.zzH.zza);
            zzxoVar2 = (zzxo) zzY.first;
            j = ((Long) zzY.second).longValue();
            j2 = -9223372036854775807L;
        }
        z5 = false;
        long j3 = j;
        long j4 = j2;
        zzmj zzmjVar = this.zzr;
        zzmjVar.zzv();
        this.zzO = false;
        zzbf zzbfVar2 = this.zzH.zza;
        if (z3 && (zzbfVar2 instanceof zznc)) {
            zzbfVar2 = ((zznc) zzbfVar2).zzx(this.zzs.zzq());
            if (zzxoVar2.zzb != -1) {
                Object obj = zzxoVar2.zza;
                zzbd zzbdVar = this.zzl;
                zzbfVar2.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzk;
                zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVar2;
                    zzxoVar = new zzxo(obj, zzxoVar2.zzd);
                    zzmw zzmwVar2 = this.zzH;
                    int i2 = zzmwVar2.zze;
                    zzjn zzjnVar = z4 ? null : zzmwVar2.zzf;
                    zzzr zzzrVar = !z5 ? zzzr.zza : zzmwVar2.zzh;
                    zzabm zzabmVar = !z5 ? this.zzf : this.zzH.zzi;
                    List zzi = !z5 ? zzgxm.zzi() : this.zzH.zzj;
                    zzmw zzmwVar3 = this.zzH;
                    this.zzH = new zzmw(zzbfVar, zzxoVar, j4, j3, i2, zzjnVar, false, zzzrVar, zzabmVar, zzi, zzxoVar, zzmwVar3.zzl, zzmwVar3.zzm, zzmwVar3.zzn, zzmwVar3.zzo, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    zzmjVar.zzj();
                    this.zzs.zzg();
                    return;
                }
            }
        }
        zzxoVar = zzxoVar2;
        zzbfVar = zzbfVar2;
        zzmw zzmwVar22 = this.zzH;
        int i22 = zzmwVar22.zze;
        zzjn zzjnVar2 = z4 ? null : zzmwVar22.zzf;
        zzzr zzzrVar2 = !z5 ? zzzr.zza : zzmwVar22.zzh;
        zzabm zzabmVar2 = !z5 ? this.zzf : this.zzH.zzi;
        List zzi2 = !z5 ? zzgxm.zzi() : this.zzH.zzj;
        zzmw zzmwVar32 = this.zzH;
        this.zzH = new zzmw(zzbfVar, zzxoVar, j4, j3, i22, zzjnVar2, false, zzzrVar2, zzabmVar2, zzi2, zzxoVar, zzmwVar32.zzl, zzmwVar32.zzm, zzmwVar32.zzn, zzmwVar32.zzo, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmw.zzb(), 0L);
        }
        int zzk = zzbfVar.zzk(this.zzQ);
        zzbe zzbeVar = this.zzk;
        zzbd zzbdVar = this.zzl;
        Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzk, -9223372036854775807L);
        zzxo zzy = this.zzr.zzy(this.zzH, zzbfVar, zzm.first, 0L, true, false);
        long longValue = ((Long) zzm.second).longValue();
        if (zzy.zzb()) {
            zzbfVar.zzo(zzy.zza, zzbdVar);
            if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                zzbdVar.zzi();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzo;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        zzlu zzluVar = (zzlu) arrayList.get(size);
        Object obj = zzluVar.zzb;
        zzna zznaVar = zzluVar.zza;
        String str = zzfm.zza;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (this.zzv) {
            return true;
        }
        if (!this.zzD) {
            return false;
        }
        boolean z = this.zzC.zzg;
        return true;
    }

    private static boolean zzaB(zzmw zzmwVar, zzbd zzbdVar) {
        zzxo zzxoVar = zzmwVar.zzb;
        zzbf zzbfVar = zzmwVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxoVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z, boolean z2) {
        this.zzM = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzN = j;
    }

    private static Pair zzaD(zzbf zzbfVar, zzlx zzlxVar, boolean z, int i, boolean z2, zzbe zzbeVar, zzbd zzbdVar) {
        Pair zzm;
        zzbf zzbfVar2 = zzlxVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.zzg() ? zzbfVar : zzbfVar2;
        try {
            zzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzlxVar.zzb, zzlxVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar3)) {
            return zzm;
        }
        if (zzbfVar.zze(zzm.first) != -1) {
            return (zzbfVar3.zzo(zzm.first, zzbdVar).zzf && zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(zzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(zzm.first, zzbdVar).zzc, zzlxVar.zzc) : zzm;
        }
        int zzr = zzr(zzbeVar, zzbdVar, i, z2, zzm.first, zzbfVar3, zzbfVar);
        if (zzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, zzr, -9223372036854775807L);
        }
        return null;
    }

    private static final void zzaE(zzna zznaVar) throws zzjn {
        zznaVar.zzh();
        try {
            zznaVar.zza().zzx(zznaVar.zzc(), zznaVar.zze());
        } finally {
            zznaVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzmg zzmgVar) {
        if (zzmgVar != null) {
            try {
                if (zzmgVar.zze) {
                    zzzg[] zzzgVarArr = zzmgVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzzg zzzgVar = zzzgVarArr[i];
                        if (zzzgVar != null) {
                            zzzgVar.zzb();
                        }
                    }
                } else {
                    zzmgVar.zza.zzm();
                }
                if (zzmgVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzjn {
        int i = 0;
        while (true) {
            zzni[] zzniVarArr = this.zzb;
            if (i >= 2) {
                this.zzab = -9223372036854775807L;
                return;
            }
            int zzd = zzniVarArr[i].zzd();
            zzniVarArr[i].zzA(this.zzn);
            zzN(i, false);
            this.zzS -= zzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzni[] zzniVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzni zzniVar = zzniVarArr[i];
                int zzd = zzniVar.zzd();
                zzniVar.zzC(this.zzn);
                this.zzS -= zzd - zzniVar.zzd();
            }
            this.zzab = -9223372036854775807L;
        }
    }

    private final void zzac() throws zzjn {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzjn {
        zzjl zzjlVar = this.zzn;
        float f = zzjlVar.zzj().zzb;
        zzmj zzmjVar = this.zzr;
        zzmg zzm = zzmjVar.zzm();
        zzmg zzn = zzmjVar.zzn();
        zzabm zzabmVar = null;
        boolean z = true;
        while (zzm != null && zzm.zze) {
            zzmw zzmwVar = this.zzH;
            zzabm zzk = zzm.zzk(f, zzmwVar.zza, zzmwVar.zzl);
            zzabm zzabmVar2 = zzm == zzmjVar.zzm() ? zzk : zzabmVar;
            zzabm zzr = zzm.zzr();
            boolean z2 = false;
            if (zzr != null) {
                zzabe[] zzabeVarArr = zzk.zzc;
                if (zzr.zzc.length == zzabeVarArr.length) {
                    for (int i = 0; i < zzabeVarArr.length; i++) {
                        if (zzk.zzb(zzr, i)) {
                        }
                    }
                    if (zzm != zzn) {
                        z2 = true;
                    }
                    z &= z2;
                    zzm = zzm.zzp();
                    zzabmVar = zzabmVar2;
                }
            }
            int i2 = 2;
            if (z) {
                zzmg zzm2 = zzmjVar.zzm();
                int zzs = zzmjVar.zzs(zzm2) & 1;
                zzni[] zzniVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzabmVar2.getClass();
                long zzm3 = zzm2.zzm(zzabmVar2, this.zzH.zzs, 1 == zzs, zArr);
                zzmw zzmwVar2 = this.zzH;
                boolean z3 = (zzmwVar2.zze == 4 || zzm3 == zzmwVar2.zzs) ? false : true;
                zzmw zzmwVar3 = this.zzH;
                zzmg zzmgVar = zzm2;
                this.zzH = zzao(zzmwVar3.zzb, zzm3, zzmwVar3.zzc, zzmwVar3.zzd, z3, 5);
                if (z3) {
                    zzU(zzm3, true);
                }
                zzab();
                i2 = 2;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (i3 < 2) {
                    int zzd = zzniVarArr[i3].zzd();
                    zArr2[i3] = zzniVarArr[i3].zzM();
                    zzmg zzmgVar2 = zzmgVar;
                    zzniVarArr[i3].zzD(zzmgVar2.zzc[i3], zzjlVar, this.zzU, zArr[i3]);
                    if (zzd - zzniVarArr[i3].zzd() > 0) {
                        zzN(i3, false);
                    }
                    this.zzS -= zzd - zzniVarArr[i3].zzd();
                    i3++;
                    zzmgVar = zzmgVar2;
                }
                zzaq(zArr2, this.zzU);
                zzmgVar.zzh = true;
            } else {
                zzmjVar.zzs(zzm);
                if (zzm.zze) {
                    long max = Math.max(zzm.zzg.zzb, this.zzU - zzm.zza());
                    if (this.zzy && zzaz() && zzmjVar.zzo() == zzm) {
                        zzab();
                    }
                    zzm.zzl(zzk, max, false);
                }
            }
            zzas(true);
            if (this.zzH.zze != 4) {
                zzam();
                zzL();
                this.zzh.zzh(i2);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzmg zzm = this.zzr.zzm();
        long j = zzm.zzg.zze;
        if (!zzm.zze) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzH.zzs < j) {
            return true;
        }
        return !zzax();
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x027f, code lost:
    
        if (r5 >= r27) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x044d  */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf(zzbf zzbfVar, boolean z) throws zzjn {
        Object obj;
        zzxo zzxoVar;
        long j;
        long j2;
        zzbe zzbeVar;
        long j3;
        Object obj2;
        int i;
        int i2;
        long j4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j5;
        Object obj3;
        long j6;
        zzxo zzxoVar2;
        boolean z6;
        boolean z7;
        boolean z8;
        long j7;
        boolean z9;
        int i3;
        Object obj4;
        boolean z10;
        int i4;
        zzxo zzxoVar3;
        boolean z11;
        long j8;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        zzbf zzbfVar2;
        int i5;
        int i6;
        int[] iArr;
        long longValue;
        boolean z16;
        int i7;
        boolean z17;
        int i8;
        boolean z18;
        boolean z19;
        boolean z20;
        zzlx zzlxVar;
        long j9;
        long j10;
        long j11;
        boolean z21;
        zzmw zzmwVar = this.zzH;
        zzlx zzlxVar2 = this.zzT;
        zzbd zzbdVar = this.zzl;
        int i9 = this.zzP;
        boolean z22 = this.zzQ;
        boolean z23 = this.zzA;
        if (zzbfVar.zzg()) {
            zzxo zzb = zzmw.zzb();
            zzxo zzxoVar4 = zzmwVar.zzb;
            boolean z24 = (zzb.equals(zzxoVar4) && zzmwVar.zzs == 0) ? false : true;
            if (z24 && z) {
                zzbf zzbfVar3 = zzmwVar.zza;
                if (!zzbfVar3.zzg() && !zzbfVar3.zzo(zzxoVar4.zza, zzbdVar).zzf) {
                    z21 = true;
                    z15 = z21;
                    zzxoVar3 = zzb;
                    z11 = z24;
                    j5 = 0;
                    i4 = 4;
                    j = -9223372036854775807L;
                    z12 = false;
                    z13 = true;
                    z8 = true;
                    z14 = false;
                    j8 = 0;
                }
            }
            z21 = false;
            z15 = z21;
            zzxoVar3 = zzb;
            z11 = z24;
            j5 = 0;
            i4 = 4;
            j = -9223372036854775807L;
            z12 = false;
            z13 = true;
            z8 = true;
            z14 = false;
            j8 = 0;
        } else {
            zzxo zzxoVar5 = zzmwVar.zzb;
            Object obj5 = zzxoVar5.zza;
            boolean zzaB = zzaB(zzmwVar, zzbdVar);
            long j12 = (zzxoVar5.zzb() || zzaB) ? zzmwVar.zzc : zzmwVar.zzs;
            zzbe zzbeVar2 = this.zzk;
            if (zzlxVar2 != null) {
                obj = obj5;
                zzxoVar = zzxoVar5;
                long j13 = j12;
                Pair zzaD = zzaD(zzbfVar, zzlxVar2, true, i9, z22, zzbeVar2, zzbdVar);
                if (zzaD == null) {
                    i8 = zzbfVar.zzk(z22);
                    obj2 = obj;
                    longValue = j13;
                    z18 = false;
                    z19 = true;
                    z17 = false;
                } else {
                    if (zzlxVar2.zzc == -9223372036854775807L) {
                        i7 = zzbfVar.zzo(zzaD.first, zzbdVar).zzc;
                        obj2 = obj;
                        longValue = j13;
                        z16 = false;
                    } else {
                        obj2 = zzaD.first;
                        longValue = ((Long) zzaD.second).longValue();
                        z16 = true;
                        i7 = -1;
                    }
                    z17 = z16;
                    i8 = i7;
                    z18 = zzmwVar.zze == 4;
                    z19 = false;
                }
                z2 = z18;
                z3 = z19;
                z4 = z17;
                zzbeVar = zzbeVar2;
                j2 = j13;
                i2 = i8;
                j = longValue;
                i = -1;
                j3 = 0;
            } else {
                obj = obj5;
                zzxoVar = zzxoVar5;
                j = j12;
                zzbf zzbfVar4 = zzmwVar.zza;
                if (zzbfVar4.zzg()) {
                    i2 = zzbfVar.zzk(z22);
                    obj2 = obj;
                    zzbeVar = zzbeVar2;
                    j2 = j;
                } else if (zzbfVar.zze(obj) == -1) {
                    int zzr = zzr(zzbeVar2, zzbdVar, i9, z22, obj, zzbfVar4, zzbfVar);
                    if (zzr == -1) {
                        zzr = zzbfVar.zzk(z22);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i2 = zzr;
                    z3 = z5;
                    obj2 = obj;
                    zzbeVar = zzbeVar2;
                    j2 = j;
                    i = -1;
                    j3 = 0;
                    z2 = false;
                    z4 = false;
                } else {
                    j2 = j;
                    if (j2 == -9223372036854775807L) {
                        i2 = zzbfVar.zzo(obj, zzbdVar).zzc;
                        j = j2;
                        obj2 = obj;
                        zzbeVar = zzbeVar2;
                    } else if (zzaB) {
                        zzbfVar4.zzo(obj, zzbdVar);
                        zzbeVar = zzbeVar2;
                        if (zzbfVar4.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar4.zze(obj)) {
                            Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(obj, zzbdVar).zzc, j2);
                            obj2 = zzm.first;
                            j4 = ((Long) zzm.second).longValue();
                            j3 = 0;
                        } else {
                            if (zzbfVar.zzo(obj, zzbdVar).zzd != -9223372036854775807L) {
                                long j14 = zzbdVar.zzd - 1;
                                String str = zzfm.zza;
                                j3 = 0;
                                j4 = Math.max(0L, Math.min(j2, j14));
                            } else {
                                j3 = 0;
                                j4 = j2;
                            }
                            obj2 = obj;
                        }
                        j = j4;
                        i = -1;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        zzbeVar = zzbeVar2;
                        j3 = 0;
                        j = j2;
                        obj2 = obj;
                        i = -1;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                i = -1;
                j3 = 0;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (i2 != i) {
                j5 = j3;
                Pair zzm2 = zzbfVar.zzm(zzbeVar, zzbdVar, i2, -9223372036854775807L);
                obj3 = zzm2.first;
                j6 = ((Long) zzm2.second).longValue();
                j = -9223372036854775807L;
            } else {
                j5 = j3;
                obj3 = obj2;
                j6 = j;
            }
            long j15 = j6;
            long j16 = j2;
            zzxo zzy = this.zzr.zzy(zzmwVar, zzbfVar, obj3, j15, z23, zzaB);
            int i10 = zzy.zze;
            if (i10 != -1) {
                zzxoVar2 = zzxoVar;
                int i11 = zzxoVar2.zze;
                if (i11 == -1 || i10 < i11) {
                    z6 = false;
                    boolean equals = obj.equals(obj3);
                    z7 = (equals || zzxoVar2.zzb() || zzy.zzb() || !z6) ? false : true;
                    zzbd zzo = zzbfVar.zzo(obj3, zzbdVar);
                    if (!zzaB && j16 == j && obj.equals(zzy.zza)) {
                        if (zzxoVar2.zzb()) {
                            zzo.zzj(zzxoVar2.zzb);
                        }
                        if (zzy.zzb()) {
                            zzo.zzj(zzy.zzb);
                        }
                    }
                    z8 = true;
                    if (true == z7) {
                        zzy = zzxoVar2;
                    }
                    if (zzy.zzb()) {
                        if (equals && zzxoVar2.zzb()) {
                            zza zza2 = zzbfVar.zzo(obj3, zzbdVar).zzg.zza(zzxoVar2.zzb);
                            long j17 = zza2.zzi;
                            long j18 = zzmwVar.zzc;
                            if (j18 != -9223372036854775807L) {
                                long j19 = zza2.zza;
                            }
                            int i12 = zza2.zzb;
                            int i13 = zzxoVar2.zzc;
                            if (i12 > i13 && zza2.zze[i13] == 2) {
                                long j20 = zzbfVar.zzo(obj3, zzbdVar).zzd;
                                j7 = j20 != -9223372036854775807L ? Math.min(j20 - 1, j15) : j15;
                                j = j7;
                            }
                        }
                        j7 = j15;
                    } else if (zzy.equals(zzxoVar2)) {
                        j7 = zzmwVar.zzs;
                    } else {
                        zzbfVar.zzo(zzy.zza, zzbdVar);
                        if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                            zzbdVar.zzi();
                        }
                        j7 = j5;
                    }
                    z9 = zzy.equals(zzxoVar2) || j7 != zzmwVar.zzs;
                    i3 = zzbfVar.zze(obj) != -1 ? 4 : 3;
                    obj4 = zzy.zza;
                    if (obj4.equals(obj) && (i5 = zzy.zzb) != -1) {
                        zza zza3 = zzbfVar.zzo(obj4, zzbdVar).zzg.zza(i5);
                        i6 = zzy.zzc;
                        iArr = zza3.zze;
                        if (i6 < iArr.length || iArr[i6] != 2) {
                            i3 = 0;
                        }
                    }
                    if (z9 && z) {
                        zzbfVar2 = zzmwVar.zza;
                        if (!zzbfVar2.zzg() && !zzbfVar2.zzo(obj, zzbdVar).zzf) {
                            z10 = true;
                            i4 = i3;
                            zzxoVar3 = zzy;
                            z11 = z9;
                            j8 = j7;
                            z12 = z2;
                            z13 = z3;
                            z14 = z4;
                            z15 = z10;
                        }
                    }
                    z10 = false;
                    i4 = i3;
                    zzxoVar3 = zzy;
                    z11 = z9;
                    j8 = j7;
                    z12 = z2;
                    z13 = z3;
                    z14 = z4;
                    z15 = z10;
                }
            } else {
                zzxoVar2 = zzxoVar;
            }
            z6 = true;
            boolean equals2 = obj.equals(obj3);
            if (equals2) {
            }
            zzbd zzo2 = zzbfVar.zzo(obj3, zzbdVar);
            if (!zzaB) {
                if (zzxoVar2.zzb()) {
                }
                if (zzy.zzb()) {
                }
            }
            z8 = true;
            if (true == z7) {
            }
            if (zzy.zzb()) {
            }
            if (zzy.equals(zzxoVar2)) {
            }
            if (zzbfVar.zze(obj) != -1) {
            }
            obj4 = zzy.zza;
            if (obj4.equals(obj)) {
                zza zza32 = zzbfVar.zzo(obj4, zzbdVar).zzg.zza(i5);
                i6 = zzy.zzc;
                iArr = zza32.zze;
                if (i6 < iArr.length) {
                }
                i3 = 0;
            }
            if (z9) {
                zzbfVar2 = zzmwVar.zza;
                if (!zzbfVar2.zzg()) {
                    z10 = true;
                    i4 = i3;
                    zzxoVar3 = zzy;
                    z11 = z9;
                    j8 = j7;
                    z12 = z2;
                    z13 = z3;
                    z14 = z4;
                    z15 = z10;
                }
            }
            z10 = false;
            i4 = i3;
            zzxoVar3 = zzy;
            z11 = z9;
            j8 = j7;
            z12 = z2;
            z13 = z3;
            z14 = z4;
            z15 = z10;
        }
        if (z13) {
            try {
                if (this.zzH.zze != z8) {
                    zzB(4);
                }
                z20 = false;
                try {
                    zzX(false, false, false, z8);
                } catch (Throwable th) {
                    th = th;
                    zzlxVar = null;
                    j9 = j8;
                    zzmw zzmwVar2 = this.zzH;
                    zzbf zzbfVar5 = zzmwVar2.zza;
                    zzxo zzxoVar6 = zzmwVar2.zzb;
                    if (z8 == z14) {
                    }
                    long j21 = j9;
                    zzlx zzlxVar3 = zzlxVar;
                    zzag(zzbfVar, zzxoVar3, zzbfVar5, zzxoVar6, r16, false);
                    if (!z11) {
                    }
                    this.zzH = zzao(zzxoVar3, j21, j, !z15 ? j21 : this.zzH.zzd, z15, i4);
                    zzaj();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzas(z20);
                    this.zzh.zzh(2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                z20 = false;
                zzlxVar = null;
                j9 = j8;
                zzmw zzmwVar22 = this.zzH;
                zzbf zzbfVar52 = zzmwVar22.zza;
                zzxo zzxoVar62 = zzmwVar22.zzb;
                if (z8 == z14) {
                }
                long j212 = j9;
                zzlx zzlxVar32 = zzlxVar;
                zzag(zzbfVar, zzxoVar3, zzbfVar52, zzxoVar62, r16, false);
                if (!z11) {
                }
                this.zzH = zzao(zzxoVar3, j212, j, !z15 ? j212 : this.zzH.zzd, z15, i4);
                zzaj();
                zzZ(zzbfVar, this.zzH.zza);
                this.zzH = this.zzH.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                }
                zzas(z20);
                this.zzh.zzh(2);
                throw th;
            }
        } else {
            z20 = false;
        }
        zzni[] zzniVarArr = this.zzb;
        for (?? r1 = z20; r1 < 2; r1++) {
            zzniVarArr[r1].zzn(zzbfVar);
        }
        try {
            if (z11) {
                j10 = j8;
                if (!zzbfVar.zzg()) {
                    zzmj zzmjVar = this.zzr;
                    for (zzmg zzm3 = zzmjVar.zzm(); zzm3 != null; zzm3 = zzm3.zzp()) {
                        if (zzm3.zzg.zza.equals(zzxoVar3)) {
                            zzm3.zzg = zzmjVar.zzx(zzbfVar, zzm3.zzg);
                        }
                    }
                    j9 = j10;
                    try {
                        j11 = zzS(zzxoVar3, j9, z12);
                        zzmw zzmwVar3 = this.zzH;
                        zzag(zzbfVar, zzxoVar3, zzmwVar3.zza, zzmwVar3.zzb, z8 == z14 ? -9223372036854775807L : j11, false);
                        if (!z11 || j != this.zzH.zzc) {
                            this.zzH = zzao(zzxoVar3, j11, j, !z15 ? j11 : this.zzH.zzd, z15, i4);
                        }
                        zzaj();
                        zzZ(zzbfVar, this.zzH.zza);
                        this.zzH = this.zzH.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                            this.zzT = null;
                        }
                        zzas(z20);
                        this.zzh.zzh(2);
                    } catch (Throwable th3) {
                        th = th3;
                        zzlxVar = null;
                        zzmw zzmwVar222 = this.zzH;
                        zzbf zzbfVar522 = zzmwVar222.zza;
                        zzxo zzxoVar622 = zzmwVar222.zzb;
                        long j22 = z8 == z14 ? j9 : -9223372036854775807L;
                        long j2122 = j9;
                        zzlx zzlxVar322 = zzlxVar;
                        zzag(zzbfVar, zzxoVar3, zzbfVar522, zzxoVar622, j22, false);
                        if (!z11 || j != this.zzH.zzc) {
                            this.zzH = zzao(zzxoVar3, j2122, j, !z15 ? j2122 : this.zzH.zzd, z15, i4);
                        }
                        zzaj();
                        zzZ(zzbfVar, this.zzH.zza);
                        this.zzH = this.zzH.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                            this.zzT = zzlxVar322;
                        }
                        zzas(z20);
                        this.zzh.zzh(2);
                        throw th;
                    }
                }
            } else {
                try {
                    zzmj zzmjVar2 = this.zzr;
                    long zzah = zzmjVar2.zzn() == null ? j5 : zzah(zzmjVar2.zzn());
                    if (zzaz() && zzmjVar2.zzo() != null) {
                        j5 = zzah(zzmjVar2.zzo());
                    }
                    j10 = j8;
                    int zzw = zzmjVar2.zzw(zzbfVar, this.zzU, zzah, j5);
                    if ((zzw & 1) != 0) {
                        zzI(z20);
                    } else if ((zzw & 2) != 0) {
                        zzab();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    long j23 = j8;
                    j9 = j23;
                    zzlxVar = null;
                    zzmw zzmwVar2222 = this.zzH;
                    zzbf zzbfVar5222 = zzmwVar2222.zza;
                    zzxo zzxoVar6222 = zzmwVar2222.zzb;
                    if (z8 == z14) {
                    }
                    long j21222 = j9;
                    zzlx zzlxVar3222 = zzlxVar;
                    zzag(zzbfVar, zzxoVar3, zzbfVar5222, zzxoVar6222, j22, false);
                    if (!z11) {
                    }
                    this.zzH = zzao(zzxoVar3, j21222, j, !z15 ? j21222 : this.zzH.zzd, z15, i4);
                    zzaj();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzas(z20);
                    this.zzh.zzh(2);
                    throw th;
                }
            }
            j11 = j10;
            zzmw zzmwVar32 = this.zzH;
            zzag(zzbfVar, zzxoVar3, zzmwVar32.zza, zzmwVar32.zzb, z8 == z14 ? -9223372036854775807L : j11, false);
            if (!z11) {
            }
            this.zzH = zzao(zzxoVar3, j11, j, !z15 ? j11 : this.zzH.zzd, z15, i4);
            zzaj();
            zzZ(zzbfVar, this.zzH.zza);
            this.zzH = this.zzH.zzd(zzbfVar);
            if (!zzbfVar.zzg()) {
            }
            zzas(z20);
            this.zzh.zzh(2);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final void zzag(zzbf zzbfVar, zzxo zzxoVar, zzbf zzbfVar2, zzxo zzxoVar2, long j, boolean z) throws zzjn {
        if (!zzP(zzbfVar, zzxoVar)) {
            zzav zzavVar = zzxoVar.zzb() ? zzav.zza : this.zzH.zzo;
            if (this.zzn.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzH.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzxoVar.zza;
        zzbd zzbdVar = this.zzl;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzk;
        zzbfVar.zzb(i, zzbeVar, 0L);
        zzjg zzjgVar = this.zzae;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfm.zza;
        zzjgVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzjgVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxoVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzjgVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzmg zzmgVar) {
        if (zzmgVar == null) {
            return 0L;
        }
        long zza2 = zzmgVar.zza();
        if (zzmgVar.zze) {
            int i = 0;
            while (true) {
                zzni[] zzniVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzniVarArr[i].zzp(zzmgVar)) {
                    long zzf = zzniVarArr[i].zzf(zzmgVar);
                    if (zzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zza2 = Math.max(zzf, zza2);
                }
                i++;
            }
        }
        return zza2;
    }

    private final void zzai() {
        zzmj zzmjVar = this.zzr;
        zzmjVar.zzt();
        zzmg zzl = zzmjVar.zzl();
        if (zzl != null) {
            if (!zzl.zzd || zzl.zze) {
                zzxm zzxmVar = zzl.zza;
                if (zzxmVar.zze()) {
                    return;
                }
                if (this.zzg.zzj(this.zzu, this.zzH.zza, zzl.zzg.zza, zzl.zze ? zzxmVar.zzb() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzs(this, zzl.zzg.zzb);
                        return;
                    }
                    zzmd zzmdVar = new zzmd();
                    zzmdVar.zza(this.zzU - zzl.zza());
                    zzmdVar.zzb(this.zzn.zzj().zzb);
                    zzmdVar.zzc(this.zzN);
                    zzl.zzj(new zzme(zzmdVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzmg zzm = this.zzr.zzm();
        boolean z = false;
        if (zzm != null && zzm.zzg.zzh && this.zzK) {
            z = true;
        }
        this.zzL = z;
    }

    private final void zzak(zzav zzavVar, boolean z) throws zzjn {
        zzal(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzal(zzav zzavVar, float f, boolean z, boolean z2) throws zzjn {
        int i;
        if (z) {
            if (z2) {
                this.zzI.zza(1);
            }
            zzmw zzmwVar = this.zzH;
            zzbf zzbfVar = zzmwVar.zza;
            zzxo zzxoVar = zzmwVar.zzb;
            long j = zzmwVar.zzc;
            long j2 = zzmwVar.zzd;
            int i2 = zzmwVar.zze;
            zzjn zzjnVar = zzmwVar.zzf;
            boolean z3 = zzmwVar.zzg;
            zzzr zzzrVar = zzmwVar.zzh;
            zzabm zzabmVar = zzmwVar.zzi;
            List list = zzmwVar.zzj;
            zzxo zzxoVar2 = zzmwVar.zzk;
            boolean z4 = zzmwVar.zzl;
            int i3 = zzmwVar.zzm;
            int i4 = zzmwVar.zzn;
            long j3 = zzmwVar.zzq;
            long j4 = zzmwVar.zzr;
            long j5 = zzmwVar.zzs;
            long j6 = zzmwVar.zzt;
            boolean z5 = zzmwVar.zzp;
            this.zzH = new zzmw(zzbfVar, zzxoVar, j, j2, i2, zzjnVar, z3, zzzrVar, zzabmVar, list, zzxoVar2, z4, i3, i4, zzavVar, j3, j4, j5, j6, false);
        }
        float f2 = zzavVar.zzb;
        zzmg zzm = this.zzr.zzm();
        while (true) {
            i = 0;
            if (zzm == null) {
                break;
            }
            zzabe[] zzabeVarArr = zzm.zzr().zzc;
            int length = zzabeVarArr.length;
            while (i < length) {
                zzabe zzabeVar = zzabeVarArr[i];
                i++;
            }
            zzm = zzm.zzp();
        }
        zzni[] zzniVarArr = this.zzb;
        while (i < 2) {
            zzniVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzam() {
        long zza2;
        long j;
        zzmj zzmjVar;
        boolean zzh;
        zzmj zzmjVar2 = this.zzr;
        if (zzaF(zzmjVar2.zzk())) {
            zzmg zzk = zzmjVar2.zzk();
            long zzau = zzau(zzk.zzg());
            if (zzk == zzmjVar2.zzm()) {
                zza2 = this.zzU;
                j = zzk.zza();
            } else {
                zza2 = this.zzU - zzk.zza();
                j = zzk.zzg.zzb;
            }
            zzmjVar = zzmjVar2;
            zzmb zzmbVar = new zzmb(this.zzu, this.zzH.zza, zzk.zzg.zza, zza2 - j, zzau, this.zzn.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN);
            zzmc zzmcVar = this.zzg;
            zzh = zzmcVar.zzh(zzmbVar);
            zzmg zzm = zzmjVar.zzm();
            if (!zzh && zzm.zze && zzau < 500000 && this.zzm > 0) {
                zzm.zza.zzq(this.zzH.zzs, false);
                zzh = zzmcVar.zzh(zzmbVar);
            }
        } else {
            zzmjVar = zzmjVar2;
            zzh = false;
        }
        this.zzO = zzh;
        if (zzh) {
            zzmg zzk2 = zzmjVar.zzk();
            zzk2.getClass();
            zzmd zzmdVar = new zzmd();
            zzmdVar.zza(this.zzU - zzk2.zza());
            zzmdVar.zzb(this.zzn.zzj().zzb);
            zzmdVar.zzc(this.zzN);
            zzk2.zzj(new zzme(zzmdVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzmg zzk = this.zzr.zzk();
        boolean z = true;
        if (!this.zzO && (zzk == null || !zzk.zza.zze())) {
            z = false;
        }
        zzmw zzmwVar = this.zzH;
        if (z != zzmwVar.zzg) {
            this.zzH = zzmwVar.zzg(z);
        }
    }

    private final zzmw zzao(zzxo zzxoVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzzr zzzrVar;
        zzabm zzabmVar;
        zzmg zzm;
        int i2 = 0;
        this.zzX = (!this.zzX && j == this.zzH.zzs && zzxoVar.equals(this.zzH.zzb)) ? false : true;
        zzaj();
        zzmw zzmwVar = this.zzH;
        zzzr zzzrVar2 = zzmwVar.zzh;
        zzabm zzabmVar2 = zzmwVar.zzi;
        List list2 = zzmwVar.zzj;
        if (this.zzs.zzb()) {
            zzmj zzmjVar = this.zzr;
            zzmg zzm2 = zzmjVar.zzm();
            zzzr zzq = zzm2 == null ? zzzr.zza : zzm2.zzq();
            zzabm zzr = zzm2 == null ? this.zzf : zzm2.zzr();
            zzabe[] zzabeVarArr = zzr.zzc;
            zzgxj zzgxjVar = new zzgxj();
            boolean z2 = false;
            for (zzabe zzabeVar : zzabeVarArr) {
                if (zzabeVar != null) {
                    zzap zzapVar = zzabeVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgxjVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgxjVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            zzgxm zzi = z2 ? zzgxjVar.zzi() : zzgxm.zzi();
            if (zzm2 != null) {
                zzmh zzmhVar = zzm2.zzg;
                if (zzmhVar.zzd != j2) {
                    zzm2.zzg = zzmhVar.zzb(j2);
                }
            }
            if (zzmjVar.zzm() == zzmjVar.zzn() && (zzm = zzmjVar.zzm()) != null) {
                zzabm zzr2 = zzm.zzr();
                while (true) {
                    zzni[] zzniVarArr = this.zzb;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzr2.zza(i2)) {
                        if (zzniVarArr[i2].zze() != 1) {
                            break;
                        }
                        int i3 = zzr2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzi;
            zzzrVar = zzq;
            zzabmVar = zzr;
        } else if (zzxoVar.equals(this.zzH.zzb)) {
            list = list2;
            zzzrVar = zzzrVar2;
            zzabmVar = zzabmVar2;
        } else {
            zzabmVar = this.zzf;
            zzzrVar = zzzr.zza;
            list = zzgxm.zzi();
        }
        if (z) {
            this.zzI.zzc(i);
        }
        return this.zzH.zzc(zzxoVar, j, j2, j3, zzat(), zzzrVar, zzabmVar, list);
    }

    private final void zzap() throws zzjn {
        zzaq(new boolean[2], this.zzr.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zzjn {
        zzni[] zzniVarArr;
        zzmg zzn = this.zzr.zzn();
        zzabm zzr = zzn.zzr();
        int i = 0;
        while (true) {
            zzniVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzr.zza(i)) {
                zzniVarArr[i].zzG();
            }
            i++;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzr.zza(i2) && !zzniVarArr[i2].zzp(zzn)) {
                zzar(zzn, i2, zArr[i2], j);
            }
        }
    }

    private final void zzar(zzmg zzmgVar, int i, boolean z, long j) throws zzjn {
        zzni zzniVar = this.zzb[i];
        if (zzniVar.zzM()) {
            return;
        }
        boolean z2 = zzmgVar == this.zzr.zzm();
        zzabm zzr = zzmgVar.zzr();
        zznh zznhVar = zzr.zzb[i];
        zzabe zzabeVar = zzr.zzc[i];
        boolean z3 = zzax() && this.zzH.zze == 3;
        boolean z4 = !z && z3;
        this.zzS++;
        zzniVar.zzx(zznhVar, zzabeVar, zzmgVar.zzc[i], this.zzU, z4, z2, j, zzmgVar.zza(), zzmgVar.zzg.zza, this.zzn);
        zzniVar.zzy(11, new zzll(this), zzmgVar);
        if (z3 && z2) {
            zzniVar.zzv();
        }
    }

    private final void zzas(boolean z) {
        zzmg zzk = this.zzr.zzk();
        zzxo zzxoVar = zzk == null ? this.zzH.zzb : zzk.zzg.zza;
        boolean equals = this.zzH.zzk.equals(zzxoVar);
        if (!equals) {
            this.zzH = this.zzH.zzh(zzxoVar);
        }
        zzmw zzmwVar = this.zzH;
        zzmwVar.zzq = zzk == null ? zzmwVar.zzs : zzk.zzf();
        this.zzH.zzr = zzat();
        if ((!equals || z) && zzk != null && zzk.zze) {
            zzaw(zzk.zzg.zza, zzk.zzq(), zzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzH.zzq);
    }

    private final long zzau(long j) {
        zzmg zzk = this.zzr.zzk();
        if (zzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzU - zzk.zza()));
    }

    private final long zzav(zzmg zzmgVar) {
        zzguk.zzi(zzmgVar.zze);
        return (long) ((zzmgVar.zzc() - this.zzU) / this.zzn.zzj().zzb);
    }

    private final void zzaw(zzxo zzxoVar, zzzr zzzrVar, zzabm zzabmVar) {
        long zza2;
        long j;
        zzmj zzmjVar = this.zzr;
        zzmg zzk = zzmjVar.zzk();
        zzk.getClass();
        if (zzk == zzmjVar.zzm()) {
            zza2 = this.zzU;
            j = zzk.zza();
        } else {
            zza2 = this.zzU - zzk.zza();
            j = zzk.zzg.zzb;
        }
        this.zzg.zzb(new zzmb(this.zzu, this.zzH.zza, zzxoVar, zza2 - j, zzau(zzk.zzf()), this.zzn.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN), zzzrVar, zzabmVar.zzc);
    }

    private final boolean zzax() {
        zzmw zzmwVar = this.zzH;
        return zzmwVar.zzl && zzmwVar.zzn == 0;
    }

    private final void zzay(int i) throws IOException, zzjn {
        zzni zzniVar = this.zzb[i];
        try {
            zzmg zzm = this.zzr.zzm();
            if (zzm == null) {
                throw null;
            }
            zzmg zzmgVar = zzm;
            zzniVar.zzu(zzm);
        } catch (IOException | RuntimeException e) {
            zzniVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzni[] zzniVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzniVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        Object obj2 = zzbfVar.zzb(zzbfVar.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zze = zzbfVar.zze(obj);
        int zzc = zzbfVar.zzc();
        int i3 = zze;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            if (i4 >= zzc || i5 != -1) {
                break;
            }
            i3 = zzbfVar.zzl(i3, zzbdVar, zzbeVar, i, z);
            if (i3 == -1) {
                i5 = -1;
                break;
            }
            i5 = zzbfVar2.zze(zzbfVar.zzf(i3));
            i4++;
        }
        if (i5 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(i5, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzna zznaVar) {
        try {
            zzaE(zznaVar);
        } catch (zzjn e) {
            zzeh.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:358:0x0a6f, code lost:
    
        if (r8 == false) goto L544;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c33 A[ADDED_TO_REGION, LOOP:5: B:191:0x0c33->B:194:0x0c3b, LOOP_START, PHI: r2
      0x0c33: PHI (r2v37 com.google.android.gms.internal.ads.zzmg) = (r2v33 com.google.android.gms.internal.ads.zzmg), (r2v38 com.google.android.gms.internal.ads.zzmg) binds: [B:190:0x0c30, B:194:0x0c3b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08de A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x08e5 A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a4e A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0b13 A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b28 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0b29 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a64 A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x07e1 A[Catch: zzjn -> 0x08bc, RuntimeException -> 0x0b5d, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #4 {zzjn -> 0x08bc, blocks: (B:475:0x07d5, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:491:0x0808, B:493:0x0810, B:502:0x083e), top: B:474:0x07d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0810 A[Catch: zzjn -> 0x08bc, RuntimeException -> 0x0b5d, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TRY_LEAVE, TryCatch #4 {zzjn -> 0x08bc, blocks: (B:475:0x07d5, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:491:0x0808, B:493:0x0810, B:502:0x083e), top: B:474:0x07d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x087c A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, LOOP:13: B:509:0x087a->B:510:0x087c, LOOP_END, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x088b A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x089b A[Catch: RuntimeException -> 0x0b5d, zzjn -> 0x0b5f, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TryCatch #13 {RuntimeException -> 0x0b5d, blocks: (B:470:0x0751, B:543:0x0757, B:545:0x075d, B:548:0x0763, B:549:0x076d, B:552:0x0772, B:559:0x0798, B:561:0x079e, B:563:0x07a6, B:565:0x07b3, B:567:0x07b9, B:574:0x07c3, B:475:0x07d5, B:533:0x08b7, B:251:0x08d6, B:253:0x08de, B:254:0x08e5, B:256:0x08f3, B:257:0x090d, B:259:0x0911, B:261:0x0919, B:263:0x0943, B:264:0x091d, B:266:0x0926, B:269:0x092f, B:274:0x093f, B:280:0x0951, B:385:0x0957, B:389:0x0964, B:392:0x096c, B:395:0x0971, B:396:0x097b, B:399:0x0982, B:292:0x0aa3, B:295:0x0aab, B:297:0x0aaf, B:299:0x0ab7, B:301:0x0aba, B:304:0x0abe, B:306:0x0ac4, B:308:0x0acd, B:310:0x0ad7, B:312:0x0add, B:314:0x0ae8, B:315:0x0b0d, B:317:0x0b13, B:320:0x0b1d, B:323:0x0b3a, B:329:0x0b31, B:331:0x0b35, B:333:0x0aef, B:336:0x0afd, B:337:0x0b05, B:338:0x0b06, B:282:0x0990, B:284:0x0998, B:286:0x099c, B:289:0x0a41, B:291:0x0a4e, B:339:0x0a5d, B:341:0x0a64, B:343:0x0a68, B:346:0x0a71, B:348:0x0a81, B:350:0x0a87, B:352:0x0a91, B:354:0x0a96, B:356:0x0a9b, B:357:0x0aa0, B:361:0x09a8, B:363:0x09ac, B:365:0x09be, B:366:0x09cc, B:368:0x09d6, B:371:0x09df, B:373:0x09e9, B:378:0x09f4, B:404:0x094a, B:477:0x07e1, B:479:0x07e5, B:481:0x07eb, B:483:0x07f1, B:485:0x07fb, B:489:0x0802, B:491:0x0808, B:493:0x0810, B:495:0x0825, B:497:0x082d, B:499:0x0835, B:502:0x083e, B:504:0x085f, B:506:0x0871, B:508:0x0877, B:510:0x087c, B:512:0x0884, B:514:0x088b, B:515:0x088e, B:516:0x0897, B:518:0x089b, B:520:0x08a1, B:522:0x08a6, B:529:0x08b6, B:612:0x067d, B:614:0x0684, B:616:0x0688, B:618:0x0698, B:620:0x069c, B:624:0x06a4, B:626:0x06aa, B:628:0x06c7, B:633:0x06d0, B:639:0x06fa, B:642:0x06d4, B:644:0x06dc, B:646:0x06e5, B:648:0x06eb, B:649:0x068e, B:655:0x0716, B:657:0x071c, B:659:0x0720, B:662:0x0726, B:667:0x072f, B:669:0x0735, B:673:0x0743, B:674:0x074a, B:686:0x0b45, B:689:0x0b50), top: B:5:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x08b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0757 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x05d9 A[Catch: zzjn -> 0x08c5, RuntimeException -> 0x0b67, IOException -> 0x0b95, zzwq -> 0x0b9d, zzht -> 0x0ba5, zzat -> 0x0bad, zzuk -> 0x0bc4, TRY_LEAVE, TryCatch #3 {zzjn -> 0x08c5, blocks: (B:406:0x04ae, B:409:0x04b8, B:423:0x04fa, B:426:0x050f, B:467:0x05c6, B:581:0x05d9, B:681:0x050c), top: B:405:0x04ae }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        String str;
        String str2;
        zzjn zzjnVar;
        String str3;
        String str4;
        RuntimeException runtimeException;
        boolean z;
        zzjn zzjnVar2;
        zzjn zzjnVar3;
        int i;
        zzxo zzxoVar;
        zzmj zzmjVar;
        zzmg zzo;
        zzmg zzn;
        zzd zzdVar;
        String str5;
        String str6;
        boolean z2;
        long uptimeMillis;
        zzea zzeaVar;
        zzmw zzmwVar;
        int i2;
        zzmj zzmjVar2;
        zzmg zzn2;
        long j;
        int i3;
        boolean z3;
        zzmg zzn3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        zzmg zzm;
        zzmg zzp;
        int i7;
        zzmg zzr;
        boolean z5;
        int i8;
        int i9;
        int i10;
        zzmg zzo2;
        int i11;
        zzmj zzmjVar3;
        zzabm zzabmVar;
        zzmg zzmgVar;
        zzmh zzh;
        zzmg zzm2;
        boolean z6;
        boolean z7;
        long j2;
        int i12;
        boolean zzi;
        int i13;
        try {
            try {
                try {
                    zzdVar = null;
                    try {
                        try {
                            try {
                            } catch (RuntimeException e) {
                                e = e;
                                runtimeException = e;
                                zzjn zzc = zzjn.zzc(runtimeException, (!(runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) ? 1004 : 1000);
                                zzeh.zzf(str4, str3, zzc);
                                zzW(true, false);
                                this.zzH = this.zzH.zzf(zzc);
                                z = true;
                                zzC(message.what);
                                return z;
                            }
                        } catch (zzjn e2) {
                            e = e2;
                        }
                    } catch (zzjn e3) {
                        e = e3;
                    } catch (RuntimeException e4) {
                        e = e4;
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    str3 = "Playback error";
                    str4 = "ExoPlayerImplInternal";
                }
            } catch (zzjn e6) {
                str = "Playback error";
                str2 = "ExoPlayerImplInternal";
                zzjnVar = e6;
            }
        } catch (zzat e7) {
            e = e7;
        } catch (zzht e8) {
            e = e8;
        } catch (zzuk e9) {
            e = e9;
        } catch (zzwq e10) {
            e = e10;
        } catch (IOException e11) {
            e = e11;
        }
        switch (message.what) {
            case 1:
                zzE(message.arg1 != 0, message.arg2 >> 4, true, 15 & message.arg2);
                z = true;
                zzC(message.what);
                return z;
            case 2:
                z2 = true;
                try {
                    uptimeMillis = SystemClock.uptimeMillis();
                    zzeaVar = this.zzh;
                    zzeaVar.zzk(2);
                    zzmwVar = this.zzH;
                    i2 = zzmwVar.zze;
                } catch (zzjn e12) {
                    e = e12;
                    str6 = "Playback error";
                    str5 = "ExoPlayerImplInternal";
                }
                if (i2 != 1 && i2 != 4) {
                    if (!zzmwVar.zza.zzg()) {
                        try {
                        } catch (zzjn e13) {
                            e = e13;
                            str6 = "Playback error";
                            str5 = "ExoPlayerImplInternal";
                        }
                        if (this.zzs.zzb()) {
                            zzmj zzmjVar4 = this.zzr;
                            zzmjVar4.zzf(this.zzU);
                            if (zzmjVar4.zzg() && (zzh = zzmjVar4.zzh(this.zzU, this.zzH)) != null) {
                                zzmg zzi2 = zzmjVar4.zzi(zzh);
                                if (!zzi2.zzd) {
                                    zzi2.zzs(this, zzh.zzb);
                                } else if (zzi2.zze) {
                                    zzeaVar.zzd(8, zzi2.zza).zza();
                                }
                                if (zzmjVar4.zzm() == zzi2) {
                                    zzU(zzh.zzb, true);
                                }
                                zzas(false);
                            }
                            if (this.zzO) {
                                this.zzO = zzaF(zzmjVar4.zzk());
                                zzan();
                            } else {
                                zzam();
                            }
                            if (!this.zzL && this.zzy && !this.zzac && !zzaz() && (zzo2 = zzmjVar4.zzo()) != null && zzo2 == zzmjVar4.zzn() && zzo2.zzp() != null && zzo2.zzp().zze && zzav(zzo2.zzp()) <= 10000000) {
                                zzmjVar4.zzq();
                                zzmg zzo3 = zzmjVar4.zzo();
                                if (zzo3 != null) {
                                    zzabm zzr2 = zzo3.zzr();
                                    int i14 = 0;
                                    while (true) {
                                        zzni[] zzniVarArr = this.zzb;
                                        if (i14 >= 2) {
                                            zzmjVar2 = zzmjVar4;
                                            zzmg zzmgVar2 = zzo3;
                                            if (zzaz()) {
                                                this.zzab = zzmgVar2.zza.zzr();
                                                if (!zzmgVar2.zzd()) {
                                                    zzmjVar2.zzs(zzmgVar2);
                                                    zzas(false);
                                                    zzam();
                                                }
                                            }
                                            zzn2 = zzmjVar2.zzn();
                                            if (zzn2 != null) {
                                                if (zzn2.zzp() != null && !this.zzL) {
                                                    zzmg zzn4 = zzmjVar2.zzn();
                                                    if (zzn4.zze) {
                                                        int i15 = 0;
                                                        while (true) {
                                                            zzni[] zzniVarArr2 = this.zzb;
                                                            if (i15 < 2) {
                                                                if (zzniVarArr2[i15].zzr(zzn4)) {
                                                                    i15++;
                                                                }
                                                            } else if ((!zzaz() || zzmjVar2.zzo() != zzmjVar2.zzn()) && ((zzn2.zzp().zze || this.zzU >= zzn2.zzp().zzc()) && (!zzn2.zzp().zze || zzav(zzn2.zzp()) <= 10000000))) {
                                                                zzabm zzr3 = zzn2.zzr();
                                                                zzmg zzp2 = zzmjVar2.zzp();
                                                                zzabm zzr4 = zzp2.zzr();
                                                                zzbf zzbfVar = this.zzH.zza;
                                                                zzabm zzabmVar2 = zzr3;
                                                                str6 = "Playback error";
                                                                str5 = "ExoPlayerImplInternal";
                                                                j = uptimeMillis;
                                                                zzag(zzbfVar, zzp2.zzg.zza, zzbfVar, zzn2.zzg.zza, -9223372036854775807L, false);
                                                                if (!zzp2.zze || ((!(z3 = this.zzy) || this.zzab == -9223372036854775807L) && zzp2.zza.zzr() == -9223372036854775807L)) {
                                                                    i3 = 2;
                                                                } else {
                                                                    this.zzab = -9223372036854775807L;
                                                                    if (z3 && !this.zzac) {
                                                                        i3 = 2;
                                                                        int i16 = 0;
                                                                        while (i16 < i3) {
                                                                            if (zzr4.zza(i16)) {
                                                                                zzniVarArr2[i16].zze();
                                                                                zzabe[] zzabeVarArr = zzr4.zzc;
                                                                                if (!zzas.zzd(zzabeVarArr[i16].zzc().zzp, zzabeVarArr[i16].zzc().zzk) && !zzniVarArr2[i16].zzc()) {
                                                                                }
                                                                            }
                                                                            i16++;
                                                                            i3 = 2;
                                                                        }
                                                                    }
                                                                    long zzc2 = zzp2.zzc();
                                                                    int i17 = 0;
                                                                    for (int i18 = 2; i17 < i18; i18 = 2) {
                                                                        zzniVarArr2[i17].zzj(zzc2);
                                                                        i17++;
                                                                    }
                                                                    if (!zzp2.zzd()) {
                                                                        zzmjVar2.zzs(zzp2);
                                                                        zzas(false);
                                                                        zzam();
                                                                    }
                                                                }
                                                                int i19 = 0;
                                                                while (i19 < i3) {
                                                                    zzabm zzabmVar3 = zzabmVar2;
                                                                    zzniVarArr2[i19].zzi(zzabmVar3, zzr4, zzp2.zzc());
                                                                    i19++;
                                                                    zzabmVar2 = zzabmVar3;
                                                                    i3 = 2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                str6 = "Playback error";
                                                str5 = "ExoPlayerImplInternal";
                                                j = uptimeMillis;
                                                try {
                                                    if (zzn2.zzg.zzi || this.zzL) {
                                                        zzni[] zzniVarArr3 = this.zzb;
                                                        int i20 = 0;
                                                        for (int i21 = 2; i20 < i21; i21 = 2) {
                                                            zzni zzniVar = zzniVarArr3[i20];
                                                            if (zzniVar.zzp(zzn2) && zzniVar.zzg(zzn2)) {
                                                                long j3 = zzn2.zzg.zze;
                                                                zzniVar.zzh(zzn2, (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? -9223372036854775807L : j3 + zzn2.zza());
                                                            }
                                                            i20++;
                                                        }
                                                    }
                                                    zzn3 = zzmjVar2.zzn();
                                                } catch (zzjn e14) {
                                                    e = e14;
                                                    zzjnVar = e;
                                                    str = str6;
                                                    str2 = str5;
                                                    if (zzjnVar.zzc == 1 && (zzn = this.zzr.zzn()) != null && zzjnVar.zzh == null) {
                                                        zzjnVar = zzjnVar.zzd(zzn.zzg.zza);
                                                    }
                                                    if (zzjnVar.zzc == 1 && (zzxoVar = zzjnVar.zzh) != null) {
                                                        int i22 = zzjnVar.zze;
                                                        zzmjVar = this.zzr;
                                                        if (zzmjVar.zzo() != null && zzmjVar.zzo().zzg.zza.equals(zzxoVar) && this.zzb[i22].zzq(zzmjVar.zzo())) {
                                                            this.zzac = true;
                                                            zzab();
                                                            zzo = zzmjVar.zzo();
                                                            zzmg zzm3 = zzmjVar.zzm();
                                                            if (zzmjVar.zzm() != zzo) {
                                                                while (zzm3 != null && zzm3.zzp() != zzo) {
                                                                    zzm3 = zzm3.zzp();
                                                                }
                                                            }
                                                            zzmjVar.zzs(zzm3);
                                                            if (this.zzH.zze != 4) {
                                                                zzam();
                                                                this.zzh.zzh(2);
                                                            }
                                                            z = true;
                                                            zzC(message.what);
                                                            return z;
                                                        }
                                                    }
                                                    zzjnVar2 = this.zzY;
                                                    if (zzjnVar2 != null) {
                                                        zzjnVar2.addSuppressed(zzjnVar);
                                                        zzjnVar = this.zzY;
                                                    }
                                                    zzjnVar3 = zzjnVar;
                                                    if (zzjnVar3.zzc == 1) {
                                                        zzmj zzmjVar5 = this.zzr;
                                                        if (zzmjVar5.zzm() != zzmjVar5.zzn()) {
                                                            while (zzmjVar5.zzm() != zzmjVar5.zzn()) {
                                                                zzmjVar5.zzr();
                                                            }
                                                            zzmg zzm4 = zzmjVar5.zzm();
                                                            zzm4.getClass();
                                                            zzC(message.what);
                                                            zzmh zzmhVar = zzm4.zzg;
                                                            zzxo zzxoVar2 = zzmhVar.zza;
                                                            long j4 = zzmhVar.zzb;
                                                            this.zzH = zzao(zzxoVar2, j4, zzmhVar.zzd, j4, true, 0);
                                                        }
                                                    }
                                                    if (zzjnVar3.zzi || !(this.zzY == null || (i = zzjnVar3.zza) == 5004 || i == 5003)) {
                                                        zzeh.zzf(str2, str, zzjnVar3);
                                                        z = true;
                                                        zzW(true, false);
                                                        this.zzH = this.zzH.zzf(zzjnVar3);
                                                        zzC(message.what);
                                                        return z;
                                                    }
                                                    zzeh.zzd(str2, "Recoverable renderer error", zzjnVar3);
                                                    if (this.zzY == null) {
                                                        this.zzY = zzjnVar3;
                                                    }
                                                    zzea zzeaVar2 = this.zzh;
                                                    zzeaVar2.zzg(zzeaVar2.zzd(25, zzjnVar3));
                                                    z = true;
                                                    zzC(message.what);
                                                    return z;
                                                }
                                                if (zzn3 != null) {
                                                    try {
                                                    } catch (zzjn e15) {
                                                        e = e15;
                                                    }
                                                    if (zzmjVar2.zzm() != zzn3 && !zzn3.zzh) {
                                                        zzmg zzn5 = zzmjVar2.zzn();
                                                        zzabm zzr5 = zzn5.zzr();
                                                        int i23 = 1;
                                                        int i24 = 0;
                                                        while (true) {
                                                            zzni[] zzniVarArr4 = this.zzb;
                                                            if (i24 < 2) {
                                                                int zzd = zzniVarArr4[i24].zzd();
                                                                int zzH = zzniVarArr4[i24].zzH(zzn5, zzr5, this.zzn);
                                                                this.zzS -= zzd - zzniVarArr4[i24].zzd();
                                                                i23 &= zzH & 1;
                                                                i24++;
                                                            } else if (i23 != 0) {
                                                                int i25 = 2;
                                                                int i26 = 0;
                                                                while (i26 < i25) {
                                                                    try {
                                                                        if (!zzr5.zza(i26) || zzniVarArr4[i26].zzp(zzn5)) {
                                                                            i5 = i25;
                                                                        } else {
                                                                            i5 = i25;
                                                                            zzar(zzn5, i26, false, zzn5.zzc());
                                                                        }
                                                                        i26++;
                                                                        i25 = i5;
                                                                    } catch (zzjn e16) {
                                                                        e = e16;
                                                                        zzjnVar = e;
                                                                        str = str6;
                                                                        str2 = str5;
                                                                        if (zzjnVar.zzc == 1) {
                                                                        }
                                                                        if (zzjnVar.zzc == 1) {
                                                                        }
                                                                        zzjnVar2 = this.zzY;
                                                                        if (zzjnVar2 != null) {
                                                                        }
                                                                        zzjnVar3 = zzjnVar;
                                                                        if (zzjnVar3.zzc == 1) {
                                                                        }
                                                                        if (zzjnVar3.zzi) {
                                                                        }
                                                                        zzeh.zzf(str2, str, zzjnVar3);
                                                                        z = true;
                                                                        zzW(true, false);
                                                                        this.zzH = this.zzH.zzf(zzjnVar3);
                                                                        zzC(message.what);
                                                                        return z;
                                                                    }
                                                                }
                                                                i4 = i25;
                                                                zzmjVar2.zzn().zzh = true;
                                                                z4 = false;
                                                                while (zzax() && !this.zzL && (zzm = zzmjVar2.zzm()) != null && (zzp = zzm.zzp()) != null && this.zzU >= zzp.zzc() && zzp.zzh) {
                                                                    try {
                                                                        if (z4) {
                                                                            i7 = -1;
                                                                        } else {
                                                                            i7 = -1;
                                                                            zzC(-1);
                                                                        }
                                                                        this.zzac = false;
                                                                        zzr = zzmjVar2.zzr();
                                                                        if (zzr != null) {
                                                                            throw null;
                                                                        }
                                                                        zzmg zzmgVar3 = zzr;
                                                                        if (this.zzH.zzb.zza.equals(zzr.zzg.zza.zza)) {
                                                                            zzxo zzxoVar3 = this.zzH.zzb;
                                                                            if (zzxoVar3.zzb == i7) {
                                                                                zzxo zzxoVar4 = zzr.zzg.zza;
                                                                                if (zzxoVar4.zzb == i7 && zzxoVar3.zze != zzxoVar4.zze) {
                                                                                    z5 = true;
                                                                                    zzmh zzmhVar2 = zzr.zzg;
                                                                                    zzxo zzxoVar5 = zzmhVar2.zza;
                                                                                    long j5 = zzmhVar2.zzb;
                                                                                    i8 = i4;
                                                                                    this.zzH = zzao(zzxoVar5, j5, zzmhVar2.zzd, j5, !z5, 0);
                                                                                    zzaj();
                                                                                    zzL();
                                                                                    if (zzaz() && zzr == zzmjVar2.zzo()) {
                                                                                        zzni[] zzniVarArr5 = this.zzb;
                                                                                        for (i10 = 0; i10 < i8; i10++) {
                                                                                            zzniVarArr5[i10].zzB();
                                                                                        }
                                                                                    }
                                                                                    if (this.zzH.zze == 3) {
                                                                                        zzJ();
                                                                                    }
                                                                                    zzabm zzr6 = zzmjVar2.zzm().zzr();
                                                                                    i9 = 0;
                                                                                    while (true) {
                                                                                        zzni[] zzniVarArr6 = this.zzb;
                                                                                        if (i9 >= i8) {
                                                                                            if (zzr6.zza(i9)) {
                                                                                                zzniVarArr6[i9].zzl();
                                                                                            }
                                                                                            i9++;
                                                                                        }
                                                                                    }
                                                                                    i4 = i8;
                                                                                    z4 = true;
                                                                                }
                                                                            }
                                                                        }
                                                                        z5 = false;
                                                                        zzmh zzmhVar22 = zzr.zzg;
                                                                        zzxo zzxoVar52 = zzmhVar22.zza;
                                                                        long j52 = zzmhVar22.zzb;
                                                                        i8 = i4;
                                                                        this.zzH = zzao(zzxoVar52, j52, zzmhVar22.zzd, j52, !z5, 0);
                                                                        zzaj();
                                                                        zzL();
                                                                        if (zzaz()) {
                                                                            zzni[] zzniVarArr52 = this.zzb;
                                                                            while (i10 < i8) {
                                                                            }
                                                                        }
                                                                        if (this.zzH.zze == 3) {
                                                                        }
                                                                        zzabm zzr62 = zzmjVar2.zzm().zzr();
                                                                        i9 = 0;
                                                                        while (true) {
                                                                            zzni[] zzniVarArr62 = this.zzb;
                                                                            if (i9 >= i8) {
                                                                                break;
                                                                            }
                                                                            i9++;
                                                                        }
                                                                        i4 = i8;
                                                                        z4 = true;
                                                                    } catch (zzjn e17) {
                                                                        e = e17;
                                                                        zzjnVar = e;
                                                                        str = str6;
                                                                        str2 = str5;
                                                                        if (zzjnVar.zzc == 1) {
                                                                            zzjnVar = zzjnVar.zzd(zzn.zzg.zza);
                                                                        }
                                                                        if (zzjnVar.zzc == 1) {
                                                                            int i222 = zzjnVar.zze;
                                                                            zzmjVar = this.zzr;
                                                                            if (zzmjVar.zzo() != null) {
                                                                                this.zzac = true;
                                                                                zzab();
                                                                                zzo = zzmjVar.zzo();
                                                                                zzmg zzm32 = zzmjVar.zzm();
                                                                                if (zzmjVar.zzm() != zzo) {
                                                                                }
                                                                                zzmjVar.zzs(zzm32);
                                                                                if (this.zzH.zze != 4) {
                                                                                }
                                                                                z = true;
                                                                                zzC(message.what);
                                                                                return z;
                                                                            }
                                                                        }
                                                                        zzjnVar2 = this.zzY;
                                                                        if (zzjnVar2 != null) {
                                                                        }
                                                                        zzjnVar3 = zzjnVar;
                                                                        if (zzjnVar3.zzc == 1) {
                                                                        }
                                                                        if (zzjnVar3.zzi) {
                                                                        }
                                                                        zzeh.zzf(str2, str, zzjnVar3);
                                                                        z = true;
                                                                        zzW(true, false);
                                                                        this.zzH = this.zzH.zzf(zzjnVar3);
                                                                        zzC(message.what);
                                                                        return z;
                                                                    }
                                                                }
                                                                i6 = i4;
                                                                long j6 = this.zzaa.zzb;
                                                                zzmj zzmjVar6 = this.zzr;
                                                                zzm2 = zzmjVar6.zzm();
                                                                if (zzm2 == null) {
                                                                    zzQ(j);
                                                                } else {
                                                                    long j7 = j;
                                                                    Trace.beginSection("doSomeWork");
                                                                    zzL();
                                                                    if (zzm2.zze) {
                                                                        this.zzV = zzfm.zzt(SystemClock.elapsedRealtime());
                                                                        boolean z8 = false;
                                                                        zzm2.zza.zzq(this.zzH.zzs - this.zzm, false);
                                                                        int i27 = 0;
                                                                        z6 = true;
                                                                        z7 = true;
                                                                        while (true) {
                                                                            zzni[] zzniVarArr7 = this.zzb;
                                                                            if (i27 < i6) {
                                                                                zzni zzniVar2 = zzniVarArr7[i27];
                                                                                if (zzniVar2.zzd() == 0) {
                                                                                    zzN(i27, z8);
                                                                                } else {
                                                                                    zzniVar2.zzs(this.zzU, this.zzV);
                                                                                    z6 = z6 && zzniVar2.zzo();
                                                                                    boolean zzt = zzniVar2.zzt(zzm2);
                                                                                    zzN(i27, zzt);
                                                                                    boolean z9 = z7 && zzt;
                                                                                    if (!zzt) {
                                                                                        zzay(i27);
                                                                                    }
                                                                                    z7 = z9;
                                                                                }
                                                                                i27++;
                                                                                i6 = 2;
                                                                                z8 = false;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        zzm2.zza.zzm();
                                                                        z6 = true;
                                                                        z7 = true;
                                                                    }
                                                                    long j8 = zzm2.zzg.zze;
                                                                    if (z6) {
                                                                        try {
                                                                            if (zzm2.zze && (j8 == -9223372036854775807L || j8 <= this.zzH.zzs)) {
                                                                                if (this.zzL) {
                                                                                    this.zzL = false;
                                                                                    zzE(false, this.zzH.zzn, false, 5);
                                                                                }
                                                                                if (zzm2.zzg.zzi) {
                                                                                    zzB(4);
                                                                                    zzK();
                                                                                    j2 = j7;
                                                                                    int i28 = 2;
                                                                                    if (this.zzH.zze == 2) {
                                                                                        int i29 = 0;
                                                                                        while (true) {
                                                                                            zzni[] zzniVarArr8 = this.zzb;
                                                                                            if (i29 < i28) {
                                                                                                if (zzniVarArr8[i29].zzp(zzm2)) {
                                                                                                    zzay(i29);
                                                                                                }
                                                                                                i29++;
                                                                                                i28 = 2;
                                                                                            } else {
                                                                                                zzmw zzmwVar2 = this.zzH;
                                                                                                if (!zzmwVar2.zzg && zzmwVar2.zzr < 500000 && zzaF(zzmjVar6.zzk()) && zzax()) {
                                                                                                    if (this.zzZ == -9223372036854775807L) {
                                                                                                        this.zzZ = SystemClock.elapsedRealtime();
                                                                                                    } else if (SystemClock.elapsedRealtime() - this.zzZ >= 4000) {
                                                                                                        throw new zzfe(0, 4000);
                                                                                                    }
                                                                                                    boolean z10 = !zzax() && this.zzH.zze == 3;
                                                                                                    boolean z11 = this.zzH.zzp;
                                                                                                    i12 = this.zzH.zze;
                                                                                                    if (i12 != 4 && (z10 || i12 == 2 || (i12 == 3 && this.zzS != 0))) {
                                                                                                        zzQ(j2);
                                                                                                    }
                                                                                                    Trace.endSection();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    this.zzZ = -9223372036854775807L;
                                                                                    if (zzax()) {
                                                                                    }
                                                                                    boolean z112 = this.zzH.zzp;
                                                                                    i12 = this.zzH.zze;
                                                                                    if (i12 != 4) {
                                                                                        zzQ(j2);
                                                                                    }
                                                                                    Trace.endSection();
                                                                                }
                                                                            }
                                                                        } catch (zzjn e18) {
                                                                            e = e18;
                                                                            zzjnVar = e;
                                                                            str = str6;
                                                                            str2 = str5;
                                                                            if (zzjnVar.zzc == 1) {
                                                                            }
                                                                            if (zzjnVar.zzc == 1) {
                                                                            }
                                                                            zzjnVar2 = this.zzY;
                                                                            if (zzjnVar2 != null) {
                                                                            }
                                                                            zzjnVar3 = zzjnVar;
                                                                            if (zzjnVar3.zzc == 1) {
                                                                            }
                                                                            if (zzjnVar3.zzi) {
                                                                            }
                                                                            zzeh.zzf(str2, str, zzjnVar3);
                                                                            z = true;
                                                                            zzW(true, false);
                                                                            this.zzH = this.zzH.zzf(zzjnVar3);
                                                                            zzC(message.what);
                                                                            return z;
                                                                        }
                                                                    }
                                                                    zzmw zzmwVar3 = this.zzH;
                                                                    if (zzmwVar3.zze == 2) {
                                                                        if (this.zzS == 0) {
                                                                            zzi = zzae();
                                                                            j2 = j7;
                                                                        } else if (z7) {
                                                                            if (zzmwVar3.zzg) {
                                                                                zzmg zzm5 = zzmjVar6.zzm();
                                                                                long zze = zzP(this.zzH.zza, zzm5.zzg.zza) ? this.zzae.zze() : -9223372036854775807L;
                                                                                zzmg zzk = zzmjVar6.zzk();
                                                                                boolean z12 = zzk.zzd() && zzk.zzg.zzi;
                                                                                boolean z13 = zzk.zzg.zza.zzb() && !zzk.zze;
                                                                                if (!z12 && !z13) {
                                                                                    j2 = j7;
                                                                                    zzi = this.zzg.zzi(new zzmb(this.zzu, this.zzH.zza, zzm5.zzg.zza, this.zzU - zzm5.zza(), zzau(zzk.zzf()), this.zzn.zzj().zzb, this.zzH.zzl, this.zzM, zze, this.zzN));
                                                                                }
                                                                            }
                                                                            j2 = j7;
                                                                            zzB(3);
                                                                            this.zzY = null;
                                                                            if (zzax()) {
                                                                                zzaC(false, false);
                                                                                this.zzn.zza();
                                                                                zzJ();
                                                                            }
                                                                            int i282 = 2;
                                                                            if (this.zzH.zze == 2) {
                                                                            }
                                                                            this.zzZ = -9223372036854775807L;
                                                                            if (zzax()) {
                                                                            }
                                                                            boolean z1122 = this.zzH.zzp;
                                                                            i12 = this.zzH.zze;
                                                                            if (i12 != 4) {
                                                                            }
                                                                            Trace.endSection();
                                                                        }
                                                                        if (zzi) {
                                                                            zzB(3);
                                                                            this.zzY = null;
                                                                            if (zzax()) {
                                                                            }
                                                                            int i2822 = 2;
                                                                            if (this.zzH.zze == 2) {
                                                                            }
                                                                            this.zzZ = -9223372036854775807L;
                                                                            if (zzax()) {
                                                                            }
                                                                            boolean z11222 = this.zzH.zzp;
                                                                            i12 = this.zzH.zze;
                                                                            if (i12 != 4) {
                                                                            }
                                                                            Trace.endSection();
                                                                        }
                                                                        if (this.zzH.zze == 3) {
                                                                            if (this.zzS == 0) {
                                                                                if (!zzae()) {
                                                                                    zzaC(zzax(), false);
                                                                                    zzB(2);
                                                                                    if (this.zzM) {
                                                                                        for (zzmg zzm6 = zzmjVar6.zzm(); zzm6 != null; zzm6 = zzm6.zzp()) {
                                                                                            for (zzabe zzabeVar : zzm6.zzr().zzc) {
                                                                                            }
                                                                                        }
                                                                                        this.zzae.zzc();
                                                                                    }
                                                                                    zzK();
                                                                                }
                                                                            }
                                                                            zzC(message.what);
                                                                            return z;
                                                                        }
                                                                        int i28222 = 2;
                                                                        if (this.zzH.zze == 2) {
                                                                        }
                                                                        this.zzZ = -9223372036854775807L;
                                                                        if (zzax()) {
                                                                        }
                                                                        boolean z112222 = this.zzH.zzp;
                                                                        i12 = this.zzH.zze;
                                                                        if (i12 != 4) {
                                                                        }
                                                                        Trace.endSection();
                                                                    }
                                                                    j2 = j7;
                                                                    if (this.zzH.zze == 3) {
                                                                    }
                                                                    int i282222 = 2;
                                                                    if (this.zzH.zze == 2) {
                                                                    }
                                                                    this.zzZ = -9223372036854775807L;
                                                                    if (zzax()) {
                                                                    }
                                                                    boolean z1122222 = this.zzH.zzp;
                                                                    i12 = this.zzH.zze;
                                                                    if (i12 != 4) {
                                                                    }
                                                                    Trace.endSection();
                                                                }
                                                                z = true;
                                                                zzC(message.what);
                                                                return z;
                                                            }
                                                        }
                                                    }
                                                }
                                                i4 = 2;
                                                z4 = false;
                                                while (zzax()) {
                                                    if (z4) {
                                                    }
                                                    this.zzac = false;
                                                    zzr = zzmjVar2.zzr();
                                                    if (zzr != null) {
                                                    }
                                                }
                                                i6 = i4;
                                                long j62 = this.zzaa.zzb;
                                                zzmj zzmjVar62 = this.zzr;
                                                zzm2 = zzmjVar62.zzm();
                                                if (zzm2 == null) {
                                                }
                                                z = true;
                                                zzC(message.what);
                                                return z;
                                            }
                                            str6 = "Playback error";
                                            str5 = "ExoPlayerImplInternal";
                                            j = uptimeMillis;
                                            zzn3 = zzmjVar2.zzn();
                                            if (zzn3 != null) {
                                            }
                                            i4 = 2;
                                            z4 = false;
                                            while (zzax()) {
                                            }
                                            i6 = i4;
                                            long j622 = this.zzaa.zzb;
                                            zzmj zzmjVar622 = this.zzr;
                                            zzm2 = zzmjVar622.zzm();
                                            if (zzm2 == null) {
                                            }
                                            z = true;
                                            zzC(message.what);
                                            return z;
                                        }
                                        if (zzr2.zza(i14) && zzniVarArr[i14].zza() && !zzniVarArr[i14].zzc()) {
                                            zzniVarArr[i14].zzb();
                                            i11 = i14;
                                            zzmjVar3 = zzmjVar4;
                                            zzabmVar = zzr2;
                                            zzmgVar = zzo3;
                                            zzar(zzo3, i11, false, zzo3.zzc());
                                        } else {
                                            i11 = i14;
                                            zzmjVar3 = zzmjVar4;
                                            zzabmVar = zzr2;
                                            zzmgVar = zzo3;
                                        }
                                        i14 = i11 + 1;
                                        zzo3 = zzmgVar;
                                        zzmjVar4 = zzmjVar3;
                                        zzr2 = zzabmVar;
                                    }
                                }
                            }
                            zzmjVar2 = zzmjVar4;
                            zzn2 = zzmjVar2.zzn();
                            if (zzn2 != null) {
                            }
                            str6 = "Playback error";
                            str5 = "ExoPlayerImplInternal";
                            j = uptimeMillis;
                            zzn3 = zzmjVar2.zzn();
                            if (zzn3 != null) {
                            }
                            i4 = 2;
                            z4 = false;
                            while (zzax()) {
                            }
                            i6 = i4;
                            long j6222 = this.zzaa.zzb;
                            zzmj zzmjVar6222 = this.zzr;
                            zzm2 = zzmjVar6222.zzm();
                            if (zzm2 == null) {
                            }
                            z = true;
                            zzC(message.what);
                            return z;
                        }
                    }
                    str6 = "Playback error";
                    str5 = "ExoPlayerImplInternal";
                    j = uptimeMillis;
                    i6 = 2;
                    zzmj zzmjVar62222 = this.zzr;
                    zzm2 = zzmjVar62222.zzm();
                    if (zzm2 == null) {
                    }
                    z = true;
                    zzC(message.what);
                    return z;
                }
                z = z2;
                zzC(message.what);
                return z;
            case 3:
                z2 = true;
                zzR((zzlx) message.obj);
                z = z2;
                zzC(message.what);
                return z;
            case 4:
                z2 = true;
                zzM((zzav) message.obj);
                zzak(this.zzn.zzj(), true);
                z = z2;
                zzC(message.what);
                return z;
            case 5:
                z2 = true;
                this.zzB = (zznm) message.obj;
                z = z2;
                zzC(message.what);
                return z;
            case 6:
                z2 = true;
                zzW(false, true);
                z = z2;
                zzC(message.what);
                return z;
            case 7:
                try {
                    zzdt zzdtVar = (zzdt) message.obj;
                    try {
                        zzX(true, false, true, false);
                        i13 = 0;
                    } catch (Throwable th) {
                        th = th;
                    }
                    while (true) {
                        zzni[] zzniVarArr9 = this.zzb;
                        if (i13 >= 2) {
                            this.zzg.zzd(this.zzu);
                            this.zzz.zzd();
                            this.zze.zzb();
                            zzB(1);
                            this.zzh.zzl(null);
                            this.zzi.zzb();
                            zzdtVar.zza();
                            return true;
                        }
                        try {
                            this.zzc[i13].zzw();
                            zzniVarArr9[i13].zzI();
                            i13++;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        th = th2;
                        Throwable th3 = th;
                        this.zzh.zzl(null);
                        this.zzi.zzb();
                        zzdtVar.zza();
                        throw th3;
                    }
                } catch (zzjn e19) {
                    e = e19;
                    zzjnVar = e;
                    str = "Playback error";
                    str2 = "ExoPlayerImplInternal";
                    if (zzjnVar.zzc == 1) {
                    }
                    if (zzjnVar.zzc == 1) {
                    }
                    zzjnVar2 = this.zzY;
                    if (zzjnVar2 != null) {
                    }
                    zzjnVar3 = zzjnVar;
                    if (zzjnVar3.zzc == 1) {
                    }
                    if (zzjnVar3.zzi) {
                    }
                    zzeh.zzf(str2, str, zzjnVar3);
                    z = true;
                    zzW(true, false);
                    this.zzH = this.zzH.zzf(zzjnVar3);
                    zzC(message.what);
                    return z;
                } catch (RuntimeException e20) {
                    e = e20;
                    runtimeException = e;
                    str3 = "Playback error";
                    str4 = "ExoPlayerImplInternal";
                    if (runtimeException instanceof IllegalStateException) {
                        break;
                    }
                    zzjn zzc3 = zzjn.zzc(runtimeException, (!(runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) ? 1004 : 1000);
                    zzeh.zzf(str4, str3, zzc3);
                    zzW(true, false);
                    this.zzH = this.zzH.zzf(zzc3);
                    z = true;
                    zzC(message.what);
                    return z;
                }
            case 8:
                try {
                    zzxm zzxmVar = (zzxm) message.obj;
                    zzmj zzmjVar7 = this.zzr;
                    if (zzmjVar7.zzd(zzxmVar)) {
                        zzmg zzk2 = zzmjVar7.zzk();
                        if (zzk2 == null) {
                            throw null;
                        }
                        zzmg zzmgVar4 = zzk2;
                        if (!zzk2.zze) {
                            float f = this.zzn.zzj().zzb;
                            zzmw zzmwVar4 = this.zzH;
                            zzk2.zzh(f, zzmwVar4.zza, zzmwVar4.zzl);
                        }
                        zzaw(zzk2.zzg.zza, zzk2.zzq(), zzk2.zzr());
                        if (zzk2 == zzmjVar7.zzm()) {
                            zzU(zzk2.zzg.zzb, true);
                            zzap();
                            zzk2.zzh = true;
                            zzmw zzmwVar5 = this.zzH;
                            zzxo zzxoVar6 = zzmwVar5.zzb;
                            long j9 = zzk2.zzg.zzb;
                            z2 = true;
                            this.zzH = zzao(zzxoVar6, j9, zzmwVar5.zzc, j9, false, 5);
                        } else {
                            z2 = true;
                        }
                        zzam();
                    } else {
                        z2 = true;
                        zzmg zzu = zzmjVar7.zzu(zzxmVar);
                        if (zzu != null) {
                            zzguk.zzi(!zzu.zze);
                            float f2 = this.zzn.zzj().zzb;
                            zzmw zzmwVar6 = this.zzH;
                            zzu.zzh(f2, zzmwVar6.zza, zzmwVar6.zzl);
                            if (zzmjVar7.zze(zzxmVar)) {
                                zzai();
                            }
                        }
                    }
                    z = z2;
                } catch (zzat e21) {
                    e = e21;
                    zzat zzatVar = e;
                    zzA(zzatVar, zzatVar.zzb == 1 ? true != zzatVar.zza ? 3003 : 3001 : 1000);
                    z = true;
                    zzC(message.what);
                    return z;
                } catch (zzht e22) {
                    e = e22;
                    zzht zzhtVar = e;
                    zzA(zzhtVar, zzhtVar.zza);
                    z = true;
                    zzC(message.what);
                    return z;
                } catch (zzjn e23) {
                    e = e23;
                    zzjnVar = e;
                    str = "Playback error";
                    str2 = "ExoPlayerImplInternal";
                    if (zzjnVar.zzc == 1) {
                    }
                    if (zzjnVar.zzc == 1) {
                    }
                    zzjnVar2 = this.zzY;
                    if (zzjnVar2 != null) {
                    }
                    zzjnVar3 = zzjnVar;
                    if (zzjnVar3.zzc == 1) {
                    }
                    if (zzjnVar3.zzi) {
                    }
                    zzeh.zzf(str2, str, zzjnVar3);
                    z = true;
                    zzW(true, false);
                    this.zzH = this.zzH.zzf(zzjnVar3);
                    zzC(message.what);
                    return z;
                } catch (zzuk e24) {
                    e = e24;
                    zzuk zzukVar = e;
                    zzA(zzukVar, zzukVar.zza);
                    z = true;
                    zzC(message.what);
                    return z;
                } catch (zzwq e25) {
                    e = e25;
                    zzA(e, 1002);
                    z = true;
                    zzC(message.what);
                    return z;
                } catch (IOException e26) {
                    e = e26;
                    zzA(e, 2000);
                    z = true;
                    zzC(message.what);
                    return z;
                } catch (RuntimeException e27) {
                    e = e27;
                    runtimeException = e;
                    str3 = "Playback error";
                    str4 = "ExoPlayerImplInternal";
                    zzjn zzc32 = zzjn.zzc(runtimeException, (!(runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) ? 1004 : 1000);
                    zzeh.zzf(str4, str3, zzc32);
                    zzW(true, false);
                    this.zzH = this.zzH.zzf(zzc32);
                    z = true;
                    zzC(message.what);
                    return z;
                }
                zzC(message.what);
                return z;
            case 9:
                zzxm zzxmVar2 = (zzxm) message.obj;
                zzmj zzmjVar8 = this.zzr;
                if (zzmjVar8.zzd(zzxmVar2)) {
                    zzmjVar8.zzf(this.zzU);
                    zzam();
                } else if (zzmjVar8.zze(zzxmVar2)) {
                    zzai();
                }
                z = true;
                zzC(message.what);
                return z;
            case 10:
                zzad();
                z = true;
                zzC(message.what);
                return z;
            case 11:
                int i30 = message.arg1;
                this.zzP = i30;
                int zza2 = this.zzr.zza(this.zzH.zza, i30);
                if ((zza2 & 1) != 0) {
                    zzI(true);
                } else if ((zza2 & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z = true;
                zzC(message.what);
                return z;
            case 12:
                boolean z14 = message.arg1 != 0;
                this.zzQ = z14;
                int zzb = this.zzr.zzb(this.zzH.zza, z14);
                if ((zzb & 1) != 0) {
                    zzI(true);
                } else if ((zzb & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z = true;
                zzC(message.what);
                return z;
            case 13:
                boolean z15 = message.arg1 != 0;
                zzdt zzdtVar2 = (zzdt) message.obj;
                if (this.zzR != z15) {
                    this.zzR = z15;
                    if (!z15) {
                        zzni[] zzniVarArr10 = this.zzb;
                        for (int i31 = 0; i31 < 2; i31++) {
                            zzniVarArr10[i31].zzG();
                        }
                    }
                }
                if (zzdtVar2 != null) {
                    zzdtVar2.zza();
                }
                z = true;
                zzC(message.what);
                return z;
            case 14:
                zzna zznaVar = (zzna) message.obj;
                if (zznaVar.zzf() == this.zzj) {
                    zzaE(zznaVar);
                    int i32 = this.zzH.zze;
                    if (i32 == 3 || i32 == 2) {
                        this.zzh.zzh(2);
                    }
                } else {
                    this.zzh.zzd(15, zznaVar).zza();
                }
                z = true;
                zzC(message.what);
                return z;
            case 15:
                final zzna zznaVar2 = (zzna) message.obj;
                Looper zzf = zznaVar2.zzf();
                if (zzf.getThread().isAlive()) {
                    this.zzp.zzd(zzf, null).zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzlq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzly.zzz(zznaVar2);
                        }
                    });
                } else {
                    zzeh.zzc("TAG", "Trying to send message on a dead thread.");
                    zznaVar2.zzi(false);
                }
                z = true;
                zzC(message.what);
                return z;
            case 16:
                zzak((zzav) message.obj, false);
                z = true;
                zzC(message.what);
                return z;
            case 17:
                zzls zzlsVar = (zzls) message.obj;
                this.zzI.zza(1);
                if (zzlsVar.zzb() != -1) {
                    this.zzT = new zzlx(new zznc(zzlsVar.zza(), zzlsVar.zzd()), zzlsVar.zzb(), zzlsVar.zzc());
                }
                zzaf(this.zzs.zzl(zzlsVar.zza(), zzlsVar.zzd()), false);
                z = true;
                zzC(message.what);
                return z;
            case 18:
                zzls zzlsVar2 = (zzls) message.obj;
                int i33 = message.arg1;
                this.zzI.zza(1);
                zzmv zzmvVar = this.zzs;
                if (i33 == -1) {
                    i33 = zzmvVar.zzc();
                }
                zzaf(zzmvVar.zzm(i33, zzlsVar2.zza(), zzlsVar2.zzd()), false);
                z = true;
                zzC(message.what);
                return z;
            case 19:
                zzlt zzltVar = (zzlt) message.obj;
                this.zzI.zza(1);
                zzmv zzmvVar2 = this.zzs;
                int i34 = zzltVar.zza;
                int i35 = zzltVar.zzb;
                int i36 = zzltVar.zzc;
                zzzj zzzjVar = zzltVar.zzd;
                zzaf(zzmvVar2.zzo(0, 0, 0, null), false);
                z = true;
                zzC(message.what);
                return z;
            case 20:
                int i37 = message.arg1;
                int i38 = message.arg2;
                zzzj zzzjVar2 = (zzzj) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzs.zzn(i37, i38, zzzjVar2), false);
                z = true;
                zzC(message.what);
                return z;
            case 21:
                zzzj zzzjVar3 = (zzzj) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzs.zzp(zzzjVar3), false);
                z = true;
                zzC(message.what);
                return z;
            case 22:
                zzaf(this.zzs.zzh(), true);
                z = true;
                zzC(message.what);
                return z;
            case 23:
                this.zzK = message.arg1 != 0;
                zzaj();
                if (this.zzL) {
                    zzmj zzmjVar9 = this.zzr;
                    if (zzmjVar9.zzn() != zzmjVar9.zzm()) {
                        zzI(true);
                        zzas(false);
                    }
                }
                z = true;
                zzC(message.what);
                return z;
            case 24:
                this.zzA = message.arg1 != 0;
                z = true;
                zzC(message.what);
                return z;
            case 25:
                zzac();
                z = true;
                zzC(message.what);
                return z;
            case 26:
                zzac();
                z = true;
                zzC(message.what);
                return z;
            case 27:
                int i39 = message.arg1;
                int i40 = message.arg2;
                List list = (List) message.obj;
                this.zzI.zza(1);
                zzaf(this.zzs.zza(i39, i40, list), false);
                z = true;
                zzC(message.what);
                return z;
            case 28:
                zzjx zzjxVar = (zzjx) message.obj;
                this.zzaa = zzjxVar;
                this.zzr.zzc(this.zzH.zza, zzjxVar);
                z = true;
                zzC(message.what);
                return z;
            case 29:
                this.zzI.zza(1);
                zzX(false, false, false, true);
                this.zzg.zza(this.zzu);
                zzB(true != this.zzH.zza.zzg() ? 2 : 4);
                zzF();
                this.zzs.zzd();
                this.zzh.zzh(2);
                z = true;
                zzC(message.what);
                return z;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                zzdt zzdtVar3 = (zzdt) pair.second;
                zzni[] zzniVarArr11 = this.zzb;
                for (int i41 = 0; i41 < 2; i41++) {
                    zzniVarArr11[i41].zzJ(obj);
                }
                int i42 = this.zzH.zze;
                if (i42 == 3 || i42 == 2) {
                    this.zzh.zzh(2);
                }
                if (zzdtVar3 != null) {
                    zzdtVar3.zza();
                }
                z = true;
                zzC(message.what);
                return z;
            case 31:
                zzd zzdVar2 = (zzd) message.obj;
                int i43 = message.arg1;
                this.zze.zze(zzdVar2);
                zzcd zzcdVar = this.zzz;
                if (i43 != 0) {
                    zzdVar = zzdVar2;
                }
                zzcdVar.zzb(zzdVar);
                zzF();
                z = true;
                zzC(message.what);
                return z;
            case 32:
                zzD(((Float) message.obj).floatValue());
                z = true;
                zzC(message.what);
                return z;
            case 33:
                int i44 = message.arg1;
                zzmw zzmwVar7 = this.zzH;
                zzH(zzmwVar7.zzl, i44, zzmwVar7.zzn, zzmwVar7.zzm);
                z = true;
                zzC(message.what);
                return z;
            case 34:
                zzD(this.zzad);
                z = true;
                zzC(message.what);
                return z;
            case 35:
                zzaea zzaeaVar = (zzaea) message.obj;
                zzni[] zzniVarArr12 = this.zzb;
                for (int i45 = 0; i45 < 2; i45++) {
                    zzniVarArr12[i45].zzK(zzaeaVar);
                }
                z = true;
                zzC(message.what);
                return z;
            case 36:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                if (!booleanValue) {
                    if (this.zzF != null && this.zzE && !this.zzh.zzb(37)) {
                        this.zzG++;
                    }
                    final int i46 = this.zzG;
                    if (i46 > 0) {
                        this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzly.this.zzv(i46);
                            }
                        });
                    }
                    this.zzG = 0;
                    this.zzE = false;
                    this.zzh.zzk(37);
                    zzlx zzlxVar = this.zzF;
                    if (zzlxVar != null) {
                        zzR(zzlxVar);
                        this.zzF = null;
                        this.zzE = false;
                    }
                }
                this.zzD = booleanValue;
                zzV();
                z = true;
                zzC(message.what);
                return z;
            case 37:
                this.zzE = false;
                zzlx zzlxVar2 = this.zzF;
                if (zzlxVar2 != null) {
                    zzR(zzlxVar2);
                    this.zzF = null;
                }
                z = true;
                zzC(message.what);
                return z;
            case 38:
                this.zzC = (zznl) message.obj;
                zzV();
                z = true;
                zzC(message.what);
                return z;
            case 39:
                zzni[] zzniVarArr13 = this.zzb;
                for (int i47 = 0; i47 < 2; i47++) {
                    zzniVarArr13[i47].zze();
                }
                z = true;
                zzC(message.what);
                return z;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzh.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i) {
        this.zzh.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjk
    public final void zzc(zzav zzavVar) {
        this.zzh.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzE) {
            this.zzh.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzh.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzh.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i, long j) {
        this.zzh.zzd(3, new zzlx(zzbfVar, i, j)).zza();
    }

    public final void zzg(zznl zznlVar) {
        this.zzh.zzd(38, zznlVar).zza();
    }

    public final void zzh() {
        this.zzh.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z) {
        this.zzh.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzh.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzk(zzna zznaVar) {
        if (!this.zzJ && this.zzj.getThread().isAlive()) {
            this.zzh.zzd(14, zznaVar).zza();
        } else {
            zzeh.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zznaVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzJ || !this.zzj.getThread().isAlive()) {
            return true;
        }
        zzdt zzdtVar = new zzdt(this.zzp);
        this.zzh.zzd(30, new Pair(obj, zzdtVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdtVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzJ || !this.zzj.getThread().isAlive()) {
            return true;
        }
        this.zzJ = true;
        zzdt zzdtVar = new zzdt(this.zzp);
        this.zzh.zzd(7, zzdtVar).zza();
        return zzdtVar.zze(this.zzt);
    }

    public final Looper zzn() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzo() {
        zzea zzeaVar = this.zzh;
        zzeaVar.zzk(2);
        zzeaVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void zzp(zzxm zzxmVar) {
        this.zzh.zzd(8, zzxmVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final void zzq() {
        this.zzh.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void zzs(zzzi zzziVar) {
        this.zzh.zzd(9, (zzxm) zzziVar).zza();
    }

    final /* synthetic */ zzmg zzt(zzmh zzmhVar, long j) {
        zzabp zze = this.zzg.zze(this.zzu);
        long j2 = this.zzaa.zzb;
        zzabm zzabmVar = this.zzf;
        zzmv zzmvVar = this.zzs;
        return new zzmg(this.zzc, j, this.zze, zze, zzmvVar, zzmhVar, zzabmVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    final /* synthetic */ zzea zzx() {
        return this.zzh;
    }

    public final void zzy(List list, int i, long j, zzzj zzzjVar) {
        this.zzh.zzd(17, new zzls(list, zzzjVar, i, j, null)).zza();
    }
}
