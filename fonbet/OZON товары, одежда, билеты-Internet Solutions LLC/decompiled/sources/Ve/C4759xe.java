package Ve;

import Ae.C2399j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import xe.C10720e0;

/* renamed from: Ve.xe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4759xe extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4744x f32486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4759xe(C4744x c4744x, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32486e = c4744x;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4759xe(this.f32486e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4759xe(this.f32486e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32485d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4744x c4744x = this.f32486e;
            if (!(((C4654tn) c4744x.f32413b).j() instanceof PayStrategy.PayWithBinding)) {
                this.f32485d = 1;
                MerchantData m02 = c4744x.m0();
                Ae.x0 x0Var = c4744x.f32402G;
                ListOfCardsRequestBody listOfCardsRequestBody = new ListOfCardsRequestBody(((SessionIdResponseBody) C2399j.b(x0Var).getValue()).getSessionId(), m02.getMerchantLogin(), Boolean.FALSE, m02.getOrderId());
                PaymentBnplPlanRequestBody paymentBnplPlanRequestBody = new PaymentBnplPlanRequestBody(((SessionIdResponseBody) C2399j.b(x0Var).getValue()).getSessionId(), m02.getMerchantLogin(), m02.getOrderId());
                EnumC4290h5 enumC4290h5 = EnumC4290h5.BNPL;
                Z8 z82 = Z8.f30577a;
                C4248fl c4248fl = c4744x.f32422k;
                if (!Lf.a.r0(c4248fl, enumC4290h5, z82)) {
                    paymentBnplPlanRequestBody = null;
                }
                Qd qd2 = new Qd(listOfCardsRequestBody, paymentBnplPlanRequestBody, Lf.a.u0(c4248fl, Qk.f29796d) ? new SpasiboBonusesRequestBody(((SessionIdResponseBody) C2399j.b(x0Var).getValue()).getSessionId()) : null, m02.getAuthorization());
                C10720e0 c10720e0 = C10720e0.f105451a;
                Object c11 = c4744x.f32421j.c(qd2, He.b.f10879b, this);
                if (c11 != aVar) {
                    c11 = Unit.f71690a;
                }
                if (c11 == aVar) {
                    return aVar;
                }
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
