package Ve;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class H8 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2397i f29125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N9 f29126b;

    public H8(InterfaceC2397i interfaceC2397i, N9 n92) {
        this.f29125a = interfaceC2397i;
        this.f29126b = n92;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4206e8 c4206e8;
        int i11;
        ListOfCardsResponseBody.OrderInfo orderInfo;
        ListOfCardsResponseBody.OrderInfo.OrderAmount orderAmount;
        if (dVar instanceof C4206e8) {
            c4206e8 = (C4206e8) dVar;
            int i12 = c4206e8.f30916e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4206e8.f30916e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4206e8.f30915d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4206e8.f30916e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) obj;
                    int i13 = R.string.spay_currency_pattern;
                    String c11 = listOfCardsResponseBody.getOrderInfo().getOrderAmount() != null ? AbstractC4656tp.c(r4.getAmount()) : null;
                    if (c11 == null) {
                        c11 = "";
                    }
                    ListOfCardsResponseBody listOfCardsResponseBody2 = (ListOfCardsResponseBody) this.f29126b.f29536h.getValue();
                    String currency = (listOfCardsResponseBody2 == null || (orderInfo = listOfCardsResponseBody2.getOrderInfo()) == null || (orderAmount = orderInfo.getOrderAmount()) == null) ? null : orderAmount.getCurrency();
                    if (currency == null) {
                        currency = "";
                    }
                    Object[] args = {c11, currency};
                    Intrinsics.checkNotNullParameter(args, "args");
                    Pq pq = new Pq(i13, C7705l.f0(args));
                    ListOfCardsResponseBody.MerchantInfo merchantInfo = listOfCardsResponseBody.getMerchantInfo();
                    String merchantName = merchantInfo != null ? merchantInfo.getMerchantName() : null;
                    String str = merchantName != null ? merchantName : "";
                    Uf uf2 = new Uf(pq, D40.b.a(str, "text", str));
                    c4206e8.f30916e = 1;
                    if (this.f29125a.emit(uf2, c4206e8) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        c4206e8 = new C4206e8(this, dVar);
        Object obj22 = c4206e8.f30915d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4206e8.f30916e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
