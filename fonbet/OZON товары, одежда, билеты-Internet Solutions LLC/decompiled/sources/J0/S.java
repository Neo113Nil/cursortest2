package J0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class S extends AbstractC7737t implements Function0<W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ X f12985b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<X, Boolean> f12986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    S(X x11, Function1<? super X, Boolean> function1) {
        super(0);
        this.f12985b = x11;
        this.f12986c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final W invoke() {
        return new W(this.f12985b, this.f12986c);
    }
}
