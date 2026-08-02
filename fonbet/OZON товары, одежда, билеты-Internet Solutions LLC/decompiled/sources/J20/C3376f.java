package J20;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S20.a;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.DebugMenuButtonKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuButtonStyle;
import y20.C10833a;

/* renamed from: J20.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3376f {
    public static final void a(@NotNull a.b item, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(634060901);
        int i12 = (u11.n(item) ? 4 : 2) | i11 | 48;
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            eVar2 = androidx.compose.ui.e.f40358c0;
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            androidx.compose.ui.e j11 = T.j(a0.e(ru.ozon.debugMenu.internal.core.ui.utils.b.b(eVar2, item.getId()), 1.0f), 0.0f, 0.0f, 0.0f, item.d() ? T20.a.c() : 0, 7);
            if (item.d()) {
                j11 = j11.l0(C6988h.a(eVar2, T20.a.a()));
            }
            b11 = androidx.compose.foundation.e.b(j11, C10833a.a(u11).h(), y0.a());
            androidx.compose.ui.e i13 = T.i(b11, T20.a.b(), item.c(), T20.a.b(), item.d() ? 16 : 0);
            String b12 = item.b();
            DebugMenuButtonStyle.ActionSecondary actionSecondary = DebugMenuButtonStyle.ActionSecondary.INSTANCE;
            u11.o(-1818073692);
            boolean F11 = u11.F(context) | ((i12 & 14) == 4);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3374d(item, context);
                u11.x(C11);
            }
            u11.k();
            DebugMenuButtonKt.DebugMenuButton(b12, (Function0) C11, i13, false, actionSecondary, null, null, u11, 24576, 104);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3375e(item, eVar2, i11));
        }
    }
}
