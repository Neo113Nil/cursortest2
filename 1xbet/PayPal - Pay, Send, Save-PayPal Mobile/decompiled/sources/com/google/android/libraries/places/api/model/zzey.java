package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzey extends com.google.android.libraries.places.api.model.zzbm {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzey> CREATOR = new com.google.android.libraries.places.api.model.zzex();

    zzey(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        super(latLng, latLng2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getSouthwest(), i);
        parcel.writeParcelable(getNortheast(), i);
    }
}
