package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdf implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzdg(java.lang.Integer.valueOf(parcel.readInt()), parcel.readArrayList(com.google.android.libraries.places.api.model.EVChargeOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzdg[i];
    }

    zzdf() {
    }
}
