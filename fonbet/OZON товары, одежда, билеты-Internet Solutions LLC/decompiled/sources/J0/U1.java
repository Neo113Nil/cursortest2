package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class U1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f13011b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3281d2 f13012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U1(C4912a c4912a, C3281d2 c3281d2) {
        super(2);
        this.f13011b = c4912a;
        this.f13012c = c3281d2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f13011b.invoke(this.f13012c.a(), interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
