package J0;

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

/* loaded from: classes8.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13285a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13286b = 0;

    public static final void a(@NotNull androidx.compose.ui.e eVar, @NotNull Function2 function2, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, boolean z11, float f7, @NotNull C9915y c9915y, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-2112507061);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(c4912a2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(c4912a3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(c4912a4) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.p(z11) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.q(f7) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= u11.n(c9915y) ? 67108864 : 33554432;
        }
        if ((38347923 & i12) == 38347922 && u11.b()) {
            u11.j();
        } else {
            boolean z12 = ((3670016 & i12) == 1048576) | ((29360128 & i12) == 8388608) | ((234881024 & i12) == 67108864);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new m3(z11, f7, c9915y);
                u11.x(C11);
            }
            m3 m3Var = (m3) C11;
            Z1.s sVar = (Z1.s) u11.m(androidx.compose.ui.platform.K0.k());
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            S0.F1.b(u11, m3Var, InterfaceC2801g.a.e());
            S0.F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            if (c4912a3 != null) {
                u11.o(69542167);
                androidx.compose.ui.e l02 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Leading").l0(j3.d());
                B1.V f12 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I12 = u11.I();
                S0.A0 d12 = u11.d();
                androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, l02);
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
                c4912a3.invoke(u11, Integer.valueOf((i12 >> 12) & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(69783378);
                u11.k();
            }
            if (c4912a4 != null) {
                u11.o(69825941);
                androidx.compose.ui.e l03 = androidx.compose.ui.layout.a.b(androidx.compose.ui.e.f40358c0, "Trailing").l0(j3.d());
                B1.V f15 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I13 = u11.I();
                S0.A0 d13 = u11.d();
                androidx.compose.ui.e f16 = androidx.compose.ui.c.f(u11, l03);
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
                c4912a4.invoke(u11, Integer.valueOf((i12 >> 15) & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(70069074);
                u11.k();
            }
            float d14 = androidx.compose.foundation.layout.T.d(c9915y, sVar);
            float c11 = androidx.compose.foundation.layout.T.c(c9915y, sVar);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            if (c4912a3 != null) {
                d14 -= j3.c();
                float f18 = 0;
                if (d14 < f18) {
                    d14 = f18;
                }
            }
            float f19 = d14;
            if (c4912a4 != null) {
                c11 -= j3.c();
                float f21 = 0;
                if (c11 < f21) {
                    c11 = f21;
                }
            }
            androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(aVar, f19, 0.0f, c11, 0.0f, 10);
            if (c4912a2 != null) {
                u11.o(70826807);
                c4912a2.invoke(androidx.compose.ui.layout.a.b(aVar, "Hint").l0(j11), u11, Integer.valueOf((i12 >> 6) & 112));
                u11.k();
            } else {
                u11.o(70914258);
                u11.k();
            }
            if (c4912a != null) {
                u11.o(70948761);
                androidx.compose.ui.e l04 = androidx.compose.ui.layout.a.b(aVar, "Label").l0(j11);
                B1.V f22 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I14 = u11.I();
                S0.A0 d15 = u11.d();
                androidx.compose.ui.e f23 = androidx.compose.ui.c.f(u11, l04);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 f24 = T7.E.f(u11, f22, u11, d15);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                    Ep.a.d(I14, u11, I14, f24);
                }
                S0.F1.b(u11, f23, InterfaceC2801g.a.f());
                c4912a.invoke(u11, Integer.valueOf((i12 >> 6) & 14));
                u11.f();
                u11.k();
            } else {
                u11.o(71034290);
                u11.k();
            }
            androidx.compose.ui.e l05 = androidx.compose.ui.layout.a.b(aVar, "TextField").l0(j11);
            B1.V f25 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I15 = u11.I();
            S0.A0 d16 = u11.d();
            androidx.compose.ui.e f26 = androidx.compose.ui.c.f(u11, l05);
            Function0 a15 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 f27 = T7.E.f(u11, f25, u11, d16);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                Ep.a.d(I15, u11, I15, f27);
            }
            S0.F1.b(u11, f26, InterfaceC2801g.a.f());
            function2.invoke(u11, Integer.valueOf((i12 >> 3) & 14));
            u11.f();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new k3(eVar, function2, c4912a, c4912a2, c4912a3, c4912a4, z11, f7, c9915y, i11));
        }
    }

    public static final int b(int i11, boolean z11, int i12, int i13, int i14, int i15, long j11, float f7, C9915y c9915y) {
        float f11 = f13285a * f7;
        float d11 = c9915y.d() * f7;
        float a11 = c9915y.a() * f7;
        int max = Math.max(i11, i15);
        return Math.max(C6915b.c(z11 ? i12 + f11 + max + a11 : d11 + max + a11), Math.max(Math.max(i13, i14), Z1.b.l(j11)));
    }

    public static final float c() {
        return f13285a;
    }
}
