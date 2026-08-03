package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class PercentageRating extends com.google.android.exoplayer2.Rating {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.PercentageRating> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.PercentageRating$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.PercentageRating fromBundle;
            fromBundle = com.google.android.exoplayer2.PercentageRating.fromBundle(bundle);
            return fromBundle;
        }
    };
    private static final int FIELD_PERCENT = 1;
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating() {
        this.percent = -1.0f;
    }

    public PercentageRating(float f) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f;
    }

    @Override // com.google.android.exoplayer2.Rating
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(java.lang.Float.valueOf(this.percent));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.exoplayer2.PercentageRating) && this.percent == ((com.google.android.exoplayer2.PercentageRating) obj).percent;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(keyForField(0), 1);
        bundle.putFloat(keyForField(1), this.percent);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.PercentageRating fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(bundle.getInt(keyForField(0), -1) == 1);
        float f = bundle.getFloat(keyForField(1), -1.0f);
        return f == -1.0f ? new com.google.android.exoplayer2.PercentageRating() : new com.google.android.exoplayer2.PercentageRating(f);
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
