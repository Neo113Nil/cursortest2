package com.paypal.oslo.feature.paymentauth.api;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/PaymentAuthProvider;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthCapability;", "evaluateAuthCapability", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthRequest;", "authRequest", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthResult;", "initiateAuth", "(Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "challengeData", "", "performAuthChallenge", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentAuthProvider {
    void cleanup();

    java.lang.Object evaluateAuthCapability(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability>> continuation);

    java.lang.Object initiateAuth(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest paymentAuthRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthResult>> continuation);

    java.lang.Object performAuthChallenge(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError, kotlin.Unit>> continuation);
}
