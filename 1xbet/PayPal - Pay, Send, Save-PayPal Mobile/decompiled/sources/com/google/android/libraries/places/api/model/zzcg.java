package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcg extends com.google.android.libraries.places.api.model.zzb {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzcg> CREATOR = new com.google.android.libraries.places.api.model.zzcf();

    zzcg(com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, com.google.android.libraries.places.api.model.Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        super(booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, booleanPlaceAttributeValue4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getWheelchairAccessibleParking(), i);
        parcel.writeParcelable(getWheelchairAccessibleEntrance(), i);
        parcel.writeParcelable(getWheelchairAccessibleRestroom(), i);
        parcel.writeParcelable(getWheelchairAccessibleSeating(), i);
    }
}
