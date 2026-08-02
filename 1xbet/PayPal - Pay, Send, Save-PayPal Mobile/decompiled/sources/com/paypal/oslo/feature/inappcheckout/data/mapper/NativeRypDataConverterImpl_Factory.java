package com.paypal.oslo.feature.inappcheckout.data.mapper;

/* loaded from: classes13.dex */
public final class NativeRypDataConverterImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.mapper.NativeRypDataConverterImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoSizes;

    private NativeRypDataConverterImpl_Factory(dagger.internal.Provider<kotlinx.serialization.json.Json> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.mapper.NativeRypDataConverterImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.NativeRypDataConverterImpl_Factory create(dagger.internal.Provider<kotlinx.serialization.json.Json> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.NativeRypDataConverterImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.data.mapper.NativeRypDataConverterImpl newInstance(kotlinx.serialization.json.Json json, com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser initializeNativeRypCheckoutParser) {
        return new com.paypal.oslo.feature.inappcheckout.data.mapper.NativeRypDataConverterImpl(json, initializeNativeRypCheckoutParser);
    }
}
