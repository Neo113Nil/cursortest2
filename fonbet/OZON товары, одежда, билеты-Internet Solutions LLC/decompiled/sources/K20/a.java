package K20;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellStartScope;
import u0.E;
import u0.J;
import u0.X;
import u0.Y;
import v0.InterfaceC10165e;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static C4912a f15123a = new C4912a(false, -393633339, C0292a.f15125b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static C4912a f15124b = new C4912a(false, 1757267406, b.f15126b);

    /* renamed from: K20.a$a, reason: collision with other inner class name */
    static final class C0292a extends AbstractC7737t implements InterfaceC6511n<InterfaceC10165e, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0292a f15125b = new C0292a(3);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC10165e interfaceC10165e, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC10165e item = interfaceC10165e;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                e.a aVar = androidx.compose.ui.e.f40358c0;
                int i11 = J.f99608a;
                E.a(interfaceC3967k2, X.a(aVar, Y.a(interfaceC3967k2)));
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellStartScope, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15126b = new b(3);

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
                int i11 = C10833a.f105964b;
                interfaceC3967k2.o(-802828762);
                AbstractC8972b a11 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_nesting_filled, interfaceC3967k2, 0);
                interfaceC3967k2.k();
                DebugMenuCell.m1618Iconcf5BqRc(a11, null, 0L, null, interfaceC3967k2, (intValue << 12) & 57344, 14);
            }
            return Unit.f71690a;
        }
    }
}
