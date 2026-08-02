package com.paypal.oslo.feature.searchandintelligence.config;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/config/SearchAndIntelligenceConfigManagerImpl;", "Lcom/paypal/oslo/feature/searchandintelligence/api/config/SearchAndIntelligenceConfigManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "isMockQuickStartPromptsEnabled", "()Z", "Lkotlin/time/Duration;", "getSessionInactivityTimeout-UwyO8pc", "()J", "getSessionInactivityTimeout", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchAndIntelligenceConfigManagerImpl implements com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SearchAndIntelligenceConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
        this.Camera2StreamConfigurationMap = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager
    public final boolean isMockQuickStartPromptsEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceFlags.INSTANCE.getMockQuickStartPromptsEnabled());
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.config.SearchAndIntelligenceConfigManager
    /* renamed from: getSessionInactivityTimeout-UwyO8pc */
    public final long mo19113getSessionInactivityTimeoutUwyO8pc() {
        int intValue = ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.searchandintelligence.config.SearchAndIntelligenceConfigs.INSTANCE.getSessionInactivityTimeoutInSecs())).intValue();
        if (intValue == 0) {
            return kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc();
        }
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.DurationKt.toDuration(intValue, kotlin.time.DurationUnit.SECONDS);
    }
}
