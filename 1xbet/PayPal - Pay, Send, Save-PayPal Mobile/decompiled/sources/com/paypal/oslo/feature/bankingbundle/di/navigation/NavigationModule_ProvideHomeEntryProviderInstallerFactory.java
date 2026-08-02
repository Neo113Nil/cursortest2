package com.paypal.oslo.feature.bankingbundle.di.navigation;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideHomeEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideHomeEntryProviderInstaller();
    }

    public static com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideHomeEntryProviderInstallerFactory create() {
        return com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideHomeEntryProviderInstallerFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideHomeEntryProviderInstaller() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.INSTANCE.provideHomeEntryProviderInstaller());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideHomeEntryProviderInstallerFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideHomeEntryProviderInstallerFactory();

        private InstanceHolder() {
        }
    }
}
