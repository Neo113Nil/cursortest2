package Ve;

import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.fj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4246fj extends kotlin.coroutines.jvm.internal.j implements InterfaceC6512o {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ List f31039d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Fi f31040e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ ListOfCardsResponseBody f31041f;

    public C4246fj() {
        super(4, null);
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C4246fj c4246fj = new C4246fj(4, (kotlin.coroutines.d) obj4);
        c4246fj.f31039d = (List) obj;
        c4246fj.f31040e = (Fi) obj2;
        c4246fj.f31041f = (ListOfCardsResponseBody) obj3;
        return c4246fj.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        ListOfCardsResponseBody.OrderInfo orderInfo2;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        List list = this.f31039d;
        Fi fi2 = this.f31040e;
        ListOfCardsResponseBody listOfCardsResponseBody = this.f31041f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C4789yg) {
                arrayList.add(obj2);
            }
        }
        C4789yg c4789yg = (C4789yg) C7714v.M(arrayList);
        String str = null;
        Long l11 = (listOfCardsResponseBody == null || (orderInfo2 = listOfCardsResponseBody.getOrderInfo()) == null || (orderAmount2 = orderInfo2.getOrderAmount()) == null) ? null : new Long(orderAmount2.getAmount());
        boolean z11 = (l11 != null ? l11.longValue() : 0L) == 0;
        if (fi2 == null || !fi2.f29008b || c4789yg == null || z11) {
            return list;
        }
        long j11 = c4789yg.f32572b;
        long j12 = j11 - (fi2.f29007a * 100);
        long j13 = j12 >= 0 ? j12 : 0L;
        if (listOfCardsResponseBody != null && (orderInfo = listOfCardsResponseBody.getOrderInfo()) != null && (orderAmount = orderInfo.getOrderAmount()) != null) {
            str = orderAmount.getCurrency();
        }
        if (str == null) {
            str = "";
        }
        Pq amount = AbstractC4656tp.b(j13, str);
        Intrinsics.checkNotNullParameter(amount, "amount");
        return C7714v.a0(new C4789yg(amount, j11, c4789yg.f32571a));
    }
}
