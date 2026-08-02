package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzev implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzew((com.google.android.libraries.places.api.model.Money) parcel.readParcelable(com.google.android.libraries.places.api.model.zzgf.class.getClassLoader()), (com.google.android.libraries.places.api.model.Money) parcel.readParcelable(com.google.android.libraries.places.api.model.zzgf.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzew[i];
    }

    zzev() {
    }
}
