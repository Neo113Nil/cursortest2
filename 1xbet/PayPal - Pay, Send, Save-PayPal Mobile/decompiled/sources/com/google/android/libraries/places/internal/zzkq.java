package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzkq extends com.google.android.libraries.places.internal.zzld {
    zzkq(com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest, java.util.Locale locale, java.lang.String str, com.google.android.libraries.places.internal.zznh zznhVar) {
        super(fetchPlaceRequest, locale, str, zznhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzld
    public final java.util.Map zze() {
        com.google.android.libraries.places.api.net.FetchPlaceRequest fetchPlaceRequest = (com.google.android.libraries.places.api.net.FetchPlaceRequest) zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        zzg(hashMap, "placeid", fetchPlaceRequest.getPlaceId(), null);
        zzg(hashMap, "sessiontoken", fetchPlaceRequest.getSessionToken(), null);
        zzg(hashMap, "fields", com.google.android.libraries.places.internal.zzlw.zzb(fetchPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }

    @Override // com.google.android.libraries.places.internal.zzld
    protected final java.lang.String zzf() {
        return "details/json";
    }
}
