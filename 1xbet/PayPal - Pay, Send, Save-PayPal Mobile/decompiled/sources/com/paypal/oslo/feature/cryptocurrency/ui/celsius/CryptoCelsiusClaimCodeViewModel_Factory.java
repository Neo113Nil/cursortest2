package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

/* loaded from: classes12.dex */
public final class CryptoCelsiusClaimCodeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> getHighSpeedVideoSizes;

    private CryptoCelsiusClaimCodeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase createCryptoRolloverUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.DateOfBirthFormatter dateOfBirthFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel(createCryptoRolloverUseCase, checkCryptoProvisioningUseCase, dateOfBirthFormatter);
    }
}
