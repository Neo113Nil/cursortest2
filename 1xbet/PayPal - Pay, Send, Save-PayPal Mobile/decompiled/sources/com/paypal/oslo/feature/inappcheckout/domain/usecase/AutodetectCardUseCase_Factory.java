package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class AutodetectCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.AutodetectCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository> getHighResolutionOutputSizeshNQ4ISI;

    private AutodetectCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.AutodetectCardUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.AutodetectCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.AutodetectCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.AutodetectCardUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository autodetectCardRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.AutodetectCardUseCase(autodetectCardRepository);
    }
}
