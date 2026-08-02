package com.paypal.android.threeds.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/android/threeds/data/model/TransactionCategory;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_TRANSACTION", "INSTALMENT_TRANSACTION", "RECURRING_TRANSACTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionCategory {
    public static final com.paypal.android.threeds.data.model.TransactionCategory INSTALMENT_TRANSACTION;
    public static final com.paypal.android.threeds.data.model.TransactionCategory PAYMENT_TRANSACTION;
    public static final com.paypal.android.threeds.data.model.TransactionCategory RECURRING_TRANSACTION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.android.threeds.data.model.TransactionCategory[] getHighSpeedVideoSizes;

    private TransactionCategory(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.threeds.data.model.TransactionCategory transactionCategory = new com.paypal.android.threeds.data.model.TransactionCategory("PAYMENT_TRANSACTION", 0);
        PAYMENT_TRANSACTION = transactionCategory;
        com.paypal.android.threeds.data.model.TransactionCategory transactionCategory2 = new com.paypal.android.threeds.data.model.TransactionCategory("INSTALMENT_TRANSACTION", 1);
        INSTALMENT_TRANSACTION = transactionCategory2;
        com.paypal.android.threeds.data.model.TransactionCategory transactionCategory3 = new com.paypal.android.threeds.data.model.TransactionCategory("RECURRING_TRANSACTION", 2);
        RECURRING_TRANSACTION = transactionCategory3;
        com.paypal.android.threeds.data.model.TransactionCategory[] transactionCategoryArr = {transactionCategory, transactionCategory2, transactionCategory3};
        getHighSpeedVideoSizes = transactionCategoryArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(transactionCategoryArr);
    }

    public static com.paypal.android.threeds.data.model.TransactionCategory[] values() {
        return (com.paypal.android.threeds.data.model.TransactionCategory[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.android.threeds.data.model.TransactionCategory valueOf(java.lang.String str) {
        return (com.paypal.android.threeds.data.model.TransactionCategory) java.lang.Enum.valueOf(com.paypal.android.threeds.data.model.TransactionCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.threeds.data.model.TransactionCategory> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
