package D4;

import B4.C2581j;
import B4.b0;
import S0.A1;
import S0.C0;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3970l0;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Sc.InterfaceC3999a;
import android.annotation.SuppressLint;
import androidx.lifecycle.B0;
import b1.C5511n;
import b1.InterfaceC5505h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e.C6243r;
import e1.InterfaceC6250b;
import g3.C6616a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.C7770n;
import m0.C7989f0;
import m0.D0;
import m0.H0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X {
    @InterfaceC3999a
    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final /* synthetic */ void a(B4.P p11, B4.L l11, androidx.compose.ui.e eVar, e1.d dVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1 function15;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Function1 function111;
        Function1 function112;
        C3969l u11 = interfaceC3967k.u(-1818191915);
        int i13 = i11 | (u11.F(p11) ? 4 : 2) | (u11.F(l11) ? 32 : 16) | (u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(dVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | 4939776;
        if ((4793491 & i13) == 4793490 && u11.b()) {
            u11.j();
            function19 = function1;
            function110 = function12;
            function111 = function13;
            function112 = function14;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                i12 = i13 & (-33030145);
                function15 = y.f5934b;
                function16 = function15;
                function17 = z.f5935b;
                function18 = function17;
            } else {
                u11.j();
                i12 = i13 & (-33030145);
                function15 = function1;
                function17 = function12;
                function16 = function13;
                function18 = function14;
            }
            u11.j0();
            c(p11, l11, eVar, dVar, function15, function17, function16, function18, u11, i12 & 33554430);
            function19 = function15;
            function110 = function17;
            function111 = function16;
            function112 = function18;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new A(p11, l11, eVar, dVar, function19, function110, function111, function112, i11));
        }
    }

    @InterfaceC3999a
    public static final /* synthetic */ void b(B4.P p11, androidx.compose.ui.e eVar, e1.d dVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1 function16;
        Function1 function17;
        e1.d o11;
        C3969l c3969l;
        e1.d dVar2;
        Function1 function18;
        Function1 function19;
        C3969l u11 = interfaceC3967k.u(410432995);
        int i13 = i11 | (u11.F(p11) ? 4 : 2) | 37776384 | (u11.F(function15) ? 536870912 : 268435456);
        if ((306783379 & i13) == 306783378 && u11.b()) {
            u11.j();
            dVar2 = dVar;
            function18 = function13;
            function19 = function14;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                i12 = i13 & (-264241153);
                function16 = function1;
                function17 = function12;
                o11 = InterfaceC6250b.a.o();
            } else {
                u11.j();
                i12 = i13 & (-264241153);
                o11 = dVar;
                function16 = function13;
                function17 = function14;
            }
            u11.j0();
            boolean z11 = (1879048192 & i12) == 536870912;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                B4.M m11 = new B4.M(p11.D(), "packages", null);
                function15.invoke(m11);
                C11 = m11.b();
                u11.x(C11);
            }
            c3969l = u11;
            c(p11, (B4.L) C11, eVar, o11, function1, function12, function16, function17, c3969l, (i12 & 8078) | 221184);
            dVar2 = o11;
            function18 = function16;
            function19 = function17;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new P(p11, eVar, dVar2, function1, function12, function18, function19, function15, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void c(@NotNull B4.P p11, @NotNull B4.L graph, androidx.compose.ui.e eVar, e1.d dVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e eVar2;
        e1.d dVar2;
        boolean z11;
        int i13;
        C2830e c2830e;
        InterfaceC3978p0 interfaceC3978p0;
        C2840o c2840o;
        A1 a12;
        C2830e c2830e2;
        A1 a13;
        InterfaceC3978p0 interfaceC3978p02;
        C3969l u11 = interfaceC3967k.u(-1964664536);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(p11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(graph) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i12 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            eVar2 = eVar;
        }
        if ((i11 & 3072) == 0) {
            dVar2 = dVar;
            i12 |= u11.n(dVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            dVar2 = dVar;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function12) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= u11.F(function13) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.F(function14) ? 8388608 : 4194304;
        }
        int i14 = i12 | 100663296;
        if ((i14 & 38347923) == 38347922 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            androidx.lifecycle.J j11 = (androidx.lifecycle.J) u11.m(e3.r.a());
            B0 a11 = C6616a.a(u11);
            if (a11 == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            p11.Z(a11.getViewModelStore());
            Intrinsics.checkNotNullParameter(graph, "graph");
            p11.X(graph, null);
            b0 c11 = p11.D().c("composable");
            C2830e c2830e3 = c11 instanceof C2830e ? (C2830e) c11 : null;
            if (c2830e3 == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new Q(p11, graph, eVar2, dVar2, function1, function12, function13, function14, i11));
                    return;
                }
                return;
            }
            InterfaceC3978p0 b11 = n1.b(c2830e3.l(), u11);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C0.a(0.0f);
                u11.x(C11);
            }
            InterfaceC3970l0 interfaceC3970l0 = (InterfaceC3970l0) C11;
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C12;
            boolean z12 = ((List) b11.getValue()).size() > 1;
            boolean n11 = u11.n(b11) | u11.n(c2830e3);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                z11 = z12;
                i13 = 0;
                Object b12 = new B(c2830e3, interfaceC3970l0, b11, interfaceC3978p03, null);
                c2830e = c2830e3;
                interfaceC3978p0 = interfaceC3978p03;
                u11.x(b12);
                C13 = b12;
            } else {
                c2830e = c2830e3;
                interfaceC3978p0 = interfaceC3978p03;
                z11 = z12;
                i13 = 0;
            }
            C6243r.a(z11, (Function2) C13, u11, i13);
            boolean F11 = u11.F(p11) | u11.F(j11);
            Object C14 = u11.C();
            if (F11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new D(p11, j11);
                u11.x(C14);
            }
            S0.Q.c(j11, (Function1) C14, u11);
            InterfaceC5505h a14 = C5511n.a(u11);
            InterfaceC3978p0 b13 = n1.b(p11.F(), u11);
            Object C15 = u11.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = n1.e(new W(b13));
                u11.x(C15);
            }
            A1 a15 = (A1) C15;
            C2581j c2581j = (C2581j) C7714v.Z((List) a15.getValue());
            Object C16 = u11.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = new LinkedHashMap();
                u11.x(C16);
            }
            Map map = (Map) C16;
            u11.o(653353748);
            if (c2581j != null) {
                boolean n12 = u11.n(c2830e) | ((((i14 & 3670016) ^ 1572864) > 1048576 && u11.n(function13)) || (i14 & 1572864) == 1048576) | ((57344 & i14) == 16384);
                Object C17 = u11.C();
                if (n12 || C17 == InterfaceC3967k.a.a()) {
                    C17 = new T(c2830e, function13, function1, interfaceC3978p0);
                    u11.x(C17);
                }
                Function1 function15 = (Function1) C17;
                boolean n13 = u11.n(c2830e) | ((((i14 & 29360128) ^ 12582912) > 8388608 && u11.n(function14)) || (i14 & 12582912) == 8388608) | ((458752 & i14) == 131072);
                Object C18 = u11.C();
                if (n13 || C18 == InterfaceC3967k.a.a()) {
                    C18 = new U(c2830e, function14, function12, interfaceC3978p0);
                    u11.x(C18);
                }
                Function1 function16 = (Function1) C18;
                InterfaceC3978p0 interfaceC3978p04 = interfaceC3978p0;
                boolean z13 = (234881024 & i14) == 67108864;
                Object C19 = u11.C();
                if (z13 || C19 == InterfaceC3967k.a.a()) {
                    C19 = new V(1);
                    u11.x(C19);
                }
                Function1 function17 = (Function1) C19;
                Boolean bool = Boolean.TRUE;
                boolean n14 = u11.n(c2830e);
                Object C21 = u11.C();
                if (n14 || C21 == InterfaceC3967k.a.a()) {
                    C21 = new F(a15, c2830e);
                    u11.x(C21);
                }
                S0.Q.c(bool, (Function1) C21, u11);
                Object C22 = u11.C();
                if (C22 == InterfaceC3967k.a.a()) {
                    C22 = new C7989f0(c2581j);
                    u11.x(C22);
                }
                C7989f0 c7989f0 = (C7989f0) C22;
                int i15 = C7989f0.f73720t;
                D0 f7 = H0.f(c7989f0, "entry", u11, 56);
                if (((Boolean) interfaceC3978p04.getValue()).booleanValue()) {
                    u11.o(-1218592968);
                    Float valueOf = Float.valueOf(interfaceC3970l0.getFloatValue());
                    boolean n15 = u11.n(b11) | u11.F(c7989f0);
                    a12 = a15;
                    Object C23 = u11.C();
                    if (n15 || C23 == InterfaceC3967k.a.a()) {
                        C23 = new G(c7989f0, b11, interfaceC3970l0, null);
                        u11.x(C23);
                    }
                    S0.Q.e(u11, valueOf, (Function2) C23);
                    u11.k();
                    c2840o = null;
                } else {
                    a12 = a15;
                    u11.o(-1218337931);
                    boolean F12 = u11.F(c7989f0) | u11.F(c2581j) | u11.n(f7);
                    Object C24 = u11.C();
                    if (F12 || C24 == InterfaceC3967k.a.a()) {
                        c2840o = null;
                        C24 = new I(c7989f0, c2581j, f7, null);
                        u11.x(C24);
                    } else {
                        c2840o = null;
                    }
                    S0.Q.e(u11, c2581j, (Function2) C24);
                    u11.k();
                }
                boolean F13 = u11.F(map) | u11.n(c2830e) | u11.n(function15) | u11.n(function16) | u11.n(function17);
                Object C25 = u11.C();
                if (F13 || C25 == InterfaceC3967k.a.a()) {
                    C2830e c2830e4 = c2830e;
                    C25 = new J(map, c2830e4, function15, function16, function17, a12, interfaceC3978p04);
                    c2830e2 = c2830e4;
                    a13 = a12;
                    interfaceC3978p02 = interfaceC3978p04;
                    u11.x(C25);
                } else {
                    c2830e2 = c2830e;
                    a13 = a12;
                    interfaceC3978p02 = interfaceC3978p04;
                }
                C7770n.b(f7, eVar, (Function1) C25, dVar, K.f5827b, a1.c.c(820763100, new M(a14, interfaceC3978p02, a13), u11), u11, ((i14 >> 3) & 112) | 221184 | (i14 & 7168));
                Object h11 = f7.h();
                Object n16 = f7.n();
                boolean n17 = u11.n(f7) | u11.n(c2830e2) | u11.F(map);
                Object C26 = u11.C();
                if (n17 || C26 == InterfaceC3967k.a.a()) {
                    Object n18 = new N(f7, map, a13, c2830e2, null);
                    u11.x(n18);
                    C26 = n18;
                }
                S0.Q.g(h11, n16, (Function2) C26, u11);
            } else {
                c2840o = null;
            }
            u11.k();
            b0 c12 = p11.D().c("dialog");
            if (c12 instanceof C2840o) {
                c2840o = (C2840o) c12;
            }
            if (c2840o == null) {
                J0 m03 = u11.m0();
                if (m03 != null) {
                    m03.G(new S(p11, graph, eVar, dVar, function1, function12, function13, function14, i11));
                    return;
                }
                return;
            }
            C2832g.a(c2840o, u11, 0);
        }
        J0 m04 = u11.m0();
        if (m04 != null) {
            m04.G(new O(p11, graph, eVar, dVar, function1, function12, function13, function14, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean d(InterfaceC3978p0 interfaceC3978p0) {
        return ((Boolean) interfaceC3978p0.getValue()).booleanValue();
    }
}
