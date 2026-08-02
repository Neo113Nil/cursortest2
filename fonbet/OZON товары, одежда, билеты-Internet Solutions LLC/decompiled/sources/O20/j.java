package O20;

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
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.navBar.DebugMenuNavBarKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.navBar.search.NavBarSearchKt;
import v0.C10164d;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class j {

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2584m f19892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2584m c2584m) {
            super(0);
            this.f19892b = c2584m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f19892b.N();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f19893b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f19894c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(k kVar, Function1<? super String, Unit> function1) {
            super(2);
            this.f19893b = kVar;
            this.f19894c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                NavBarSearchKt.NavBarSearch(this.f19893b.c(), "Поиск", this.f19894c, null, null, null, null, interfaceC3967k2, 48, 120);
            }
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull k uiState, @NotNull C2584m navController, @NotNull Function1<? super String, Unit> onSearchQueryChanged, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onSearchQueryChanged, "onSearchQueryChanged");
        interfaceC3967k.o(-1713600570);
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
        if (uiState.e() == null) {
            interfaceC3967k.o(190292315);
            interfaceC3967k.o(-1523863554);
            interfaceC3967k.o(1050416008);
            boolean F11 = interfaceC3967k.F(navController) | ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(uiState)) || (i11 & 6) == 4);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new i(uiState, navController);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            C10164d.a(null, null, null, null, null, null, false, (Function1) C11, interfaceC3967k, 0, 255);
            interfaceC3967k.k();
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(190293978);
            Q20.b.a(uiState.e(), interfaceC3967k);
            interfaceC3967k.k();
        }
        interfaceC3967k.o(190297148);
        boolean F12 = interfaceC3967k.F(navController);
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new a(navController);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        DebugMenuNavBarKt.DebugMenuNavBar((Function0) C12, uiState.d(), null, null, a1.c.c(1994399853, new b(uiState, onSearchQueryChanged), interfaceC3967k), false, null, 0, interfaceC3967k, 24576, 236);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
