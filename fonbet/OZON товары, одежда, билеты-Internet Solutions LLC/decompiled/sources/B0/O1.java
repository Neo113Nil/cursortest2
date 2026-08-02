package B0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class O1 extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B1.m0 f1490b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O1(B1.m0 m0Var) {
        super(1);
        this.f1490b = m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        aVar.h(this.f1490b, 0, 0, 0.0f);
        return Unit.f71690a;
    }
}
