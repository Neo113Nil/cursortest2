package Q90;

import Q90.c;
import Sc.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.domain.FeatureToggles$loadFeatureToggles$2", f = "FeatureToggles.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Map<S90.c, ? extends S90.a>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f23097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(c cVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f23097d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f23097d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Map<S90.c, ? extends S90.a>> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        O30.b bVar;
        Map f7;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        int i11 = c.f23057s;
        bVar = this.f23097d.f23063f;
        f7 = c.a.f(bVar);
        return f7;
    }
}
