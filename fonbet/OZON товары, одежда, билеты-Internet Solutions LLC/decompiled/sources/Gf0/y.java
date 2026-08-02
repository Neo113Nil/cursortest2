package Gf0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class y extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<C, Unit> f10226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    y(Function1<? super C, Unit> function1) {
        super(1);
        this.f10226b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f10226b.invoke(new T(num.intValue()));
        return Unit.f71690a;
    }
}
