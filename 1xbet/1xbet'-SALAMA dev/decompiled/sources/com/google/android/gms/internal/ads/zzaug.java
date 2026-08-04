package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import io.sentry.logger.LoggerBatchProcessor;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class zzaug implements zzauj {
    private static zzaug zzb;
    private final Context zzc;
    private final zzfnp zzd;
    private final zzfnw zze;
    private final zzfny zzf;
    private final zzavl zzg;
    private final zzfmc zzh;
    private final Executor zzi;
    private final zzfnv zzj;
    private final zzawa zzl;
    private final zzavs zzm;
    private final zzavj zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzaug(Context context, zzfmc zzfmcVar, zzfnp zzfnpVar, zzfnw zzfnwVar, zzfny zzfnyVar, zzavl zzavlVar, Executor executor, zzflx zzflxVar, int i7, zzawa zzawaVar, zzavs zzavsVar, zzavj zzavjVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfmcVar;
        this.zzd = zzfnpVar;
        this.zze = zzfnwVar;
        this.zzf = zzfnyVar;
        this.zzg = zzavlVar;
        this.zzi = executor;
        this.zzr = i7;
        this.zzl = zzawaVar;
        this.zzm = zzavsVar;
        this.zzn = zzavjVar;
        this.zzq = false;
        this.zzj = new zzaue(this, zzflxVar);
    }

    public static synchronized zzaug zza(Context context, zzaqv zzaqvVar, boolean z4) {
        zzfmd zzfmdVarZzc;
        zzfmdVarZzc = zzfme.zzc();
        zzfmdVarZzc.zza(zzaqvVar.zzf());
        zzfmdVarZzc.zzg(zzaqvVar.zzi());
        return zzs(context, Executors.newCachedThreadPool(), zzfmdVarZzc.zzh(), z4);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x009d, zzgxv -> 0x00a0, TryCatch #0 {zzgxv -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x009d, zzgxv -> 0x00a0, TryCatch #0 {zzgxv -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    public static void zzj(zzaug zzaugVar) {
        String str;
        String strZzj;
        int length;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfno zzfnoVarZzu = zzaugVar.zzu(1);
        if (zzfnoVarZzu != null) {
            String strZzk = zzfnoVarZzu.zza().zzk();
            strZzj = zzfnoVarZzu.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                zzfnt zzfntVarZza = zzfmm.zza(zzaugVar.zzc, 1, zzaugVar.zzr, str, strZzj, "1", zzaugVar.zzh);
                byte[] bArr = zzfntVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzaugVar.zzh.zzd(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzaxj zzaxjVarZzb = zzaxj.zzb(zzgvy.zzv(bArr, 0, length), zzgwq.zza());
                        if (zzaxjVarZzb.zzc().zzk().isEmpty() || zzaxjVarZzb.zzc().zzj().isEmpty() || zzaxjVarZzb.zzd().zzA().length == 0) {
                            zzaugVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfno zzfnoVarZzu2 = zzaugVar.zzu(1);
                            if (zzfnoVarZzu2 != null) {
                                zzaxm zzaxmVarZza = zzfnoVarZzu2.zza();
                                if (zzaxjVarZzb.zzc().zzk().equals(zzaxmVarZza.zzk()) && zzaxjVarZzb.zzc().zzj().equals(zzaxmVarZza.zzj())) {
                                    zzaugVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            }
                            zzfnv zzfnvVar = zzaugVar.zzj;
                            int i7 = zzfntVarZza.zzc;
                            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcy)).booleanValue()) {
                                zZza = zzaugVar.zzd.zza(zzaxjVarZzb, zzfnvVar);
                            } else if (i7 == 3) {
                                zZza = zzaugVar.zze.zza(zzaxjVarZzb);
                            } else if (i7 == 4) {
                                zZza = zzaugVar.zze.zzb(zzaxjVarZzb, zzfnvVar);
                            } else {
                                zzaugVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfno zzfnoVarZzu3 = zzaugVar.zzu(1);
                                if (zzfnoVarZzu3 != null) {
                                    if (zzaugVar.zzf.zzc(zzfnoVarZzu3)) {
                                        zzaugVar.zzq = true;
                                    }
                                    zzaugVar.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                zzaugVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzaugVar.zzh.zzd(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzgxv e7) {
                zzaugVar.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e7);
            }
        } finally {
            zzaugVar.zzk.countDown();
        }
    }

    private static synchronized zzaug zzs(Context context, Executor executor, zzfme zzfmeVar, boolean z4) {
        try {
            if (zzb == null) {
                zzfmc zzfmcVarZza = zzfmc.zza(context, executor, z4);
                zzbbp zzbbpVar = zzbby.zzdB;
                C0254t c0254t = C0254t.f2723d;
                zzauu zzauuVarZzc = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() ? zzauu.zzc(context) : null;
                zzawa zzawaVarZzd = ((Boolean) c0254t.f2726c.zzb(zzbby.zzdC)).booleanValue() ? zzawa.zzd(context, executor) : null;
                zzavs zzavsVar = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcQ)).booleanValue() ? new zzavs() : null;
                zzavj zzavjVar = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcY)).booleanValue() ? new zzavj() : null;
                zzfmt zzfmtVarZzc = zzfmt.zzc(context, executor, zzfmcVarZza, zzfmeVar);
                zzavk zzavkVar = new zzavk(context);
                zzavl zzavlVar = new zzavl(zzfmeVar, zzfmtVarZzc, new zzavy(context, zzavkVar), zzavkVar, zzauuVarZzc, zzawaVarZzd, zzavsVar, zzavjVar);
                int iZzb = zzfnc.zzb(context, zzfmcVarZza);
                zzflx zzflxVar = new zzflx();
                zzaug zzaugVar = new zzaug(context, zzfmcVarZza, new zzfnp(context, iZzb), new zzfnw(context, iZzb, new zzaud(zzfmcVarZza), ((Boolean) c0254t.f2726c.zzb(zzbby.zzcA)).booleanValue()), new zzfny(context, zzavlVar, zzfmcVarZza, zzflxVar), zzavlVar, executor, zzflxVar, iZzb, zzawaVarZzd, zzavsVar, zzavjVar);
                zzb = zzaugVar;
                zzaugVar.zzm();
                zzb.zzp();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final void zzt() {
        zzawa zzawaVar = this.zzl;
        if (zzawaVar != null) {
            zzawaVar.zzh();
        }
    }

    private final zzfno zzu(int i7) {
        if (zzfnc.zza(this.zzr)) {
            return ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcy)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcQ)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfmf zzfmfVarZza = this.zzf.zza();
        if (zzfmfVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfmfVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(LoggerBatchProcessor.FLUSH_AFTER_MS, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcQ)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfmf zzfmfVarZza = this.zzf.zza();
        if (zzfmfVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfmfVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcQ)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfmf zzfmfVarZza = this.zzf.zza();
        if (zzfmfVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfmfVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzk(MotionEvent motionEvent) {
        zzfmf zzfmfVarZza = this.zzf.zza();
        if (zzfmfVarZza != null) {
            try {
                zzfmfVarZza.zzd(null, motionEvent);
            } catch (zzfnx e7) {
                this.zzh.zzc(e7.zza(), -1L, e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzl(int i7, int i8, int i9) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlW)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f7 = i7;
        float f8 = displayMetrics.density;
        float f9 = i8;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f7 * f8, f9 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f10 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f7 * f10, f9 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f11 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i9, 1, f7 * f11, f9 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    public final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfno zzfnoVarZzu = zzu(1);
        if (zzfnoVarZzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfnoVarZzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavj zzavjVar = this.zzn;
        if (zzavjVar != null) {
            zzavjVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            try {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfno zzfnoVarZzb = this.zzf.zzb();
                    if ((zzfnoVarZzb == null || zzfnoVarZzb.zzd(3600L)) && zzfnc.zza(this.zzr)) {
                        this.zzi.execute(new zzauf(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
