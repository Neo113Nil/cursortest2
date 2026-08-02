package J0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3306j1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f13249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3306j1(C4912a c4912a) {
        super(2);
        this.f13249b = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(-187009902);
            float q11 = Bl0.k0.q(interfaceC3967k2);
            interfaceC3967k2.k();
            C3996z.a(C3359x.a().c(Float.valueOf(q11)), a1.c.c(-1705995688, new C3302i1(this.f13249b), interfaceC3967k2), interfaceC3967k2, 56);
        }
        return Unit.f71690a;
    }
}
