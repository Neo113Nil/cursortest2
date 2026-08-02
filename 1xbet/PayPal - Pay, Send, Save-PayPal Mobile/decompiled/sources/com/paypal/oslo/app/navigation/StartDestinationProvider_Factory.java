package com.paypal.oslo.app.navigation;

/* loaded from: classes10.dex */
public final class StartDestinationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.navigation.StartDestinationProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.navigation3.runtime.NavKey> getHighSpeedVideoSizes;

    private StartDestinationProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider2, dagger.internal.Provider<androidx.navigation3.runtime.NavKey> provider3, dagger.internal.Provider<java.lang.Boolean> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.navigation.StartDestinationProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get().booleanValue());
    }

    public static com.paypal.oslo.app.navigation.StartDestinationProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppInformation> provider2, dagger.internal.Provider<androidx.navigation3.runtime.NavKey> provider3, dagger.internal.Provider<java.lang.Boolean> provider4) {
        return new com.paypal.oslo.app.navigation.StartDestinationProvider_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.app.navigation.StartDestinationProvider newInstance(com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation, androidx.navigation3.runtime.NavKey navKey, boolean z) {
        return new com.paypal.oslo.app.navigation.StartDestinationProvider(identitySession, appInformation, navKey, z);
    }
}
