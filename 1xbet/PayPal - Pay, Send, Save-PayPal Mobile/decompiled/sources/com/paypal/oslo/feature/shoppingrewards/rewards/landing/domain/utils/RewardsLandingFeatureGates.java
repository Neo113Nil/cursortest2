package com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates;", "", "Flags", "Manager"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface RewardsLandingFeatureGates {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates$Manager;", "", "", "isRewardsLandingMockEnabled", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Manager {
        boolean isRewardsLandingMockEnabled();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates$Flags;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "rewardsLandingMockEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getRewardsLandingMockEnabled$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "rewardsLandingMockEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Flags extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Flags INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Flags.class, "rewardsLandingMockEnabled", "getRewardsLandingMockEnabled$shopping_rewards_prodRelease()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        /* renamed from: rewardsLandingMockEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty rewardsLandingMockEnabled;

        private Flags() {
            super("rewards");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getRewardsLandingMockEnabled$shopping_rewards_prodRelease() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) rewardsLandingMockEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        static {
            com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Flags flags = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Flags();
            INSTANCE = flags;
            rewardsLandingMockEnabled = flags.create("mock_l1_rewards_api_enabled");
            $stable = 8;
        }
    }
}
