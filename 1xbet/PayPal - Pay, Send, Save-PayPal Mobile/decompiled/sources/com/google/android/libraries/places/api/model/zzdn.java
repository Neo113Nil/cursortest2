package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdn implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzdo(parcel.readArrayList(com.google.android.libraries.places.api.model.FuelOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzdo[i];
    }

    zzdn() {
    }
}
