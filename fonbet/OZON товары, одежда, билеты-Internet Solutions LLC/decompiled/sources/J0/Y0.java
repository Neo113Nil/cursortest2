package J0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class Y0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ D3 f13085b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f13086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Y0(D3 d32, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(2);
        this.f13085b = d32;
        this.f13086c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            u3.a(this.f13085b.a(), a1.c.c(181426554, new X0(this.f13086c), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
