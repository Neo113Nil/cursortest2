package I0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class J extends AbstractC7737t implements Function1<C3220z, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<C3220z> f11327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(InterfaceC3978p0<C3220z> interfaceC3978p0) {
        super(1);
        this.f11327b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C3220z c3220z) {
        this.f11327b.setValue(c3220z);
        return Unit.f71690a;
    }
}
