package P0;

import B0.C2454a;
import B1.m0;
import Bl0.C2656q;
import D1.InterfaceC2801g;
import Q1.X;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import hd.C6915b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;
import u0.InterfaceC9914x;

/* loaded from: classes8.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f20882a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static final long f20883b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20884c = 0;

    static {
        long l11 = R0.r.l();
        if (Hj0.T.e(l11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        f20883b = Hj0.T.f(Z1.u.e(l11) / 2, 1095216660480L & l11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull String str, @NotNull Function1 function1, androidx.compose.ui.e eVar, boolean z11, K1.T t2, C4912a c4912a, C4912a c4912a2, boolean z12, C2454a c2454a, B0.N0 n02, B0.M0 m02, int i11, int i12, t0.q qVar, l1.J0 j02, k2 k2Var, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15, int i16) {
        C4912a c4912a3;
        B0.N0 n03;
        int i17;
        t0.q qVar2;
        int i18;
        B0.M0 m03;
        k2 e11;
        B0.M0 m04;
        k2 k2Var2;
        int i19;
        int i21;
        K1.T t11;
        l1.J0 j03;
        C2454a c2454a2;
        boolean z13;
        long j11;
        long j12;
        long j13;
        long j14;
        t0.q qVar3;
        t0.q qVar4;
        long f7;
        C3969l c3969l;
        boolean z14;
        C2454a c2454a3;
        l1.J0 j04;
        t0.q qVar5;
        k2 k2Var3;
        K1.T t12;
        S0.J0 m05;
        C3969l u11 = interfaceC3967k.u(-1922450045);
        int i22 = i13 | (u11.n(str) ? 4 : 2) | (u11.F(function1) ? 32 : 16) | (u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        int i23 = 113339392 | i22;
        int i24 = i16 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i24 != 0) {
            i23 = 918645760 | i22;
        } else if ((i13 & 805306368) == 0) {
            c4912a3 = c4912a2;
            i23 |= u11.F(c4912a3) ? 536870912 : 268435456;
            int i25 = i14 | 438 | (!u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | 24576;
            if ((196608 & i14) != 0) {
                n03 = n02;
                i25 |= u11.n(n03) ? 131072 : 65536;
            } else {
                n03 = n02;
            }
            int i26 = i25 | 853016576;
            i17 = i16 & 1048576;
            if (i17 == 0) {
                i18 = 6;
                qVar2 = qVar;
            } else if ((i15 & 6) == 0) {
                qVar2 = qVar;
                i18 = i15 | (u11.n(qVar2) ? 4 : 2);
            } else {
                qVar2 = qVar;
                i18 = i15;
            }
            int i27 = i18 | 144;
            if ((i23 & 306783379) != 306783378 && (306783379 & i26) == 306783378 && (i27 & 147) == 146 && u11.b()) {
                u11.j();
                z14 = z11;
                c2454a3 = c2454a;
                m04 = m02;
                i21 = i11;
                i19 = i12;
                j04 = j02;
                k2Var3 = k2Var;
                qVar5 = qVar2;
                c3969l = u11;
                t12 = t2;
            } else {
                u11.Q0();
                if ((i13 & 1) != 0 || u11.w0()) {
                    K1.T t13 = (K1.T) u11.m(p2.d());
                    if (i24 != 0) {
                        c4912a3 = null;
                    }
                    C2454a a11 = X.a.a();
                    m03 = B0.M0.f1437b;
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    O0 o02 = O0.f20735a;
                    l1.J0 b11 = C3764p1.b(R0.h.b(), u11);
                    C3756n c3756n = (C3756n) u11.m(C3759o.d());
                    e11 = c3756n.e();
                    u11.o(1540400102);
                    if (e11 == null) {
                        long c11 = C3759o.c(c3756n, R0.h.p());
                        long c12 = C3759o.c(c3756n, R0.h.v());
                        long o11 = C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.c()));
                        long c13 = C3759o.c(c3756n, R0.h.j());
                        j11 = C7807Z.f72258l;
                        j12 = C7807Z.f72258l;
                        j13 = C7807Z.f72258l;
                        j14 = C7807Z.f72258l;
                        k2 k2Var4 = new k2(c11, c12, o11, c13, j11, j12, j13, j14, C3759o.c(c3756n, R0.h.a()), C3759o.c(c3756n, R0.h.i()), (I0.j1) u11.m(I0.k1.b()), C3759o.c(c3756n, R0.h.s()), C3759o.c(c3756n, R0.h.B()), C7807Z.o(0.12f, C3759o.c(c3756n, R0.h.f())), C3759o.c(c3756n, R0.h.m()), C3759o.c(c3756n, R0.h.r()), C3759o.c(c3756n, R0.h.A()), C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.e())), C3759o.c(c3756n, R0.h.l()), C3759o.c(c3756n, R0.h.u()), C3759o.c(c3756n, R0.h.D()), C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.h())), C3759o.c(c3756n, R0.h.o()), C3759o.c(c3756n, R0.h.q()), C3759o.c(c3756n, R0.h.z()), C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.d())), C3759o.c(c3756n, R0.h.k()), C3759o.c(c3756n, R0.h.w()), C3759o.c(c3756n, R0.h.w()), C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.c())), C3759o.c(c3756n, R0.h.w()), C3759o.c(c3756n, R0.h.t()), C3759o.c(c3756n, R0.h.C()), C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.g())), C3759o.c(c3756n, R0.h.n()), C3759o.c(c3756n, R0.h.x()), C3759o.c(c3756n, R0.h.x()), C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.x())), C3759o.c(c3756n, R0.h.x()), C3759o.c(c3756n, R0.h.y()), C3759o.c(c3756n, R0.h.y()), C7807Z.o(0.38f, C3759o.c(c3756n, R0.h.y())), C3759o.c(c3756n, R0.h.y()));
                        c3756n.T(k2Var4);
                        e11 = k2Var4;
                    }
                    u11.k();
                    m04 = m03;
                    k2Var2 = e11;
                    i19 = 1;
                    i21 = Integer.MAX_VALUE;
                    t11 = t13;
                    j03 = b11;
                    c2454a2 = a11;
                    z13 = true;
                } else {
                    u11.j();
                    z13 = z11;
                    t11 = t2;
                    c2454a2 = c2454a;
                    m04 = m02;
                    i21 = i11;
                    i19 = i12;
                    j03 = j02;
                    k2Var2 = k2Var;
                }
                qVar3 = qVar2;
                C4912a c4912a4 = c4912a3;
                u11.j0();
                u11.o(30062948);
                if (qVar3 != null) {
                    Object C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = t0.p.a();
                        u11.x(C11);
                    }
                    qVar4 = (t0.q) C11;
                } else {
                    qVar4 = qVar3;
                }
                u11.k();
                u11.o(30069058);
                f7 = t11.f();
                if (f7 == 16) {
                    f7 = k2Var2.f(z13, z12, ((Boolean) t0.i.a(qVar4, u11, 0).getValue()).booleanValue());
                }
                long j15 = f7;
                u11.k();
                K1.T E11 = t11.E(new K1.T(j15, 0L, null, null, 0L, 0, 0L, null, 0, 16777214));
                Z1.d dVar = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
                K1.T t14 = t11;
                S0.H0 c14 = I0.k1.b().c(k2Var2.c());
                k2 k2Var5 = k2Var2;
                S0 s02 = new S0(eVar, c4912a, dVar, z12, k2Var5, str, function1, z13, E11, n03, m04, i21, i19, c2454a2, qVar4, c4912a4, j03);
                c3969l = u11;
                C3996z.a(c14, a1.c.c(-1886965181, s02, c3969l), c3969l, 56);
                z14 = z13;
                c2454a3 = c2454a2;
                c4912a3 = c4912a4;
                j04 = j03;
                qVar5 = qVar3;
                k2Var3 = k2Var5;
                t12 = t14;
            }
            m05 = c3969l.m0();
            if (m05 == null) {
                m05.G(new T0(str, function1, eVar, z14, t12, c4912a, c4912a3, z12, c2454a3, n02, m04, i21, i19, qVar5, j04, k2Var3, i13, i14, i15, i16));
                return;
            }
            return;
        }
        c4912a3 = c4912a2;
        int i252 = i14 | 438 | (!u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | 24576;
        if ((196608 & i14) != 0) {
        }
        int i262 = i252 | 853016576;
        i17 = i16 & 1048576;
        if (i17 == 0) {
        }
        int i272 = i18 | 144;
        if ((i23 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i13 & 1) != 0) {
        }
        K1.T t132 = (K1.T) u11.m(p2.d());
        if (i24 != 0) {
        }
        C2454a a112 = X.a.a();
        m03 = B0.M0.f1437b;
        if (i17 != 0) {
        }
        O0 o022 = O0.f20735a;
        l1.J0 b112 = C3764p1.b(R0.h.b(), u11);
        C3756n c3756n2 = (C3756n) u11.m(C3759o.d());
        e11 = c3756n2.e();
        u11.o(1540400102);
        if (e11 == null) {
        }
        u11.k();
        m04 = m03;
        k2Var2 = e11;
        i19 = 1;
        i21 = Integer.MAX_VALUE;
        t11 = t132;
        j03 = b112;
        c2454a2 = a112;
        z13 = true;
        qVar3 = qVar2;
        C4912a c4912a42 = c4912a3;
        u11.j0();
        u11.o(30062948);
        if (qVar3 != null) {
        }
        u11.k();
        u11.o(30069058);
        f7 = t11.f();
        if (f7 == 16) {
        }
        long j152 = f7;
        u11.k();
        K1.T E112 = t11.E(new K1.T(j152, 0L, null, null, 0L, 0, 0L, null, 0, 16777214));
        Z1.d dVar2 = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
        K1.T t142 = t11;
        S0.H0 c142 = I0.k1.b().c(k2Var2.c());
        k2 k2Var52 = k2Var2;
        S0 s022 = new S0(eVar, c4912a, dVar2, z12, k2Var52, str, function1, z13, E112, n03, m04, i21, i19, c2454a2, qVar4, c4912a42, j03);
        c3969l = u11;
        C3996z.a(c142, a1.c.c(-1886965181, s022, c3969l), c3969l, 56);
        z14 = z13;
        c2454a3 = c2454a2;
        c4912a3 = c4912a42;
        j04 = j03;
        qVar5 = qVar3;
        k2Var3 = k2Var52;
        t12 = t142;
        m05 = c3969l.m0();
        if (m05 == null) {
        }
    }

    public static final void b(@NotNull e.a aVar, @NotNull Function2 function2, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, C4912a c4912a5, C4912a c4912a6, float f7, @NotNull Function1 function1, @NotNull C4912a c4912a7, C4912a c4912a8, @NotNull C9915y c9915y, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        C9915y c9915y2;
        float f11;
        int i15;
        float f12;
        C4912a c4912a9;
        C4912a c4912a10;
        C3969l u11 = interfaceC3967k.u(1408290209);
        if ((i11 & 6) == 0) {
            i13 = i11 | (u11.n(aVar) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.F(function2) ? 32 : 16;
        }
        int i16 = i11 & 384;
        int i17 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i16 == 0) {
            i13 |= u11.F(c4912a) ? 256 : 128;
        }
        int i18 = i11 & 3072;
        int i19 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i18 == 0) {
            i13 |= u11.F(c4912a2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.F(c4912a3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= u11.F(c4912a4) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= u11.F(c4912a5) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= u11.F(c4912a6) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= u11.p(false) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.q(f7) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.F(function1) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.F(c4912a7) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.F(c4912a8)) {
                i17 = 256;
            }
            i14 |= i17;
        }
        if ((i12 & 3072) == 0) {
            c9915y2 = c9915y;
            if (u11.n(c9915y2)) {
                i19 = 2048;
            }
            i14 |= i19;
        } else {
            c9915y2 = c9915y;
        }
        int i21 = i14;
        if ((i13 & 306783379) == 306783378 && (i21 & 1171) == 1170 && u11.b()) {
            u11.j();
            c4912a10 = c4912a8;
            c4912a9 = c4912a2;
        } else {
            boolean z11 = ((i21 & 14) == 4) | ((i13 & 234881024) == 67108864) | ((i13 & 1879048192) == 536870912) | ((i21 & 7168) == 2048);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new X0(function1, f7, c9915y2);
                u11.x(C11);
            }
            X0 x02 = (X0) C11;
            Z1.s sVar = (Z1.s) u11.m(androidx.compose.ui.platform.K0.k());
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            S0.F1.b(u11, x02, InterfaceC2801g.a.e());
            S0.F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            S0.F1.b(u11, f13, InterfaceC2801g.a.f());
            c4912a7.invoke(u11, Integer.valueOf((i21 >> 3) & 14));
            u11.o(250370369);
            if (c4912a3 != null) {
                androidx.compose.ui.e l02 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Leading").l0(Q0.A.f());
                B1.V f14 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I12 = u11.I();
                S0.A0 d12 = u11.d();
                androidx.compose.ui.e f15 = androidx.compose.ui.c.f(u11, l02);
                Function0 a12 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a12);
                } else {
                    u11.e();
                }
                Function2 f16 = T7.E.f(u11, f14, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, u11, I12, f16);
                }
                S0.F1.b(u11, f15, InterfaceC2801g.a.f());
                c4912a3.invoke(u11, Integer.valueOf((i13 >> 12) & 14));
                u11.f();
            }
            u11.k();
            u11.o(250379492);
            if (c4912a4 != null) {
                androidx.compose.ui.e l03 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Trailing").l0(Q0.A.f());
                B1.V f17 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I13 = u11.I();
                S0.A0 d13 = u11.d();
                androidx.compose.ui.e f18 = androidx.compose.ui.c.f(u11, l03);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 f19 = T7.E.f(u11, f17, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, f19);
                }
                S0.F1.b(u11, f18, InterfaceC2801g.a.f());
                c4912a4.invoke(u11, Integer.valueOf((i13 >> 15) & 14));
                u11.f();
            }
            u11.k();
            float d14 = androidx.compose.foundation.layout.T.d(c9915y2, sVar);
            float c11 = androidx.compose.foundation.layout.T.c(c9915y2, sVar);
            if (c4912a3 != null) {
                d14 -= Q0.A.e();
                float f21 = 0;
                if (d14 < f21) {
                    d14 = f21;
                }
            }
            float f22 = d14;
            if (c4912a4 != null) {
                c11 -= Q0.A.e();
                float f23 = 0;
                if (c11 < f23) {
                    c11 = f23;
                }
            }
            u11.o(250410106);
            if (c4912a5 != null) {
                androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Prefix"), Q0.A.j(), 0.0f, 2), 3), f22, 0.0f, Q0.A.k(), 0.0f, 10);
                B1.V f24 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I14 = u11.I();
                S0.A0 d15 = u11.d();
                androidx.compose.ui.e f25 = androidx.compose.ui.c.f(u11, j11);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 f26 = T7.E.f(u11, f24, u11, d15);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                    Ep.a.d(I14, u11, I14, f26);
                }
                S0.F1.b(u11, f25, InterfaceC2801g.a.f());
                c4912a5.invoke(u11, Integer.valueOf((i13 >> 18) & 14));
                u11.f();
            }
            u11.k();
            u11.o(250422072);
            if (c4912a6 != null) {
                f11 = c11;
                androidx.compose.ui.e j12 = androidx.compose.foundation.layout.T.j(androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Suffix"), Q0.A.j(), 0.0f, 2), 3), Q0.A.k(), 0.0f, f11, 0.0f, 10);
                B1.V f27 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I15 = u11.I();
                S0.A0 d16 = u11.d();
                androidx.compose.ui.e f28 = androidx.compose.ui.c.f(u11, j12);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a15);
                } else {
                    u11.e();
                }
                Function2 f29 = T7.E.f(u11, f27, u11, d16);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                    Ep.a.d(I15, u11, I15, f29);
                }
                S0.F1.b(u11, f28, InterfaceC2801g.a.f());
                c4912a6.invoke(u11, Integer.valueOf((i13 >> 21) & 14));
                u11.f();
            } else {
                f11 = c11;
            }
            u11.k();
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e u12 = androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(aVar2, Q0.A.j(), 0.0f, 2), 3);
            if (c4912a5 == null) {
                f12 = f22;
                i15 = 0;
            } else {
                i15 = 0;
                f12 = 0;
            }
            androidx.compose.ui.e j13 = androidx.compose.foundation.layout.T.j(u12, f12, 0.0f, c4912a6 == null ? f11 : i15, 0.0f, 10);
            u11.o(250444361);
            if (c4912a != null) {
                c4912a.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").l0(j13), u11, Integer.valueOf((i13 >> 3) & 112));
            }
            u11.k();
            androidx.compose.ui.e l04 = androidx.compose.ui.layout.a.b(aVar2, "TextField").l0(j13);
            B1.V f31 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I16 = u11.I();
            S0.A0 d17 = u11.d();
            androidx.compose.ui.e f32 = androidx.compose.ui.c.f(u11, l04);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 f33 = T7.E.f(u11, f31, u11, d17);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I16))) {
                Ep.a.d(I16, u11, I16, f33);
            }
            S0.F1.b(u11, f32, InterfaceC2801g.a.f());
            function2.invoke(u11, Integer.valueOf((i13 >> 3) & 14));
            u11.f();
            u11.o(250455481);
            if (c4912a2 != null) {
                androidx.compose.ui.e b12 = androidx.compose.ui.layout.a.b(androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(aVar2, C2656q.b(Q0.A.j(), Q0.A.h(), f7), 0.0f, 2), 3), "Label");
                B1.V f34 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I17 = u11.I();
                S0.A0 d18 = u11.d();
                androidx.compose.ui.e f35 = androidx.compose.ui.c.f(u11, b12);
                Function0 a17 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a17);
                } else {
                    u11.e();
                }
                Function2 f36 = T7.E.f(u11, f34, u11, d18);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I17))) {
                    Ep.a.d(I17, u11, I17, f36);
                }
                S0.F1.b(u11, f35, InterfaceC2801g.a.f());
                c4912a9 = c4912a2;
                c4912a9.invoke(u11, Integer.valueOf((i13 >> 9) & 14));
                u11.f();
            } else {
                c4912a9 = c4912a2;
            }
            u11.k();
            u11.o(250473414);
            if (c4912a8 != null) {
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.T.e(androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(androidx.compose.ui.layout.a.b(aVar2, "Supporting"), Q0.A.i(), 0.0f, 2), 3), l2.a());
                B1.V f37 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I18 = u11.I();
                S0.A0 d19 = u11.d();
                androidx.compose.ui.e f38 = androidx.compose.ui.c.f(u11, e11);
                Function0 a18 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a18);
                } else {
                    u11.e();
                }
                Function2 f39 = T7.E.f(u11, f37, u11, d19);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I18))) {
                    Ep.a.d(I18, u11, I18, f39);
                }
                S0.F1.b(u11, f38, InterfaceC2801g.a.f());
                c4912a10 = c4912a8;
                c4912a10.invoke(u11, Integer.valueOf((i21 >> 6) & 14));
                u11.f();
            } else {
                c4912a10 = c4912a8;
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new U0(aVar, function2, c4912a, c4912a9, c4912a3, c4912a4, c4912a5, c4912a6, f7, function1, c4912a7, c4912a10, c9915y2, i11, i12));
        }
    }

    public static final int c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, long j11, float f11, C9915y c9915y) {
        int c11 = Vc.a.c(new int[]{i17, i13, i14, C2656q.c(f7, i16, 0)}, i15);
        float d11 = c9915y.d() * f11;
        return Math.max(Z1.b.l(j11), Math.max(i11, Math.max(i12, C6915b.c(C2656q.b(d11, Math.max(d11, i16 / 2.0f), f7) + c11 + (c9915y.a() * f11)))) + i18);
    }

    public static final int d(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f7, long j11, float f11, C9915y c9915y) {
        int i18 = i13 + i14;
        int max = Math.max(i15 + i18, Math.max(i17 + i18, C2656q.c(f7, i16, 0))) + i11 + i12;
        Z1.s sVar = Z1.s.Ltr;
        return Math.max(max, Math.max(C6915b.c((i16 + ((c9915y.c(sVar) + c9915y.b(sVar)) * f11)) * f7), Z1.b.m(j11)));
    }

    public static final void f(m0.a aVar, int i11, int i12, B1.m0 m0Var, B1.m0 m0Var2, B1.m0 m0Var3, B1.m0 m0Var4, B1.m0 m0Var5, B1.m0 m0Var6, B1.m0 m0Var7, B1.m0 m0Var8, B1.m0 m0Var9, float f7, boolean z11, float f11, Z1.s sVar, InterfaceC9914x interfaceC9914x) {
        int i13;
        float f12;
        float f13;
        aVar.f(m0Var8, 0L, 0.0f);
        int o11 = i11 - Q0.A.o(m0Var9);
        int c11 = C6915b.c(interfaceC9914x.d() * f11);
        int c12 = C6915b.c(androidx.compose.foundation.layout.T.d(interfaceC9914x, sVar) * f11);
        float e11 = Q0.A.e() * f11;
        if (m0Var != null) {
            i13 = c12;
            f12 = e11;
            aVar.h(m0Var, 0, InterfaceC6250b.a.i().a(m0Var.l0(), o11), 0.0f);
        } else {
            i13 = c12;
            f12 = e11;
        }
        if (m0Var6 != null) {
            f13 = 0.0f;
            aVar.h(m0Var6, C6915b.c(m0Var == null ? 0.0f : (m0Var.u0() - f12) * (1 - f7)) + i13, C2656q.c(f7, z11 ? InterfaceC6250b.a.i().a(m0Var6.l0(), o11) : c11, -(m0Var6.l0() / 2)), 0.0f);
        } else {
            f13 = 0.0f;
        }
        if (m0Var3 != null) {
            aVar.h(m0Var3, Q0.A.q(m0Var), i(z11, o11, c11, m0Var6, m0Var3), f13);
        }
        int q11 = Q0.A.q(m0Var3) + Q0.A.q(m0Var);
        aVar.h(m0Var5, q11, i(z11, o11, c11, m0Var6, m0Var5), f13);
        if (m0Var7 != null) {
            aVar.h(m0Var7, q11, i(z11, o11, c11, m0Var6, m0Var7), f13);
        }
        if (m0Var4 != null) {
            aVar.h(m0Var4, (i12 - Q0.A.q(m0Var2)) - m0Var4.u0(), i(z11, o11, c11, m0Var6, m0Var4), f13);
        }
        if (m0Var2 != null) {
            aVar.h(m0Var2, i12 - m0Var2.u0(), InterfaceC6250b.a.i().a(m0Var2.l0(), o11), f13);
        }
        if (m0Var9 != null) {
            aVar.h(m0Var9, 0, o11, f13);
        }
    }

    public static final long g() {
        return f20883b;
    }

    @NotNull
    public static final androidx.compose.ui.e h(@NotNull androidx.compose.ui.e eVar, @NotNull Function0 function0, @NotNull C9915y c9915y) {
        return androidx.compose.ui.draw.c.d(eVar, new V0(function0, c9915y));
    }

    private static final int i(boolean z11, int i11, int i12, B1.m0 m0Var, B1.m0 m0Var2) {
        if (z11) {
            i12 = InterfaceC6250b.a.i().a(m0Var2.l0(), i11);
        }
        return Math.max(i12, Q0.A.o(m0Var) / 2);
    }
}
