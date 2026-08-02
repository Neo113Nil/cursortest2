package androidx.media3.common;

/* loaded from: classes7.dex */
public final class PercentageRating extends androidx.media3.common.Rating {
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private final float getHighResolutionOutputSizeshNQ4ISI;

    public PercentageRating() {
        this.getHighResolutionOutputSizeshNQ4ISI = -1.0f;
    }

    public PercentageRating(float f) {
        com.google.common.base.Preconditions.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    @Override // androidx.media3.common.Rating
    public final boolean isRated() {
        return this.getHighResolutionOutputSizeshNQ4ISI != -1.0f;
    }

    public final float getPercent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Float.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.media3.common.PercentageRating) && this.getHighResolutionOutputSizeshNQ4ISI == ((androidx.media3.common.PercentageRating) obj).getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.media3.common.Rating
    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(getHighSpeedVideoSizes, 1);
        bundle.putFloat(getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        return bundle;
    }

    public static androidx.media3.common.PercentageRating fromBundle(android.os.Bundle bundle) {
        com.google.common.base.Preconditions.checkArgument(bundle.getInt(getHighSpeedVideoSizes, -1) == 1);
        float f = bundle.getFloat(getHighSpeedVideoFpsRangesFor, -1.0f);
        return f == -1.0f ? new androidx.media3.common.PercentageRating() : new androidx.media3.common.PercentageRating(f);
    }
}
