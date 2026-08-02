package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import e1.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import w1.L;

/* loaded from: classes.dex */
final class zzjs extends zzg implements zzil {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzcy zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private zzls zzF;
    private zzik zzG;
    private zzbd zzH;
    private zzat zzI;
    private Object zzJ;
    private Surface zzK;
    private int zzL;
    private zzee zzM;
    private zze zzN;
    private float zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzat zzT;
    private zzle zzU;
    private int zzV;
    private long zzW;
    private final zziw zzX;
    private zzwn zzY;
    final zzyo zzb;
    final zzbd zzc;
    private final zzdc zze = new zzdc(zzcz.zza);
    private final Context zzf;
    private final zzbh zzg;
    private final zzlm[] zzh;
    private final zzlm[] zzi;
    private final zzyn zzj;
    private final zzdj zzk;
    private final zzkf zzl;
    private final zzdp zzm;
    private final CopyOnWriteArraySet zzn;
    private final zzbl zzo;
    private final List zzp;
    private final boolean zzq;
    private final zzly zzr;
    private final Looper zzs;
    private final zzyv zzt;
    private final zzcz zzu;
    private final zzjo zzv;
    private final zzjp zzw;
    private final zzho zzx;
    private final zzlw zzy;
    private final zzlx zzz;

    static {
        zzaq.zzb("media3.exoplayer");
    }

