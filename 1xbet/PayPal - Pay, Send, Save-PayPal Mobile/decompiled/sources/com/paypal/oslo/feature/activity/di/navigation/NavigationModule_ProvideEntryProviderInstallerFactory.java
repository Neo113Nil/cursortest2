package com.paypal.oslo.feature.activity.di.navigation;

/* loaded from: classes10.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller();
    }

    public static com.paypal.oslo.feature.activity.di.navigation.NavigationModule_ProvideEntryProviderInstallerFactory create() {
        return com.paypal.oslo.feature.activity.di.navigation.NavigationModule_ProvideEntryProviderInstallerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.activity.di.navigation.NavigationModule.INSTANCE.provideEntryProviderInstaller());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.activity.di.navigation.NavigationModule_ProvideEntryProviderInstallerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.activity.di.navigation.NavigationModule_ProvideEntryProviderInstallerFactory();

        private InstanceHolder() {
        }
    }
}
