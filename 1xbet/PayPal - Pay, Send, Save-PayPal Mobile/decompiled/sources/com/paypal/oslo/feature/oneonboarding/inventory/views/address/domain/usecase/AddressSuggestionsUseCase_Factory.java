package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase;

/* loaded from: classes13.dex */
public final class AddressSuggestionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository> getHighSpeedVideoFpsRangesFor;

    private AddressSuggestionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase newInstance(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase(addressRepository);
    }
}
