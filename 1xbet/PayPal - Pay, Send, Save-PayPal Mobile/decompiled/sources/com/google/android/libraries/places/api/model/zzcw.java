package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcw extends com.google.android.libraries.places.api.model.zzn {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzcw> CREATOR = new com.google.android.libraries.places.api.model.zzcv();

    zzcw(com.google.android.gms.maps.model.LatLng latLng, double d) {
        super(latLng, d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getCenter(), i);
        parcel.writeDouble(getRadius());
    }
}
