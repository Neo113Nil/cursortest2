package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover;

/* loaded from: classes12.dex */
public final class CreateCryptoRolloverUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository> getHighSpeedVideoSizes;

    private CreateCryptoRolloverUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository cryptoRolloverRepository, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter dateOfBirthFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase(cryptoRolloverRepository, dateOfBirthFormatter);
    }
}
