package com.google.android.gms.internal.ads;

import A0.C0052p0;
import android.os.Handler;
import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public final /* synthetic */ class Aq implements InterfaceC1307mq, D3.a, InterfaceC1805xu, InterfaceC1760wu, InterfaceC0869cz, InterfaceC0780az, Yy, Hy, Fy {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7730k;

    public Aq(int i) {
        this.f7730k = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        switch (this.f7730k) {
            case 3:
                return -1;
            case 4:
                return -1;
            case 5:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0869cz, com.google.android.gms.internal.ads.Hy
    public C1136iz b(AbstractC1400ot abstractC1400ot) {
        switch (this.f7730k) {
            case 18:
                Wx wx = (Wx) abstractC1400ot;
                MA x5 = NA.x();
                OA w5 = PA.w();
                Xx xx = wx.f12130l;
                w5.e();
                PA.A((PA) w5.f10141l, xx.f12259a);
                PA pa = (PA) w5.b();
                x5.e();
                NA.B((NA) x5.f10141l, pa);
                return C1136iz.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((NA) x5.b()).b(), 5, Yx.b(wx.f12130l.f12260b), wx.f12131m);
            case 22:
                Zx zx = (Zx) abstractC1400ot;
                QA x6 = RA.x();
                TA b3 = AbstractC0868cy.b(zx.f12545l);
                x6.e();
                RA.B((RA) x6.f10141l, b3);
                return C1136iz.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((RA) x6.b()).b(), 5, AbstractC0868cy.c(zx.f12545l.f12736a), zx.f12546m);
            default:
                C1853yx c1853yx = (C1853yx) abstractC1400ot;
                Pz x7 = Qz.x();
                Tz x8 = Uz.x();
                Xz x9 = Yz.x();
                int i = c1853yx.f16505l.f8631c;
                x9.e();
                ((Yz) x9.f10141l).zzc = i;
                Yz yz = (Yz) x9.b();
                x8.e();
                Uz.C((Uz) x8.f10141l, yz);
                byte[] b5 = ((C1419pB) c1853yx.f16506m.f8377l).b();
                C1733wB r5 = AbstractC1823yB.r(b5, 0, b5.length);
                x8.e();
                ((Uz) x8.f10141l).zzf = r5;
                Uz uz = (Uz) x8.b();
                x7.e();
                Qz.C((Qz) x7.f10141l, uz);
                C1552sA x10 = C1597tA.x();
                Ex ex = c1853yx.f16505l;
                C1777xA c5 = AbstractC1180jy.c(ex);
                x10.e();
                C1597tA.E((C1597tA) x10.f10141l, c5);
                byte[] b6 = ((C1419pB) c1853yx.f16507n.f8377l).b();
                C1733wB r6 = AbstractC1823yB.r(b6, 0, b6.length);
                x10.e();
                ((C1597tA) x10.f10141l).zzf = r6;
                C1597tA c1597tA = (C1597tA) x10.b();
                x7.e();
                Qz.D((Qz) x7.f10141l, c1597tA);
                return C1136iz.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((Qz) x7.b()).b(), 2, AbstractC1180jy.d(ex.f8633e), c1853yx.f16509p);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1760wu
    public Iterator c(Hq hq, CharSequence charSequence) {
        return new C1625tu(charSequence);
    }

    @Override // com.google.android.gms.internal.ads.Fy
    public AbstractC1400ot d(C1136iz c1136iz) {
        switch (this.f7730k) {
            case 19:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB = c1136iz.f14025c;
                    GB gb = GB.f9177a;
                    C1285mC c1285mC = C1285mC.f14484c;
                    NA y5 = NA.y(abstractC1823yB, GB.f9178b);
                    if (y5.w() == 0) {
                        return Wx.o0(new Xx(y5.z().z(), Yx.a(c1136iz.f14027e)), c1136iz.f);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(y5)));
                } catch (XB e3) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e3);
                }
            case 23:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB2 = c1136iz.f14025c;
                    GB gb2 = GB.f9177a;
                    C1285mC c1285mC2 = C1285mC.f14484c;
                    RA y6 = RA.y(abstractC1823yB2, GB.f9178b);
                    if (y6.w() == 0) {
                        return Zx.o0(AbstractC0868cy.a(y6.z(), c1136iz.f14027e), c1136iz.f);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(y6)));
                } catch (XB e5) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e5);
                }
            default:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB3 = c1136iz.f14025c;
                    GB gb3 = GB.f9177a;
                    C1285mC c1285mC3 = C1285mC.f14484c;
                    Qz y7 = Qz.y(abstractC1823yB3, GB.f9178b);
                    if (y7.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (y7.z().w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (y7.A().w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C1324n6 c1324n6 = new C1324n6(6);
                    c1324n6.c(y7.z().A().g());
                    c1324n6.h(y7.A().B().g());
                    c1324n6.m(y7.z().z().w());
                    c1324n6.o(y7.A().A().w());
                    c1324n6.f14582o = AbstractC1180jy.a(y7.A().A().x());
                    c1324n6.f14583p = AbstractC1180jy.b(c1136iz.f14027e);
                    Ex r5 = c1324n6.r();
                    m2.g gVar = new m2.g(15);
                    gVar.f17994l = r5;
                    gVar.f17995m = Dp.m(y7.z().A().c());
                    gVar.f17996n = Dp.m(y7.A().B().c());
                    gVar.f17997o = c1136iz.f;
                    return gVar.C();
                } catch (XB unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yy
    public AbstractC1314mx e(C1181jz c1181jz) {
        switch (this.f7730k) {
            case 17:
                BA ba = c1181jz.f14197b;
                if (!ba.B().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ba.B())));
                }
                try {
                    AbstractC1823yB A3 = ba.A();
                    GB gb = GB.f9177a;
                    C1285mC c1285mC = C1285mC.f14484c;
                    return new Xx(PA.y(A3, GB.f9178b).z(), Yx.a(ba.z()));
                } catch (XB e3) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e3);
                }
            case C1639u7.zzm /* 21 */:
                BA ba2 = c1181jz.f14197b;
                if (!ba2.B().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ba2.B())));
                }
                try {
                    AbstractC1823yB A5 = ba2.A();
                    GB gb2 = GB.f9177a;
                    C1285mC c1285mC2 = C1285mC.f14484c;
                    return AbstractC0868cy.a(TA.z(A5, GB.f9178b), ba2.z());
                } catch (XB e5) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e5);
                }
            default:
                BA ba3 = c1181jz.f14197b;
                if (!ba3.B().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(ba3.B())));
                }
                try {
                    AbstractC1823yB A6 = ba3.A();
                    GB gb3 = GB.f9177a;
                    C1285mC c1285mC3 = C1285mC.f14484c;
                    Sz x5 = Sz.x(A6, GB.f9178b);
                    if (x5.z().x() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1324n6 c1324n6 = new C1324n6(6);
                    c1324n6.c(x5.y().w());
                    c1324n6.h(x5.z().w());
                    c1324n6.m(x5.y().z().w());
                    c1324n6.o(x5.z().B().w());
                    c1324n6.f14582o = AbstractC1180jy.a(x5.z().B().x());
                    c1324n6.f14583p = AbstractC1180jy.b(ba3.z());
                    return c1324n6.r();
                } catch (XB e6) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e6);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0780az
    public C1181jz f(AbstractC1314mx abstractC1314mx) {
        switch (this.f7730k) {
            case 16:
                Xx xx = (Xx) abstractC1314mx;
                AA w5 = BA.w();
                w5.j("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                OA w6 = PA.w();
                String str = xx.f12259a;
                w6.e();
                PA.A((PA) w6.f10141l, str);
                w5.k(((PA) w6.b()).b());
                w5.i(Yx.b(xx.f12260b));
                return C1181jz.a((BA) w5.b());
            case 20:
                C0779ay c0779ay = (C0779ay) abstractC1314mx;
                AA w7 = BA.w();
                w7.j("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                w7.k(AbstractC0868cy.b(c0779ay).b());
                w7.i(AbstractC0868cy.c(c0779ay.f12736a));
                return C1181jz.a((BA) w7.b());
            default:
                Ex ex = (Ex) abstractC1314mx;
                AA w8 = BA.w();
                w8.j("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                Rz w9 = Sz.w();
                Vz x5 = Wz.x();
                Xz x6 = Yz.x();
                int i = ex.f8631c;
                x6.e();
                ((Yz) x6.f10141l).zzc = i;
                Yz yz = (Yz) x6.b();
                x5.e();
                Wz.B((Wz) x5.f10141l, yz);
                x5.e();
                ((Wz) x5.f10141l).zze = ex.f8629a;
                Wz wz = (Wz) x5.b();
                w9.e();
                Sz.A((Sz) w9.f10141l, wz);
                C1642uA y5 = C1687vA.y();
                C1777xA c5 = AbstractC1180jy.c(ex);
                y5.e();
                C1687vA.D((C1687vA) y5.f10141l, c5);
                y5.e();
                ((C1687vA) y5.f10141l).zze = ex.f8630b;
                C1687vA c1687vA = (C1687vA) y5.b();
                w9.e();
                Sz.B((Sz) w9.f10141l, c1687vA);
                w8.k(((Sz) w9.b()).b());
                w8.i(AbstractC1180jy.d(ex.f8633e));
                return C1181jz.a((BA) w8.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1307mq
    public void k(Object obj) {
        ((InterfaceC0633Lc) obj).b();
    }

    @Override // D3.a
    public Object q(D3.o oVar) {
        return Boolean.valueOf(oVar.d());
    }

    public /* synthetic */ Aq(int i, byte b3) {
        this.f7730k = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0869cz, com.google.android.gms.internal.ads.Hy
    public Object b(AbstractC1400ot abstractC1400ot) {
        byte[] b3;
        switch (this.f7730k) {
            case 8:
                int[] iArr = Jy.f10088b;
                C1136iz c1136iz = ((Ky) abstractC1400ot).f10288l;
                int i = iArr[AbstractC2462i.b(c1136iz.f14026d)];
                C1822yA w5 = C1867zA.w();
                w5.e();
                C1867zA.C((C1867zA) w5.f10141l, c1136iz.f14023a);
                w5.e();
                C1867zA.D((C1867zA) w5.f10141l, c1136iz.f14025c);
                w5.e();
                C1867zA.B((C1867zA) w5.f10141l, c1136iz.f14026d);
                InterfaceC0911dx interfaceC0911dx = (InterfaceC0911dx) AbstractC1449px.a((C1867zA) w5.b(), InterfaceC0911dx.class);
                UA ua = c1136iz.f14027e;
                int ordinal = ua.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            b3 = Wy.f12132a.b();
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(ua)));
                        }
                    }
                    b3 = Wy.a(c1136iz.f.intValue()).b();
                } else {
                    b3 = Wy.b(c1136iz.f.intValue()).b();
                }
                return new C1764wy(interfaceC0911dx, b3);
            case 9:
                C1853yx c1853yx = (C1853yx) abstractC1400ot;
                byte[] b5 = ((C1419pB) c1853yx.f16506m.f8377l).b();
                Ex ex = c1853yx.f16505l;
                C1016gB c1016gB = new C1016gB(ex.f8631c, b5);
                String valueOf = String.valueOf(ex.f);
                C0901dm c0901dm = new C0901dm("HMAC".concat(valueOf), new SecretKeySpec(((C1419pB) c1853yx.f16507n.f8377l).b(), "HMAC"));
                int i5 = ex.f8632d;
                return new C1106iB(c1016gB, new C1374oB(c0901dm, i5), i5, c1853yx.f16508o.b());
            case 10:
                Gx gx = (Gx) abstractC1400ot;
                C0052p0 c0052p0 = C1061hB.f;
                if (AbstractC0952et.s(1)) {
                    return new C1061hB(gx.f9286l.f10085b, ((C1419pB) gx.f9287m.f8377l).b(), gx.f9288n.b());
                }
                throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
            case 11:
                Kx kx = (Kx) abstractC1400ot;
                return new C1764wy(((C1419pB) kx.f10285m.f8377l).b(), kx.f10286n);
            case 12:
                Nx nx = (Nx) abstractC1400ot;
                return new Ay(((C1419pB) nx.f10872m.f8377l).b(), nx.f10873n.b());
            case 13:
                Qx qx = (Qx) abstractC1400ot;
                C0824bz c0824bz = Rx.f11471a;
                Object obj = C1495qy.f.get();
                C1419pB c1419pB = qx.f11292n;
                Dp dp = qx.f11291m;
                if (obj != null) {
                    return new C1495qy(((C1419pB) dp.f8377l).b(), c1419pB.b());
                }
                return new C1764wy(3, ((C1419pB) dp.f8377l).b(), c1419pB.b());
            case 14:
                C0824bz c0824bz2 = Tx.f11703a;
                AbstractC1224kx.a(((Wx) abstractC1400ot).f12130l.f12259a);
                throw null;
            case 15:
                Iy iy = Vx.f11967a;
                AbstractC1224kx.a(((Zx) abstractC1400ot).f12545l.f12737b);
                throw null;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case C1639u7.zzm /* 21 */:
            case 22:
            case 23:
            default:
                C1047gy c1047gy = (C1047gy) abstractC1400ot;
                C0824bz c0824bz3 = AbstractC1092hy.f13837a;
                Cipher cipher = (Cipher) C1495qy.f.get();
                C1419pB c1419pB2 = c1047gy.f13684n;
                Dp dp2 = c1047gy.f13683m;
                if (cipher != null) {
                    return new C1764wy(1, ((C1419pB) dp2.f8377l).b(), c1419pB2.b());
                }
                return new C1764wy(4, ((C1419pB) dp2.f8377l).b(), c1419pB2.b());
            case 24:
                C0957ey c0957ey = (C0957ey) abstractC1400ot;
                return new C1809xy(((C1419pB) c0957ey.f13385m.f8377l).b(), c0957ey.f13386n, c0957ey.f13384l.f13533b);
        }
    }
}
