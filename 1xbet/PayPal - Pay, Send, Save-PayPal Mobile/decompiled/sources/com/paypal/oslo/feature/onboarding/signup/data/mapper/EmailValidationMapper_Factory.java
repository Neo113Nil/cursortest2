package com.paypal.oslo.feature.onboarding.signup.data.mapper;

/* loaded from: classes13.dex */
public final class EmailValidationMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> getHighResolutionOutputSizeshNQ4ISI;

    private EmailValidationMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper newInstance(com.paypal.oslo.feature.onboarding.errorstruct.domain.mapper.ErrorMapper errorMapper) {
        return new com.paypal.oslo.feature.onboarding.signup.data.mapper.EmailValidationMapper(errorMapper);
    }
}
