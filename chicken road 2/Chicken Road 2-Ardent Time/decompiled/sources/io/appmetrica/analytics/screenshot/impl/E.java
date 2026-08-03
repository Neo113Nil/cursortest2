package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class E implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new io.appmetrica.analytics.screenshot.impl.F((io.appmetrica.analytics.screenshot.impl.C0909z) parcel.readParcelable(io.appmetrica.analytics.screenshot.impl.C0909z.class.getClassLoader()), (io.appmetrica.analytics.screenshot.impl.H) parcel.readParcelable(io.appmetrica.analytics.screenshot.impl.H.class.getClassLoader()), (io.appmetrica.analytics.screenshot.impl.B) parcel.readParcelable(io.appmetrica.analytics.screenshot.impl.B.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.screenshot.impl.F[i2];
    }
}
