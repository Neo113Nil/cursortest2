package E0;

import E0.c1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class d1 extends AbstractC7737t implements Function0<c1.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c1 f7184b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2950u0 f7185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d1(c1 c1Var, C2950u0 c2950u0) {
        super(0);
        this.f7184b = c1Var;
        this.f7185c = c2950u0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final c1.b invoke() {
        c1.a aVar;
        D0.e eVar;
        aVar = c1.f7170e;
        c1 c1Var = this.f7184b;
        c1Var.getClass();
        eVar = c1Var.f7171a;
        return c1.a.a(aVar, eVar.h(), this.f7185c, c1Var.h());
    }
}
