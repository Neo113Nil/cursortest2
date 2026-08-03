package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908y implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new io.appmetrica.analytics.screenshot.impl.C0909z(parcel.readByte() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.screenshot.impl.C0909z[i2];
    }
}
