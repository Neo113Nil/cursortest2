package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/recurringaccountactionsmodule/RecurringAccountItemType;", "", "<init>", "(Ljava/lang/String;I)V", "MANAGED_ACCOUNT", "PAYMENTS_SUMMARY", "STATEMENTS_HUB"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RecurringAccountItemType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType MANAGED_ACCOUNT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType PAYMENTS_SUMMARY;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType STATEMENTS_HUB;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType[] getHighSpeedVideoFpsRangesFor;

    private RecurringAccountItemType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType("MANAGED_ACCOUNT", 0);
        MANAGED_ACCOUNT = recurringAccountItemType;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType("PAYMENTS_SUMMARY", 1);
        PAYMENTS_SUMMARY = recurringAccountItemType2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType recurringAccountItemType3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType("STATEMENTS_HUB", 2);
        STATEMENTS_HUB = recurringAccountItemType3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType[] recurringAccountItemTypeArr = {recurringAccountItemType, recurringAccountItemType2, recurringAccountItemType3};
        getHighSpeedVideoFpsRangesFor = recurringAccountItemTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(recurringAccountItemTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.recurringaccountactionsmodule.RecurringAccountItemType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
