package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "BANK", "CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentType {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType CARD;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private FundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType("BANK", 0);
        BANK = fundingInstrumentType;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType("CARD", 1);
        CARD = fundingInstrumentType2;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2};
        Camera2StreamConfigurationMap = fundingInstrumentTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
