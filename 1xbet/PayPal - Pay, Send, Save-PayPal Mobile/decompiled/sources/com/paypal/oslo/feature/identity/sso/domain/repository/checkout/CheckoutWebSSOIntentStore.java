package com.paypal.oslo.feature.identity.sso.domain.repository.checkout;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/domain/repository/checkout/CheckoutWebSSOIntentStore;", "", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "getCheckoutWebSSOIntent", "()Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "setCheckoutWebSSOIntent", "(Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;)V", "checkoutWebSSOIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CheckoutWebSSOIntentStore {
    com.paypal.oslo.core.identity.domain.model.SessionTransferIntent getCheckoutWebSSOIntent();

    void setCheckoutWebSSOIntent(com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent);
}
