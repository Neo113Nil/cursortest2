package F0;

import B0.EnumC2526y0;
import I0.F;
import K1.Q;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class u extends AbstractC7737t implements Function2<x1.x, C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8352b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2990k f8353c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ EnumC2526y0 f8354d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8355e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f8356f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(EnumC2526y0 enumC2526y0, C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12, boolean z11) {
        super(2);
        this.f8352b = l11;
        this.f8353c = c2990k;
        this.f8354d = enumC2526y0;
        this.f8355e = l12;
        this.f8356f = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(x1.x xVar, C7459e c7459e) {
        int i11;
        int w11;
        long n11 = c7459e.n();
        kotlin.jvm.internal.L l11 = this.f8352b;
        l11.f71786a = C7459e.k(l11.f71786a, n11);
        C2990k c2990k = this.f8353c;
        K1.K f7 = c2990k.f8252b.f();
        if (f7 != null) {
            c2990k.f0(this.f8354d, C7459e.k(this.f8355e.f71786a, l11.f71786a));
            boolean z11 = this.f8356f;
            if (z11) {
                i11 = f7.w(c2990k.O());
            } else {
                long d11 = c2990k.f8251a.j().d();
                int i12 = Q.f15010c;
                i11 = (int) (d11 >> 32);
            }
            int i13 = i11;
            if (z11) {
                long d12 = c2990k.f8251a.j().d();
                int i14 = Q.f15010c;
                w11 = (int) (d12 & 4294967295L);
            } else {
                w11 = f7.w(c2990k.O());
            }
            int i15 = w11;
            long d13 = c2990k.f8251a.j().d();
            long h02 = C2990k.h0(c2990k, c2990k.f8251a.j(), i13, i15, this.f8356f, F.a.c(), 96);
            if (Q.e(d13) || !Q.e(h02)) {
                c2990k.f8251a.t(h02);
            }
        }
        return Unit.f71690a;
    }
}
