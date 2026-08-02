package Kc0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.FirstLaunchRepository$resetFirstLaunchPassed$2", f = "FirstLaunchRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f15810d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f15811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f15811e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        i iVar = new i(this.f15811e, dVar);
        iVar.f15810d = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        ((W2.b) this.f15810d).h(l.b(this.f15811e));
        return Unit.f71690a;
    }
}
