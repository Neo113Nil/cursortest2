package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbbb implements com.google.android.gms.internal.ads.zzbbg {
    final /* synthetic */ android.app.Activity zza;

    zzbbb(com.google.android.gms.internal.ads.zzbbh zzbbhVar, android.app.Activity activity) {
        this.zza = activity;
        java.util.Objects.requireNonNull(zzbbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbg
    public final void zza(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
