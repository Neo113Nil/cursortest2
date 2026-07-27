package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbav implements zzbay {
    private static zzbav zzb;
    private final Context zzc;
    private final zzfzs zzd;
    private final zzfzz zze;
    private final zzgab zzf;
    private final zzbca zzg;
    private final zzfyi zzh;
    private final Executor zzi;
    private final zzbei zzj;
    private final zzfzy zzk;
    private final zzbcp zzm;
    private final zzbch zzn;
    private final zzbby zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzbav(Context context, zzfyi zzfyiVar, zzfzs zzfzsVar, zzfzz zzfzzVar, zzgab zzgabVar, zzbca zzbcaVar, Executor executor, zzfyd zzfydVar, zzbei zzbeiVar, zzbcp zzbcpVar, zzbch zzbchVar, zzbby zzbbyVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfyiVar;
        this.zzd = zzfzsVar;
        this.zze = zzfzzVar;
        this.zzf = zzgabVar;
        this.zzg = zzbcaVar;
        this.zzi = executor;
        this.zzj = zzbeiVar;
        this.zzm = zzbcpVar;
        this.zzn = zzbchVar;
        this.zzo = zzbbyVar;
        this.zzr = false;
        this.zzk = new zzbat(this, zzfydVar);
    }

    public static synchronized zzbav zza(Context context, zzaxc zzaxcVar, boolean z) {
        zzbav zzs;
        synchronized (zzbav.class) {
            zzfyj zzh = zzfyk.zzh();
            zzh.zza(zzaxcVar.zza());
            zzh.zzb(zzaxcVar.zzb());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzh.zzh(), z);
        }
        return zzs;
    }

    private static synchronized zzbav zzs(Context context, Executor executor, zzfyk zzfykVar, boolean z) {
        zzbav zzbavVar;
        synchronized (zzbav.class) {
            if (zzb == null) {
                zzfyi zza = zzfyi.zza(context, executor, z);
                zzbbj zza2 = zzbbj.zza(context);
                zzbcp zza3 = zzbcp.zza(context, executor);
                zzbch zzbchVar = new zzbch();
                zzbby zzbbyVar = new zzbby();
                zzfyy zza4 = zzfyy.zza(context, executor, zza, zzfykVar);
                zzbbz zzbbzVar = new zzbbz(context);
                zzbca zzbcaVar = new zzbca(zzfykVar, zza4, new zzbcn(context, zzbbzVar), zzbbzVar, zza2, zza3, zzbchVar, zzbbyVar);
                zzbei zzb2 = zzfzf.zzb(context, zza);
                zzfyd zzfydVar = new zzfyd();
                zzbav zzbavVar2 = new zzbav(context, zza, new zzfzs(context, zzb2), new zzfzz(context, zzb2, new zzbas(zza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdq)).booleanValue()), new zzgab(context, zzbcaVar, zza, zzfydVar, false), zzbcaVar, executor, zzfydVar, zzb2, zza3, zzbchVar, zzbbyVar);
                zzb = zzbavVar2;
                zzbavVar2.zzc();
                zzb.zzm();
            }
            zzbavVar = zzb;
        }
        return zzbavVar;
    }

    private final zzfzr zzt(int i) {
        if (zzfzf.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdo)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfzr zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zza(zzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzd(MotionEvent motionEvent) {
        zzfyl zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            try {
                zzb2.zzd(null, motionEvent);
            } catch (zzgaa e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznG)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzc();
        zzm();
        zzfyl zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zzb2.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzo.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzb(context, view);
        zzm();
        zzfyl zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb3 = zzb2.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - currentTimeMillis, zzb3, null);
        return zzb3;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        this.zzm.zzb();
        this.zzn.zza();
        zzm();
        zzfyl zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zzb2.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - currentTimeMillis, zza, null);
        return zza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfzr zzc = this.zzf.zzc();
                if ((zzc == null || zzc.zze(3600L)) && zzfzf.zza(this.zzj)) {
                    this.zzi.execute(new zzbau(this));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        if (r3.zza().zzb().equals(r5.zzb()) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzn() {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfzr zzt = zzt(1);
        if (zzt != null) {
            String zza2 = zzt.zza().zza();
            str2 = zzt.zza().zzb();
            str = zza2;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbei zzbeiVar = this.zzj;
                zzfyi zzfyiVar = this.zzh;
                zzfzw zza3 = zzfyr.zza(context, 1, zzbeiVar, str, str2, "1", zzfyiVar);
                byte[] bArr = zza3.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfyiVar.zzb(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzbek zzd = zzbek.zzd(zziei.zzt(bArr, 0, length), zziew.zzb());
                        if (!zzd.zza().zza().isEmpty()) {
                            if (!zzd.zza().zzb().isEmpty()) {
                                if (zzd.zzc().zzA().length != 0) {
                                    zzfzr zzt2 = zzt(1);
                                    if (zzt2 != null) {
                                        zzber zza4 = zzt2.zza();
                                        if (zza4 != null) {
                                            if (zzd.zza().zza().equals(zza4.zza())) {
                                            }
                                        }
                                    }
                                    zzfzy zzfzyVar = this.zzk;
                                    int i = zza3.zzc;
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdo)).booleanValue()) {
                                        zza = this.zzd.zza(zzd, zzfzyVar);
                                    } else if (i == 3) {
                                        zza = this.zze.zzb(zzd);
                                    } else {
                                        if (i == 4) {
                                            zza = this.zze.zza(zzd, zzfzyVar);
                                        }
                                        this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (zza) {
                                        zzfzr zzt3 = zzt(1);
                                        if (zzt3 != null) {
                                            if (this.zzf.zza(zzt3)) {
                                                this.zzr = true;
                                            }
                                            this.zza = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.zzh.zzb(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzige e) {
                this.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ zzfyi zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z) {
        this.zzq = z;
    }
}
