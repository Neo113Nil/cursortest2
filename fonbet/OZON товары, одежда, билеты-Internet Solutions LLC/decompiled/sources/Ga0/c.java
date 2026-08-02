package Ga0;

import Sc.s;
import W2.f;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.host.config.debug.menu.data.source.impl.EnvironmentsDataSourceImpl$updateSelectedEnv$2", f = "EnvironmentsDataSourceImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f9893d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f9894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    c(Function1<? super String, String> function1, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f9894e = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        c cVar = new c(this.f9894e, dVar);
        cVar.f9893d = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        f.a aVar;
        f.a aVar2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        W2.b bVar = (W2.b) this.f9893d;
        aVar = d.f9896b;
        String str = (String) this.f9894e.invoke((String) bVar.c(aVar));
        if (str == null) {
            return Unit.f71690a;
        }
        aVar2 = d.f9896b;
        bVar.i(aVar2, str);
        return Unit.f71690a;
    }
}
