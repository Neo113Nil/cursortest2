package com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "", "isWebViewSolutionEnabled", "()Z", "isNativeSolutionEnabled", "isMockAPIEnabled", "isAnimatedGIFLoaderEnabled", "isOneShotEnabled", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "FeatureGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureGateManagerImpl implements com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public FeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
        this.getHighSpeedVideoSizes = checkoutLogger;
        this.Camera2StreamConfigurationMap = analyticsTracer;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager
    public final boolean isWebViewSolutionEnabled() {
        return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoFpsRanges[0]));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager
    public final boolean isNativeSolutionEnabled() {
        return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoFpsRanges[1]));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager
    public final boolean isMockAPIEnabled() {
        return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoFpsRanges[2]));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager
    public final boolean isAnimatedGIFLoaderEnabled() {
        return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoFpsRanges[3]));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager
    public final boolean isOneShotEnabled() {
        return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.INSTANCE, com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.getHighSpeedVideoFpsRanges[4]));
    }

    private final boolean getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey p0) {
        boolean checkGate = this.getHighSpeedVideoFpsRangesFor.checkGate(p0);
        this.Camera2StreamConfigurationMap.trackElmoExperiment(p0.getKeyName(), p0.getKeyName());
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getHighSpeedVideoSizes, "feature_gate_evaluation", com.paypal.android.logger.categories.Network.Success.INSTANCE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", p0.getDomain()), kotlin.TuplesKt.to("key_name", p0.getKeyName()), kotlin.TuplesKt.to("is_enabled", java.lang.String.valueOf(checkGate))), null, 8, null);
        return checkGate;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0015\u0010\b\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0015\u0010\n\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0015\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0015\u0010\f\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManagerImpl$FeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "getInputFormats", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    static final class FeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;
        public static final com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates INSTANCE;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.class, "enableWebFlow", "getEnableWebFlow()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.class, "enableNativeFlow", "getEnableNativeFlow()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.class, "enableMockAuthAPI", "getEnableMockAuthAPI()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.class, "enabledCreativeLoader", "getEnabledCreativeLoader()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates.class, "enableOneShot", "getEnableOneShot()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighResolutionOutputSizeshNQ4ISI;

        private FeatureGates() {
            super(com.paypal.oslo.feature.inappcheckout.features.statsig.domain.InAppCheckoutStatsig.DOMAIN);
        }

        static {
            com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates featureGates = new com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManagerImpl.FeatureGates();
            INSTANCE = featureGates;
            getHighSpeedVideoFpsRangesFor = featureGates.create("enable_web_flow");
            getHighSpeedVideoFpsRanges = featureGates.create("enable_native_flow");
            Camera2StreamConfigurationMap = featureGates.create("mock_auth_api_enabled");
            getHighResolutionOutputSizeshNQ4ISI = featureGates.create("creative_loading_spinner_webview");
            getHighSpeedVideoSizes = featureGates.create("one_shot_api_enabled");
        }
    }
}
