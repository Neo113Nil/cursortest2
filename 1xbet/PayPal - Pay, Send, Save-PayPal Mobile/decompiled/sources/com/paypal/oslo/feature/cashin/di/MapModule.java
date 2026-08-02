package com.paypal.oslo.feature.cashin.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cashin/di/MapModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/cashin/ui/components/IMapComponent;", "provideMapComponent", "()Lcom/paypal/oslo/feature/cashin/ui/components/IMapComponent;", "Landroid/content/Context;", "context", "", "googleMapsApiKey", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "providePlacesClient", "(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "Lcom/paypal/oslo/feature/cashin/domain/geocoding/CashInPlacesGeocoder;", "providePlacesGeocoder", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)Lcom/paypal/oslo/feature/cashin/domain/geocoding/CashInPlacesGeocoder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class MapModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cashin.di.MapModule INSTANCE = new com.paypal.oslo.feature.cashin.di.MapModule();

    private MapModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.cashin.ui.components.IMapComponent provideMapComponent() {
        return new com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent();
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.google.android.libraries.places.api.net.PlacesClient providePlacesClient(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, java.lang.String googleMapsApiKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMapsApiKey, "");
        if (!com.google.android.libraries.places.api.Places.isInitialized()) {
            com.google.android.libraries.places.api.Places.initialize(context, googleMapsApiKey);
        }
        com.google.android.libraries.places.api.net.PlacesClient createClient = com.google.android.libraries.places.api.Places.createClient(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createClient, "");
        return createClient;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder providePlacesGeocoder(com.google.android.libraries.places.api.net.PlacesClient placesClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placesClient, "");
        return new com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder(placesClient);
    }
}
