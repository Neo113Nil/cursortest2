package I0;

import S0.InterfaceC3978p0;
import k1.C7459e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class F0 extends AbstractC7737t implements Function0<C7459e> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11313b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.q> f11314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F0(C3215w0 c3215w0, InterfaceC3978p0<Z1.q> interfaceC3978p0) {
        super(0);
        this.f11313b = c3215w0;
        this.f11314c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7459e invoke() {
        return C7459e.a(B0.b(this.f11313b, this.f11314c.getValue().e()));
    }
}
