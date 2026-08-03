package io.appmetrica.analytics.internal;

/* loaded from: classes.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new io.appmetrica.analytics.internal.CounterConfiguration((android.content.ContentValues) parcel.readBundle(io.appmetrica.analytics.impl.B6.class.getClassLoader()).getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data"), 0);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.internal.CounterConfiguration[i2];
    }
}
