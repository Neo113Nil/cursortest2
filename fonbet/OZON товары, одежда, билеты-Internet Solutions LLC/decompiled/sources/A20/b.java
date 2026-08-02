package A20;

import C.C2702w;
import S0.InterfaceC3967k;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import z20.EnumC10976a;

@InterfaceC6346b
/* loaded from: classes3.dex */
public final class b {
    @NotNull
    public static Object a(@NotNull EnumC10976a token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new e(token);
    }

    public static final long b(Object obj, InterfaceC3967k interfaceC3967k) {
        if (obj instanceof C7807Z) {
            interfaceC3967k.o(1205580983);
            interfaceC3967k.k();
            return ((C7807Z) obj).w();
        }
        if (obj instanceof EnumC10976a) {
            interfaceC3967k.o(1205582743);
            long a11 = ((EnumC10976a) obj).a(interfaceC3967k);
            interfaceC3967k.k();
            return a11;
        }
        if (!(obj instanceof e)) {
            interfaceC3967k.o(1205586892);
            interfaceC3967k.k();
            throw new IllegalStateException("Несовместимый тип");
        }
        interfaceC3967k.o(1205584613);
        long a12 = ((e) obj).a().a(interfaceC3967k);
        long o11 = C7807Z.o(C7807Z.q(a12) * 0.4f, a12);
        interfaceC3967k.k();
        return o11;
    }

    public static String c(Object obj) {
        return C2702w.c(obj, "DeferredColor(color=", ")");
    }
}
