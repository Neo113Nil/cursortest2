package androidx.compose.foundation.selection;

import androidx.compose.foundation.t;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import kotlin.jvm.functions.Function0;
import n0.InterfaceC8367H;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import t0.q;

/* loaded from: classes8.dex */
public final class c {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull e.a aVar, boolean z11, q qVar, InterfaceC8367H interfaceC8367H, boolean z12, I1.i iVar, @NotNull Function0 function0) {
        androidx.compose.ui.e b11;
        if (interfaceC8367H instanceof InterfaceC8369J) {
            return new SelectableElement(z11, qVar, (InterfaceC8369J) interfaceC8367H, z12, iVar, function0);
        }
        if (interfaceC8367H == null) {
            return new SelectableElement(z11, qVar, null, z12, iVar, function0);
        }
        if (qVar != null) {
            return t.b(androidx.compose.ui.e.f40358c0, qVar, interfaceC8367H).l0(new SelectableElement(z11, qVar, null, z12, iVar, function0));
        }
        b11 = androidx.compose.ui.c.b(androidx.compose.ui.e.f40358c0, C5236c1.a(), new b(interfaceC8367H, z11, z12, iVar, function0));
        return b11;
    }

    public static androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z11, I1.i iVar, Function0 function0, int i11) {
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return androidx.compose.ui.c.b(eVar, C5236c1.a(), new a(z11, iVar, function0));
    }
}
