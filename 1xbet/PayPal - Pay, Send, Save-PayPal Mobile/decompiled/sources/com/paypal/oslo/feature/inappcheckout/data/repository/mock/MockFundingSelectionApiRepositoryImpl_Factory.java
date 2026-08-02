package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockFundingSelectionApiRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> getHighSpeedVideoSizes;

    private MockFundingSelectionApiRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider5) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl newInstance(android.content.Context context, kotlinx.serialization.json.Json json, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockFundingSelectionApiRepositoryImpl(context, json, coroutineDispatcher, fundingSelectionEntityMapper, mockFileNameProvider);
    }
}
