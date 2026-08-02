package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class GenerativeSummary extends com.google.android.libraries.places.api.model.zzce implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.GenerativeSummary build();

        public abstract com.google.android.libraries.places.api.model.GenerativeSummary.Builder setDisclosureText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.GenerativeSummary.Builder setDisclosureTextLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.GenerativeSummary.Builder setFlagContentUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.GenerativeSummary.Builder setOverview(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.GenerativeSummary.Builder setOverviewLanguageCode(java.lang.String str);
    }

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureText();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureTextLanguageCode();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract android.net.Uri getFlagContentUri();

    public abstract java.lang.String getOverview();

    public abstract java.lang.String getOverviewLanguageCode();

    public static com.google.android.libraries.places.api.model.GenerativeSummary.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzah();
    }
}
