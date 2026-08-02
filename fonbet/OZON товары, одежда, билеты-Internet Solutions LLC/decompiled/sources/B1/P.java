package B1;

import B1.L;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class P extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L.a f2081b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f2082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    P(L.a aVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(2);
        this.f2081b = aVar;
        this.f2082c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            boolean a11 = this.f2081b.a();
            interfaceC3967k2.h(Boolean.valueOf(a11));
            boolean p11 = interfaceC3967k2.p(a11);
            interfaceC3967k2.o(-869707859);
            if (a11) {
                this.f2082c.invoke(interfaceC3967k2, 0);
            } else {
                interfaceC3967k2.a(p11);
            }
            interfaceC3967k2.k();
            interfaceC3967k2.A();
        }
        return Unit.f71690a;
    }
}
