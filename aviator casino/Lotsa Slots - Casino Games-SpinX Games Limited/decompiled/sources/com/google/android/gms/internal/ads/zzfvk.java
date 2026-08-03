package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzfvk implements android.app.Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private com.google.android.gms.internal.ads.zzfvj zzc;

    private final boolean zza() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzb();
    }

    private final void zzh(boolean z) {
        if (this.zza != z) {
            this.zza = z;
            if (this.zzb) {
                zzc(z);
                com.google.android.gms.internal.ads.zzfvj zzfvjVar = this.zzc;
                if (zzfvjVar != null) {
                    zzfvjVar.zzd(z);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        zzh(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        zzh(zza());
    }

    protected boolean zzb() {
        return false;
    }

    protected void zzc(boolean z) {
    }

    public final void zzd(android.content.Context context) {
        if (context instanceof android.app.Application) {
            ((android.app.Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze() {
        this.zzb = true;
        boolean zza = zza();
        this.zza = zza;
        zzc(zza);
    }

    public final void zzf() {
        this.zzb = false;
        this.zzc = null;
    }

    public final void zzg(com.google.android.gms.internal.ads.zzfvj zzfvjVar) {
        this.zzc = zzfvjVar;
    }
}
