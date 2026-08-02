package J20;

import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S20.a;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class D {
    public static final void a(@NotNull a.i.C0510a item, boolean z11, androidx.compose.ui.e eVar, @NotNull Function0 onClick, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e b11;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-757471515);
        if (((i11 | (u11.n(item) ? 4 : 2) | (u11.p(z11) ? 32 : 16) | 384 | (u11.F(onClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL)) & 1171) == 1170 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            c3969l = u11;
        } else {
            eVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e j11 = T.j(ru.ozon.debugMenu.internal.core.ui.utils.b.b(eVar2, item.a()), 0.0f, 0.0f, 0.0f, item.d() ? T20.a.c() : 0, 7);
            if (item.d()) {
                j11 = j11.l0(C6988h.a(eVar2, T20.a.a()));
            }
            b11 = androidx.compose.foundation.e.b(j11, C10833a.a(u11).h(), y0.a());
            c3969l = u11;
            DebugMenuCellKt.m1611DebugMenuCellpLOo_7s(T.j(b11, 0.0f, 0.0f, 0.0f, item.d() ? 4 : 0, 7), item.c(), item.b(), false, false, a1.c.c(345845465, new z(z11), u11), null, null, null, !z11 ? onClick : null, false, !item.d(), 0.0f, 0.0f, 0.0f, null, null, null, c3969l, 196608, 0, 259544);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new A(item, z11, eVar2, onClick, i11));
        }
    }

    public static final void b(@NotNull a.i group, androidx.compose.ui.e eVar, @NotNull Function1 onSelectChanged, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e eVar2;
        a.i.C0510a c0510a;
        boolean z11;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onSelectChanged, "onSelectChanged");
        C3969l u11 = interfaceC3967k.u(1710132691);
        int i12 = (u11.n(group) ? 4 : 2) | i11 | 48 | (u11.F(onSelectChanged) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            eVar2 = androidx.compose.ui.e.f40358c0;
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            androidx.compose.ui.e b11 = ru.ozon.debugMenu.internal.core.ui.utils.b.b(eVar2, group.getId());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, b11);
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
            u11.o(751888701);
            int i13 = 0;
            for (Object obj : group.b()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                a.i.C0510a c0510a2 = (a.i.C0510a) obj;
                u11.G(-1010865018, c0510a2.a());
                if (i13 == group.d()) {
                    c0510a = c0510a2;
                    z11 = true;
                } else {
                    c0510a = c0510a2;
                    z11 = false;
                }
                u11.o(-1010859750);
                boolean r11 = ((i12 & 14) == 4) | ((i12 & 896) == 256) | u11.r(i13) | u11.F(context);
                Object C11 = u11.C();
                if (r11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B(onSelectChanged, i13, group, context);
                    u11.x(C11);
                }
                u11.k();
                a(c0510a, z11, null, (Function0) C11, u11, 0);
                u11.J();
                i13 = i14;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C(group, eVar2, onSelectChanged, i11));
        }
    }
}
