package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzku extends com.google.android.libraries.places.internal.zzld {
    zzku(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, java.util.Locale locale, java.lang.String str, com.google.android.libraries.places.internal.zznh zznhVar) {
        super(findAutocompletePredictionsRequest, locale, str, zznhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzld
    public final java.util.Map zze() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest) zza();
        java.util.List<java.lang.String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        java.lang.String query = findAutocompletePredictionsRequest.getQuery();
        zzg(hashMap, "input", query == null ? null : query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " "), null);
        if (!typesFilter.isEmpty()) {
            zzg(hashMap, "types", android.text.TextUtils.join(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER, typesFilter), null);
        }
        zzg(hashMap, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zzg(hashMap, "origin", com.google.android.libraries.places.internal.zzlv.zzc(findAutocompletePredictionsRequest.getOrigin()), null);
        zzg(hashMap, "locationbias", com.google.android.libraries.places.internal.zzlv.zzd(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzg(hashMap, "locationrestriction", com.google.android.libraries.places.internal.zzlv.zze(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        java.util.List<java.lang.String> countries = findAutocompletePredictionsRequest.getCountries();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : countries) {
            java.lang.String concat = android.text.TextUtils.isEmpty(str) ? null : "country:".concat(java.lang.String.valueOf(str.toLowerCase(java.util.Locale.US)));
            if (concat != null) {
                if (sb.length() != 0) {
                    sb.append('|');
                }
                sb.append(concat);
            }
        }
        zzg(hashMap, "components", sb.length() == 0 ? null : sb.toString(), null);
        return hashMap;
    }

    @Override // com.google.android.libraries.places.internal.zzld
    protected final java.lang.String zzf() {
        return "autocomplete/json";
    }
}
