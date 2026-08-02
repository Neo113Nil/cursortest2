package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcv implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzcw((com.google.android.gms.maps.model.LatLng) parcel.readParcelable(com.google.android.libraries.places.api.model.CircularBounds.class.getClassLoader()), parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzcw[i];
    }

    zzcv() {
    }
}
