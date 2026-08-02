package com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive;

/* loaded from: classes12.dex */
public final class GenerateReceiveAddressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository> Camera2StreamConfigurationMap;

    private GenerateReceiveAddressUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository cryptoReceiveRepository) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase(cryptoReceiveRepository);
    }
}
