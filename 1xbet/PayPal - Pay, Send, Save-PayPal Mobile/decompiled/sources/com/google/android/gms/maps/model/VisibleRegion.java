package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class VisibleRegion extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.VisibleRegion> CREATOR = new com.google.android.gms.maps.model.zzak();
    public final com.google.android.gms.maps.model.LatLng farLeft;
    public final com.google.android.gms.maps.model.LatLng farRight;
    public final com.google.android.gms.maps.model.LatLngBounds latLngBounds;
    public final com.google.android.gms.maps.model.LatLng nearLeft;
    public final com.google.android.gms.maps.model.LatLng nearRight;

    public VisibleRegion(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2, com.google.android.gms.maps.model.LatLng latLng3, com.google.android.gms.maps.model.LatLng latLng4, com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.VisibleRegion)) {
            return false;
        }
        com.google.android.gms.maps.model.VisibleRegion visibleRegion = (com.google.android.gms.maps.model.VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("nearLeft", this.nearLeft).add("nearRight", this.nearRight).add("farLeft", this.farLeft).add("farRight", this.farRight).add("latLngBounds", this.latLngBounds).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.maps.model.LatLng latLng = this.nearLeft;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, latLng, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.nearRight, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.farLeft, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.farRight, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.latLngBounds, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
