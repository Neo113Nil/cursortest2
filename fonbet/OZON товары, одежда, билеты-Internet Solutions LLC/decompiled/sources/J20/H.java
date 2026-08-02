package J20;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S20.a;
import a1.C4912a;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.C6988h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class H {
    public static final void a(@NotNull a.j item, @NotNull Function1 onToggleClick, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        C3969l c3969l;
        androidx.compose.ui.e eVar2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onToggleClick, "onToggleClick");
        C3969l u11 = interfaceC3967k.u(822716310);
        if ((((u11.n(item) ? 4 : 2) | i11 | (u11.F(onToggleClick) ? 32 : 16) | 384) & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
            eVar2 = eVar;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            String e11 = item.e();
            String d11 = item.d();
            androidx.compose.ui.e j11 = T.j(ru.ozon.debugMenu.internal.core.ui.utils.b.b(aVar, item.getId()), 0.0f, 0.0f, 0.0f, item.f() ? T20.a.c() : 0, 7);
            if (item.f()) {
                j11 = j11.l0(C6988h.a(aVar, T20.a.a()));
            }
            b11 = androidx.compose.foundation.e.b(j11, C10833a.a(u11).h(), y0.a());
            androidx.compose.ui.e j12 = T.j(b11, 0.0f, 0.0f, 0.0f, item.f() ? 4 : 0, 7);
            boolean z11 = !item.f();
            C4912a c11 = a1.c.c(-553962886, new F(item, context, onToggleClick), u11);
            c3969l = u11;
            eVar2 = aVar;
            DebugMenuCellKt.m1611DebugMenuCellpLOo_7s(j12, e11, d11, false, false, null, c11, null, null, null, false, z11, 0.0f, 0.0f, 0.0f, null, null, null, c3969l, 1572864, 0, 260024);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new G(item, onToggleClick, eVar2, i11));
        }
    }
}
