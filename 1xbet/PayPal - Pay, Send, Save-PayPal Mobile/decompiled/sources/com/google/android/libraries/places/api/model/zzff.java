package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzff implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzfg((com.google.android.gms.maps.model.LatLng) parcel.readParcelable(com.google.android.libraries.places.api.model.RoutingParameters.class.getClassLoader()), (com.google.android.libraries.places.api.model.RoutingParameters.TravelMode) parcel.readParcelable(com.google.android.libraries.places.api.model.RoutingParameters.class.getClassLoader()), (com.google.android.libraries.places.api.model.RouteModifiers) parcel.readParcelable(com.google.android.libraries.places.api.model.RoutingParameters.class.getClassLoader()), (com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference) parcel.readParcelable(com.google.android.libraries.places.api.model.RoutingParameters.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzfg[i];
    }

    zzff() {
    }
}
