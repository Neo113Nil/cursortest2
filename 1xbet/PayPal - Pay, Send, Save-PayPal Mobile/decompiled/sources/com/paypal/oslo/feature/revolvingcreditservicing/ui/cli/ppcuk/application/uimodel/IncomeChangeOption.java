package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/IncomeChangeOption;", "", "<init>", "(Ljava/lang/String;I)V", "Yes", "No"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IncomeChangeOption {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption No;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption Yes;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private IncomeChangeOption(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption incomeChangeOption = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption("Yes", 0);
        Yes = incomeChangeOption;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption incomeChangeOption2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption("No", 1);
        No = incomeChangeOption2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption[] incomeChangeOptionArr = {incomeChangeOption, incomeChangeOption2};
        getHighResolutionOutputSizeshNQ4ISI = incomeChangeOptionArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(incomeChangeOptionArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
