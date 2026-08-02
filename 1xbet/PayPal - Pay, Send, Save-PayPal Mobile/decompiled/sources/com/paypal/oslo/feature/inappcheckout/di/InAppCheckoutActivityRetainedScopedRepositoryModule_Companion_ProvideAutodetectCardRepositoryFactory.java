package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideAutodetectCardRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl> Camera2StreamConfigurationMap;

    private InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideAutodetectCardRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository get() {
        return provideAutodetectCardRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideAutodetectCardRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideAutodetectCardRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository provideAutodetectCardRepository(com.paypal.oslo.feature.inappcheckout.data.repository.AutodetectCardRepositoryImpl autodetectCardRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.AutodetectCardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.provideAutodetectCardRepository(autodetectCardRepositoryImpl));
    }
}
