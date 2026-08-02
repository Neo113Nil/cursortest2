package Kc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.s;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.InterfaceC10750u;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.instantAuth.data.FirstLaunchRepository$initCurrentStateIfNeed$2", f = "FirstLaunchRepository.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f15804d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f15805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(l lVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f15805e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f15805e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        InterfaceC4008j interfaceC4008j;
        InterfaceC10750u interfaceC10750u;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f15804d;
        l lVar = this.f15805e;
        if (i11 == 0) {
            s.b(obj);
            atomicBoolean = lVar.f15822e;
            if (atomicBoolean.compareAndSet(false, true)) {
                interfaceC4008j = lVar.f15818a;
                InterfaceC2395h data = ((InterfaceC3917k) interfaceC4008j.getValue()).getData();
                this.f15804d = 1;
                obj = C2399j.u(data, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = !((W2.f) obj).b(l.b(lVar));
        interfaceC10750u = lVar.f15821d;
        interfaceC10750u.complete(Boolean.valueOf(z11));
        return Unit.f71690a;
    }
}
