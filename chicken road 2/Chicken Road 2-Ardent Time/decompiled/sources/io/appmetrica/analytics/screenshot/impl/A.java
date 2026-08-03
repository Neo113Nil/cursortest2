package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class A implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        boolean z2 = parcel.readByte() != 0;
        java.util.List createStringArrayList = parcel.createStringArrayList();
        if (createStringArrayList == null) {
            createStringArrayList = i1.C0199r.f3325a;
        }
        return new io.appmetrica.analytics.screenshot.impl.B(z2, createStringArrayList, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.screenshot.impl.B[i2];
    }
}
