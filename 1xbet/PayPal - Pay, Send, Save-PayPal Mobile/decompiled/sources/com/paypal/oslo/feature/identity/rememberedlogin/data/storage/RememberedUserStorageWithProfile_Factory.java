package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

/* loaded from: classes13.dex */
public final class RememberedUserStorageWithProfile_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private RememberedUserStorageWithProfile_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider2) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile(userStore, appStorage);
    }
}
