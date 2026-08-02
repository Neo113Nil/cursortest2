package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcy extends com.google.android.libraries.places.api.model.zzp {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzcy> CREATOR = new com.google.android.libraries.places.api.model.zzcx();

    zzcy(com.google.android.libraries.places.api.model.EVConnectorType eVConnectorType, java.lang.Double d, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.time.Instant instant) {
        super(eVConnectorType, d, num, num2, num3, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(getType(), i);
        parcel.writeDouble(getMaxChargeRateKw().doubleValue());
        parcel.writeInt(getCount().intValue());
        if (getAvailableCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getAvailableCount().intValue());
        }
        if (getOutOfServiceCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getOutOfServiceCount().intValue());
        }
        if (getAvailabilityLastUpdateTime() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(getAvailabilityLastUpdateTime());
        }
    }
}
