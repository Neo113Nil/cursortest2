package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597Gb extends D5 implements InterfaceC0611Ib {
    public final InterfaceC0590Fb t1(BinderC2361b binderC2361b, BinderC0610Ia binderC0610Ia) {
        InterfaceC0590Fb c0582Eb;
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        F5.e(N5, binderC0610Ia);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 1);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0582Eb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c0582Eb = queryLocalInterface instanceof InterfaceC0590Fb ? (InterfaceC0590Fb) queryLocalInterface : new C0582Eb(readStrongBinder);
        }
        Y4.recycle();
        return c0582Eb;
    }
}
