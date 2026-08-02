package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

/* loaded from: classes15.dex */
public final class ActivationCodeRequestHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.payair.logic.managers.TokenManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler> getHighSpeedVideoSizes;

    private ActivationCodeRequestHandler_Factory(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler_Factory create(dagger.internal.Provider<com.payair.logic.managers.TokenManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler newInstance(com.payair.logic.managers.TokenManager tokenManager, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler(tokenManager, activationCodeSubmissionHandler, threeDsAuthenticationHandler, coroutineDispatcher);
    }
}
