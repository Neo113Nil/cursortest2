package S0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: S0.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3958g0 extends AbstractC7737t implements Function1<Long, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f25414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3958g0(Function1<? super Long, Object> function1) {
        super(1);
        this.f25414b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Long l11) {
        return this.f25414b.invoke(Long.valueOf(l11.longValue() / 1000000));
    }
}
