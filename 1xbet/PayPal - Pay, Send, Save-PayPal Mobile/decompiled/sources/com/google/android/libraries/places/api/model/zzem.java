package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzem extends com.google.android.libraries.places.api.model.zzbb {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzem> CREATOR = new com.google.android.libraries.places.api.model.zzel();

    zzem(com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek, com.google.android.libraries.places.api.model.TimeOfWeek timeOfWeek2) {
        super(timeOfWeek, timeOfWeek2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getOpen(), i);
        parcel.writeParcelable(getClose(), i);
    }
}
