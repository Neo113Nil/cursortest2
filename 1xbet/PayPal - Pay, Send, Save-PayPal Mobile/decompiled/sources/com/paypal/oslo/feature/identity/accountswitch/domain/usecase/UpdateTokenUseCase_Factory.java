package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class UpdateTokenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getHighSpeedVideoSizes;

    private UpdateTokenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase(userStore, identityTokenStorage);
    }
}
