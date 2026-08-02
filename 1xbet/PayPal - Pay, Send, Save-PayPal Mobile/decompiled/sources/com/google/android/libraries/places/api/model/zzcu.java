package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcu extends com.google.android.libraries.places.api.model.zzm {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzcu> CREATOR = new com.google.android.libraries.places.api.model.zzct();

    zzcu(android.os.ParcelUuid parcelUuid) {
        super(parcelUuid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(zza(), i);
    }
}
