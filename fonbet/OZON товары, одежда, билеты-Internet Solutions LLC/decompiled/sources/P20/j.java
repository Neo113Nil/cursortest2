package P20;

import B4.C2584m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2584m f21711b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f21712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(C2584m c2584m, b bVar) {
        super(0);
        this.f21711b = c2584m;
        this.f21712c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2584m.L(this.f21711b, Nk.a.b("resources/", this.f21712c.b()), null, 6);
        return Unit.f71690a;
    }
}
