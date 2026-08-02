package B0;

import Q1.C3843l;
import Q1.C3848q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class Q extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1494b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Q1.M f1495c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Q1.K f1496d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q1.r f1497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(O0 o02, Q1.M m11, Q1.K k11, Q1.r rVar) {
        super(1);
        this.f1494b = o02;
        this.f1495c = m11;
        this.f1496d = k11;
        this.f1497e = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [Q1.V, T] */
    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        O0 o02 = this.f1494b;
        if (o02.e()) {
            C3843l n12 = o02.n();
            Function1<Q1.K, Unit> m11 = o02.m();
            Function1<C3848q, Unit> l11 = o02.l();
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            C2492m1 c2492m1 = new C2492m1(n12, m11, m12);
            ?? d11 = this.f1495c.d(this.f1496d, this.f1497e, c2492m1, l11);
            m12.f71787a = d11;
            o02.D(d11);
        }
        return new P();
    }
}
