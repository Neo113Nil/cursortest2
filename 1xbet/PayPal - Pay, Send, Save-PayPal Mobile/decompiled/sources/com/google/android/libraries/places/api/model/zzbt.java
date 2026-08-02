package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbt extends com.google.android.libraries.places.api.model.RoutingParameters.Builder {
    private com.google.android.gms.maps.model.LatLng zza;
    private com.google.android.libraries.places.api.model.RoutingParameters.TravelMode zzb;
    private com.google.android.libraries.places.api.model.RouteModifiers zzc;
    private com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference zzd;

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters.Builder setTravelMode(com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode) {
        this.zzb = travelMode;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters.Builder setRoutingPreference(com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference) {
        this.zzd = routingPreference;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters.Builder setRouteModifiers(com.google.android.libraries.places.api.model.RouteModifiers routeModifiers) {
        this.zzc = routeModifiers;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters.Builder setOrigin(com.google.android.gms.maps.model.LatLng latLng) {
        this.zza = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters.TravelMode getTravelMode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference getRoutingPreference() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RouteModifiers getRouteModifiers() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.gms.maps.model.LatLng getOrigin() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters.Builder
    public final com.google.android.libraries.places.api.model.RoutingParameters build() {
        return new com.google.android.libraries.places.api.model.zzfg(this.zza, this.zzb, this.zzc, this.zzd);
    }

    zzbt() {
    }
}
