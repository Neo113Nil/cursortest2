package com.paypal.oslo.feature.balance.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "BANK", "CARD", "SAVINGS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentType {
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType CARD;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType SAVINGS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType[] getHighSpeedVideoSizes;

    private FundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType("BANK", 0);
        BANK = fundingInstrumentType;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType("CARD", 1);
        CARD = fundingInstrumentType2;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType3 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType("SAVINGS", 2);
        SAVINGS = fundingInstrumentType3;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2, fundingInstrumentType3};
        getHighSpeedVideoSizes = fundingInstrumentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
