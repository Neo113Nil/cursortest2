package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final /* synthetic */ class Fz implements InterfaceC0780az, Yy, Hy, Fy, InterfaceC0972fC, InterfaceC1805xu, Yj, InterfaceC1166jk {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9146k;

    public /* synthetic */ Fz(int i) {
        this.f9146k = i;
    }

    public static final UB g(long j5, Object obj) {
        UB ub = (UB) CC.i(j5, obj);
        if (((AbstractC1508rB) ub).f15276k) {
            return ub;
        }
        int size = ub.size();
        UB b3 = ub.b(size == 0 ? 10 : size + size);
        CC.n(obj, j5, b3);
        return b3;
    }

    public static final C0838cC j(Object obj, Object obj2) {
        C0838cC c0838cC = (C0838cC) obj;
        C0838cC c0838cC2 = (C0838cC) obj2;
        if (!c0838cC2.isEmpty()) {
            if (!c0838cC.f12981k) {
                c0838cC = c0838cC.a();
            }
            c0838cC.c();
            if (!c0838cC2.isEmpty()) {
                c0838cC.putAll(c0838cC2);
            }
        }
        return c0838cC;
    }

    public static String m(byte[] bArr, int i, int i5) {
        int i6;
        int length = bArr.length;
        if ((((length - i) - i5) | i | i5) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i5)));
        }
        int i7 = i + i5;
        char[] cArr = new char[i5];
        int i8 = 0;
        while (i < i7) {
            byte b3 = bArr[i];
            if (b3 < 0) {
                break;
            }
            i++;
            cArr[i8] = (char) b3;
            i8++;
        }
        int i9 = i8;
        while (i < i7) {
            int i10 = i + 1;
            byte b5 = bArr[i];
            if (b5 >= 0) {
                cArr[i9] = (char) b5;
                i9++;
                i = i10;
                while (i < i7) {
                    byte b6 = bArr[i];
                    if (b6 >= 0) {
                        i++;
                        cArr[i9] = (char) b6;
                        i9++;
                    }
                }
            } else {
                if (b5 < -32) {
                    if (i10 >= i7) {
                        throw new XB("Protocol message had invalid UTF-8.");
                    }
                    i6 = i9 + 1;
                    i += 2;
                    AbstractC1400ot.K(b5, bArr[i10], cArr, i9);
                } else if (b5 < -16) {
                    if (i10 >= i7 - 1) {
                        throw new XB("Protocol message had invalid UTF-8.");
                    }
                    i6 = i9 + 1;
                    int i11 = i + 2;
                    i += 3;
                    AbstractC1400ot.A(b5, bArr[i10], bArr[i11], cArr, i9);
                } else {
                    if (i10 >= i7 - 2) {
                        throw new XB("Protocol message had invalid UTF-8.");
                    }
                    byte b7 = bArr[i10];
                    int i12 = i + 3;
                    byte b8 = bArr[i + 2];
                    i += 4;
                    AbstractC1400ot.g(b5, b7, b8, bArr[i12], cArr, i9);
                    i9 += 2;
                }
                i9 = i6;
            }
        }
        return new String(cArr, 0, i9);
    }

    public static final String n(ByteBuffer byteBuffer, int i, int i5) {
        int i6;
        if ((((byteBuffer.limit() - i) - i5) | i | i5) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i5)));
        }
        int i7 = i + i5;
        char[] cArr = new char[i5];
        int i8 = 0;
        while (i < i7) {
            byte b3 = byteBuffer.get(i);
            if (b3 < 0) {
                break;
            }
            i++;
            cArr[i8] = (char) b3;
            i8++;
        }
        int i9 = i8;
        while (i < i7) {
            int i10 = i + 1;
            byte b5 = byteBuffer.get(i);
            if (b5 >= 0) {
                cArr[i9] = (char) b5;
                i9++;
                i = i10;
                while (i < i7) {
                    byte b6 = byteBuffer.get(i);
                    if (b6 >= 0) {
                        i++;
                        cArr[i9] = (char) b6;
                        i9++;
                    }
                }
            } else {
                if (b5 < -32) {
                    if (i10 >= i7) {
                        throw new XB("Protocol message had invalid UTF-8.");
                    }
                    i6 = i9 + 1;
                    i += 2;
                    AbstractC1400ot.K(b5, byteBuffer.get(i10), cArr, i9);
                } else if (b5 < -16) {
                    if (i10 >= i7 - 1) {
                        throw new XB("Protocol message had invalid UTF-8.");
                    }
                    i6 = i9 + 1;
                    int i11 = i + 2;
                    i += 3;
                    AbstractC1400ot.A(b5, byteBuffer.get(i10), byteBuffer.get(i11), cArr, i9);
                } else {
                    if (i10 >= i7 - 2) {
                        throw new XB("Protocol message had invalid UTF-8.");
                    }
                    byte b7 = byteBuffer.get(i10);
                    int i12 = i + 3;
                    byte b8 = byteBuffer.get(i + 2);
                    i += 4;
                    AbstractC1400ot.g(b5, b7, b8, byteBuffer.get(i12), cArr, i9);
                    i9 += 2;
                }
                i9 = i6;
            }
        }
        return new String(cArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public Object mo12a() {
        return new WD();
    }

    @Override // com.google.android.gms.internal.ads.Hy
    public C1136iz b(AbstractC1400ot abstractC1400ot) {
        switch (this.f9146k) {
            case 2:
                C1496qz c1496qz = (C1496qz) abstractC1400ot;
                Jz x5 = Kz.x();
                C1630tz c1630tz = c1496qz.f15192l;
                Nz x6 = Oz.x();
                int i = c1630tz.f15744b;
                x6.e();
                ((Oz) x6.f10141l).zzc = i;
                Oz oz = (Oz) x6.b();
                x5.e();
                Kz.D((Kz) x5.f10141l, oz);
                byte[] b3 = ((C1419pB) c1496qz.f15193m.f8377l).b();
                C1733wB r5 = AbstractC1823yB.r(b3, 0, b3.length);
                x5.e();
                ((Kz) x5.f10141l).zze = r5;
                return C1136iz.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((Kz) x5.b()).b(), 2, Gz.b(c1496qz.f15192l.f15745c), c1496qz.f15195o);
            default:
                C1720vz c1720vz = (C1720vz) abstractC1400ot;
                C1552sA x7 = C1597tA.x();
                C1900zz c1900zz = c1720vz.f16069l;
                C1732wA y5 = C1777xA.y();
                int i5 = c1900zz.f16799b;
                y5.e();
                ((C1777xA) y5.f10141l).zzd = i5;
                EnumC1507rA enumC1507rA = (EnumC1507rA) Hz.f9505b.s(c1900zz.f16801d);
                y5.e();
                ((C1777xA) y5.f10141l).zzc = enumC1507rA.a();
                C1777xA c1777xA = (C1777xA) y5.b();
                x7.e();
                C1597tA.E((C1597tA) x7.f10141l, c1777xA);
                byte[] b5 = ((C1419pB) c1720vz.f16070m.f8377l).b();
                C1733wB r6 = AbstractC1823yB.r(b5, 0, b5.length);
                x7.e();
                ((C1597tA) x7.f10141l).zzf = r6;
                return C1136iz.a("type.googleapis.com/google.crypto.tink.HmacKey", ((C1597tA) x7.b()).b(), 2, (UA) Hz.f9504a.s(c1720vz.f16069l.f16800c), c1720vz.f16072o);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1166jk
    public void c(Object obj, WG wg) {
    }

    @Override // com.google.android.gms.internal.ads.Fy
    public AbstractC1400ot d(C1136iz c1136iz) {
        boolean z3 = false;
        switch (this.f9146k) {
            case 3:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB = c1136iz.f14025c;
                    GB gb = GB.f9177a;
                    C1285mC c1285mC = C1285mC.f14484c;
                    Kz y5 = Kz.y(abstractC1823yB, GB.f9178b);
                    if (y5.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    Fx fx = new Fx();
                    fx.a(y5.A().g());
                    fx.d(y5.z().w());
                    fx.f9143k = Gz.a(c1136iz.f14027e);
                    C1630tz i = fx.i();
                    Fx fx2 = new Fx(z3);
                    fx2.f9145m = i;
                    fx2.f9143k = Dp.m(y5.A().c());
                    fx2.f9144l = c1136iz.f;
                    return fx2.h();
                } catch (XB | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                if (!c1136iz.f14023a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    AbstractC1823yB abstractC1823yB2 = c1136iz.f14025c;
                    GB gb2 = GB.f9177a;
                    C1285mC c1285mC2 = C1285mC.f14484c;
                    C1597tA z5 = C1597tA.z(abstractC1823yB2, GB.f9178b);
                    if (z5.w() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    m2.g gVar = new m2.g(17);
                    gVar.t(z5.B().g());
                    gVar.x(z5.A().w());
                    gVar.f17996n = (C1810xz) Hz.f9505b.v(z5.A().x());
                    gVar.f17997o = (C1855yz) Hz.f9504a.v(c1136iz.f14027e);
                    C1900zz E5 = gVar.E();
                    Fx fx3 = new Fx(z3);
                    fx3.f9145m = E5;
                    fx3.f9143k = Dp.m(z5.B().c());
                    fx3.f9144l = c1136iz.f;
                    return fx3.j();
                } catch (XB | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yy
    public AbstractC1314mx e(C1181jz c1181jz) {
        switch (this.f9146k) {
            case 1:
                BA ba = c1181jz.f14197b;
                if (!ba.B().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(ba.B())));
                }
                try {
                    AbstractC1823yB A3 = ba.A();
                    GB gb = GB.f9177a;
                    C1285mC c1285mC = C1285mC.f14484c;
                    Mz y5 = Mz.y(A3, GB.f9178b);
                    Fx fx = new Fx();
                    fx.a(y5.w());
                    fx.d(y5.z().w());
                    fx.f9143k = Gz.a(ba.z());
                    return fx.i();
                } catch (XB e3) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e3);
                }
            default:
                BA ba2 = c1181jz.f14197b;
                if (!ba2.B().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(ba2.B())));
                }
                try {
                    AbstractC1823yB A5 = ba2.A();
                    GB gb2 = GB.f9177a;
                    C1285mC c1285mC2 = C1285mC.f14484c;
                    C1687vA A6 = C1687vA.A(A5, GB.f9178b);
                    if (A6.x() != 0) {
                        throw new GeneralSecurityException(AbstractC2107A.q("Parsing HmacParameters failed: unknown Version ", A6.x()));
                    }
                    m2.g gVar = new m2.g(17);
                    gVar.t(A6.w());
                    gVar.x(A6.B().w());
                    gVar.f17996n = (C1810xz) Hz.f9505b.v(A6.B().x());
                    gVar.f17997o = (C1855yz) Hz.f9504a.v(ba2.z());
                    return gVar.E();
                } catch (XB e5) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e5);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0780az
    public C1181jz f(AbstractC1314mx abstractC1314mx) {
        switch (this.f9146k) {
            case 0:
                C1630tz c1630tz = (C1630tz) abstractC1314mx;
                AA w5 = BA.w();
                w5.j("type.googleapis.com/google.crypto.tink.AesCmacKey");
                Lz x5 = Mz.x();
                Nz x6 = Oz.x();
                int i = c1630tz.f15744b;
                x6.e();
                ((Oz) x6.f10141l).zzc = i;
                Oz oz = (Oz) x6.b();
                x5.e();
                Mz.B((Mz) x5.f10141l, oz);
                x5.e();
                ((Mz) x5.f10141l).zzd = c1630tz.f15743a;
                w5.k(((Mz) x5.b()).b());
                w5.i(Gz.b(c1630tz.f15745c));
                return C1181jz.a((BA) w5.b());
            default:
                C1900zz c1900zz = (C1900zz) abstractC1314mx;
                AA w6 = BA.w();
                w6.j("type.googleapis.com/google.crypto.tink.HmacKey");
                C1642uA y5 = C1687vA.y();
                C1732wA y6 = C1777xA.y();
                int i5 = c1900zz.f16799b;
                y6.e();
                ((C1777xA) y6.f10141l).zzd = i5;
                EnumC1507rA enumC1507rA = (EnumC1507rA) Hz.f9505b.s(c1900zz.f16801d);
                y6.e();
                ((C1777xA) y6.f10141l).zzc = enumC1507rA.a();
                C1777xA c1777xA = (C1777xA) y6.b();
                y5.e();
                C1687vA.D((C1687vA) y5.f10141l, c1777xA);
                y5.e();
                ((C1687vA) y5.f10141l).zze = c1900zz.f16798a;
                w6.k(((C1687vA) y5.b()).b());
                w6.i((UA) Hz.f9504a.s(c1900zz.f16800c));
                return C1181jz.a((BA) w6.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0972fC
    public C1375oC h(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public /* bridge */ Object i(String str, Provider provider) {
        switch (this.f9146k) {
            case 8:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 9:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 10:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 11:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 12:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 13:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public void mo11k(Object obj) {
        switch (this.f9146k) {
            case 22:
                SE se = (SE) obj;
                int i = C1109iE.f13882f0;
                se.i(se.g(), 14, new RE(5));
                break;
            case 23:
                SE se2 = (SE) obj;
                int i5 = C1109iE.f13882f0;
                se2.i(se2.l(), 22, new QE(10));
                break;
            case 24:
                SE se3 = (SE) obj;
                int i6 = C1109iE.f13882f0;
                se3.i(se3.l(), 24, new RE(6));
                break;
            case 25:
                SE se4 = (SE) obj;
                XD xd = new XD(2, new D2.e("Player release timed out."), 1003);
                se4.getClass();
                C1603tG c1603tG = xd.f12164r;
                OE j5 = c1603tG != null ? se4.j(c1603tG) : se4.g();
                se4.i(j5, 10, new Qs(j5, xd));
                break;
            case 26:
            default:
                break;
            case 27:
                SE se5 = (SE) obj;
                int i7 = C1109iE.f13882f0;
                se5.i(se5.g(), 1, new QE(8));
                break;
            case 28:
                SE se6 = (SE) obj;
                se6.i(se6.l(), 23, new QE(9));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0972fC
    public boolean l(Class cls) {
        return false;
    }
}
