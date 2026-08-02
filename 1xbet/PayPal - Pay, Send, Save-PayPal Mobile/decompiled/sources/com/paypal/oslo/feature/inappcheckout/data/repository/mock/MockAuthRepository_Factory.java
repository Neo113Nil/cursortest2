package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockAuthRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> getOutputMinFrameDuration;

    private MockAuthRepository_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.getOutputMinFrameDuration = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider6) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository newInstance(android.content.Context context, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper initializeCheckoutEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository(context, json, fundingSelectionEntityMapper, initializeCheckoutEntityMapper, contingencyMapper, mockFileNameProvider);
    }
}
