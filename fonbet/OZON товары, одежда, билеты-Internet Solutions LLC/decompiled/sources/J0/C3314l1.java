package J0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* renamed from: J0.l1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3314l1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13275a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13276b;

    /* renamed from: d, reason: collision with root package name */
    private static final float f13278d;

    /* renamed from: g, reason: collision with root package name */
    private static final float f13281g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f13282h = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final float f13277c = 16;

    /* renamed from: e, reason: collision with root package name */
    private static final float f13279e = 112;

    /* renamed from: f, reason: collision with root package name */
    private static final float f13280f = 280;

    static {
        float f7 = 8;
        f13275a = f7;
        float f11 = 48;
        f13276b = f11;
        f13278d = f7;
        f13281g = f11;
    }

    public static final void a(@NotNull m0.Y y11, @NotNull InterfaceC3978p0 interfaceC3978p0, @NotNull n0.d0 d0Var, androidx.compose.ui.e eVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        InterfaceC3978p0 interfaceC3978p02;
        C3969l u11 = interfaceC3967k.u(435109845);
        int i12 = i11 | (u11.n(y11) ? 4 : 2) | (u11.n(d0Var) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(eVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.F(c4912a) ? 16384 : 8192);
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            interfaceC3978p02 = interfaceC3978p0;
        } else {
            m0.D0 f7 = m0.H0.f(y11, "DropDownMenu", u11, (i12 & 14) | 48);
            m0.U0 b11 = m0.W0.b();
            boolean booleanValue = ((Boolean) f7.h()).booleanValue();
            u11.o(1652594929);
            float f11 = booleanValue ? 1.0f : 0.8f;
            u11.k();
            Float valueOf = Float.valueOf(f11);
            boolean booleanValue2 = ((Boolean) f7.n()).booleanValue();
            u11.o(1652594929);
            float f12 = booleanValue2 ? 1.0f : 0.8f;
            u11.k();
            D0.d d11 = m0.H0.d(f7, valueOf, Float.valueOf(f12), C3298h1.f13233b.invoke(f7.m(), u11, 0), b11, u11, 0);
            m0.U0 b12 = m0.W0.b();
            boolean booleanValue3 = ((Boolean) f7.h()).booleanValue();
            u11.o(388050693);
            float f13 = booleanValue3 ? 1.0f : 0.0f;
            u11.k();
            Float valueOf2 = Float.valueOf(f13);
            boolean booleanValue4 = ((Boolean) f7.n()).booleanValue();
            u11.o(388050693);
            float f14 = booleanValue4 ? 1.0f : 0.0f;
            u11.k();
            D0.d d12 = m0.H0.d(f7, valueOf2, Float.valueOf(f14), C3294g1.f13224b.invoke(f7.m(), u11, 0), b12, u11, 0);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            boolean n11 = u11.n(d11) | u11.n(d12);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                interfaceC3978p02 = interfaceC3978p0;
                C11 = new C3280d1(interfaceC3978p02, d11, d12);
                u11.x(C11);
            } else {
                interfaceC3978p02 = interfaceC3978p0;
            }
            r.a(androidx.compose.ui.graphics.a.a(aVar, (Function1) C11), null, 0L, f13275a, a1.c.c(895555282, new C3285e1(eVar, d0Var, c4912a), u11), u11, 1769472, 30);
            u11 = u11;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3290f1(y11, interfaceC3978p02, d0Var, eVar, c4912a, i11));
        }
    }

    public static final void b(@NotNull Function0 function0, androidx.compose.ui.e eVar, C9915y c9915y, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(87134531);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(true) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(c9915y) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(null) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(c4912a) ? 131072 : 65536;
        }
        if ((i12 & 74899) == 74898 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.T.e(androidx.compose.foundation.layout.a0.q(androidx.compose.foundation.layout.a0.e(androidx.compose.foundation.i.b(eVar, null, androidx.compose.material.Q.g(true, 0.0f, u11, 6, 6), true, null, null, function0, 24), 1.0f), f13279e, f13281g, f13280f, 8), c9915y);
            androidx.compose.foundation.layout.Y b11 = androidx.compose.foundation.layout.X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
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
            S0.F1.b(u11, f7, InterfaceC2801g.a.f());
            u3.a(((D3) u11.m(E3.c())).f(), a1.c.c(1190489496, new C3306j1(c4912a), u11), u11, 48);
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3310k1(function0, eVar, c9915y, c4912a, i11));
        }
    }

    public static final float d() {
        return f13278d;
    }

    public static final float e() {
        return f13276b;
    }
}
