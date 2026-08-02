package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfi extends com.google.android.libraries.places.api.model.zzbw {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfi> CREATOR = new com.google.android.libraries.places.api.model.zzfh();

    zzfi(java.util.List list, android.net.Uri uri) {
        super(list, uri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(getLegs());
        parcel.writeParcelable(getDirectionsUri(), i);
    }
}
