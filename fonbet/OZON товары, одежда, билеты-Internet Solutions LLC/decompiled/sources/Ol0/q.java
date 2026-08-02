package Ol0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$createIPCClients$2", f = "IPCClientsDataSource.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class q extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f20511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f20512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, kotlin.coroutines.d<? super q> dVar) {
        super(1, dVar);
        this.f20512e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new q(this.f20512e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return new q(this.f20512e, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20511d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f20511d = 1;
            if (this.f20512e.b(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
