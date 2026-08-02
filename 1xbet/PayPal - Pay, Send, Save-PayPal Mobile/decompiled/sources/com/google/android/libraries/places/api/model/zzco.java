package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzco extends com.google.android.libraries.places.api.model.zzh {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzco> CREATOR = new com.google.android.libraries.places.api.model.zzcn();

    zzco(java.util.List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(asList());
    }
}
