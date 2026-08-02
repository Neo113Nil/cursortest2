package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzhq {
    static final com.google.android.libraries.places.internal.zzbht zza(com.google.android.gms.maps.model.LatLng latLng) {
        com.google.android.libraries.places.internal.zzbhs zzf = com.google.android.libraries.places.internal.zzbht.zzf();
        zzf.zza(latLng.latitude);
        zzf.zzb(latLng.longitude);
        return (com.google.android.libraries.places.internal.zzbht) zzf.zzG();
    }

    static final com.google.android.libraries.places.internal.zzaxc zzb(com.google.android.libraries.places.api.model.CircularBounds circularBounds) {
        com.google.android.gms.maps.model.LatLng center = circularBounds.getCenter();
        com.google.android.libraries.places.internal.zzaxb zza = com.google.android.libraries.places.internal.zzaxc.zza();
        com.google.android.libraries.places.internal.zzbhs zzf = com.google.android.libraries.places.internal.zzbht.zzf();
        zzf.zza(center.latitude);
        zzf.zzb(center.longitude);
        zza.zza(zzf);
        zza.zzb(circularBounds.getRadius());
        return (com.google.android.libraries.places.internal.zzaxc) zza.zzG();
    }

    static final com.google.android.libraries.places.internal.zzaua zzc(com.google.android.libraries.places.api.model.RectangularBounds rectangularBounds) {
        com.google.android.gms.maps.model.LatLng southwest = rectangularBounds.getSouthwest();
        com.google.android.gms.maps.model.LatLng northeast = rectangularBounds.getNortheast();
        com.google.android.libraries.places.internal.zzatz zzd = com.google.android.libraries.places.internal.zzaua.zzd();
        com.google.android.libraries.places.internal.zzbhs zzf = com.google.android.libraries.places.internal.zzbht.zzf();
        zzf.zza(southwest.latitude);
        zzf.zzb(southwest.longitude);
        zzd.zza((com.google.android.libraries.places.internal.zzbht) zzf.zzG());
        com.google.android.libraries.places.internal.zzbhs zzf2 = com.google.android.libraries.places.internal.zzbht.zzf();
        zzf2.zza(northeast.latitude);
        zzf2.zzb(northeast.longitude);
        zzd.zzb((com.google.android.libraries.places.internal.zzbht) zzf2.zzG());
        return (com.google.android.libraries.places.internal.zzaua) zzd.zzG();
    }

    zzhq() {
    }
}
