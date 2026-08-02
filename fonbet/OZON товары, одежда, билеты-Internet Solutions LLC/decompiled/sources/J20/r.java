package J20;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S20.a;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import i1.C6988h;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class r {
    public static final void a(@NotNull a.f item, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(1254793953);
        if ((((u11.n(item) ? 4 : 2) | i11 | 48) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            item.getClass();
            androidx.compose.ui.e j11 = T.j(ru.ozon.debugMenu.internal.core.ui.utils.b.b(a0.e(aVar, 1.0f), null), 0.0f, 0.0f, 0.0f, item.a() ? T20.a.c() : 0, 7);
            if (item.a()) {
                j11 = j11.l0(C6988h.a(aVar, T20.a.a()));
            }
            b11 = androidx.compose.foundation.e.b(j11, C10833a.a(u11).h(), y0.a());
            androidx.compose.ui.viewinterop.a.a(null, T.j(b11, 0.0f, 0.0f, 0.0f, item.a() ? 8 : 0, 7), null, u11, 0, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new q(item, aVar, i11));
        }
    }
}
