package P0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class E0 extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P f20618b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E0(P p11) {
        super(1);
        this.f20618b = p11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        P p11 = this.f20618b;
        p11.show();
        return new D0(p11);
    }
}
