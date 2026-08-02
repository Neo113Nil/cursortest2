package Qh0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.updater.PushTokenUpdatersStorage$init$1", f = "PushTokenUpdatersStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j f23443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(j jVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f23443d = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f23443d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        j jVar = this.f23443d;
        m.a(jVar.f23465a, jVar.f23466b, jVar.f23467c);
        return Unit.f71690a;
    }
}
