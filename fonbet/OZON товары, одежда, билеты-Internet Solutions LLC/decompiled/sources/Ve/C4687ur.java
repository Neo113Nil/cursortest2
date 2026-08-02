package Ve;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* renamed from: Ve.ur, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4687ur extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D1 f32237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Vm f32238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4687ur(D1 d12, Vm vm, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f32237d = d12;
        this.f32238e = vm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4687ur(this.f32237d, this.f32238e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4687ur(this.f32237d, this.f32238e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object obj2;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo3;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3;
        Object obj3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        D1 d12 = this.f32237d;
        ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard = ((C4673ud) d12.f28800d).a().f29005b;
        if (incomeSelectedCard == null) {
            Ae.M0 m02 = d12.f28808l;
            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) m02.getValue();
            Vm vm = this.f32238e;
            if (listOfCardsResponseBody == null || (paymentToolInfo3 = listOfCardsResponseBody.getPaymentToolInfo()) == null || (toolList3 = paymentToolInfo3.getToolList()) == null) {
                tool = null;
            } else {
                Iterator<T> it = toolList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj3;
                    if (tool2.getPriorityCard()) {
                        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = tool2.getAmountData();
                        Long l11 = amountData != null ? new Long(amountData.getAmount()) : null;
                        if ((l11 != null ? l11.longValue() : 0L) >= ((C4654tn) vm).a()) {
                            break;
                        }
                    }
                }
                tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj3;
            }
            if (tool == null) {
                ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) m02.getValue();
                if (listOfCardsResponseBody2 == null || (paymentToolInfo2 = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList2 = paymentToolInfo2.getToolList()) == null) {
                    tool = null;
                } else {
                    Iterator<T> it2 = toolList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2).getAmountData();
                        Long l12 = amountData2 != null ? new Long(amountData2.getAmount()) : null;
                        if ((l12 != null ? l12.longValue() : 0L) >= ((C4654tn) vm).a()) {
                            break;
                        }
                    }
                    tool = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2;
                }
                if (tool == null) {
                    ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) m02.getValue();
                    incomeSelectedCard = (listOfCardsResponseBody3 == null || (paymentToolInfo = listOfCardsResponseBody3.getPaymentToolInfo()) == null || (toolList = paymentToolInfo.getToolList()) == null) ? null : toolList.get(0);
                }
            }
            incomeSelectedCard = tool;
        }
        if (incomeSelectedCard != null) {
            C4673ud c4673ud = (C4673ud) d12.f28800d;
            c4673ud.getClass();
            Intrinsics.checkNotNullParameter(incomeSelectedCard, "incomeSelectedCard");
            Ae.x0 x0Var = c4673ud.f32204a;
            x0Var.setValue(Fh.a((Fh) x0Var.getValue(), null, incomeSelectedCard, false, 5));
        }
        return incomeSelectedCard;
    }
}
