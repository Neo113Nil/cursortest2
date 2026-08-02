package Q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7839p0;
import l1.InterfaceC7813c0;
import l1.q0;
import n1.InterfaceC8412e;

/* loaded from: classes8.dex */
final class B extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7839p0 f22751b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC7813c0 f22752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(AbstractC7839p0 abstractC7839p0, InterfaceC7813c0 interfaceC7813c0) {
        super(1);
        this.f22751b = abstractC7839p0;
        this.f22752c = interfaceC7813c0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        q0.a(interfaceC8412e, this.f22751b, this.f22752c.mo7invoke0d7_KjU());
        return Unit.f71690a;
    }
}
