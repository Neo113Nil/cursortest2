package com.paypal.oslo.feature.onboarding.signup.phone.data.repository;

/* loaded from: classes13.dex */
public final class PhoneRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService> getHighSpeedVideoFpsRanges;

    private PhoneRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl newInstance(com.paypal.oslo.feature.onboarding.signup.phone.domain.service.PhoneService phoneService) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.data.repository.PhoneRepositoryImpl(phoneService);
    }
}
