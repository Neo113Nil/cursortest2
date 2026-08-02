package androidx.compose.ui.platform;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import android.view.View;
import d1.C6022a;
import gd.InterfaceC6712a;
import gd.InterfaceC6716e;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
final class v2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x2 f41037b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f41038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v2(x2 x2Var, C4912a c4912a) {
        super(2);
        this.f41037b = x2Var;
        this.f41038c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            x2 x2Var = this.f41037b;
            Object tag = x2Var.x().getTag(R.id.inspection_slot_table_set);
            Set set = (tag instanceof Set) && (!(tag instanceof InterfaceC6712a) || (tag instanceof InterfaceC6716e)) ? (Set) tag : null;
            if (set == null) {
                Object parent = x2Var.x().getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC6712a) && !(tag2 instanceof InterfaceC6716e))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(interfaceC3967k2.D());
                interfaceC3967k2.y();
            }
            AndroidComposeView x11 = x2Var.x();
            boolean F11 = interfaceC3967k2.F(x2Var);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new s2(x2Var, null);
                interfaceC3967k2.x(C11);
            }
            S0.Q.e(interfaceC3967k2, x11, (Function2) C11);
            AndroidComposeView x12 = x2Var.x();
            boolean F12 = interfaceC3967k2.F(x2Var);
            Object C12 = interfaceC3967k2.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new t2(x2Var, null);
                interfaceC3967k2.x(C12);
            }
            S0.Q.e(interfaceC3967k2, x12, (Function2) C12);
            C3996z.a(C6022a.a().c(set), a1.c.c(-1193460702, new u2(x2Var, this.f41038c), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
