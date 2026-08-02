package com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase;

/* loaded from: classes13.dex */
public final class StopSmsRetrieverUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository> getHighResolutionOutputSizeshNQ4ISI;

    private StopSmsRetrieverUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase newInstance(com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository smsRetrieverRepository) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase.StopSmsRetrieverUseCase(smsRetrieverRepository);
    }
}
