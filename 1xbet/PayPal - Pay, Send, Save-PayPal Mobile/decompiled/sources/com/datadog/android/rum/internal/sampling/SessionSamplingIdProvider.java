package com.datadog.android.rum.internal.sampling;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/datadog/android/rum/internal/sampling/SessionSamplingIdProvider;", "", "<init>", "()V", "", "sessionId", "Lkotlin/ULong;", "provideId-I7RO_PI", "(Ljava/lang/String;)J", "provideId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionSamplingIdProvider {
    public static final com.datadog.android.rum.internal.sampling.SessionSamplingIdProvider INSTANCE = new com.datadog.android.rum.internal.sampling.SessionSamplingIdProvider();

    private SessionSamplingIdProvider() {
    }

    /* renamed from: provideId-I7RO_PI, reason: not valid java name */
    public final long m10023provideIdI7RO_PI(java.lang.String sessionId) {
        kotlin.ULong uLongOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.lastOrNull(kotlin.text.StringsKt.split$default((java.lang.CharSequence) sessionId, new char[]{'-'}, false, 0, 6, (java.lang.Object) null));
        if (str == null || (uLongOrNull = kotlin.text.UStringsKt.toULongOrNull(str, 16)) == null) {
            return 0L;
        }
        return uLongOrNull.getGetHighSpeedVideoFpsRanges();
    }
}
