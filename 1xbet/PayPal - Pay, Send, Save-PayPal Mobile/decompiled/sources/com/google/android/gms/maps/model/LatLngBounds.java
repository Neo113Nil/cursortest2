package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class LatLngBounds extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.LatLngBounds> CREATOR = new com.google.android.gms.maps.model.zzm();
    public final com.google.android.gms.maps.model.LatLng northeast;
    public final com.google.android.gms.maps.model.LatLng southwest;

    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        public final com.google.android.gms.maps.model.LatLngBounds build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!java.lang.Double.isNaN(this.zzc), "no included points");
            return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(this.zza, this.zzc), new com.google.android.gms.maps.model.LatLng(this.zzb, this.zzd));
        }

        public final com.google.android.gms.maps.model.LatLngBounds.Builder include(com.google.android.gms.maps.model.LatLng latLng) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "point must not be null");
            this.zza = java.lang.Math.min(this.zza, latLng.latitude);
            this.zzb = java.lang.Math.max(this.zzb, latLng.latitude);
            double d = latLng.longitude;
            if (java.lang.Double.isNaN(this.zzc)) {
                this.zzc = d;
                this.zzd = d;
                return this;
            }
            double d2 = this.zzc;
            double d3 = this.zzd;
            if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                android.os.Parcelable.Creator<com.google.android.gms.maps.model.LatLngBounds> creator = com.google.android.gms.maps.model.LatLngBounds.CREATOR;
                if (((d2 - d) + 360.0d) % 360.0d < ((d - this.zzd) + 360.0d) % 360.0d) {
                    this.zzc = d;
                    return this;
                }
                this.zzd = d;
            }
            return this;
        }
    }

    public LatLngBounds(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "southwest must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        com.google.android.gms.common.internal.Preconditions.checkArgument(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", java.lang.Double.valueOf(d2), java.lang.Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public static com.google.android.gms.maps.model.LatLngBounds createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        return com.google.android.gms.maps.GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d) {
        com.google.android.gms.maps.model.LatLng latLng = this.northeast;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    public final boolean contains(com.google.android.gms.maps.model.LatLng latLng) {
        com.google.android.gms.maps.model.LatLng latLng2 = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "point must not be null.");
        double d = latLng2.latitude;
        return this.southwest.latitude <= d && d <= this.northeast.latitude && zza(latLng2.longitude);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.LatLngBounds)) {
            return false;
        }
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public final com.google.android.gms.maps.model.LatLng getCenter() {
        com.google.android.gms.maps.model.LatLng latLng = this.northeast;
        com.google.android.gms.maps.model.LatLng latLng2 = this.southwest;
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        double d3 = latLng.longitude;
        double d4 = latLng2.longitude;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        return new com.google.android.gms.maps.model.LatLng((d + d2) / 2.0d, (d3 + d4) / 2.0d);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.southwest, this.northeast);
    }

    public final com.google.android.gms.maps.model.LatLngBounds including(com.google.android.gms.maps.model.LatLng latLng) {
        com.google.android.gms.maps.model.LatLng latLng2 = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "point must not be null.");
        double min = java.lang.Math.min(this.southwest.latitude, latLng2.latitude);
        double max = java.lang.Math.max(this.northeast.latitude, latLng2.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng2.longitude;
        if (!zza(d3)) {
            if (((d2 - d3) + 360.0d) % 360.0d < ((d3 - d) + 360.0d) % 360.0d) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(min, d2), new com.google.android.gms.maps.model.LatLng(max, d));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.maps.model.LatLng latLng = this.southwest;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, latLng, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static com.google.android.gms.maps.model.LatLngBounds.Builder builder() {
        return new com.google.android.gms.maps.model.LatLngBounds.Builder();
    }
}
