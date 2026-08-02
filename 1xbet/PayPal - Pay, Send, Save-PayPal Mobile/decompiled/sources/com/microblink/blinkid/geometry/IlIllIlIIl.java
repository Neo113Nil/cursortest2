package com.microblink.blinkid.geometry;

/* loaded from: classes10.dex */
public final class IlIllIlIIl implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.microblink.blinkid.geometry.PointSet(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.microblink.blinkid.geometry.PointSet[i];
    }
}
