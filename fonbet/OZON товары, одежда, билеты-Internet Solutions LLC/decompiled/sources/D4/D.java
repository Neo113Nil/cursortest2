package D4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class D extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B4.P f5798b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.J f5799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(B4.P p11, androidx.lifecycle.J j11) {
        super(1);
        this.f5798b = p11;
        this.f5799c = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        this.f5798b.Y(this.f5799c);
        return new C();
    }
}
