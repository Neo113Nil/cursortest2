package P0;

import S0.C3969l;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import n0.C8392m;

/* renamed from: P0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3785x {
    public static final void a(e.a aVar, float f7, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(75144485);
        int i12 = (u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | i11;
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            androidx.compose.ui.e f11 = androidx.compose.foundation.layout.a0.f(androidx.compose.foundation.layout.a0.e(aVar, 1.0f), f7);
            boolean z11 = (((i12 & 896) ^ 384) > 256 && u11.s(j11)) || (i12 & 384) == 256;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3779v(f7, j11);
                u11.x(C11);
            }
            C8392m.a(f11, (Function1) C11, u11, 0);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3782w(aVar, f7, j11, i11));
        }
    }
}
