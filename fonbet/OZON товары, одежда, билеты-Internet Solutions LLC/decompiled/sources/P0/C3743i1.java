package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.i1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3743i1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f21082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3743i1(C4912a c4912a) {
        super(2);
        this.f21082b = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f21082b.invoke(interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
