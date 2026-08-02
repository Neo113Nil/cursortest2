package If0;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class A extends AbstractC7737t implements Function1<v0.G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f12345b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<I, Unit> f12346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    A(J j11, Function1<? super I, Unit> function1) {
        super(1);
        this.f12345b = j11;
        this.f12346c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(v0.G g10) {
        v0.G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        J j11 = this.f12345b;
        Function1<I, Unit> function1 = this.f12346c;
        v0.G.e(LazyColumn, null, new C4912a(true, -225702409, new C3257x(j11, function1)), 3);
        v0.G.e(LazyColumn, null, new C4912a(true, 862148448, new C3258y(j11, function1)), 3);
        v0.G.e(LazyColumn, null, new C4912a(true, -473225281, new C3259z(j11, function1)), 3);
        return Unit.f71690a;
    }
}
