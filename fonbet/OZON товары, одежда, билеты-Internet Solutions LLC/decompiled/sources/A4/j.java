package A4;

import S0.InterfaceC3967k;
import S0.Q;
import j3.y;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j {
    @NotNull
    public static final h a(y yVar, boolean z11, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1006141136);
        interfaceC3967k.o(2097651011);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new h(z11);
            interfaceC3967k.x(C11);
        }
        h hVar = (h) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(2097653430);
        boolean F11 = interfaceC3967k.F(hVar) | interfaceC3967k.F(yVar);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new i(hVar, yVar, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, yVar, (Function2) C12);
        interfaceC3967k.k();
        return hVar;
    }
}
