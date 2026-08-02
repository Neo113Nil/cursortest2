package K20;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellEndScope;

/* loaded from: classes3.dex */
final class o extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellEndScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f15150b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f15151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    o(boolean z11, Function1<? super Boolean, Unit> function1) {
        super(3);
        this.f15150b = z11;
        this.f15151c = function1;
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
            interfaceC3967k2.o(1801218977);
            Function1<Boolean, Unit> function1 = this.f15151c;
            boolean n11 = interfaceC3967k2.n(function1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new n(function1);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            DebugMenuCell.Toggle(this.f15150b, null, false, null, (Function1) C11, null, interfaceC3967k2, (intValue << 18) & 3670016, 46);
        }
        return Unit.f71690a;
    }
}
