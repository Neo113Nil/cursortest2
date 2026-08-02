package com.paypal.oslo.feature.identity.sso.data.repository.checkout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/data/repository/checkout/CheckoutWebSSOIntentStoreImpl;", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;", "<init>", "()V", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "checkoutWebSSOIntent", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "getCheckoutWebSSOIntent", "()Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "setCheckoutWebSSOIntent", "(Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutWebSSOIntentStoreImpl implements com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore {
    public static final int $stable = 8;
    private volatile com.paypal.oslo.core.identity.domain.model.SessionTransferIntent checkoutWebSSOIntent;

    @javax.inject.Inject
    public CheckoutWebSSOIntentStoreImpl() {
    }

    @Override // com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore
    public final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent getCheckoutWebSSOIntent() {
        return this.checkoutWebSSOIntent;
    }

    @Override // com.paypal.oslo.feature.identity.sso.domain.repository.checkout.CheckoutWebSSOIntentStore
    public final void setCheckoutWebSSOIntent(com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent) {
        this.checkoutWebSSOIntent = sessionTransferIntent;
    }
}
