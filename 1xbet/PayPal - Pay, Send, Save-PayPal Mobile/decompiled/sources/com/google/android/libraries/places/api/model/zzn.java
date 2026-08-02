package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzn extends com.google.android.libraries.places.api.model.CircularBounds {
    private final com.google.android.gms.maps.model.LatLng zza;
    private final double zzb;

    zzn(com.google.android.gms.maps.model.LatLng latLng, double d) {
        if (latLng == null) {
            throw new java.lang.NullPointerException("Null center");
        }
        this.zza = latLng;
        this.zzb = d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.CircularBounds)) {
            return false;
        }
        com.google.android.libraries.places.api.model.CircularBounds circularBounds = (com.google.android.libraries.places.api.model.CircularBounds) obj;
        return this.zza.equals(circularBounds.getCenter()) && java.lang.Double.doubleToLongBits(this.zzb) == java.lang.Double.doubleToLongBits(circularBounds.getRadius());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        double d = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (java.lang.Double.doubleToLongBits(d) ^ (java.lang.Double.doubleToLongBits(d) >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        double d = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 31 + java.lang.String.valueOf(d).length() + 1);
        sb.append("CircularBounds{center=");
        sb.append(obj);
        sb.append(", radius=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final double getRadius() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.CircularBounds
    public final com.google.android.gms.maps.model.LatLng getCenter() {
        return this.zza;
    }
}
