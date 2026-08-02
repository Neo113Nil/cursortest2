package androidx.media3.common;

/* loaded from: classes7.dex */
public final class ThumbRating extends androidx.media3.common.Rating {
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    public ThumbRating() {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = false;
    }

    public ThumbRating(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // androidx.media3.common.Rating
    public final boolean isRated() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isThumbsUp() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.common.ThumbRating)) {
            return false;
        }
        androidx.media3.common.ThumbRating thumbRating = (androidx.media3.common.ThumbRating) obj;
        return this.getHighSpeedVideoFpsRanges == thumbRating.getHighSpeedVideoFpsRanges && this.getHighResolutionOutputSizeshNQ4ISI == thumbRating.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.media3.common.Rating
    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(getHighSpeedVideoSizes, 3);
        bundle.putBoolean(Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        bundle.putBoolean(getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        return bundle;
    }

    public static androidx.media3.common.ThumbRating fromBundle(android.os.Bundle bundle) {
        com.google.common.base.Preconditions.checkArgument(bundle.getInt(getHighSpeedVideoSizes, -1) == 3);
        if (bundle.getBoolean(Camera2StreamConfigurationMap, false)) {
            return new androidx.media3.common.ThumbRating(bundle.getBoolean(getHighSpeedVideoFpsRangesFor, false));
        }
        return new androidx.media3.common.ThumbRating();
    }
}
