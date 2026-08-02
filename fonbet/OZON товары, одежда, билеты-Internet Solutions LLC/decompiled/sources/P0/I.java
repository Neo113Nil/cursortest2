package P0;

import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import n0.InterfaceC8367H;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I {

    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20651b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        C3996z.c(a.f20651b);
    }

    public static final void a(C3756n c3756n, C3761o1 c3761o1, u2 u2Var, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        C3761o1 c3761o12;
        u2 u2Var2;
        C4912a c4912a2;
        C3761o1 c3761o13;
        u2 u2Var3;
        C3969l u11 = interfaceC3967k.u(-2127166334);
        if (((i11 | (u11.n(c3756n) ? 4 : 2) | 144) & 1171) == 1170 && u11.b()) {
            u11.j();
            c3761o13 = c3761o1;
            u2Var3 = u2Var;
            c4912a2 = c4912a;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                c3761o12 = (C3761o1) u11.m(C3764p1.a());
                u2Var2 = (u2) u11.m(v2.a());
            } else {
                u11.j();
                c3761o12 = c3761o1;
                u2Var2 = u2Var;
            }
            u11.j0();
            InterfaceC8367H d11 = androidx.compose.material3.d.d(0.0f, u11, 0, 7);
            long z11 = c3756n.z();
            boolean s11 = u11.s(z11);
            Object C11 = u11.C();
            if (s11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new I0.j1(z11, C7807Z.o(0.4f, z11));
                u11.x(C11);
            }
            c4912a2 = c4912a;
            C3996z.b(new S0.H0[]{C3759o.d().c(c3756n), androidx.compose.foundation.t.a().c(d11), O0.u.c().c(C3762p.f21295a), C3764p1.a().c(c3761o12), I0.k1.b().c((I0.j1) C11), v2.a().c(u2Var2)}, a1.c.c(-1066563262, new J(u2Var2, c4912a2), u11), u11, 56);
            c3761o13 = c3761o12;
            u2Var3 = u2Var2;
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new K(c3756n, c3761o13, u2Var3, c4912a2, i11));
        }
    }
}
