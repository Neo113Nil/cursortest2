package P1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class r extends AbstractC7737t implements Function1<W, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3812t f21587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(C3812t c3812t) {
        super(1);
        this.f21587b = c3812t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(W w11) {
        return C3812t.e(this.f21587b, W.a(w11)).getValue();
    }
}
