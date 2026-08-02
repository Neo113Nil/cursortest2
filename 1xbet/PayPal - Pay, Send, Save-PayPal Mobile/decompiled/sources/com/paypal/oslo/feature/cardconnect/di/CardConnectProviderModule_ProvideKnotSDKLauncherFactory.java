package com.paypal.oslo.feature.cardconnect.di;

/* loaded from: classes5.dex */
public final class CardConnectProviderModule_ProvideKnotSDKLauncherFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher get() {
        return provideKnotSDKLauncher();
    }

    public static com.paypal.oslo.feature.cardconnect.di.CardConnectProviderModule_ProvideKnotSDKLauncherFactory create() {
        return com.paypal.oslo.feature.cardconnect.di.CardConnectProviderModule_ProvideKnotSDKLauncherFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher provideKnotSDKLauncher() {
        return (com.paypal.oslo.feature.cardconnect.sdk.KnotSDKLauncher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cardconnect.di.CardConnectProviderModule.INSTANCE.provideKnotSDKLauncher());
    }

    /* loaded from: classes11.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cardconnect.di.CardConnectProviderModule_ProvideKnotSDKLauncherFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.cardconnect.di.CardConnectProviderModule_ProvideKnotSDKLauncherFactory();

        private InstanceHolder() {
        }
    }
}
