package B0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class O extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1461b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(I0.W0 w02) {
        super(1);
        this.f1461b = w02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new N(this.f1461b);
    }
}
