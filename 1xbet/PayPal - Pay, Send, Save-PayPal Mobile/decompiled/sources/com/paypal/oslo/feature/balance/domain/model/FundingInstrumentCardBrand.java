package com.paypal.oslo.feature.balance.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentCardBrand;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "brandName", "Ljava/lang/String;", "getBrandName", "()Ljava/lang/String;", "VISA", "MASTER_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentCardBrand {
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand MASTER_CARD;
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand VISA;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String brandName;

    private FundingInstrumentCardBrand(java.lang.String str, int i, java.lang.String str2) {
        this.brandName = str2;
    }

    public final java.lang.String getBrandName() {
        return this.brandName;
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand fundingInstrumentCardBrand = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand("VISA", 0, "Visa");
        VISA = fundingInstrumentCardBrand;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand fundingInstrumentCardBrand2 = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand("MASTER_CARD", 1, "Mastercard");
        MASTER_CARD = fundingInstrumentCardBrand2;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand[] fundingInstrumentCardBrandArr = {fundingInstrumentCardBrand, fundingInstrumentCardBrand2};
        Camera2StreamConfigurationMap = fundingInstrumentCardBrandArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentCardBrandArr);
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.FundingInstrumentCardBrand> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
