package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class ClearUnlinkBannerSeenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> getHighSpeedVideoFpsRanges;

    private ClearUnlinkBannerSeenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository settingsRepository) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.ClearUnlinkBannerSeenUseCase(settingsRepository);
    }
}
