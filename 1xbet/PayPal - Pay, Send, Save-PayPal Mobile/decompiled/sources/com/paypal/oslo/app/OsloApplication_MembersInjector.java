package com.paypal.oslo.app;

/* loaded from: classes4.dex */
public final class OsloApplication_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.app.OsloApplication> {
    private final dagger.internal.Provider<com.paypal.oslo.core.imaging.ImageLoaderFactory> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.session.LogoutObserver>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.app.WorkManagerConfigurationProvider> getHighSpeedVideoFpsRanges;

    private OsloApplication_MembersInjector(dagger.internal.Provider<com.paypal.oslo.core.imaging.ImageLoaderFactory> provider, dagger.internal.Provider<com.paypal.oslo.app.WorkManagerConfigurationProvider> provider2, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.session.LogoutObserver>> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.app.OsloApplication osloApplication) {
        injectImageLoaderFactory(osloApplication, this.Camera2StreamConfigurationMap.get());
        injectWorkManagerConfigurationProvider(osloApplication, this.getHighSpeedVideoFpsRanges.get());
        injectLogoutObservers(osloApplication, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.app.OsloApplication> create(dagger.internal.Provider<com.paypal.oslo.core.imaging.ImageLoaderFactory> provider, dagger.internal.Provider<com.paypal.oslo.app.WorkManagerConfigurationProvider> provider2, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.session.LogoutObserver>> provider3) {
        return new com.paypal.oslo.app.OsloApplication_MembersInjector(provider, provider2, provider3);
    }

    public static void injectImageLoaderFactory(com.paypal.oslo.app.OsloApplication osloApplication, com.paypal.oslo.core.imaging.ImageLoaderFactory imageLoaderFactory) {
        osloApplication.imageLoaderFactory = imageLoaderFactory;
    }

    public static void injectWorkManagerConfigurationProvider(com.paypal.oslo.app.OsloApplication osloApplication, com.paypal.oslo.app.WorkManagerConfigurationProvider workManagerConfigurationProvider) {
        osloApplication.workManagerConfigurationProvider = workManagerConfigurationProvider;
    }

    public static void injectLogoutObservers(com.paypal.oslo.app.OsloApplication osloApplication, java.util.Set<com.paypal.oslo.core.session.LogoutObserver> set) {
        osloApplication.logoutObservers = set;
    }
}
