package androidx.compose.material3;

import B1.V;
import D1.InterfaceC2801g;
import P0.C3756n;
import P0.C3759o;
import P0.C3764p1;
import P0.H;
import P0.j2;
import R0.p;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.t;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import m0.C8007o0;
import m0.E;
import m0.T0;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import t0.q;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final float f40190a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f40191b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f40192c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f40193d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f40194e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C8007o0<Float> f40195f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final T0<Float> f40196g;

    static {
        float k11 = p.k();
        f40190a = k11;
        f40191b = p.u();
        f40192c = p.r();
        float o11 = p.o();
        f40193d = o11;
        f40194e = (o11 - k11) / 2;
        f40195f = new C8007o0<>();
        f40196g = new T0<>(100, (E) null, 6);
    }

    public static final void a(boolean z11, Function1 function1, androidx.compose.ui.e eVar, boolean z12, j2 j2Var, InterfaceC3967k interfaceC3967k, int i11) {
        j2 j2Var2;
        int i12;
        j2 j2Var3;
        boolean z13;
        long j11;
        long j12;
        androidx.compose.ui.e eVar2;
        boolean z14;
        j2 j2Var4;
        C3969l u11 = interfaceC3967k.u(1580463220);
        int i13 = i11 | (u11.p(z11) ? 4 : 2) | (u11.F(function1) ? 32 : 16) | (u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | 1666048;
        if ((599187 & i13) == 599186 && u11.b()) {
            u11.j();
            z14 = z12;
            j2Var4 = j2Var;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                C3756n c3756n = (C3756n) u11.m(C3759o.d());
                j2 f7 = c3756n.f();
                if (f7 == null) {
                    long c11 = C3759o.c(c3756n, p.j());
                    long c12 = C3759o.c(c3756n, p.m());
                    j11 = C7807Z.f72258l;
                    long c13 = C3759o.c(c3756n, p.l());
                    long c14 = C3759o.c(c3756n, p.t());
                    long c15 = C3759o.c(c3756n, p.w());
                    long c16 = C3759o.c(c3756n, p.s());
                    long c17 = C3759o.c(c3756n, p.v());
                    long f11 = C7811b0.f(C7807Z.o(1.0f, C3759o.c(c3756n, p.a())), c3756n.E());
                    long f12 = C7811b0.f(C7807Z.o(0.12f, C3759o.c(c3756n, p.c())), c3756n.E());
                    j12 = C7807Z.f72258l;
                    j2Var2 = new j2(c11, c12, j11, c13, c14, c15, c16, c17, f11, f12, j12, C7811b0.f(C7807Z.o(0.38f, C3759o.c(c3756n, p.b())), c3756n.E()), C7811b0.f(C7807Z.o(0.38f, C3759o.c(c3756n, p.d())), c3756n.E()), C7811b0.f(C7807Z.o(0.12f, C3759o.c(c3756n, p.f())), c3756n.E()), C7811b0.f(C7807Z.o(0.12f, C3759o.c(c3756n, p.g())), c3756n.E()), C7811b0.f(C7807Z.o(0.38f, C3759o.c(c3756n, p.e())), c3756n.E()));
                    c3756n.U(j2Var2);
                } else {
                    j2Var2 = f7;
                }
                i12 = i13 & (-458753);
                j2Var3 = j2Var2;
                z13 = true;
            } else {
                u11.j();
                i12 = i13 & (-458753);
                z13 = z12;
                j2Var3 = j2Var;
            }
            int i14 = i12;
            u11.j0();
            u11.o(783532531);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = t0.p.a();
                u11.x(C11);
            }
            q qVar = (q) C11;
            u11.k();
            if (function1 != null) {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                int i15 = H.f20643b;
                eVar2 = androidx.compose.foundation.selection.e.a(MinimumInteractiveModifier.f40162a, z11, qVar, z13, I1.i.a(2), function1);
            } else {
                eVar2 = androidx.compose.ui.e.f40358c0;
            }
            b(a0.k(a0.v(eVar.l0(eVar2), InterfaceC6250b.a.e(), 2), f40192c, f40193d), z11, z13, j2Var3, qVar, C3764p1.b(p.h(), u11), u11, ((i14 << 3) & 112) | 24960);
            z14 = z13;
            j2Var4 = j2Var3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(z11, function1, eVar, z14, j2Var4, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.e eVar, boolean z11, boolean z12, j2 j2Var, q qVar, l1.J0 j02, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1594099146);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(j2Var) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(null) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(qVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.n(j02) ? 1048576 : 524288;
        }
        if ((i12 & 599187) == 599186 && u11.b()) {
            u11.j();
        } else {
            long c11 = j2Var.c(z12, z11);
            long b11 = j2Var.b(z12, z11);
            l1.J0 b12 = C3764p1.b(p.q(), u11);
            androidx.compose.ui.e b13 = androidx.compose.foundation.e.b(C8385f.c(p.p(), j2Var.a(z12, z11), eVar, b12), c11, b12);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b13);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            androidx.compose.ui.e b14 = androidx.compose.foundation.e.b(t.b(C5187j.f39515a.a(androidx.compose.ui.e.f40358c0, InterfaceC6250b.a.h()).l0(new ThumbElement(qVar, z11)), qVar, d.d(p.n() / 2, u11, 54, 4)), b11, j02);
            V f13 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, b14);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f15 = T7.E.f(u11, f13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            u11.o(1163457794);
            u11.k();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(eVar, z11, z12, j2Var, qVar, j02, i11));
        }
    }

    public static final float i() {
        return f40190a;
    }

    public static final float j() {
        return f40191b;
    }
}
