package P0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class a2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20972b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a2(InterfaceC3793z1 interfaceC3793z1) {
        super(2);
        this.f20972b = interfaceC3793z1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC3793z1 interfaceC3793z1 = this.f20972b;
            boolean n11 = interfaceC3967k2.n(interfaceC3793z1);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Z1(interfaceC3793z1);
                interfaceC3967k2.x(C11);
            }
            D.a((Function0) C11, null, false, null, C3773t.f21353a, interfaceC3967k2, 196608, 30);
        }
        return Unit.f71690a;
    }
}
