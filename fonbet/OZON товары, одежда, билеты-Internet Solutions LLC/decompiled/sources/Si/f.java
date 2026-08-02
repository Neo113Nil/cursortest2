package Si;

import F4.F;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function1<F<InterfaceC4010a>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f26312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar) {
        super(1);
        this.f26312b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(F<InterfaceC4010a> f7) {
        this.f26312b.f26263B.setValue(f7);
        return Unit.f71690a;
    }
}
