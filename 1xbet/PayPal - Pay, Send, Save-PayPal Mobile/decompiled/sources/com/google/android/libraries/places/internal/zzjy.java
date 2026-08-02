package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzjy {
    public static final com.google.android.libraries.places.internal.zzbay zza(com.google.android.libraries.places.api.model.RoutingParameters routingParameters) {
        com.google.android.libraries.places.internal.zzbax zza = com.google.android.libraries.places.internal.zzbay.zza();
        com.google.android.gms.maps.model.LatLng origin = routingParameters.getOrigin();
        if (origin != null) {
            zza.zza(com.google.android.libraries.places.internal.zzhq.zza(origin));
        }
        com.google.android.libraries.places.api.model.RoutingParameters.TravelMode travelMode = routingParameters.getTravelMode();
        int i = 5;
        if (travelMode != null) {
            int ordinal = travelMode.ordinal();
            zza.zzc(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 2 : 6 : 5 : 4 : 3);
        }
        com.google.android.libraries.places.api.model.RouteModifiers routeModifiers = routingParameters.getRouteModifiers();
        if (routeModifiers != null) {
            com.google.android.libraries.places.internal.zzbav zza2 = com.google.android.libraries.places.internal.zzbaw.zza();
            zza2.zza(routeModifiers.isTollAvoided());
            zza2.zzb(routeModifiers.isHighwayAvoided());
            zza2.zzc(routeModifiers.isFerryAvoided());
            zza2.zzd(routeModifiers.isIndoorAvoided());
            zza.zzb((com.google.android.libraries.places.internal.zzbaw) zza2.zzG());
        }
        com.google.android.libraries.places.api.model.RoutingParameters.RoutingPreference routingPreference = routingParameters.getRoutingPreference();
        if (routingPreference != null) {
            int ordinal2 = routingPreference.ordinal();
            if (ordinal2 == 1) {
                i = 3;
            } else if (ordinal2 == 2) {
                i = 4;
            } else if (ordinal2 != 3) {
                i = 2;
            }
            zza.zzd(i);
        }
        return (com.google.android.libraries.places.internal.zzbay) zza.zzG();
    }

    zzjy(com.google.android.libraries.places.internal.zzhq zzhqVar) {
    }
}
