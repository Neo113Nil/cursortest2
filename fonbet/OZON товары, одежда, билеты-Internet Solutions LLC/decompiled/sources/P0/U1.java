package P0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class U1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3793z1 f20864b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U1(InterfaceC3793z1 interfaceC3793z1) {
        super(2);
        this.f20864b = interfaceC3793z1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            p2.b(this.f20864b.b().getMessage(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, interfaceC3967k2, 0, 0, 131070);
        }
        return Unit.f71690a;
    }
}
