package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideBnplAcquisitionEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getHighSpeedVideoSizes;

    private NavigationModule_ProvideBnplAcquisitionEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBnplAcquisitionEntry(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.NavigationModule_ProvideBnplAcquisitionEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.di.NavigationModule_ProvideBnplAcquisitionEntryFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBnplAcquisitionEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.NavigationModule.INSTANCE.provideBnplAcquisitionEntry(appNavigator, sessionStorage));
    }
}
