package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class LatLng extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.LatLng> CREATOR = new com.google.android.gms.maps.model.zzn();
    public final double latitude;
    public final double longitude;

    public LatLng(double d, double d2) {
        if (d2 < -180.0d || d2 >= 180.0d) {
            this.longitude = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.longitude = d2;
        }
        this.latitude = java.lang.Math.max(-90.0d, java.lang.Math.min(90.0d, d));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.LatLng)) {
            return false;
        }
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) obj;
        return java.lang.Double.doubleToLongBits(this.latitude) == java.lang.Double.doubleToLongBits(latLng.latitude) && java.lang.Double.doubleToLongBits(this.longitude) == java.lang.Double.doubleToLongBits(latLng.longitude);
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.longitude);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lat/lng: (");
        sb.append(this.latitude);
        sb.append(",");
        sb.append(this.longitude);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        double d = this.latitude;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 2, d);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, this.longitude);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
