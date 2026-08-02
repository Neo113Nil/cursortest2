package bb0;

import K1.C3422b;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import eb0.C6340a;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.badge.presets.OziBadgeStyle;
import ru.ozon.uni.ozi.components.cell.OziCellKt;
import ru.ozon.uni.ozi.components.cell.addons.OziCellCenterScope;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;

/* loaded from: classes3.dex */
public final class i {
    public static final void a(@NotNull List environments, e.a aVar, @NotNull Function1 onItemClick, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(environments, "environments");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        C3969l u11 = interfaceC3967k.u(1924975813);
        if ((((u11.F(environments) ? 4 : 2) | i11 | 48 | (u11.F(onItemClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN)) & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            aVar = androidx.compose.ui.e.f40358c0;
            o.a("Environment", aVar, a1.c.c(1491750817, new C5619b(environments, onItemClick), u11), u11, 438);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C5620c(environments, aVar, onItemClick, i11));
        }
    }

    public static final void b(OziCellCenterScope oziCellCenterScope, C6340a c6340a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1835087910);
        if ((i11 & 6) == 0) {
            i12 = i11 | (u11.n(oziCellCenterScope) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(c6340a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            oziCellCenterScope.m3077Default500BadgeX9ctgU4(new C3422b(6, c6340a.b(), null), null, OziTestTagsKt.oziResourceIdTestTag(androidx.compose.ui.e.f40358c0, c6340a.a().c(), u11, 6), null, 0, c6340a.e() ? "User Value" : "Default", null, c6340a.e() ? OziBadgeStyle.PositivePrimary.INSTANCE : OziBadgeStyle.NeutralPrimary.INSTANCE, false, 0L, 0L, 0.0f, u11, 48, (i12 << 6) & 896, 3928);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C5618a(oziCellCenterScope, c6340a, i11));
        }
    }

    public static final void c(C6340a c6340a, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1511167139);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c6340a) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            C6340a.C0976a a11 = c6340a.a();
            boolean z11 = !c6340a.c();
            androidx.compose.ui.e oziResourceIdTestTag = OziTestTagsKt.oziResourceIdTestTag(androidx.compose.ui.e.f40358c0, a11.a(), u11, 6);
            C4912a c11 = a1.c.c(-664662505, new C5621d(c6340a), u11);
            C4912a c12 = a1.c.c(1100397622, new C5622e(c6340a, a11), u11);
            u11.o(1695269895);
            boolean z12 = ((i12 & 112) == 32) | ((i12 & 14) == 4);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C5623f(function1, c6340a);
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            OziCellKt.m3072OziCellrx89VDg(oziResourceIdTestTag, null, c11, c12, null, null, (Function0) C11, false, z11, 0.0f, 0.0f, 0.0f, null, null, null, c3969l, 3456, 0, 32434);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C5624g(c6340a, function1, i11));
        }
    }

    public static final void d(OziCellCenterScope oziCellCenterScope, C6340a c6340a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-398905158);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(oziCellCenterScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(c6340a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            oziCellCenterScope.m3076Default500Rx1qByU(c6340a.b(), null, OziTestTagsKt.oziResourceIdTestTag(androidx.compose.ui.e.f40358c0, c6340a.a().c(), u11, 6), 0, 0, 0L, 0L, 0.0f, u11, ((i12 << 24) & 234881024) | 48, 248);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new h(oziCellCenterScope, c6340a, i11));
        }
    }
}
