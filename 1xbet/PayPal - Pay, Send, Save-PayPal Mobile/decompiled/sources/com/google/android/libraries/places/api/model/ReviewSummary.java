package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class ReviewSummary extends com.google.android.libraries.places.api.model.zzce implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.ReviewSummary build();

        public abstract com.google.android.libraries.places.api.model.ReviewSummary.Builder setDisclosureText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ReviewSummary.Builder setDisclosureTextLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ReviewSummary.Builder setFlagContentUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.ReviewSummary.Builder setReviewsUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.ReviewSummary.Builder setText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ReviewSummary.Builder setTextLanguageCode(java.lang.String str);
    }

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureText();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureTextLanguageCode();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract android.net.Uri getFlagContentUri();

    public abstract android.net.Uri getReviewsUri();

    public abstract java.lang.String getText();

    public abstract java.lang.String getTextLanguageCode();

    public static com.google.android.libraries.places.api.model.ReviewSummary.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzbp();
    }
}
