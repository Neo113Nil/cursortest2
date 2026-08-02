package I0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class T extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11374b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(C3215w0 c3215w0) {
        super(1);
        this.f11374b = c3215w0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        return new S(this.f11374b);
    }
}
