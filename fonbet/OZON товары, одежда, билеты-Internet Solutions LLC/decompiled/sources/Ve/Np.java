package Ve;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

/* loaded from: classes10.dex */
public final class Np extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Vm f29572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Np(Vm vm, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29572e = vm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Np np = new Np(this.f29572e, dVar);
        np.f29571d = obj;
        return np;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Np np = new Np(this.f29572e, (kotlin.coroutines.d) obj2);
        np.f29571d = (OrderScreenDataResponse) obj;
        return np.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        BnplPayment bnplPayment;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f29571d;
        Long l11 = null;
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = orderScreenDataResponse != null ? orderScreenDataResponse.getPaymentPlanBnplResponseBody() : null;
        if (paymentPlanBnplResponseBody != null && (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) != null && (payments = graphBnpl.getPayments()) != null && (bnplPayment = (BnplPayment) C7714v.M(payments)) != null) {
            l11 = new Long(bnplPayment.getAmount());
        }
        ((C4654tn) this.f29572e).f32145n.setValue(l11);
        return paymentPlanBnplResponseBody;
    }
}
