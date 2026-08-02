package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfg extends com.google.android.libraries.places.api.model.zzbu {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfg> CREATOR = new com.google.android.libraries.places.api.model.zzff();

    zzfg(com.google.android.gms.maps.model.LatLng latLng, com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode, com.google.android.libraries.places.api.model.RouteModifiers routeModifiers, com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference) {
        super(latLng, travelMode, routeModifiers, routingPreference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getOrigin(), i);
        parcel.writeParcelable(getTravelMode(), i);
        parcel.writeParcelable(getRouteModifiers(), i);
        parcel.writeParcelable(getRoutingPreference(), i);
    }
}
