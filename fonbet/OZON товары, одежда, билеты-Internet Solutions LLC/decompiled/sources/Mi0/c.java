package Mi0;

import dj0.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function1<f.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(String str) {
        super(1);
        this.f18092b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(f.a aVar) {
        f.a TrackerIsland = aVar;
        Intrinsics.checkNotNullParameter(TrackerIsland, "$this$TrackerIsland");
        TrackerIsland.b(new b(this.f18092b));
        return Unit.f71690a;
    }
}
