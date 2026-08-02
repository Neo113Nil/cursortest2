package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class RefreshUserStoreUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository> Camera2StreamConfigurationMap;

    private RefreshUserStoreUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository> provider) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository linkAccountRepository) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase(linkAccountRepository);
    }
}
