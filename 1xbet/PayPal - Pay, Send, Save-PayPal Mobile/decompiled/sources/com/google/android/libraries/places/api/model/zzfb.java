package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfb implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzfc(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (android.net.Uri) parcel.readParcelable(com.google.android.libraries.places.api.model.ReviewSummary.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (android.net.Uri) parcel.readParcelable(com.google.android.libraries.places.api.model.ReviewSummary.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzfc[i];
    }

    zzfb() {
    }
}
