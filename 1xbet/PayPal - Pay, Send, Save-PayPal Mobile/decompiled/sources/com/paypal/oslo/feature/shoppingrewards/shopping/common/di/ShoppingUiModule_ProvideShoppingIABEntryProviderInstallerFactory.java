package com.paypal.oslo.feature.shoppingrewards.shopping.common.di;

/* loaded from: classes15.dex */
public final class ShoppingUiModule_ProvideShoppingIABEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;

    private ShoppingUiModule_ProvideShoppingIABEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideShoppingIABEntryProviderInstaller(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule_ProvideShoppingIABEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule_ProvideShoppingIABEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideShoppingIABEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingUiModule.INSTANCE.provideShoppingIABEntryProviderInstaller(appNavigator));
    }
}
