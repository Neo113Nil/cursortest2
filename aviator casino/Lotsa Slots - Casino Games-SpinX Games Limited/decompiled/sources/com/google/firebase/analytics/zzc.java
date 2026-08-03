package com.google.firebase.analytics;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
final class zzc implements java.util.concurrent.Callable {
    final /* synthetic */ com.google.firebase.analytics.FirebaseAnalytics zza;

    zzc(com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics) {
        java.util.Objects.requireNonNull(firebaseAnalytics);
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        return this.zza.zza().zzH();
    }
}
