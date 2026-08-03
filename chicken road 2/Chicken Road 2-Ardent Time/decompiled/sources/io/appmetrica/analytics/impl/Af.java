package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Af implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.Bundle readBundle = parcel.readBundle(io.appmetrica.analytics.impl.B6.class.getClassLoader());
        return new io.appmetrica.analytics.impl.Bf((android.content.ContentValues) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (android.os.ResultReceiver) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        return new io.appmetrica.analytics.impl.Bf[i2];
    }
}
