package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class K8 extends D5 implements N8 {
    public K8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 0);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final InterfaceC2360a E(String str) {
        Parcel N5 = N();
        N5.writeString(str);
        return L1.a.q(Y(N5, 2));
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void I1(String str, InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        N5.writeString(str);
        F5.e(N5, interfaceC2360a);
        d1(N5, 1);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void K0(G8 g8) {
        Parcel N5 = N();
        ClassLoader classLoader = F5.f8654a;
        N5.writeStrongBinder(null);
        d1(N5, 8);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void L2(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 6);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void c1(BinderC2361b binderC2361b, int i) {
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        N5.writeInt(i);
        d1(N5, 5);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void d2(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 3);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void g1(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 9);
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void i0(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 7);
    }
}
