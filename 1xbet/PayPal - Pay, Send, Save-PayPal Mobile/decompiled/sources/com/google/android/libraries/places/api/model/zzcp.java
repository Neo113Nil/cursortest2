package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzcq(parcel.readString(), parcel.readInt() == 0 ? java.lang.Integer.valueOf(parcel.readInt()) : null, parcel.readArrayList(com.google.android.libraries.places.api.model.AutocompletePrediction.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readArrayList(com.google.android.libraries.places.api.model.AutocompletePrediction.class.getClassLoader()), parcel.readArrayList(com.google.android.libraries.places.api.model.AutocompletePrediction.class.getClassLoader()), parcel.readArrayList(com.google.android.libraries.places.api.model.AutocompletePrediction.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzcq[i];
    }

    zzcp() {
    }
}
