package bb0;

import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6053k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x {
    public static final void a(@NotNull eb0.g resetConfig, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(resetConfig, "resetConfig");
        C3969l u11 = interfaceC3967k.u(1535368740);
        if ((((u11.n(resetConfig) ? 4 : 2) | i11 | 48) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            u11.o(-1143864125);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C11);
            }
            u11.k();
            o.a("Reset set by user", aVar, a1.c.c(164554184, new v(resetConfig, (InterfaceC3978p0) C11), u11), u11, 438);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new w(resetConfig, aVar, i11));
        }
    }

    public static final void b(eb0.f fVar, Function0 function0, Function0 function02, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function0 function03;
        C3969l u11 = interfaceC3967k.u(-1583479001);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(fVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            function03 = function02;
        } else {
            function03 = function02;
            C6053k.a(function03, null, a1.c.c(-1319361744, new q(fVar, fVar.a(), function0, function02), u11), u11, ((i12 >> 6) & 14) | 384, 2);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new r(fVar, function0, function03, i11));
        }
    }
}
