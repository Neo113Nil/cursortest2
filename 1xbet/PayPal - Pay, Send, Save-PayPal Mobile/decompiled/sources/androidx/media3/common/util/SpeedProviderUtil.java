package androidx.media3.common.util;

/* loaded from: classes7.dex */
public class SpeedProviderUtil {
    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(androidx.media3.common.audio.SpeedProvider speedProvider, long j) {
        long j2 = 0;
        double d = 0.0d;
        while (j2 < j) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j2);
            if (nextSpeedChangeTimeUs == androidx.media3.common.C.TIME_UNSET) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            com.google.common.base.Preconditions.checkState(nextSpeedChangeTimeUs > j2);
            d += (java.lang.Math.min(nextSpeedChangeTimeUs, j) - j2) / speedProvider.getSpeed(j2);
            j2 = nextSpeedChangeTimeUs;
        }
        return (long) java.lang.Math.floor(d);
    }

    public static float getSampleAlignedSpeed(androidx.media3.common.audio.SpeedProvider speedProvider, long j, int i) {
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        return speedProvider.getSpeed(androidx.media3.common.util.Util.sampleCountToDurationUs(j, i));
    }

    public static long getNextSpeedChangeSamplePosition(androidx.media3.common.audio.SpeedProvider speedProvider, long j, int i) {
        com.google.common.base.Preconditions.checkArgument(j >= 0);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(androidx.media3.common.util.Util.sampleCountToDurationUs(j, i));
        if (nextSpeedChangeTimeUs == androidx.media3.common.C.TIME_UNSET) {
            return -1L;
        }
        return androidx.media3.common.util.Util.durationUsToSampleCount(nextSpeedChangeTimeUs, i);
    }
}
