package com.datadog.trace.core.util;

/* loaded from: classes3.dex */
public class SimpleRateLimiter {
    private final com.datadog.trace.api.time.TimeSource Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;

    public SimpleRateLimiter(int i) {
        this(i, com.datadog.trace.api.time.SystemTimeSource.INSTANCE);
    }

    protected SimpleRateLimiter(int i, com.datadog.trace.api.time.TimeSource timeSource) {
        this.Camera2StreamConfigurationMap = timeSource;
        this.getHighSpeedVideoSizes = timeSource.getNanoTicks();
        this.getHighSpeedVideoFpsRanges = java.lang.Math.max(1, i);
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public boolean tryAcquire() {
        long j;
        long j2;
        int i = 0;
        boolean z = true;
        do {
            j = this.getHighSpeedVideoFpsRangesFor.get();
            if (z) {
                i = (int) java.util.concurrent.TimeUnit.NANOSECONDS.toSeconds(this.Camera2StreamConfigurationMap.getNanoTicks() - this.getHighSpeedVideoSizes);
                z = false;
            }
            int i2 = (int) (androidx.collection.SieveCacheKt.NodeLinkMask & j);
            int i3 = i - ((int) (j >> 32));
            if (i3 <= 0) {
                int i4 = i2 + 1;
                if (i4 > this.getHighSpeedVideoFpsRanges || i4 < 0) {
                    return false;
                }
                j2 = i4 | ((r7 & Integer.MAX_VALUE) << 32);
                if (i3 < 0) {
                    z = true;
                }
            } else {
                j2 = ((i & Integer.MAX_VALUE) << 32) | 1;
            }
        } while (!this.getHighSpeedVideoFpsRangesFor.compareAndSet(j, j2));
        return true;
    }

    public int getCapacity() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
