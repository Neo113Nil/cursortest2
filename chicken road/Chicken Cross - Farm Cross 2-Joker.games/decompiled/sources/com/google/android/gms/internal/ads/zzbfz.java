package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbfz implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private final AtomicBoolean zzd = new AtomicBoolean(true);
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    zzbfz() {
    }

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdxs) it.next()).zzf(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }
        this.zze = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzbfy zzbfyVar = new zzbfy(this);
        this.zzh = zzbfyVar;
        zzgbpVar.postDelayed(zzbfyVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean andSet = this.zzd.getAndSet(true);
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdxs) it.next()).zze(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
            if (andSet) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzbga) it2.next()).zza(true);
                    } catch (Exception e2) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbK)).longValue();
        this.zzi = true;
    }

    public final void zzb(zzbga zzbgaVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbgaVar);
        }
    }

    public final void zzc(zzbga zzbgaVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbgaVar);
        }
    }

    public final Activity zzd() {
        return this.zza;
    }

    public final Context zze() {
        return this.zzb;
    }

    final /* synthetic */ Object zzf() {
        return this.zzc;
    }

    final /* synthetic */ AtomicBoolean zzg() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    final /* synthetic */ List zzi() {
        return this.zzf;
    }

    public final void zzj(zzdxs zzdxsVar) {
        synchronized (this.zzc) {
            this.zzg.add(zzdxsVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.zza = null;
            }
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdxs) it.next()).zzg(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }
    }
}
