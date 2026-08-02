package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/HomeConfigManagerImpl;", "Lcom/paypal/oslo/feature/home/featureflags/HomeConfigManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "isHomeFeedMockEnabled", "()Z", "isAdInFeedEnabled", "isLightThemeEnabled", "isHomeHapticFeedbackEnabled", "", "getCollectionsCount", "()I", "isSearchIntelligenceEnabled", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HomeConfigManagerImpl implements com.paypal.oslo.feature.home.featureflags.HomeConfigManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoSizes;

    @javax.inject.Inject
    public HomeConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoSizes = featureGate;
        this.getHighSpeedVideoFpsRanges = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.home.featureflags.HomeConfigManager
    public final boolean isHomeFeedMockEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.INSTANCE.getHomeFeedMockEnabled());
    }

    @Override // com.paypal.oslo.feature.home.featureflags.HomeConfigManager
    public final boolean isAdInFeedEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.INSTANCE.getAdvertisementInHomeFeed());
    }

    @Override // com.paypal.oslo.feature.home.featureflags.HomeConfigManager
    public final boolean isLightThemeEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.INSTANCE.getLightThemeEnabled());
    }

    @Override // com.paypal.oslo.feature.home.featureflags.HomeConfigManager
    public final boolean isHomeHapticFeedbackEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.INSTANCE.getHomeHapticFeedbackEnabled());
    }

    @Override // com.paypal.oslo.feature.home.featureflags.HomeConfigManager
    public final int getCollectionsCount() {
        return ((java.lang.Number) this.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.home.featureflags.HomeConfig.DynamicConfig.INSTANCE.getCollectionsCount())).intValue();
    }

    @Override // com.paypal.oslo.feature.home.featureflags.HomeConfigManager
    public final boolean isSearchIntelligenceEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.INSTANCE.getSearchIntelligenceEnabled());
    }
}
