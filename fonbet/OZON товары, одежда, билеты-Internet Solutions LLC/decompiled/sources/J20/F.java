package J20;

import S0.InterfaceC3967k;
import S20.a;
import android.content.Context;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellEndScope;

/* loaded from: classes3.dex */
final class F extends AbstractC7737t implements InterfaceC6511n<DebugMenuCellEndScope, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.j f13701b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f13702c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f13703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(a.j jVar, Context context, Function1 function1) {
        super(3);
        this.f13701b = jVar;
        this.f13702c = function1;
        this.f13703d = context;
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
            a.j jVar = this.f13701b;
            boolean g10 = jVar.g();
            boolean b11 = jVar.b();
            interfaceC3967k2.o(1729234551);
            Function1<Boolean, Unit> function1 = this.f13702c;
            boolean n11 = interfaceC3967k2.n(function1) | interfaceC3967k2.n(jVar);
            Context context = this.f13703d;
            boolean F11 = n11 | interfaceC3967k2.F(context);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new E(jVar, context, function1);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            DebugMenuCell.Toggle(g10, null, b11, null, (Function1) C11, null, interfaceC3967k2, (intValue << 18) & 3670016, 42);
        }
        return Unit.f71690a;
    }
}
