package J0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class Z1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3368z0 f13117b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z1(C3368z0 c3368z0, C4912a c4912a) {
        super(2);
        this.f13117b = c3368z0;
        this.f13118c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3996z.a(Q1.e().c(this.f13117b), this.f13118c, interfaceC3967k2, 8);
        }
        return Unit.f71690a;
    }
}
