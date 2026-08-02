package bb0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;

/* loaded from: classes3.dex */
public final class G {
    public static final void a(eb0.c cVar, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1090914605);
        if ((((u11.n(cVar) ? 4 : 2) | i11 | 48) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            eVar = androidx.compose.ui.e.f40358c0;
            if (cVar == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new C(cVar, eVar, i11));
                    return;
                }
                return;
            }
            o.a("Warning", eVar, a1.c.c(-130065911, new E(cVar), u11), u11, 438);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new F(cVar, eVar, i11));
        }
    }
}
