package J0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class S0 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f12987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S0(String str) {
        super(1);
        this.f12987b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        I1.z.i(d12, this.f12987b);
        I1.z.q(d12, 5);
        return Unit.f71690a;
    }
}
