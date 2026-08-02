package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class ConsumerAlertDetails implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.ConsumerAlertDetails build();

        public abstract com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setAboutLinkTitle(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setAboutLinkUri(android.net.Uri uri);

        public abstract com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setDescription(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder setTitle(java.lang.String str);
    }

    public abstract java.lang.String getAboutLinkTitle();

    public abstract android.net.Uri getAboutLinkUri();

    public abstract java.lang.String getDescription();

    public abstract java.lang.String getTitle();

    public static com.google.android.libraries.places.api.model.ConsumerAlertDetails.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzs();
    }
}
