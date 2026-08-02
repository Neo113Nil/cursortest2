package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1608td extends D5 implements InterfaceC1698vd {
    public final InterfaceC1563sd t1(BinderC2361b binderC2361b, BinderC0610Ia binderC0610Ia) {
        InterfaceC1563sd c1474qd;
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        F5.e(N5, binderC0610Ia);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 2);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c1474qd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c1474qd = queryLocalInterface instanceof InterfaceC1563sd ? (InterfaceC1563sd) queryLocalInterface : new C1474qd(readStrongBinder);
        }
        Y4.recycle();
        return c1474qd;
    }
}
