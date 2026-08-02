package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC1101i6;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class I extends D5 implements K {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 0);
    }

    @Override // Q2.K
    public final void D() {
        d1(N(), 6);
    }

    @Override // Q2.K
    public final void F1(V0 v02) {
        throw null;
    }

    @Override // Q2.K
    public final void G1(InterfaceC0374n0 interfaceC0374n0) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0374n0);
        d1(N5, 42);
    }

    @Override // Q2.K
    public final void H2(InterfaceC0386u interfaceC0386u) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0386u);
        d1(N5, 20);
    }

    @Override // Q2.K
    public final void K1(d1 d1Var) {
        Parcel N5 = N();
        F5.c(N5, d1Var);
        d1(N5, 39);
    }

    @Override // Q2.K
    public final void O0(InterfaceC0392x interfaceC0392x) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0392x);
        d1(N5, 7);
    }

    @Override // Q2.K
    public final void P2(InterfaceC1101i6 interfaceC1101i6) {
        Parcel N5 = N();
        F5.e(N5, interfaceC1101i6);
        d1(N5, 40);
    }

    @Override // Q2.K
    public final void U1(boolean z3) {
        Parcel N5 = N();
        ClassLoader classLoader = F5.f8654a;
        N5.writeInt(z3 ? 1 : 0);
        d1(N5, 34);
    }

    @Override // Q2.K
    public final void X0(W w5) {
        Parcel N5 = N();
        F5.e(N5, w5);
        d1(N5, 45);
    }

    @Override // Q2.K
    public final void b2(X0 x02, A a5) {
        Parcel N5 = N();
        F5.c(N5, x02);
        F5.e(N5, a5);
        d1(N5, 43);
    }

    @Override // Q2.K
    public final a1 f() {
        Parcel Y4 = Y(N(), 12);
        a1 a1Var = (a1) F5.a(Y4, a1.CREATOR);
        Y4.recycle();
        return a1Var;
    }

    @Override // Q2.K
    public final void h3(Q q5) {
        Parcel N5 = N();
        F5.e(N5, q5);
        d1(N5, 8);
    }

    @Override // Q2.K
    public final void j1() {
        d1(N(), 5);
    }

    @Override // Q2.K
    public final InterfaceC0383s0 k() {
        InterfaceC0383s0 c0381r0;
        Parcel Y4 = Y(N(), 41);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0381r0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c0381r0 = queryLocalInterface instanceof InterfaceC0383s0 ? (InterfaceC0383s0) queryLocalInterface : new C0381r0(readStrongBinder);
        }
        Y4.recycle();
        return c0381r0;
    }

    @Override // Q2.K
    public final InterfaceC2360a m() {
        return L1.a.q(Y(N(), 1));
    }

    @Override // Q2.K
    public final void m3(boolean z3) {
        Parcel N5 = N();
        ClassLoader classLoader = F5.f8654a;
        N5.writeInt(0);
        d1(N5, 22);
    }

    @Override // Q2.K
    public final void n3(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 44);
    }

    @Override // Q2.K
    public final InterfaceC0391w0 o() {
        InterfaceC0391w0 c0385t0;
        Parcel Y4 = Y(N(), 26);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0385t0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c0385t0 = queryLocalInterface instanceof InterfaceC0391w0 ? (InterfaceC0391w0) queryLocalInterface : new C0385t0(readStrongBinder);
        }
        Y4.recycle();
        return c0385t0;
    }

    @Override // Q2.K
    public final String t() {
        Parcel Y4 = Y(N(), 31);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // Q2.K
    public final void v() {
        d1(N(), 2);
    }

    @Override // Q2.K
    public final boolean v0(X0 x02) {
        Parcel N5 = N();
        F5.c(N5, x02);
        Parcel Y4 = Y(N5, 4);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // Q2.K
    public final void w0(a1 a1Var) {
        Parcel N5 = N();
        F5.c(N5, a1Var);
        d1(N5, 13);
    }
}
