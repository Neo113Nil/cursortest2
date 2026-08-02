package com.paypal.oslo.feature.cashin.di;

/* loaded from: classes5.dex */
public final class MapModule_ProvidePlacesClientFactory implements dagger.internal.Factory<com.google.android.libraries.places.api.net.PlacesClient> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    private MapModule_ProvidePlacesClientFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<java.lang.String> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.google.android.libraries.places.api.net.PlacesClient get() {
        return providePlacesClient(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cashin.di.MapModule_ProvidePlacesClientFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<java.lang.String> provider2) {
        return new com.paypal.oslo.feature.cashin.di.MapModule_ProvidePlacesClientFactory(provider, provider2);
    }

    public static com.google.android.libraries.places.api.net.PlacesClient providePlacesClient(android.content.Context context, java.lang.String str) {
        return (com.google.android.libraries.places.api.net.PlacesClient) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cashin.di.MapModule.INSTANCE.providePlacesClient(context, str));
    }
}
