package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY_FUNDING_OPTION_BALANCE", "SECONDARY_FUNDING_OPTIONS", "PRIMARY_AND_SECONDARY_FUNDING_OPTIONS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingOptionsComponentVariant {
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant PRIMARY_AND_SECONDARY_FUNDING_OPTIONS;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant PRIMARY_FUNDING_OPTION_BALANCE;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant SECONDARY_FUNDING_OPTIONS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant[] getHighSpeedVideoSizes;

    private FundingOptionsComponentVariant(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant("PRIMARY_FUNDING_OPTION_BALANCE", 0);
        PRIMARY_FUNDING_OPTION_BALANCE = fundingOptionsComponentVariant;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant2 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant("SECONDARY_FUNDING_OPTIONS", 1);
        SECONDARY_FUNDING_OPTIONS = fundingOptionsComponentVariant2;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant3 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant("PRIMARY_AND_SECONDARY_FUNDING_OPTIONS", 2);
        PRIMARY_AND_SECONDARY_FUNDING_OPTIONS = fundingOptionsComponentVariant3;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant[] fundingOptionsComponentVariantArr = {fundingOptionsComponentVariant, fundingOptionsComponentVariant2, fundingOptionsComponentVariant3};
        getHighSpeedVideoSizes = fundingOptionsComponentVariantArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(fundingOptionsComponentVariantArr);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
