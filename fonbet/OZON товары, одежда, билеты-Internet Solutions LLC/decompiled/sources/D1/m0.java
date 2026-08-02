package D1;

import D1.AbstractC2810k0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class m0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0 f5527b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.c f5528c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0.e f5529d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f5530e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2822w f5531f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f5532g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f5533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m0(AbstractC2810k0 abstractC2810k0, e.c cVar, AbstractC2810k0.e eVar, long j11, C2822w c2822w, boolean z11, boolean z12) {
        super(0);
        this.f5527b = abstractC2810k0;
        this.f5528c = cVar;
        this.f5529d = eVar;
        this.f5530e = j11;
        this.f5531f = c2822w;
        this.f5532g = z11;
        this.f5533h = z12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        e.c a11 = o0.a(this.f5528c, this.f5529d.a());
        long j11 = this.f5530e;
        C2822w c2822w = this.f5531f;
        AbstractC2810k0 abstractC2810k0 = this.f5527b;
        AbstractC2810k0.e eVar = this.f5529d;
        boolean z11 = this.f5532g;
        boolean z12 = this.f5533h;
        if (a11 == null) {
            abstractC2810k0.l2(eVar, j11, c2822w, z11, z12);
        } else {
            abstractC2810k0.getClass();
            c2822w.n(a11, z12, new m0(abstractC2810k0, a11, eVar, j11, c2822w, z11, z12));
        }
        return Unit.f71690a;
    }
}
