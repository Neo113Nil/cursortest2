package bb0;

import S0.InterfaceC3967k;
import gb0.C6706a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f55813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(boolean z11) {
        super(2);
        this.f55813b = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C6706a.a("Network is prod: " + this.f55813b, null, null, interfaceC3967k2, 0, 6);
        }
        return Unit.f71690a;
    }
}
