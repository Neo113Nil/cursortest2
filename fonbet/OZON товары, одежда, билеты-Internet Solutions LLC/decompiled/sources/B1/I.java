package B1;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.InterfaceC3999a;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class I {
    @InterfaceC3999a
    public static final void a(androidx.compose.ui.e eVar, @NotNull C4912a c4912a, @NotNull V v11, InterfaceC3967k interfaceC3967k, int i11) {
        Function0 function0;
        C3969l u11 = interfaceC3967k.u(1949933075);
        if ((((u11.n(eVar) ? 4 : 2) | i11 | (u11.n(v11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN)) & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            int I11 = u11.I();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            S0.A0 d11 = u11.d();
            function0 = D1.H.f5234K;
            u11.i();
            if (u11.t()) {
                u11.H(function0);
            } else {
                u11.e();
            }
            InterfaceC2801g.f5440U.getClass();
            F1.b(u11, v11, InterfaceC2801g.a.e());
            F1.b(u11, d11, InterfaceC2801g.a.g());
            F1.a(u11, F.f2028b);
            F1.b(u11, f7, InterfaceC2801g.a.f());
            Function2 b11 = InterfaceC2801g.a.b();
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, b11);
            }
            c4912a.invoke(u11, 6);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new G(eVar, c4912a, v11, i11));
        }
    }

    @NotNull
    public static final C4912a b(@NotNull List list) {
        return new C4912a(true, -1953651383, new H(list));
    }
}
