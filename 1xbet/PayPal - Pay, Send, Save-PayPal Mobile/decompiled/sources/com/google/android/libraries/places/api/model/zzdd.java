package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdd implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzde(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(com.google.android.libraries.places.api.model.ContentBlock.class.getClassLoader()), parcel.readArrayList(com.google.android.libraries.places.api.model.ContentBlock.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzde[i];
    }

    zzdd() {
    }
}
