package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class x {
    public static final boolean a(com.moloco.sdk.internal.bidtoken.a aVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<this>");
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(aVar.a());
        long millis2 = java.util.concurrent.TimeUnit.MINUTES.toMillis(2L);
        boolean z = j >= millis - millis2;
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.bidtoken.w.g, "[sbt] currentTimeInMillis: " + j + ", expirationTimeMillis: " + millis + ", expiredThresholdMillis: " + millis2 + ", expired: " + z, false, 4, null);
        return z;
    }

    public static final boolean b(com.moloco.sdk.internal.bidtoken.a aVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<this>");
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(aVar.a());
        long millis2 = java.util.concurrent.TimeUnit.MINUTES.toMillis(15L);
        boolean z = !a(aVar, j) && millis - j <= millis2;
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.bidtoken.w.g, "[sbt] currentTimeInMillis: " + j + ", expiryTimeMillis: " + millis + ", nearExpiryThresholdMillis: " + millis2 + ", expiring: " + z, false, 4, null);
        return z;
    }
}
