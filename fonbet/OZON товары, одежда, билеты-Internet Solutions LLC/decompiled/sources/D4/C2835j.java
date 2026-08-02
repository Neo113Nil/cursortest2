package D4;

import B4.C2581j;
import D4.C2840o;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: D4.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2835j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2840o.a f5908b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2581j f5909c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2835j(C2840o.a aVar, C2581j c2581j) {
        super(2);
        this.f5908b = aVar;
        this.f5909c = c2581j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ((C4912a) this.f5908b.A()).invoke(this.f5909c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
