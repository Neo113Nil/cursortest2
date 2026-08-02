package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideLatencyPairReportCallbackFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback get() {
        return provideLatencyPairReportCallback();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideLatencyPairReportCallbackFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideLatencyPairReportCallbackFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.LatencyPairReportCallback provideLatencyPairReportCallback() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.provideLatencyPairReportCallback();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideLatencyPairReportCallbackFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideLatencyPairReportCallbackFactory();

        private InstanceHolder() {
        }
    }
}
