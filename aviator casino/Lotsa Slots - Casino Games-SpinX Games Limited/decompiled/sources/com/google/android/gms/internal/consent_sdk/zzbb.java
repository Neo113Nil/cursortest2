package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzbb implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.consent_sdk.zzbe zza;
    private final android.app.Activity zzb;

    public zzbb(com.google.android.gms.internal.consent_sdk.zzbe zzbeVar, android.app.Activity activity) {
        java.util.Objects.requireNonNull(zzbeVar);
        this.zza = zzbeVar;
        this.zzb = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        this.zza.zzc.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        com.google.android.gms.internal.consent_sdk.zzbe zzbeVar = this.zza;
        if (zzbeVar.zzi == null || !zzbeVar.zza) {
            return;
        }
        zzbeVar.zzi.setOwnerActivity(activity);
        if (zzbeVar.zzd != null) {
            zzbeVar.zzd.zza(activity);
        }
        com.google.android.gms.internal.consent_sdk.zzbb zzbbVar = (com.google.android.gms.internal.consent_sdk.zzbb) zzbeVar.zzn.getAndSet(null);
        if (zzbbVar != null) {
            zzbbVar.zzb();
            com.google.android.gms.internal.consent_sdk.zzbb zzbbVar2 = new com.google.android.gms.internal.consent_sdk.zzbb(zzbeVar, activity);
            zzbeVar.zzc.registerActivityLifecycleCallbacks(zzbbVar2);
            zzbeVar.zzn.set(zzbbVar2);
        }
        if (zzbeVar.zzi != null) {
            zzbeVar.zzi.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (activity != this.zzb) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            com.google.android.gms.internal.consent_sdk.zzbe zzbeVar = this.zza;
            if (zzbeVar.zza && zzbeVar.zzi != null) {
                zzbeVar.zzi.dismiss();
                return;
            }
        }
        this.zza.zzh(new com.google.android.gms.internal.consent_sdk.zzg(3, "Activity is destroyed."));
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}
