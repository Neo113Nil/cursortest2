package androidx.compose.foundation.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Boolean, Unit> f39774b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f39775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    f(Function1<? super Boolean, Unit> function1, boolean z11) {
        super(0);
        this.f39774b = function1;
        this.f39775c = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f39774b.invoke(Boolean.valueOf(!this.f39775c));
        return Unit.f71690a;
    }
}
