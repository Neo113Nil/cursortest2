package Og0;

import Sc.s;
import W2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.dialog.internal.data.repository.DialogStateRepositoryImpl$changeDisabledState$2", f = "DialogStateRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class b extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f20375d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(2, dVar);
        bVar.f20375d = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        f.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        W2.b bVar = (W2.b) this.f20375d;
        aVar = a.f20372c;
        bVar.i(aVar, Boolean.TRUE);
        return Unit.f71690a;
    }
}
