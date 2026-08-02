package A30;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.auth.domain.FintechAuthInteractor$logOut$3", f = "FintechAuthInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f372d = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f372d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        S80.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        bVar = this.f372d.f383f;
        bVar.V0();
        return Unit.f71690a;
    }
}
