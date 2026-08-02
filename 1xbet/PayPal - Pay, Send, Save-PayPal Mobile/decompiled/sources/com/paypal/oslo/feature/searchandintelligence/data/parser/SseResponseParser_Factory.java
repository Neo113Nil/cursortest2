package com.paypal.oslo.feature.searchandintelligence.data.parser;

/* loaded from: classes14.dex */
public final class SseResponseParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser> {
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoFpsRanges;

    private SseResponseParser_Factory(dagger.internal.Provider<kotlinx.serialization.json.Json> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser_Factory create(dagger.internal.Provider<kotlinx.serialization.json.Json> provider) {
        return new com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser_Factory(provider);
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser newInstance(kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.feature.searchandintelligence.data.parser.SseResponseParser(json);
    }
}
