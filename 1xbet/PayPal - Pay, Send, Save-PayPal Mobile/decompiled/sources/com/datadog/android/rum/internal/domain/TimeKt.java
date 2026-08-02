package com.datadog.android.rum.internal.domain;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003"}, d2 = {"", "Lcom/datadog/android/rum/internal/domain/Time;", "asTime", "(J)Lcom/datadog/android/rum/internal/domain/Time;", "asTimeNs"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeKt {
    public static final com.datadog.android.rum.internal.domain.Time asTime(long j) {
        com.datadog.android.rum.internal.domain.Time time = new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null);
        return new com.datadog.android.rum.internal.domain.Time(j, java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j - time.getTimestamp()) + time.getNanoTime());
    }

    public static final com.datadog.android.rum.internal.domain.Time asTimeNs(long j) {
        com.datadog.android.rum.internal.domain.Time time = new com.datadog.android.rum.internal.domain.Time(0L, 0L, 3, null);
        return new com.datadog.android.rum.internal.domain.Time(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j - time.getNanoTime()) + time.getTimestamp(), j);
    }
}
