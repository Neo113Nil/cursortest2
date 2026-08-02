package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzch implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzci(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readArrayList(com.google.android.libraries.places.api.model.AddressComponent.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzci[i];
    }

    zzch() {
    }
}
