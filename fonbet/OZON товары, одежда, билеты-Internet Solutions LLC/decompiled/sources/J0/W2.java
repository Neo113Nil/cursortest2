package J0;

import B0.C2454a;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function2;
import l1.C7807Z;
import m0.C7990g;
import m0.C8004n;
import n0.C8385f;
import n0.C8391l;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* loaded from: classes8.dex */
public final class W2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final W2 f13064a = new W2();

    /* renamed from: b, reason: collision with root package name */
    private static final float f13065b = 56;

    /* renamed from: c, reason: collision with root package name */
    private static final float f13066c = 280;

    /* renamed from: d, reason: collision with root package name */
    private static final float f13067d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final float f13068e = 2;

    public static float c() {
        return f13065b;
    }

    public static float d() {
        return f13066c;
    }

    @NotNull
    public static T2 e(InterfaceC3967k interfaceC3967k) {
        long j11;
        long o11 = C7807Z.o(((Number) interfaceC3967k.m(C3359x.a())).floatValue(), ((C7807Z) interfaceC3967k.m(C3363y.a())).w());
        long o12 = C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), o11);
        j11 = C7807Z.f72258l;
        long h11 = ((C3339s) interfaceC3967k.m(C3343t.d())).h();
        long b11 = ((C3339s) interfaceC3967k.m(C3343t.d())).b();
        long o13 = C7807Z.o(Bl0.k0.q(interfaceC3967k), ((C3339s) interfaceC3967k.m(C3343t.d())).h());
        long o14 = C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), ((C3339s) interfaceC3967k.m(C3343t.d())).g());
        long o15 = C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), o14);
        long b12 = ((C3339s) interfaceC3967k.m(C3343t.d())).b();
        long o16 = C7807Z.o(0.54f, ((C3339s) interfaceC3967k.m(C3343t.d())).g());
        long o17 = C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), o16);
        long o18 = C7807Z.o(0.54f, ((C3339s) interfaceC3967k.m(C3343t.d())).g());
        long o19 = C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), o18);
        long b13 = ((C3339s) interfaceC3967k.m(C3343t.d())).b();
        long o21 = C7807Z.o(Bl0.k0.q(interfaceC3967k), ((C3339s) interfaceC3967k.m(C3343t.d())).h());
        long o22 = C7807Z.o(Bl0.k0.r(interfaceC3967k), ((C3339s) interfaceC3967k.m(C3343t.d())).g());
        long o23 = C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), o22);
        long b14 = ((C3339s) interfaceC3967k.m(C3343t.d())).b();
        long o24 = C7807Z.o(Bl0.k0.r(interfaceC3967k), ((C3339s) interfaceC3967k.m(C3343t.d())).g());
        return new J(o11, o12, h11, b11, o13, o14, b12, o15, o16, o17, o16, o18, o19, b13, j11, o21, o22, o23, b14, o24, C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), o24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z11, boolean z12, @NotNull t0.o oVar, @NotNull T2 t2, A0.a aVar, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f12;
        float f13;
        S0.A1 l11;
        C3969l u11 = interfaceC3967k.u(943754022);
        int i13 = i11 | (u11.p(z11) ? 4 : 2) | (u11.p(z12) ? 32 : 16) | (u11.n(oVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(t2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.n(aVar) ? 16384 : 8192) | 589824;
        if ((4793491 & i13) == 4793490 && u11.b()) {
            u11.j();
            f12 = f7;
            f13 = f11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                i12 = i13 & (-4128769);
                f12 = f13068e;
                f13 = f13067d;
            } else {
                u11.j();
                i12 = i13 & (-4128769);
                f12 = f7;
                f13 = f11;
            }
            u11.j0();
            InterfaceC3978p0 a11 = t0.i.a(oVar, u11, ((i12 & 8190) >> 6) & 14);
            S0.A1<C7807Z> e11 = t2.e(z11, z12, oVar, u11, i12 & 8190);
            float f14 = ((Boolean) a11.getValue()).booleanValue() ? f12 : f13;
            if (z11) {
                u11.o(772641254);
                l11 = C7990g.a(f14, C8004n.d(150, 0, null, 6), u11, 48, 12);
                u11.k();
            } else {
                u11.o(772737540);
                l11 = S0.n1.l(Z1.h.a(f13), u11);
                u11.k();
            }
            InterfaceC3978p0 l12 = S0.n1.l(new C8391l(new l1.K0(e11.getValue().w()), ((Z1.h) l11.getValue()).d()), u11);
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            C8391l c8391l = (C8391l) l12.getValue();
            C5185h.a(C8385f.d(aVar2, c8391l.c(), c8391l.b(), aVar), u11, 0);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new U2(this, z11, z12, oVar, t2, aVar, f12, f13, i11));
        }
    }

    public final void b(@NotNull String str, @NotNull Function2 function2, boolean z11, boolean z12, @NotNull C2454a c2454a, @NotNull t0.o oVar, boolean z13, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, A0.a aVar, T2 t2, C9915y c9915y, C4912a c4912a4, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function2 function22;
        boolean z14;
        boolean z15;
        C2454a c2454a2;
        C3969l c3969l;
        int i13;
        C9915y c9915y2;
        C9915y c9915y3;
        C3969l u11 = interfaceC3967k.u(-920823490);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            function22 = function2;
            i12 |= u11.F(function22) ? 32 : 16;
        } else {
            function22 = function2;
        }
        if ((i11 & 384) == 0) {
            z14 = z11;
            i12 |= u11.p(z14) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            z14 = z11;
        }
        if ((i11 & 3072) == 0) {
            z15 = z12;
            i12 |= u11.p(z15) ? 2048 : 1024;
        } else {
            z15 = z12;
        }
        if ((i11 & 24576) == 0) {
            c2454a2 = c2454a;
            i12 |= u11.n(c2454a2) ? 16384 : 8192;
        } else {
            c2454a2 = c2454a;
        }
        if ((i11 & 196608) == 0) {
            i12 |= u11.n(oVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= u11.p(z13) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.F(c4912a) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= u11.F(c4912a2) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= u11.F(null) ? 536870912 : 268435456;
        }
        int i14 = 221184 | (u11.F(c4912a3) ? 4 : 2) | (u11.n(aVar) ? 32 : 16) | (u11.n(t2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | UserVerificationMethods.USER_VERIFY_ALL;
        if ((306783379 & i12) == 306783378 && (74899 & i14) == 74898 && u11.b()) {
            u11.j();
            c9915y3 = c9915y;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                c3969l = u11;
                i13 = i14 & (-7169);
                c9915y2 = new C9915y(j3.f(), j3.f(), j3.f(), j3.f());
            } else {
                u11.j();
                i13 = i14 & (-7169);
                c9915y2 = c9915y;
                c3969l = u11;
            }
            c3969l.j0();
            int i15 = i12 << 3;
            int i16 = i12 >> 9;
            int i17 = (i15 & 896) | (i15 & 112) | 6 | ((i12 >> 3) & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | ((i13 << 21) & 29360128) | ((i12 << 15) & 234881024) | ((i12 << 21) & 1879048192);
            int i18 = i13 << 6;
            int i19 = ((i12 >> 18) & 14) | ((i12 >> 12) & 112) | (i18 & 7168);
            C2454a c2454a3 = c2454a2;
            Function2 function23 = function22;
            j3.a(t3.Outlined, str, function23, c2454a3, c4912a, c4912a2, c4912a3, z15, z14, z13, oVar, c9915y2, aVar, t2, c4912a4, c3969l, i17, (i18 & 57344) | i19 | 196608);
            c9915y3 = c9915y2;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new V2(this, str, function2, z11, z12, c2454a, oVar, z13, c4912a, c4912a2, c4912a3, aVar, t2, c9915y3, c4912a4, i11));
        }
    }
}
