package J20;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellStartScope;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f13719a = new C4912a(false, -816745906, a.f13720b);

    static final class a extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellStartScope, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13720b = new a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(DebugMenuCellStartScope debugMenuCellStartScope, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(debugMenuCellStartScope, "<this>");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            }
            return Unit.f71690a;
        }
    }
}
