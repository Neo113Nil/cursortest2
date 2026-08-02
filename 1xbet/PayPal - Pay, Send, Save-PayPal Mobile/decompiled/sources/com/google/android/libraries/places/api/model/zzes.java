package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzes extends com.google.android.libraries.places.api.model.zzbg {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzes> CREATOR = new com.google.android.libraries.places.api.model.zzer();

    zzes(com.google.android.libraries.places.api.model.Place place, double d) {
        super(place, d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getPlace(), i);
        parcel.writeDouble(getLikelihood());
    }
}
