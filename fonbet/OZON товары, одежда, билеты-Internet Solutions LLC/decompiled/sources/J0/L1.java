package J0;

import B1.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class L1 extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B1.m0 f12894b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f12895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1(B1.m0 m0Var, int i11) {
        super(1);
        this.f12894b = m0Var;
        this.f12895c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        aVar.d(this.f12894b, 0, -this.f12895c, 0.0f);
        return Unit.f71690a;
    }
}
