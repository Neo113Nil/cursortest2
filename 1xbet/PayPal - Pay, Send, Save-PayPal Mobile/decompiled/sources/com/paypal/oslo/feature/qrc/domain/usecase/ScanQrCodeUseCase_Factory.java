package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class ScanQrCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.SessionRepository> getHighSpeedVideoSizes;

    private ScanQrCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.SessionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.SessionRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver> provider2) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase newInstance(com.paypal.oslo.feature.qrc.domain.repository.SessionRepository sessionRepository, com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver qrcSessionResultResolver) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase(sessionRepository, qrcSessionResultResolver);
    }
}
