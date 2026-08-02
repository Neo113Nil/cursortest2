package Mf0;

import D1.InterfaceC2801g;
import J0.T0;
import J0.u3;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.InterfaceC3978p0;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M {
    public static final void a(String str, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1247072821);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            float f7 = 16;
            Sf0.e.a("Mock server", Q1.a(androidx.compose.foundation.layout.T.j(aVar, f7, f7, 0.0f, 0.0f, 12), "MockServerHeader"), u11, 6, 0);
            c3969l = u11;
            u3.b("https://".concat(str), Q1.a(androidx.compose.foundation.layout.T.j(aVar, f7, 4, 0.0f, 0.0f, 12), "MockServerValue"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, c3969l, 0, 0, 131068);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C3630l(str, i11));
        }
    }

    public static final void b(N n11, fd.p pVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-630405893);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(n11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(1843075630);
            z0.b bVar = (z0.b) u11.m(Sf0.k.a());
            u11.B(1729797275);
            B0 a11 = C6616a.a(u11);
            if (a11 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 a12 = C6617b.a(kotlin.jvm.internal.N.b(O.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
            u11.K();
            u11.k();
            O o11 = (O) a12;
            Object[] objArr = {n11.b()};
            u11.o(-1382712954);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new H(n11);
                u11.x(C11);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr, null, (Function0) C11, u11, 0, 6);
            Object[] objArr2 = {n11.e()};
            u11.o(-1382710039);
            boolean z12 = i13 == 4;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new G(n11);
                u11.x(C12);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C5503f.c(objArr2, null, (Function0) C12, u11, 0, 6);
            Object[] objArr3 = {n11.c()};
            u11.o(-1382706901);
            boolean z13 = i13 == 4;
            Object C13 = u11.C();
            if (z13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C(n11);
                u11.x(C13);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C5503f.c(objArr3, null, (Function0) C13, u11, 0, 6);
            Object[] objArr4 = {n11.c().get("x-o3-meshversion")};
            u11.o(-1382702836);
            boolean z14 = i13 == 4;
            Object C14 = u11.C();
            if (z14 || C14 == InterfaceC3967k.a.a()) {
                C14 = new F(n11);
                u11.x(C14);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p04 = (InterfaceC3978p0) C5503f.c(objArr4, null, (Function0) C14, u11, 0, 6);
            Object[] objArr5 = {n11.c().get("x-o3-internal-headers-token")};
            u11.o(-1382697085);
            boolean z15 = i13 == 4;
            Object C15 = u11.C();
            if (z15 || C15 == InterfaceC3967k.a.a()) {
                C15 = new E(n11);
                u11.x(C15);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p05 = (InterfaceC3978p0) C5503f.c(objArr5, null, (Function0) C15, u11, 0, 6);
            Object[] objArr6 = new Object[0];
            u11.o(-1382693730);
            Object C16 = u11.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = B.f17947b;
                u11.x(C16);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p06 = (InterfaceC3978p0) C5503f.c(objArr6, null, (Function0) C16, u11, 3072, 6);
            Object[] objArr7 = new Object[0];
            u11.o(-1382691522);
            Object C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = D.f17949b;
                u11.x(C17);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p07 = (InterfaceC3978p0) C5503f.c(objArr7, null, (Function0) C17, u11, 3072, 6);
            Object[] objArr8 = new Object[0];
            u11.o(-1382689314);
            Object C18 = u11.C();
            if (C18 == InterfaceC3967k.a.a()) {
                C18 = I.f17954b;
                u11.x(C18);
            }
            u11.k();
            Object c11 = C5503f.c(objArr8, null, (Function0) C18, u11, 3072, 6);
            c3969l = u11;
            Sf0.c.a(androidx.compose.ui.e.f40358c0, a1.c.c(-259183828, new z(interfaceC3978p0, (InterfaceC3972m0) c11, interfaceC3978p06, interfaceC3978p07, pVar, o11, interfaceC3978p04, interfaceC3978p05, n11, interfaceC3978p02, interfaceC3978p03), c3969l), c3969l, 54, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new A(n11, pVar, i11));
        }
    }

    public static final void c(String str, float f7, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(417436568);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.q(f7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            androidx.compose.ui.e g10 = androidx.compose.foundation.layout.T.g(androidx.compose.foundation.i.c(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), false, null, null, function0, 7), f7, 8);
            Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, g10);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            u3.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, u11, i13 & 14, 0, 131070);
            c3969l = u11;
            T0.b(L0.a.a(), null, null, c3969l, 12);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new J(str, f7, function0, i11));
        }
    }

    public static final void d(Function0 function0, Function0 function02, Function0 function03, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1580086483);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function02) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function03) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            float f7 = 16;
            Sf0.c.a(androidx.compose.foundation.layout.T.h(androidx.compose.ui.e.f40358c0, 0.0f, f7, 1), a1.c.c(-1317967586, new K(f7, function0, function02, function03), u11), u11, 54, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new L(function0, function02, function03, i11));
        }
    }
}
