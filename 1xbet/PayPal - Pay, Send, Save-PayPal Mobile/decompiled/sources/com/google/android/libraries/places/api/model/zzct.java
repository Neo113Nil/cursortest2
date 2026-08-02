package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzct implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzcu((android.os.ParcelUuid) parcel.readParcelable(com.google.android.libraries.places.api.model.AutocompleteSessionToken.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzcu[i];
    }

    zzct() {
    }
}
