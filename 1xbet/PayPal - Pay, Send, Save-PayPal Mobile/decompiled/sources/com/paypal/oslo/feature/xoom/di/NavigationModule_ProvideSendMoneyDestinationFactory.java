package com.paypal.oslo.feature.xoom.di;

/* loaded from: classes16.dex */
public final class NavigationModule_ProvideSendMoneyDestinationFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideSendMoneyDestinationFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideSendMoneyDestination(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.xoom.di.NavigationModule_ProvideSendMoneyDestinationFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.xoom.di.NavigationModule_ProvideSendMoneyDestinationFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSendMoneyDestination(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.xoom.di.NavigationModule.INSTANCE.provideSendMoneyDestination(appNavigator));
    }
}
