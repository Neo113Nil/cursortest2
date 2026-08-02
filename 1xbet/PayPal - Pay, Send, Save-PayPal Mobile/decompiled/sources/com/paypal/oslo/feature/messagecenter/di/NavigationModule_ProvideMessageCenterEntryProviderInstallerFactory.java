package com.paypal.oslo.feature.messagecenter.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvideMessageCenterEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideMessageCenterEntryProviderInstaller();
    }

    public static com.paypal.oslo.feature.messagecenter.di.NavigationModule_ProvideMessageCenterEntryProviderInstallerFactory create() {
        return com.paypal.oslo.feature.messagecenter.di.NavigationModule_ProvideMessageCenterEntryProviderInstallerFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideMessageCenterEntryProviderInstaller() {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.messagecenter.di.NavigationModule.INSTANCE.provideMessageCenterEntryProviderInstaller());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.messagecenter.di.NavigationModule_ProvideMessageCenterEntryProviderInstallerFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.messagecenter.di.NavigationModule_ProvideMessageCenterEntryProviderInstallerFactory();

        private InstanceHolder() {
        }
    }
}
