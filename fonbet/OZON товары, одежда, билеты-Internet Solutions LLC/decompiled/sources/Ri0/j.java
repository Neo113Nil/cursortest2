package Ri0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import ff0.C6554a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import mf0.InterfaceC8142d;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f25146b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(InterfaceC3978p0 interfaceC3978p0) {
        super(2);
        this.f25146b = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC8142d interfaceC8142d = (InterfaceC8142d) interfaceC3967k2.m(C6554a.a());
            List<Hi0.a> a11 = ((Ti0.a) this.f25146b.getValue()).a();
            interfaceC3967k2.o(-1520528182);
            boolean F11 = interfaceC3967k2.F(interfaceC8142d);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new i(interfaceC8142d);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            rj0.b.a(null, a11, (Function1) C11, interfaceC3967k2, 0, 1);
        }
        return Unit.f71690a;
    }
}
