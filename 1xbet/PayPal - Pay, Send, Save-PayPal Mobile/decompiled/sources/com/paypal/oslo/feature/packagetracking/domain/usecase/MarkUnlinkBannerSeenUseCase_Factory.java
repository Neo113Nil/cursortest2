package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class MarkUnlinkBannerSeenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> getHighSpeedVideoSizes;

    private MarkUnlinkBannerSeenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository settingsRepository) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.MarkUnlinkBannerSeenUseCase(settingsRepository);
    }
}
