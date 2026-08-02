package K20;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class n extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f15149b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    n(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.f15149b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.f15149b.invoke(Boolean.valueOf(!bool.booleanValue()));
        return Unit.f71690a;
    }
}
