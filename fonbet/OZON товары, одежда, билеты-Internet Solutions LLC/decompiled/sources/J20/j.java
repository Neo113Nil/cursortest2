package J20;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S20.a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class j {
    public static final void a(@NotNull a.d item, androidx.compose.ui.e eVar, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(1107188818);
        if ((((u11.n(item) ? 4 : 2) | i11 | 48) & 19) == 18 && u11.b()) {
            u11.j();
            J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new i(item, eVar, i11));
                return;
            }
            return;
        }
        e.a aVar = androidx.compose.ui.e.f40358c0;
        item.getClass();
        androidx.compose.ui.e j11 = T.j(a0.e(ru.ozon.debugMenu.internal.core.ui.utils.b.b(aVar, null), 1.0f), 0.0f, 0.0f, 0.0f, item.a() ? T20.a.c() : 0, 7);
        if (item.a()) {
            j11 = j11.l0(C6988h.a(aVar, T20.a.a()));
        }
        b11 = androidx.compose.foundation.e.b(j11, C10833a.a(u11).h(), y0.a());
        androidx.compose.ui.e j12 = T.j(b11, 0.0f, 0.0f, 0.0f, item.a() ? 8 : 0, 7);
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = u11.I();
        A0 d11 = u11.d();
        androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, j12);
        Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
            u11.H(a11);
        } else {
            u11.e();
        }
        Function2 f12 = T7.E.f(u11, f7, u11, d11);
        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
            Ep.a.d(I11, u11, I11, f12);
        }
        F1.b(u11, f11, InterfaceC2801g.a.f());
        throw null;
    }
}
