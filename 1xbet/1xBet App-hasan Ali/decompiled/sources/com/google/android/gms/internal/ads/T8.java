package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class T8 extends D5 implements U8 {
    public T8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 0);
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final boolean O(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        Parcel Y4 = Y(N5, 17);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final boolean T(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        Parcel Y4 = Y(N5, 10);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final String e() {
        Parcel Y4 = Y(N(), 4);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.U8
    public final InterfaceC2360a g() {
        return L1.a.q(Y(N(), 9));
    }
}
