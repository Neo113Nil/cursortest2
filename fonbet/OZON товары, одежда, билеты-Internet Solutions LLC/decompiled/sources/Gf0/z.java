package Gf0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class z extends AbstractC7737t implements Function1<Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C, Unit> f10227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    z(Function1<? super C, Unit> function1) {
        super(1);
        this.f10227b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l11) {
        this.f10227b.invoke(new W(l11.longValue()));
        return Unit.f71690a;
    }
}
