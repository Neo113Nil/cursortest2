package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3242h extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3242h(Function1<? super I, Unit> function1) {
        super(1);
        this.f12442b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f12442b.invoke(new U(num.intValue()));
        return Unit.f71690a;
    }
}
