package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzez implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzfa(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, java.lang.Double.valueOf(parcel.readDouble()), (com.google.android.libraries.places.api.model.AuthorAttribution) parcel.readParcelable(com.google.android.libraries.places.api.model.Review.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (android.net.Uri) parcel.readParcelable(com.google.android.libraries.places.api.model.Review.class.getClassLoader()), (com.google.android.libraries.places.api.model.LocalDate) parcel.readParcelable(com.google.android.libraries.places.api.model.Review.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzfa[i];
    }

    zzez() {
    }
}
