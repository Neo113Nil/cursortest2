package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final /* synthetic */ class Ax {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7741a;

    public /* synthetic */ Ax(int i) {
        this.f7741a = i;
    }

    public final AbstractC1400ot a(AbstractC1314mx abstractC1314mx, Integer num) {
        switch (this.f7741a) {
            case 0:
                Ex ex = (Ex) abstractC1314mx;
                C0824bz c0824bz = Bx.f7917a;
                int i = ex.f8629a;
                if (i != 16 && i != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                m2.g gVar = new m2.g(15);
                gVar.f17994l = ex;
                gVar.f17997o = num;
                gVar.f17995m = Dp.p(i);
                gVar.f17996n = Dp.p(ex.f8630b);
                return gVar.C();
            case 1:
                Jx jx = (Jx) abstractC1314mx;
                C0824bz c0824bz2 = Hx.f9501a;
                int i5 = jx.f10084a;
                if (i5 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                Fx fx = new Fx(false);
                fx.f9145m = jx;
                fx.f9144l = num;
                fx.f9143k = Dp.p(i5);
                return fx.e();
            case 2:
                Mx mx = (Mx) abstractC1314mx;
                C0824bz c0824bz3 = Lx.f10559a;
                int i6 = mx.f10753a;
                if (i6 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                Fx fx2 = new Fx(false);
                fx2.f9145m = mx;
                fx2.f9144l = num;
                fx2.f9143k = Dp.p(i6);
                return fx2.f();
            case 3:
                Px px = (Px) abstractC1314mx;
                Fx fx3 = new Fx(false);
                fx3.f9145m = px;
                fx3.f9144l = num;
                fx3.f9143k = Dp.p(px.f11136a);
                return fx3.g();
            case 4:
                C0824bz c0824bz4 = Rx.f11471a;
                return Qx.o0(((Sx) abstractC1314mx).f11603a, Dp.p(32), num);
            case 5:
                return Wx.o0((Xx) abstractC1314mx, num);
            case 6:
                return Zx.o0((C0779ay) abstractC1314mx, num);
            case 7:
                return C0957ey.o0((C1002fy) abstractC1314mx, Dp.p(32), num);
            case 8:
                C0824bz c0824bz5 = AbstractC1092hy.f13837a;
                return C1047gy.o0(((C1135iy) abstractC1314mx).f14022a, Dp.p(32), num);
            case 9:
                Py py = Py.f11138b;
                C1181jz c1181jz = ((Ly) abstractC1314mx).f10564a;
                Cy cy = Cy.f8127d;
                BA ba = c1181jz.f14197b;
                Iy c5 = cy.c(ba.B());
                if (!((Boolean) cy.f8129b.get(ba.B())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                AbstractC1823yB A3 = ba.A();
                c5.getClass();
                AA w5 = BA.w();
                w5.j(c5.f9654a);
                w5.k(A3);
                w5.i(UA.f11745o);
                BA ba2 = (BA) w5.b();
                C1181jz c1181jz2 = new C1181jz(ba2, AbstractC1451pz.a(ba2.B()));
                Vy vy = Vy.f11970b;
                C1136iz c1136iz = (C1136iz) vy.c(Py.f11138b.a(vy.b(c1181jz2), null));
                C1822yA w6 = C1867zA.w();
                w6.e();
                C1867zA.C((C1867zA) w6.f10141l, c1136iz.f14023a);
                w6.e();
                C1867zA.D((C1867zA) w6.f10141l, c1136iz.f14025c);
                w6.e();
                C1867zA.B((C1867zA) w6.f10141l, c1136iz.f14026d);
                C1867zA c1867zA = (C1867zA) w6.b();
                return new Ky(C1136iz.a(c1867zA.A(), c1867zA.z(), c1867zA.x(), ba.z(), num));
            case 10:
                C1630tz c1630tz = (C1630tz) abstractC1314mx;
                int i7 = c1630tz.f15743a;
                if (i7 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                Fx fx4 = new Fx(false);
                fx4.f9145m = c1630tz;
                fx4.f9143k = Dp.p(i7);
                fx4.f9144l = num;
                return fx4.h();
            default:
                C1900zz c1900zz = (C1900zz) abstractC1314mx;
                Fx fx5 = new Fx(false);
                fx5.f9145m = c1900zz;
                fx5.f9143k = Dp.p(c1900zz.f16798a);
                fx5.f9144l = num;
                return fx5.j();
        }
    }
}
