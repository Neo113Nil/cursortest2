package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
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
            zzlm[] zzlmVarArrZzac = zzcdj.zzac(((zzic) zzijVar.zzc).zza.zza, handler, zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zzlmVarArrZzac;
            int length = zzlmVarArrZzac.length;
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
            zzyz zzyzVarZzh = zzyz.zzh(((zzig) zzijVar.zzg).zza);
            this.zzt = zzyzVarZzh;
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
            zzbd zzbdVarZze = zzbcVar.zze();
            this.zzc = zzbdVarZze;
            zzbc zzbcVar2 = new zzbc();
            zzbcVar2.zzb(zzbdVarZze);
            zzbcVar2.zza(4);
            zzbcVar2.zza(10);
            this.zzH = zzbcVar2.zze();
            this.zzk = zzczVar2.zzd(looper, null);
            zziw zziwVar = new zziw(this);
            this.zzX = zziwVar;
            this.zzU = zzle.zzh(zzyoVar);
            this.zzr.zzT(zzbhVar, looper);
            final zzor zzorVar = new zzor(zzijVar.zzs);
            zzkf zzkfVar = new zzkf(this.zzh, this.zzi, zzynVar, zzyoVar, (zzkj) zzijVar.zzf.zza(), zzyzVarZzh, 0, false, this.zzr, this.zzF, zzijVar.zzt, zzijVar.zzo, false, false, looper, zzczVar2, zziwVar, zzorVar, null, this.zzG);
            this.zzl = zzkfVar;
            Looper looperZzc = zzkfVar.zzc();
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
            zzyzVarZzh.zzf(new Handler(looper), this.zzr);
            copyOnWriteArraySet.add(this.zzv);
            if (zzen.zza >= 31) {
                final Context context = this.zzf;
                zzijVar2 = zzijVar;
                final boolean z4 = zzijVar2.zzq;
                zzczVar = zzczVar2;
                zzczVar.zzd(zzkfVar.zzc(), null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzon zzonVarZzb = zzon.zzb(context);
                        if (zzonVarZzb == null) {
                            zzdq.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z4) {
                            this.zzz(zzonVarZzb);
                        }
                        zzorVar.zzb(zzonVarZzb.zza());
                    }
                });
            } else {
                zzijVar2 = zzijVar;
                zzczVar = zzczVar2;
            }
            zzcy zzcyVar = new zzcy(0, looperZzc, looper, zzczVar, new zzix(this));
            this.zzB = zzcyVar;
            zzcyVar.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zziy
                @Override // java.lang.Runnable
                public final void run() {
                    zzjs.zzI(this.zza);
                }
            });
            new zzhl(zzijVar2.zza, looperZzc, zzijVar2.zzi, this.zzv, zzczVar);
            this.zzx = new zzho(zzijVar2.zza, handler, this.zzv);
            zzfte.zza(null, null);
            this.zzy = new zzlw(zzijVar2.zza, looperZzc, zzczVar);
            this.zzz = new zzlx(zzijVar2.zza, looperZzc, zzczVar);
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
                List listZzw = ((zzlk) zzbnVar).zzw();
                zzcv.zzf(listZzw.size() == zzjsVar.zzp.size());
                for (int i8 = 0; i8 < listZzw.size(); i8++) {
                    ((zzjq) zzjsVar.zzp.get(i8)).zzc((zzbn) listZzw.get(i8));
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
        Integer numValueOf = Integer.valueOf(i8);
        zzjsVar.zzad(1, 10, numValueOf);
        zzjsVar.zzad(2, 10, numValueOf);
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
        zzle zzleVarZzf = zzleVar.zzf(i7);
        return (i7 == 1 || i7 == 4) ? zzleVarZzf.zza(false) : zzleVarZzf;
    }

    private final zzle zzZ(zzle zzleVar, zzbn zzbnVar, Pair pair) {
        zzcv.zzd(zzbnVar.zzo() || pair != null);
        zzbn zzbnVar2 = zzleVar.zza;
        long jZzT = zzT(zzleVar);
        zzle zzleVarZzg = zzleVar.zzg(zzbnVar);
        if (zzbnVar.zzo()) {
            zzuq zzuqVarZzi = zzle.zzi();
            long jZzs = zzen.zzs(this.zzW);
            zzle zzleVarZzb = zzleVarZzg.zzc(zzuqVarZzi, jZzs, jZzs, jZzs, 0L, zzwv.zza, this.zzb, zzfwh.zzn()).zzb(zzuqVarZzi);
            zzleVarZzb.zzq = zzleVarZzb.zzs;
            return zzleVarZzb;
        }
        Object obj = zzleVarZzg.zzb.zza;
        int i7 = zzen.zza;
        boolean zEquals = obj.equals(pair.first);
        zzuq zzuqVar = !zEquals ? new zzuq(pair.first, -1L) : zzleVarZzg.zzb;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzen.zzs(jZzT);
        if (!zzbnVar2.zzo()) {
            zzbnVar2.zzn(obj, this.zzo);
        }
        if (!zEquals || jLongValue < jZzs2) {
            zzcv.zzf(!zzuqVar.zzb());
            zzle zzleVarZzb2 = zzleVarZzg.zzc(zzuqVar, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzwv.zza : zzleVarZzg.zzh, !zEquals ? this.zzb : zzleVarZzg.zzi, !zEquals ? zzfwh.zzn() : zzleVarZzg.zzj).zzb(zzuqVar);
            zzleVarZzb2.zzq = jLongValue;
            return zzleVarZzb2;
        }
        if (jLongValue != jZzs2) {
            zzcv.zzf(!zzuqVar.zzb());
            long jMax = Math.max(0L, zzleVarZzg.zzr - (jLongValue - jZzs2));
            long j = zzleVarZzg.zzq;
            if (zzleVarZzg.zzk.equals(zzleVarZzg.zzb)) {
                j = jLongValue + jMax;
            }
            zzle zzleVarZzc = zzleVarZzg.zzc(zzuqVar, jLongValue, jLongValue, jLongValue, jMax, zzleVarZzg.zzh, zzleVarZzg.zzi, zzleVarZzg.zzj);
            zzleVarZzc.zzq = j;
            return zzleVarZzc;
        }
        int iZza = zzbnVar.zza(zzleVarZzg.zzk.zza);
        if (iZza != -1 && zzbnVar.zzd(iZza, this.zzo, false).zzc == zzbnVar.zzn(zzuqVar.zza, this.zzo).zzc) {
            return zzleVarZzg;
        }
        zzbnVar.zzn(zzuqVar.zza, this.zzo);
        long jZzf = zzuqVar.zzb() ? this.zzo.zzf(zzuqVar.zzb, zzuqVar.zzc) : this.zzo.zzd;
        zzle zzleVarZzb3 = zzleVarZzg.zzc(zzuqVar, zzleVarZzg.zzs, zzleVarZzg.zzs, zzleVarZzg.zzd, jZzf - zzleVarZzg.zzs, zzleVarZzg.zzh, zzleVarZzg.zzi, zzleVarZzg.zzj).zzb(zzuqVar);
        zzleVarZzb3.zzq = jZzf;
        return zzleVarZzb3;
    }

    private final zzli zzaa(zzlh zzlhVar) {
        int iZzR = zzR(this.zzU);
        zzbn zzbnVar = this.zzU.zza;
        if (iZzR == -1) {
            iZzR = 0;
        }
        zzcz zzczVar = this.zzu;
        zzkf zzkfVar = this.zzl;
        return new zzli(zzkfVar, zzlhVar, zzbnVar, iZzR, zzczVar, zzkfVar.zzc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzab(final zzkc zzkcVar) {
        this.zzk.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjb
            @Override // java.lang.Runnable
            public final void run() {
                zzjs.zzJ(this.zza, zzkcVar);
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
                zzli zzliVarZzaa = zzaa(zzlmVar);
                zzliVarZzaa.zzf(i8);
                zzliVarZzaa.zze(obj);
                zzliVarZzaa.zzd();
            }
        }
        zzlm[] zzlmVarArr2 = this.zzi;
        int length2 = zzlmVarArr2.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzlm zzlmVar2 = zzlmVarArr2[i10];
            if (zzlmVar2 != null && (i7 == -1 || zzlmVar2.zzb() == i7)) {
                zzli zzliVarZzaa2 = zzaa(zzlmVar2);
                zzliVarZzaa2.zzf(i8);
                zzliVarZzaa2.zze(obj);
                zzliVarZzaa2.zzd();
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
        boolean zZzt = this.zzl.zzt(obj, z4 ? this.zzA : -9223372036854775807L);
        if (z4) {
            Object obj3 = this.zzJ;
            Surface surface = this.zzK;
            if (obj3 == surface) {
                surface.release();
                this.zzK = null;
            }
        }
        this.zzJ = obj;
        if (zZzt) {
            return;
        }
        zzaf(zzia.zzd(new zzkg(3), 1003));
    }

    private final void zzaf(zzia zziaVar) {
        zzle zzleVar = this.zzU;
        zzle zzleVarZzb = zzleVar.zzb(zzleVar.zzb);
        zzleVarZzb.zzq = zzleVarZzb.zzs;
        zzleVarZzb.zzr = 0L;
        zzle zzleVarZzY = zzY(zzleVarZzb, 1);
        if (zziaVar != null) {
            zzleVarZzY = zzleVarZzY.zze(zziaVar);
        }
        this.zzC++;
        this.zzl.zzr();
        zzah(zzleVarZzY, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final void zzag(boolean z4, int i7, int i8) {
        zzle zzleVar = this.zzU;
        if (zzleVar.zzl == z4 && zzleVar.zzn == 0 && zzleVar.zzm == i8) {
            return;
        }
        this.zzC++;
        zzle zzleVarZzd = zzleVar.zzd(z4, i8, 0);
        this.zzl.zzp(z4, i8, 0);
        zzah(zzleVarZzd, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:111:0x0308  */
    /* JADX WARN: Code duplicated, block: B:114:0x0318  */
    /* JADX WARN: Code duplicated, block: B:116:0x032c  */
    /* JADX WARN: Code duplicated, block: B:118:0x033c  */
    /* JADX WARN: Code duplicated, block: B:121:0x034b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0359  */
    /* JADX WARN: Code duplicated, block: B:129:0x036c  */
    /* JADX WARN: Code duplicated, block: B:132:0x037d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0392  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:151:0x0402  */
    /* JADX WARN: Code duplicated, block: B:154:0x040e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0410  */
    /* JADX WARN: Code duplicated, block: B:157:0x0420  */
    /* JADX WARN: Code duplicated, block: B:160:0x042b  */
    /* JADX WARN: Code duplicated, block: B:162:0x043d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0441  */
    /* JADX WARN: Code duplicated, block: B:167:0x044e  */
    /* JADX WARN: Code duplicated, block: B:170:0x045e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x047b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0486  */
    /* JADX WARN: Code duplicated, block: B:184:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0494  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c A[LOOP:1: B:51:0x0136->B:53:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0203  */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x021a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0221  */
    /* JADX WARN: Code duplicated, block: B:90:0x0229  */
    /* JADX WARN: Code duplicated, block: B:91:0x022c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0234  */
    /* JADX WARN: Code duplicated, block: B:94:0x023b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0267  */
    /* JADX WARN: Code duplicated, block: B:98:0x029a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzbn] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r9v14, types: [com.google.android.gms.internal.ads.zzbc] */
    private final void zzah(final zzle zzleVar, final int i7, boolean z4, int i8, long j, int i9, boolean z7) {
        final int i10;
        boolean z8;
        Pair pair;
        boolean z9;
        int i11;
        Pair pair2;
        boolean zBooleanValue;
        final int iIntValue;
        final zzap zzapVar;
        zzar zzarVarZza;
        List list;
        int i12;
        zzav zzavVar;
        int i13;
        zzbn zzbnVarZzo;
        zzat zzatVarZzw;
        boolean zEquals;
        boolean z10;
        boolean z11;
        boolean z12;
        zzyo zzyoVar;
        zzyo zzyoVar2;
        zzbd zzbdVar;
        zzg zzgVar;
        zzbn zzbnVarZzo2;
        boolean z13;
        zzbn zzbnVarZzo3;
        ?? r12;
        int iZzk;
        int i14;
        boolean z14;
        ?? Zzo;
        int iZze;
        ?? r7;
        zzbn zzbnVarZzo4;
        long j3;
        ?? r8;
        zzbn zzbnVarZzo5;
        ?? r9;
        boolean zZzo;
        ?? r10;
        ?? r11;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        zzbd zzbdVarZze;
        zzbl zzblVar;
        int i15;
        Object obj;
        zzap zzapVar2;
        Object obj2;
        int i16;
        long jZzV;
        long jZzV2;
        int iZze2;
        Object obj3;
        zzap zzapVar3;
        Object obj4;
        int iZza;
        long jZzv;
        long jZzv2;
        int i17 = i8;
        zzle zzleVar2 = this.zzU;
        this.zzU = zzleVar;
        boolean zEquals2 = zzleVar2.zza.equals(zzleVar.zza);
        zzbn zzbnVar = zzleVar2.zza;
        zzbn zzbnVar2 = zzleVar.zza;
        if (!zzbnVar2.zzo() || !zzbnVar.zzo()) {
            if (zzbnVar2.zzo() != zzbnVar.zzo()) {
                pair2 = new Pair(Boolean.TRUE, 3);
            } else if (zzbnVar.zze(zzbnVar.zzn(zzleVar2.zzb.zza, this.zzo).zzc, this.zza, 0L).zzb.equals(zzbnVar2.zze(zzbnVar2.zzn(zzleVar.zzb.zza, this.zzo).zzc, this.zza, 0L).zzb)) {
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
                if (z4) {
                    if (i17 == 0) {
                        z9 = true;
                        i11 = 1;
                        i17 = 0;
                    } else {
                        z9 = true;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                    boolean z15 = z9;
                    i10 = i17;
                    z8 = z15;
                } else {
                    z9 = false;
                }
                boolean z16 = z9;
                if (z9 && i17 == 1) {
                    z9 = z16;
                    i11 = 2;
                } else {
                    if (zEquals2) {
                        throw new IllegalStateException();
                    }
                    i11 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i11));
                boolean z17 = z9;
                i10 = i17;
                z8 = z17;
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzleVar.zza.zzo()) {
                    zzapVar = null;
                } else {
                    zzapVar = zzleVar.zza.zze(zzleVar.zza.zzn(zzleVar.zzb.zza, this.zzo).zzc, this.zza, 0L).zzd;
                }
                this.zzT = zzat.zza;
            } else {
                zzapVar = null;
            }
            if (zBooleanValue || !zzleVar2.zzj.equals(zzleVar.zzj)) {
                zzarVarZza = this.zzT.zza();
                list = zzleVar.zzj;
                for (i12 = 0; i12 < list.size(); i12++) {
                    zzavVar = (zzav) list.get(i12);
                    for (i13 = 0; i13 < zzavVar.zza(); i13++) {
                        zzavVar.zzb(i13).zza(zzarVarZza);
                    }
                }
                this.zzT = zzarVarZza.zzw();
            }
            zzbnVarZzo = zzo();
            if (zzbnVarZzo.zzo()) {
                zzatVarZzw = this.zzT;
            } else {
                zzap zzapVar4 = zzbnVarZzo.zze(zze(), this.zza, 0L).zzd;
                zzar zzarVarZza2 = this.zzT.zza();
                zzarVarZza2.zzb(zzapVar4.zzd);
                zzatVarZzw = zzarVarZza2.zzw();
            }
            zEquals = zzatVarZzw.equals(this.zzI);
            this.zzI = zzatVarZzw;
            if (zzleVar2.zzl != zzleVar.zzl) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zzleVar2.zze != zzleVar.zze) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || z10) {
                zzai();
            }
            if (zzleVar2.zzg != zzleVar.zzg) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!zEquals2) {
                this.zzm.zzd(0, new zzdm() { // from class: com.google.android.gms.internal.ads.zzim
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj5) {
                        int i18 = zzjs.zzd;
                        ((zzbe) obj5).zzq(zzleVar.zza, i7);
                    }
                });
            }
            if (z8) {
                zzblVar = new zzbl();
                if (zzleVar2.zza.zzo()) {
                    i15 = i9;
                    obj = null;
                    zzapVar2 = null;
                    obj2 = null;
                    i16 = -1;
                } else {
                    Object obj5 = zzleVar2.zzb.zza;
                    zzleVar2.zza.zzn(obj5, zzblVar);
                    int i18 = zzblVar.zzc;
                    int iZza2 = zzleVar2.zza.zza(obj5);
                    obj2 = obj5;
                    obj = zzleVar2.zza.zze(i18, this.zza, 0L).zzb;
                    zzapVar2 = this.zza.zzd;
                    i16 = iZza2;
                    i15 = i18;
                }
                if (i10 == 0) {
                    if (zzleVar2.zzb.zzb()) {
                        zzuq zzuqVar = zzleVar2.zzb;
                        jZzV = zzblVar.zzf(zzuqVar.zzb, zzuqVar.zzc);
                        jZzV2 = zzV(zzleVar2);
                    } else {
                        if (zzleVar2.zzb.zze != -1) {
                            jZzV = zzV(this.zzU);
                        } else {
                            jZzV = zzblVar.zzd;
                        }
                        jZzV2 = jZzV;
                    }
                } else if (zzleVar2.zzb.zzb()) {
                    jZzV = zzleVar2.zzs;
                    jZzV2 = zzV(zzleVar2);
                } else {
                    jZzV = zzleVar2.zzs;
                    jZzV2 = jZzV;
                }
                int i19 = zzen.zza;
                zzuq zzuqVar2 = zzleVar2.zzb;
                final zzbf zzbfVar = new zzbf(obj, i15, zzapVar2, obj2, i16, zzen.zzv(jZzV), zzen.zzv(jZzV2), zzuqVar2.zzb, zzuqVar2.zzc);
                iZze2 = zze();
                if (this.zzU.zza.zzo()) {
                    obj3 = null;
                    zzapVar3 = null;
                    obj4 = null;
                    iZza = -1;
                } else {
                    zzle zzleVar3 = this.zzU;
                    Object obj6 = zzleVar3.zzb.zza;
                    zzleVar3.zza.zzn(obj6, this.zzo);
                    iZza = this.zzU.zza.zza(obj6);
                    obj3 = this.zzU.zza.zze(iZze2, this.zza, 0L).zzb;
                    zzapVar3 = this.zza.zzd;
                    obj4 = obj6;
                }
                jZzv = zzen.zzv(j);
                if (this.zzU.zzb.zzb()) {
                    jZzv2 = zzen.zzv(zzV(this.zzU));
                } else {
                    jZzv2 = jZzv;
                }
                zzuq zzuqVar3 = this.zzU.zzb;
                final zzbf zzbfVar2 = new zzbf(obj3, iZze2, zzapVar3, obj4, iZza, jZzv, jZzv2, zzuqVar3.zzb, zzuqVar3.zzc);
                this.zzm.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzn(zzbfVar, zzbfVar2, i10);
                    }
                });
            } else {
                z11 = z11;
                z12 = z12;
            }
            if (zBooleanValue) {
                this.zzm.zzd(1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjg
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zze(zzapVar, iIntValue);
                    }
                });
            }
            if (zzleVar2.zzf != zzleVar.zzf) {
                this.zzm.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjh
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzl(zzleVar.zzf);
                    }
                });
                if (zzleVar.zzf != null) {
                    this.zzm.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzji
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            int i20 = zzjs.zzd;
                            ((zzbe) obj7).zzk(zzleVar.zzf);
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
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzr(zzleVar.zzi.zzd);
                    }
                });
            }
            if (!zEquals) {
                final zzat zzatVar = this.zzI;
                this.zzm.zzd(14, new zzdm() { // from class: com.google.android.gms.internal.ads.zzin
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzf(zzatVar);
                    }
                });
            }
            if (z12) {
                this.zzm.zzd(3, new zzdm() { // from class: com.google.android.gms.internal.ads.zzio
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzc(zzleVar.zzg);
                    }
                });
            }
            if (z11 || z10) {
                this.zzm.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzip
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        zzle zzleVar4 = zzleVar;
                        ((zzbe) obj7).zzm(zzleVar4.zzl, zzleVar4.zze);
                    }
                });
            }
            if (z11) {
                this.zzm.zzd(4, new zzdm() { // from class: com.google.android.gms.internal.ads.zziq
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzi(zzleVar.zze);
                    }
                });
            }
            if (z10 || zzleVar2.zzm != zzleVar.zzm) {
                this.zzm.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        zzle zzleVar4 = zzleVar;
                        ((zzbe) obj7).zzg(zzleVar4.zzl, zzleVar4.zzm);
                    }
                });
            }
            if (zzleVar2.zzn != zzleVar.zzn) {
                this.zzm.zzd(6, new zzdm() { // from class: com.google.android.gms.internal.ads.zzja
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzj(zzleVar.zzn);
                    }
                });
            }
            if (zzleVar2.zzj() != zzleVar.zzj()) {
                this.zzm.zzd(7, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjd
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzd(zzleVar.zzj());
                    }
                });
            }
            if (!zzleVar2.zzo.equals(zzleVar.zzo)) {
                this.zzm.zzd(12, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        int i20 = zzjs.zzd;
                        ((zzbe) obj7).zzh(zzleVar.zzo);
                    }
                });
            }
            zzbdVar = this.zzH;
            zzbh zzbhVar = this.zzg;
            zzbd zzbdVar2 = this.zzc;
            int i20 = zzen.zza;
            boolean zZzx = zzbhVar.zzx();
            zzgVar = (zzg) zzbhVar;
            zzbnVarZzo2 = zzgVar.zzo();
            if (zzbnVarZzo2.zzo() && zzbnVarZzo2.zze(zzgVar.zze(), zzgVar.zza, 0L).zzh) {
                z13 = true;
            } else {
                z13 = false;
            }
            zzbnVarZzo3 = zzgVar.zzo();
            if (zzbnVarZzo3.zzo()) {
                i14 = -1;
                r12 = 0;
                z14 = false;
            } else {
                int iZze3 = zzgVar.zze();
                zzgVar.zzi();
                zzgVar.zzw();
                r12 = 0;
                r12 = 0;
                iZzk = zzbnVarZzo3.zzk(iZze3, 0, false);
                i14 = -1;
                if (iZzk != -1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            Zzo = zzgVar.zzo();
            if (Zzo.zzo()) {
                r7 = r12;
            } else {
                iZze = zzgVar.zze();
                zzgVar.zzi();
                zzgVar.zzw();
                if (Zzo.zzj(iZze, r12, r12) != i14) {
                    r7 = 1;
                } else {
                    r7 = r12;
                }
            }
            zzbnVarZzo4 = zzgVar.zzo();
            if (!zzbnVarZzo4.zzo()) {
                j3 = 0;
                if (zzbnVarZzo4.zze(zzgVar.zze(), zzgVar.zza, 0L).zzb()) {
                    r8 = 1;
                }
                zzbnVarZzo5 = zzgVar.zzo();
                if (zzbnVarZzo5.zzo() && zzbnVarZzo5.zze(zzgVar.zze(), zzgVar.zza, j3).zzi) {
                    r9 = 1;
                } else {
                    r9 = r12;
                }
                zZzo = zzbhVar.zzo().zzo();
                ?? zzbcVar = new zzbc();
                zzbcVar.zzb(zzbdVar2);
                boolean z18 = !zZzx;
                zzbcVar.zzd(4, z18);
                if (z13 || zZzx) {
                    r10 = r12;
                } else {
                    r10 = 1;
                }
                zzbcVar.zzd(5, r10);
                if (z14 || zZzx) {
                    r11 = r12;
                } else {
                    r11 = 1;
                }
                zzbcVar.zzd(6, r11);
                if (!zZzo || (!(z14 || r8 == 0 || z13) || zZzx)) {
                    r13 = r12;
                } else {
                    r13 = 1;
                }
                zzbcVar.zzd(7, r13);
                if (r7 != 0 || zZzx) {
                    r14 = r12;
                } else {
                    r14 = 1;
                }
                zzbcVar.zzd(8, r14);
                if (!zZzo || ((r7 == 0 && (r8 == 0 || r9 == 0)) || zZzx)) {
                    r15 = r12;
                } else {
                    r15 = 1;
                }
                zzbcVar.zzd(9, r15);
                zzbcVar.zzd(10, z18);
                if (z13 || zZzx) {
                    r16 = r12;
                } else {
                    r16 = 1;
                }
                zzbcVar.zzd(11, r16);
                if (z13 || zZzx) {
                    r17 = r12;
                } else {
                    r17 = 1;
                }
                zzbcVar.zzd(12, r17);
                zzbdVarZze = zzbcVar.zze();
                this.zzH = zzbdVarZze;
                if (!zzbdVarZze.equals(zzbdVar)) {
                    this.zzm.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                        @Override // com.google.android.gms.internal.ads.zzdm
                        public final void zza(Object obj7) {
                            ((zzbe) obj7).zzb(this.zza.zzH);
                        }
                    });
                }
                this.zzm.zzc();
            }
            j3 = 0;
            r8 = r12;
            zzbnVarZzo5 = zzgVar.zzo();
            if (zzbnVarZzo5.zzo()) {
                r9 = r12;
            } else {
                r9 = r12;
            }
            zZzo = zzbhVar.zzo().zzo();
            ?? zzbcVar2 = new zzbc();
            zzbcVar2.zzb(zzbdVar2);
            boolean z19 = !zZzx;
            zzbcVar2.zzd(4, z19);
            if (z13) {
                r10 = r12;
            } else {
                r10 = r12;
            }
            zzbcVar2.zzd(5, r10);
            if (z14) {
                r11 = r12;
            } else {
                r11 = r12;
            }
            zzbcVar2.zzd(6, r11);
            if (zZzo) {
                r13 = r12;
            } else {
                r13 = r12;
            }
            zzbcVar2.zzd(7, r13);
            if (r7 != 0) {
                r14 = r12;
            } else {
                r14 = r12;
            }
            zzbcVar2.zzd(8, r14);
            if (zZzo) {
                r15 = r12;
            } else {
                r15 = r12;
            }
            zzbcVar2.zzd(9, r15);
            zzbcVar2.zzd(10, z19);
            if (z13) {
                r16 = r12;
            } else {
                r16 = r12;
            }
            zzbcVar2.zzd(11, r16);
            if (z13) {
                r17 = r12;
            } else {
                r17 = r12;
            }
            zzbcVar2.zzd(12, r17);
            zzbdVarZze = zzbcVar2.zze();
            this.zzH = zzbdVarZze;
            if (!zzbdVarZze.equals(zzbdVar)) {
                this.zzm.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj7) {
                        ((zzbe) obj7).zzb(this.zza.zzH);
                    }
                });
            }
            this.zzm.zzc();
        }
        pair2 = new Pair(Boolean.FALSE, -1);
        pair = pair2;
        i10 = i17;
        z8 = z4;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzleVar.zza.zzo()) {
                zzapVar = zzleVar.zza.zze(zzleVar.zza.zzn(zzleVar.zzb.zza, this.zzo).zzc, this.zza, 0L).zzd;
            } else {
                zzapVar = null;
            }
            this.zzT = zzat.zza;
        } else {
            zzapVar = null;
        }
        if (zBooleanValue) {
            zzarVarZza = this.zzT.zza();
            list = zzleVar.zzj;
            while (i12 < list.size()) {
                zzavVar = (zzav) list.get(i12);
                while (i13 < zzavVar.zza()) {
                    zzavVar.zzb(i13).zza(zzarVarZza);
                }
            }
            this.zzT = zzarVarZza.zzw();
        } else {
            zzarVarZza = this.zzT.zza();
            list = zzleVar.zzj;
            while (i12 < list.size()) {
                zzavVar = (zzav) list.get(i12);
                while (i13 < zzavVar.zza()) {
                    zzavVar.zzb(i13).zza(zzarVarZza);
                }
            }
            this.zzT = zzarVarZza.zzw();
        }
        zzbnVarZzo = zzo();
        if (zzbnVarZzo.zzo()) {
            zzatVarZzw = this.zzT;
        } else {
            zzap zzapVar5 = zzbnVarZzo.zze(zze(), this.zza, 0L).zzd;
            zzar zzarVarZza3 = this.zzT.zza();
            zzarVarZza3.zzb(zzapVar5.zzd);
            zzatVarZzw = zzarVarZza3.zzw();
        }
        zEquals = zzatVarZzw.equals(this.zzI);
        this.zzI = zzatVarZzw;
        if (zzleVar2.zzl != zzleVar.zzl) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (zzleVar2.zze != zzleVar.zze) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            zzai();
        } else {
            zzai();
        }
        if (zzleVar2.zzg != zzleVar.zzg) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!zEquals2) {
            this.zzm.zzd(0, new zzdm() { // from class: com.google.android.gms.internal.ads.zzim
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj7) {
                    int i110 = zzjs.zzd;
                    ((zzbe) obj7).zzq(zzleVar.zza, i7);
                }
            });
        }
        if (z8) {
            zzblVar = new zzbl();
            if (zzleVar2.zza.zzo()) {
                Object obj7 = zzleVar2.zzb.zza;
                zzleVar2.zza.zzn(obj7, zzblVar);
                int i110 = zzblVar.zzc;
                int iZza3 = zzleVar2.zza.zza(obj7);
                obj2 = obj7;
                obj = zzleVar2.zza.zze(i110, this.zza, 0L).zzb;
                zzapVar2 = this.zza.zzd;
                i16 = iZza3;
                i15 = i110;
            } else {
                i15 = i9;
                obj = null;
                zzapVar2 = null;
                obj2 = null;
                i16 = -1;
            }
            if (i10 == 0) {
                if (zzleVar2.zzb.zzb()) {
                    zzuq zzuqVar4 = zzleVar2.zzb;
                    jZzV = zzblVar.zzf(zzuqVar4.zzb, zzuqVar4.zzc);
                    jZzV2 = zzV(zzleVar2);
                } else {
                    if (zzleVar2.zzb.zze != -1) {
                        jZzV = zzV(this.zzU);
                    } else {
                        jZzV = zzblVar.zzd;
                    }
                    jZzV2 = jZzV;
                }
            } else if (zzleVar2.zzb.zzb()) {
                jZzV = zzleVar2.zzs;
                jZzV2 = zzV(zzleVar2);
            } else {
                jZzV = zzleVar2.zzs;
                jZzV2 = jZzV;
            }
            int i111 = zzen.zza;
            zzuq zzuqVar5 = zzleVar2.zzb;
            final zzbf zzbfVar3 = new zzbf(obj, i15, zzapVar2, obj2, i16, zzen.zzv(jZzV), zzen.zzv(jZzV2), zzuqVar5.zzb, zzuqVar5.zzc);
            iZze2 = zze();
            if (this.zzU.zza.zzo()) {
                zzle zzleVar4 = this.zzU;
                Object obj8 = zzleVar4.zzb.zza;
                zzleVar4.zza.zzn(obj8, this.zzo);
                iZza = this.zzU.zza.zza(obj8);
                obj3 = this.zzU.zza.zze(iZze2, this.zza, 0L).zzb;
                zzapVar3 = this.zza.zzd;
                obj4 = obj8;
            } else {
                obj3 = null;
                zzapVar3 = null;
                obj4 = null;
                iZza = -1;
            }
            jZzv = zzen.zzv(j);
            if (this.zzU.zzb.zzb()) {
                jZzv2 = zzen.zzv(zzV(this.zzU));
            } else {
                jZzv2 = jZzv;
            }
            zzuq zzuqVar6 = this.zzU.zzb;
            final zzbf zzbfVar4 = new zzbf(obj3, iZze2, zzapVar3, obj4, iZza, jZzv, jZzv2, zzuqVar6.zzb, zzuqVar6.zzc);
            this.zzm.zzd(11, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjf
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzn(zzbfVar3, zzbfVar4, i10);
                }
            });
        } else {
            z11 = z11;
            z12 = z12;
        }
        if (zBooleanValue) {
            this.zzm.zzd(1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjg
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zze(zzapVar, iIntValue);
                }
            });
        }
        if (zzleVar2.zzf != zzleVar.zzf) {
            this.zzm.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjh
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzl(zzleVar.zzf);
                }
            });
            if (zzleVar.zzf != null) {
                this.zzm.zzd(10, new zzdm() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj9) {
                        int i21 = zzjs.zzd;
                        ((zzbe) obj9).zzk(zzleVar.zzf);
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
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzr(zzleVar.zzi.zzd);
                }
            });
        }
        if (!zEquals) {
            final zzat zzatVar2 = this.zzI;
            this.zzm.zzd(14, new zzdm() { // from class: com.google.android.gms.internal.ads.zzin
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzf(zzatVar2);
                }
            });
        }
        if (z12) {
            this.zzm.zzd(3, new zzdm() { // from class: com.google.android.gms.internal.ads.zzio
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzc(zzleVar.zzg);
                }
            });
        }
        if (z11) {
            this.zzm.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzip
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    zzle zzleVar5 = zzleVar;
                    ((zzbe) obj9).zzm(zzleVar5.zzl, zzleVar5.zze);
                }
            });
        } else {
            this.zzm.zzd(-1, new zzdm() { // from class: com.google.android.gms.internal.ads.zzip
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    zzle zzleVar5 = zzleVar;
                    ((zzbe) obj9).zzm(zzleVar5.zzl, zzleVar5.zze);
                }
            });
        }
        if (z11) {
            this.zzm.zzd(4, new zzdm() { // from class: com.google.android.gms.internal.ads.zziq
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzi(zzleVar.zze);
                }
            });
        }
        if (z10) {
            this.zzm.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    zzle zzleVar5 = zzleVar;
                    ((zzbe) obj9).zzg(zzleVar5.zzl, zzleVar5.zzm);
                }
            });
        } else {
            this.zzm.zzd(5, new zzdm() { // from class: com.google.android.gms.internal.ads.zziu
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    zzle zzleVar5 = zzleVar;
                    ((zzbe) obj9).zzg(zzleVar5.zzl, zzleVar5.zzm);
                }
            });
        }
        if (zzleVar2.zzn != zzleVar.zzn) {
            this.zzm.zzd(6, new zzdm() { // from class: com.google.android.gms.internal.ads.zzja
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzj(zzleVar.zzn);
                }
            });
        }
        if (zzleVar2.zzj() != zzleVar.zzj()) {
            this.zzm.zzd(7, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjd
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzd(zzleVar.zzj());
                }
            });
        }
        if (!zzleVar2.zzo.equals(zzleVar.zzo)) {
            this.zzm.zzd(12, new zzdm() { // from class: com.google.android.gms.internal.ads.zzje
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    int i21 = zzjs.zzd;
                    ((zzbe) obj9).zzh(zzleVar.zzo);
                }
            });
        }
        zzbdVar = this.zzH;
        zzbh zzbhVar2 = this.zzg;
        zzbd zzbdVar3 = this.zzc;
        int i21 = zzen.zza;
        boolean zZzx2 = zzbhVar2.zzx();
        zzgVar = (zzg) zzbhVar2;
        zzbnVarZzo2 = zzgVar.zzo();
        if (zzbnVarZzo2.zzo()) {
            z13 = false;
        } else {
            z13 = false;
        }
        zzbnVarZzo3 = zzgVar.zzo();
        if (zzbnVarZzo3.zzo()) {
            i14 = -1;
            r12 = 0;
            z14 = false;
        } else {
            int iZze4 = zzgVar.zze();
            zzgVar.zzi();
            zzgVar.zzw();
            r12 = 0;
            r12 = 0;
            iZzk = zzbnVarZzo3.zzk(iZze4, 0, false);
            i14 = -1;
            if (iZzk != -1) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        Zzo = zzgVar.zzo();
        if (Zzo.zzo()) {
            r7 = r12;
        } else {
            iZze = zzgVar.zze();
            zzgVar.zzi();
            zzgVar.zzw();
            if (Zzo.zzj(iZze, r12, r12) != i14) {
                r7 = 1;
            } else {
                r7 = r12;
            }
        }
        zzbnVarZzo4 = zzgVar.zzo();
        if (!zzbnVarZzo4.zzo()) {
            j3 = 0;
            if (zzbnVarZzo4.zze(zzgVar.zze(), zzgVar.zza, 0L).zzb()) {
                r8 = 1;
            }
            zzbnVarZzo5 = zzgVar.zzo();
            if (zzbnVarZzo5.zzo()) {
                r9 = r12;
            } else {
                r9 = r12;
            }
            zZzo = zzbhVar2.zzo().zzo();
            ?? zzbcVar3 = new zzbc();
            zzbcVar3.zzb(zzbdVar3);
            boolean z110 = !zZzx2;
            zzbcVar3.zzd(4, z110);
            if (z13) {
                r10 = r12;
            } else {
                r10 = r12;
            }
            zzbcVar3.zzd(5, r10);
            if (z14) {
                r11 = r12;
            } else {
                r11 = r12;
            }
            zzbcVar3.zzd(6, r11);
            if (zZzo) {
                r13 = r12;
            } else {
                r13 = r12;
            }
            zzbcVar3.zzd(7, r13);
            if (r7 != 0) {
                r14 = r12;
            } else {
                r14 = r12;
            }
            zzbcVar3.zzd(8, r14);
            if (zZzo) {
                r15 = r12;
            } else {
                r15 = r12;
            }
            zzbcVar3.zzd(9, r15);
            zzbcVar3.zzd(10, z110);
            if (z13) {
                r16 = r12;
            } else {
                r16 = r12;
            }
            zzbcVar3.zzd(11, r16);
            if (z13) {
                r17 = r12;
            } else {
                r17 = r12;
            }
            zzbcVar3.zzd(12, r17);
            zzbdVarZze = zzbcVar3.zze();
            this.zzH = zzbdVarZze;
            if (!zzbdVarZze.equals(zzbdVar)) {
                this.zzm.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                    @Override // com.google.android.gms.internal.ads.zzdm
                    public final void zza(Object obj9) {
                        ((zzbe) obj9).zzb(this.zza.zzH);
                    }
                });
            }
            this.zzm.zzc();
        }
        j3 = 0;
        r8 = r12;
        zzbnVarZzo5 = zzgVar.zzo();
        if (zzbnVarZzo5.zzo()) {
            r9 = r12;
        } else {
            r9 = r12;
        }
        zZzo = zzbhVar2.zzo().zzo();
        ?? zzbcVar4 = new zzbc();
        zzbcVar4.zzb(zzbdVar3);
        boolean z111 = !zZzx2;
        zzbcVar4.zzd(4, z111);
        if (z13) {
            r10 = r12;
        } else {
            r10 = r12;
        }
        zzbcVar4.zzd(5, r10);
        if (z14) {
            r11 = r12;
        } else {
            r11 = r12;
        }
        zzbcVar4.zzd(6, r11);
        if (zZzo) {
            r13 = r12;
        } else {
            r13 = r12;
        }
        zzbcVar4.zzd(7, r13);
        if (r7 != 0) {
            r14 = r12;
        } else {
            r14 = r12;
        }
        zzbcVar4.zzd(8, r14);
        if (zZzo) {
            r15 = r12;
        } else {
            r15 = r12;
        }
        zzbcVar4.zzd(9, r15);
        zzbcVar4.zzd(10, z111);
        if (z13) {
            r16 = r12;
        } else {
            r16 = r12;
        }
        zzbcVar4.zzd(11, r16);
        if (z13) {
            r17 = r12;
        } else {
            r17 = r12;
        }
        zzbcVar4.zzd(12, r17);
        zzbdVarZze = zzbcVar4.zze();
        this.zzH = zzbdVarZze;
        if (!zzbdVarZze.equals(zzbdVar)) {
            this.zzm.zzd(13, new zzdm() { // from class: com.google.android.gms.internal.ads.zzjc
                @Override // com.google.android.gms.internal.ads.zzdm
                public final void zza(Object obj9) {
                    ((zzbe) obj9).zzb(this.zza.zzH);
                }
            });
        }
        this.zzm.zzc();
    }

    private final void zzai() {
        int iZzg = zzg();
        if (iZzg != 2 && iZzg != 3) {
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
            String strJ = L.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzQ) {
                throw new IllegalStateException(strJ);
            }
            zzdq.zzg("ExoPlayerImpl", strJ, this.zzR ? null : new IllegalStateException());
            this.zzR = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzA() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzen.zzb;
        String strZza = zzaq.zza();
        StringBuilder sbL = k.l("Release ", hexString, " [AndroidXMedia3/1.6.0-beta01] [", str, "] [");
        sbL.append(strZza);
        sbL.append("]");
        zzdq.zze("ExoPlayerImpl", sbL.toString());
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
        zzle zzleVarZzY = zzY(zzleVar, 1);
        this.zzU = zzleVarZzY;
        zzle zzleVarZzb = zzleVarZzY.zzb(zzleVarZzY.zzb);
        this.zzU = zzleVarZzb;
        zzleVarZzb.zzq = zzleVarZzb.zzs;
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
        List listSingletonList = Collections.singletonList(zzusVar);
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
        for (int i8 = 0; i8 < listSingletonList.size(); i8++) {
            zzlb zzlbVar = new zzlb((zzus) listSingletonList.get(i8), this.zzq);
            arrayList.add(zzlbVar);
            this.zzp.add(i8, new zzjq(zzlbVar.zzb, zzlbVar.zza));
        }
        this.zzY = this.zzY.zzg(0, arrayList.size());
        zzlk zzlkVar = new zzlk(this.zzp, this.zzY);
        if (!zzlkVar.zzo() && zzlkVar.zzc() < 0) {
            throw new zzaa(zzlkVar, -1, -9223372036854775807L);
        }
        int iZzg = zzlkVar.zzg(false);
        zzle zzleVarZzZ = zzZ(this.zzU, zzlkVar, zzX(zzlkVar, iZzg, -9223372036854775807L));
        int i9 = zzleVarZzZ.zze;
        if (iZzg != -1 && i9 != 1) {
            i9 = 4;
            if (!zzlkVar.zzo() && iZzg < zzlkVar.zzc()) {
                i9 = 2;
            }
        }
        zzle zzleVarZzY = zzY(zzleVarZzZ, i9);
        this.zzl.zzu(arrayList, iZzg, zzen.zzs(-9223372036854775807L), this.zzY);
        if (!this.zzU.zzb.zza.equals(zzleVarZzY.zzb.zza) && !this.zzU.zza.zzo()) {
            z4 = true;
        }
        zzah(zzleVarZzY, 0, z4, 4, zzU(zzleVarZzY), -1, false);
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
            zzle zzleVarZzY = this.zzU;
            int i9 = zzleVarZzY.zze;
            if (i9 == 3 || (i9 == 4 && !zzbnVar.zzo())) {
                zzleVarZzY = zzY(this.zzU, 2);
            }
            int iZze = zze();
            zzle zzleVarZzZ = zzZ(zzleVarZzY, zzbnVar, zzX(zzbnVar, i7, j));
            this.zzl.zzm(zzbnVar, i7, zzen.zzs(j));
            zzah(zzleVarZzZ, 0, true, 1, zzU(zzleVarZzZ), iZze, false);
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
        int iZzR = zzR(this.zzU);
        if (iZzR == -1) {
            return 0;
        }
        return iZzR;
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
        zzbn zzbnVarZzo = zzo();
        if (zzbnVarZzo.zzo()) {
            return -9223372036854775807L;
        }
        return zzen.zzv(zzbnVarZzo.zze(zze(), this.zza, 0L).zzm);
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
        zzle zzleVarZze = zzleVar.zze(null);
        zzle zzleVarZzY = zzY(zzleVarZze, true != zzleVarZze.zza.zzo() ? 2 : 4);
        this.zzC++;
        this.zzl.zzl();
        zzah(zzleVarZzY, 1, false, 5, -9223372036854775807L, -1, false);
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
        final float fMax = Math.max(0.0f, Math.min(f7, 1.0f));
        if (this.zzO == fMax) {
            return;
        }
        this.zzO = fMax;
        this.zzx.zza();
        this.zzl.zzq(fMax);
        zzdp zzdpVar = this.zzm;
        zzdpVar.zzd(22, new zzdm() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzdm
            public final void zza(Object obj) {
                int i8 = zzjs.zzd;
                ((zzbe) obj).zzt(fMax);
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
        zzfwh zzfwhVarZzn = zzfwh.zzn();
        long j = this.zzU.zzs;
        zzfwh.zzl(zzfwhVarZzn);
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
