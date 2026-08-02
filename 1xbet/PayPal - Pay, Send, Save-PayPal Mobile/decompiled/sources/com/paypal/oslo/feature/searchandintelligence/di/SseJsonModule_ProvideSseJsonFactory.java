package com.paypal.oslo.feature.searchandintelligence.di;

/* loaded from: classes5.dex */
public final class SseJsonModule_ProvideSseJsonFactory implements dagger.internal.Factory<kotlinx.serialization.json.Json> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer> Camera2StreamConfigurationMap;

    private SseJsonModule_ProvideSseJsonFactory(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.serialization.json.Json get() {
        return provideSseJson(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.di.SseJsonModule_ProvideSseJsonFactory create(dagger.internal.Provider<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.di.SseJsonModule_ProvideSseJsonFactory(provider);
    }

    public static kotlinx.serialization.json.Json provideSseJson(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer cloudDisplayComponentDeserializer) {
        return (kotlinx.serialization.json.Json) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.searchandintelligence.di.SseJsonModule.INSTANCE.provideSseJson(cloudDisplayComponentDeserializer));
    }
}
