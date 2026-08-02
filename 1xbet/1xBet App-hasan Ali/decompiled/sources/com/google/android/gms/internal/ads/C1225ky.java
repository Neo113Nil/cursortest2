package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import u.AbstractC2462i;

/* renamed from: com.google.android.gms.internal.ads.ky, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1225ky implements InterfaceC0780az, Yy, Hy, Fy, InterfaceC0869cz {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14309k;

    public /* synthetic */ C1225ky(int i) {
        this.f14309k = i;
    }

    @Override // com.google.android.gms.internal.ads.Hy
    public C1136iz b(AbstractC1400ot abstractC1400ot) {
        switch (this.f14309k) {
            case 2:
                Gx gx = (Gx) abstractC1400ot;
                Zz x5 = C0747aA.x();
                Jx jx = gx.f9286l;
                C0925eA x6 = C0970fA.x();
                int i = jx.f10085b;
                x6.e();
                ((C0970fA) x6.f10141l).zzc = i;
                C0970fA c0970fA = (C0970fA) x6.b();
                x5.e();
                C0747aA.D((C0747aA) x5.f10141l, c0970fA);
                byte[] b3 = ((C1419pB) gx.f9287m.f8377l).b();
                C1733wB r5 = AbstractC1823yB.r(b3, 0, b3.length);
                x5.e();
                ((C0747aA) x5.f10141l).zzf = r5;
                return C1136iz.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C0747aA) x5.b()).b(), 2, AbstractC1315my.b(gx.f9286l.f10086c), gx.f9289o);
            case 6:
                Kx kx = (Kx) abstractC1400ot;
                C1015gA x7 = C1060hA.x();
                byte[] b5 = ((C1419pB) kx.f10285m.f8377l).b();
                C1733wB r6 = AbstractC1823yB.r(b5, 0, b5.length);
                x7.e();
                ((C1060hA) x7.f10141l).zzd = r6;
                return C1136iz.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C1060hA) x7.b()).b(), 2, AbstractC1405oy.b(kx.f10284l.f10754b), kx.f10287o);
            case 10:
                Nx nx = (Nx) abstractC1400ot;
                C1193kA x8 = C1238lA.x();
                byte[] b6 = ((C1419pB) nx.f10872m.f8377l).b();
                C1733wB r7 = AbstractC1823yB.r(b6, 0, b6.length);
                x8.e();
                ((C1238lA) x8.f10141l).zzd = r7;
                return C1136iz.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C1238lA) x8.b()).b(), 2, AbstractC1450py.b(nx.f10871l.f11137b), nx.f10874o);
            case 14:
                Qx qx = (Qx) abstractC1400ot;
                C1373oA x9 = C1418pA.x();
                byte[] b7 = ((C1419pB) qx.f11291m.f8377l).b();
                C1733wB r8 = AbstractC1823yB.r(b7, 0, b7.length);
                x9.e();
                ((C1418pA) x9.f10141l).zzd = r8;
                return C1136iz.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((C1418pA) x9.b()).b(), 2, AbstractC1539ry.b(qx.f11290l.f11603a), qx.f11293o);
            case 18:
                C0957ey c0957ey = (C0957ey) abstractC1400ot;
                WA x10 = XA.x();
                byte[] b8 = ((C1419pB) c0957ey.f13385m.f8377l).b();
                C1733wB r9 = AbstractC1823yB.r(b8, 0, b8.length);
                x10.e();
                ((XA) x10.f10141l).zzf = r9;
                C0748aB x11 = C0837cB.x();
                C1002fy c1002fy = c0957ey.f13384l;
                x11.e();
                ((C0837cB) x11.f10141l).zzc = c1002fy.f13533b;
                C0837cB c0837cB = (C0837cB) x11.b();
                x10.e();
                XA.C((XA) x10.f10141l, c0837cB);
                return C1136iz.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((XA) x10.b()).b(), 2, AbstractC1854yy.b(c1002fy.f13532a), c0957ey.f13387o);
            case 22:
                C1047gy c1047gy = (C1047gy) abstractC1400ot;
                C0882dB x12 = C0926eB.x();
                byte[] b9 = ((C1419pB) c1047gy.f13683m.f8377l).b();
                C1733wB r10 = AbstractC1823yB.r(b9, 0, b9.length);
                x12.e();
                ((C0926eB) x12.f10141l).zzd = r10;
                return C1136iz.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C0926eB) x12.b()).b(), 2, AbstractC1899zy.b(c1047gy.f13682l.f14022a), c1047gy.f13685o);
            default:
                C1136iz c1136iz = ((Ky) abstractC1400ot).f10288l;
                int i5 = Jy.f10088b[AbstractC2462i.b(c1136iz.f14026d)];
                return c1136iz;
        }
    }

    @Override // com.google.android.gms.internal.ads.Fy
    public AbstractC1400ot d(C1136iz c1136iz) {
        int i = 16;
        switch (this.f14309k) {
            case 3:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB = c1136iz.f14025c;
                    GB gb = GB.f9177a;
                    C1285mC c1285mC = C1285mC.f14484c;
                    C0747aA y5 = C0747aA.y(abstractC1823yB, GB.f9178b);
                    if (y5.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1071hd c1071hd = new C1071hd(16);
                    c1071hd.t(y5.A().g());
                    c1071hd.p(y5.z().w());
                    c1071hd.w();
                    c1071hd.f13764o = AbstractC1315my.a(c1136iz.f14027e);
                    Jx C5 = c1071hd.C();
                    Fx fx = new Fx(false);
                    fx.f9145m = C5;
                    fx.f9143k = Dp.m(y5.A().c());
                    fx.f9144l = c1136iz.f;
                    return fx.e();
                } catch (XB unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 7:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB2 = c1136iz.f14025c;
                    GB gb2 = GB.f9177a;
                    C1285mC c1285mC2 = C1285mC.f14484c;
                    C1060hA y6 = C1060hA.y(abstractC1823yB2, GB.f9178b);
                    if (y6.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    m2.g gVar = new m2.g(i);
                    gVar.t(y6.z().g());
                    gVar.mo20a();
                    gVar.w();
                    gVar.f17997o = AbstractC1405oy.a(c1136iz.f14027e);
                    Mx D5 = gVar.D();
                    Fx fx2 = new Fx(false);
                    fx2.f9145m = D5;
                    fx2.f9143k = Dp.m(y6.z().c());
                    fx2.f9144l = c1136iz.f;
                    return fx2.f();
                } catch (XB unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 11:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB3 = c1136iz.f14025c;
                    GB gb3 = GB.f9177a;
                    C1285mC c1285mC3 = C1285mC.f14484c;
                    C1238lA y7 = C1238lA.y(abstractC1823yB3, GB.f9178b);
                    if (y7.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int g5 = y7.z().g();
                    if (g5 != 16 && g5 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(g5)));
                    }
                    Px px = new Px(g5, AbstractC1450py.a(c1136iz.f14027e));
                    Fx fx3 = new Fx(false);
                    fx3.f9145m = px;
                    fx3.f9143k = Dp.m(y7.z().c());
                    fx3.f9144l = c1136iz.f;
                    return fx3.g();
                } catch (XB unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 15:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB4 = c1136iz.f14025c;
                    GB gb4 = GB.f9177a;
                    C1285mC c1285mC4 = C1285mC.f14484c;
                    C1418pA y8 = C1418pA.y(abstractC1823yB4, GB.f9178b);
                    if (y8.w() == 0) {
                        return Qx.o0(AbstractC1539ry.a(c1136iz.f14027e), Dp.m(y8.z().c()), c1136iz.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (XB unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 19:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB5 = c1136iz.f14025c;
                    GB gb5 = GB.f9177a;
                    C1285mC c1285mC5 = C1285mC.f14484c;
                    XA y9 = XA.y(abstractC1823yB5, GB.f9178b);
                    if (y9.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (y9.A().g() == 32) {
                        return C0957ey.o0(C1002fy.b(AbstractC1854yy.a(c1136iz.f14027e), y9.z().w()), Dp.m(y9.A().c()), c1136iz.f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (XB unused5) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            default:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB6 = c1136iz.f14025c;
                    GB gb6 = GB.f9177a;
                    C1285mC c1285mC6 = C1285mC.f14484c;
                    C0926eB y10 = C0926eB.y(abstractC1823yB6, GB.f9178b);
                    if (y10.w() == 0) {
                        return C1047gy.o0(AbstractC1899zy.a(c1136iz.f14027e), Dp.m(y10.z().c()), c1136iz.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (XB unused6) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yy
    public AbstractC1314mx e(C1181jz c1181jz) {
        int i = 16;
        switch (this.f14309k) {
            case 1:
                BA ba = c1181jz.f14197b;
                if (!ba.B().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(ba.B())));
                }
                try {
                    AbstractC1823yB A3 = ba.A();
                    GB gb = GB.f9177a;
                    C1285mC c1285mC = C1285mC.f14484c;
                    C0881dA y5 = C0881dA.y(A3, GB.f9178b);
                    C1071hd c1071hd = new C1071hd(16);
                    c1071hd.t(y5.w());
                    c1071hd.p(y5.z().w());
                    c1071hd.w();
                    c1071hd.f13764o = AbstractC1315my.a(ba.z());
                    return c1071hd.C();
                } catch (XB e3) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e3);
                }
            case 5:
                BA ba2 = c1181jz.f14197b;
                if (!ba2.B().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(ba2.B())));
                }
                try {
                    AbstractC1823yB A5 = ba2.A();
                    GB gb2 = GB.f9177a;
                    C1285mC c1285mC2 = C1285mC.f14484c;
                    C1148jA z3 = C1148jA.z(A5, GB.f9178b);
                    if (z3.x() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    m2.g gVar = new m2.g(i);
                    gVar.t(z3.w());
                    gVar.mo20a();
                    gVar.w();
                    gVar.f17997o = AbstractC1405oy.a(ba2.z());
                    return gVar.D();
                } catch (XB e5) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                }
            case 9:
                BA ba3 = c1181jz.f14197b;
                if (!ba3.B().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(ba3.B())));
                }
                try {
                    AbstractC1823yB A6 = ba3.A();
                    GB gb3 = GB.f9177a;
                    C1285mC c1285mC3 = C1285mC.f14484c;
                    C1328nA z5 = C1328nA.z(A6, GB.f9178b);
                    if (z5.x() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int w5 = z5.w();
                    if (w5 == 16 || w5 == 32) {
                        return new Px(w5, AbstractC1450py.a(ba3.z()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(w5)));
                } catch (XB e6) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
                }
            case 13:
                BA ba4 = c1181jz.f14197b;
                if (!ba4.B().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(ba4.B())));
                }
                try {
                    AbstractC1823yB A7 = ba4.A();
                    GB gb4 = GB.f9177a;
                    C1285mC c1285mC4 = C1285mC.f14484c;
                    C1463qA.x(A7, GB.f9178b);
                    return new Sx(AbstractC1539ry.a(ba4.z()));
                } catch (XB e7) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
                }
            case 17:
                BA ba5 = c1181jz.f14197b;
                if (!ba5.B().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(ba5.B())));
                }
                try {
                    AbstractC1823yB A8 = ba5.A();
                    GB gb5 = GB.f9177a;
                    C1285mC c1285mC5 = C1285mC.f14484c;
                    ZA y6 = ZA.y(A8, GB.f9178b);
                    if (y6.w() == 0) {
                        return C1002fy.b(AbstractC1854yy.a(ba5.z()), y6.z().w());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (XB e8) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
                }
            default:
                BA ba6 = c1181jz.f14197b;
                if (!ba6.B().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(ba6.B())));
                }
                try {
                    AbstractC1823yB A9 = ba6.A();
                    GB gb6 = GB.f9177a;
                    C1285mC c1285mC6 = C1285mC.f14484c;
                    if (C0971fB.y(A9, GB.f9178b).w() == 0) {
                        return new C1135iy(AbstractC1899zy.a(ba6.z()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (XB e9) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0780az
    public C1181jz f(AbstractC1314mx abstractC1314mx) {
        switch (this.f14309k) {
            case 0:
                Jx jx = (Jx) abstractC1314mx;
                AA w5 = BA.w();
                w5.j("type.googleapis.com/google.crypto.tink.AesEaxKey");
                C0836cA x5 = C0881dA.x();
                C0925eA x6 = C0970fA.x();
                int i = jx.f10085b;
                x6.e();
                ((C0970fA) x6.f10141l).zzc = i;
                C0970fA c0970fA = (C0970fA) x6.b();
                x5.e();
                C0881dA.B((C0881dA) x5.f10141l, c0970fA);
                x5.e();
                ((C0881dA) x5.f10141l).zze = jx.f10084a;
                w5.k(((C0881dA) x5.b()).b());
                w5.i(AbstractC1315my.b(jx.f10086c));
                return C1181jz.a((BA) w5.b());
            case 4:
                Mx mx = (Mx) abstractC1314mx;
                AA w6 = BA.w();
                w6.j("type.googleapis.com/google.crypto.tink.AesGcmKey");
                C1105iA y5 = C1148jA.y();
                int i5 = mx.f10753a;
                y5.e();
                ((C1148jA) y5.f10141l).zzc = i5;
                w6.k(((C1148jA) y5.b()).b());
                w6.i(AbstractC1405oy.b(mx.f10754b));
                return C1181jz.a((BA) w6.b());
            case 8:
                Px px = (Px) abstractC1314mx;
                AA w7 = BA.w();
                w7.j("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                C1283mA y6 = C1328nA.y();
                int i6 = px.f11136a;
                y6.e();
                ((C1328nA) y6.f10141l).zzc = i6;
                w7.k(((C1328nA) y6.b()).b());
                w7.i(AbstractC1450py.b(px.f11137b));
                return C1181jz.a((BA) w7.b());
            case 12:
                AA w8 = BA.w();
                w8.j("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                w8.k(C1463qA.w().b());
                w8.i(AbstractC1539ry.b(((Sx) abstractC1314mx).f11603a));
                return C1181jz.a((BA) w8.b());
            case 16:
                C1002fy c1002fy = (C1002fy) abstractC1314mx;
                AA w9 = BA.w();
                w9.j("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                YA x7 = ZA.x();
                C0748aB x8 = C0837cB.x();
                int i7 = c1002fy.f13533b;
                x8.e();
                ((C0837cB) x8.f10141l).zzc = i7;
                C0837cB c0837cB = (C0837cB) x8.b();
                x7.e();
                ZA.A((ZA) x7.f10141l, c0837cB);
                w9.k(((ZA) x7.b()).b());
                w9.i(AbstractC1854yy.b(c1002fy.f13532a));
                return C1181jz.a((BA) w9.b());
            default:
                AA w10 = BA.w();
                w10.j("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                w10.k(C0971fB.x().b());
                w10.i(AbstractC1899zy.b(((C1135iy) abstractC1314mx).f14022a));
                return C1181jz.a((BA) w10.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0869cz, com.google.android.gms.internal.ads.Hy
    public Object b(AbstractC1400ot abstractC1400ot) {
        switch (this.f14309k) {
            case 25:
                if (((C1496qz) abstractC1400ot).f15192l.f15743a == 32) {
                    C1675uz c1675uz = new C1675uz();
                    if (AbstractC0952et.s(1)) {
                        return c1675uz;
                    }
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 26:
                C1496qz c1496qz = (C1496qz) abstractC1400ot;
                if (c1496qz.f15192l.f15743a == 32) {
                    return new C1374oB(c1496qz);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 27:
                C1675uz c1675uz2 = new C1675uz();
                if (AbstractC0952et.s(2)) {
                    return c1675uz2;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 28:
                return new C1374oB((C1720vz) abstractC1400ot);
            default:
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
                int ordinal = c1136iz.f14027e.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            Wy.f12132a.b();
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    Wy.a(c1136iz.f.intValue()).b();
                } else {
                    Wy.b(c1136iz.f.intValue()).b();
                }
                return new Dz();
        }
    }
}
