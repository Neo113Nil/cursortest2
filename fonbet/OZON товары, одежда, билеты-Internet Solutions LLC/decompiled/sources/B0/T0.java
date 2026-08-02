package B0;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class T0 extends AbstractC7737t implements Function1<C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2477h1 f1531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T0(InterfaceC2477h1 interfaceC2477h1) {
        super(1);
        this.f1531b = interfaceC2477h1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7459e c7459e) {
        this.f1531b.c(c7459e.n());
        return Unit.f71690a;
    }
}
