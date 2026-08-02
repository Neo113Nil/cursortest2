package Ol0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource$clear$2", f = "ArbiterStoreDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20470d;

    public f() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        f fVar = new f(2, dVar);
        fVar.f20470d = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        f fVar = new f(2, dVar);
        fVar.f20470d = bVar;
        return fVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ((W2.b) this.f20470d).f();
        return Unit.f71690a;
    }
}
