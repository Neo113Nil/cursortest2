package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitType;", "", "<init>", "(Ljava/lang/String;I)V", "ZERO_APR", "PAY_IN_4", "PAY_MONTHLY", "PAY_LATER_GENERIC", "PROMO_REWARDS", "PROMO_POINTS", "PROMO_CASHBACK", "FALLBACK"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BenefitType {
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType FALLBACK;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType PAY_IN_4;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType PAY_LATER_GENERIC;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType PAY_MONTHLY;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType PROMO_CASHBACK;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType PROMO_POINTS;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType PROMO_REWARDS;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType ZERO_APR;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BenefitType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("ZERO_APR", 0);
        ZERO_APR = benefitType;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("PAY_IN_4", 1);
        PAY_IN_4 = benefitType2;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType3 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("PAY_MONTHLY", 2);
        PAY_MONTHLY = benefitType3;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType4 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("PAY_LATER_GENERIC", 3);
        PAY_LATER_GENERIC = benefitType4;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType5 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("PROMO_REWARDS", 4);
        PROMO_REWARDS = benefitType5;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType6 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("PROMO_POINTS", 5);
        PROMO_POINTS = benefitType6;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType7 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("PROMO_CASHBACK", 6);
        PROMO_CASHBACK = benefitType7;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType8 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType("FALLBACK", 7);
        FALLBACK = benefitType8;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[] benefitTypeArr = {benefitType, benefitType2, benefitType3, benefitType4, benefitType5, benefitType6, benefitType7, benefitType8};
        getHighResolutionOutputSizeshNQ4ISI = benefitTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(benefitTypeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
