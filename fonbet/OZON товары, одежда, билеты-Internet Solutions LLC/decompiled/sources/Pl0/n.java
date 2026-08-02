package Pl0;

import Ol0.r;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$provideRegisterPushTokenDataSource$1", f = "RepositoryModule.kt", l = {295}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class n extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Rl0.b>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f22699d;

    public n() {
        super(1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new n(1, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Rl0.b> dVar) {
        return new n(1, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f22699d;
        if (i11 == 0) {
            s.b(obj);
            Yl0.e a11 = q.a();
            this.f22699d = 1;
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
        Rl0.a aVar2 = (Rl0.a) obj;
        Intrinsics.checkNotNullParameter(aVar2, "<this>");
        return new Rl0.b(aVar2.f25162a, aVar2.f25163b);
    }
}
