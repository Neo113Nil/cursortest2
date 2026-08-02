package c1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class o extends AbstractC7737t implements Function1<C5718i, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f56268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    o(Function1<? super C5718i, Object> function1) {
        super(1);
        this.f56268b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(C5718i c5718i) {
        C5718i c5718i2;
        AbstractC5715f abstractC5715f = (AbstractC5715f) this.f56268b.invoke(c5718i);
        synchronized (C5721l.D()) {
            c5718i2 = C5721l.f56253d;
            C5721l.f56253d = c5718i2.q(abstractC5715f.f());
            Unit unit = Unit.f71690a;
        }
        return abstractC5715f;
    }
}
