package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzbl extends com.google.android.libraries.places.api.model.zzgg {
    private com.google.android.gms.maps.model.LatLng zza;
    private com.google.android.gms.maps.model.LatLng zzb;

    final com.google.android.libraries.places.api.model.zzgg zza(com.google.android.gms.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.NullPointerException("Null southwest");
        }
        this.zza = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzgg
    final com.google.android.libraries.places.api.model.zzgg zzb(com.google.android.gms.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.NullPointerException("Null northeast");
        }
        this.zzb = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzgg
    final com.google.android.libraries.places.api.model.RectangularBounds zzc() {
        com.google.android.gms.maps.model.LatLng latLng;
        com.google.android.gms.maps.model.LatLng latLng2 = this.zza;
        if (latLng2 != null && (latLng = this.zzb) != null) {
            return new com.google.android.libraries.places.api.model.zzey(latLng2, latLng);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" southwest");
        }
        if (this.zzb == null) {
            sb.append(" northeast");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzbl() {
    }
}
