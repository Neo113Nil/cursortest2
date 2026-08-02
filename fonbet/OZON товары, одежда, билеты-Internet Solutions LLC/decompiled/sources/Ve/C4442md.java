package Ve;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Lm0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.BnplMethod;
import spay.sdk.domain.model.OrderScreenOutcome;
import spay.sdk.domain.model.PayStrategy;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import xe.C10720e0;

/* renamed from: Ve.md, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4442md {

    /* renamed from: a, reason: collision with root package name */
    public final Ar f31580a;

    /* renamed from: b, reason: collision with root package name */
    public final O5 f31581b;

    /* renamed from: c, reason: collision with root package name */
    public final J9 f31582c;

    /* renamed from: d, reason: collision with root package name */
    public final Dj f31583d;

    /* renamed from: e, reason: collision with root package name */
    public final Vm f31584e;

    /* renamed from: f, reason: collision with root package name */
    public final Ib f31585f;

    /* renamed from: g, reason: collision with root package name */
    public final H4 f31586g;

    /* renamed from: h, reason: collision with root package name */
    public final T8 f31587h;

    public C4442md(Ar getListOfCardsUseCase, O5 getPaymentAccountsUseCase, J9 getPaymentPlanBnplUseCase, Dj getSbasiboBonusesUseCase, Vm sPayDataContract, Ib sPayStorage, H4 helperManager, T8 sPaySdkMerchantOptionsRepository) {
        Intrinsics.checkNotNullParameter(getListOfCardsUseCase, "getListOfCardsUseCase");
        Intrinsics.checkNotNullParameter(getPaymentAccountsUseCase, "getPaymentAccountsUseCase");
        Intrinsics.checkNotNullParameter(getPaymentPlanBnplUseCase, "getPaymentPlanBnplUseCase");
        Intrinsics.checkNotNullParameter(getSbasiboBonusesUseCase, "getSbasiboBonusesUseCase");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(helperManager, "helperManager");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        this.f31580a = getListOfCardsUseCase;
        this.f31581b = getPaymentAccountsUseCase;
        this.f31582c = getPaymentPlanBnplUseCase;
        this.f31583d = getSbasiboBonusesUseCase;
        this.f31584e = sPayDataContract;
        this.f31585f = sPayStorage;
        this.f31586g = helperManager;
        this.f31587h = sPaySdkMerchantOptionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C4442md c4442md, String str, PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, kotlin.coroutines.jvm.internal.c cVar) {
        C4119b7 c4119b7;
        int i11;
        InterfaceC2395h interfaceC2395h;
        if (cVar instanceof C4119b7) {
            c4119b7 = (C4119b7) cVar;
            int i12 = c4119b7.f30716g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4119b7.f30716g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c4119b7.f30714e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4119b7.f30716g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Object j11 = ((C4654tn) c4442md.f31584e).j();
                    BnplMethod bnplMethod = j11 instanceof BnplMethod ? (BnplMethod) j11 : null;
                    if (!(bnplMethod instanceof BnplMethod.SixPartPayment ? true : bnplMethod instanceof BnplMethod.FourPartPayment)) {
                        return null;
                    }
                    if (paymentBnplPlanRequestBody != null) {
                        C4468na c4468na = new C4468na(str, paymentBnplPlanRequestBody);
                        c4119b7.f30713d = c4442md;
                        c4119b7.f30716g = 1;
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        He.b bVar = He.b.f10879b;
                        obj = C2399j.A(new C4294h9(c4442md.f31582c, c4468na, null));
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    c4442md.getClass();
                    return C2399j.A(new C4779y6(2, null));
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4442md = c4119b7.f30713d;
                Sc.s.b(obj);
                interfaceC2395h = (InterfaceC2395h) obj;
                if (interfaceC2395h != null) {
                    return interfaceC2395h;
                }
                c4442md.getClass();
                return C2399j.A(new C4779y6(2, null));
            }
        }
        c4119b7 = new C4119b7(c4442md, cVar);
        Object obj3 = c4119b7.f30714e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4119b7.f30716g;
        if (i11 != 0) {
        }
        interfaceC2395h = (InterfaceC2395h) obj3;
        if (interfaceC2395h != null) {
        }
        c4442md.getClass();
        return C2399j.A(new C4779y6(2, null));
    }

    public final Fh a(Qd qd2, OrderScreenOutcome orderScreenOutcome, xe.I i11) {
        OrderScreenDataResponse orderScreenDataResponse;
        ArrayList arrayList;
        BnplPayment bnplPayment;
        boolean z11 = orderScreenOutcome.getListCardsOutcome() instanceof C4167cq;
        Vf vf2 = Vf.f30201a;
        Vm vm = this.f31584e;
        Ib ib2 = this.f31585f;
        if (z11 && (orderScreenOutcome.getSpasiboOutcome() instanceof C4703ve)) {
            OrderScreenDataResponse orderScreenDataResponse2 = new OrderScreenDataResponse(((C4167cq) orderScreenOutcome.getListCardsOutcome()).f30834a, null, ((C4703ve) orderScreenOutcome.getSpasiboOutcome()).f32277a, false, 8, null);
            d((C4167cq) orderScreenOutcome.getListCardsOutcome());
            ((C4654tn) vm).f(orderScreenDataResponse2);
            return Fh.a(((C4673ud) ib2).a(), new C4144c3(vf2, null, false, 6), null, false, 6);
        }
        if (!(orderScreenOutcome.getListCardsOutcome() instanceof C4167cq) || !(orderScreenOutcome.getBnplOutcome() instanceof Gi)) {
            if (orderScreenOutcome.isLoading()) {
                return Fh.a(((C4673ud) ib2).a(), orderScreenOutcome.getListCardsOutcome(), null, false, 6);
            }
            if (orderScreenOutcome.isNetworkError()) {
                return Fh.a(((C4673ud) ib2).a(), new Jr(new C4350j8(this, qd2, i11, null)), null, true, 2);
            }
            if (!(orderScreenOutcome.getListCardsOutcome() instanceof C4167cq)) {
                return Fh.a(((C4673ud) ib2).a(), orderScreenOutcome.getListCardsOutcome(), null, true, 2);
            }
            a.b bVar = Lm0.a.f17149a;
            bVar.b("UNKNOWN BNPL ERROR");
            bVar.e(String.valueOf(orderScreenOutcome.getBnplOutcome()), new Object[0]);
            C4654tn c4654tn = (C4654tn) vm;
            PayStrategy j11 = c4654tn.j();
            PayStrategy.PayWithPartsOnly payWithPartsOnly = PayStrategy.PayWithPartsOnly.INSTANCE;
            if (Intrinsics.d(j11, payWithPartsOnly)) {
                return Fh.a(((C4673ud) ib2).a(), C4254fr.f31063a, null, true, 2);
            }
            d((C4167cq) orderScreenOutcome.getListCardsOutcome());
            c4654tn.f(new OrderScreenDataResponse(((C4167cq) orderScreenOutcome.getListCardsOutcome()).f30834a, null, null, false, 8, null));
            return Fh.a(((C4673ud) ib2).a(), Intrinsics.d(c4654tn.j(), payWithPartsOnly) ? C4775y2.f32532a : new C4144c3(vf2, null, false, 6), null, false, 6);
        }
        if (((Gi) orderScreenOutcome.getBnplOutcome()).f29079a.isBnplEnabled()) {
            List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = ((C4167cq) orderScreenOutcome.getListCardsOutcome()).f30834a.getPaymentToolInfo().getToolList();
            GraphBnpl graphBnpl = ((Gi) orderScreenOutcome.getBnplOutcome()).f29079a.getGraphBnpl();
            List<BnplPayment> payments = graphBnpl != null ? graphBnpl.getPayments() : null;
            if (toolList != null) {
                arrayList = new ArrayList();
                for (Object obj : toolList) {
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getAmountData();
                    if (amountData != null) {
                        long amount = amountData.getAmount();
                        if (payments != null && (bnplPayment = payments.get(0)) != null && amount >= bnplPayment.getAmount()) {
                            arrayList.add(obj);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || !(!arrayList.isEmpty())) {
                return Fh.a(((C4673ud) ib2).a(), C4630t.f32073a, null, true, 2);
            }
            orderScreenDataResponse = new OrderScreenDataResponse(((C4167cq) orderScreenOutcome.getListCardsOutcome()).f30834a, ((Gi) orderScreenOutcome.getBnplOutcome()).f29079a, null, false, 8, null);
        } else {
            orderScreenDataResponse = new OrderScreenDataResponse(((C4167cq) orderScreenOutcome.getListCardsOutcome()).f30834a, null, null, false, 8, null);
        }
        d((C4167cq) orderScreenOutcome.getListCardsOutcome());
        C4654tn c4654tn2 = (C4654tn) vm;
        c4654tn2.f(orderScreenDataResponse);
        return Fh.a(((C4673ud) ib2).a(), Intrinsics.d(c4654tn2.j(), PayStrategy.PayWithPartsOnly.INSTANCE) ? C4775y2.f32532a : new C4144c3(vf2, null, false, 6), null, false, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
    
        if (r12 != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Qd qd2, xe.I i11, kotlin.coroutines.jvm.internal.c cVar) {
        E7 e72;
        Object obj;
        int i12;
        Qd qd3;
        C4442md c4442md;
        InterfaceC2395h interfaceC2395h;
        Object d11;
        if (cVar instanceof E7) {
            e72 = (E7) cVar;
            int i13 = e72.f28914i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                e72.f28914i = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = e72.f28912g;
                obj = Wc.a.COROUTINE_SUSPENDED;
                i12 = e72.f28914i;
                if (i12 != 0) {
                    Sc.s.b(obj2);
                    int i14 = X5.f30337a[((C4654tn) this.f31584e).j().getToolType().ordinal()];
                    if (i14 == 1) {
                        C4341j c4341j = new C4341j(qd2.f29772d, qd2.f29769a);
                        e72.f28909d = qd2;
                        e72.f28910e = i11;
                        e72.f28911f = this;
                        e72.f28914i = 1;
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        obj2 = C2399j.A(new C4434m5(this.f31581b, c4341j, He.b.f10879b, null));
                        if (obj2 != obj) {
                            qd3 = qd2;
                            c4442md = this;
                            interfaceC2395h = (InterfaceC2395h) obj2;
                        }
                    } else {
                        if (i14 != 2) {
                            throw new Sc.o();
                        }
                        C4341j c4341j2 = new C4341j(qd2.f29772d, qd2.f29769a);
                        e72.f28909d = qd2;
                        e72.f28910e = i11;
                        e72.f28911f = this;
                        e72.f28914i = 2;
                        C10720e0 c10720e02 = C10720e0.f105451a;
                        obj2 = C2399j.A(new Xq(this.f31580a, c4341j2, He.b.f10879b, null));
                        if (obj2 != obj) {
                            qd3 = qd2;
                            c4442md = this;
                            interfaceC2395h = (InterfaceC2395h) obj2;
                        }
                    }
                    return obj;
                }
                if (i12 == 1) {
                    c4442md = e72.f28911f;
                    i11 = e72.f28910e;
                    qd3 = e72.f28909d;
                    Sc.s.b(obj2);
                    interfaceC2395h = (InterfaceC2395h) obj2;
                } else {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                        return Unit.f71690a;
                    }
                    c4442md = e72.f28911f;
                    i11 = e72.f28910e;
                    qd3 = e72.f28909d;
                    Sc.s.b(obj2);
                    interfaceC2395h = (InterfaceC2395h) obj2;
                }
                C4442md c4442md2 = c4442md;
                xe.I i15 = i11;
                InterfaceC2395h interfaceC2395h2 = interfaceC2395h;
                Qd qd4 = qd3;
                e72.f28909d = null;
                e72.f28910e = null;
                e72.f28911f = null;
                e72.f28914i = 3;
                c4442md2.getClass();
                d11 = xe.N.d(new Hc(qd4, c4442md2, interfaceC2395h2, i15, null), e72);
                if (d11 != obj) {
                    d11 = Unit.f71690a;
                }
            }
        }
        e72 = new E7(this, cVar);
        Object obj22 = e72.f28912g;
        obj = Wc.a.COROUTINE_SUSPENDED;
        i12 = e72.f28914i;
        if (i12 != 0) {
        }
        C4442md c4442md22 = c4442md;
        xe.I i152 = i11;
        InterfaceC2395h interfaceC2395h22 = interfaceC2395h;
        Qd qd42 = qd3;
        e72.f28909d = null;
        e72.f28910e = null;
        e72.f28911f = null;
        e72.f28914i = 3;
        c4442md22.getClass();
        d11 = xe.N.d(new Hc(qd42, c4442md22, interfaceC2395h22, i152, null), e72);
        if (d11 != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5, java.lang.Boolean.TRUE) != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(C4167cq c4167cq) {
        List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList;
        Object obj;
        ListOfCardsResponseBody.PaymentToolInfo.Tool tool;
        Boolean bool;
        Boolean bool2;
        Ib ib2 = this.f31585f;
        if (((C4673ud) ib2).a().f29005b != null || (toolList = c4167cq.f30834a.getPaymentToolInfo().getToolList()) == null || toolList.isEmpty()) {
            return;
        }
        ListOfCardsResponseBody.PaymentToolInfo.Tool incomeSelectedCard = ((C4673ud) ib2).a().f29005b;
        if (incomeSelectedCard == null) {
            ListOfCardsResponseBody listOfCardsResponseBody = c4167cq.f30834a;
            Iterator it = listOfCardsResponseBody.getPaymentToolInfo().getToolList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ListOfCardsResponseBody.PaymentToolInfo.Tool) obj).getPriorityCard()) {
                        break;
                    }
                }
            }
            ListOfCardsResponseBody.PaymentToolInfo.Tool tool2 = (ListOfCardsResponseBody.PaymentToolInfo.Tool) obj;
            if (tool2 != null && tool2.getPriorityCard()) {
                ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData = tool2.getAmountData();
                ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount = listOfCardsResponseBody.getOrderInfo().getOrderAmount();
                if (amountData == null || orderAmount == null) {
                    bool2 = null;
                } else {
                    bool2 = Boolean.valueOf(amountData.getAmount() >= ((long) orderAmount.getAmount()));
                }
            }
            tool2 = null;
            if (tool2 == null) {
                Iterator it2 = listOfCardsResponseBody.getPaymentToolInfo().getToolList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        tool = 0;
                        break;
                    }
                    tool = it2.next();
                    ListOfCardsResponseBody.PaymentToolInfo.Tool.AmountData amountData2 = ((ListOfCardsResponseBody.PaymentToolInfo.Tool) tool).getAmountData();
                    ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount2 = listOfCardsResponseBody.getOrderInfo().getOrderAmount();
                    if (amountData2 == null || orderAmount2 == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(amountData2.getAmount() >= ((long) orderAmount2.getAmount()));
                    }
                    if (Intrinsics.d(bool, Boolean.TRUE)) {
                        break;
                    }
                }
                incomeSelectedCard = tool;
                if (incomeSelectedCard == null) {
                    incomeSelectedCard = listOfCardsResponseBody.getPaymentToolInfo().getToolList().get(0);
                }
            } else {
                incomeSelectedCard = tool2;
            }
        }
        C4673ud c4673ud = (C4673ud) ib2;
        c4673ud.getClass();
        Intrinsics.checkNotNullParameter(incomeSelectedCard, "incomeSelectedCard");
        Ae.x0 x0Var = c4673ud.f32204a;
        x0Var.setValue(Fh.a((Fh) x0Var.getValue(), null, incomeSelectedCard, false, 5));
    }
}
