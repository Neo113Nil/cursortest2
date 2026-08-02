package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentDisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "USER_PREFERRED_FUNDING_SOURCE", "AVAILABLE_FUNDING_SOURCE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingOptionsComponentDisplayMode {
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode AVAILABLE_FUNDING_SOURCE;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode USER_PREFERRED_FUNDING_SOURCE;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private FundingOptionsComponentDisplayMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode fundingOptionsComponentDisplayMode = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode("USER_PREFERRED_FUNDING_SOURCE", 0);
        USER_PREFERRED_FUNDING_SOURCE = fundingOptionsComponentDisplayMode;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode fundingOptionsComponentDisplayMode2 = new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode("AVAILABLE_FUNDING_SOURCE", 1);
        AVAILABLE_FUNDING_SOURCE = fundingOptionsComponentDisplayMode2;
        com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode[] fundingOptionsComponentDisplayModeArr = {fundingOptionsComponentDisplayMode, fundingOptionsComponentDisplayMode2};
        getHighResolutionOutputSizeshNQ4ISI = fundingOptionsComponentDisplayModeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(fundingOptionsComponentDisplayModeArr);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentDisplayMode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
