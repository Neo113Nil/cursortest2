package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: I0.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3174b0 extends AbstractC7737t implements Function1<x1.x, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f11448b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ F f11449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3174b0(r rVar, F f7) {
        super(1);
        this.f11448b = rVar;
        this.f11449c = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(x1.x xVar) {
        x1.x xVar2 = xVar;
        if (this.f11448b.c(xVar2.f(), this.f11449c)) {
            xVar2.a();
        }
        return Unit.f71690a;
    }
}
