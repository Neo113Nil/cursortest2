package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "BANK", "CARD", "PAYPAL_CREDIT", "COBRAND"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FundingInstrumentType {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType CARD;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType COBRAND;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType PAYPAL_CREDIT;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType("BANK", 0);
        BANK = fundingInstrumentType;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType("CARD", 1);
        CARD = fundingInstrumentType2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType("PAYPAL_CREDIT", 2);
        PAYPAL_CREDIT = fundingInstrumentType3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType fundingInstrumentType4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType("COBRAND", 3);
        COBRAND = fundingInstrumentType4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2, fundingInstrumentType3, fundingInstrumentType4};
        getHighSpeedVideoFpsRangesFor = fundingInstrumentTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
