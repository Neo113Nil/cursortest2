package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class Size {
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;
    public static final androidx.media3.common.util.Size UNKNOWN = new androidx.media3.common.util.Size(-1, -1);
    public static final androidx.media3.common.util.Size ZERO = new androidx.media3.common.util.Size(0, 0);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public Size(int i, int i2) {
        com.google.common.base.Preconditions.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    public final int getWidth() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getHeight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.media3.common.util.Size) {
            androidx.media3.common.util.Size size = (androidx.media3.common.util.Size) obj;
            if (this.Camera2StreamConfigurationMap == size.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == size.getHighSpeedVideoFpsRangesFor) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("x");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.Camera2StreamConfigurationMap;
        return i ^ ((i2 << 16) | (i2 >>> 16));
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        return bundle;
    }

    public static androidx.media3.common.util.Size fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.util.Size(bundle.getInt(getHighSpeedVideoFpsRanges, -1), bundle.getInt(getHighResolutionOutputSizeshNQ4ISI, -1));
    }
}
