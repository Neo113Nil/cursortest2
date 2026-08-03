package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class C implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new io.appmetrica.analytics.screenshot.impl.D(parcel.readByte() != 0, (io.appmetrica.analytics.screenshot.impl.F) parcel.readParcelable(io.appmetrica.analytics.screenshot.impl.F.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.screenshot.impl.D[i2];
    }
}
