package K20;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import J20.C3373c;
import L20.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.navBar.search.NavBarSearchKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.screen.DebugMenuScreenKt;
import u0.C9915y;
import u0.InterfaceC9914x;
import v0.C10164d;

/* loaded from: classes3.dex */
public final class e {

    /* synthetic */ class a extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((t) this.receiver).d0();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f15137b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f15138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar, InterfaceC3978p0 interfaceC3978p0) {
            super(2);
            this.f15137b = tVar;
            this.f15138c = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                InterfaceC3978p0 interfaceC3978p0 = this.f15138c;
                String c11 = ((s) interfaceC3978p0.getValue()).c();
                interfaceC3967k2.o(611194484);
                t tVar = this.f15137b;
                boolean F11 = interfaceC3967k2.F(tVar);
                Object C11 = interfaceC3967k2.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    f fVar = new f(1, tVar, t.class, "setInput", "setInput(Ljava/lang/String;)V", 0);
                    interfaceC3967k2.x(fVar);
                    C11 = fVar;
                }
                interfaceC3967k2.k();
                Function1 function1 = (Function1) ((kotlin.reflect.h) C11);
                boolean d11 = ((s) interfaceC3978p0.getValue()).d();
                interfaceC3967k2.o(611198485);
                boolean F12 = interfaceC3967k2.F(tVar);
                Object C12 = interfaceC3967k2.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    g gVar = new g(1, tVar, t.class, "setToggle", "setToggle(Z)V", 0);
                    interfaceC3967k2.x(gVar);
                    C12 = gVar;
                }
                interfaceC3967k2.k();
                e.c(c11, function1, d11, (Function1) ((kotlin.reflect.h) C12), interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements InterfaceC6511n<InterfaceC9914x, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f15139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3978p0 interfaceC3978p0) {
            super(3);
            this.f15139b = interfaceC3978p0;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9914x interfaceC9914x, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9914x contentPadding = interfaceC9914x;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((intValue & 6) == 0) {
                intValue |= interfaceC3967k2.n(contentPadding) ? 4 : 2;
            }
            if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                C9915y b11 = T.b(0.0f, contentPadding.d() + 8, 0.0f, 0.0f, 13);
                interfaceC3967k2.o(611206320);
                InterfaceC3978p0 interfaceC3978p0 = this.f15139b;
                boolean n11 = interfaceC3967k2.n(interfaceC3978p0);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new m(interfaceC3978p0);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                C10164d.a(null, null, b11, null, null, null, false, (Function1) C11, interfaceC3967k2, 0, 251);
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f15140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(t tVar, int i11) {
            super(2);
            this.f15140b = tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            e.a(this.f15140b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull t viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(2077898758);
        if ((((u11.F(viewModel) ? 4 : 2) | i11) & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 b11 = n1.b(viewModel.getState(), u11);
            u11.o(-1185614927);
            boolean F11 = u11.F(viewModel);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                a aVar = new a(0, viewModel, t.class, "back", "back()V", 0);
                u11.x(aVar);
                C11 = aVar;
            }
            u11.k();
            DebugMenuScreenKt.DebugMenuScreen("Зависимости", null, (Function0) ((kotlin.reflect.h) C11), a1.c.c(1198570006, new b(viewModel, b11), u11), null, a1.c.c(1619309105, new c(b11), u11), u11, 199686, 18);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(viewModel, i11));
        }
    }

    public static final void b(@NotNull a.C0310a item, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-1784688561);
        if ((((u11.n(item) ? 4 : 2) | i11 | 48) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            C3373c.b(item.b(), item.c(), item.d(), item.e(), aVar2, a1.c.c(1820629044, new q(item), u11), null, null, u11, 1794048, 384);
            aVar = aVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new r(item, aVar, i11));
        }
    }

    public static final void c(String str, Function1 function1, boolean z11, Function1 function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1 function13;
        C3969l u11 = interfaceC3967k.u(1254173456);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            function13 = function1;
            i12 |= u11.F(function13) ? 32 : 16;
        } else {
            function13 = function1;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            NavBarSearchKt.NavBarSearch(str, "Поиск", function13, null, null, null, null, u11, (i12 & 14) | 48 | ((i12 << 3) & 896), 120);
            float f11 = 0;
            DebugMenuCellKt.m1611DebugMenuCellpLOo_7s(null, "Транзитивные зависимости", null, false, false, K20.a.f15124b, a1.c.c(1250355574, new o(z11, function12), u11), null, null, null, false, false, 0.0f, f11, f11, null, null, null, u11, 1769520, 27696, 235421);
            u11 = u11;
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new p(str, function1, z11, function12, i11));
        }
    }
}
