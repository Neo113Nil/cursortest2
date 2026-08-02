package androidx.media3.common;

/* loaded from: classes7.dex */
public final class VideoSize {
    public final int height;
    public final float pixelWidthHeightRatio;

    @java.lang.Deprecated
    public final int unappliedRotationDegrees;
    public final int width;
    public static final androidx.media3.common.VideoSize UNKNOWN = new androidx.media3.common.VideoSize(0, 0);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(3);

    public VideoSize(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public VideoSize(int i, int i2, float f) {
        this.width = i;
        this.height = i2;
        this.unappliedRotationDegrees = 0;
        this.pixelWidthHeightRatio = f;
    }

    @java.lang.Deprecated
    public VideoSize(int i, int i2, int i3, float f) {
        this(i, i2, f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.VideoSize)) {
            return false;
        }
        androidx.media3.common.VideoSize videoSize = (androidx.media3.common.VideoSize) obj;
        return this.width == videoSize.width && this.height == videoSize.height && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio;
    }

    public final int hashCode() {
        int i = this.width;
        return ((((i + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31) + this.height) * 31) + java.lang.Float.floatToRawIntBits(this.pixelWidthHeightRatio);
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        int i = this.width;
        if (i != 0) {
            bundle.putInt(Camera2StreamConfigurationMap, i);
        }
        int i2 = this.height;
        if (i2 != 0) {
            bundle.putInt(getHighSpeedVideoFpsRanges, i2);
        }
        float f = this.pixelWidthHeightRatio;
        if (f != 1.0f) {
            bundle.putFloat(getHighSpeedVideoSizes, f);
        }
        return bundle;
    }

    public static androidx.media3.common.VideoSize fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.VideoSize(bundle.getInt(Camera2StreamConfigurationMap, 0), bundle.getInt(getHighSpeedVideoFpsRanges, 0), bundle.getFloat(getHighSpeedVideoSizes, 1.0f));
    }
}
