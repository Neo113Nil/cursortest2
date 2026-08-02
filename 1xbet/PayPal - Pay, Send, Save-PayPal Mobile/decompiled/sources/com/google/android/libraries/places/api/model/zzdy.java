package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdy extends com.google.android.libraries.places.api.model.zzan {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdy> CREATOR = new com.google.android.libraries.places.api.model.zzdx();

    zzdy(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(getYear());
        parcel.writeInt(getMonth());
        parcel.writeInt(getDay());
    }
}
