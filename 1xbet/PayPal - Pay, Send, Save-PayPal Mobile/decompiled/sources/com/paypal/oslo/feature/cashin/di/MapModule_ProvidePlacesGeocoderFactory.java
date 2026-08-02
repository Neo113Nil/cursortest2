package com.paypal.oslo.feature.cashin.di;

/* loaded from: classes5.dex */
public final class MapModule_ProvidePlacesGeocoderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder> {
    private final dagger.internal.Provider<com.google.android.libraries.places.api.net.PlacesClient> getHighSpeedVideoSizes;

    private MapModule_ProvidePlacesGeocoderFactory(dagger.internal.Provider<com.google.android.libraries.places.api.net.PlacesClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder get() {
        return providePlacesGeocoder(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cashin.di.MapModule_ProvidePlacesGeocoderFactory create(dagger.internal.Provider<com.google.android.libraries.places.api.net.PlacesClient> provider) {
        return new com.paypal.oslo.feature.cashin.di.MapModule_ProvidePlacesGeocoderFactory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder providePlacesGeocoder(com.google.android.libraries.places.api.net.PlacesClient placesClient) {
        return (com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cashin.di.MapModule.INSTANCE.providePlacesGeocoder(placesClient));
    }
}
