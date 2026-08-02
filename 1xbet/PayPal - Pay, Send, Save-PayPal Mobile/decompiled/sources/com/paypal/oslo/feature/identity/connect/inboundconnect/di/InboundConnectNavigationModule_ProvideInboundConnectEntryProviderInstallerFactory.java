package com.paypal.oslo.feature.identity.connect.inboundconnect.di;

/* loaded from: classes12.dex */
public final class InboundConnectNavigationModule_ProvideInboundConnectEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private InboundConnectNavigationModule_ProvideInboundConnectEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideInboundConnectEntryProviderInstaller(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.connect.inboundconnect.di.InboundConnectNavigationModule_ProvideInboundConnectEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.di.InboundConnectNavigationModule_ProvideInboundConnectEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideInboundConnectEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.connect.inboundconnect.di.InboundConnectNavigationModule.INSTANCE.provideInboundConnectEntryProviderInstaller(appNavigator));
    }
}
