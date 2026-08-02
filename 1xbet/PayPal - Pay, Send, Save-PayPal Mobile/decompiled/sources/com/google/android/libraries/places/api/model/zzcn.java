package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcn implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzco(parcel.readArrayList(com.google.android.libraries.places.api.model.AuthorAttributions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzco[i];
    }

    zzcn() {
    }
}
