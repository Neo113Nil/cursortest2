package com.paypal.oslo.feature.balance.data.usecase.autoreload;

/* loaded from: classes11.dex */
public final class UpdateAutoReloadUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> Camera2StreamConfigurationMap;

    private UpdateAutoReloadUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl newInstance(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        return new com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl(autoReloadRepository);
    }
}
