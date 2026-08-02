package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdw extends com.google.android.libraries.places.api.model.zzal {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzdw> CREATOR = new com.google.android.libraries.places.api.model.zzdv();

    zzdw(java.time.Duration duration, int i) {
        super(duration, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeSerializable(getDuration());
        parcel.writeInt(getDistanceMeters());
    }
}
