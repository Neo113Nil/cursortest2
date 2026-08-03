package com.unity3d.ads.core.extensions;

/* compiled from: TimestampExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0003¨\u0006\u0005"}, d2 = {"fromMillis", "Lcom/google/protobuf/Timestamp;", "millis", "", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimestampExtensionsKt {
    public static final com.google.protobuf.Timestamp fromMillis(long j) {
        long j2 = 1000;
        com.google.protobuf.Timestamp build = com.google.protobuf.Timestamp.newBuilder().setSeconds(j / j2).setNanos((int) ((j % j2) * 1000000)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "newBuilder().setSeconds(…000000).toInt())).build()");
        return build;
    }

    public static final long duration(long j) {
        return java.lang.System.nanoTime() - j;
    }
}
