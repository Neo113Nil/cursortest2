package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockCardRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser> getHighSpeedVideoFpsRangesFor;

    private MockCardRepository_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser> provider4) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository newInstance(android.content.Context context, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser mockCardJsonParser) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository(context, json, mockFileNameProvider, mockCardJsonParser);
    }
}
