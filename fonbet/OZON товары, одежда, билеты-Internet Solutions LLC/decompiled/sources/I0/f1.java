package I0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f1 extends AbstractC7737t implements Function1<Z1.j, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z1.d f11514b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.q> f11515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f1(Z1.d dVar, InterfaceC3978p0<Z1.q> interfaceC3978p0) {
        super(1);
        this.f11514b = dVar;
        this.f11515c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Z1.j jVar) {
        long d11 = jVar.d();
        float c11 = Z1.j.c(d11);
        Z1.d dVar = this.f11514b;
        this.f11515c.setValue(Z1.q.a(Z1.r.a(dVar.Y0(c11), dVar.Y0(Z1.j.b(d11)))));
        return Unit.f71690a;
    }
}
