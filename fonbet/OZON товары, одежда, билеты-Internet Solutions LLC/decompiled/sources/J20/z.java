package J20;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellStartScope;

/* loaded from: classes3.dex */
final class z extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellStartScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(boolean z11) {
        super(3);
        this.f13747b = z11;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(DebugMenuCellStartScope debugMenuCellStartScope, InterfaceC3967k interfaceC3967k, Integer num) {
        DebugMenuCellStartScope DebugMenuCell = debugMenuCellStartScope;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(DebugMenuCell, "$this$DebugMenuCell");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(DebugMenuCell) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            DebugMenuCell.Radio(this.f13747b, null, null, false, null, null, interfaceC3967k2, (intValue << 18) & 3670016, 62);
        }
        return Unit.f71690a;
    }
}
