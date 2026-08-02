package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfo extends com.google.android.libraries.places.api.model.zzcb {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfo> CREATOR = new com.google.android.libraries.places.api.model.zzfn();

    zzfo(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(getId());
        parcel.writeString(getName());
    }
}
