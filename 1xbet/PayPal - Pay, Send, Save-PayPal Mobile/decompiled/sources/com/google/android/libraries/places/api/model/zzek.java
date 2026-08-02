package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzek extends com.google.android.libraries.places.api.model.zzaz {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzek> CREATOR = new com.google.android.libraries.places.api.model.zzej();

    zzek(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getAcceptsCreditCards(), i);
        parcel.writeParcelable(getAcceptsDebitCards(), i);
        parcel.writeParcelable(getAcceptsCashOnly(), i);
        parcel.writeParcelable(getAcceptsNfc(), i);
    }
}
