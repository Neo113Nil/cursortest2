package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class FetchContactUsTopicsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private FetchContactUsTopicsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository> provider) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase newInstance(com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository contactUsRepository) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchContactUsTopicsUseCase(contactUsRepository);
    }
}
