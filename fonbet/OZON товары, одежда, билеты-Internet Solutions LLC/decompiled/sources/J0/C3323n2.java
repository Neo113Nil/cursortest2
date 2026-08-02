package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: J0.n2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3323n2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3295g2 f13327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3323n2(InterfaceC3295g2 interfaceC3295g2) {
        super(2);
        C4912a c4912a = C3355w.f13457a;
        this.f13327b = interfaceC3295g2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC3295g2 interfaceC3295g2 = this.f13327b;
            Intrinsics.f(interfaceC3295g2);
            C3355w.f13457a.invoke(interfaceC3295g2, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
