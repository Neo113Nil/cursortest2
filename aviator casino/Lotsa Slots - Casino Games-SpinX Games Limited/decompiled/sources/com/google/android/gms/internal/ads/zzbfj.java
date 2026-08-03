package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbfj implements android.app.Application.ActivityLifecycleCallbacks {
    private android.app.Activity zza;
    private android.content.Context zzb;
    private java.lang.Runnable zzh;
    private long zzj;
    private final java.lang.Object zzc = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean(true);
    private boolean zze = false;
    private final java.util.List zzf = new java.util.ArrayList();
    private final java.util.List zzg = new java.util.ArrayList();
    private boolean zzi = false;

    zzbfj() {
    }

    private final void zzk(android.app.Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((com.google.android.gms.internal.ads.zzdwu) it.next()).zzf(activity);
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }
        this.zze = true;
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
        com.google.android.gms.internal.ads.zzbfi zzbfiVar = new com.google.android.gms.internal.ads.zzbfi(this);
        this.zzh = zzbfiVar;
        zzgamVar.postDelayed(zzbfiVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd.getAndSet(true);
        if (this.zzh != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzh);
        }
        synchronized (this.zzc) {
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((com.google.android.gms.internal.ads.zzdwu) it.next()).zze(activity);
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
            if (z) {
                java.util.Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((com.google.android.gms.internal.ads.zzbfk) it2.next()).zza(true);
                    } catch (java.lang.Exception e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
                    }
                }
            } else {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    public final void zza(android.app.Application application, android.content.Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof android.app.Activity) {
            zzk((android.app.Activity) context);
        }
        this.zzb = application;
        this.zzj = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbF)).longValue();
        this.zzi = true;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzbfk zzbfkVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbfkVar);
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbfk zzbfkVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbfkVar);
        }
    }

    public final android.app.Activity zzd() {
        return this.zza;
    }

    public final android.content.Context zze() {
        return this.zzb;
    }

    final /* synthetic */ java.lang.Object zzf() {
        return this.zzc;
    }

    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzg() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    final /* synthetic */ java.util.List zzi() {
        return this.zzf;
    }

    public final void zzj(com.google.android.gms.internal.ads.zzdwu zzdwuVar) {
        synchronized (this.zzc) {
            this.zzg.add(zzdwuVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        synchronized (this.zzc) {
            android.app.Activity activity2 = this.zza;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.zza = null;
            }
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((com.google.android.gms.internal.ads.zzdwu) it.next()).zzg(activity);
                } catch (java.lang.Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
                }
            }
        }
    }
}
