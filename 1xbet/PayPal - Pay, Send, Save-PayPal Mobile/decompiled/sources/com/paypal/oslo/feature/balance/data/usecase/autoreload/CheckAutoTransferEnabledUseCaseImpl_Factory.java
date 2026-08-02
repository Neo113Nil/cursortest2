package com.paypal.oslo.feature.balance.data.usecase.autoreload;

/* loaded from: classes11.dex */
public final class CheckAutoTransferEnabledUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.usecase.autoreload.CheckAutoTransferEnabledUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> getHighSpeedVideoSizes;

    private CheckAutoTransferEnabledUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.usecase.autoreload.CheckAutoTransferEnabledUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.CheckAutoTransferEnabledUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.CheckAutoTransferEnabledUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.CheckAutoTransferEnabledUseCaseImpl newInstance(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository autoTransferRepository) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.CheckAutoTransferEnabledUseCaseImpl(autoTransferRepository);
    }
}
