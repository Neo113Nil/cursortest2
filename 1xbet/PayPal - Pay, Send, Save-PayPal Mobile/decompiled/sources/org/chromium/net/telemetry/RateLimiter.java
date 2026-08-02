package org.chromium.net.telemetry;

/* loaded from: classes5.dex */
public final class RateLimiter {
    private final int Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private long getHighSpeedVideoSizes = Long.MIN_VALUE;

    public RateLimiter(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Expect sample rate to be > 0 sample(s) per second");
        }
        this.Camera2StreamConfigurationMap = i;
    }

    public final boolean tryAcquire() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (this.getHighSpeedVideoSizes + 1000 <= elapsedRealtime) {
                this.getHighSpeedVideoFpsRanges = 1;
                this.getHighSpeedVideoSizes = elapsedRealtime;
                return true;
            }
            int i = this.getHighSpeedVideoFpsRanges;
            if (i >= this.Camera2StreamConfigurationMap) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges = i + 1;
            return true;
        }
    }
}
