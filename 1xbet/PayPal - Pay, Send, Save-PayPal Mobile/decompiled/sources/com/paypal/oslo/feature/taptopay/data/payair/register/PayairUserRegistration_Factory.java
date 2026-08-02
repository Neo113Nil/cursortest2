package com.paypal.oslo.feature.taptopay.data.payair.register;

/* loaded from: classes15.dex */
public final class PayairUserRegistration_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.payair.logic.managers.SetupManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private PayairUserRegistration_Factory(dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider2, dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration_Factory create(dagger.internal.Provider<com.payair.logic.managers.SetupManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken> provider2, dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration newInstance(com.payair.logic.managers.SetupManager setupManager, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, com.payair.logic.managers.ConfigurationManager configurationManager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase isApiLevelSupportedUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration(setupManager, authToken, configurationManager, isApiLevelSupportedUseCase, coroutineDispatcher);
    }
}
