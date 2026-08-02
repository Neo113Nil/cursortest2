package com.datadog.android.internal.time;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/datadog/android/internal/time/BaseTimeProvider;", "Lcom/datadog/android/internal/time/TimeProvider;", "<init>", "()V", "", "getDeviceElapsedRealtimeMillis", "()J", "getDeviceElapsedTimeNanos", "getDeviceTimestampMillis"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseTimeProvider implements com.datadog.android.internal.time.TimeProvider {
    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getDeviceTimestampMillis() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getDeviceElapsedTimeNanos() {
        return java.lang.System.nanoTime();
    }

    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getDeviceElapsedRealtimeMillis() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
