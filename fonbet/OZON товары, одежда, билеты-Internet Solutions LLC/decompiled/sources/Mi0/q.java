package Mi0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class q extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f18136b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Oi0.a> f18137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    q(o oVar, Function1<Object, ? extends Oi0.a> function1) {
        super(1);
        this.f18136b = oVar;
        this.f18137c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f18136b.g0(this.f18137c.invoke(obj));
        return Unit.f71690a;
    }
}
