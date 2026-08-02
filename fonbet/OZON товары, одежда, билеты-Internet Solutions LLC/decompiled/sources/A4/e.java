package A4;

import S0.InterfaceC3967k;
import S0.Q;
import j3.y;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {
    @NotNull
    public static final c a(@NotNull y player, InterfaceC3967k interfaceC3967k) {
        Intrinsics.checkNotNullParameter(player, "player");
        interfaceC3967k.o(1585922024);
        interfaceC3967k.o(-1936578636);
        boolean n11 = interfaceC3967k.n(player);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new c(player);
            interfaceC3967k.x(C11);
        }
        c cVar = (c) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1936576251);
        boolean F11 = interfaceC3967k.F(cVar);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new d(cVar, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, player, (Function2) C12);
        interfaceC3967k.k();
        return cVar;
    }
}
