package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class J extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u2 f20656b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f20657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(u2 u2Var, C4912a c4912a) {
        super(2);
        this.f20656b = u2Var;
        this.f20657c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            p2.a(this.f20656b.a(), this.f20657c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
