package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbfe implements android.app.Application.ActivityLifecycleCallbacks {
    private final android.app.Application zza;
    private final java.lang.ref.WeakReference zzb;
    private boolean zzc = false;

    public zzbfe(android.app.Application application, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new java.lang.ref.WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        zza(new com.google.android.gms.internal.ads.zzbew(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzbfc(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzbez(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzbey(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        zza(new com.google.android.gms.internal.ads.zzbfb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzbex(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zza(new com.google.android.gms.internal.ads.zzbfa(this, activity));
    }

    protected final void zza(com.google.android.gms.internal.ads.zzbfd zzbfdVar) {
        try {
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzbfdVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzc) {
                    return;
                }
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (java.lang.Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while dispatching lifecycle callback.", e);
        }
    }
}
