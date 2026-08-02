package com.paypal.oslo.feature.inappcheckout.data.parser;

/* loaded from: classes13.dex */
public final class InitializeNativeRypCheckoutParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> getHighSpeedVideoSizes;

    private InitializeNativeRypCheckoutParser_Factory(dagger.internal.Provider<kotlinx.serialization.json.Json> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser_Factory create(dagger.internal.Provider<kotlinx.serialization.json.Json> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider5) {
        return new com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser newInstance(kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.mapper.BuyerInfoEntityMapper buyerInfoEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper, com.paypal.oslo.feature.inappcheckout.data.mapper.InitializeCheckoutEntityMapper initializeCheckoutEntityMapper, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return new com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser(json, buyerInfoEntityMapper, fundingSelectionEntityMapper, initializeCheckoutEntityMapper, checkoutLogger);
    }
}
