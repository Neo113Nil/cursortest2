package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/MonthlyIncomeAlert;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", "INVALID_AMOUNT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MonthlyIncomeAlert {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert EMPTY;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert INVALID_AMOUNT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert[] getHighSpeedVideoFpsRangesFor;

    private MonthlyIncomeAlert(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert monthlyIncomeAlert = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert("EMPTY", 0);
        EMPTY = monthlyIncomeAlert;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert monthlyIncomeAlert2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert("INVALID_AMOUNT", 1);
        INVALID_AMOUNT = monthlyIncomeAlert2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert[] monthlyIncomeAlertArr = {monthlyIncomeAlert, monthlyIncomeAlert2};
        getHighSpeedVideoFpsRangesFor = monthlyIncomeAlertArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(monthlyIncomeAlertArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.MonthlyIncomeAlert> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
