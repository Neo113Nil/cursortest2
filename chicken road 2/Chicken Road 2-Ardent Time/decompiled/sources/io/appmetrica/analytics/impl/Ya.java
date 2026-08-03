package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ya implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new io.appmetrica.analytics.internal.IdentifiersResult(parcel.readString(), io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.from(parcel.readString()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.internal.IdentifiersResult[i2];
    }
}
