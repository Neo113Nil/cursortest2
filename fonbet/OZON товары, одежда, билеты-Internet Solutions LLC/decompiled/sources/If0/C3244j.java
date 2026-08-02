package If0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: If0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3244j extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3244j(Function1<? super I, Unit> function1) {
        super(0);
        this.f12444b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f12444b.invoke(c0.f12432a);
        return Unit.f71690a;
    }
}
