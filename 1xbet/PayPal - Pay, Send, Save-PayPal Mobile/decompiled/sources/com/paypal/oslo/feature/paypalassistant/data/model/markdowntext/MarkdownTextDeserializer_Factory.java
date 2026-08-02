package com.paypal.oslo.feature.paypalassistant.data.model.markdowntext;

/* loaded from: classes13.dex */
public final class MarkdownTextDeserializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> getHighSpeedVideoFpsRanges;

    private MarkdownTextDeserializer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler> provider) {
        return new com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer_Factory(provider);
    }

    public static com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer newInstance(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializerErrorHandler deserializerErrorHandler) {
        return new com.paypal.oslo.feature.paypalassistant.data.model.markdowntext.MarkdownTextDeserializer(deserializerErrorHandler);
    }
}
