package com.datadog.android.internal.time;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/datadog/android/internal/time/DefaultTimeProvider;", "Lcom/datadog/android/internal/time/BaseTimeProvider;", "<init>", "()V", "", "getServerOffsetMillis", "()J", "getServerOffsetNanos", "getServerTimestampMillis"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultTimeProvider extends com.datadog.android.internal.time.BaseTimeProvider {
    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getServerOffsetMillis() {
        return 0L;
    }

    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getServerOffsetNanos() {
        return 0L;
    }

    @Override // com.datadog.android.internal.time.TimeProvider
    public final long getServerTimestampMillis() {
        return getDeviceTimestampMillis();
    }
}
