package bb0;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class B {
    public static final void a(@NotNull List blocks, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        C3969l u11 = interfaceC3967k.u(-790032488);
        if ((((u11.F(blocks) ? 4 : 2) | i11 | 48) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            o.a("Configs", aVar, a1.c.c(-54780044, new z(blocks), u11), u11, 438);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C5617A(blocks, aVar, i11));
        }
    }
}
