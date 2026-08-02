package F0;

import B0.EnumC2526y0;
import I0.C3196m0;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class r extends AbstractC7737t implements Function1<C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8341b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2990k f8342c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f8343d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ EnumC2526y0 f8344e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(EnumC2526y0 enumC2526y0, C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12, boolean z11) {
        super(1);
        this.f8341b = l11;
        this.f8342c = c2990k;
        this.f8343d = z11;
        this.f8344e = enumC2526y0;
        this.f8345f = l12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7459e c7459e) {
        long P11;
        c7459e.getClass();
        boolean z11 = this.f8343d;
        C2990k c2990k = this.f8342c;
        P11 = c2990k.P(z11);
        long a11 = C3196m0.a(P11);
        this.f8341b.f71786a = a11;
        c2990k.f0(this.f8344e, a11);
        this.f8345f.f71786a = 0L;
        c2990k.f8268r = -1;
        return Unit.f71690a;
    }
}
