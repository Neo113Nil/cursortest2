package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbm extends com.google.android.libraries.places.api.model.RectangularBounds {
    private final com.google.android.gms.maps.model.LatLng zza;
    private final com.google.android.gms.maps.model.LatLng zzb;

    zzbm(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        if (latLng == null) {
            throw new java.lang.NullPointerException("Null southwest");
        }
        this.zza = latLng;
        if (latLng2 == null) {
            throw new java.lang.NullPointerException("Null northeast");
        }
        this.zzb = latLng2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.RectangularBounds)) {
            return false;
        }
        com.google.android.libraries.places.api.model.RectangularBounds rectangularBounds = (com.google.android.libraries.places.api.model.RectangularBounds) obj;
        return this.zza.equals(rectangularBounds.getSouthwest()) && this.zzb.equals(rectangularBounds.getNortheast());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String obj2 = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 40 + obj2.length() + 1);
        sb.append("RectangularBounds{southwest=");
        sb.append(obj);
        sb.append(", northeast=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final com.google.android.gms.maps.model.LatLng getSouthwest() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final com.google.android.gms.maps.model.LatLng getNortheast() {
        return this.zzb;
    }
}
