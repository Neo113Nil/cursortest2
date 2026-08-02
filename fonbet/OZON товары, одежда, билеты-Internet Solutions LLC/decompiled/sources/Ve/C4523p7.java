package Ve;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import spay.sdk.R;
import spay.sdk.domain.model.response.PaymentPlanBnplResponseBody;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

/* renamed from: Ve.p7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4523p7 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31764d;

    public C4523p7() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        C4523p7 c4523p7 = new C4523p7(2, dVar);
        c4523p7.f31764d = obj;
        return c4523p7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4523p7 c4523p7 = new C4523p7(2, (kotlin.coroutines.d) obj2);
        c4523p7.f31764d = (PaymentPlanBnplResponseBody) obj;
        return c4523p7.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GraphBnpl graphBnpl;
        List<BnplPayment> payments;
        Sr a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) this.f31764d;
        if (paymentPlanBnplResponseBody == null || (graphBnpl = paymentPlanBnplResponseBody.getGraphBnpl()) == null || (payments = graphBnpl.getPayments()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C7714v.z(payments, 10));
        int i11 = 0;
        for (Object obj2 : payments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            BnplPayment bnplPayment = (BnplPayment) obj2;
            if (i11 == 0) {
                a11 = E.d(R.string.spay_bnpl_graph_first_item_write_off);
            } else {
                String date = bnplPayment.getDate();
                a11 = D40.b.a(date, "text", date);
            }
            arrayList.add(new C4287h2(a11, bnplPayment.getAmount(), bnplPayment.getCurrencyCode(), i11 == 0, i11 == paymentPlanBnplResponseBody.getGraphBnpl().getPayments().size() - 1));
            i11 = i12;
        }
        return arrayList;
    }
}
