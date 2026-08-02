package Sf0;

import J0.r;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {
    public static final void a(androidx.compose.ui.e eVar, @NotNull C4912a content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-1069526333);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = T.f(androidx.compose.ui.e.f40358c0, 16);
            }
            r.a(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), null, 0L, 4, a1.c.c(-616953178, new a(eVar, content), u11), u11, 1769478, 30);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(eVar, content, i11, i12));
        }
    }
}
