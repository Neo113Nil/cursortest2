package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class GetUnlinkBannerSeenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> getHighSpeedVideoFpsRangesFor;

    private GetUnlinkBannerSeenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository settingsRepository) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GetUnlinkBannerSeenUseCase(settingsRepository);
    }
}
