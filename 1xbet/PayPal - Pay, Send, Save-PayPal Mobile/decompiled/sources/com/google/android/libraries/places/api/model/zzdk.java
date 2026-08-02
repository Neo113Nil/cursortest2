package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdk extends com.google.android.libraries.places.api.model.zzaa {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdk> CREATOR = new com.google.android.libraries.places.api.model.zzdj();

    zzdk(java.lang.String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(getEncodedPolyline());
    }
}
