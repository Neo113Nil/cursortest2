package Yi0;

import S0.InterfaceC3967k;
import androidx.activity.ActivityC5043j;
import androidx.compose.ui.e;
import bj0.C5680b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import mf0.InterfaceC8142d;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f35131b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ActivityC5043j f35132c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC8142d f35133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, ActivityC5043j activityC5043j, InterfaceC8142d interfaceC8142d) {
        super(2);
        this.f35131b = dVar;
        this.f35132c = activityC5043j;
        this.f35133d = interfaceC8142d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = e.f40358c0;
            d dVar = this.f35131b;
            e a11 = C5680b.a(6, interfaceC3967k2, aVar, dVar.d());
            String e11 = dVar.e();
            interfaceC3967k2.o(-1004274972);
            boolean n11 = interfaceC3967k2.n(dVar);
            ActivityC5043j activityC5043j = this.f35132c;
            boolean F11 = n11 | interfaceC3967k2.F(activityC5043j);
            InterfaceC8142d interfaceC8142d = this.f35133d;
            boolean F12 = F11 | interfaceC3967k2.F(interfaceC8142d);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(dVar, activityC5043j, interfaceC8142d);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            ej0.d.a(e11, a11, (Function0) C11, interfaceC3967k2);
        }
        return Unit.f71690a;
    }
}
