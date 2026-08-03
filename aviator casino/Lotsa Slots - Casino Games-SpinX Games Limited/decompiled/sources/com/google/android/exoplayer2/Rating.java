package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public abstract class Rating implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Rating> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Rating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.Rating fromBundle;
            fromBundle = com.google.android.exoplayer2.Rating.fromBundle(bundle);
            return fromBundle;
        }
    };
    static final int FIELD_RATING_TYPE = 0;
    static final int RATING_TYPE_HEART = 0;
    static final int RATING_TYPE_PERCENTAGE = 1;
    static final int RATING_TYPE_STAR = 2;
    static final int RATING_TYPE_THUMB = 3;
    static final int RATING_TYPE_UNSET = -1;
    static final float RATING_UNSET = -1.0f;

    public abstract boolean isRated();

    Rating() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.Rating fromBundle(android.os.Bundle bundle) {
        int i = bundle.getInt(keyForField(0), -1);
        if (i == 0) {
            return com.google.android.exoplayer2.HeartRating.CREATOR.fromBundle(bundle);
        }
        if (i == 1) {
            return com.google.android.exoplayer2.PercentageRating.CREATOR.fromBundle(bundle);
        }
        if (i == 2) {
            return com.google.android.exoplayer2.StarRating.CREATOR.fromBundle(bundle);
        }
        if (i == 3) {
            return com.google.android.exoplayer2.ThumbRating.CREATOR.fromBundle(bundle);
        }
        throw new java.lang.IllegalArgumentException("Unknown RatingType: " + i);
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
