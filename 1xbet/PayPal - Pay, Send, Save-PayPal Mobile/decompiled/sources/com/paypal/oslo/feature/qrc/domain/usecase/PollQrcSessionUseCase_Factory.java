package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class PollQrcSessionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.SessionRepository> getHighSpeedVideoSizes;

    private PollQrcSessionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.SessionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.SessionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase newInstance(com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository, com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver, com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig qrcSessionPollingConfig, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase(sessionRepository, qrcSessionResultResolver, qrcSessionPollingConfig, coroutineDispatcher);
    }
}
