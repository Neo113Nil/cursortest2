package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class V extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f20865b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(Function0<Unit> function0) {
        super(1);
        this.f20865b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f20865b.invoke();
        return Unit.f71690a;
    }
}
