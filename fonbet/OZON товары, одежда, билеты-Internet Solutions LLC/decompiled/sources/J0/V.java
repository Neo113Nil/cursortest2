package J0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class V extends AbstractC7737t implements Function1<X, W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<X, Boolean> f13021b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    V(Function1<? super X, Boolean> function1) {
        super(1);
        this.f13021b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final W invoke(X x11) {
        return new W(x11, this.f13021b);
    }
}
