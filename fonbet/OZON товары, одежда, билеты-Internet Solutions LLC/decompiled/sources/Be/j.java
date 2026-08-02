package Be;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3597d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f3598e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k<Object, Object> f3599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k<Object, Object> kVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f3599f = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        j jVar = new j(this.f3599f, dVar);
        jVar.f3598e = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3597d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i<? super Object> interfaceC2397i = (InterfaceC2397i) this.f3598e;
            this.f3597d = 1;
            if (this.f3599f.h(interfaceC2397i, this) == aVar) {
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
