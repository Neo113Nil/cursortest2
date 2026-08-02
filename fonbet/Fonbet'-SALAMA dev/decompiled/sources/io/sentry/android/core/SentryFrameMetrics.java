package io.sentry.android.core;

/* loaded from: classes2.dex */
final class SentryFrameMetrics {
    private int frozenFrameCount;
    private long frozenFrameDelayNanos;
    private int slowFrameCount;
    private long slowFrameDelayNanos;
    private long totalDurationNanos;

    public SentryFrameMetrics() {
    }

    public void addFrame(long j, long j3, boolean z4, boolean z7) {
        this.totalDurationNanos += j;
        if (z7) {
            this.frozenFrameDelayNanos += j3;
            this.frozenFrameCount++;
        } else if (z4) {
            this.slowFrameDelayNanos += j3;
            this.slowFrameCount++;
        }
    }

    public void clear() {
        this.slowFrameCount = 0;
        this.slowFrameDelayNanos = 0L;
        this.frozenFrameCount = 0;
        this.frozenFrameDelayNanos = 0L;
        this.totalDurationNanos = 0L;
    }

    public boolean containsValidData() {
        return this.slowFrameCount >= 0 && this.slowFrameDelayNanos >= 0 && this.frozenFrameCount >= 0 && this.frozenFrameDelayNanos >= 0 && this.totalDurationNanos >= 0;
    }

    public SentryFrameMetrics diffTo(SentryFrameMetrics sentryFrameMetrics) {
        return new SentryFrameMetrics(this.slowFrameCount - sentryFrameMetrics.slowFrameCount, this.slowFrameDelayNanos - sentryFrameMetrics.slowFrameDelayNanos, this.frozenFrameCount - sentryFrameMetrics.frozenFrameCount, this.frozenFrameDelayNanos - sentryFrameMetrics.frozenFrameDelayNanos, this.totalDurationNanos - sentryFrameMetrics.totalDurationNanos);
    }

    public SentryFrameMetrics duplicate() {
        return new SentryFrameMetrics(this.slowFrameCount, this.slowFrameDelayNanos, this.frozenFrameCount, this.frozenFrameDelayNanos, this.totalDurationNanos);
    }

    public int getFrozenFrameCount() {
        return this.frozenFrameCount;
    }

    public long getFrozenFrameDelayNanos() {
        return this.frozenFrameDelayNanos;
    }

    public int getSlowFrameCount() {
        return this.slowFrameCount;
    }

    public long getSlowFrameDelayNanos() {
        return this.slowFrameDelayNanos;
    }

    public int getSlowFrozenFrameCount() {
        return this.slowFrameCount + this.frozenFrameCount;
    }

    public long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public SentryFrameMetrics(int i7, long j, int i8, long j3, long j7) {
        this.slowFrameCount = i7;
        this.slowFrameDelayNanos = j;
        this.frozenFrameCount = i8;
        this.frozenFrameDelayNanos = j3;
        this.totalDurationNanos = j7;
    }
}
