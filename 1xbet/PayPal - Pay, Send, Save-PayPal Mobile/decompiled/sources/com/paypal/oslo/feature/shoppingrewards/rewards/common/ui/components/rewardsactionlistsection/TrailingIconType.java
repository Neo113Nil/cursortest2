package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/TrailingIconType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Chevron", "Details"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TrailingIconType {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType Chevron;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType Completed;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType Details;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType[] getHighSpeedVideoSizes;

    private TrailingIconType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType trailingIconType = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, 0);
        Completed = trailingIconType;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType trailingIconType2 = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType("Chevron", 1);
        Chevron = trailingIconType2;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType trailingIconType3 = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType("Details", 2);
        Details = trailingIconType3;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType[] trailingIconTypeArr = {trailingIconType, trailingIconType2, trailingIconType3};
        getHighSpeedVideoSizes = trailingIconTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(trailingIconTypeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.TrailingIconType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
