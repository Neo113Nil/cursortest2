package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzck extends com.google.android.libraries.places.api.model.zze {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzck> CREATOR = new com.google.android.libraries.places.api.model.zzcj();

    zzck(java.util.List list) {
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
