package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfk extends com.google.android.libraries.places.api.model.zzbx {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfk> CREATOR = new com.google.android.libraries.places.api.model.zzfj();

    zzfk(com.google.android.libraries.places.api.model.Polyline polyline) {
        super(polyline);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getPolyline(), i);
    }
}
