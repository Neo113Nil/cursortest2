package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class EvChargeAmenitySummary extends com.google.android.libraries.places.api.model.zzce implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary build();

        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setCoffee(com.google.android.libraries.places.api.model.ContentBlock contentBlock);

        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setDisclosureText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setDisclosureTextLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setFlagContentUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setRestaurant(com.google.android.libraries.places.api.model.ContentBlock contentBlock);

        public abstract com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder setStore(com.google.android.libraries.places.api.model.ContentBlock contentBlock);
    }

    public static com.google.android.libraries.places.api.model.EvChargeAmenitySummary.Builder builder(com.google.android.libraries.places.api.model.ContentBlock contentBlock) {
        com.google.android.libraries.places.api.model.zzab zzabVar = new com.google.android.libraries.places.api.model.zzab();
        zzabVar.zza(contentBlock);
        return zzabVar;
    }

    public abstract com.google.android.libraries.places.api.model.ContentBlock getCoffee();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureText();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract java.lang.String getDisclosureTextLanguageCode();

    @Override // com.google.android.libraries.places.api.model.zzce
    public abstract android.net.Uri getFlagContentUri();

    public abstract com.google.android.libraries.places.api.model.ContentBlock getOverview();

    public abstract com.google.android.libraries.places.api.model.ContentBlock getRestaurant();

    public abstract com.google.android.libraries.places.api.model.ContentBlock getStore();
}
