package Mi0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class l extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Qi0.f f18111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(Qi0.f fVar) {
        super(1);
        this.f18111b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.getClass();
        this.f18111b.b().invoke(bool2);
        return Unit.f71690a;
    }
}
