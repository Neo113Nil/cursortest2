package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvidesBNPLServicingEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvidesBNPLServicingEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return providesBNPLServicingEntry(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.NavigationModule_ProvidesBNPLServicingEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.bnplservicing.di.NavigationModule_ProvidesBNPLServicingEntryFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providesBNPLServicingEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.NavigationModule.INSTANCE.providesBNPLServicingEntry(appNavigator));
    }
}
