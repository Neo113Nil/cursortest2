package I2;

import D2.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;

/* loaded from: classes8.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f11799b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M<g> f11800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    b(Function1<? super g, Unit> function1, M<g> m11) {
        super(0);
        this.f11799b = (AbstractC7737t) function1;
        this.f11800c = m11;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f11799b.invoke(this.f11800c.f71787a);
        return Unit.f71690a;
    }
}
