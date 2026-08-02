package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbu extends com.google.android.libraries.places.api.model.RoutingParameters {
    private final com.google.android.gms.maps.model.LatLng zza;
    private final com.google.android.libraries.places.api.model.RoutingParameters.TravelMode zzb;
    private final com.google.android.libraries.places.api.model.RouteModifiers zzc;
    private final com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.RoutingParameters)) {
            return false;
        }
        com.google.android.libraries.places.api.model.RoutingParameters routingParameters = (com.google.android.libraries.places.api.model.RoutingParameters) obj;
        com.google.android.gms.maps.model.LatLng latLng = this.zza;
        if (latLng == null) {
            if (routingParameters.getOrigin() != null) {
                return false;
            }
        } else if (!latLng.equals(routingParameters.getOrigin())) {
            return false;
        }
        com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode = this.zzb;
        if (travelMode == null) {
            if (routingParameters.getTravelMode() != null) {
                return false;
            }
        } else if (!travelMode.equals(routingParameters.getTravelMode())) {
            return false;
        }
        com.google.android.libraries.places.api.model.RouteModifiers routeModifiers = this.zzc;
        if (routeModifiers == null) {
            if (routingParameters.getRouteModifiers() != null) {
                return false;
            }
        } else if (!routeModifiers.equals(routingParameters.getRouteModifiers())) {
            return false;
        }
        com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference = this.zzd;
        if (routingPreference == null) {
            if (routingParameters.getRoutingPreference() != null) {
                return false;
            }
        } else if (!routingPreference.equals(routingParameters.getRoutingPreference())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference = this.zzd;
        com.google.android.libraries.places.api.model.RouteModifiers routeModifiers = this.zzc;
        com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(travelMode);
        java.lang.String valueOf3 = java.lang.String.valueOf(routeModifiers);
        java.lang.String valueOf4 = java.lang.String.valueOf(routingPreference);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 38 + java.lang.String.valueOf(valueOf2).length() + 17 + java.lang.String.valueOf(valueOf3).length() + 20 + java.lang.String.valueOf(valueOf4).length() + 1);
        sb.append("RoutingParameters{origin=");
        sb.append(valueOf);
        sb.append(", travelMode=");
        sb.append(valueOf2);
        sb.append(", routeModifiers=");
        sb.append(valueOf3);
        sb.append(", routingPreference=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.gms.maps.model.LatLng latLng = this.zza;
        int hashCode = latLng == null ? 0 : latLng.hashCode();
        com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode = this.zzb;
        int hashCode2 = travelMode == null ? 0 : travelMode.hashCode();
        com.google.android.libraries.places.api.model.RouteModifiers routeModifiers = this.zzc;
        int hashCode3 = routeModifiers == null ? 0 : routeModifiers.hashCode();
        com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference = this.zzd;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (routingPreference != null ? routingPreference.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final com.google.android.libraries.places.api.model.RoutingParameters.TravelMode getTravelMode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference getRoutingPreference() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final com.google.android.libraries.places.api.model.RouteModifiers getRouteModifiers() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.RoutingParameters
    public final com.google.android.gms.maps.model.LatLng getOrigin() {
        return this.zza;
    }

    zzbu(com.google.android.gms.maps.model.LatLng latLng, com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode, com.google.android.libraries.places.api.model.RouteModifiers routeModifiers, com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference) {
        this.zza = latLng;
        this.zzb = travelMode;
        this.zzc = routeModifiers;
        this.zzd = routingPreference;
    }
}
