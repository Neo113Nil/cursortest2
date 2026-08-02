package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.R;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* loaded from: classes10.dex */
public final class X8 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H4 f30342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8(H4 h42, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30342e = h42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        X8 x82 = new X8(this.f30342e, dVar);
        x82.f30341d = obj;
        return x82;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        X8 x82 = new X8(this.f30342e, (kotlin.coroutines.d) obj2);
        x82.f30341d = (ListOfCardsResponseBody) obj;
        return x82.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) this.f30341d;
        if (this.f30342e.f()) {
            return E.d(R.string.spay_empty_string);
        }
        ListOfCardsResponseBody.MerchantInfo merchantInfo = listOfCardsResponseBody.getMerchantInfo();
        String merchantName = merchantInfo != null ? merchantInfo.getMerchantName() : null;
        if (merchantName == null) {
            merchantName = "";
        }
        return D40.b.a(merchantName, "text", merchantName);
    }
}
