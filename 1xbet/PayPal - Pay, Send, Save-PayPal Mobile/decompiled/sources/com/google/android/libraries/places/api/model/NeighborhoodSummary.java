package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class NeighborhoodSummary extends com.google.android.libraries.places.api.model.zzce implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary build();

        public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setDescription(com.google.android.libraries.places.api.model.ContentBlock contentBlock);

        public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setDisclosureText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setDisclosureTextLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setFlagContentUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder setOverview(com.google.android.libraries.places.api.model.ContentBlock contentBlock);
    }

    public abstract com.google.android.libraries.places.api.model.ContentBlock getDescription();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureText();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureTextLanguageCode();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract android.net.Uri getFlagContentUri();

    public abstract com.google.android.libraries.places.api.model.ContentBlock getOverview();

    public static com.google.android.libraries.places.api.model.NeighborhoodSummary.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzas();
    }
}
