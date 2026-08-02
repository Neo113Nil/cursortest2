package androidx.media3.common;

/* loaded from: classes7.dex */
public final class HeartRating extends androidx.media3.common.Rating {
    private final boolean getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    public HeartRating() {
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    public HeartRating(boolean z) {
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // androidx.media3.common.Rating
    public final boolean isRated() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isHeart() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.common.HeartRating)) {
            return false;
        }
        androidx.media3.common.HeartRating heartRating = (androidx.media3.common.HeartRating) obj;
        return this.getHighSpeedVideoFpsRangesFor == heartRating.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == heartRating.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.media3.common.Rating
    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(getHighSpeedVideoSizes, 0);
        bundle.putBoolean(getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        bundle.putBoolean(Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        return bundle;
    }

    public static androidx.media3.common.HeartRating fromBundle(android.os.Bundle bundle) {
        com.google.common.base.Preconditions.checkArgument(bundle.getInt(getHighSpeedVideoSizes, -1) == 0);
        if (bundle.getBoolean(getHighResolutionOutputSizeshNQ4ISI, false)) {
            return new androidx.media3.common.HeartRating(bundle.getBoolean(Camera2StreamConfigurationMap, false));
        }
        return new androidx.media3.common.HeartRating();
    }
}
