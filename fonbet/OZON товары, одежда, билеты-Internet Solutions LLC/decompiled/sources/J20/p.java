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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.presets.DebugMenuInputDefaults;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class p {
    public static final void a(@NotNull a.e item, InterfaceC3967k interfaceC3967k) {
        Intrinsics.checkNotNullParameter(item, "item");
        interfaceC3967k.o(563533935);
        e.a aVar = androidx.compose.ui.e.f40358c0;
        Function1<String, Unit> addToClipboard = DebugMenuInputDefaults.INSTANCE.addToClipboard(null, interfaceC3967k, 48, 1);
        String b11 = item.b();
        String c11 = item.c();
        boolean d11 = item.d();
        String id2 = item.getId();
        interfaceC3967k.o(443903270);
        boolean n11 = interfaceC3967k.n(item);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new n(item);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        b(b11, c11, d11, id2, aVar, (Function2) C11, addToClipboard, interfaceC3967k, 0, 32);
        interfaceC3967k.k();
    }

    public static final void b(@NotNull String title, @NotNull String subtitle, boolean z11, @NotNull String testTag, androidx.compose.ui.e eVar, Function2 function2, Function1 function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        interfaceC3967k.o(1316916473);
        androidx.compose.ui.e eVar2 = (i12 & 16) != 0 ? androidx.compose.ui.e.f40358c0 : eVar;
        boolean z12 = (i12 & 32) != 0;
        Function2 function22 = (i12 & 64) != 0 ? null : function2;
        Function1 addToClipboard = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? DebugMenuInputDefaults.INSTANCE.addToClipboard(null, interfaceC3967k, 48, 1) : function1;
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        androidx.compose.ui.e j11 = T.j(ru.ozon.debugMenu.internal.core.ui.utils.b.b(eVar2, testTag), 0.0f, 0.0f, 0.0f, z11 ? T20.a.c() : 0, 7);
        if (z11) {
            j11 = j11.l0(C6988h.a(androidx.compose.ui.e.f40358c0, T20.a.a()));
        }
        b11 = androidx.compose.foundation.e.b(j11, C10833a.a(interfaceC3967k).h(), y0.a());
        androidx.compose.ui.e j12 = T.j(b11, 0.0f, 0.0f, 0.0f, z11 ? 4 : 0, 7);
        boolean z13 = !z11;
        boolean z14 = z12;
        C4912a c4912a = m.f13723a;
        interfaceC3967k.o(443934475);
        boolean F11 = ((((i11 & 3670016) ^ 1572864) > 1048576 && interfaceC3967k.n(function22)) || (i11 & 1572864) == 1048576) | (((48 ^ (i11 & 112)) > 32 && interfaceC3967k.n(subtitle)) || (i11 & 48) == 32) | ((((i11 & 29360128) ^ 12582912) > 8388608 && interfaceC3967k.n(addToClipboard)) || (i11 & 12582912) == 8388608) | interfaceC3967k.F(context);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new o(addToClipboard, subtitle, function22, context);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        int i13 = i11 << 3;
        DebugMenuCellKt.m1611DebugMenuCellpLOo_7s(j12, title, subtitle, z14, false, null, c4912a, null, (Function0) C11, null, false, z13, 0.0f, 0.0f, 0.0f, null, null, null, interfaceC3967k, (i13 & 896) | (i13 & 112) | 1572864 | ((i11 >> 6) & 7168), 0, 259760);
        interfaceC3967k.k();
    }
}
