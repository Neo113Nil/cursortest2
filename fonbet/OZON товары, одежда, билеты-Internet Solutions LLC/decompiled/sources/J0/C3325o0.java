package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3325o0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13338b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j1.r f13339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3325o0(boolean z11, j1.r rVar) {
        super(0);
        this.f13338b = z11;
        this.f13339c = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f13338b) {
            this.f13339c.d();
        }
        return Unit.f71690a;
    }
}
