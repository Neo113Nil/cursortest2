package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class CircularBounds implements com.google.android.libraries.places.api.model.LocationBias, com.google.android.libraries.places.api.model.LocationRestriction, android.os.Parcelable {
    public static com.google.android.libraries.places.api.model.CircularBounds newInstance(com.google.android.gms.maps.model.LatLng latLng, double d) {
        return new com.google.android.libraries.places.api.model.zzcw(latLng, d);
    }

    public abstract com.google.android.gms.maps.model.LatLng getCenter();

    public abstract double getRadius();
}
