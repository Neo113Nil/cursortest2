package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates;", "", "Flags", "Manager"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface RewardsSummaryFeatureGates {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Manager;", "", "", "isCategorySelectionEnabled", "()Z", "isRedeemToBalanceEnabled", "isRedeemToSavingsEnabled", "isRedeemToCharityEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Manager {
        boolean isCategorySelectionEnabled();

        boolean isRedeemToBalanceEnabled();

        boolean isRedeemToCharityEnabled();

        boolean isRedeemToSavingsEnabled();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048AX\u0081\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/utils/RewardsSummaryFeatureGates$Flags;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "showCategorySelection$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getShowCategorySelection$shopping_rewards_prodRelease", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "showCategorySelection", "redeemToBalance$delegate", "getRedeemToBalance$shopping_rewards_prodRelease", "redeemToBalance", "redeemToSavings$delegate", "getRedeemToSavings$shopping_rewards_prodRelease", "redeemToSavings", "redeemToCharity$delegate", "getRedeemToCharity$shopping_rewards_prodRelease", "redeemToCharity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Flags extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Flags INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Flags.class, "showCategorySelection", "getShowCategorySelection$shopping_rewards_prodRelease()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Flags.class, "redeemToBalance", "getRedeemToBalance$shopping_rewards_prodRelease()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Flags.class, "redeemToSavings", "getRedeemToSavings$shopping_rewards_prodRelease()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Flags.class, "redeemToCharity", "getRedeemToCharity$shopping_rewards_prodRelease()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        /* renamed from: redeemToBalance$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty redeemToBalance;

        /* renamed from: redeemToCharity$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty redeemToCharity;

        /* renamed from: redeemToSavings$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty redeemToSavings;

        /* renamed from: showCategorySelection$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty showCategorySelection;

        private Flags() {
            super("shopping_rewards");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getShowCategorySelection$shopping_rewards_prodRelease() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) showCategorySelection.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getRedeemToBalance$shopping_rewards_prodRelease() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) redeemToBalance.getValue(this, getHighSpeedVideoFpsRanges[1]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getRedeemToSavings$shopping_rewards_prodRelease() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) redeemToSavings.getValue(this, getHighSpeedVideoFpsRanges[2]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getRedeemToCharity$shopping_rewards_prodRelease() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) redeemToCharity.getValue(this, getHighSpeedVideoFpsRanges[3]);
        }

        static {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Flags flags = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Flags();
            INSTANCE = flags;
            showCategorySelection = flags.create("show_category_selection");
            redeemToBalance = flags.create("redeem_to_balance");
            redeemToSavings = flags.create("redeem_to_savings");
            redeemToCharity = flags.create("redeem_to_charity");
            $stable = 8;
        }
    }
}
