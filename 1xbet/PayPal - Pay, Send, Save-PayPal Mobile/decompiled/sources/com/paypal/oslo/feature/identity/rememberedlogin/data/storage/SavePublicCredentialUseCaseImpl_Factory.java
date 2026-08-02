package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

/* loaded from: classes13.dex */
public final class SavePublicCredentialUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.SavePublicCredentialUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> getHighSpeedVideoFpsRanges;

    private SavePublicCredentialUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.data.storage.SavePublicCredentialUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.data.storage.SavePublicCredentialUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> provider) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.SavePublicCredentialUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.data.storage.SavePublicCredentialUseCaseImpl newInstance(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.SavePublicCredentialUseCaseImpl(rememberedUserStorageWithProfile);
    }
}
