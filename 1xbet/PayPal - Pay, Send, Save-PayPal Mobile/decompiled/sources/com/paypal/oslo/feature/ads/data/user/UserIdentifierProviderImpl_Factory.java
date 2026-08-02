package com.paypal.oslo.feature.ads.data.user;

/* loaded from: classes11.dex */
public final class UserIdentifierProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    private UserIdentifierProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider> provider, dagger.internal.Provider<java.lang.Boolean> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get().booleanValue());
    }

    public static com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider> provider, dagger.internal.Provider<java.lang.Boolean> provider2) {
        return new com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl newInstance(com.paypal.oslo.feature.ads.data.user.UserIdentificationProvider userIdentificationProvider, boolean z) {
        return new com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl(userIdentificationProvider, z);
    }
}
