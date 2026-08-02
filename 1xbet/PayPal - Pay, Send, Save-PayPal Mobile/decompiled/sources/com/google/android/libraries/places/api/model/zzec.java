package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzec extends com.google.android.libraries.places.api.model.zzar {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzec> CREATOR = new com.google.android.libraries.places.api.model.zzeb();

    zzec(java.lang.String str, java.lang.Long l, java.lang.Integer num) {
        super(str, l, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(getCurrencyCode());
        parcel.writeLong(getUnits().longValue());
        parcel.writeInt(getNanos().intValue());
    }
}
