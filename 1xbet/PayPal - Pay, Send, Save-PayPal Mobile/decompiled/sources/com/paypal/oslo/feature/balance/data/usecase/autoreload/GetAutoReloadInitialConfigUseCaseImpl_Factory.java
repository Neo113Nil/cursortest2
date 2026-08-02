package com.paypal.oslo.feature.balance.data.usecase.autoreload;

/* loaded from: classes11.dex */
public final class GetAutoReloadInitialConfigUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadInitialConfigUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> getHighSpeedVideoSizes;

    private GetAutoReloadInitialConfigUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadInitialConfigUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadInitialConfigUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadInitialConfigUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadInitialConfigUseCaseImpl newInstance(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadInitialConfigUseCaseImpl(autoReloadRepository);
    }
}
