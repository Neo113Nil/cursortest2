package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/FundingSourceSelectorVariant;", "", "<init>", "(Ljava/lang/String;I)V", "SELECT_FUNDING_SOURCE", "SET_FUNDING_SOURCE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FundingSourceSelectorVariant {
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant SELECT_FUNDING_SOURCE;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant SET_FUNDING_SOURCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant[] getHighSpeedVideoSizes;

    private FundingSourceSelectorVariant(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant("SELECT_FUNDING_SOURCE", 0);
        SELECT_FUNDING_SOURCE = fundingSourceSelectorVariant;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant fundingSourceSelectorVariant2 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant("SET_FUNDING_SOURCE", 1);
        SET_FUNDING_SOURCE = fundingSourceSelectorVariant2;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant[] fundingSourceSelectorVariantArr = {fundingSourceSelectorVariant, fundingSourceSelectorVariant2};
        getHighSpeedVideoSizes = fundingSourceSelectorVariantArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(fundingSourceSelectorVariantArr);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
