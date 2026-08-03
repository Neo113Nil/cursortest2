package com.google.firebase.analytics;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.5.0 */
/* loaded from: classes3.dex */
final class zza extends java.util.concurrent.ThreadPoolExecutor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics, int i, int i2, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
        java.util.Objects.requireNonNull(firebaseAnalytics);
    }
}
