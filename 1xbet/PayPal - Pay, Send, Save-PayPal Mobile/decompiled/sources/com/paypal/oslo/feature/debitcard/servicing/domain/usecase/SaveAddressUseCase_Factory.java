package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

/* loaded from: classes12.dex */
public final class SaveAddressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository> getHighResolutionOutputSizeshNQ4ISI;

    private SaveAddressUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase newInstance(com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase(addressRepository);
    }
}
