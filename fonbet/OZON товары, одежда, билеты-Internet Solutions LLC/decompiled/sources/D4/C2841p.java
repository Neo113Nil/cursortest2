package D4;

import S0.InterfaceC3967k;
import a1.C4912a;
import b1.InterfaceC5505h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: D4.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2841p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5505h f5923b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f5924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2841p(InterfaceC5505h interfaceC5505h, C4912a c4912a) {
        super(2);
        this.f5923b = interfaceC5505h;
        this.f5924c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            C2843s.b(this.f5923b, this.f5924c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
