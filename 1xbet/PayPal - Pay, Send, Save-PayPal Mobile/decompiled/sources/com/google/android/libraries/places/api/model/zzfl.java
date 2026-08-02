package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfl implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzfm((com.google.android.libraries.places.api.model.LocalDate) parcel.readParcelable(com.google.android.libraries.places.api.model.SpecialDay.class.getClassLoader()), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzfm[i];
    }

    zzfl() {
    }
}
