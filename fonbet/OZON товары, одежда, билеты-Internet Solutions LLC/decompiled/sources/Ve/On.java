package Ve;

import fd.InterfaceC6512o;
import kotlin.Unit;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* loaded from: classes10.dex */
public final class On extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ SpasiboBonusesResponseBody f29642d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f29643e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f29644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4318i4 f29645g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public On(C4318i4 c4318i4, kotlin.coroutines.d dVar) {
        super(4, dVar);
        this.f29645g = c4318i4;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        On on = new On(this.f29645g, (kotlin.coroutines.d) obj4);
        on.f29642d = (SpasiboBonusesResponseBody) obj;
        on.f29643e = booleanValue;
        on.f29644f = (ListOfCardsResponseBody) obj3;
        return on.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.f29642d;
        boolean z11 = this.f29643e;
        Long l11 = this.f29644f.getOrderInfo().getOrderAmount() != null ? new Long(r1.getAmount()) : null;
        boolean z12 = (l11 != null ? l11.longValue() : 0L) == 0;
        Fi fi2 = new Fi(z12 ? spasiboBonusesResponseBody.getLoyaltyAppInfo().getPointsPaymentAmount() : spasiboBonusesResponseBody.getLoyaltyAppInfo().getMaxPointsAmount(), z11, z12);
        kotlin.reflect.m[] mVarArr = C4318i4.f31236E;
        if (this.f29645g.h0()) {
            return fi2;
        }
        return null;
    }
}
