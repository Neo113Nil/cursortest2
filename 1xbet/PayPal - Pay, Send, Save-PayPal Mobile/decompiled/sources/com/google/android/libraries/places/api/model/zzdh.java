package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzdh implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzdi(parcel.readInt() == 0 ? java.lang.Double.valueOf(parcel.readDouble()) : null, parcel.readArrayList(com.google.android.libraries.places.api.model.EVSearchOptions.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzdi[i];
    }

    zzdh() {
    }
}
