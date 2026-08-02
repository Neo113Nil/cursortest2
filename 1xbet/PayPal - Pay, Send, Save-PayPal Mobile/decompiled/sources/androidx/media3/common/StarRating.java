package androidx.media3.common;

/* loaded from: classes7.dex */
public final class StarRating extends androidx.media3.common.Rating {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    public StarRating(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "maxStars must be a positive integer");
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = -1.0f;
    }

    public StarRating(int i, float f) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "maxStars must be a positive integer");
        com.google.common.base.Preconditions.checkArgument(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    @Override // androidx.media3.common.Rating
    public final boolean isRated() {
        return this.getHighSpeedVideoFpsRangesFor != -1.0f;
    }

    public final int getMaxStars() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final float getStarRating() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Float.valueOf(this.getHighSpeedVideoFpsRangesFor));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.common.StarRating)) {
            return false;
        }
        androidx.media3.common.StarRating starRating = (androidx.media3.common.StarRating) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == starRating.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == starRating.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.media3.common.Rating
    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(getHighSpeedVideoSizes, 2);
        bundle.putInt(getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        bundle.putFloat(Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        return bundle;
    }

    public static androidx.media3.common.StarRating fromBundle(android.os.Bundle bundle) {
        com.google.common.base.Preconditions.checkArgument(bundle.getInt(getHighSpeedVideoSizes, -1) == 2);
        int i = bundle.getInt(getHighSpeedVideoFpsRanges, 5);
        float f = bundle.getFloat(Camera2StreamConfigurationMap, -1.0f);
        if (f == -1.0f) {
            return new androidx.media3.common.StarRating(i);
        }
        return new androidx.media3.common.StarRating(i, f);
    }
}
