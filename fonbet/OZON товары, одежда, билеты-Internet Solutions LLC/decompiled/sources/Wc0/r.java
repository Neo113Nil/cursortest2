package Wc0;

import Xc0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class r extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f33502b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.c f33503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(b bVar, a.c cVar) {
        super(0);
        this.f33502b = bVar;
        this.f33503c = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Xc0.d I11 = this.f33502b.I();
        a.c cVar = this.f33503c;
        I11.a1(cVar.c(), cVar.a());
        return Unit.f71690a;
    }
}
