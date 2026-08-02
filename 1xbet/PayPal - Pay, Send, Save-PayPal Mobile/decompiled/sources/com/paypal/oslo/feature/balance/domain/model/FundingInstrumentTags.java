package com.paypal.oslo.feature.balance.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentTags;", "", "<init>", "(Ljava/lang/String;)V", com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.MOST_RECENTLY_USED_TAG}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentTags {
    public static final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags MOST_RECENTLY_USED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags[] getHighSpeedVideoSizes;

    private FundingInstrumentTags(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags fundingInstrumentTags = new com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.MOST_RECENTLY_USED_TAG);
        MOST_RECENTLY_USED = fundingInstrumentTags;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags[] fundingInstrumentTagsArr = {fundingInstrumentTags};
        getHighSpeedVideoSizes = fundingInstrumentTagsArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTagsArr);
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.FundingInstrumentTags> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
