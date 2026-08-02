package Mi0;

import P0.K1;
import P0.N1;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N1 f18106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(N1 n12) {
        super(2);
        this.f18106b = n12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            K1.b(this.f18106b, null, null, interfaceC3967k2, 6, 6);
        }
        return Unit.f71690a;
    }
}
