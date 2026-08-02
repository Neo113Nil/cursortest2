package J20;

import S0.InterfaceC3967k;
import S20.a;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt;
import y20.C10833a;

/* renamed from: J20.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3378h {
    public static final void a(@NotNull a.c item, InterfaceC3967k interfaceC3967k) {
        Intrinsics.checkNotNullParameter(item, "item");
        interfaceC3967k.o(-1543007838);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        androidx.compose.ui.e b11 = ru.ozon.debugMenu.internal.core.ui.utils.b.b(aVar, item.getId());
        String c11 = item.c();
        String b12 = item.b();
        boolean d11 = item.d();
        interfaceC3967k.o(666365851);
        boolean n11 = interfaceC3967k.n(item) | interfaceC3967k.F(context);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C3377g(item, context);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        b(c11, b12, d11, b11, (Function0) C11, interfaceC3967k, 0);
        interfaceC3967k.k();
    }

    public static final void b(@NotNull String title, String str, boolean z11, androidx.compose.ui.e eVar, @NotNull Function0 onClick, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        interfaceC3967k.o(2022721507);
        androidx.compose.ui.e j11 = T.j((i11 & 8) != 0 ? androidx.compose.ui.e.f40358c0 : eVar, 0.0f, 0.0f, 0.0f, z11 ? T20.a.c() : 0, 7);
        if (z11) {
            j11 = j11.l0(C6988h.a(androidx.compose.ui.e.f40358c0, T20.a.a()));
        }
        b11 = androidx.compose.foundation.e.b(j11, C10833a.a(interfaceC3967k).h(), y0.a());
        DebugMenuCellKt.m1611DebugMenuCellpLOo_7s(T.j(b11, 0.0f, 0.0f, 0.0f, z11 ? 4 : 0, 7), title, str, false, false, null, l.f13721a, null, null, onClick, false, !z11, 0.0f, 0.0f, 0.0f, null, null, null, interfaceC3967k, 1572864, 0, 259512);
        interfaceC3967k.k();
    }
}
