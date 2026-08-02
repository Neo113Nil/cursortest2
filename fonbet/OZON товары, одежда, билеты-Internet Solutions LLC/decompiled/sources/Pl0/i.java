package Pl0;

import Sc.s;
import bm0.InterfaceC5683a;
import fm0.InterfaceC6586g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.di.RepositoryModule$arbiterRepository$2$1", f = "RepositoryModule.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class i extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f22694d;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new i(1, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return new i(1, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f22694d;
        if (i11 == 0) {
            s.b(obj);
            Za.d logger = q.f22702a;
            h.f22655a.getClass();
            InterfaceC5683a pushTokenRepository = h.c();
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(pushTokenRepository, "pushTokenRepository");
            Yl0.c cVar = new Yl0.c(pushTokenRepository, (InterfaceC6586g) h.f22659e.getValue(), logger);
            this.f22694d = 1;
            if (cVar.a(true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
