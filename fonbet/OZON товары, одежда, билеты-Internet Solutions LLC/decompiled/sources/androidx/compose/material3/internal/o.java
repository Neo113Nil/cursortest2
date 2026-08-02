package androidx.compose.material3.internal;

import Q0.InterfaceC3831c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class o extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p<Object> f40282b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p<Object> pVar, Object obj) {
        super(0);
        this.f40282b = pVar;
        this.f40283c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        j jVar;
        p<Object> pVar = this.f40282b;
        jVar = ((p) pVar).f40298o;
        InterfaceC3831c<Object> l11 = pVar.l();
        Object obj = this.f40283c;
        float e11 = l11.e(obj);
        if (!Float.isNaN(e11)) {
            jVar.a(e11, 0.0f);
            p.e(pVar, null);
        }
        pVar.x(obj);
        return Unit.f71690a;
    }
}
