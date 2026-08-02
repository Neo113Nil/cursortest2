package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* loaded from: classes10.dex */
public final class Hj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29163d;

    public Hj() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Hj hj2 = new Hj(2, dVar);
        hj2.f29163d = obj;
        return hj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Hj hj2 = new Hj(2, (kotlin.coroutines.d) obj2);
        hj2.f29163d = (OrderScreenDataResponse) obj;
        return hj2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f29163d;
        if (orderScreenDataResponse != null) {
            return orderScreenDataResponse.getPaymentPlanBnplResponseBody();
        }
        return null;
    }
}
