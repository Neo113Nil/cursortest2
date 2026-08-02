package com.paypal.oslo.feature.searchandintelligence.domain.model.sse;

/* loaded from: classes14.dex */
public final class CloudDisplayComponentDeserializer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer> {
    private final dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer>> getHighSpeedVideoFpsRangesFor;

    private CloudDisplayComponentDeserializer_Factory(dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer>> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer_Factory create(dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer>> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer newInstance(java.util.Map<java.lang.String, com.paypal.oslo.feature.searchandintelligence.api.deserializer.UiComponentDeserializer> map) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponentDeserializer(map);
    }
}
