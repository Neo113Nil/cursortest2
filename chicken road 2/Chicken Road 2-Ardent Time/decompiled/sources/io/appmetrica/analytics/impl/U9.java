package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U9 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object readValue = parcel.readValue(java.lang.Boolean.TYPE.getClassLoader());
        return new io.appmetrica.analytics.impl.V9(readValue instanceof java.lang.Boolean ? (java.lang.Boolean) readValue : null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.Companion.from(parcel.readString()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.impl.V9[i2];
    }
}
