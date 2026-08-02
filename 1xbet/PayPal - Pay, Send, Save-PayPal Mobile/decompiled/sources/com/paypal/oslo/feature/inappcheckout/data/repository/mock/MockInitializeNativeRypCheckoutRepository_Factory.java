package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockInitializeNativeRypCheckoutRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> getHighSpeedVideoSizes;

    private MockInitializeNativeRypCheckoutRepository_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository newInstance(android.content.Context context, com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser initializeNativeRypCheckoutParser, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider) {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository(context, initializeNativeRypCheckoutParser, mockFileNameProvider);
    }
}
