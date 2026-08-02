package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdq extends com.google.android.libraries.places.api.model.zzag {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdq> CREATOR = new com.google.android.libraries.places.api.model.zzdp();

    zzdq(com.google.android.libraries.places.api.model.FuelPrice.FuelType fuelType, com.google.android.libraries.places.api.model.Money money, java.time.Instant instant) {
        super(fuelType, money, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getType(), i);
        parcel.writeParcelable(getPrice(), i);
        parcel.writeSerializable(getUpdateTime());
    }
}
