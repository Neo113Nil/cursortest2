package P20;

import B4.C2584m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2584m f21708b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f21709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(C2584m c2584m, b bVar) {
        super(0);
        this.f21708b = c2584m;
        this.f21709c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2584m.L(this.f21708b, Nk.a.b("resources/", this.f21709c.b()), null, 6);
        return Unit.f71690a;
    }
}
