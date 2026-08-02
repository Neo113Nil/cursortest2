package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "", "", "getToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/TokenRefreshState;", "refreshToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AuthToken {
    java.lang.Object getToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object refreshToken(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState> continuation);
}
