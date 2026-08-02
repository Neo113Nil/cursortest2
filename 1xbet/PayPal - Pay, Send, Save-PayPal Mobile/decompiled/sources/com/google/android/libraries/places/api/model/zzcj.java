package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzcj implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzck(parcel.readArrayList(com.google.android.libraries.places.api.model.AddressComponents.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzck[i];
    }

    zzcj() {
    }
}
