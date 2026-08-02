package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzer implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzes((com.google.android.libraries.places.api.model.Place) parcel.readParcelable(com.google.android.libraries.places.api.model.PlaceLikelihood.class.getClassLoader()), parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzes[i];
    }

    zzer() {
    }
}
