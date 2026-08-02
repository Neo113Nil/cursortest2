package com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase;

/* loaded from: classes13.dex */
public final class StartSmsRetrieverUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository> getHighResolutionOutputSizeshNQ4ISI;

    private StartSmsRetrieverUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository smsRetrieverRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StartSmsRetrieverUseCase(smsRetrieverRepository);
    }
}
