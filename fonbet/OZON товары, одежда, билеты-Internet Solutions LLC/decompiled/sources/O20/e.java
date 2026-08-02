package O20;

import B4.C2584m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2584m f19881b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f19882c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f19883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C2584m c2584m, k kVar, b bVar) {
        super(0);
        this.f19881b = c2584m;
        this.f19882c = kVar;
        this.f19883d = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2584m.L(this.f19881b, Sh.b.c("details/", this.f19882c.d(), "/", this.f19883d.c()), null, 6);
        return Unit.f71690a;
    }
}
