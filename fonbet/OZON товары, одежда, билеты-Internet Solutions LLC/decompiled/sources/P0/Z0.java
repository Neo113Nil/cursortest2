package P0;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import m0.C8004n;
import m0.C8025y;
import m0.O;
import m0.V;
import n0.C8392m;
import n1.C8416i;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f20931a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f20932b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f20933c = R0.j.b() - (R0.j.c() * 2);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C8025y f20934d;

    static final class a extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f20935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8416i f20936c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O.a f20937d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ O.a f20938e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O.a f20939f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ O.a f20940g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f20941h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f20942i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f7, long j11, long j12, O.a aVar, O.a aVar2, O.a aVar3, O.a aVar4, C8416i c8416i) {
            super(1);
            this.f20935b = j11;
            this.f20936c = c8416i;
            this.f20937d = aVar;
            this.f20938e = aVar2;
            this.f20939f = aVar3;
            this.f20940g = aVar4;
            this.f20941h = f7;
            this.f20942i = j12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8412e interfaceC8412e) {
            InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
            long j11 = this.f20935b;
            C8416i c8416i = this.f20936c;
            Z0.b(interfaceC8412e2, j11, c8416i);
            float floatValue = (((Number) this.f20937d.getValue()).floatValue() * 216.0f) % 360.0f;
            float floatValue2 = ((Number) this.f20938e.getValue()).floatValue();
            O.a aVar = this.f20939f;
            Z0.c(interfaceC8412e2, ((Number) this.f20940g.getValue()).floatValue() + (floatValue - 90.0f) + ((Number) aVar.getValue()).floatValue(), this.f20941h, Math.abs(floatValue2 - ((Number) aVar.getValue()).floatValue()), this.f20942i, c8416i);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f20943b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f20944c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f20945d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f20946e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f20947f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f20948g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f20949h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, long j11, float f7, long j12, int i11, int i12, int i13) {
            super(2);
            this.f20943b = eVar;
            this.f20944c = j11;
            this.f20945d = f7;
            this.f20946e = j12;
            this.f20947f = i11;
            this.f20948g = i12;
            this.f20949h = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f20948g | 1);
            float f7 = this.f20945d;
            Z0.a(this.f20943b, this.f20944c, f7, this.f20946e, this.f20947f, interfaceC3967k, e11, this.f20949h);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<V.b<Float>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20950b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(V.b<Float> bVar) {
            V.b<Float> bVar2 = bVar;
            bVar2.e(1332);
            bVar2.f(0, Float.valueOf(0.0f)).c(Z0.f20934d);
            bVar2.f(666, Float.valueOf(290.0f));
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<V.b<Float>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f20951b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(V.b<Float> bVar) {
            V.b<Float> bVar2 = bVar;
            bVar2.e(1332);
            bVar2.f(666, Float.valueOf(0.0f)).c(Z0.f20934d);
            bVar2.f(bVar2.b(), Float.valueOf(290.0f));
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements InterfaceC6511n<B1.Y, B1.U, Z1.b, B1.W> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f20952b = new e(3);

        @Override // fd.InterfaceC6511n
        public final B1.W invoke(B1.Y y11, B1.U u11, Z1.b bVar) {
            B1.W z02;
            B1.Y y12 = y11;
            long p11 = bVar.p();
            int Y02 = y12.Y0(Z0.f20931a);
            int i11 = Y02 * 2;
            B1.m0 a02 = u11.a0(Z1.c.k(0, i11, p11));
            z02 = y12.z0(a02.u0(), a02.l0() - i11, kotlin.collections.U.c(), new C3719a1(a02, Y02));
            return z02;
        }
    }

    static final class f extends AbstractC7737t implements Function1<I1.D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f20953b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(I1.D d11) {
            return Unit.f71690a;
        }
    }

    static {
        float f7 = 10;
        f20931a = f7;
        f20932b = androidx.compose.foundation.layout.T.h(I1.o.c(androidx.compose.ui.layout.b.a(e.f20952b, androidx.compose.ui.e.f40358c0), true, f.f20953b), 0.0f, f7, 1);
        new C8025y(0.2f, 0.0f, 0.8f, 1.0f);
        new C8025y(0.4f, 0.0f, 1.0f, 1.0f);
        new C8025y(0.0f, 0.0f, 0.65f, 1.0f);
        new C8025y(0.1f, 0.0f, 0.45f, 1.0f);
        f20934d = new C8025y(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, long j11, float f7, long j12, int i11, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        androidx.compose.ui.e eVar2;
        int i14;
        long j13;
        float f11;
        int i15;
        int i16;
        long j14;
        long j15;
        int i17;
        long j16;
        long j17;
        float f12;
        boolean s11;
        Object C11;
        float f13;
        long j18;
        androidx.compose.ui.e eVar3;
        long j19;
        float f14;
        long j21;
        int i18;
        S0.J0 m02;
        C3969l u11 = interfaceC3967k.u(-115871647);
        int i19 = i13 & 1;
        if (i19 != 0) {
            i14 = i12 | 6;
            eVar2 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i12;
        } else {
            eVar2 = eVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            j13 = j11;
            i14 |= ((i13 & 2) == 0 && u11.s(j13)) ? 32 : 16;
        } else {
            j13 = j11;
        }
        int i21 = i13 & 4;
        if (i21 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            f11 = f7;
            i14 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 3072) == 0) {
                i14 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            i15 = i13 & 16;
            if (i15 == 0) {
                i14 |= 24576;
            } else if ((i12 & 24576) == 0) {
                i16 = i11;
                i14 |= u11.r(i16) ? 16384 : 8192;
                if ((i14 & 9363) == 9362 || !u11.b()) {
                    u11.Q0();
                    if ((i12 & 1) != 0 || u11.w0()) {
                        if (i19 != 0) {
                            eVar2 = androidx.compose.ui.e.f40358c0;
                        }
                        if ((i13 & 2) != 0) {
                            int i22 = Y0.f20925c;
                            j14 = C3759o.e(R0.j.a(), u11);
                            i14 &= -113;
                        } else {
                            j14 = j13;
                        }
                        if (i21 != 0) {
                            f11 = Y0.b();
                        }
                        int i23 = Y0.f20925c;
                        j15 = C7807Z.f72258l;
                        int i24 = i14 & (-7169);
                        if (i15 != 0) {
                            i16 = Y0.a();
                        }
                        i17 = i24;
                        j16 = j14;
                        j17 = j15;
                    } else {
                        u11.j();
                        if ((i13 & 2) != 0) {
                            i14 &= -113;
                        }
                        j17 = j12;
                        i17 = i14 & (-7169);
                        j16 = j13;
                    }
                    f12 = f11;
                    u11.j0();
                    int i25 = i16;
                    C8416i c8416i = new C8416i(((Z1.d) u11.m(androidx.compose.ui.platform.K0.e())).v1(f12), 0.0f, i25, 0, null, 26);
                    m0.O c11 = m0.T.c(null, u11, 1);
                    long j22 = j17;
                    O.a b11 = m0.T.b(c11, 0, 5, m0.W0.c(), C8004n.a(C8004n.d(6660, 0, m0.G.b(), 2), null, 6), null, u11, 33208, 16);
                    O.a a11 = m0.T.a(c11, 0.0f, 286.0f, C8004n.a(C8004n.d(1332, 0, m0.G.b(), 2), null, 6), null, u11, 4536, 8);
                    O.a a12 = m0.T.a(c11, 0.0f, 290.0f, C8004n.a(C8004n.b(c.f20950b), null, 6), null, u11, 4536, 8);
                    O.a a13 = m0.T.a(c11, 0.0f, 290.0f, C8004n.a(C8004n.b(d.f20951b), null, 6), null, u11, 4536, 8);
                    androidx.compose.ui.e n11 = androidx.compose.foundation.layout.a0.n(n0.c0.a(eVar2), f20933c);
                    s11 = ((i17 & 896) == 256) | u11.s(j22) | u11.F(c8416i) | u11.n(b11) | u11.n(a12) | u11.n(a13) | u11.n(a11) | ((((i17 & 112) ^ 48) <= 32 && u11.s(j16)) || (i17 & 48) == 32);
                    C11 = u11.C();
                    if (!s11 || C11 == InterfaceC3967k.a.a()) {
                        f13 = f12;
                        j18 = j16;
                        C11 = new a(f13, j22, j18, b11, a12, a13, a11, c8416i);
                        u11.x(C11);
                    } else {
                        f13 = f12;
                        j18 = j16;
                    }
                    C8392m.a(n11, (Function1) C11, u11, 0);
                    eVar3 = eVar2;
                    j19 = j22;
                    f14 = f13;
                    j21 = j18;
                    i18 = i25;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                    j21 = j13;
                    f14 = f11;
                    i18 = i16;
                    j19 = j12;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new b(eVar3, j21, f14, j19, i18, i12, i13));
                    return;
                }
                return;
            }
            i16 = i11;
            if ((i14 & 9363) == 9362) {
            }
            u11.Q0();
            if ((i12 & 1) != 0) {
            }
            if (i19 != 0) {
            }
            if ((i13 & 2) != 0) {
            }
            if (i21 != 0) {
            }
            int i232 = Y0.f20925c;
            j15 = C7807Z.f72258l;
            int i242 = i14 & (-7169);
            if (i15 != 0) {
            }
            i17 = i242;
            j16 = j14;
            j17 = j15;
            f12 = f11;
            u11.j0();
            int i252 = i16;
            C8416i c8416i2 = new C8416i(((Z1.d) u11.m(androidx.compose.ui.platform.K0.e())).v1(f12), 0.0f, i252, 0, null, 26);
            m0.O c112 = m0.T.c(null, u11, 1);
            long j222 = j17;
            O.a b112 = m0.T.b(c112, 0, 5, m0.W0.c(), C8004n.a(C8004n.d(6660, 0, m0.G.b(), 2), null, 6), null, u11, 33208, 16);
            O.a a112 = m0.T.a(c112, 0.0f, 286.0f, C8004n.a(C8004n.d(1332, 0, m0.G.b(), 2), null, 6), null, u11, 4536, 8);
            O.a a122 = m0.T.a(c112, 0.0f, 290.0f, C8004n.a(C8004n.b(c.f20950b), null, 6), null, u11, 4536, 8);
            O.a a132 = m0.T.a(c112, 0.0f, 290.0f, C8004n.a(C8004n.b(d.f20951b), null, 6), null, u11, 4536, 8);
            androidx.compose.ui.e n112 = androidx.compose.foundation.layout.a0.n(n0.c0.a(eVar2), f20933c);
            s11 = ((i17 & 896) == 256) | u11.s(j222) | u11.F(c8416i2) | u11.n(b112) | u11.n(a122) | u11.n(a132) | u11.n(a112) | ((((i17 & 112) ^ 48) <= 32 && u11.s(j16)) || (i17 & 48) == 32);
            C11 = u11.C();
            if (s11) {
            }
            f13 = f12;
            j18 = j16;
            C11 = new a(f13, j222, j18, b112, a122, a132, a112, c8416i2);
            u11.x(C11);
            C8392m.a(n112, (Function1) C11, u11, 0);
            eVar3 = eVar2;
            j19 = j222;
            f14 = f13;
            j21 = j18;
            i18 = i252;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        f11 = f7;
        if ((i12 & 3072) == 0) {
        }
        i15 = i13 & 16;
        if (i15 == 0) {
        }
        i16 = i11;
        if ((i14 & 9363) == 9362) {
        }
        u11.Q0();
        if ((i12 & 1) != 0) {
        }
        if (i19 != 0) {
        }
        if ((i13 & 2) != 0) {
        }
        if (i21 != 0) {
        }
        int i2322 = Y0.f20925c;
        j15 = C7807Z.f72258l;
        int i2422 = i14 & (-7169);
        if (i15 != 0) {
        }
        i17 = i2422;
        j16 = j14;
        j17 = j15;
        f12 = f11;
        u11.j0();
        int i2522 = i16;
        C8416i c8416i22 = new C8416i(((Z1.d) u11.m(androidx.compose.ui.platform.K0.e())).v1(f12), 0.0f, i2522, 0, null, 26);
        m0.O c1122 = m0.T.c(null, u11, 1);
        long j2222 = j17;
        O.a b1122 = m0.T.b(c1122, 0, 5, m0.W0.c(), C8004n.a(C8004n.d(6660, 0, m0.G.b(), 2), null, 6), null, u11, 33208, 16);
        O.a a1122 = m0.T.a(c1122, 0.0f, 286.0f, C8004n.a(C8004n.d(1332, 0, m0.G.b(), 2), null, 6), null, u11, 4536, 8);
        O.a a1222 = m0.T.a(c1122, 0.0f, 290.0f, C8004n.a(C8004n.b(c.f20950b), null, 6), null, u11, 4536, 8);
        O.a a1322 = m0.T.a(c1122, 0.0f, 290.0f, C8004n.a(C8004n.b(d.f20951b), null, 6), null, u11, 4536, 8);
        androidx.compose.ui.e n1122 = androidx.compose.foundation.layout.a0.n(n0.c0.a(eVar2), f20933c);
        s11 = ((i17 & 896) == 256) | u11.s(j2222) | u11.F(c8416i22) | u11.n(b1122) | u11.n(a1222) | u11.n(a1322) | u11.n(a1122) | ((((i17 & 112) ^ 48) <= 32 && u11.s(j16)) || (i17 & 48) == 32);
        C11 = u11.C();
        if (s11) {
        }
        f13 = f12;
        j18 = j16;
        C11 = new a(f13, j2222, j18, b1122, a1222, a1322, a1122, c8416i22);
        u11.x(C11);
        C8392m.a(n1122, (Function1) C11, u11, 0);
        eVar3 = eVar2;
        j19 = j2222;
        f14 = f13;
        j21 = j18;
        i18 = i2522;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public static final void b(InterfaceC8412e interfaceC8412e, long j11, C8416i c8416i) {
        f(interfaceC8412e, 0.0f, 360.0f, j11, c8416i);
    }

    public static final void c(InterfaceC8412e interfaceC8412e, float f7, float f11, float f12, long j11, C8416i c8416i) {
        float f13;
        if (c8416i.a() == 0) {
            f13 = 0.0f;
        } else {
            f13 = ((f11 / (f20933c / 2)) * 57.29578f) / 2.0f;
        }
        f(interfaceC8412e, f7 + f13, Math.max(f12, 0.1f), j11, c8416i);
    }

    private static final void f(InterfaceC8412e interfaceC8412e, float f7, float f11, long j11, C8416i c8416i) {
        float f12 = 2;
        float e11 = c8416i.e() / f12;
        float f13 = C7464j.f(interfaceC8412e.i()) - (f12 * e11);
        interfaceC8412e.E1(j11, f7, f11, P9.a.a(e11, e11), C7465k.a(f13, f13), c8416i);
    }
}
