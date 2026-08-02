package B0;

import S0.InterfaceC3978p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import t0.s;

/* loaded from: classes.dex */
final class F1 extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<s.b> f1372b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t0.q f1373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F1(InterfaceC3978p0<s.b> interfaceC3978p0, t0.q qVar) {
        super(1);
        this.f1372b = interfaceC3978p0;
        this.f1373c = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new E1(this.f1372b, this.f1373c);
    }
}
