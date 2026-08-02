package androidx.media3.common;

/* loaded from: classes7.dex */
public final class PlaybackParameters {
    public static final androidx.media3.common.PlaybackParameters DEFAULT = new androidx.media3.common.PlaybackParameters(1.0f);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private final int getHighSpeedVideoFpsRangesFor;
    public final float pitch;
    public final float speed;

    public PlaybackParameters(float f) {
        this(f, 1.0f);
    }

    public PlaybackParameters(float f, float f2) {
        com.google.common.base.Preconditions.checkArgument(f > 0.0f);
        com.google.common.base.Preconditions.checkArgument(f2 > 0.0f);
        this.speed = f;
        this.pitch = f2;
        this.getHighSpeedVideoFpsRangesFor = java.lang.Math.round(f * 1000.0f);
    }

    public final long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * this.getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.media3.common.PlaybackParameters withSpeed(float f) {
        return new androidx.media3.common.PlaybackParameters(f, this.pitch);
    }

    public final androidx.media3.common.PlaybackParameters withPitch(float f) {
        return new androidx.media3.common.PlaybackParameters(this.speed, f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.PlaybackParameters playbackParameters = (androidx.media3.common.PlaybackParameters) obj;
        return this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToRawIntBits(this.speed) + 527) * 31) + java.lang.Float.floatToRawIntBits(this.pitch);
    }

    public final java.lang.String toString() {
        return androidx.media3.common.util.Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", java.lang.Float.valueOf(this.speed), java.lang.Float.valueOf(this.pitch));
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(getHighSpeedVideoFpsRanges, this.speed);
        bundle.putFloat(getHighSpeedVideoSizes, this.pitch);
        return bundle;
    }

    public static androidx.media3.common.PlaybackParameters fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.PlaybackParameters(bundle.getFloat(getHighSpeedVideoFpsRanges, 1.0f), bundle.getFloat(getHighSpeedVideoSizes, 1.0f));
    }
}
