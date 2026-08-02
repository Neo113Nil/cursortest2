package com.paypal.oslo.feature.balance.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/HoldType;", "", "<init>", "(Ljava/lang/String;I)V", "MONEY", "TAX"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HoldType {
    public static final com.paypal.oslo.feature.balance.domain.model.HoldType MONEY;
    public static final com.paypal.oslo.feature.balance.domain.model.HoldType TAX;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.HoldType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private HoldType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.HoldType holdType = new com.paypal.oslo.feature.balance.domain.model.HoldType("MONEY", 0);
        MONEY = holdType;
        com.paypal.oslo.feature.balance.domain.model.HoldType holdType2 = new com.paypal.oslo.feature.balance.domain.model.HoldType("TAX", 1);
        TAX = holdType2;
        com.paypal.oslo.feature.balance.domain.model.HoldType[] holdTypeArr = {holdType, holdType2};
        getHighSpeedVideoFpsRanges = holdTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(holdTypeArr);
    }

    public static com.paypal.oslo.feature.balance.domain.model.HoldType[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.HoldType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.HoldType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.HoldType) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.HoldType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.HoldType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
