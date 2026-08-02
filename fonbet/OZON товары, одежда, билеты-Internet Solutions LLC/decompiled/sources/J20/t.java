package J20;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.text.SingleLineTextKt;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class t {
    public static final void a(int i11, InterfaceC3967k interfaceC3967k, e.a aVar, @NotNull String title) {
        int i12;
        String str;
        Intrinsics.checkNotNullParameter(title, "title");
        C3969l u11 = interfaceC3967k.u(42934086);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            str = title;
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            str = title;
            SingleLineTextKt.m1642SingleLineTextsW7UJKQ(str, C10833a.a(u11).l(), C10833a.b().f(), T.i(androidx.compose.foundation.e.b(a0.e(aVar, 1.0f), C10833a.a(u11).h(), T20.a.d()), T20.a.b(), 20, T20.a.b(), 8), u11, (i13 & 14) | 384, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new s(str, aVar, i11));
        }
    }
}
