package E0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f1 extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c1 f7217b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2922g f7218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f1(c1 c1Var, C2922g c2922g) {
        super(1);
        this.f7217b = c1Var;
        this.f7218c = c2922g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        D0.e eVar;
        eVar = this.f7217b.f7171a;
        eVar.i(this.f7218c);
        return Unit.f71690a;
    }
}
