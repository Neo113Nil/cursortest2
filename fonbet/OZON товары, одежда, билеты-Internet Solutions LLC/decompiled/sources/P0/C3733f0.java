package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3733f0 extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21026b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3733f0(C3787x1 c3787x1, Function0<Unit> function0) {
        super(1);
        this.f21026b = c3787x1;
        this.f21027c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        if (!this.f21026b.j()) {
            this.f21027c.invoke();
        }
        return Unit.f71690a;
    }
}
