package com.paypal.oslo.feature.home.domain.usecase;

/* loaded from: classes12.dex */
public final class GetAccountSnapshotSectionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> getHighSpeedVideoSizes;

    private GetAccountSnapshotSectionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider2) {
        return new com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase newInstance(com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository homeFeedRepository, com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase(homeFeedRepository, stringProvider);
    }
}
