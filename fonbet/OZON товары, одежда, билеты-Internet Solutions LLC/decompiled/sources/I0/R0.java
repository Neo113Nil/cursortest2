package I0;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R0 {
    public static final void a(androidx.compose.ui.e eVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-2105228848);
        if ((((u11.n(eVar) ? 4 : 2) | i11) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            P0 p02 = P0.f11360a;
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            F1.b(u11, p02, InterfaceC2801g.a.e());
            F1.b(u11, d11, InterfaceC2801g.a.g());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            c4912a.invoke(u11, 6);
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Q0(eVar, c4912a, i11));
        }
    }
}
