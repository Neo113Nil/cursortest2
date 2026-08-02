package Lc0;

import Ib0.c;
import Pc0.g;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.AuthFlowViewModel$navigationEvents$2$1", f = "AuthFlowViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<g, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f16728d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Ib0.c f16729e;

    public static final class a extends c.a.AbstractC0238a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Ib0.c cVar, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f16729e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(this.f16729e, dVar);
        bVar.f16728d = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(g gVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(gVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        g gVar = (g) this.f16728d;
        if (gVar instanceof g.d) {
            Fb0.d.a(((g.d) gVar).a(), Gb0.d.LOGIN, false);
        } else {
            boolean z11 = gVar instanceof g.e;
            Ib0.c cVar = this.f16729e;
            if (z11) {
                if (cVar != null) {
                    cVar.onOtpFlowResult(((g.e) gVar).a());
                }
            } else if ((gVar instanceof g.c) && cVar != null) {
                cVar.onOtpFlowResult(new a());
            }
        }
        return Unit.f71690a;
    }
}
