package Ve;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.OrderScreenDataResponse;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class B extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4577r4 f28652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Vm f28653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C4577r4 c4577r4, Vm vm, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28652e = c4577r4;
        this.f28653f = vm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        B b11 = new B(this.f28652e, this.f28653f, dVar);
        b11.f28651d = obj;
        return b11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((Fh) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r3.isEmpty() == false) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ListOfCardsResponseBody listOfCardsResponseBody;
        ListOfCardsResponseBody.PaymentToolInfo paymentToolInfo;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        Fh fh2 = (Fh) this.f28651d;
        if (fh2.f29006c) {
            return Eg.ERROR;
        }
        if (!Intrinsics.d(this.f28652e.i0(), Boolean.FALSE)) {
            return Eg.SUCCESS;
        }
        AbstractC4245fi abstractC4245fi = fh2.f29004a;
        if (!(abstractC4245fi instanceof AbstractC4595rm)) {
            if (abstractC4245fi instanceof C4144c3) {
                OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) ((C4654tn) this.f28653f).f32141j.getValue();
                List<ListOfCardsResponseBody.PaymentToolInfo.Tool> toolList = (orderScreenDataResponse == null || (listOfCardsResponseBody = orderScreenDataResponse.getListOfCardsResponseBody()) == null || (paymentToolInfo = listOfCardsResponseBody.getPaymentToolInfo()) == null) ? null : paymentToolInfo.getToolList();
                if (toolList != null) {
                }
            }
            return Eg.SUCCESS;
        }
        return Eg.ERROR;
    }
}