    public zzjs(zzij zzijVar, zzbh zzbhVar) {
        zzij zzijVar2;
        zzcz zzczVar;
        try {
            zzdq.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-beta01] [" + zzen.zzb + "]");
            this.zzf = zzijVar.zza.getApplicationContext();
            this.zzr = (zzly) zzijVar.zzh.apply(zzijVar.zzb);
            this.zzS = zzijVar.zzj;
            this.zzN = zzijVar.zzk;
            this.zzL = zzijVar.zzl;
            this.zzP = false;
            this.zzA = zzijVar.zzp;
            zzjr zzjrVar = null;
            zzjo zzjoVar = new zzjo(this, zzjrVar);
            this.zzv = zzjoVar;
            this.zzw = new zzjp(zzjrVar);
            Handler handler = new Handler(zzijVar.zzi);
            zzlm[] zzac = zzcdj.zzac(((zzic) zzijVar.zzc).zza.zza, handler, zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zzac;
            int length = zzac.length;
            this.zzi = new zzlm[2];
            int i7 = 0;
            while (true) {
                zzlm[] zzlmVarArr = this.zzi;
                int length2 = zzlmVarArr.length;
                if (i7 >= 2) {
                    break;
                }
                zzlm zzlmVar = this.zzh[i7];
                zzlmVarArr[i7] = null;
                i7++;
            }
            zzyn zzynVar = (zzyn) zzijVar.zze.zza();
            this.zzj = zzynVar;
            zzij.zza(((zzid) zzijVar.zzd).zza);
            zzyz zzh = zzyz.zzh(((zzig) zzijVar.zzg).zza);
            this.zzt = zzh;
            this.zzq = zzijVar.zzm;
            this.zzF = zzijVar.zzn;
            Looper looper = zzijVar.zzi;
            this.zzs = looper;
            zzcz zzczVar2 = zzijVar.zzb;
            this.zzu = zzczVar2;
            this.zzg = zzbhVar;
            zzdp zzdpVar = new zzdp(looper, zzczVar2, new zzdn(this) { // from class: com.google.android.gms.internal.ads.zziv
                @Override // com.google.android.gms.internal.ads.zzdn
                public final void zza(Object obj, zzv zzvVar) {
                }
            });
            this.zzm = zzdpVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzn = copyOnWriteArraySet;
            this.zzp = new ArrayList();
            this.zzY = new zzwn(0);
            this.zzG = zzik.zza;
            int length3 = this.zzh.length;
            zzyo zzyoVar = new zzyo(new zzlq[2], new zzyh[2], zzbv.zza, null);
            this.zzb = zzyoVar;
            this.zzo = new zzbl();
            zzbc zzbcVar = new zzbc();
            zzbcVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzynVar.zzn();
            zzbcVar.zzd(29, true);
            zzbcVar.zzd(23, false);
            zzbcVar.zzd(25, false);
            zzbcVar.zzd(33, false);
            zzbcVar.zzd(26, false);
            zzbcVar.zzd(34, false);
            zzbd zze = zzbcVar.zze();
            this.zzc = zze;
            zzbc zzbcVar2 = new zzbc();
            zzbcVar2.zzb(zze);
            zzbcVar2.zza(4);
            zzbcVar2.zza(10);
            this.zzH = zzbcVar2.zze();
            this.zzk = zzczVar2.zzd(looper, null);
            zziw zziwVar = new zziw(this);
            this.zzX = zziwVar;
            this.zzU = zzle.zzh(zzyoVar);
            this.zzr.zzT(zzbhVar, looper);
            final zzor zzorVar = new zzor(zzijVar.zzs);
            zzkf zzkfVar = new zzkf(this.zzh, this.zzi, zzynVar, zzyoVar, (zzkj) zzijVar.zzf.zza(), zzh, 0, false, this.zzr, this.zzF, zzijVar.zzt, zzijVar.zzo, false, false, looper, zzczVar2, zziwVar, zzorVar, null, this.zzG);
            this.zzl = zzkfVar;
            Looper zzc = zzkfVar.zzc();
            this.zzO = 1.0f;
            zzat zzatVar = zzat.zza;
            this.zzI = zzatVar;
            this.zzT = zzatVar;
            this.zzV = -1;
            int i8 = zzco.zza;
            this.zzQ = true;
            zzly zzlyVar = this.zzr;
            if (zzlyVar == null) {
                throw null;
            }
            zzdpVar.zzb(zzlyVar);
            zzh.zzf(new Handler(looper), this.zzr);
            copyOnWriteArraySet.add(this.zzv);
            if (zzen.zza >= 31) {
                final Context context = this.zzf;
                zzijVar2 = zzijVar;
                final boolean z4 = zzijVar2.zzq;
                zzczVar = zzczVar2;
                zzczVar.zzd(zzkfVar.zzc(), null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzon zzb = zzon.zzb(context);
                        if (zzb == null) {
                            zzdq.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z4) {
                            this.zzz(zzb);
                        }
                        zzorVar.zzb(zzb.zza());
                    }
                });
            } else {
                zzijVar2 = zzijVar;
                zzczVar = zzczVar2;
            }
            zzcy zzcyVar = new zzcy(0, zzc, looper, zzczVar, new zzix(this));
            this.zzB = zzcyVar;
            zzcyVar.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zziy
                @Override // java.lang.Runnable
                public final void run() {
                    zzjs.zzI(zzjs.this);
                }
            });
            new zzhl(zzijVar2.zza, zzc, zzijVar2.zzi, this.zzv, zzczVar);
            this.zzx = new zzho(zzijVar2.zza, handler, this.zzv);
            zzfte.zza(null, null);
            this.zzy = new zzlw(zzijVar2.zza, zzc, zzczVar);
            this.zzz = new zzlx(zzijVar2.zza, zzc, zzczVar);
            int i9 = zzo.zza;
            zzcc zzccVar = zzcc.zza;
            this.zzM = zzee.zza;
            zzkfVar.zzo(this.zzN);
            zzad(1, 3, this.zzN);
            zzad(2, 4, Integer.valueOf(this.zzL));
            zzad(2, 5, 0);
            zzad(1, 9, Boolean.valueOf(this.zzP));
            zzad(2, 7, this.zzw);
            zzad(6, 8, this.zzw);
            zzad(-1, 16, Integer.valueOf(this.zzS));
            this.zze.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* synthetic */ void zzI(zzjs zzjsVar) {
        int i7 = zzen.zza;
        AudioManager audioManager = (AudioManager) zzjsVar.zzf.getSystemService("audio");
        zzjsVar.zzB.zzc(Integer.valueOf(audioManager == null ? -1 : audioManager.generateAudioSessionId()));
    }

    public static /* synthetic */ void zzJ(zzjs zzjsVar, zzkc zzkcVar) {
        boolean z4;
        long j;
        int i7 = zzjsVar.zzC - zzkcVar.zzb;
        zzjsVar.zzC = i7;
        boolean z7 = true;
        if (zzkcVar.zzc) {
            zzjsVar.zzD = zzkcVar.zzd;
            zzjsVar.zzE = true;
        }
        if (i7 == 0) {
            zzbn zzbnVar = zzkcVar.zza.zza;
            if (!zzjsVar.zzU.zza.zzo() && zzbnVar.zzo()) {
                zzjsVar.zzV = -1;
                zzjsVar.zzW = 0L;
            }
            if (!zzbnVar.zzo()) {
                List zzw = ((zzlk) zzbnVar).zzw();
                zzcv.zzf(zzw.size() == zzjsVar.zzp.size());
                for (int i8 = 0; i8 < zzw.size(); i8++) {
                    ((zzjq) zzjsVar.zzp.get(i8)).zzc((zzbn) zzw.get(i8));
                }
            }
            long j3 = -9223372036854775807L;
            if (zzjsVar.zzE) {
                if (zzkcVar.zza.zzb.equals(zzjsVar.zzU.zzb) && zzkcVar.zza.zzd == zzjsVar.zzU.zzs) {
                    z7 = false;
                }
                if (z7) {
                    if (zzbnVar.zzo() || zzkcVar.zza.zzb.zzb()) {
                        j = zzkcVar.zza.zzd;
                    } else {
                        zzle zzleVar = zzkcVar.zza;
                        zzuq zzuqVar = zzleVar.zzb;
                        j = zzleVar.zzd;
                        zzjsVar.zzW(zzbnVar, zzuqVar, j);
                    }
                    z4 = z7;
                    j3 = j;
                } else {
                    z4 = z7;
                }
            } else {
                z4 = false;
            }
            zzjsVar.zzE = false;
            zzjsVar.zzah(zzkcVar.zza, 1, z4, zzjsVar.zzD, j3, -1, false);
        }
    }

    public static /* synthetic */ void zzK(zzjs zzjsVar, int i7, final int i8) {
        zzjsVar.zzaj();
        Integer valueOf = Integer.valueOf(i8);
        zzjsVar.zzad(1, 10, valueOf);
        zzjsVar.zzad(2, 10, valueOf);
        zzdm zzdmVar = new zzdm() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj) {
                int i9 = zzjs.zzd;
                ((zzbe) obj).zza(i8);
            }
        };
        zzdp zzdpVar = zzjsVar.zzm;
        zzdpVar.zzd(21, zzdmVar);
        zzdpVar.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzO(zzjs zzjsVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjsVar.zzae(surface);
        zzjsVar.zzK = surface;
    }

    private final int zzR(zzle zzleVar) {
        return zzleVar.zza.zzo() ? this.zzV : zzleVar.zza.zzn(zzleVar.zzb.zza, this.zzo).zzc;
    }

    private static int zzS(int i7) {
        return 1;
    }

    private final long zzT(zzle zzleVar) {
        if (!zzleVar.zzb.zzb()) {
            return zzen.zzv(zzU(zzleVar));
        }
        zzleVar.zza.zzn(zzleVar.zzb.zza, this.zzo);
        long j = zzleVar.zzc;
        if (j != -9223372036854775807L) {
            return zzen.zzv(j) + zzen.zzv(0L);
        }
        long j3 = zzleVar.zza.zze(zzR(zzleVar), this.zza, 0L).zzl;
        return zzen.zzv(0L);
    }

    private final long zzU(zzle zzleVar) {
        if (zzleVar.zza.zzo()) {
            return zzen.zzs(this.zzW);
        }
        long j = zzleVar.zzs;
        if (zzleVar.zzb.zzb()) {
            return j;
        }
        zzW(zzleVar.zza, zzleVar.zzb, j);
        return j;
    }

    private static long zzV(zzle zzleVar) {
        zzbm zzbmVar = new zzbm();
        zzbl zzblVar = new zzbl();
        zzleVar.zza.zzn(zzleVar.zzb.zza, zzblVar);
        long j = zzleVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j3 = zzleVar.zza.zze(zzblVar.zzc, zzbmVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(zzbn zzbnVar, zzuq zzuqVar, long j) {
        zzbnVar.zzn(zzuqVar.zza, this.zzo);
        return j;
    }

    private final Pair zzX(zzbn zzbnVar, int i7, long j) {
        if (zzbnVar.zzo()) {
            this.zzV = i7;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzW = j;
            return null;
        }
        if (i7 == -1 || i7 >= zzbnVar.zzc()) {
            i7 = zzbnVar.zzg(false);
            long j3 = zzbnVar.zze(i7, this.zza, 0L).zzl;
            j = zzen.zzv(0L);
        }
        return zzbnVar.zzl(this.zza, this.zzo, i7, zzen.zzs(j));
    }

    private static zzle zzY(zzle zzleVar, int i7) {
        zzle zzf = zzleVar.zzf(i7);
        return (i7 == 1 || i7 == 4) ? zzf.zza(false) : zzf;
    }

    private final zzle zzZ(zzle zzleVar, zzbn zzbnVar, Pair pair) {
        zzcv.zzd(zzbnVar.zzo() || pair != null);
        zzbn zzbnVar2 = zzleVar.zza;
        long zzT = zzT(zzleVar);
        zzle zzg = zzleVar.zzg(zzbnVar);
        if (zzbnVar.zzo()) {
            zzuq zzi = zzle.zzi();
            long zzs = zzen.zzs(this.zzW);
            zzle zzb = zzg.zzc(zzi, zzs, zzs, zzs, 0L, zzwv.zza, this.zzb, zzfwh.zzn()).zzb(zzi);
            zzb.zzq = zzb.zzs;
            return zzb;
        }
        Object obj = zzg.zzb.zza;
        int i7 = zzen.zza;
        boolean equals = obj.equals(pair.first);
        zzuq zzuqVar = !equals ? new zzuq(pair.first, -1L) : zzg.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzs2 = zzen.zzs(zzT);
        if (!zzbnVar2.zzo()) {
            zzbnVar2.zzn(obj, this.zzo);
        }
        if (!equals || longValue < zzs2) {
            zzcv.zzf(!zzuqVar.zzb());
            zzle zzb2 = zzg.zzc(zzuqVar, longValue, longValue, longValue, 0L, !equals ? zzwv.zza : zzg.zzh, !equals ? this.zzb : zzg.zzi, !equals ? zzfwh.zzn() : zzg.zzj).zzb(zzuqVar);
            zzb2.zzq = longValue;
            return zzb2;
        }
        if (longValue != zzs2) {
            zzcv.zzf(!zzuqVar.zzb());
            long max = Math.max(0L, zzg.zzr - (longValue - zzs2));
            long j = zzg.zzq;
            if (zzg.zzk.equals(zzg.zzb)) {
                j = longValue + max;
            }
            zzle zzc = zzg.zzc(zzuqVar, longValue, longValue, longValue, max, zzg.zzh, zzg.zzi, zzg.zzj);
            zzc.zzq = j;
            return zzc;
        }
        int zza = zzbnVar.zza(zzg.zzk.zza);
        if (zza != -1 && zzbnVar.zzd(zza, this.zzo, false).zzc == zzbnVar.zzn(zzuqVar.zza, this.zzo).zzc) {
            return zzg;
        }
        zzbnVar.zzn(zzuqVar.zza, this.zzo);
        long zzf = zzuqVar.zzb() ? this.zzo.zzf(zzuqVar.zzb, zzuqVar.zzc) : this.zzo.zzd;
        zzle zzb3 = zzg.zzc(zzuqVar, zzg.zzs, zzg.zzs, zzg.zzd, zzf - zzg.zzs, zzg.zzh, zzg.zzi, zzg.zzj).zzb(zzuqVar);
        zzb3.zzq = zzf;
        return zzb3;
    }

    private final zzli zzaa(zzlh zzlhVar) {
        int zzR = zzR(this.zzU);
        zzbn zzbnVar = this.zzU.zza;
        if (zzR == -1) {
            zzR = 0;
        }
        zzcz zzczVar = this.zzu;
        zzkf zzkfVar = this.zzl;
        return new zzli(zzkfVar, zzlhVar, zzbnVar, zzR, zzczVar, zzkfVar.zzc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzab(final zzkc zzkcVar) {
        this.zzk.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // java.lang.Runnable
            public final void run() {
                zzjs.zzJ(zzjs.this, zzkcVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(final int i7, final int i8) {
        if (i7 == this.zzM.zzb() && i8 == this.zzM.zza()) {
            return;
        }
        this.zzM = new zzee(i7, i8);
        zzdp zzdpVar = this.zzm;
        zzdpVar.zzd(24, new zzdm() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj) {
                int i9 = zzjs.zzd;
                ((zzbe) obj).zzp(i7, i8);
            }
        });
        zzdpVar.zzc();
        zzad(2, 14, new zzee(i7, i8));
    }

    private final void zzad(int i7, int i8, Object obj) {
        zzlm[] zzlmVarArr = this.zzh;
        int length = zzlmVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            zzlm zzlmVar = zzlmVarArr[i9];
            if (i7 == -1 || zzlmVar.zzb() == i7) {
                zzli zzaa = zzaa(zzlmVar);
                zzaa.zzf(i8);
                zzaa.zze(obj);
                zzaa.zzd();
            }
        }
        zzlm[] zzlmVarArr2 = this.zzi;
        int length2 = zzlmVarArr2.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzlm zzlmVar2 = zzlmVarArr2[i10];
            if (zzlmVar2 != null && (i7 == -1 || zzlmVar2.zzb() == i7)) {
                zzli zzaa2 = zzaa(zzlmVar2);
                zzaa2.zzf(i8);
                zzaa2.zze(obj);
                zzaa2.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(Object obj) {
        Object obj2 = this.zzJ;
        boolean z4 = false;
        if (obj2 != null && obj2 != obj) {
            z4 = true;
        }
        boolean zzt = this.zzl.zzt(obj, z4 ? this.zzA : -9223372036854775807L);
        if (z4) {
            Object obj3 = this.zzJ;
            Surface surface = this.zzK;
            if (obj3 == surface) {
                surface.release();
                this.zzK = null;
            }
        }
        this.zzJ = obj;
        if (zzt) {
            return;
        }
        zzaf(zzia.zzd(new zzkg(3), 1003));
    }

    private final void zzaf(zzia zziaVar) {
        zzle zzleVar = this.zzU;
        zzle zzb = zzleVar.zzb(zzleVar.zzb);
        zzb.zzq = zzb.zzs;
        zzb.zzr = 0L;
        zzle zzY = zzY(zzb, 1);
        if (zziaVar != null) {
            zzY = zzY.zze(zziaVar);
        }
        this.zzC++;
        this.zzl.zzr();
        zzah(zzY, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final void zzag(boolean z4, int i7, int i8) {
        zzle zzleVar = this.zzU;
        if (zzleVar.zzl == z4 && zzleVar.zzn == 0 && zzleVar.zzm == i8) {
            return;
        }
        this.zzC++;
        zzle zzd2 = zzleVar.zzd(z4, i8, 0);
        this.zzl.zzp(z4, i8, 0);
        zzah(zzd2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzah(final zzle zzleVar, final int i7, boolean z4, int i8, long j, int i9, boolean z7) {
        final int i10;
        boolean z8;
        Pair pair;
        boolean z9;
        int i11;
        Pair pair2;
        boolean booleanValue;
        final zzap zzapVar;
        List list;
        int i12;
        zzbn zzo;
        zzat zzw;
        boolean equals;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        zzyo zzyoVar;
        zzyo zzyoVar2;
        zzbd zzbdVar;
        zzg zzgVar;
        zzbn zzo2;
        ?? r12;
        int i13;
        boolean z14;
        zzbn zzo3;
        boolean z15;
        zzbn zzo4;
        long j3;
        boolean z16;
        zzbd zze;
        int i14;
        Object obj;
        zzap zzapVar2;
        Object obj2;
        int i15;
        long j7;
        long zzV;
        Object obj3;
        zzap zzapVar3;
        Object obj4;
        int i16;
        int i17 = i8;
        zzle zzleVar2 = this.zzU;
        this.zzU = zzleVar;
        boolean equals2 = zzleVar2.zza.equals(zzleVar.zza);
        zzbn zzbnVar = zzleVar2.zza;
        zzbn zzbnVar2 = zzleVar.zza;
        if (zzbnVar2.zzo() && zzbnVar.zzo()) {
            pair2 = new Pair(Boolean.FALSE, -1);
        } else {
            if (zzbnVar2.zzo() == zzbnVar.zzo()) {
                if (zzbnVar.zze(zzbnVar.zzn(zzleVar2.zzb.zza, this.zzo).zzc, this.zza, 0L).zzb.equals(zzbnVar2.zze(zzbnVar2.zzn(zzleVar.zzb.zza, this.zzo).zzc, this.zza, 0L).zzb)) {
                    if (!z4) {
                        i10 = i17;
                        z8 = false;
                    } else if (i17 != 0) {
                        i10 = i17;
                        z8 = true;
                    } else if (zzleVar2.zzb.zzd < zzleVar.zzb.zzd) {
                        pair = new Pair(Boolean.TRUE, 0);
                        z8 = true;
                        i10 = 0;
                    } else {
                        z8 = true;
                        i10 = 0;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (!z4) {
                        z9 = false;
                    } else if (i17 == 0) {
                        z9 = true;
                        i11 = 1;
                        i17 = 0;
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                        boolean z17 = z9;
                        i10 = i17;
                        z8 = z17;
                    } else {
                        z9 = true;
                    }
                    boolean z18 = z9;
                    if (z9 && i17 == 1) {
                        z9 = z18;
                        i11 = 2;
                    } else {
                        if (equals2) {
                            throw new IllegalStateException();
                        }
                        i11 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                    boolean z172 = z9;
                    i10 = i17;
                    z8 = z172;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzapVar = null;
                } else {
                    zzapVar = !zzleVar.zza.zzo() ? zzleVar.zza.zze(zzleVar.zza.zzn(zzleVar.zzb.zza, this.zzo).zzc, this.zza, 0L).zzd : null;
                    this.zzT = zzat.zza;
                }
                if (!booleanValue || !zzleVar2.zzj.equals(zzleVar.zzj)) {
                    zzar zza = this.zzT.zza();
                    list = zzleVar.zzj;
                    for (i12 = 0; i12 < list.size(); i12++) {
                        zzav zzavVar = (zzav) list.get(i12);
                        for (int i18 = 0; i18 < zzavVar.zza(); i18++) {
                            zzavVar.zzb(i18).zza(zza);
                        }
                    }
                    this.zzT = zza.zzw();
                }
                zzo = zzo();
                if (zzo.zzo()) {
                    zzap zzapVar4 = zzo.zze(zze(), this.zza, 0L).zzd;
                    zzar zza2 = this.zzT.zza();
                    zza2.zzb(zzapVar4.zzd);
                    zzw = zza2.zzw();
                } else {
                    zzw = this.zzT;
                }
                equals = zzw.equals(this.zzI);
                this.zzI = zzw;
                z10 = zzleVar2.zzl == zzleVar.zzl;
                z11 = zzleVar2.zze == zzleVar.zze;
                if (!z11 || z10) {
                    zzai();
                }
                boolean z19 = zzleVar2.zzg == zzleVar.zzg;
                if (!equals2) {
                    this.zzm.zzd(0, new zzdm() { // from class: com.google.android.gms.internal.ads.zzim
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj5) {
                            int i19 = zzjs.zzd;
                            ((zzbe) obj5).zzq(zzle.this.zza, i7);
                        }
                    });
                }
                if (z8) {
                    z12 = z11;
                    z13 = z19;
                } else {
                    zzbl zzblVar = new zzbl();
                    if (zzleVar2.zza.zzo()) {
                        z12 = z11;
                        z13 = z19;
                        i14 = i9;
                        obj = null;
                        zzapVar2 = null;
                        obj2 = null;
                        i15 = -1;
                    } else {
                        Object obj5 = zzleVar2.zzb.zza;
                        zzleVar2.zza.zzn(obj5, zzblVar);
                        int i19 = zzblVar.zzc;
                        int zza3 = zzleVar2.zza.zza(obj5);
                        z12 = z11;
                        z13 = z19;
                        obj2 = obj5;
                        obj = zzleVar2.zza.zze(i19, this.zza, 0L).zzb;
                        zzapVar2 = this.zza.zzd;
                        i15 = zza3;
                        i14 = i19;
                    }
                    if (i10 == 0) {
                        if (zzleVar2.zzb.zzb()) {
                            zzuq zzuqVar = zzleVar2.zzb;
                            j7 = zzblVar.zzf(zzuqVar.zzb, zzuqVar.zzc);
                            zzV = zzV(zzleVar2);
                            int i20 = zzen.zza;
                            zzuq zzuqVar2 = zzleVar2.zzb;
                            final zzbf zzbfVar = new zzbf(obj, i14, zzapVar2, obj2, i15, zzen.zzv(j7), zzen.zzv(zzV), zzuqVar2.zzb, zzuqVar2.zzc);
                            int zze2 = zze();
                            if (this.zzU.zza.zzo()) {
                                zzle zzleVar3 = this.zzU;
                                Object obj6 = zzleVar3.zzb.zza;
                                zzleVar3.zza.zzn(obj6, this.zzo);
                                i16 = this.zzU.zza.zza(obj6);
                                obj3 = this.zzU.zza.zze(zze2, this.zza, 0L).zzb;
                                zzapVar3 = this.zza.zzd;
                                obj4 = obj6;
                            } else {
                                obj3 = null;
                                zzapVar3 = null;
                                obj4 = null;
                                i16 = -1;
                            }
                            long zzv = zzen.zzv(j);
                            long zzv2 = !this.zzU.zzb.zzb() ? zzen.zzv(zzV(this.zzU)) : zzv;
                            zzuq zzuqVar3 = this.zzU.zzb;
                            final zzbf zzbfVar2 = new zzbf(obj3, zze2, zzapVar3, obj4, i16, zzv, zzv2, zzuqVar3.zzb, zzuqVar3.zzc);
                            this.zzm.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
                                @Override // com.google.android.gms.internal.ads.zzdm
                                public final void zza(Object obj7) {
                                    int i21 = zzjs.zzd;
                                    ((zzbe) obj7).zzn(zzbfVar, zzbfVar2, i10);
                                }
                            });
                        } else {
                            j7 = zzleVar2.zzb.zze != -1 ? zzV(this.zzU) : zzblVar.zzd;
                            zzV = j7;
                            int i202 = zzen.zza;
                            zzuq zzuqVar22 = zzleVar2.zzb;
                            final zzbf zzbfVar3 = new zzbf(obj, i14, zzapVar2, obj2, i15, zzen.zzv(j7), zzen.zzv(zzV), zzuqVar22.zzb, zzuqVar22.zzc);
                            int zze22 = zze();
                            if (this.zzU.zza.zzo()) {
                            }
                            long zzv3 = zzen.zzv(j);
                            if (!this.zzU.zzb.zzb()) {
                            }
                            zzuq zzuqVar32 = this.zzU.zzb;
                            final zzbf zzbfVar22 = new zzbf(obj3, zze22, zzapVar3, obj4, i16, zzv3, zzv2, zzuqVar32.zzb, zzuqVar32.zzc);
                            this.zzm.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
                                @Override // com.google.android.gms.internal.ads.zzdm
                                public final void zza(Object obj7) {
                                    int i21 = zzjs.zzd;
                                    ((zzbe) obj7).zzn(zzbfVar3, zzbfVar22, i10);
                                }
                            });
                        }
                    } else if (zzleVar2.zzb.zzb()) {
                        j7 = zzleVar2.zzs;
                        zzV = zzV(zzleVar2);
                        int i2022 = zzen.zza;
                        zzuq zzuqVar222 = zzleVar2.zzb;
                        final zzbf zzbfVar32 = new zzbf(obj, i14, zzapVar2, obj2, i15, zzen.zzv(j7), zzen.zzv(zzV), zzuqVar222.zzb, zzuqVar222.zzc);
                        int zze222 = zze();
                        if (this.zzU.zza.zzo()) {
                        }
                        long zzv32 = zzen.zzv(j);
                        if (!this.zzU.zzb.zzb()) {
                        }
                        zzuq zzuqVar322 = this.zzU.zzb;
                        final zzbf zzbfVar222 = new zzbf(obj3, zze222, zzapVar3, obj4, i16, zzv32, zzv2, zzuqVar322.zzb, zzuqVar322.zzc);
                        this.zzm.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
                            @Override // com.google.android.gms.internal.ads.zzdm
                            public final void zza(Object obj7) {
                                int i21 = zzjs.zzd;
                                ((zzbe) obj7).zzn(zzbfVar32, zzbfVar222, i10);
                            }
                        });
                    } else {
                        j7 = zzleVar2.zzs;
                        zzV = j7;
                        int i20222 = zzen.zza;
                        zzuq zzuqVar2222 = zzleVar2.zzb;
                        final zzbf zzbfVar322 = new zzbf(obj, i14, zzapVar2, obj2, i15, zzen.zzv(j7), zzen.zzv(zzV), zzuqVar2222.zzb, zzuqVar2222.zzc);
                        int zze2222 = zze();
                        if (this.zzU.zza.zzo()) {
                        }
                        long zzv322 = zzen.zzv(j);
                        if (!this.zzU.zzb.zzb()) {
                        }
                        zzuq zzuqVar3222 = this.zzU.zzb;
                        final zzbf zzbfVar2222 = new zzbf(obj3, zze2222, zzapVar3, obj4, i16, zzv322, zzv2, zzuqVar3222.zzb, zzuqVar3222.zzc);
                        this.zzm.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
                            @Override // com.google.android.gms.internal.ads.zzdm
                            public final void zza(Object obj7) {
                                int i21 = zzjs.zzd;
                                ((zzbe) obj7).zzn(zzbfVar322, zzbfVar2222, i10);
                            }
                        });
                    }
                }
                if (booleanValue) {
                    this.zzm.zzd(1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjg
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zze(zzap.this, intValue);
                        }
                    });
                }
                if (zzleVar2.zzf != zzleVar.zzf) {
                    this.zzm.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjh
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzl(zzle.this.zzf);
                        }
                    });
                    if (zzleVar.zzf != null) {
                        this.zzm.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzji
                            @Override // com.google.android.gms.internal.ads.zzdm
                            public final void zza(Object obj7) {
                                int i21 = zzjs.zzd;
                                ((zzbe) obj7).zzk(zzle.this.zzf);
                            }
                        });
                    }
                }
                zzyoVar = zzleVar2.zzi;
                zzyoVar2 = zzleVar.zzi;
                if (zzyoVar != zzyoVar2) {
                    this.zzj.zzp(zzyoVar2.zze);
                    this.zzm.zzd(2, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjj
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzr(zzle.this.zzi.zzd);
                        }
                    });
                }
                if (!equals) {
                    final zzat zzatVar = this.zzI;
                    this.zzm.zzd(14, new zzdm() { // from class: com.google.android.gms.internal.ads.zzin
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzf(zzat.this);
                        }
                    });
                }
                if (z13) {
                    this.zzm.zzd(3, new zzdm() { // from class: com.google.android.gms.internal.ads.zzio
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzc(zzle.this.zzg);
                        }
                    });
                }
                if (!z12 || z10) {
                    this.zzm.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzip
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            zzle zzleVar4 = zzle.this;
                            ((zzbe) obj7).zzm(zzleVar4.zzl, zzleVar4.zze);
                        }
                    });
                }
                if (z12) {
                    this.zzm.zzd(4, new zzdm() { // from class: com.google.android.gms.internal.ads.zziq
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzi(zzle.this.zze);
                        }
                    });
                }
                if (!z10 || zzleVar2.zzm != zzleVar.zzm) {
                    this.zzm.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            zzle zzleVar4 = zzle.this;
                            ((zzbe) obj7).zzg(zzleVar4.zzl, zzleVar4.zzm);
                        }
                    });
                }
                if (zzleVar2.zzn != zzleVar.zzn) {
                    this.zzm.zzd(6, new zzdm() { // from class: com.google.android.gms.internal.ads.zzja
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzj(zzle.this.zzn);
                        }
                    });
                }
                if (zzleVar2.zzj() != zzleVar.zzj()) {
                    this.zzm.zzd(7, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjd
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzd(zzle.this.zzj());
                        }
                    });
                }
                if (!zzleVar2.zzo.equals(zzleVar.zzo)) {
                    this.zzm.zzd(12, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i21 = zzjs.zzd;
                            ((zzbe) obj7).zzh(zzle.this.zzo);
                        }
                    });
                }
                zzbdVar = this.zzH;
                zzbh zzbhVar = this.zzg;
                zzbd zzbdVar2 = this.zzc;
                int i21 = zzen.zza;
                boolean zzx = zzbhVar.zzx();
                zzgVar = (zzg) zzbhVar;
                zzbn zzo5 = zzgVar.zzo();
                boolean z20 = zzo5.zzo() && zzo5.zze(zzgVar.zze(), zzgVar.zza, 0L).zzh;
                zzo2 = zzgVar.zzo();
                if (zzo2.zzo()) {
                    int zze3 = zzgVar.zze();
                    zzgVar.zzi();
                    zzgVar.zzw();
                    r12 = 0;
                    r12 = 0;
                    int zzk = zzo2.zzk(zze3, 0, false);
                    i13 = -1;
                    z14 = zzk != -1;
                } else {
                    i13 = -1;
                    r12 = 0;
                    z14 = false;
                }
                zzo3 = zzgVar.zzo();
                if (!zzo3.zzo()) {
                    int zze4 = zzgVar.zze();
                    zzgVar.zzi();
                    zzgVar.zzw();
                    if (zzo3.zzj(zze4, r12, r12) != i13) {
                        z15 = true;
                        zzo4 = zzgVar.zzo();
                        if (zzo4.zzo()) {
                            j3 = 0;
                        } else {
                            j3 = 0;
                            if (zzo4.zze(zzgVar.zze(), zzgVar.zza, 0L).zzb()) {
                                z16 = true;
                                zzbn zzo6 = zzgVar.zzo();
                                boolean z21 = (zzo6.zzo() && zzo6.zze(zzgVar.zze(), zzgVar.zza, j3).zzi) ? true : r12;
                                boolean zzo7 = zzbhVar.zzo().zzo();
                                zzbc zzbcVar = new zzbc();
                                zzbcVar.zzb(zzbdVar2);
                                boolean z22 = !zzx;
                                zzbcVar.zzd(4, z22);
                                zzbcVar.zzd(5, (z20 || zzx) ? r12 : true);
                                zzbcVar.zzd(6, (z14 || zzx) ? r12 : true);
                                zzbcVar.zzd(7, (!zzo7 || !(z14 || !z16 || z20) || zzx) ? r12 : true);
                                zzbcVar.zzd(8, (z15 || zzx) ? r12 : true);
                                zzbcVar.zzd(9, (!zzo7 || !(z15 || (z16 && z21)) || zzx) ? r12 : true);
                                zzbcVar.zzd(10, z22);
                                zzbcVar.zzd(11, (z20 || zzx) ? r12 : true);
                                zzbcVar.zzd(12, (z20 || zzx) ? r12 : true);
                                zze = zzbcVar.zze();
                                this.zzH = zze;
                                if (!zze.equals(zzbdVar)) {
                                    this.zzm.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                                        @Override // com.google.android.gms.internal.ads.zzdm
                                        public final void zza(Object obj7) {
                                            ((zzbe) obj7).zzb(zzjs.this.zzH);
                                        }
                                    });
                                }
                                this.zzm.zzc();
                            }
                        }
                        z16 = r12;
                        zzbn zzo62 = zzgVar.zzo();
                        if (zzo62.zzo()) {
                        }
                        boolean zzo72 = zzbhVar.zzo().zzo();
                        zzbc zzbcVar2 = new zzbc();
                        zzbcVar2.zzb(zzbdVar2);
                        boolean z222 = !zzx;
                        zzbcVar2.zzd(4, z222);
                        zzbcVar2.zzd(5, (z20 || zzx) ? r12 : true);
                        zzbcVar2.zzd(6, (z14 || zzx) ? r12 : true);
                        zzbcVar2.zzd(7, (!zzo72 || !(z14 || !z16 || z20) || zzx) ? r12 : true);
                        zzbcVar2.zzd(8, (z15 || zzx) ? r12 : true);
                        zzbcVar2.zzd(9, (!zzo72 || !(z15 || (z16 && z21)) || zzx) ? r12 : true);
                        zzbcVar2.zzd(10, z222);
                        zzbcVar2.zzd(11, (z20 || zzx) ? r12 : true);
                        zzbcVar2.zzd(12, (z20 || zzx) ? r12 : true);
                        zze = zzbcVar2.zze();
                        this.zzH = zze;
                        if (!zze.equals(zzbdVar)) {
                        }
                        this.zzm.zzc();
                    }
                }
                z15 = r12;
                zzo4 = zzgVar.zzo();
                if (zzo4.zzo()) {
                }
                z16 = r12;
                zzbn zzo622 = zzgVar.zzo();
                if (zzo622.zzo()) {
                }
                boolean zzo722 = zzbhVar.zzo().zzo();
                zzbc zzbcVar22 = new zzbc();
                zzbcVar22.zzb(zzbdVar2);
                boolean z2222 = !zzx;
                zzbcVar22.zzd(4, z2222);
                zzbcVar22.zzd(5, (z20 || zzx) ? r12 : true);
                zzbcVar22.zzd(6, (z14 || zzx) ? r12 : true);
                zzbcVar22.zzd(7, (!zzo722 || !(z14 || !z16 || z20) || zzx) ? r12 : true);
                zzbcVar22.zzd(8, (z15 || zzx) ? r12 : true);
                zzbcVar22.zzd(9, (!zzo722 || !(z15 || (z16 && z21)) || zzx) ? r12 : true);
                zzbcVar22.zzd(10, z2222);
                zzbcVar22.zzd(11, (z20 || zzx) ? r12 : true);
                zzbcVar22.zzd(12, (z20 || zzx) ? r12 : true);
                zze = zzbcVar22.zze();
                this.zzH = zze;
                if (!zze.equals(zzbdVar)) {
                }
                this.zzm.zzc();
            }
            pair2 = new Pair(Boolean.TRUE, 3);
        }
        pair = pair2;
        i10 = i17;
        z8 = z4;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!booleanValue) {
        }
        zzar zza4 = this.zzT.zza();
        list = zzleVar.zzj;
        while (i12 < list.size()) {
        }
        this.zzT = zza4.zzw();
        zzo = zzo();
        if (zzo.zzo()) {
        }
        equals = zzw.equals(this.zzI);
        this.zzI = zzw;
        if (zzleVar2.zzl == zzleVar.zzl) {
        }
        if (zzleVar2.zze == zzleVar.zze) {
        }
        if (!z11) {
        }
        zzai();
        if (zzleVar2.zzg == zzleVar.zzg) {
        }
        if (!equals2) {
        }
        if (z8) {
        }
        if (booleanValue) {
        }
        if (zzleVar2.zzf != zzleVar.zzf) {
        }
        zzyoVar = zzleVar2.zzi;
        zzyoVar2 = zzleVar.zzi;
        if (zzyoVar != zzyoVar2) {
        }
        if (!equals) {
        }
        if (z13) {
        }
        if (!z12) {
        }
        this.zzm.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzip
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj7) {
                int i212 = zzjs.zzd;
                zzle zzleVar4 = zzle.this;
                ((zzbe) obj7).zzm(zzleVar4.zzl, zzleVar4.zze);
            }
        });
        if (z12) {
        }
        if (!z10) {
        }
        this.zzm.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj7) {
                int i212 = zzjs.zzd;
                zzle zzleVar4 = zzle.this;
                ((zzbe) obj7).zzg(zzleVar4.zzl, zzleVar4.zzm);
            }
        });
        if (zzleVar2.zzn != zzleVar.zzn) {
        }
        if (zzleVar2.zzj() != zzleVar.zzj()) {
        }
        if (!zzleVar2.zzo.equals(zzleVar.zzo)) {
        }
        zzbdVar = this.zzH;
        zzbh zzbhVar2 = this.zzg;
        zzbd zzbdVar22 = this.zzc;
        int i212 = zzen.zza;
        boolean zzx2 = zzbhVar2.zzx();
        zzgVar = (zzg) zzbhVar2;
        zzbn zzo52 = zzgVar.zzo();
        if (zzo52.zzo()) {
        }
        zzo2 = zzgVar.zzo();
        if (zzo2.zzo()) {
        }
        zzo3 = zzgVar.zzo();
        if (!zzo3.zzo()) {
        }
        z15 = r12;
        zzo4 = zzgVar.zzo();
        if (zzo4.zzo()) {
        }
        z16 = r12;
        zzbn zzo6222 = zzgVar.zzo();
        if (zzo6222.zzo()) {
        }
        boolean zzo7222 = zzbhVar2.zzo().zzo();
        zzbc zzbcVar222 = new zzbc();
        zzbcVar222.zzb(zzbdVar22);
        boolean z22222 = !zzx2;
        zzbcVar222.zzd(4, z22222);
        zzbcVar222.zzd(5, (z20 || zzx2) ? r12 : true);
        zzbcVar222.zzd(6, (z14 || zzx2) ? r12 : true);
        zzbcVar222.zzd(7, (!zzo7222 || !(z14 || !z16 || z20) || zzx2) ? r12 : true);
        zzbcVar222.zzd(8, (z15 || zzx2) ? r12 : true);
        zzbcVar222.zzd(9, (!zzo7222 || !(z15 || (z16 && z21)) || zzx2) ? r12 : true);
        zzbcVar222.zzd(10, z22222);
        zzbcVar222.zzd(11, (z20 || zzx2) ? r12 : true);
        zzbcVar222.zzd(12, (z20 || zzx2) ? r12 : true);
        zze = zzbcVar222.zze();
        this.zzH = zze;
        if (!zze.equals(zzbdVar)) {
        }
        this.zzm.zzc();
    }

    private final void zzai() {
        int zzg = zzg();
        if (zzg != 2 && zzg != 3) {
            this.zzy.zza(false);
            this.zzz.zza(false);
        } else {
            zzaj();
            boolean z4 = this.zzU.zzp;
            this.zzy.zza(zzv());
            this.zzz.zza(zzv());
        }
    }

    private final void zzaj() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.zzs.getThread().getName();
            int i7 = zzen.zza;
            Locale locale = Locale.US;
            String j = L.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzQ) {
                throw new IllegalStateException(j);
            }
            zzdq.zzg("ExoPlayerImpl", j, this.zzR ? null : new IllegalStateException());
            this.zzR = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzA() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzen.zzb;
        String zza = zzaq.zza();
        StringBuilder l7 = k.l("Release ", hexString, " [AndroidXMedia3/1.6.0-beta01] [", str, "] [");
        l7.append(zza);
        l7.append("]");
        zzdq.zze("ExoPlayerImpl", l7.toString());
        zzaj();
        this.zzy.zza(false);
        this.zzz.zza(false);
        if (!this.zzl.zzs()) {
            zzdp zzdpVar = this.zzm;
            zzdpVar.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzit
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj) {
                    int i7 = zzjs.zzd;
                    ((zzbe) obj).zzk(zzia.zzd(new zzkg(1), 1003));
                }
            });
            zzdpVar.zzc();
        }
        this.zzm.zze();
        this.zzk.zze(null);
        this.zzt.zzg(this.zzr);
        zzle zzleVar = this.zzU;
        boolean z4 = zzleVar.zzp;
        zzle zzY = zzY(zzleVar, 1);
        this.zzU = zzY;
        zzle zzb = zzY.zzb(zzY.zzb);
        this.zzU = zzb;
        zzb.zzq = zzb.zzs;
        this.zzU.zzr = 0L;
        this.zzr.zzR();
        Surface surface = this.zzK;
        if (surface != null) {
            surface.release();
            this.zzK = null;
        }
        int i7 = zzco.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzB(zzmb zzmbVar) {
        zzaj();
        this.zzr.zzS(zzmbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzC(zzus zzusVar) {
        zzaj();
        List singletonList = Collections.singletonList(zzusVar);
        zzaj();
        zzaj();
        zzR(this.zzU);
        zzl();
        this.zzC++;
        boolean z4 = false;
        if (!this.zzp.isEmpty()) {
            int size = this.zzp.size();
            for (int i7 = size - 1; i7 >= 0; i7--) {
                this.zzp.remove(i7);
            }
            this.zzY = this.zzY.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < singletonList.size(); i8++) {
            zzlb zzlbVar = new zzlb((zzus) singletonList.get(i8), this.zzq);
            arrayList.add(zzlbVar);
            this.zzp.add(i8, new zzjq(zzlbVar.zzb, zzlbVar.zza));
        }
        this.zzY = this.zzY.zzg(0, arrayList.size());
        zzlk zzlkVar = new zzlk(this.zzp, this.zzY);
        if (!zzlkVar.zzo() && zzlkVar.zzc() < 0) {
            throw new zzaa(zzlkVar, -1, -9223372036854775807L);
        }
        int zzg = zzlkVar.zzg(false);
        zzle zzZ = zzZ(this.zzU, zzlkVar, zzX(zzlkVar, zzg, -9223372036854775807L));
        int i9 = zzZ.zze;
        if (zzg != -1 && i9 != 1) {
            i9 = 4;
            if (!zzlkVar.zzo() && zzg < zzlkVar.zzc()) {
                i9 = 2;
            }
        }
        zzle zzY = zzY(zzZ, i9);
        this.zzl.zzu(arrayList, zzg, zzen.zzs(-9223372036854775807L), this.zzY);
        if (!this.zzU.zzb.zza.equals(zzY.zzb.zza) && !this.zzU.zza.zzo()) {
            z4 = true;
        }
        zzah(zzY, 0, z4, 4, zzU(zzY), -1, false);
    }

    public final zzia zzE() {
        zzaj();
        return this.zzU.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void zzb(int i7, long j, int i8, boolean z4) {
        zzaj();
        if (i7 == -1) {
            return;
        }
        zzcv.zzd(i7 >= 0);
        zzbn zzbnVar = this.zzU.zza;
        if (zzbnVar.zzo() || i7 < zzbnVar.zzc()) {
            this.zzr.zzv();
            this.zzC++;
            if (zzx()) {
                zzdq.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkc zzkcVar = new zzkc(this.zzU);
                zzkcVar.zza(1);
                this.zzX.zza.zzab(zzkcVar);
                return;
            }
            zzle zzleVar = this.zzU;
            int i9 = zzleVar.zze;
            if (i9 == 3 || (i9 == 4 && !zzbnVar.zzo())) {
                zzleVar = zzY(this.zzU, 2);
            }
            int zze = zze();
            zzle zzZ = zzZ(zzleVar, zzbnVar, zzX(zzbnVar, i7, j));
            this.zzl.zzm(zzbnVar, i7, zzen.zzs(j));
            zzah(zzZ, 0, true, 1, zzU(zzZ), zze, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzc() {
        zzaj();
        if (zzx()) {
            return this.zzU.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzd() {
        zzaj();
        if (zzx()) {
            return this.zzU.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zze() {
        zzaj();
        int zzR = zzR(this.zzU);
        if (zzR == -1) {
            return 0;
        }
        return zzR;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzf() {
        zzaj();
        if (this.zzU.zza.zzo()) {
            return 0;
        }
        zzle zzleVar = this.zzU;
        return zzleVar.zza.zza(zzleVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzg() {
        zzaj();
        return this.zzU.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzh() {
        zzaj();
        return this.zzU.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzi() {
        zzaj();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzj() {
        zzaj();
        if (zzx()) {
            zzle zzleVar = this.zzU;
            return zzleVar.zzk.equals(zzleVar.zzb) ? zzen.zzv(this.zzU.zzq) : zzm();
        }
        zzaj();
        if (this.zzU.zza.zzo()) {
            return this.zzW;
        }
        zzle zzleVar2 = this.zzU;
        long j = 0;
        if (zzleVar2.zzk.zzd != zzleVar2.zzb.zzd) {
            return zzen.zzv(zzleVar2.zza.zze(zze(), this.zza, 0L).zzm);
        }
        long j3 = zzleVar2.zzq;
        if (this.zzU.zzk.zzb()) {
            zzle zzleVar3 = this.zzU;
            zzleVar3.zza.zzn(zzleVar3.zzk.zza, this.zzo).zzg(this.zzU.zzk.zzb);
        } else {
            j = j3;
        }
        zzle zzleVar4 = this.zzU;
        zzW(zzleVar4.zza, zzleVar4.zzk, j);
        return zzen.zzv(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzk() {
        zzaj();
        return zzT(this.zzU);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzl() {
        zzaj();
        return zzen.zzv(zzU(this.zzU));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzm() {
        zzaj();
        if (zzx()) {
            zzle zzleVar = this.zzU;
            zzuq zzuqVar = zzleVar.zzb;
            zzleVar.zza.zzn(zzuqVar.zza, this.zzo);
            return zzen.zzv(this.zzo.zzf(zzuqVar.zzb, zzuqVar.zzc));
        }
        zzbn zzo = zzo();
        if (zzo.zzo()) {
            return -9223372036854775807L;
        }
        return zzen.zzv(zzo.zze(zze(), this.zza, 0L).zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzn() {
        zzaj();
        return zzen.zzv(this.zzU.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbn zzo() {
        zzaj();
        return this.zzU.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbv zzp() {
        zzaj();
        return this.zzU.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzq() {
        zzaj();
        zzag(zzv(), 1, zzS(1));
        zzle zzleVar = this.zzU;
        if (zzleVar.zze != 1) {
            return;
        }
        zzle zze = zzleVar.zze(null);
        zzle zzY = zzY(zze, true != zze.zza.zzo() ? 2 : 4);
        this.zzC++;
        this.zzl.zzl();
        zzah(zzY, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzr(boolean z4) {
        zzaj();
        zzg();
        zzag(z4, 1, zzS(1));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzs(Surface surface) {
        zzaj();
        zzae(surface);
        int i7 = surface == null ? 0 : -1;
        zzac(i7, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzt(float f7) {
        zzaj();
        int i7 = zzen.zza;
        final float max = Math.max(0.0f, Math.min(f7, 1.0f));
        if (this.zzO == max) {
            return;
        }
        this.zzO = max;
        this.zzx.zza();
        this.zzl.zzq(max);
        zzdp zzdpVar = this.zzm;
        zzdpVar.zzd(22, new zzdm() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj) {
                int i8 = zzjs.zzd;
                ((zzbe) obj).zzt(max);
            }
        });
        zzdpVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzu() {
        zzaj();
        zzv();
        zzaf(null);
        int i7 = zzco.zza;
        zzfwh zzn = zzfwh.zzn();
        long j = this.zzU.zzs;
        zzfwh.zzl(zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzv() {
        zzaj();
        return this.zzU.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzw() {
        zzaj();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzx() {
        zzaj();
        return this.zzU.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final int zzy() {
        zzaj();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzz(zzmb zzmbVar) {
        this.zzr.zzu(zzmbVar);
    }
}
