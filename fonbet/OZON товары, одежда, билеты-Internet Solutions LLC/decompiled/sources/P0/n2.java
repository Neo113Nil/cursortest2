package P0;

import B1.m0;
import Bl0.C2656q;
import D1.InterfaceC2801g;
import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import hd.C6915b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;
import u0.InterfaceC9914x;

/* loaded from: classes8.dex */
public final class n2 {
    public static final void a(@NotNull e.a aVar, @NotNull Function2 function2, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, C4912a c4912a5, C4912a c4912a6, float f7, @NotNull C4912a c4912a7, C4912a c4912a8, @NotNull C9915y c9915y, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        float f11;
        int i15;
        float f12;
        Function2 function22;
        C4912a c4912a9;
        C3969l u11 = interfaceC3967k.u(-1830307184);
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
        if ((i11 & 3072) == 0) {
            i13 |= u11.F(c4912a2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
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
            i14 = i12 | (u11.F(c4912a7) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.F(c4912a8) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            if (u11.n(c9915y)) {
                i17 = 256;
            }
            i14 |= i17;
        }
        int i18 = i14;
        if ((i13 & 306783379) == 306783378 && (i18 & 147) == 146 && u11.b()) {
            u11.j();
            function22 = function2;
            c4912a9 = c4912a8;
        } else {
            boolean z11 = ((i18 & 896) == 256) | ((i13 & 234881024) == 67108864) | ((i13 & 1879048192) == 536870912);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new o2(f7, c9915y);
                u11.x(C11);
            }
            o2 o2Var = (o2) C11;
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
            S0.F1.b(u11, o2Var, InterfaceC2801g.a.e());
            S0.F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            S0.F1.b(u11, f13, InterfaceC2801g.a.f());
            c4912a7.invoke(u11, Integer.valueOf(i18 & 14));
            u11.o(1341517187);
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
            u11.o(1341526310);
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
            float d14 = androidx.compose.foundation.layout.T.d(c9915y, sVar);
            float c11 = androidx.compose.foundation.layout.T.c(c9915y, sVar);
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
            u11.o(1341556924);
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
            u11.o(1341568890);
            if (c4912a6 != null) {
                float f27 = c11;
                androidx.compose.ui.e j12 = androidx.compose.foundation.layout.T.j(androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Suffix"), Q0.A.j(), 0.0f, 2), 3), Q0.A.k(), 0.0f, f27, 0.0f, 10);
                f11 = f27;
                B1.V f28 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I15 = u11.I();
                S0.A0 d16 = u11.d();
                androidx.compose.ui.e f29 = androidx.compose.ui.c.f(u11, j12);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a15);
                } else {
                    u11.e();
                }
                Function2 f31 = T7.E.f(u11, f28, u11, d16);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                    Ep.a.d(I15, u11, I15, f31);
                }
                S0.F1.b(u11, f29, InterfaceC2801g.a.f());
                c4912a6.invoke(u11, Integer.valueOf((i13 >> 21) & 14));
                u11.f();
            } else {
                f11 = c11;
            }
            u11.k();
            u11.o(1341581092);
            if (c4912a != null) {
                androidx.compose.ui.e j13 = androidx.compose.foundation.layout.T.j(androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Label"), C2656q.b(Q0.A.j(), Q0.A.h(), f7), 0.0f, 2), 3), f22, 0.0f, f11, 0.0f, 10);
                B1.V f32 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I16 = u11.I();
                S0.A0 d17 = u11.d();
                androidx.compose.ui.e f33 = androidx.compose.ui.c.f(u11, j13);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a16);
                } else {
                    u11.e();
                }
                Function2 f34 = T7.E.f(u11, f32, u11, d17);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I16))) {
                    Ep.a.d(I16, u11, I16, f34);
                }
                S0.F1.b(u11, f33, InterfaceC2801g.a.f());
                c4912a.invoke(u11, Integer.valueOf((i13 >> 6) & 14));
                u11.f();
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
            androidx.compose.ui.e j14 = androidx.compose.foundation.layout.T.j(u12, f12, 0.0f, c4912a6 == null ? f11 : i15, 0.0f, 10);
            u11.o(1341611627);
            if (c4912a2 != null) {
                c4912a2.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").l0(j14), u11, Integer.valueOf((i13 >> 6) & 112));
            }
            u11.k();
            androidx.compose.ui.e l04 = androidx.compose.ui.layout.a.b(aVar2, "TextField").l0(j14);
            B1.V f35 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I17 = u11.I();
            S0.A0 d18 = u11.d();
            androidx.compose.ui.e f36 = androidx.compose.ui.c.f(u11, l04);
            Function0 a17 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a17);
            } else {
                u11.e();
            }
            Function2 f37 = T7.E.f(u11, f35, u11, d18);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I17))) {
                Ep.a.d(I17, u11, I17, f37);
            }
            S0.F1.b(u11, f36, InterfaceC2801g.a.f());
            function22 = function2;
            function22.invoke(u11, Integer.valueOf((i13 >> 3) & 14));
            u11.f();
            u11.o(1341622624);
            if (c4912a8 != null) {
                androidx.compose.ui.e e11 = androidx.compose.foundation.layout.T.e(androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.h(androidx.compose.ui.layout.a.b(aVar2, "Supporting"), Q0.A.i(), 0.0f, 2), 3), l2.a());
                B1.V f38 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I18 = u11.I();
                S0.A0 d19 = u11.d();
                androidx.compose.ui.e f39 = androidx.compose.ui.c.f(u11, e11);
                Function0 a18 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a18);
                } else {
                    u11.e();
                }
                Function2 f41 = T7.E.f(u11, f38, u11, d19);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I18))) {
                    Ep.a.d(I18, u11, I18, f41);
                }
                S0.F1.b(u11, f39, InterfaceC2801g.a.f());
                c4912a9 = c4912a8;
                c4912a9.invoke(u11, Integer.valueOf((i18 >> 3) & 14));
                u11.f();
            } else {
                c4912a9 = c4912a8;
            }
            u11.k();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new m2(aVar, function22, c4912a, c4912a2, c4912a3, c4912a4, c4912a5, c4912a6, f7, c4912a7, c4912a9, c9915y, i11, i12));
        }
    }

    public static final int b(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f7, long j11, float f11, C9915y c9915y) {
        boolean z11 = i12 > 0;
        float a11 = (c9915y.a() + c9915y.d()) * f11;
        if (z11) {
            a11 = C2656q.b(Q0.A.m() * 2 * f11, a11, f7);
        }
        return Math.max(Z1.b.l(j11), Math.max(i13, Math.max(i14, C6915b.c(a11 + C2656q.c(f7, 0, i12) + Vc.a.c(new int[]{i17, i15, i16, C2656q.c(f7, i12, 0)}, i11)))) + i18);
    }

    public static final void c(m0.a aVar, int i11, int i12, B1.m0 m0Var, B1.m0 m0Var2, B1.m0 m0Var3, B1.m0 m0Var4, B1.m0 m0Var5, B1.m0 m0Var6, B1.m0 m0Var7, B1.m0 m0Var8, boolean z11, float f7, InterfaceC9914x interfaceC9914x) {
        aVar.f(m0Var7, 0L, 0.0f);
        int o11 = i12 - Q0.A.o(m0Var8);
        int c11 = C6915b.c(interfaceC9914x.d() * f7);
        if (m0Var3 != null) {
            aVar.h(m0Var3, 0, InterfaceC6250b.a.i().a(m0Var3.l0(), o11), 0.0f);
        }
        if (m0Var5 != null) {
            aVar.h(m0Var5, Q0.A.q(m0Var3), d(z11, o11, c11, m0Var5), 0.0f);
        }
        int q11 = Q0.A.q(m0Var5) + Q0.A.q(m0Var3);
        aVar.h(m0Var, q11, d(z11, o11, c11, m0Var), 0.0f);
        if (m0Var2 != null) {
            aVar.h(m0Var2, q11, d(z11, o11, c11, m0Var2), 0.0f);
        }
        if (m0Var6 != null) {
            aVar.h(m0Var6, (i11 - Q0.A.q(m0Var4)) - m0Var6.u0(), d(z11, o11, c11, m0Var6), 0.0f);
        }
        if (m0Var4 != null) {
            aVar.h(m0Var4, i11 - m0Var4.u0(), InterfaceC6250b.a.i().a(m0Var4.l0(), o11), 0.0f);
        }
        if (m0Var8 != null) {
            aVar.h(m0Var8, 0, o11, 0.0f);
        }
    }

    private static final int d(boolean z11, int i11, int i12, B1.m0 m0Var) {
        return z11 ? InterfaceC6250b.a.i().a(m0Var.l0(), i11) : i12;
    }
}
