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

/* loaded from: classes.dex */
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
        zzaug zzs;
        synchronized (zzaug.class) {
            zzfmd zzc = zzfme.zzc();
            zzc.zza(zzaqvVar.zzf());
            zzc.zzg(zzaqvVar.zzi());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzc.zzh(), z4);
        }
        return zzs;
    }

    public static void zzj(zzaug zzaugVar) {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfno zzu = zzaugVar.zzu(1);
        if (zzu != null) {
            String zzk = zzu.zza().zzk();
            str2 = zzu.zza().zzj();
            str = zzk;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzfnt zza2 = zzfmm.zza(zzaugVar.zzc, 1, zzaugVar.zzr, str, str2, "1", zzaugVar.zzh);
                byte[] bArr = zza2.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzaugVar.zzh.zzd(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzaxj zzb2 = zzaxj.zzb(zzgvy.zzv(bArr, 0, length), zzgwq.zza());
                        if (!zzb2.zzc().zzk().isEmpty() && !zzb2.zzc().zzj().isEmpty() && zzb2.zzd().zzA().length != 0) {
                            zzfno zzu2 = zzaugVar.zzu(1);
                            if (zzu2 != null) {
                                zzaxm zza3 = zzu2.zza();
                                if (zzb2.zzc().zzk().equals(zza3.zzk())) {
                                    if (!zzb2.zzc().zzj().equals(zza3.zzj())) {
                                    }
                                }
                            }
                            zzfnv zzfnvVar = zzaugVar.zzj;
                            int i7 = zza2.zzc;
                            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcy)).booleanValue()) {
                                zza = zzaugVar.zzd.zza(zzb2, zzfnvVar);
                            } else if (i7 == 3) {
                                zza = zzaugVar.zze.zza(zzb2);
                            } else {
                                if (i7 == 4) {
                                    zza = zzaugVar.zze.zzb(zzb2, zzfnvVar);
                                }
                                zzaugVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (zza) {
                                zzfno zzu3 = zzaugVar.zzu(1);
                                if (zzu3 != null) {
                                    if (zzaugVar.zzf.zzc(zzu3)) {
                                        zzaugVar.zzq = true;
                                    }
                                    zzaugVar.zza = System.currentTimeMillis() / 1000;
                                }
                            }
                            zzaugVar.zzh.zzd(4009, System.currentTimeMillis() - currentTimeMillis);
                        }
                        zzaugVar.zzh.zzd(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        zzaugVar.zzh.zzd(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzgxv e7) {
                zzaugVar.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e7);
            }
            zzaugVar.zzk.countDown();
        } catch (Throwable th) {
            zzaugVar.zzk.countDown();
            throw th;
        }
    }

    private static synchronized zzaug zzs(Context context, Executor executor, zzfme zzfmeVar, boolean z4) {
        zzaug zzaugVar;
        zzfme zzfmeVar2;
        zzavj zzavjVar;
        synchronized (zzaug.class) {
            try {
                if (zzb == null) {
                    zzfmc zza = zzfmc.zza(context, executor, z4);
                    zzbbp zzbbpVar = zzbby.zzdB;
                    C0254t c0254t = C0254t.f2723d;
                    zzauu zzc = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() ? zzauu.zzc(context) : null;
                    zzawa zzd = ((Boolean) c0254t.f2726c.zzb(zzbby.zzdC)).booleanValue() ? zzawa.zzd(context, executor) : null;
                    zzavs zzavsVar = ((Boolean) c0254t.f2726c.zzb(zzbby.zzcQ)).booleanValue() ? new zzavs() : null;
                    if (((Boolean) c0254t.f2726c.zzb(zzbby.zzcY)).booleanValue()) {
                        zzavjVar = new zzavj();
                        zzfmeVar2 = zzfmeVar;
                    } else {
                        zzfmeVar2 = zzfmeVar;
                        zzavjVar = null;
                    }
                    zzfmt zzc2 = zzfmt.zzc(context, executor, zza, zzfmeVar2);
                    zzavk zzavkVar = new zzavk(context);
                    zzavl zzavlVar = new zzavl(zzfmeVar, zzc2, new zzavy(context, zzavkVar), zzavkVar, zzc, zzd, zzavsVar, zzavjVar);
                    int zzb2 = zzfnc.zzb(context, zza);
                    zzflx zzflxVar = new zzflx();
                    zzaug zzaugVar2 = new zzaug(context, zza, new zzfnp(context, zzb2), new zzfnw(context, zzb2, new zzaud(zza), ((Boolean) c0254t.f2726c.zzb(zzbby.zzcA)).booleanValue()), new zzfny(context, zzavlVar, zza, zzflxVar), zzavlVar, executor, zzflxVar, zzb2, zzd, zzavsVar, zzavjVar);
                    zzb = zzaugVar2;
                    zzaugVar2.zzm();
                    zzb.zzp();
                }
                zzaugVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaugVar;
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
        zzfmf zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza2 = zza.zza(context, null, str, view, activity);
        this.zzh.zzf(LoggerBatchProcessor.FLUSH_AFTER_MS, System.currentTimeMillis() - currentTimeMillis, zza2, null);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcQ)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfmf zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
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
        zzfmf zza = this.zzf.zza();
        if (zza == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzk(MotionEvent motionEvent) {
        zzfmf zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
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
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f7 * f8, f9 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain);
        obtain.recycle();
        float f10 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f7 * f10, f9 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain2);
        obtain2.recycle();
        float f11 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i9, 1, f7 * f11, f9 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain3);
        obtain3.recycle();
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfno zzu = zzu(1);
        if (zzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzu)) {
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
                    zzfno zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzfnc.zza(this.zzr)) {
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
