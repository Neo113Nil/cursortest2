package com.datadog.trace.api.time;

/* loaded from: classes8.dex */
public class ControllableTimeSource implements com.datadog.trace.api.time.TimeSource {
    private long getHighSpeedVideoSizes = 0;

    public void advance(long j) {
        this.getHighSpeedVideoSizes += j;
    }

    public void set(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getNanoTicks() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getCurrentTimeMillis() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.getHighSpeedVideoSizes);
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getCurrentTimeMicros() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMicros(this.getHighSpeedVideoSizes);
    }

    @Override // com.datadog.trace.api.time.TimeSource
    public long getCurrentTimeNanos() {
        return this.getHighSpeedVideoSizes;
    }
}
