package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcs extends com.google.android.libraries.places.api.model.zzl {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzcs> CREATOR = new com.google.android.libraries.places.api.model.zzcr();

    zzcs(int i, int i2) {
        super(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
    }
}
