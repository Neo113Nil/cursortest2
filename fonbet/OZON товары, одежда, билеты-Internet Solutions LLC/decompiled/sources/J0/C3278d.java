package J0;

import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* renamed from: J0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3278d {
    public static final void a(@NotNull Function0 function0, e.a aVar, boolean z11, C9915y c9915y, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        C4912a c4912a2;
        C3969l c3969l;
        C9915y c9915y2;
        boolean z12;
        C3969l u11 = interfaceC3967k.u(-1988562892);
        int i12 = (u11.F(function0) ? 4 : 2) | i11 | 28080;
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
            z12 = z11;
            c9915y2 = c9915y;
            c4912a2 = c4912a;
            c3969l = u11;
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            C9915y a11 = C3275c1.a();
            c4912a2 = c4912a;
            c3969l = u11;
            C3314l1.b(function0, aVar, a11, c4912a2, c3969l, 524286 & i12);
            c9915y2 = a11;
            z12 = true;
        }
        e.a aVar2 = aVar;
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C3273c(function0, aVar2, z12, c9915y2, c4912a2, i11));
        }
    }
}
