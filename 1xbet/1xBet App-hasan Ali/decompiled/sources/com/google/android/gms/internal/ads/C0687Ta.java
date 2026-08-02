package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Ta, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687Ta extends D5 implements InterfaceC0694Ua {
    public C0687Ta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String A() {
        Parcel Y4 = Y(N(), 2);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void C1(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 20);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final boolean D() {
        Parcel Y4 = Y(N(), 17);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void S0(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final double b() {
        Parcel Y4 = Y(N(), 8);
        double readDouble = Y4.readDouble();
        Y4.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final float c() {
        Parcel Y4 = Y(N(), 23);
        float readFloat = Y4.readFloat();
        Y4.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final Bundle e() {
        Parcel Y4 = Y(N(), 16);
        Bundle bundle = (Bundle) F5.a(Y4, Bundle.CREATOR);
        Y4.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final boolean e0() {
        Parcel Y4 = Y(N(), 18);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final float f() {
        Parcel Y4 = Y(N(), 25);
        float readFloat = Y4.readFloat();
        Y4.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final float g() {
        Parcel Y4 = Y(N(), 24);
        float readFloat = Y4.readFloat();
        Y4.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC0391w0 h() {
        Parcel Y4 = Y(N(), 11);
        InterfaceC0391w0 u32 = AbstractBinderC0389v0.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final E8 k() {
        Parcel Y4 = Y(N(), 12);
        E8 u32 = D8.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC2360a l() {
        return L1.a.q(Y(N(), 13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC2360a m() {
        return L1.a.q(Y(N(), 14));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final InterfaceC2360a n() {
        return L1.a.q(Y(N(), 15));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final I8 o() {
        Parcel Y4 = Y(N(), 5);
        I8 u32 = BinderC1865z8.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String r() {
        Parcel Y4 = Y(N(), 7);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String s() {
        Parcel Y4 = Y(N(), 4);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String t() {
        Parcel Y4 = Y(N(), 6);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String u() {
        Parcel Y4 = Y(N(), 9);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void v() {
        d1(N(), 19);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final String w() {
        Parcel Y4 = Y(N(), 10);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final void x0(InterfaceC2360a interfaceC2360a, InterfaceC2360a interfaceC2360a2, InterfaceC2360a interfaceC2360a3) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC2360a2);
        F5.e(N5, interfaceC2360a3);
        d1(N5, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0694Ua
    public final List y() {
        Parcel Y4 = Y(N(), 3);
        ArrayList readArrayList = Y4.readArrayList(F5.f8654a);
        Y4.recycle();
        return readArrayList;
    }
}
