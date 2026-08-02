package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockCardFormDataRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoSizes;

    private MockCardFormDataRepository_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper> provider5) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository newInstance(android.content.Context context, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser mockCardJsonParser, com.paypal.oslo.feature.inappcheckout.data.mapper.CardFormDataEntityMapper cardFormDataEntityMapper) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository(context, json, mockFileNameProvider, mockCardJsonParser, cardFormDataEntityMapper);
    }
}
