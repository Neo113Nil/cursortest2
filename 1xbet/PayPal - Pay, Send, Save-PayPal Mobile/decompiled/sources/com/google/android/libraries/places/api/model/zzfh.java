package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfh implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzfi(parcel.readArrayList(com.google.android.libraries.places.api.model.RoutingSummary.class.getClassLoader()), (android.net.Uri) parcel.readParcelable(com.google.android.libraries.places.api.model.RoutingSummary.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzfi[i];
    }

    zzfh() {
    }
}
