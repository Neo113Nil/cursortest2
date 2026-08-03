package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class G implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new io.appmetrica.analytics.screenshot.impl.H(parcel.readByte() != 0, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.screenshot.impl.H[i2];
    }
}
