package K20;

import L20.a;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellStartScope;
import y20.C10833a;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellStartScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.C0310a f15157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(a.C0310a c0310a) {
        super(3);
        this.f15157b = c0310a;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(DebugMenuCellStartScope debugMenuCellStartScope, InterfaceC3967k interfaceC3967k, Integer num) {
        DebugMenuCellStartScope BadgeComponent = debugMenuCellStartScope;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(BadgeComponent, "$this$BadgeComponent");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(BadgeComponent) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else if (this.f15157b.f()) {
            int i11 = C10833a.f105964b;
            interfaceC3967k2.o(-802828762);
            AbstractC8972b a11 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_nesting_filled, interfaceC3967k2, 0);
            interfaceC3967k2.k();
            BadgeComponent.m1618Iconcf5BqRc(a11, null, 0L, null, interfaceC3967k2, (intValue << 12) & 57344, 14);
        }
        return Unit.f71690a;
    }
}
