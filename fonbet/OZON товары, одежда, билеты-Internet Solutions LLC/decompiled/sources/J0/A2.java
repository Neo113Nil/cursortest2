package J0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class A2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f12661b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f12662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A2(C4912a c4912a, C4912a c4912a2) {
        super(2);
        this.f12661b = c4912a;
        this.f12662c = c4912a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C3996z.a(C3359x.a().c(Float.valueOf(Bl0.k0.q(interfaceC3967k2))), a1.c.c(1939362236, new C3370z2(this.f12661b, this.f12662c), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
