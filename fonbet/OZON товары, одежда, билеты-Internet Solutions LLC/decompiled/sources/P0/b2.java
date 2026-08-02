package P0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b2 {

    /* renamed from: d, reason: collision with root package name */
    private static final float f20983d;

    /* renamed from: f, reason: collision with root package name */
    private static final float f20985f;

    /* renamed from: a, reason: collision with root package name */
    private static final float f20980a = 600;

    /* renamed from: b, reason: collision with root package name */
    private static final float f20981b = 30;

    /* renamed from: c, reason: collision with root package name */
    private static final float f20982c = 16;

    /* renamed from: e, reason: collision with root package name */
    private static final float f20984e = 6;

    static {
        float f7 = 8;
        f20983d = f7;
        f20985f = f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, Function2 function2, C4912a c4912a, l1.J0 j02, long j11, long j12, long j13, long j14, @NotNull C4912a c4912a2, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2 function22;
        C4912a c4912a3;
        long j15;
        long j16;
        int i14;
        long j17;
        long j18;
        long j19;
        C4912a c4912a4;
        long j21;
        long j22;
        long j23;
        C3969l c3969l;
        C4912a c4912a5;
        long j24;
        long j25;
        S0.J0 m02;
        int i15;
        int i16;
        C3969l u11 = interfaceC3967k.u(-1235788955);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            function22 = function2;
            i13 |= u11.F(function22) ? 32 : 16;
        } else {
            function22 = function2;
        }
        int i17 = i12 & 4;
        if (i17 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            c4912a3 = c4912a;
            i13 |= u11.F(c4912a3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.p(false) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i11 & 24576) == 0) {
                i13 |= u11.n(j02) ? 16384 : 8192;
            }
            if ((196608 & i11) == 0) {
                i13 |= u11.s(j11) ? 131072 : 65536;
            }
            if ((1572864 & i11) != 0) {
                if ((i12 & 64) == 0) {
                    j15 = j12;
                    if (u11.s(j15)) {
                        i16 = 1048576;
                        i13 |= i16;
                    }
                } else {
                    j15 = j12;
                }
                i16 = 524288;
                i13 |= i16;
            } else {
                j15 = j12;
            }
            if ((12582912 & i11) != 0) {
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    j16 = j13;
                    if (u11.s(j16)) {
                        i15 = 8388608;
                        i13 |= i15;
                    }
                } else {
                    j16 = j13;
                }
                i15 = 4194304;
                i13 |= i15;
            } else {
                j16 = j13;
            }
            if ((100663296 & i11) != 0) {
                i14 = i13 | (((i12 & 256) == 0 && u11.s(j14)) ? 67108864 : 33554432);
            } else {
                i14 = i13;
            }
            if ((i11 & 805306368) == 0) {
                i14 |= u11.F(c4912a2) ? 536870912 : 268435456;
            }
            if ((306783379 & i14) == 306783378 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    C4912a c4912a6 = i17 == 0 ? null : c4912a3;
                    if ((i12 & 64) == 0) {
                        j17 = C3759o.e(R0.o.h(), u11);
                        i14 &= -3670017;
                    } else {
                        j17 = j15;
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        j18 = C3759o.e(R0.o.a(), u11);
                        i14 &= -29360129;
                    } else {
                        j18 = j16;
                    }
                    if ((i12 & 256) == 0) {
                        i14 &= -234881025;
                        c4912a4 = c4912a6;
                        j21 = j17;
                        j22 = j18;
                        j19 = C3759o.e(R0.o.f(), u11);
                    } else {
                        j19 = j14;
                        c4912a4 = c4912a6;
                        j21 = j17;
                        j22 = j18;
                    }
                } else {
                    u11.j();
                    if ((i12 & 64) != 0) {
                        i14 &= -3670017;
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        i14 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i14 &= -234881025;
                    }
                    j19 = j14;
                    c4912a4 = c4912a3;
                    j21 = j15;
                    j22 = j16;
                }
                u11.j0();
                int i18 = i14 >> 9;
                e2.a(eVar, j02, j11, j21, 0.0f, R0.o.d(), a1.c.c(-1829663446, new S1(function22, c4912a2, c4912a4, j22, j19), u11), u11, (i14 & 14) | 12779520 | (i18 & 112) | (i18 & 896) | (i18 & 7168), 80);
                j23 = j21;
                c3969l = u11;
                c4912a5 = c4912a4;
                j24 = j22;
                j25 = j19;
            } else {
                u11.j();
                c4912a5 = c4912a3;
                j23 = j15;
                c3969l = u11;
                j24 = j16;
                j25 = j14;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new T1(eVar, function2, c4912a5, j02, j11, j23, j24, j25, c4912a2, i11, i12));
                return;
            }
            return;
        }
        c4912a3 = c4912a;
        if ((i12 & 8) == 0) {
        }
        if ((i11 & 24576) == 0) {
        }
        if ((196608 & i11) == 0) {
        }
        if ((1572864 & i11) != 0) {
        }
        if ((12582912 & i11) != 0) {
        }
        if ((100663296 & i11) != 0) {
        }
        if ((i11 & 805306368) == 0) {
        }
        if ((306783379 & i14) == 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i17 == 0) {
        }
        if ((i12 & 64) == 0) {
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((i12 & 256) == 0) {
        }
        u11.j0();
        int i182 = i14 >> 9;
        e2.a(eVar, j02, j11, j21, 0.0f, R0.o.d(), a1.c.c(-1829663446, new S1(function22, c4912a2, c4912a4, j22, j19), u11), u11, (i14 & 14) | 12779520 | (i182 & 112) | (i182 & 896) | (i182 & 7168), 80);
        j23 = j21;
        c3969l = u11;
        c4912a5 = c4912a4;
        j24 = j22;
        j25 = j19;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    public static final void b(@NotNull InterfaceC3793z1 interfaceC3793z1, androidx.compose.ui.e eVar, l1.J0 j02, long j11, long j12, long j13, long j14, long j15, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e eVar2;
        long e11;
        int i13;
        l1.J0 j03;
        long j16;
        long j17;
        long e12;
        long e13;
        C3969l c3969l;
        long j18;
        l1.J0 j04;
        long j19;
        long j21;
        long j22;
        long j23;
        C3969l u11 = interfaceC3967k.u(274621471);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC3793z1) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = i12 | 432;
        if ((i11 & 3072) == 0) {
            i14 = i12 | 1456;
        }
        if ((i11 & 24576) == 0) {
            i14 |= 8192;
        }
        if ((196608 & i11) == 0) {
            i14 |= 65536;
        }
        if ((1572864 & i11) == 0) {
            i14 |= 524288;
        }
        if ((12582912 & i11) == 0) {
            i14 |= 4194304;
        }
        if ((100663296 & i11) == 0) {
            i14 |= 33554432;
        }
        if ((38347923 & i14) == 38347922 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            j04 = j02;
            j19 = j11;
            j21 = j12;
            j18 = j13;
            j22 = j14;
            j23 = j15;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                eVar2 = androidx.compose.ui.e.f40358c0;
                l1.J0 b11 = C3764p1.b(R0.o.e(), u11);
                long e14 = C3759o.e(R0.o.c(), u11);
                long e15 = C3759o.e(R0.o.h(), u11);
                e11 = C3759o.e(R0.o.a(), u11);
                i13 = i14 & (-268434433);
                j03 = b11;
                j16 = e14;
                j17 = e15;
                e12 = C3759o.e(R0.o.a(), u11);
                e13 = C3759o.e(R0.o.f(), u11);
            } else {
                u11.j();
                j03 = j02;
                j16 = j11;
                j17 = j12;
                e11 = j13;
                e12 = j14;
                e13 = j15;
                i13 = i14 & (-268434433);
                eVar2 = eVar;
            }
            u11.j0();
            String b12 = interfaceC3793z1.b().b();
            u11.o(1561344786);
            C4912a c11 = b12 != null ? a1.c.c(-1378313599, new Y1(e11, interfaceC3793z1, b12), u11) : null;
            u11.k();
            u11.o(1561358724);
            C4912a c12 = interfaceC3793z1.b().a() ? a1.c.c(-1812633777, new a2(interfaceC3793z1), u11) : null;
            u11.k();
            c3969l = u11;
            a(androidx.compose.foundation.layout.T.f(eVar2, 12), c11, c12, j03, j16, j17, e12, e13, a1.c.c(-1266389126, new U1(interfaceC3793z1), u11), c3969l, ((i13 << 3) & 7168) | 805306368, 0);
            j18 = e11;
            j04 = j03;
            j19 = j16;
            j21 = j17;
            j22 = e12;
            j23 = e13;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new V1(interfaceC3793z1, eVar2, j04, j19, j21, j18, j22, j23, i11));
        }
    }

    public static final void c(C4912a c4912a, Function2 function2, C4912a c4912a2, K1.T t2, long j11, long j12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j13;
        int i13;
        C3969l u11 = interfaceC3967k.u(-903235475);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(c4912a) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(t2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            j13 = j11;
            i12 |= u11.s(j13) ? 16384 : 8192;
        } else {
            j13 = j11;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.s(j12) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e j14 = androidx.compose.foundation.layout.T.j(aVar, f20982c, 0.0f, c4912a2 == null ? f20983d : 0, 0.0f, 10);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new P1();
                u11.x(C11);
            }
            B1.V v11 = (B1.V) C11;
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, j14);
            int i14 = i12;
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f11 = T7.E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f11);
            }
            S0.F1.b(u11, f7, InterfaceC2801g.a.f());
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.T.h(androidx.compose.ui.layout.a.b(aVar, "text"), 0.0f, f20984e, 1);
            B1.V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            S0.A0 d12 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, h11);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f14 = T7.E.f(u11, f12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f14);
            }
            S0.F1.b(u11, f13, InterfaceC2801g.a.f());
            c4912a.invoke(u11, Integer.valueOf(i14 & 14));
            u11.f();
            u11.o(-904778058);
            if (function2 != null) {
                androidx.compose.ui.e b11 = androidx.compose.ui.layout.a.b(aVar, "action");
                B1.V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I13 = u11.I();
                S0.A0 d13 = u11.d();
                androidx.compose.ui.e f16 = androidx.compose.ui.c.f(u11, b11);
                i13 = 8;
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 f17 = T7.E.f(u11, f15, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, f17);
                }
                S0.F1.b(u11, f16, InterfaceC2801g.a.f());
                C3996z.b(new S0.H0[]{C3776u.a().c(C7807Z.m(j13)), p2.d().c(t2)}, function2, u11, 8 | (i14 & 112));
                u11.f();
            } else {
                i13 = 8;
            }
            u11.k();
            u11.o(-904766579);
            if (c4912a2 != null) {
                androidx.compose.ui.e b12 = androidx.compose.ui.layout.a.b(aVar, "dismissAction");
                B1.V f18 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I14 = u11.I();
                S0.A0 d14 = u11.d();
                androidx.compose.ui.e f19 = androidx.compose.ui.c.f(u11, b12);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 f21 = T7.E.f(u11, f18, u11, d14);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                    Ep.a.d(I14, u11, I14, f21);
                }
                S0.F1.b(u11, f19, InterfaceC2801g.a.f());
                C3996z.a(C3776u.a().c(C7807Z.m(j12)), c4912a2, u11, i13 | ((i14 >> 3) & 112));
                u11.f();
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Q1(c4912a, function2, c4912a2, t2, j13, j12, i11));
        }
    }
}
