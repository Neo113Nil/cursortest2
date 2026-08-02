package androidx.media3.common;

/* loaded from: classes7.dex */
public abstract class Rating {
    static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(0);

    public abstract boolean isRated();

    public abstract android.os.Bundle toBundle();

    Rating() {
    }

    public static androidx.media3.common.Rating fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(getHighSpeedVideoSizes, -1);
        if (i == 0) {
            return androidx.media3.common.HeartRating.fromBundle(bundle);
        }
        if (i == 1) {
            return androidx.media3.common.PercentageRating.fromBundle(bundle);
        }
        if (i == 2) {
            return androidx.media3.common.StarRating.fromBundle(bundle);
        }
        if (i == 3) {
            return androidx.media3.common.ThumbRating.fromBundle(bundle);
        }
        throw new java.lang.IllegalArgumentException("Unknown RatingType: ".concat(java.lang.String.valueOf(i)));
    }
}
