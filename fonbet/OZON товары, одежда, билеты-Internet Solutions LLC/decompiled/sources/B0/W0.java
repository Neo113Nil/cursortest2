package B0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class W0 extends AbstractC7737t implements Function2<x1.x, C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2477h1 f1598b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W0(InterfaceC2477h1 interfaceC2477h1) {
        super(2);
        this.f1598b = interfaceC2477h1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(x1.x xVar, C7459e c7459e) {
        this.f1598b.b(c7459e.n());
        return Unit.f71690a;
    }
}
