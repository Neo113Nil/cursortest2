package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.Parcel;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382ob extends D5 implements InterfaceC1427pb {
    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void B1(InterfaceC2360a interfaceC2360a, String str, Bundle bundle, Bundle bundle2, Q2.a1 a1Var, InterfaceC1516rb interfaceC1516rb) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        N5.writeString(str);
        F5.c(N5, bundle);
        F5.c(N5, bundle2);
        F5.c(N5, a1Var);
        F5.e(N5, interfaceC1516rb);
        d1(N5, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void D1(String str, String str2, Q2.X0 x02, BinderC2361b binderC2361b, Qn qn, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, binderC2361b);
        F5.e(N5, qn);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 18);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void M1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC0934eb interfaceC0934eb, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC0934eb);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final boolean O(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        Parcel Y4 = Y(N5, 24);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void O1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1024gb interfaceC1024gb, InterfaceC0659Pa interfaceC0659Pa, Q2.a1 a1Var) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC1024gb);
        F5.e(N5, interfaceC0659Pa);
        F5.c(N5, a1Var);
        d1(N5, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void O2(String str) {
        Parcel N5 = N();
        N5.writeString(str);
        d1(N5, 19);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final boolean Q2(BinderC2361b binderC2361b) {
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        Parcel Y4 = Y(N5, 17);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final boolean T(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        Parcel Y4 = Y(N5, 15);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void a1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1024gb interfaceC1024gb, InterfaceC0659Pa interfaceC0659Pa, Q2.a1 a1Var) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC1024gb);
        F5.e(N5, interfaceC0659Pa);
        F5.c(N5, a1Var);
        d1(N5, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final InterfaceC0391w0 b() {
        Parcel Y4 = Y(N(), 5);
        InterfaceC0391w0 u32 = AbstractBinderC0389v0.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final C1651ub c() {
        Parcel Y4 = Y(N(), 2);
        C1651ub c1651ub = (C1651ub) F5.a(Y4, C1651ub.CREATOR);
        Y4.recycle();
        return c1651ub;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final C1651ub f() {
        Parcel Y4 = Y(N(), 3);
        C1651ub c1651ub = (C1651ub) F5.a(Y4, C1651ub.CREATOR);
        Y4.recycle();
        return c1651ub;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void g2(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1114ib interfaceC1114ib, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC1114ib);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void j3(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1202kb interfaceC1202kb, InterfaceC0659Pa interfaceC0659Pa, B8 b8) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC1202kb);
        F5.e(N5, interfaceC0659Pa);
        F5.c(N5, b8);
        d1(N5, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void l2(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1337nb interfaceC1337nb, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC1337nb);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 16);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void r1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1337nb interfaceC1337nb, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        F5.c(N5, x02);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC1337nb);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 20);
    }
}
