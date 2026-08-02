package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class X extends AbstractC7737t implements Function1<J0.N<Boolean>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f39968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(float f7) {
        super(1);
        this.f39968b = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(J0.N<Boolean> n11) {
        J0.N<Boolean> n12 = n11;
        n12.a(Boolean.FALSE, 0.0f);
        n12.a(Boolean.TRUE, this.f39968b);
        return Unit.f71690a;
    }
}
