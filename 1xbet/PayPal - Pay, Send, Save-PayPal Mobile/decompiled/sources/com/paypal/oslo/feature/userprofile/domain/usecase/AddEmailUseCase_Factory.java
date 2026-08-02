package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class AddEmailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> getHighResolutionOutputSizeshNQ4ISI;

    private AddEmailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.AddEmailUseCase(emailRepository);
    }
}
