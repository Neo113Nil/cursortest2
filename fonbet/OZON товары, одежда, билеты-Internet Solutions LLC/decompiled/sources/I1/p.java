package I1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class p extends AbstractC7737t implements Function1<D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f11729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(i iVar) {
        super(1);
        this.f11729b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(D d11) {
        z.q(d11, this.f11729b.b());
        return Unit.f71690a;
    }
}
