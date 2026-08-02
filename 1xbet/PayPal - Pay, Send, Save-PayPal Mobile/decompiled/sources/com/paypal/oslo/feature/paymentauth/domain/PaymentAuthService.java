package com.paypal.oslo.feature.paymentauth.domain;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/domain/PaymentAuthService;", "Lcom/paypal/oslo/feature/paymentauth/api/PaymentAuthProvider;", "<init>", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthCapability;", "evaluateAuthCapability", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthRequest;", "authRequest", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthResult;", "initiateAuth", "(Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "challengeData", "", "performAuthChallenge", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentAuthService implements com.paypal.oslo.feature.paymentauth.api.PaymentAuthProvider {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.paymentauth.api.PaymentAuthProvider
    public final void cleanup() {
    }

    @javax.inject.Inject
    public PaymentAuthService() {
    }

    @Override // com.paypal.oslo.feature.paymentauth.api.PaymentAuthProvider
    public final java.lang.Object evaluateAuthCapability(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.paymentauth.LoggerKt.log, "Getting supported authentication capabilities", null, null, 6, null);
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthCapability(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthMechanism.PAYPAL_3DS), null));
    }

    @Override // com.paypal.oslo.feature.paymentauth.api.PaymentAuthProvider
    public final java.lang.Object initiateAuth(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthRequest paymentAuthRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError, com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthResult>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown("Not implemented"));
    }

    @Override // com.paypal.oslo.feature.paymentauth.api.PaymentAuthProvider
    public final java.lang.Object performAuthChallenge(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError, kotlin.Unit>> continuation) {
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown("Not implemented"));
    }
}
