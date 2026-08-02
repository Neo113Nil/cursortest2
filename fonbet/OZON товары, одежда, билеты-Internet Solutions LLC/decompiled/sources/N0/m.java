package N0;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f18314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(InterfaceC3978p0 interfaceC3978p0) {
        super(2);
        this.f18314b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            int i11 = o.f18318b;
            ((Function2) this.f18314b.getValue()).invoke(interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
