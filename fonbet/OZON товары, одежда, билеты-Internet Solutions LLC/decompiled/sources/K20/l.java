package K20;

import L20.a;
import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class l extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f15147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list) {
        super(4);
        this.f15147b = list;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k2.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            L20.a aVar = (L20.a) this.f15147b.get(intValue);
            interfaceC3967k2.o(-1354442546);
            if (aVar instanceof a.C0310a) {
                interfaceC3967k2.o(94857652);
                e.b((a.C0310a) aVar, null, interfaceC3967k2, 0);
                interfaceC3967k2.k();
            } else {
                if (!(aVar instanceof a.b)) {
                    throw U7.l.c(interfaceC3967k2, 94855637);
                }
                interfaceC3967k2.o(94859990);
                J20.t.a(0, interfaceC3967k2, null, ((a.b) aVar).getId());
                interfaceC3967k2.k();
            }
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
