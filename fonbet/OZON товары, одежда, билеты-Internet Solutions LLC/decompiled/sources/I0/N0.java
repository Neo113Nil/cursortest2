package I0;

import k1.C7459e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class N0 extends AbstractC7737t implements Function2<InterfaceC3216x, InterfaceC3216x, Integer> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B1.B f11352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(B1.B b11) {
        super(2);
        this.f11352b = b11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(InterfaceC3216x interfaceC3216x, InterfaceC3216x interfaceC3216x2) {
        B1.B v11 = interfaceC3216x.v();
        B1.B v12 = interfaceC3216x2.v();
        B1.B b11 = this.f11352b;
        long W11 = v11 != null ? b11.W(v11, 0L) : 0L;
        long W12 = v12 != null ? b11.W(v12, 0L) : 0L;
        return Integer.valueOf(C7459e.h(W11) == C7459e.h(W12) ? Vc.a.b(Float.valueOf(C7459e.g(W11)), Float.valueOf(C7459e.g(W12))) : Vc.a.b(Float.valueOf(C7459e.h(W11)), Float.valueOf(C7459e.h(W12))));
    }
}
