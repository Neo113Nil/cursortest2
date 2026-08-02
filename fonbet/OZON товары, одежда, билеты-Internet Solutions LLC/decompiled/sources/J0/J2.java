package J0;

import D1.InterfaceC2801g;
import S0.C3969l;
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
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class J2 {

    /* renamed from: c, reason: collision with root package name */
    private static final float f12878c;

    /* renamed from: e, reason: collision with root package name */
    private static final float f12880e;

    /* renamed from: a, reason: collision with root package name */
    private static final float f12876a = 30;

    /* renamed from: b, reason: collision with root package name */
    private static final float f12877b = 16;

    /* renamed from: d, reason: collision with root package name */
    private static final float f12879d = 6;

    /* renamed from: f, reason: collision with root package name */
    private static final float f12881f = 48;

    /* renamed from: g, reason: collision with root package name */
    private static final float f12882g = 68;

    static {
        float f7 = 8;
        f12878c = f7;
        f12880e = f7;
    }

    public static final void a(androidx.compose.ui.e eVar, C4912a c4912a, A0.a aVar, long j11, long j12, float f7, @NotNull C4912a c4912a2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-558258760);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(false) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(aVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.s(j11) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.s(j12) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= u11.q(f7) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(c4912a2) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            int i13 = i12 >> 6;
            c3969l = u11;
            R2.a(eVar, aVar, j11, j12, f7, a1.c.c(-2084221700, new A2(c4912a, c4912a2), u11), c3969l, 1572864 | (i12 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | ((i12 >> 3) & 458752), 16);
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new B2(eVar, c4912a, aVar, j11, j12, f7, c4912a2, i11));
        }
    }

    public static final void b(@NotNull InterfaceC3295g2 interfaceC3295g2, androidx.compose.ui.e eVar, A0.a aVar, long j11, long j12, long j13, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e eVar2;
        int i13;
        int i14;
        long i15;
        int i16;
        A0.a aVar2;
        long j14;
        long j15;
        float f11;
        C4912a c4912a;
        C3969l c3969l;
        long j16;
        androidx.compose.ui.e eVar3;
        A0.a aVar3;
        long j17;
        long j18;
        float f12;
        C3969l u11 = interfaceC3967k.u(258660814);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(interfaceC3295g2) : u11.F(interfaceC3295g2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i17 = i12 | 432;
        if ((i11 & 3072) == 0) {
            i17 = i12 | 1456;
        }
        if ((i11 & 24576) == 0) {
            i17 |= 8192;
        }
        if ((196608 & i11) == 0) {
            i17 |= 65536;
        }
        if ((1572864 & i11) == 0) {
            i17 |= 524288;
        }
        int i18 = i17 | 12582912;
        if ((4793491 & i18) == 4793490 && u11.b()) {
            u11.j();
            eVar3 = eVar;
            aVar3 = aVar;
            j17 = j11;
            j18 = j12;
            j16 = j13;
            f12 = f7;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                eVar2 = androidx.compose.ui.e.f40358c0;
                A0.a c11 = ((C3286e2) u11.m(C3291f2.a())).c();
                long f13 = C7811b0.f(C7807Z.o(0.8f, ((C3339s) u11.m(C3343t.d())).g()), ((C3339s) u11.m(C3343t.d())).l());
                long l11 = ((C3339s) u11.m(C3343t.d())).l();
                C3339s c3339s = (C3339s) u11.m(C3343t.d());
                if (c3339s.m()) {
                    i13 = 12582912;
                    i14 = i18;
                    i15 = C7811b0.f(C7807Z.o(0.6f, c3339s.l()), c3339s.h());
                } else {
                    i13 = 12582912;
                    i14 = i18;
                    i15 = c3339s.i();
                }
                i16 = (-4193281) & i14;
                aVar2 = c11;
                j14 = f13;
                j15 = l11;
                f11 = 6;
            } else {
                u11.j();
                eVar2 = eVar;
                aVar2 = aVar;
                j14 = j11;
                j15 = j12;
                f11 = f7;
                i13 = 12582912;
                i16 = i18 & (-4193281);
                i15 = j13;
            }
            u11.j0();
            String b11 = interfaceC3295g2.b();
            if (b11 != null) {
                u11.o(1609178760);
                c4912a = a1.c.c(1843479216, new G2(i15, interfaceC3295g2, b11), u11);
                u11.k();
            } else {
                u11.o(1609445763);
                u11.k();
                c4912a = null;
            }
            c3969l = u11;
            a(androidx.compose.foundation.layout.T.f(eVar2, 12), c4912a, aVar2, j14, j15, f11, a1.c.c(-261845785, new C2(interfaceC3295g2), u11), c3969l, (i16 & 896) | i13 | ((i16 >> 3) & 3670016));
            j16 = i15;
            eVar3 = eVar2;
            aVar3 = aVar2;
            j17 = j14;
            j18 = j15;
            f12 = f11;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new D2(interfaceC3295g2, eVar3, aVar3, j17, j18, j16, f12, i11));
        }
    }

    public static final void c(C4912a c4912a, C4912a c4912a2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-534813202);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(c4912a) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(c4912a2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e j11 = androidx.compose.foundation.layout.T.j(aVar, f12877b, 0.0f, f12878c, 0.0f, 10);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C3358w2();
                u11.x(C11);
            }
            B1.V v11 = (B1.V) C11;
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, j11);
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
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.T.h(androidx.compose.ui.layout.a.b(aVar, "text"), 0.0f, f12879d, 1);
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
            c4912a.invoke(u11, Integer.valueOf(i12 & 14));
            u11.f();
            androidx.compose.ui.e b11 = androidx.compose.ui.layout.a.b(aVar, "action");
            B1.V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I13 = u11.I();
            S0.A0 d13 = u11.d();
            androidx.compose.ui.e f16 = androidx.compose.ui.c.f(u11, b11);
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
            c4912a2.invoke(u11, Integer.valueOf((i12 >> 3) & 14));
            u11.f();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3362x2(c4912a, c4912a2, i11));
        }
    }

    public static final void d(C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(917397959);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(c4912a) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            H2 h22 = H2.f12817a;
            e.a aVar = androidx.compose.ui.e.f40358c0;
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            S0.F1.b(u11, h22, InterfaceC2801g.a.e());
            S0.F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            S0.F1.b(u11, f7, InterfaceC2801g.a.f());
            androidx.compose.ui.e g10 = androidx.compose.foundation.layout.T.g(aVar, f12877b, f12879d);
            B1.V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            S0.A0 d12 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, g10);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f13 = T7.E.f(u11, f11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f13);
            }
            S0.F1.b(u11, f12, InterfaceC2801g.a.f());
            c4912a.invoke(u11, Integer.valueOf(i12 & 14));
            u11.f();
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new I2(c4912a, i11));
        }
    }
}
