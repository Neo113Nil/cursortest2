package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockCheckoutUrlRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/repository/CheckoutUrlRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "getCheckoutPreferences", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockCheckoutUrlRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockCheckoutUrlRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.webview.domain.repository.CheckoutUrlRepository
    public final java.lang.Object getCheckoutPreferences(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String value = checkoutToken.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("https://www.te-braintree.qa.paypal.com/checkoutnow?appSwitchEligible=false&token=");
            sb.append(value);
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs("https://gse-appstestbed.com/braintree-payments/cancel", "https://gse-appstestbed.com/braintree-payments/success", sb.toString(), null, 8, null), com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.NativeApp.INSTANCE, new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails("merchant-name", null, null, 2, null));
            defaultRaise.complete();
            return new arrow.core.Either.Right(checkoutPreferences);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
