package com.paypal.oslo.feature.identity.rememberedlogin.data.repository;

/* loaded from: classes13.dex */
public final class RememberedLoginRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> getHighResolutionOutputSizeshNQ4ISI;

    private RememberedLoginRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl newInstance(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl(rememberedUserStorageWithProfile);
    }
}
