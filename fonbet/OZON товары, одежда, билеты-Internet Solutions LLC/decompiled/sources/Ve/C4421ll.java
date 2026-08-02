package Ve;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.ll, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4421ll extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Nl f31535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4421ll(Nl nl, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31535d = nl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4421ll(this.f31535d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4421ll(this.f31535d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        Long l11;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object obj2;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2;
        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData3;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Nl nl = this.f31535d;
        ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) ((C4654tn) nl.f29564a).f32149r.getValue();
        Long l12 = null;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3 = (listOfCardsResponseBody2 == null || (paymentToolInfo3 = listOfCardsResponseBody2.getPaymentToolInfo()) == null) ? null : paymentToolInfo3.getToolList();
        boolean z11 = false;
        if (toolList3 != null && !toolList3.isEmpty()) {
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = ((C4673ud) nl.f29565b).a().f29005b;
            Long valueOf = (tool2 == null || (amountData3 = tool2.getAmountData()) == null) ? null : Long.valueOf(amountData3.getAmount());
            Vm vm = nl.f29564a;
            if (valueOf == null) {
                C4654tn c4654tn = (C4654tn) vm;
                ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) c4654tn.f32149r.getValue();
                if (listOfCardsResponseBody3 != null && (paymentToolInfo2 = listOfCardsResponseBody3.getPaymentToolInfo()) != null && (toolList2 = paymentToolInfo2.getToolList()) != null) {
                    Iterator<T> it = toolList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getPriorityCard()) {
                            break;
                        }
                    }
                    ListOfCardsResponseBody.PaymentToolInfo.Tool tool3 = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2;
                    if (tool3 != null && (amountData2 = tool3.getAmountData()) != null) {
                        l11 = Long.valueOf(amountData2.getAmount());
                        if (l11 == null) {
                            valueOf = l11;
                        } else {
                            ListOfCardsResponseBody listOfCardsResponseBody4 = (ListOfCardsResponseBody) c4654tn.f32149r.getValue();
                            Long valueOf2 = (listOfCardsResponseBody4 == null || (paymentToolInfo = listOfCardsResponseBody4.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null || (tool = toolList.get(0)) == null || (amountData = tool.getAmountData()) == null) ? null : Long.valueOf(amountData.getAmount());
                            longValue = valueOf2 != null ? valueOf2.longValue() : 0L;
                            listOfCardsResponseBody = (ListOfCardsResponseBody) ((C4654tn) vm).f32149r.getValue();
                            if (listOfCardsResponseBody != null && (orderInfo = listOfCardsResponseBody.getOrderInfo()) != null && (orderAmount = orderInfo.getOrderAmount()) != null) {
                                l12 = Long.valueOf(orderAmount.getAmount());
                            }
                            if (longValue <= (l12 != null ? l12.longValue() : 0L)) {
                                SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) nl.f29566c).f32350a;
                                if (sPaySdkInitConfig == null) {
                                    throw C4549q4.f31841a;
                                }
                                if (!sPaySdkInitConfig.getHelperConfig().isHelperEnabled()) {
                                    z11 = true;
                                }
                            }
                        }
                    }
                }
                l11 = null;
                if (l11 == null) {
                }
            }
            longValue = valueOf.longValue();
            listOfCardsResponseBody = (ListOfCardsResponseBody) ((C4654tn) vm).f32149r.getValue();
            if (listOfCardsResponseBody != null) {
                l12 = Long.valueOf(orderAmount.getAmount());
            }
            if (longValue <= (l12 != null ? l12.longValue() : 0L)) {
            }
        }
        return Boolean.valueOf(z11);
    }
}
