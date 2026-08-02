package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.domain.model.response.OrderScreenDataResponse;

/* loaded from: classes10.dex */
public final class S5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29946d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S5(int i11) {
        super(2, null);
        this.f29946d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29946d) {
            case 0:
                S5 s52 = new S5(2, 0, dVar);
                s52.f29947e = obj;
                return s52;
            default:
                S5 s53 = new S5(2, 1, dVar);
                s53.f29947e = obj;
                return s53;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f29946d) {
            case 0:
                S5 s52 = new S5(2, 0, dVar);
                s52.f29947e = orderScreenDataResponse;
                return s52.invokeSuspend(Unit.f71690a);
            default:
                S5 s53 = new S5(2, 1, dVar);
                s53.f29947e = orderScreenDataResponse;
                return s53.invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29946d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) this.f29947e;
                if (orderScreenDataResponse != null) {
                    return orderScreenDataResponse.getListOfCardsResponseBody();
                }
                return null;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                OrderScreenDataResponse orderScreenDataResponse2 = (OrderScreenDataResponse) this.f29947e;
                if (orderScreenDataResponse2 != null) {
                    return orderScreenDataResponse2.getListOfCardsResponseBody();
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S5(int i11, int i12, kotlin.coroutines.d dVar) {
        super(i11, dVar);
        this.f29946d = i12;
    }
}
