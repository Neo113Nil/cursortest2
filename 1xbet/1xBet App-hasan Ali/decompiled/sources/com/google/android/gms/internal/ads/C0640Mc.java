package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640Mc extends D5 {
    public final IBinder t1(BinderC2361b binderC2361b, String str, BinderC0610Ia binderC0610Ia) {
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        N5.writeString(str);
        F5.e(N5, binderC0610Ia);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 1);
        IBinder readStrongBinder = Y4.readStrongBinder();
        Y4.recycle();
        return readStrongBinder;
    }
}
