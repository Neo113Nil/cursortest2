package com.paypal.oslo.core.captcha.di;

/* loaded from: classes10.dex */
public final class CaptchaNavigationModule_ProvideCaptchaEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private CaptchaNavigationModule_ProvideCaptchaEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideCaptchaEntryProviderInstaller(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.captcha.di.CaptchaNavigationModule_ProvideCaptchaEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.core.captcha.di.CaptchaNavigationModule_ProvideCaptchaEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideCaptchaEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.captcha.di.CaptchaNavigationModule.INSTANCE.provideCaptchaEntryProviderInstaller(appNavigator));
    }
}
