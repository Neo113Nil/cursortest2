package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class TimestampAdjuster {
    public static final long MODE_NO_OFFSET = Long.MAX_VALUE;
    public static final long MODE_SHARED = 9223372036854775806L;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.ThreadLocal<java.lang.Long> getHighSpeedVideoFpsRanges = new java.lang.ThreadLocal<>();
    private long getHighSpeedVideoFpsRangesFor;
    private long getHighSpeedVideoSizes;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public final void sharedInitializeOrWait(boolean z, long j, long j2) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        synchronized (this) {
            com.google.common.base.Preconditions.checkState(this.getHighSpeedVideoSizes == MODE_SHARED);
            if (isInitialized()) {
                return;
            }
            if (z) {
                this.getHighSpeedVideoFpsRanges.set(java.lang.Long.valueOf(j));
            } else {
                long j3 = 0;
                long j4 = j2;
                while (!isInitialized()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        com.google.common.base.Preconditions.checkState(j4 > 0);
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        wait(j4);
                        j3 += android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j3 >= j2 && !isInitialized()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("TimestampAdjuster failed to initialize in ");
                            sb.append(j2);
                            sb.append(" milliseconds");
                            throw new java.util.concurrent.TimeoutException(sb.toString());
                        }
                        j4 = j2 - j3;
                    }
                }
            }
        }
    }

    public final long getFirstSampleTimestampUs() {
        long j;
        synchronized (this) {
            j = this.getHighSpeedVideoSizes;
            if (j == Long.MAX_VALUE || j == MODE_SHARED) {
                j = androidx.media3.common.C.TIME_UNSET;
            }
        }
        return j;
    }

    public final long getLastAdjustedTimestampUs() {
        long firstSampleTimestampUs;
        synchronized (this) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                firstSampleTimestampUs = j + this.getHighSpeedVideoFpsRangesFor;
            } else {
                firstSampleTimestampUs = getFirstSampleTimestampUs();
            }
        }
        return firstSampleTimestampUs;
    }

    public final long getTimestampOffsetUs() {
        long j;
        synchronized (this) {
            j = this.getHighSpeedVideoFpsRangesFor;
        }
        return j;
    }

    public final void reset(long j) {
        synchronized (this) {
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRangesFor = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.C.TIME_UNSET;
        }
    }

    public final long adjustTsTimestamp(long j) {
        synchronized (this) {
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                long usToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = (4294967296L + usToNonWrappedPts) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (java.lang.Math.abs(j4 - usToNonWrappedPts) < java.lang.Math.abs(j - usToNonWrappedPts)) {
                    j = j4;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j));
        }
    }

    public final long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        synchronized (this) {
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                long usToNonWrappedPts = usToNonWrappedPts(j2);
                long j3 = usToNonWrappedPts / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= usToNonWrappedPts) {
                    j = j4;
                }
            }
            return adjustSampleTimestamp(ptsToUs(j));
        }
    }

    public final long adjustSampleTimestamp(long j) {
        synchronized (this) {
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            if (!isInitialized()) {
                long j2 = this.getHighSpeedVideoSizes;
                if (j2 == MODE_SHARED) {
                    j2 = ((java.lang.Long) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRanges.get())).longValue();
                }
                this.getHighSpeedVideoFpsRangesFor = j2 - j;
                notifyAll();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            return j + this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public final boolean isInitialized() {
        boolean z;
        synchronized (this) {
            z = this.getHighSpeedVideoFpsRangesFor != androidx.media3.common.C.TIME_UNSET;
        }
        return z;
    }

    public static long ptsToUs(long j) {
        return androidx.media3.common.util.Util.scaleLargeTimestamp(j, 1000000L, 90000L);
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % 8589934592L;
    }

    public static long usToNonWrappedPts(long j) {
        return androidx.media3.common.util.Util.scaleLargeTimestamp(j, 90000L, 1000000L);
    }
}
