package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.InterfaceC0391w0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.La, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631La extends D5 implements InterfaceC0638Ma {
    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void B2(InterfaceC2360a interfaceC2360a, Q2.a1 a1Var, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, a1Var);
        F5.c(N5, x02);
        N5.writeString(str);
        N5.writeString(str2);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final boolean G() {
        Parcel Y4 = Y(N(), 22);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void G0(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 30);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final boolean I() {
        Parcel Y4 = Y(N(), 13);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void K() {
        d1(N(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C0673Ra M() {
        C0673Ra c0673Ra;
        Parcel Y4 = Y(N(), 15);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0673Ra = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c0673Ra = queryLocalInterface instanceof C0673Ra ? (C0673Ra) queryLocalInterface : new C0673Ra(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 0);
        }
        Y4.recycle();
        return c0673Ra;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void P1(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void R1(InterfaceC2360a interfaceC2360a, InterfaceC0567Cc interfaceC0567Cc, List list) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC0567Cc);
        N5.writeStringList(list);
        d1(N5, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void R2(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, x02);
        N5.writeString(str);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C0680Sa U() {
        C0680Sa c0680Sa;
        Parcel Y4 = Y(N(), 16);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0680Sa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c0680Sa = queryLocalInterface instanceof C0680Sa ? (C0680Sa) queryLocalInterface : new C0680Sa(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 0);
        }
        Y4.recycle();
        return c0680Sa;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void U0(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa, B8 b8, ArrayList arrayList) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, x02);
        N5.writeString(str);
        N5.writeString(str2);
        F5.e(N5, interfaceC0659Pa);
        F5.c(N5, b8);
        N5.writeStringList(arrayList);
        d1(N5, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void V() {
        d1(N(), 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void b0() {
        d1(N(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void b1(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, x02);
        N5.writeString(str);
        N5.writeString(str2);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void c2(InterfaceC2360a interfaceC2360a, Q2.X0 x02, InterfaceC0567Cc interfaceC0567Cc, String str) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, x02);
        N5.writeString(null);
        F5.e(N5, interfaceC0567Cc);
        N5.writeString(str);
        d1(N5, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void d3(InterfaceC2360a interfaceC2360a, Q2.a1 a1Var, Q2.X0 x02, String str, String str2, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, a1Var);
        F5.c(N5, x02);
        N5.writeString(str);
        N5.writeString(str2);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 35);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final InterfaceC0391w0 g() {
        Parcel Y4 = Y(N(), 26);
        InterfaceC0391w0 u32 = AbstractBinderC0389v0.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void g3(InterfaceC2360a interfaceC2360a, S9 s9, ArrayList arrayList) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.e(N5, s9);
        N5.writeTypedList(arrayList);
        d1(N5, 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C0666Qa h() {
        C0666Qa c0666Qa;
        Parcel Y4 = Y(N(), 36);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0666Qa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c0666Qa = queryLocalInterface instanceof C0666Qa ? (C0666Qa) queryLocalInterface : new C0666Qa(readStrongBinder);
        }
        Y4.recycle();
        return c0666Qa;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void i1(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, x02);
        N5.writeString(str);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 38);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final InterfaceC0694Ua k() {
        InterfaceC0694Ua c0687Ta;
        Parcel Y4 = Y(N(), 27);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0687Ta = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c0687Ta = queryLocalInterface instanceof InterfaceC0694Ua ? (InterfaceC0694Ua) queryLocalInterface : new C0687Ta(readStrongBinder);
        }
        Y4.recycle();
        return c0687Ta;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void k1() {
        d1(N(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C1651ub l() {
        Parcel Y4 = Y(N(), 34);
        C1651ub c1651ub = (C1651ub) F5.a(Y4, C1651ub.CREATOR);
        Y4.recycle();
        return c1651ub;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void l1(InterfaceC2360a interfaceC2360a, Q2.X0 x02, String str, InterfaceC0659Pa interfaceC0659Pa) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, x02);
        N5.writeString(str);
        F5.e(N5, interfaceC0659Pa);
        d1(N5, 28);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final InterfaceC2360a m() {
        return L1.a.q(Y(N(), 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void m1(boolean z3) {
        Parcel N5 = N();
        ClassLoader classLoader = F5.f8654a;
        N5.writeInt(z3 ? 1 : 0);
        d1(N5, 25);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void n() {
        d1(N(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final C1651ub o() {
        Parcel Y4 = Y(N(), 33);
        C1651ub c1651ub = (C1651ub) F5.a(Y4, C1651ub.CREATOR);
        Y4.recycle();
        return c1651ub;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void o0(Q2.X0 x02, String str) {
        Parcel N5 = N();
        F5.c(N5, x02);
        N5.writeString(str);
        d1(N5, 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void p3(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 37);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0638Ma
    public final void y1(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 39);
    }
}
