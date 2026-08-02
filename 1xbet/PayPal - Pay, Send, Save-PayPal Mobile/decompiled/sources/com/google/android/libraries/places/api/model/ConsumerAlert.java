package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class ConsumerAlert implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.ConsumerAlert build();

        public abstract com.google.android.libraries.places.api.model.ConsumerAlert.Builder setDetails(com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails);

        public abstract com.google.android.libraries.places.api.model.ConsumerAlert.Builder setLanguageCode(java.lang.String str);

        public abstract com.google.android.libraries.places.api.model.ConsumerAlert.Builder setOverview(java.lang.String str);
    }

    public abstract com.google.android.libraries.places.api.model.ConsumerAlertDetails getDetails();

    public abstract java.lang.String getLanguageCode();

    public abstract java.lang.String getOverview();

    public static com.google.android.libraries.places.api.model.ConsumerAlert.Builder builder() {
        return new com.google.android.libraries.places.api.model.zzq();
    }
}
