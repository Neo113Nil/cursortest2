package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzdq((com.google.android.libraries.places.api.model.FuelPrice.FuelType) parcel.readParcelable(com.google.android.libraries.places.api.model.FuelPrice.class.getClassLoader()), (com.google.android.libraries.places.api.model.Money) parcel.readParcelable(com.google.android.libraries.places.api.model.FuelPrice.class.getClassLoader()), (java.time.Instant) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzdq[i];
    }

    zzdp() {
    }
}
