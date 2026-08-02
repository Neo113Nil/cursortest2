package Mi0;

import P0.p2;
import P0.u2;
import P0.v2;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Qi0.b f18099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Qi0.b bVar) {
        super(2);
        this.f18099b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            p2.b(this.f18099b.d(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((u2) interfaceC3967k2.m(v2.a())).k(), interfaceC3967k2, 0, 0, 65534);
        }
        return Unit.f71690a;
    }
}
