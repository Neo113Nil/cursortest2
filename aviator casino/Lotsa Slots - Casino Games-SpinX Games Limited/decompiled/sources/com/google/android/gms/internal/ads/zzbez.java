package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbez implements com.google.android.gms.internal.ads.zzbfd {
    final /* synthetic */ android.app.Activity zza;

    zzbez(com.google.android.gms.internal.ads.zzbfe zzbfeVar, android.app.Activity activity) {
        this.zza = activity;
        java.util.Objects.requireNonNull(zzbfeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final void zza(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
