package com.datadog.android.core.internal.time;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/internal/time/TimeProvider;", "Lcom/datadog/android/api/context/TimeInfo;", "composeTimeInfo", "(Lcom/datadog/android/internal/time/TimeProvider;)Lcom/datadog/android/api/context/TimeInfo;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeProviderExtKt {
    public static final com.datadog.android.api.context.TimeInfo composeTimeInfo(com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        long deviceTimestampMillis = timeProvider.getDeviceTimestampMillis();
        long serverTimestampMillis = timeProvider.getServerTimestampMillis();
        long j = serverTimestampMillis - deviceTimestampMillis;
        return new com.datadog.android.api.context.TimeInfo(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(deviceTimestampMillis), java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(serverTimestampMillis), java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j), j);
    }
}
