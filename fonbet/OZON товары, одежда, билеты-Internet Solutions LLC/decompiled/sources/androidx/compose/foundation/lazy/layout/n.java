package androidx.compose.foundation.lazy.layout;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x0.C10595Y;

/* loaded from: classes.dex */
public final class n {
    public static final void a(@NotNull kotlin.reflect.n nVar, androidx.compose.ui.e eVar, o oVar, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(2002163445);
        if ((((u11.F(nVar) ? 4 : 2) | i11 | (u11.n(eVar) ? 32 : 16) | (u11.n(oVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(function2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL)) & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            C10595Y.a(a1.c.c(-1488997347, new l(oVar, eVar, function2, n1.l(nVar, u11)), u11), u11, 6);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new m(nVar, eVar, oVar, function2, i11));
        }
    }
}
