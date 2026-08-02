package com.paypal.oslo.feature.searchandintelligence.data.model.categorycard;

/* loaded from: classes14.dex */
public final class CategoryCardCarouselDeserializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.CategoryCardCarouselDeserializer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> Camera2StreamConfigurationMap;

    private CategoryCardCarouselDeserializer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.CategoryCardCarouselDeserializer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.CategoryCardCarouselDeserializer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.CategoryCardCarouselDeserializer_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.CategoryCardCarouselDeserializer newInstance(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler deserializerErrorHandler) {
        return new com.paypal.oslo.feature.searchandintelligence.data.model.categorycard.CategoryCardCarouselDeserializer(deserializerErrorHandler);
    }
}
