package Nh0;

import Sc.s;
import ch.C5832c;
import ch.InterfaceC5830a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.token.repository.PushTokensRepositoryImpl$prepareRequest$3", f = "PushTokensRepository.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Integer>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f19566d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f19567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.d<? super c> dVar2) {
        super(2, dVar2);
        this.f19567e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f19567e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Integer> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC5830a interfaceC5830a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f19566d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        interfaceC5830a = this.f19567e.f19578k;
        this.f19566d = 1;
        Object a11 = C5832c.a(interfaceC5830a, this);
        return a11 == aVar ? aVar : a11;
    }
}
