package com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer;

/* loaded from: classes14.dex */
public final class QuickStartPromptDeserializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> getHighSpeedVideoSizes;

    private QuickStartPromptDeserializer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer newInstance(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler deserializerErrorHandler) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer(deserializerErrorHandler);
    }
}
