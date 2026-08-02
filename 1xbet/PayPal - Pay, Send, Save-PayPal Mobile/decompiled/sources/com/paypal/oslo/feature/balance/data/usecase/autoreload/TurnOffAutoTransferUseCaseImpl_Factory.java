package com.paypal.oslo.feature.balance.data.usecase.autoreload;

/* loaded from: classes11.dex */
public final class TurnOffAutoTransferUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffAutoTransferUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> getHighResolutionOutputSizeshNQ4ISI;

    private TurnOffAutoTransferUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffAutoTransferUseCaseImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffAutoTransferUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffAutoTransferUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffAutoTransferUseCaseImpl newInstance(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository autoTransferRepository) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffAutoTransferUseCaseImpl(autoTransferRepository);
    }
}
