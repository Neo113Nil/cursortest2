package Pl0;

import Ol0.r;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$testPushRepository$2$1", f = "RepositoryModule.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class p extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Ml0.i>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f22701d;

    public p() {
        super(1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new p(1, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Ml0.i> dVar) {
        return new p(1, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f22701d;
        if (i11 == 0) {
            s.b(obj);
            Yl0.e a11 = q.a();
            this.f22701d = 1;
            obj = N.d(new r(a11.f35157a.f19639a, false, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        ((Rl0.a) obj).getClass();
        throw new IllegalArgumentException("TestPushIPCClient must be created at TestMasterHostIPCClientsFactory");
    }
}
