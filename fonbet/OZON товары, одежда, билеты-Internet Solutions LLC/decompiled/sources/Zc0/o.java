package Zc0;

import Sc.InterfaceC4008j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsViewModel$clearOtpRequestIsNecessary$1", f = "PageAgreementWithConditionsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f35853d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f35853d = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f35853d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        q qVar = this.f35853d;
        if (!q.e0(qVar).u()) {
            interfaceC4008j = qVar.f35859d;
            ((Sc0.a) interfaceC4008j.getValue()).a();
        }
        return Unit.f71690a;
    }
}
