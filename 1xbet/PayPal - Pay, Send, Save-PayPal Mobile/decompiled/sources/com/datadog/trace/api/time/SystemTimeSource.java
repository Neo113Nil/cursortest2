package com.datadog.trace.api.time;

/* loaded from: classes3.dex */
public class SystemTimeSource implements com.datadog.trace.api.time.TimeSource {
    public static final com.datadog.trace.api.time.TimeSource INSTANCE = new com.datadog.trace.api.time.SystemTimeSource();

    private SystemTimeSource() {
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getNanoTicks() {
        return java.lang.System.nanoTime();
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getCurrentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getCurrentTimeMicros() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(getCurrentTimeMillis());
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getCurrentTimeNanos() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(getCurrentTimeMillis());
    }
}
