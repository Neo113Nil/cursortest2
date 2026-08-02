package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzen implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzeo(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (com.google.android.libraries.places.api.model.AuthorAttributions) parcel.readParcelable(com.google.android.libraries.places.api.model.PhotoMetadata.class.getClassLoader()), (android.net.Uri) parcel.readParcelable(com.google.android.libraries.places.api.model.PhotoMetadata.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzeo[i];
    }

    zzen() {
    }
}
