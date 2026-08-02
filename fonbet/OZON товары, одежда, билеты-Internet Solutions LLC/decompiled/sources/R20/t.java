package R20;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import ru.ozon.debugMenu.internal.core.ui.widgets.screen.DebugMenuScreenKt;

/* loaded from: classes3.dex */
public final class t {
    public static final void a(u uVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-471816499);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(uVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            DebugMenuScreenKt.DebugMenuScreen("Дебаг", null, null, null, a1.c.c(1618418622, new h(uVar), u11), a1.c.c(1252873346, new r(n1.b(uVar.g0(), u11), uVar), u11), u11, 221190, 14);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new s(uVar, i11));
        }
    }
}
