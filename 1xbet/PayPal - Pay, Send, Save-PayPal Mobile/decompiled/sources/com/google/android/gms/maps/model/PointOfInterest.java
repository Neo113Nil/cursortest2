package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class PointOfInterest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PointOfInterest> CREATOR = new com.google.android.gms.maps.model.zzs();
    public final com.google.android.gms.maps.model.LatLng latLng;

    /* renamed from: name, reason: collision with root package name */
    public final java.lang.String f3779name;
    public final java.lang.String placeId;

    public PointOfInterest(com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.f3779name = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.maps.model.LatLng latLng = this.latLng;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, latLng, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.placeId, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.f3779name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
