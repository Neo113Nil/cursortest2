package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzei extends com.google.android.libraries.places.api.model.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzei> CREATOR = new com.google.android.libraries.places.api.model.zzeh();

    zzei(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getFreeParkingLot(), i);
        parcel.writeParcelable(getPaidParkingLot(), i);
        parcel.writeParcelable(getFreeStreetParking(), i);
        parcel.writeParcelable(getPaidStreetParking(), i);
        parcel.writeParcelable(getValetParking(), i);
        parcel.writeParcelable(getFreeGarageParking(), i);
        parcel.writeParcelable(getPaidGarageParking(), i);
    }
}
