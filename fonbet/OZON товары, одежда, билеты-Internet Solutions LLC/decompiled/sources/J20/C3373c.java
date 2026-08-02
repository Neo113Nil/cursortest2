package J20;

import S0.InterfaceC3967k;
import S20.a;
import a1.C4912a;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt;
import y20.C10833a;

/* renamed from: J20.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3373c {
    public static final void a(@NotNull a.C0509a item, InterfaceC3967k interfaceC3967k) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "item");
        interfaceC3967k.o(1940308682);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        androidx.compose.ui.e b11 = ru.ozon.debugMenu.internal.core.ui.utils.b.b(aVar, item.getId());
        String d11 = item.d();
        String c11 = item.c();
        String a11 = item.a();
        boolean e11 = item.e();
        Function1<Context, Unit> b12 = item.b();
        interfaceC3967k.o(1386709425);
        if (b12 == null) {
            function0 = null;
        } else {
            interfaceC3967k.o(-1641583256);
            boolean n11 = interfaceC3967k.n(b12) | interfaceC3967k.F(context);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3371a(b12, context);
                interfaceC3967k.x(C11);
            }
            function0 = (Function0) C11;
            interfaceC3967k.k();
        }
        Function0 function02 = function0;
        interfaceC3967k.k();
        b(d11, c11, a11, e11, b11, null, null, function02, interfaceC3967k, 0, 224);
        interfaceC3967k.k();
    }

    public static final void b(@NotNull String title, String str, @NotNull String badge, boolean z11, androidx.compose.ui.e eVar, C4912a c4912a, Function0 function0, Function0 function02, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(badge, "badge");
        interfaceC3967k.o(-2100641728);
        androidx.compose.ui.e eVar2 = (i12 & 16) != 0 ? androidx.compose.ui.e.f40358c0 : eVar;
        boolean z12 = (i12 & 32) == 0;
        C4912a c4912a2 = (i12 & 64) != 0 ? k.f13719a : c4912a;
        Function0 function03 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : function0;
        Function0 function04 = (i12 & 256) != 0 ? null : function02;
        androidx.compose.ui.e j11 = T.j(eVar2, 0.0f, 0.0f, 0.0f, z11 ? T20.a.c() : 0, 7);
        if (z11) {
            j11 = j11.l0(C6988h.a(androidx.compose.ui.e.f40358c0, T20.a.a()));
        }
        b11 = androidx.compose.foundation.e.b(j11, C10833a.a(interfaceC3967k).h(), y0.a());
        int i13 = i11 << 3;
        int i14 = i11 >> 3;
        Function0 function05 = function04;
        DebugMenuCellKt.m1611DebugMenuCellpLOo_7s(T.j(b11, 0.0f, 0.0f, 0.0f, z11 ? 4 : 0, 7), title, str, false, z12, c4912a2, a1.c.c(-1815730652, new C3372b(badge, function04), interfaceC3967k), null, function05, function03, false, !z11, 0.0f, 0.0f, 0.0f, null, null, null, interfaceC3967k, (i13 & 896) | (i13 & 112) | 1572864 | (57344 & i14) | (i14 & 458752) | (i11 & 234881024) | (1879048192 & (i11 << 6)), 0, 259208);
        interfaceC3967k.k();
    }
}
