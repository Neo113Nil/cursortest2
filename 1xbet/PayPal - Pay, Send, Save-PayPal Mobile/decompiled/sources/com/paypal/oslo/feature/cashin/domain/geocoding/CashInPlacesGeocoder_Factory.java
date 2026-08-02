package com.paypal.oslo.feature.cashin.domain.geocoding;

/* loaded from: classes11.dex */
public final class CashInPlacesGeocoder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder> {
    private final dagger.internal.Provider<com.google.android.libraries.places.api.net.PlacesClient> getHighSpeedVideoSizes;

    private CashInPlacesGeocoder_Factory(dagger.internal.Provider<com.google.android.libraries.places.api.net.PlacesClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder_Factory create(dagger.internal.Provider<com.google.android.libraries.places.api.net.PlacesClient> provider) {
        return new com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder newInstance(com.google.android.libraries.places.api.net.PlacesClient placesClient) {
        return new com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder(placesClient);
    }
}
