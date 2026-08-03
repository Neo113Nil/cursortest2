package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class StarRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.StarRating> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.StarRating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.StarRating fromBundle;
            fromBundle = com.google.android.exoplayer2.StarRating.fromBundle(bundle);
            return fromBundle;
        }
    };
    private static final int FIELD_MAX_STARS = 1;
    private static final int FIELD_STAR_RATING = 2;
    private static final int MAX_STARS_DEFAULT = 5;
    private static final int TYPE = 2;
    private final int maxStars;
    private final float starRating;

    public StarRating(int i) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        this.maxStars = i;
        this.starRating = -1.0f;
    }

    public StarRating(int i, float f) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i > 0, "maxStars must be a positive integer");
        com.google.android.exoplayer2.util.Assertions.checkArgument(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.maxStars = i;
        this.starRating = f;
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.starRating != -1.0f;
    }

    public int getMaxStars() {
        return this.maxStars;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.maxStars), java.lang.Float.valueOf(this.starRating));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.exoplayer2.StarRating)) {
            return false;
        }
        com.google.android.exoplayer2.StarRating starRating = (com.google.android.exoplayer2.StarRating) obj;
        return this.maxStars == starRating.maxStars && this.starRating == starRating.starRating;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(keyForField(0), 2);
        bundle.putInt(keyForField(1), this.maxStars);
        bundle.putFloat(keyForField(2), this.starRating);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.StarRating fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 2);
        int i = bundle.getInt(keyForField(1), 5);
        float f = bundle.getFloat(keyForField(2), -1.0f);
        if (f == -1.0f) {
            return new com.google.android.exoplayer2.StarRating(i);
        }
        return new com.google.android.exoplayer2.StarRating(i, f);
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
