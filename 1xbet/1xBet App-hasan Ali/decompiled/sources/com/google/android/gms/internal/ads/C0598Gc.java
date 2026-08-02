package com.google.android.gms.internal.ads;

import Q2.InterfaceC0383s0;
import android.os.IBinder;
import android.os.Parcel;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598Gc extends D5 implements InterfaceC0612Ic {
    public C0598Gc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void L0(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void V1(Q2.X0 x02, InterfaceC0661Pc interfaceC0661Pc) {
        Parcel N5 = N();
        F5.c(N5, x02);
        F5.e(N5, interfaceC0661Pc);
        d1(N5, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void V2(InterfaceC0633Lc interfaceC0633Lc) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0633Lc);
        d1(N5, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final void f1(Q2.X0 x02, InterfaceC0661Pc interfaceC0661Pc) {
        Parcel N5 = N();
        F5.c(N5, x02);
        F5.e(N5, interfaceC0661Pc);
        d1(N5, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612Ic
    public final InterfaceC0383s0 i() {
        Parcel Y4 = Y(N(), 12);
        InterfaceC0383s0 u32 = Ih.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }
}
