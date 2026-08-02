package B0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class U0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2477h1 f1536b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U0(InterfaceC2477h1 interfaceC2477h1) {
        super(0);
        this.f1536b = interfaceC2477h1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f1536b.onStop();
        return Unit.f71690a;
    }
}
