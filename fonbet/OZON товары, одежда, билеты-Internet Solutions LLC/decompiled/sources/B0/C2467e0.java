package B0;

import B0.O0;
import Q1.C3843l;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2467e0 extends AbstractC7737t implements Function1<C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O0 f1702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j1.r f1703c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f1704d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f1705e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ I0.W0 f1706f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Q1.D f1707g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2467e0(O0 o02, j1.r rVar, boolean z11, boolean z12, I0.W0 w02, Q1.D d11) {
        super(1);
        this.f1702b = o02;
        this.f1703c = rVar;
        this.f1704d = z11;
        this.f1705e = z12;
        this.f1706f = w02;
        this.f1707g = d11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7459e c7459e) {
        androidx.compose.ui.platform.P1 h11;
        long n11 = c7459e.n();
        O0 o02 = this.f1702b;
        if (!o02.e()) {
            this.f1703c.d();
        } else if (!this.f1704d && (h11 = o02.h()) != null) {
            h11.show();
        }
        if (o02.e() && this.f1705e) {
            if (o02.d() != EnumC2529z0.Selection) {
                R1 j11 = o02.j();
                if (j11 != null) {
                    C3843l n12 = o02.n();
                    Function1<Q1.K, Unit> m11 = o02.m();
                    int transformedToOriginal = this.f1707g.transformedToOriginal(j11.d(n11, true));
                    ((O0.b) m11).invoke(Q1.K.a(n12.c(), null, K1.S.a(transformedToOriginal, transformedToOriginal), 5));
                    if (o02.v().j().length() > 0) {
                        o02.A(EnumC2529z0.Cursor);
                    }
                }
            } else {
                this.f1706f.s(C7459e.a(n11));
            }
        }
        return Unit.f71690a;
    }
}
