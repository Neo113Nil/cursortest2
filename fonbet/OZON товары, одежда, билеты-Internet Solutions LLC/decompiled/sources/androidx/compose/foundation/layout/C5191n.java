package androidx.compose.foundation.layout;

import B1.v0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5191n {
    public static final void a(androidx.compose.ui.e eVar, e1.d dVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        androidx.compose.ui.e eVar2;
        e1.d o11;
        C3969l u11 = interfaceC3967k.u(1781813501);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i13 | 432;
        if ((i11 & 3072) == 0) {
            i15 |= u11.F(c4912a) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 1171) == 1170 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            o11 = dVar;
        } else {
            eVar2 = i14 != 0 ? androidx.compose.ui.e.f40358c0 : eVar;
            o11 = InterfaceC6250b.a.o();
            B1.V f7 = C5185h.f(o11, false);
            boolean n11 = ((i15 & 7168) == 2048) | u11.n(f7);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C5189l(f7, c4912a);
                u11.x(C11);
            }
            v0.b(eVar2, (Function2) C11, u11, i15 & 14, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C5190m(eVar2, o11, c4912a, i11, i12));
        }
    }
}
