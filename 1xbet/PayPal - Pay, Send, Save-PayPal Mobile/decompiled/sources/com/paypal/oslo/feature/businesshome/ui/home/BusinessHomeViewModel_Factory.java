package com.paypal.oslo.feature.businesshome.ui.home;

/* loaded from: classes11.dex */
public final class BusinessHomeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.api.AccountSnapshotProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase> getHighSpeedVideoSizes;

    private BusinessHomeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.api.AccountSnapshotProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.api.AccountSnapshotProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider4, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager> provider5) {
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel newInstance(com.paypal.oslo.feature.home.api.AccountSnapshotProvider accountSnapshotProvider, com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase dismissEngagementCardUseCase, com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase getBusinessHomeFeedUseCase, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager businessHomeFeatureGatesManager) {
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel(accountSnapshotProvider, dismissEngagementCardUseCase, getBusinessHomeFeedUseCase, userStore, businessHomeFeatureGatesManager);
    }
}
