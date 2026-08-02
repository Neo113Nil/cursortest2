package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzlv {
    private static final com.google.common.collect.ImmutableMap zza = com.google.common.collect.ImmutableMap.builder().put(com.google.android.libraries.places.internal.zzfn.NONE, "NONE").put(com.google.android.libraries.places.internal.zzfn.PSK, "WPA_PSK").put(com.google.android.libraries.places.internal.zzfn.EAP, "WPA_EAP").put(com.google.android.libraries.places.internal.zzfn.OTHER, "SECURED_NONE").buildOrThrow();

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.String zza(com.google.common.collect.ImmutableList immutableList, int i) {
        com.google.common.base.Preconditions.checkArgument(true, "maxLength must not be negative");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = immutableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.libraries.places.internal.zzfo zzfoVar = (com.google.android.libraries.places.internal.zzfo) immutableList.get(i2);
            int length = sb.length();
            java.lang.String valueOf = java.lang.String.valueOf(com.google.common.base.Joiner.on(",").withKeyValueSeparator("=").join(com.google.common.collect.ImmutableMap.builder().put("mac", zzfoVar.zza()).put("strength_dbm", java.lang.Integer.valueOf(zzfoVar.zzb())).put("wifi_auth_type", zza.get(zzfoVar.zzc())).put("is_connected", java.lang.Boolean.valueOf(zzfoVar.zzd())).put("frequency_mhz", java.lang.Integer.valueOf(zzfoVar.zze())).buildOrThrow()));
            int length2 = sb.length();
            java.lang.String concat = (length > 0 ? com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER : "").concat(valueOf);
            if (length2 + concat.length() > 4000) {
                break;
            }
            sb.append(concat);
        }
        return sb.toString();
    }

    public static java.lang.String zzb(android.location.Location location) {
        if (location == null) {
            return null;
        }
        return zzf(location.getLatitude(), location.getLongitude());
    }

    public static java.lang.String zzc(com.google.android.gms.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzf(latLng.latitude, latLng.longitude);
    }

    private static java.lang.String zzf(double d, double d2) {
        return java.lang.String.format(java.util.Locale.US, "%.15f,%.15f", java.lang.Double.valueOf(d), java.lang.Double.valueOf(d2));
    }

    private static java.lang.String zzg(com.google.android.libraries.places.api.model.RectangularBounds rectangularBounds) {
        com.google.android.gms.maps.model.LatLng southwest = rectangularBounds.getSouthwest();
        double d = southwest.latitude;
        double d2 = southwest.longitude;
        com.google.android.gms.maps.model.LatLng northeast = rectangularBounds.getNortheast();
        return java.lang.String.format(java.util.Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", java.lang.Double.valueOf(d), java.lang.Double.valueOf(d2), java.lang.Double.valueOf(northeast.latitude), java.lang.Double.valueOf(northeast.longitude));
    }

    public static java.lang.String zzd(com.google.android.libraries.places.api.model.LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof com.google.android.libraries.places.api.model.RectangularBounds) {
            return zzg((com.google.android.libraries.places.api.model.RectangularBounds) locationBias);
        }
        throw new java.lang.AssertionError("Unknown LocationBias type.");
    }

    public static java.lang.String zze(com.google.android.libraries.places.api.model.LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof com.google.android.libraries.places.api.model.RectangularBounds) {
            return zzg((com.google.android.libraries.places.api.model.RectangularBounds) locationRestriction);
        }
        throw new java.lang.AssertionError("Unknown LocationRestriction type.");
    }
}
