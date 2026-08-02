package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0019\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/data/utils/RewardsSummaryDynamicConfigImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryDynamicConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "", "getPpdcPoints", "()J", "ppdcPoints", "getPpdcPointsPerUnit", "()Ljava/lang/String;", "ppdcPointsPerUnit", "getPpdcCurrencyUnit", "ppdcCurrencyUnit", "getPpdcMonthlyCap", "ppdcMonthlyCap", "Companion", "RewardsDynamicConfigSpecs", "PpdcOfferConfigSpecs"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryDynamicConfigImpl implements com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig {

    @java.lang.Deprecated
    public static final java.lang.String KEY_CURRENCY_UNIT = "currency_unit";

    @java.lang.Deprecated
    public static final java.lang.String KEY_MONTHLY_CAP = "monthly_cap";

    @java.lang.Deprecated
    public static final java.lang.String KEY_POINTS_PER_UNIT = "points_per_unit";
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.Companion Companion = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public RewardsSummaryDynamicConfigImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoSizes = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig
    public final long getPpdcPoints() {
        return ((java.lang.Number) this.getHighSpeedVideoSizes.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.RewardsDynamicConfigSpecs.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.RewardsDynamicConfigSpecs.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.RewardsDynamicConfigSpecs.getHighSpeedVideoFpsRangesFor[0]))).longValue();
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig
    public final java.lang.String getPpdcPointsPerUnit() {
        return getHighResolutionOutputSizeshNQ4ISI(KEY_POINTS_PER_UNIT);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig
    public final java.lang.String getPpdcCurrencyUnit() {
        return getHighResolutionOutputSizeshNQ4ISI(KEY_CURRENCY_UNIT);
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryDynamicConfig
    public final java.lang.String getPpdcMonthlyCap() {
        return getHighResolutionOutputSizeshNQ4ISI(KEY_MONTHLY_CAP);
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        java.lang.Object obj = ((java.util.Map) this.getHighSpeedVideoSizes.getValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.PpdcOfferConfigSpecs.Camera2StreamConfigurationMap.getValue(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.PpdcOfferConfigSpecs.INSTANCE, com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.PpdcOfferConfigSpecs.Camera2StreamConfigurationMap[0]))).get(p0);
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        return obj2 == null ? "" : obj2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/data/utils/RewardsSummaryDynamicConfigImpl$RewardsDynamicConfigSpecs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "getHighSpeedVideoFpsRanges", "Lkotlin/properties/ReadOnlyProperty;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class RewardsDynamicConfigSpecs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.RewardsDynamicConfigSpecs INSTANCE;
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRanges;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.RewardsDynamicConfigSpecs.class, "ppdcPointsConfig", "getPpdcPointsConfig()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        private RewardsDynamicConfigSpecs() {
            super("shopping_rewards", "config");
        }

        static {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.RewardsDynamicConfigSpecs rewardsDynamicConfigSpecs = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.RewardsDynamicConfigSpecs();
            INSTANCE = rewardsDynamicConfigSpecs;
            getHighSpeedVideoFpsRanges = rewardsDynamicConfigSpecs.create(0L, "ppdc_points");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/data/utils/RewardsSummaryDynamicConfigImpl$PpdcOfferConfigSpecs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "", "getHighSpeedVideoFpsRanges", "Lkotlin/properties/ReadOnlyProperty;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class PpdcOfferConfigSpecs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.PpdcOfferConfigSpecs.class, "ppdcOfferContent", "getPpdcOfferContent()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.PpdcOfferConfigSpecs INSTANCE;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;

        private PpdcOfferConfigSpecs() {
            super("shopping_rewards", "config");
        }

        static {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.PpdcOfferConfigSpecs ppdcOfferConfigSpecs = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.utils.RewardsSummaryDynamicConfigImpl.PpdcOfferConfigSpecs();
            INSTANCE = ppdcOfferConfigSpecs;
            Camera2StreamConfigurationMap = ppdcOfferConfigSpecs.create(kotlin.collections.MapsKt.emptyMap(), "PPDC_offer_content");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/data/utils/RewardsSummaryDynamicConfigImpl$Companion;", "", "<init>", "()V", "", "KEY_POINTS_PER_UNIT", "Ljava/lang/String;", "KEY_CURRENCY_UNIT", "KEY_MONTHLY_CAP"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
