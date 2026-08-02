package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzky extends com.google.android.libraries.places.internal.zzld {
    private final android.location.Location zza;
    private final com.google.common.collect.ImmutableList zzb;

    zzky(com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest, android.location.Location location, com.google.common.collect.ImmutableList immutableList, java.util.Locale locale, java.lang.String str, com.google.android.libraries.places.internal.zznh zznhVar) {
        super(findCurrentPlaceRequest, locale, str, zznhVar);
        this.zza = location;
        this.zzb = immutableList;
    }

    @Override // com.google.android.libraries.places.internal.zzld
    public final java.util.Map zze() {
        java.lang.Integer num;
        com.google.android.libraries.places.api.net.FindCurrentPlaceRequest findCurrentPlaceRequest = (com.google.android.libraries.places.api.net.FindCurrentPlaceRequest) zza();
        java.util.HashMap hashMap = new java.util.HashMap();
        android.location.Location location = this.zza;
        zzg(hashMap, "location", com.google.android.libraries.places.internal.zzlv.zzb(location), null);
        zzg(hashMap, "wifiaccesspoints", com.google.android.libraries.places.internal.zzlv.zza(this.zzb, 4000), null);
        if (location != null) {
            float accuracy = location.getAccuracy();
            if (location.hasAccuracy() && accuracy > 0.0f) {
                num = java.lang.Integer.valueOf(java.lang.Math.round(accuracy * 100.0f));
                zzg(hashMap, "precision", num, null);
                zzg(hashMap, "timestamp", java.lang.Long.valueOf(location.getTime()), null);
                zzg(hashMap, "fields", com.google.android.libraries.places.internal.zzlw.zzb(findCurrentPlaceRequest.getPlaceFields()), null);
                return hashMap;
            }
        }
        num = null;
        zzg(hashMap, "precision", num, null);
        zzg(hashMap, "timestamp", java.lang.Long.valueOf(location.getTime()), null);
        zzg(hashMap, "fields", com.google.android.libraries.places.internal.zzlw.zzb(findCurrentPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }

    @Override // com.google.android.libraries.places.internal.zzld
    protected final java.lang.String zzf() {
        return "findplacefromuserlocation/json";
    }
}
