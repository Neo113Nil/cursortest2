package com.payair.db.transactionhistory;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4383a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.values().length];
        b = iArr;
        try {
            iArr[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.PURCHASE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            b[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.REFUND.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            b[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.PAYMENT.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            b[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_WITHDRAWAL.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            b[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.CASH_DISBURSEMENT.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            b[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_DEPOSIT.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            b[com.payair.db.transactionhistory.TransactionHistoryEntry.TransactionType.ATM_TRANSFER.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.values().length];
        f4383a = iArr2;
        try {
            iArr2[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.DECLINED.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            f4383a[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.AUTHORIZED.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            f4383a[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.CLEARED.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            f4383a[com.payair.db.transactionhistory.TransactionHistoryEntry.AuthorizationStatus.REVERSED.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
    }
}
