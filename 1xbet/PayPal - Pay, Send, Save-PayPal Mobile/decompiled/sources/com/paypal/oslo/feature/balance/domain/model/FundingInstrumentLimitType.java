package com.paypal.oslo.feature.balance.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentLimitType;", "", "<init>", "(Ljava/lang/String;)V", "MAXIMUM_APPROVED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentLimitType {
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType MAXIMUM_APPROVED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType[] getHighSpeedVideoSizes;

    private FundingInstrumentLimitType(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType fundingInstrumentLimitType = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType("MAXIMUM_APPROVED");
        MAXIMUM_APPROVED = fundingInstrumentLimitType;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType[] fundingInstrumentLimitTypeArr = {fundingInstrumentLimitType};
        getHighSpeedVideoSizes = fundingInstrumentLimitTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentLimitTypeArr);
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.FundingInstrumentLimitType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
