package com.paypal.oslo.feature.identity.passwordrecovery.ui;

/* loaded from: classes13.dex */
public final class PasswordRecoveryViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> getHighSpeedVideoSizes;

    private PasswordRecoveryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer> provider3) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel newInstance(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.PasswordRecoveryUseCase passwordRecoveryUseCase, com.paypal.oslo.feature.identity.passwordrecovery.ui.mvi.PasswordRecoveryReducer passwordRecoveryReducer) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel(stringProvider, passwordRecoveryUseCase, passwordRecoveryReducer);
    }
}
