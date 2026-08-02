package com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel;

/* loaded from: classes15.dex */
public final class SubscriptionsHubViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase> getHighSpeedVideoFpsRangesFor;

    private SubscriptionsHubViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3) {
        return new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel newInstance(com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase getSubscriptionsUseCase, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache) {
        return new com.paypal.oslo.feature.subscriptions.hub.ui.viewmodel.SubscriptionsHubViewModel(getSubscriptionsUseCase, formatHelper, bulkUpdateFiNavigationCache);
    }
}
