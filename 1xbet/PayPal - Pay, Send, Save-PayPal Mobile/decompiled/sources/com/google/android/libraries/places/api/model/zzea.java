package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzea extends com.google.android.libraries.places.api.model.zzap {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzea> CREATOR = new com.google.android.libraries.places.api.model.zzdz();

    zzea(int i, int i2) {
        super(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(getHours());
        parcel.writeInt(getMinutes());
    }
}
