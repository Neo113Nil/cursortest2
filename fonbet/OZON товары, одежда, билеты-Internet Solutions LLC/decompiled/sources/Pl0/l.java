package Pl0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$provideIPCClientsDataSource$1", f = "RepositoryModule.kt", l = {321}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class l extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Za.a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f22697d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new l(1, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Za.a> dVar) {
        return new l(1, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f22697d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        h.f22655a.getClass();
        Nl0.e eVar = (Nl0.e) h.f22661g.getValue();
        this.f22697d = 1;
        Object c11 = eVar.c(this);
        return c11 == aVar ? aVar : c11;
    }
}
