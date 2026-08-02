package Di0;

import Di0.b;
import ef0.C6361a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function1<kf0.c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<kf0.c, Unit> f6739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(Function1<? super kf0.c, Unit> function1) {
        super(1);
        this.f6739b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(kf0.c cVar) {
        kf0.c ReadOnlyProperty = cVar;
        Intrinsics.checkNotNullParameter(ReadOnlyProperty, "$this$ReadOnlyProperty");
        C6361a.a(ReadOnlyProperty, b.C0144b.f6732b, b.a.f6731d, this.f6739b);
        return Unit.f71690a;
    }
}
