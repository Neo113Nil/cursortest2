package org.betup.services.billing;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.injection.provider.BillingClientProvider;
import org.betup.model.remote.api.rest.analytics.GetSignedPendingOfferInteractor;
import org.betup.model.remote.api.rest.analytics.PostFullOfferSignatureInteractor;
import org.betup.model.remote.api.rest.shop.ShopPurchaseInteractor;
import org.betup.model.remote.api.rest.shop.V7MakeSubscriptionPurchaseInteractor;
import org.betup.model.remote.api.rest.user.balance.V7BalanceHistoryInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class BillingService_Factory implements Factory<BillingService> {
    private final Provider<V7BalanceHistoryInteractor> balanceHistoryInteractorProvider;
    private final Provider<BillingClientProvider> billingClientProvider;
    private final Provider<Context> contextProvider;
    private final Provider<GetSignedPendingOfferInteractor> getSignedPendingOfferInteractorProvider;
    private final Provider<PostFullOfferSignatureInteractor> postFullOfferSignatureInteractorProvider;
    private final Provider<ShopPurchaseInteractor> shopPurchaseInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7MakeSubscriptionPurchaseInteractor> v7MakeSubscriptionPurchaseInteractorProvider;

    public BillingService_Factory(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<BillingClientProvider> billingClientProvider, Provider<ShopPurchaseInteractor> shopPurchaseInteractorProvider, Provider<PostFullOfferSignatureInteractor> postFullOfferSignatureInteractorProvider, Provider<V7BalanceHistoryInteractor> balanceHistoryInteractorProvider, Provider<GetSignedPendingOfferInteractor> getSignedPendingOfferInteractorProvider, Provider<V7MakeSubscriptionPurchaseInteractor> v7MakeSubscriptionPurchaseInteractorProvider) {
        this.contextProvider = contextProvider;
        this.userServiceProvider = userServiceProvider;
        this.billingClientProvider = billingClientProvider;
        this.shopPurchaseInteractorProvider = shopPurchaseInteractorProvider;
        this.postFullOfferSignatureInteractorProvider = postFullOfferSignatureInteractorProvider;
        this.balanceHistoryInteractorProvider = balanceHistoryInteractorProvider;
        this.getSignedPendingOfferInteractorProvider = getSignedPendingOfferInteractorProvider;
        this.v7MakeSubscriptionPurchaseInteractorProvider = v7MakeSubscriptionPurchaseInteractorProvider;
    }

    @Override // javax.inject.Provider
    public BillingService get() {
        return new BillingService(this.contextProvider.get(), this.userServiceProvider.get(), this.billingClientProvider.get(), this.shopPurchaseInteractorProvider.get(), this.postFullOfferSignatureInteractorProvider.get(), this.balanceHistoryInteractorProvider.get(), this.getSignedPendingOfferInteractorProvider.get(), this.v7MakeSubscriptionPurchaseInteractorProvider.get());
    }

    public static BillingService_Factory create(Provider<Context> contextProvider, Provider<UserService> userServiceProvider, Provider<BillingClientProvider> billingClientProvider, Provider<ShopPurchaseInteractor> shopPurchaseInteractorProvider, Provider<PostFullOfferSignatureInteractor> postFullOfferSignatureInteractorProvider, Provider<V7BalanceHistoryInteractor> balanceHistoryInteractorProvider, Provider<GetSignedPendingOfferInteractor> getSignedPendingOfferInteractorProvider, Provider<V7MakeSubscriptionPurchaseInteractor> v7MakeSubscriptionPurchaseInteractorProvider) {
        return new BillingService_Factory(contextProvider, userServiceProvider, billingClientProvider, shopPurchaseInteractorProvider, postFullOfferSignatureInteractorProvider, balanceHistoryInteractorProvider, getSignedPendingOfferInteractorProvider, v7MakeSubscriptionPurchaseInteractorProvider);
    }
}
