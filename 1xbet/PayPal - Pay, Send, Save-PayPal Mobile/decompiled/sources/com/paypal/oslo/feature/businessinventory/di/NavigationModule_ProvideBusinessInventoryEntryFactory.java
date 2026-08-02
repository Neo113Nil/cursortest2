package com.paypal.oslo.feature.businessinventory.di;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideBusinessInventoryEntryFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private NavigationModule_ProvideBusinessInventoryEntryFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBusinessInventoryEntry(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businessinventory.di.NavigationModule_ProvideBusinessInventoryEntryFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<android.content.Context> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider3) {
        return new com.paypal.oslo.feature.businessinventory.di.NavigationModule_ProvideBusinessInventoryEntryFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBusinessInventoryEntry(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businessinventory.di.NavigationModule.INSTANCE.provideBusinessInventoryEntry(appNavigator, context, businessInventoryFeatureGateManager));
    }
}
