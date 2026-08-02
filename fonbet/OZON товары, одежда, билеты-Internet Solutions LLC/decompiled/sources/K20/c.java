package K20;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f15128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar) {
        super(2);
        this.f15128b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            y20.f.b(false, a1.c.c(1122052890, new b(this.f15128b), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
