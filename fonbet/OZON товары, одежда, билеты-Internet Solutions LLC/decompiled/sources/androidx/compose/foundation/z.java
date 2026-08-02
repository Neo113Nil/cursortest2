package androidx.compose.foundation;

import S0.InterfaceC3967k;
import androidx.compose.ui.platform.C5236c1;
import b1.C5503f;
import b1.C5517t;
import kotlin.jvm.functions.Function0;
import n0.d0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z {
    public static androidx.compose.ui.e a(androidx.compose.ui.e eVar, d0 d0Var) {
        return androidx.compose.ui.c.b(eVar, C5236c1.a(), new y(d0Var, false, false));
    }

    @NotNull
    public static final d0 b(InterfaceC3967k interfaceC3967k) {
        C5517t c5517t;
        Object[] objArr = new Object[0];
        c5517t = d0.f76156i;
        boolean r11 = interfaceC3967k.r(0);
        Object C11 = interfaceC3967k.C();
        if (r11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new x(0);
            interfaceC3967k.x(C11);
        }
        return (d0) C5503f.c(objArr, c5517t, (Function0) C11, interfaceC3967k, 0, 4);
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar, d0 d0Var, int i11) {
        return androidx.compose.ui.c.b(eVar, C5236c1.a(), new y(d0Var, (i11 & 8) == 0, true));
    }
}
