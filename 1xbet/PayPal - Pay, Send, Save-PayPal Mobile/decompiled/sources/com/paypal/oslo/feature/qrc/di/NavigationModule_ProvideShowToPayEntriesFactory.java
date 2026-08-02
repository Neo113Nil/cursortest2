package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class NavigationModule_ProvideShowToPayEntriesFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> getHighSpeedVideoSizes;

    private NavigationModule_ProvideShowToPayEntriesFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideShowToPayEntries(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.qrc.di.NavigationModule_ProvideShowToPayEntriesFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider2) {
        return new com.paypal.oslo.feature.qrc.di.NavigationModule_ProvideShowToPayEntriesFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideShowToPayEntries(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.NavigationModule.INSTANCE.provideShowToPayEntries(appNavigator, amountScreenComponents));
    }
}
