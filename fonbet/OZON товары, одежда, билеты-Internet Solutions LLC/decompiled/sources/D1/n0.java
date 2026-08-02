package D1;

import D1.AbstractC2810k0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class n0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0 f5534b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.c f5535c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0.e f5536d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f5537e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2822w f5538f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f5539g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f5540h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f5541i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(AbstractC2810k0 abstractC2810k0, e.c cVar, AbstractC2810k0.e eVar, long j11, C2822w c2822w, boolean z11, boolean z12, float f7) {
        super(0);
        this.f5534b = abstractC2810k0;
        this.f5535c = cVar;
        this.f5536d = eVar;
        this.f5537e = j11;
        this.f5538f = c2822w;
        this.f5539g = z11;
        this.f5540h = z12;
        this.f5541i = f7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        e.c a11 = o0.a(this.f5535c, this.f5536d.a());
        C2822w c2822w = this.f5538f;
        boolean z11 = this.f5539g;
        AbstractC2810k0 abstractC2810k0 = this.f5534b;
        AbstractC2810k0.e eVar = this.f5536d;
        long j11 = this.f5537e;
        boolean z12 = this.f5540h;
        if (a11 == null) {
            abstractC2810k0.l2(eVar, j11, c2822w, z11, z12);
        } else {
            abstractC2810k0.getClass();
            float f7 = this.f5541i;
            c2822w.o(a11, f7, z12, new n0(abstractC2810k0, a11, eVar, j11, c2822w, z11, z12, f7));
        }
        return Unit.f71690a;
    }
}
