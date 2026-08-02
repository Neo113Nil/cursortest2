package com.paypal.oslo.app.contextheader;

/* loaded from: classes10.dex */
public final class AppContextHeadersProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.contextheader.AppContextHeadersProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private AppContextHeadersProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<android.content.Context> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.contextheader.AppContextHeadersProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.contextheader.AppContextHeadersProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<android.content.Context> provider3) {
        return new com.paypal.oslo.app.contextheader.AppContextHeadersProvider_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.app.contextheader.AppContextHeadersProvider newInstance(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity, com.paypal.oslo.core.userstore.UserStore userStore, android.content.Context context) {
        return new com.paypal.oslo.app.contextheader.AppContextHeadersProvider(appIdentity, userStore, context);
    }
}
