package Q90;

import Sc.s;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.settings.domain.FeatureToggles$loadFeatureToggles$3", f = "FeatureToggles.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Map<S90.c, ? extends S90.a>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f23098d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f23099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(c cVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f23099e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f23099e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Map<S90.c, ? extends S90.a>> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23098d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        this.f23098d = 1;
        Serializable j11 = c.j(this.f23099e, this);
        return j11 == aVar ? aVar : j11;
    }
}
