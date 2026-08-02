package J20;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S20.a;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.DebugMenuInputKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.presets.DebugMenuInputDefaults;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class y {
    public static final void a(@NotNull a.h item, @NotNull Function1 onValueChange, androidx.compose.ui.e eVar, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e eVar2;
        Function1 addToClipboard;
        androidx.compose.ui.e b11;
        Function0 function0;
        C3969l c3969l;
        Function1 function12;
        androidx.compose.ui.e eVar3;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        C3969l u11 = interfaceC3967k.u(1873838833);
        int i13 = i11 | (u11.n(item) ? 4 : 2) | (u11.F(onValueChange) ? 32 : 16) | 1408;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            eVar3 = eVar;
            function12 = function1;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                i12 = i13 & (-7169);
                eVar2 = androidx.compose.ui.e.f40358c0;
                addToClipboard = DebugMenuInputDefaults.INSTANCE.addToClipboard(null, u11, 48, 1);
            } else {
                u11.j();
                addToClipboard = function1;
                i12 = i13 & (-7169);
                eVar2 = eVar;
            }
            u11.j0();
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            androidx.compose.ui.e j11 = T.j(ru.ozon.debugMenu.internal.core.ui.utils.b.b(eVar2, item.getId()), 0.0f, 0.0f, 0.0f, item.h() ? T20.a.c() : 0, 7);
            if (item.h()) {
                j11 = j11.l0(C6988h.a(androidx.compose.ui.e.f40358c0, T20.a.a()));
            }
            b11 = androidx.compose.foundation.e.b(j11, C10833a.a(u11).h(), y0.a());
            androidx.compose.ui.e j12 = T.j(T.g(b11, T20.a.b(), 8), 0.0f, 0.0f, 0.0f, item.h() ? 6 : 0, 7);
            androidx.compose.ui.e eVar4 = eVar2;
            String g10 = item.g();
            String c11 = item.c();
            boolean b12 = item.b();
            Function2<String, Context, Unit> d11 = item.d();
            u11.o(583123286);
            if (d11 == null) {
                function0 = null;
            } else {
                u11.o(837304205);
                boolean n11 = u11.n(d11) | ((i12 & 14) == 4) | u11.F(context);
                Object C11 = u11.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new u(d11, item, context);
                    u11.x(C11);
                }
                function0 = (Function0) C11;
                u11.k();
            }
            u11.k();
            u11.o(583119175);
            boolean z11 = (i12 & 112) == 32;
            int i14 = i12 & 14;
            boolean z12 = z11 | (i14 == 4);
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new v(onValueChange, item);
                u11.x(C12);
            }
            Function1 function13 = (Function1) C12;
            u11.k();
            u11.o(583125343);
            boolean n12 = u11.n(addToClipboard) | (i14 == 4) | u11.F(context);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new w(addToClipboard, item, context);
                u11.x(C13);
            }
            u11.k();
            c3969l = u11;
            DebugMenuInputKt.DebugMenuInput(g10, c11, function13, j12, b12, false, false, null, null, function0, null, null, (Function1) C13, c3969l, 0, 0, 3552);
            function12 = addToClipboard;
            eVar3 = eVar4;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new x(item, onValueChange, eVar3, function12, i11));
        }
    }
}
