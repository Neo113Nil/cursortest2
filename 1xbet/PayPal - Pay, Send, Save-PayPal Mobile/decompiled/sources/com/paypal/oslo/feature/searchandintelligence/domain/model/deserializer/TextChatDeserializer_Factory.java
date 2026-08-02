package com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer;

/* loaded from: classes14.dex */
public final class TextChatDeserializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> getHighSpeedVideoFpsRangesFor;

    private TextChatDeserializer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer newInstance(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler deserializerErrorHandler) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.TextChatDeserializer(deserializerErrorHandler);
    }
}
