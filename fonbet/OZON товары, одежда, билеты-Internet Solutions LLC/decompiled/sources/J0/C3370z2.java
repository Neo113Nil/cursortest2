package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.z2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3370z2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4912a f13539b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f13540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3370z2(C4912a c4912a, C4912a c4912a2) {
        super(2);
        this.f13539b = c4912a;
        this.f13540c = c4912a2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            u3.a(((D3) interfaceC3967k2.m(E3.c())).b(), a1.c.c(225114541, new C3366y2(this.f13539b, this.f13540c), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
