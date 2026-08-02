package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class Review implements android.os.Parcelable {

    public static abstract class Builder {
        public com.google.android.libraries.places.api.model.Review build() {
            java.lang.Double rating = zzd().getRating();
            boolean z = false;
            if (rating.doubleValue() >= 1.0d && rating.doubleValue() <= 5.0d) {
                z = true;
            }
            com.google.common.base.Preconditions.checkArgument(z, "Rating must between 1.0 and 5.0 (inclusive), but was: %s.", rating);
            return zzd();
        }

        public abstract java.lang.String getOriginalText();

        public abstract java.lang.String getOriginalTextLanguageCode();

        public abstract java.lang.String getPublishTime();

        public abstract java.lang.String getRelativePublishTimeDescription();

        public abstract java.lang.String getText();

        public abstract java.lang.String getTextLanguageCode();

        public abstract com.google.android.libraries.places.api.model.Review.Builder setFlagContentUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.Review.Builder setOriginalText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Review.Builder setOriginalTextLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Review.Builder setPublishTime(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Review.Builder setRelativePublishTimeDescription(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Review.Builder setText(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Review.Builder setTextLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.Review.Builder setVisitDate(com.google.android.libraries.places.api.model.LocalDate localDate);

        abstract com.google.android.libraries.places.api.model.Review.Builder zzb(com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution);

        abstract com.google.android.libraries.places.api.model.Review.Builder zzc(java.lang.String str);

        abstract com.google.android.libraries.places.api.model.Review zzd();
    }

    public static com.google.android.libraries.places.api.model.Review.Builder builder(java.lang.Double d, com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution) {
        java.lang.String nullToEmpty = com.google.common.base.Strings.nullToEmpty(authorAttribution.getUri());
        if (nullToEmpty.startsWith("//")) {
            nullToEmpty = "https:".concat(java.lang.String.valueOf(nullToEmpty));
        }
        com.google.android.libraries.places.internal.zzxj zzxjVar = new com.google.android.libraries.places.internal.zzxj("a");
        zzxjVar.zza(com.google.android.libraries.places.internal.zzxm.zza(nullToEmpty, com.google.android.libraries.places.internal.zzxl.zza));
        zzxjVar.zzb(authorAttribution.getName());
        com.google.android.libraries.places.internal.zzxi zzc = zzxjVar.zzc();
        com.google.android.libraries.places.api.model.zzbn zzbnVar = new com.google.android.libraries.places.api.model.zzbn();
        zzbnVar.zza(d);
        zzbnVar.zzb(authorAttribution);
        zzbnVar.zzc(zzc.zza());
        return zzbnVar;
    }

    public abstract java.lang.String getAttribution();

    public abstract com.google.android.libraries.places.api.model.AuthorAttribution getAuthorAttribution();

    public abstract android.net.Uri getFlagContentUri();

    public abstract java.lang.String getOriginalText();

    public abstract java.lang.String getOriginalTextLanguageCode();

    public abstract java.lang.String getPublishTime();

    public abstract java.lang.Double getRating();

    public abstract java.lang.String getRelativePublishTimeDescription();

    public abstract java.lang.String getText();

    public abstract java.lang.String getTextLanguageCode();

    public abstract com.google.android.libraries.places.api.model.LocalDate getVisitDate();
}
