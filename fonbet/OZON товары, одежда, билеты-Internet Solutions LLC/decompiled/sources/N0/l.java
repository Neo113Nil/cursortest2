package N0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class l extends AbstractC7737t implements Function1<Z1.q, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f18313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(s sVar) {
        super(1);
        this.f18313b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Z1.q qVar) {
        Z1.q a11 = Z1.q.a(qVar.e());
        s sVar = this.f18313b;
        sVar.h(a11);
        sVar.l();
        return Unit.f71690a;
    }
}
