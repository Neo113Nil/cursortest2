package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* loaded from: classes10.dex */
public final class M6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29461d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M6(int i11) {
        super(2, null);
        this.f29461d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29461d) {
            case 0:
                M6 m62 = new M6(2, 0, dVar);
                m62.f29462e = obj;
                return m62;
            default:
                M6 m63 = new M6(2, 1, dVar);
                m63.f29462e = obj;
                return m63;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f29461d) {
            case 0:
                M6 m62 = new M6(2, 0, dVar);
                m62.f29462e = orderScreenDataResponse;
                return m62.invokeSuspend(Unit.f71690a);
            default:
                M6 m63 = new M6(2, 1, dVar);
                m63.f29462e = orderScreenDataResponse;
                return m63.invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29461d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f29462e;
                if (orderScreenDataResponse != null) {
                    return orderScreenDataResponse.getPaymentPlanBnplResponseBody();
                }
                return null;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                OrderScreenDataResponse orderScreenDataResponse2 = (OrderScreenDataResponse) this.f29462e;
                if (orderScreenDataResponse2 != null) {
                    return orderScreenDataResponse2.getSpasiboBonusesResponseBody();
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M6(int i11, int i12, kotlin.coroutines.d dVar) {
        super(i11, dVar);
        this.f29461d = i12;
    }
}
