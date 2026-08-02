package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzed implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzee((com.google.android.libraries.places.api.model.ContentBlock) parcel.readParcelable(com.google.android.libraries.places.api.model.NeighborhoodSummary.class.getClassLoader()), (com.google.android.libraries.places.api.model.ContentBlock) parcel.readParcelable(com.google.android.libraries.places.api.model.NeighborhoodSummary.class.getClassLoader()), (android.net.Uri) parcel.readParcelable(com.google.android.libraries.places.api.model.NeighborhoodSummary.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzee[i];
    }

    zzed() {
    }
}
