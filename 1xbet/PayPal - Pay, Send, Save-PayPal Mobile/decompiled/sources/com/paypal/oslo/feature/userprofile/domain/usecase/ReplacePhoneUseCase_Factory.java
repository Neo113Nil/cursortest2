package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class ReplacePhoneUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ReplacePhoneUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase(phoneRepository);
    }
}
