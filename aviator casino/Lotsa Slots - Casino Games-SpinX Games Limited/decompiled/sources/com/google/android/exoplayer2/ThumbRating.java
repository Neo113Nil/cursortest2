package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class ThumbRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.ThumbRating> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.ThumbRating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.ThumbRating fromBundle;
            fromBundle = com.google.android.exoplayer2.ThumbRating.fromBundle(bundle);
            return fromBundle;
        }
    };
    private static final int FIELD_IS_THUMBS_UP = 2;
    private static final int FIELD_RATED = 1;
    private static final int TYPE = 3;
    private final boolean isThumbsUp;
    private final boolean rated;

    public ThumbRating() {
        this.rated = false;
        this.isThumbsUp = false;
    }

    public ThumbRating(boolean z) {
        this.rated = true;
        this.isThumbsUp = z;
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.rated;
    }

    public boolean isThumbsUp() {
        return this.isThumbsUp;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Boolean.valueOf(this.rated), java.lang.Boolean.valueOf(this.isThumbsUp));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.exoplayer2.ThumbRating)) {
            return false;
        }
        com.google.android.exoplayer2.ThumbRating thumbRating = (com.google.android.exoplayer2.ThumbRating) obj;
        return this.isThumbsUp == thumbRating.isThumbsUp && this.rated == thumbRating.rated;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(keyForField(0), 3);
        bundle.putBoolean(keyForField(1), this.rated);
        bundle.putBoolean(keyForField(2), this.isThumbsUp);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.ThumbRating fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 3);
        if (bundle.getBoolean(keyForField(1), false)) {
            return new com.google.android.exoplayer2.ThumbRating(bundle.getBoolean(keyForField(2), false));
        }
        return new com.google.android.exoplayer2.ThumbRating();
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
