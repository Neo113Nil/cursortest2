package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class HeartRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.HeartRating> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.HeartRating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.HeartRating fromBundle;
            fromBundle = com.google.android.exoplayer2.HeartRating.fromBundle(bundle);
            return fromBundle;
        }
    };
    private static final int FIELD_IS_HEART = 2;
    private static final int FIELD_RATED = 1;
    private static final int TYPE = 0;
    private final boolean isHeart;
    private final boolean rated;

    public HeartRating() {
        this.rated = false;
        this.isHeart = false;
    }

    public HeartRating(boolean z) {
        this.rated = true;
        this.isHeart = z;
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.rated;
    }

    public boolean isHeart() {
        return this.isHeart;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Boolean.valueOf(this.rated), java.lang.Boolean.valueOf(this.isHeart));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.exoplayer2.HeartRating)) {
            return false;
        }
        com.google.android.exoplayer2.HeartRating heartRating = (com.google.android.exoplayer2.HeartRating) obj;
        return this.isHeart == heartRating.isHeart && this.rated == heartRating.rated;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(keyForField(0), 0);
        bundle.putBoolean(keyForField(1), this.rated);
        bundle.putBoolean(keyForField(2), this.isHeart);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.HeartRating fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 0);
        if (bundle.getBoolean(keyForField(1), false)) {
            return new com.google.android.exoplayer2.HeartRating(bundle.getBoolean(keyForField(2), false));
        }
        return new com.google.android.exoplayer2.HeartRating();
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
