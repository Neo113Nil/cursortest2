package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase;

/* loaded from: classes13.dex */
public final class VerifyAddressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository> getHighSpeedVideoFpsRanges;

    private VerifyAddressUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository> provider) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase newInstance(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.repository.AddressRepository addressRepository) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase(addressRepository);
    }
}
