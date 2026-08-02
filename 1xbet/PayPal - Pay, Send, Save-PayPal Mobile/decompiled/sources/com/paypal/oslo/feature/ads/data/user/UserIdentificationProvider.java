package com.paypal.oslo.feature.ads.data.user;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/user/UserIdentificationProvider;", "", "", "getPayPalPayerId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserCountry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserIdentificationProvider {
    java.lang.Object getPayPalPayerId(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object getUserCountry(kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}
