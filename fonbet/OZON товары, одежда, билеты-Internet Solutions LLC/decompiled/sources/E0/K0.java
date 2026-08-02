package E0;

import B0.EnumC2526y0;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class K0 extends AbstractC7737t implements Function1<C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F0 f7046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K0(F0 f02) {
        super(1);
        this.f7046b = f02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7459e c7459e) {
        long n11 = c7459e.n();
        F0 f02 = this.f7046b;
        B1.B e11 = f02.g2().e();
        if (e11 != null && e11.I()) {
            n11 = e11.L(n11);
        }
        int h11 = f02.g2().h(n11, true);
        f02.f2().t(K1.S.a(h11, h11));
        f02.e2().f0(EnumC2526y0.Cursor, n11);
        return Unit.f71690a;
    }
}
