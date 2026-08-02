package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockAuthorizeBillingAgreementRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoSizes;

    private MockAuthorizeBillingAgreementRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl newInstance(android.content.Context context, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl(context, mockFileNameProvider, json, contingencyMapper, coroutineDispatcher);
    }
}
