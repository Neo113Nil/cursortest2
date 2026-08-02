package J20;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellEndScope;

/* renamed from: J20.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3372b extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellEndScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13709b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f13710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3372b(String str, Function0<Unit> function0) {
        super(3);
        this.f13709b = str;
        this.f13710c = function0;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(DebugMenuCellEndScope debugMenuCellEndScope, InterfaceC3967k interfaceC3967k, Integer num) {
        DebugMenuCellEndScope DebugMenuCell = debugMenuCellEndScope;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(DebugMenuCell, "$this$DebugMenuCell");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(DebugMenuCell) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            DebugMenuCell.Badge(this.f13709b, null, this.f13710c != null, null, interfaceC3967k2, (intValue << 12) & 57344, 10);
        }
        return Unit.f71690a;
    }
}
