package P20;

import B0.C2454a;
import B1.V;
import B4.C2584m;
import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.navBar.DebugMenuNavBarKt;
import v0.C10164d;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class r {
    public static final void a(@NotNull e uiState, @NotNull C2584m navController, @NotNull Function0<Unit> onBackClicked, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        interfaceC3967k.o(-709465660);
        b11 = androidx.compose.foundation.e.b(androidx.compose.ui.e.f40358c0, C10833a.a(interfaceC3967k).g(), y0.a());
        androidx.compose.ui.e d11 = a0.d(b11);
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k, d11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d13 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(d13, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        if (uiState.d() == null) {
            interfaceC3967k.o(853800333);
            interfaceC3967k.o(-2109787281);
            interfaceC3967k.o(-1456897324);
            boolean n11 = interfaceC3967k.n(uiState) | interfaceC3967k.F(navController);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new q(uiState, navController);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            C10164d.a(null, null, null, null, null, null, false, (Function1) C11, interfaceC3967k, 0, 255);
            interfaceC3967k.k();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(853801996);
            Q20.b.a(uiState.d(), interfaceC3967k);
            interfaceC3967k.k();
        }
        DebugMenuNavBarKt.DebugMenuNavBar(onBackClicked, "Debug Localization", null, null, null, false, null, 0, interfaceC3967k, ((i11 >> 6) & 14) | 48, 252);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
