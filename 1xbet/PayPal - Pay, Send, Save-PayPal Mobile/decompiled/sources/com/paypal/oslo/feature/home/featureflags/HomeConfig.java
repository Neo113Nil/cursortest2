package com.paypal.oslo.feature.home.featureflags;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/featureflags/HomeConfig;", "", "Flags", "DynamicConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface HomeConfig {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/featureflags/HomeConfig$Flags;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "homeFeedMockEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getHomeFeedMockEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "homeFeedMockEnabled", "advertisementInHomeFeed$delegate", "getAdvertisementInHomeFeed", "advertisementInHomeFeed", "lightThemeEnabled$delegate", "getLightThemeEnabled", "lightThemeEnabled", "homeHapticFeedbackEnabled$delegate", "getHomeHapticFeedbackEnabled", "homeHapticFeedbackEnabled", "searchIntelligenceEnabled$delegate", "getSearchIntelligenceEnabled", "searchIntelligenceEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Flags extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags INSTANCE;

        /* renamed from: advertisementInHomeFeed$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty advertisementInHomeFeed;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.class, "homeFeedMockEnabled", "getHomeFeedMockEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.class, "advertisementInHomeFeed", "getAdvertisementInHomeFeed()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.class, "lightThemeEnabled", "getLightThemeEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.class, "homeHapticFeedbackEnabled", "getHomeHapticFeedbackEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags.class, "searchIntelligenceEnabled", "getSearchIntelligenceEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        /* renamed from: homeFeedMockEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty homeFeedMockEnabled;

        /* renamed from: homeHapticFeedbackEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty homeHapticFeedbackEnabled;

        /* renamed from: lightThemeEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty lightThemeEnabled;

        /* renamed from: searchIntelligenceEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty searchIntelligenceEnabled;

        private Flags() {
            super("home");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getHomeFeedMockEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) homeFeedMockEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAdvertisementInHomeFeed() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) advertisementInHomeFeed.getValue(this, getHighSpeedVideoFpsRanges[1]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getLightThemeEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) lightThemeEnabled.getValue(this, getHighSpeedVideoFpsRanges[2]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getHomeHapticFeedbackEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) homeHapticFeedbackEnabled.getValue(this, getHighSpeedVideoFpsRanges[3]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getSearchIntelligenceEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) searchIntelligenceEnabled.getValue(this, getHighSpeedVideoFpsRanges[4]);
        }

        static {
            com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags flags = new com.paypal.oslo.feature.home.featureflags.HomeConfig.Flags();
            INSTANCE = flags;
            homeFeedMockEnabled = flags.create("mock_feed_api_enabled");
            advertisementInHomeFeed = flags.create("ads");
            lightThemeEnabled = flags.create("enable_light_mode");
            homeHapticFeedbackEnabled = flags.create("haptic_feedback_enabled");
            searchIntelligenceEnabled = flags.create("enable_search_intelligence");
            $stable = 8;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/home/featureflags/HomeConfig$DynamicConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "collectionsCount$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCollectionsCount", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "collectionsCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DynamicConfig extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.home.featureflags.HomeConfig.DynamicConfig INSTANCE;

        /* renamed from: collectionsCount$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty collectionsCount;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.home.featureflags.HomeConfig.DynamicConfig.class, "collectionsCount", "getCollectionsCount()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        private DynamicConfig() {
            super("home", "feed_config");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Integer> getCollectionsCount() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) collectionsCount.getValue(this, getHighSpeedVideoSizes[0]);
        }

        static {
            com.paypal.oslo.feature.home.featureflags.HomeConfig.DynamicConfig dynamicConfig = new com.paypal.oslo.feature.home.featureflags.HomeConfig.DynamicConfig();
            INSTANCE = dynamicConfig;
            collectionsCount = dynamicConfig.create(20, "collections_count");
            $stable = 8;
        }
    }
}
