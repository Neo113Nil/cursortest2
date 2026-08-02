package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzfu {
    static com.google.android.gms.common.api.ApiException zza(com.android.volley.VolleyError volleyError) {
        return new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(volleyError instanceof com.android.volley.NetworkError ? 7 : volleyError instanceof com.android.volley.TimeoutError ? 15 : ((volleyError instanceof com.android.volley.ServerError) || (volleyError instanceof com.android.volley.ParseError)) ? 8 : volleyError instanceof com.android.volley.AuthFailureError ? com.google.android.libraries.places.api.net.PlacesStatusCodes.REQUEST_DENIED : 13, java.lang.String.format("Unexpected server error (HTTP Code: %s. Message: %s.)", volleyError.networkResponse == null ? com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA : java.lang.String.valueOf(volleyError.networkResponse.statusCode), volleyError)));
    }

    static com.google.android.gms.common.api.ApiException zzb(com.google.android.libraries.places.internal.zzbns zzbnsVar) {
        com.google.android.libraries.places.internal.zzbnp zzb = com.google.android.libraries.places.internal.zzbnp.zzb(zzbnsVar);
        int ordinal = zzb.zzg().ordinal();
        return ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 7 ? ordinal != 13 ? ordinal != 14 ? new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, zzb.zzh())) : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(7, zzb.zzh())) : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, zzb.zzh())) : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.REQUEST_DENIED, zzb.zzh())) : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.NOT_FOUND, zzb.zzh())) : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(15, zzb.zzh())) : new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, zzb.zzh()));
    }
}
