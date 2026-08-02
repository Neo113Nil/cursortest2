package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
public abstract class RectangularBounds implements com.google.android.libraries.places.api.model.LocationBias, com.google.android.libraries.places.api.model.LocationRestriction {
    public static com.google.android.libraries.places.api.model.RectangularBounds newInstance(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        return newInstance(new com.google.android.gms.maps.model.LatLngBounds(latLng, latLng2));
    }

    public abstract com.google.android.gms.maps.model.LatLng getNortheast();

    public abstract com.google.android.gms.maps.model.LatLng getSouthwest();

    public static com.google.android.libraries.places.api.model.RectangularBounds newInstance(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        com.google.android.libraries.places.api.model.zzbl zzblVar = new com.google.android.libraries.places.api.model.zzbl();
        zzblVar.zza(latLngBounds.southwest);
        zzblVar.zzb(latLngBounds.northeast);
        return zzblVar.zzc();
    }
}
