package Ve;

import fd.InterfaceC6512o;
import kotlin.Unit;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class U3 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f30094d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f30095e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ C4487o0 f30096f;

    public U3() {
        super(4, null);
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj).longValue();
        U3 u32 = new U3(4, (kotlin.coroutines.d) obj4);
        u32.f30094d = longValue;
        u32.f30095e = (ListOfCardsResponseBody) obj2;
        u32.f30096f = (C4487o0) obj3;
        return u32.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        long j11 = this.f30094d;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f30095e;
        C4487o0 c4487o0 = this.f30096f;
        Long l11 = listOfCardsResponseBody.getOrderInfo().getOrderAmount() != null ? new Long(r3.getAmount()) : null;
        boolean z11 = (l11 != null ? l11.longValue() : 0L) == 0;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount = listOfCardsResponseBody.getOrderInfo().getOrderAmount();
        String currency = orderAmount != null ? orderAmount.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        if (c4487o0.f31694b == null || z11) {
            return new C4616se(AbstractC4656tp.b(j11, currency), null);
        }
        long intValue = j11 - (r2.intValue() * 100);
        return new C4616se(AbstractC4656tp.b(intValue >= 0 ? intValue : 0L, currency), AbstractC4656tp.b(j11, currency));
    }
}
