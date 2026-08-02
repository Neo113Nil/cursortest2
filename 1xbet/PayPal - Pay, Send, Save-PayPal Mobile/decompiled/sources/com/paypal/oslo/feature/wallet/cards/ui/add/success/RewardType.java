package com.paypal.oslo.feature.wallet.cards.ui.add.success;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardType;", "", "<init>", "(Ljava/lang/String;I)V", "POINTS", "MILES"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardType {
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType MILES;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType POINTS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType[] getHighSpeedVideoSizes;

    private RewardType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType rewardType = new com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType("POINTS", 0);
        POINTS = rewardType;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType rewardType2 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType("MILES", 1);
        MILES = rewardType2;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType[] rewardTypeArr = {rewardType, rewardType2};
        getHighSpeedVideoSizes = rewardTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(rewardTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType[] values() {
        return (com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
