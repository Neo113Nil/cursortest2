package com.payair.listener.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/payair/listener/model/TransactionStatus;", "", "WALLET_CANCEL_REQUEST", "CARD_ERROR", "TERMINAL_ERROR", "DECLINE_BY_TERMINAL", "DECLINE_BY_CARD", "GENERAL_ERROR", "SENT_ONLINE", "AUTHENTICATE_OFFLINE", "BIOMETRIC_ERROR", "AUTHORIZE_ONLINE", "WALLET_ACTION_REQUIRED"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionStatus {
    public static final com.payair.listener.model.TransactionStatus AUTHENTICATE_OFFLINE;
    public static final com.payair.listener.model.TransactionStatus AUTHORIZE_ONLINE;
    public static final com.payair.listener.model.TransactionStatus BIOMETRIC_ERROR;
    public static final com.payair.listener.model.TransactionStatus CARD_ERROR;
    public static final com.payair.listener.model.TransactionStatus DECLINE_BY_CARD;
    public static final com.payair.listener.model.TransactionStatus DECLINE_BY_TERMINAL;
    public static final com.payair.listener.model.TransactionStatus GENERAL_ERROR;
    public static final com.payair.listener.model.TransactionStatus SENT_ONLINE;
    public static final com.payair.listener.model.TransactionStatus TERMINAL_ERROR;
    public static final com.payair.listener.model.TransactionStatus WALLET_ACTION_REQUIRED;
    public static final com.payair.listener.model.TransactionStatus WALLET_CANCEL_REQUEST;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.payair.listener.model.TransactionStatus[] f4392a;
    public static final /* synthetic */ kotlin.enums.EnumEntries b;

    static {
        com.payair.listener.model.TransactionStatus transactionStatus = new com.payair.listener.model.TransactionStatus("WALLET_CANCEL_REQUEST", 0);
        WALLET_CANCEL_REQUEST = transactionStatus;
        com.payair.listener.model.TransactionStatus transactionStatus2 = new com.payair.listener.model.TransactionStatus("CARD_ERROR", 1);
        CARD_ERROR = transactionStatus2;
        com.payair.listener.model.TransactionStatus transactionStatus3 = new com.payair.listener.model.TransactionStatus("TERMINAL_ERROR", 2);
        TERMINAL_ERROR = transactionStatus3;
        com.payair.listener.model.TransactionStatus transactionStatus4 = new com.payair.listener.model.TransactionStatus("DECLINE_BY_TERMINAL", 3);
        DECLINE_BY_TERMINAL = transactionStatus4;
        com.payair.listener.model.TransactionStatus transactionStatus5 = new com.payair.listener.model.TransactionStatus("DECLINE_BY_CARD", 4);
        DECLINE_BY_CARD = transactionStatus5;
        com.payair.listener.model.TransactionStatus transactionStatus6 = new com.payair.listener.model.TransactionStatus("GENERAL_ERROR", 5);
        GENERAL_ERROR = transactionStatus6;
        com.payair.listener.model.TransactionStatus transactionStatus7 = new com.payair.listener.model.TransactionStatus("SENT_ONLINE", 6);
        SENT_ONLINE = transactionStatus7;
        com.payair.listener.model.TransactionStatus transactionStatus8 = new com.payair.listener.model.TransactionStatus("AUTHENTICATE_OFFLINE", 7);
        AUTHENTICATE_OFFLINE = transactionStatus8;
        com.payair.listener.model.TransactionStatus transactionStatus9 = new com.payair.listener.model.TransactionStatus("BIOMETRIC_ERROR", 8);
        BIOMETRIC_ERROR = transactionStatus9;
        com.payair.listener.model.TransactionStatus transactionStatus10 = new com.payair.listener.model.TransactionStatus("AUTHORIZE_ONLINE", 9);
        AUTHORIZE_ONLINE = transactionStatus10;
        com.payair.listener.model.TransactionStatus transactionStatus11 = new com.payair.listener.model.TransactionStatus("WALLET_ACTION_REQUIRED", 10);
        WALLET_ACTION_REQUIRED = transactionStatus11;
        com.payair.listener.model.TransactionStatus[] transactionStatusArr = {transactionStatus, transactionStatus2, transactionStatus3, transactionStatus4, transactionStatus5, transactionStatus6, transactionStatus7, transactionStatus8, transactionStatus9, transactionStatus10, transactionStatus11};
        f4392a = transactionStatusArr;
        b = kotlin.enums.EnumEntriesKt.enumEntries(transactionStatusArr);
    }

    public TransactionStatus(java.lang.String str, int i) {
    }

    public static com.payair.listener.model.TransactionStatus[] values() {
        return (com.payair.listener.model.TransactionStatus[]) f4392a.clone();
    }

    public static com.payair.listener.model.TransactionStatus valueOf(java.lang.String str) {
        return (com.payair.listener.model.TransactionStatus) java.lang.Enum.valueOf(com.payair.listener.model.TransactionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.payair.listener.model.TransactionStatus> getEntries() {
        return b;
    }
}
