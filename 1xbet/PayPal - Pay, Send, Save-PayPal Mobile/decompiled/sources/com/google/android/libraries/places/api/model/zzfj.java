package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfj implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.libraries.places.api.model.zzfk((com.google.android.libraries.places.api.model.Polyline) parcel.readParcelable(com.google.android.libraries.places.api.model.SearchAlongRouteParameters.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.libraries.places.api.model.zzfk[i];
    }

    zzfj() {
    }
}
