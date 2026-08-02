package com.paypal.oslo.feature.identity.passwordrecovery.controller;

/* loaded from: classes12.dex */
public final class PasswordRecoveryFlowCoordinator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> getHighSpeedVideoSizes;

    private PasswordRecoveryFlowCoordinator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider3) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator newInstance(com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase.InitiatePasswordRecoveryUseCase initiatePasswordRecoveryUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager) {
        return new com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator(initiatePasswordRecoveryUseCase, appNavigator, navResultManager);
    }
}
