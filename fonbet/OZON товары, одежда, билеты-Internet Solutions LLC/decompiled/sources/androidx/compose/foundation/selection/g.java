package androidx.compose.foundation.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class g extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f39776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar) {
        super(0);
        this.f39776b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1 function1;
        boolean z11;
        h hVar = this.f39776b;
        function1 = hVar.f39778v;
        z11 = hVar.f39777u;
        function1.invoke(Boolean.valueOf(!z11));
        return Unit.f71690a;
    }
}
