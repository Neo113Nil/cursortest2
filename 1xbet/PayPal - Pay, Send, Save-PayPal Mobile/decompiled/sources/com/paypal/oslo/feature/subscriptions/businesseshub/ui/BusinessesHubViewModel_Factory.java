package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

/* loaded from: classes15.dex */
public final class BusinessesHubViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> getHighSpeedVideoSizes;

    private BusinessesHubViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel newInstance(com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase getLinkedBusinessesUseCase, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel(getLinkedBusinessesUseCase, formatHelper, bulkUpdateFiNavigationCache);
    }
}
