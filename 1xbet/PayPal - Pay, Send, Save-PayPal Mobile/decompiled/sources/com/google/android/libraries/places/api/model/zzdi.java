package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdi extends com.google.android.libraries.places.api.model.zzz {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdi> CREATOR = new com.google.android.libraries.places.api.model.zzdh();

    zzdi(java.lang.Double d, java.util.List list) {
        super(d, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getMinimumChargingRateKw() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getMinimumChargingRateKw().doubleValue());
        }
        parcel.writeList(getConnectorTypes());
    }
}
