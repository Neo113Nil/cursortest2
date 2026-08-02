package Ve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class Rm extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4318i4 f29868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rm(C4318i4 c4318i4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29868d = c4318i4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Rm(this.f29868d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Rm(this.f29868d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo2;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList2;
        Object obj2;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo3;
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C4318i4 c4318i4 = this.f29868d;
        boolean z11 = c4318i4.f31248k;
        Ib ib2 = c4318i4.f31242e;
        Ae.M0 m02 = c4318i4.f31250m;
        if (z11) {
            ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) m02.getValue();
            if (listOfCardsResponseBody != null && (paymentToolInfo3 = listOfCardsResponseBody.getPaymentToolInfo()) != null && (toolList3 = paymentToolInfo3.getToolList()) != null) {
                incomeSelectedCard = toolList3.get(0);
            }
            incomeSelectedCard = null;
        } else {
            incomeSelectedCard = ((C4673ud) ib2).a().f29005b;
            if (incomeSelectedCard == null) {
                ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) m02.getValue();
                if (listOfCardsResponseBody2 == null || (paymentToolInfo2 = listOfCardsResponseBody2.getPaymentToolInfo()) == null || (toolList2 = paymentToolInfo2.getToolList()) == null) {
                    incomeSelectedCard = null;
                } else {
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
                    incomeSelectedCard = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj2;
                }
                if (incomeSelectedCard == null) {
                    ListOfCardsResponseBody listOfCardsResponseBody3 = (ListOfCardsResponseBody) m02.getValue();
                    if (listOfCardsResponseBody3 != null && (paymentToolInfo = listOfCardsResponseBody3.getPaymentToolInfo()) != null && (toolList = paymentToolInfo.getToolList()) != null) {
                        incomeSelectedCard = toolList.get(0);
                    }
                    incomeSelectedCard = null;
                }
            }
        }
        if (incomeSelectedCard != null) {
            C4673ud c4673ud = (C4673ud) ib2;
            c4673ud.getClass();
            Intrinsics.checkNotNullParameter(incomeSelectedCard, "incomeSelectedCard");
            Ae.x0 x0Var = c4673ud.f32204a;
            x0Var.setValue(Fh.a((Fh) x0Var.getValue(), null, incomeSelectedCard, false, 5));
        }
        List<C4671ub> a11 = c4318i4.f31245h.a();
        Ae.x0 x0Var2 = c4318i4.f31239C;
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        for (C4671ub c4671ub : a11) {
            arrayList.add(new Zb(c4671ub.f32201a, c4671ub.f32202b));
        }
        x0Var2.setValue(C7714v.Y0(arrayList));
        return incomeSelectedCard;
    }
}
