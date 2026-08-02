package J20;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellEndScope;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f13721a = new C4912a(false, 9527679, a.f13722b);

    static final class a extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellEndScope, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13722b = new a(3);

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
                DebugMenuCell.Chevron(null, null, interfaceC3967k2, (intValue << 6) & 896, 3);
            }
            return Unit.f71690a;
        }
    }
}
