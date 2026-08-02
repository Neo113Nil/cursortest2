package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/RedemptionType;", "", "<init>", "(Ljava/lang/String;)V", "CHARITY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedemptionType {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType CHARITY;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType[] getHighSpeedVideoFpsRangesFor;

    private RedemptionType(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType redemptionType = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType("CHARITY");
        CHARITY = redemptionType;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType[] redemptionTypeArr = {redemptionType};
        getHighSpeedVideoFpsRangesFor = redemptionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(redemptionTypeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.RedemptionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
