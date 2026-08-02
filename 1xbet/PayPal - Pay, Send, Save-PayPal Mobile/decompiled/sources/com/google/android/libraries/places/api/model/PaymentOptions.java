package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class PaymentOptions implements android.os.Parcelable {

    public static abstract class Builder {
        public abstract com.google.android.libraries.places.api.model.PaymentOptions build();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

        public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsNfc();

        public abstract com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsCashOnly(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsCreditCards(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsDebitCards(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract com.google.android.libraries.places.api.model.PaymentOptions.Builder setAcceptsNfc(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue);
    }

    public static com.google.android.libraries.places.api.model.PaymentOptions.Builder builder() {
        com.google.android.libraries.places.api.model.zzay zzayVar = new com.google.android.libraries.places.api.model.zzay();
        zzayVar.setAcceptsCreditCards(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzayVar.setAcceptsDebitCards(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzayVar.setAcceptsCashOnly(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        zzayVar.setAcceptsNfc(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue.UNKNOWN);
        return zzayVar;
    }

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCashOnly();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsCreditCards();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsDebitCards();

    public abstract com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue getAcceptsNfc();
}
