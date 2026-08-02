package com.paypal.oslo.feature.savings.di.navigation;

/* loaded from: classes14.dex */
public final class InternalNavigationModule_ProvideMoneyManagementNavigationFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private InternalNavigationModule_ProvideMoneyManagementNavigationFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideMoneyManagementNavigation(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideMoneyManagementNavigationFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule_ProvideMoneyManagementNavigationFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideMoneyManagementNavigation(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.savings.di.navigation.InternalNavigationModule.INSTANCE.provideMoneyManagementNavigation(appNavigator));
    }
}
