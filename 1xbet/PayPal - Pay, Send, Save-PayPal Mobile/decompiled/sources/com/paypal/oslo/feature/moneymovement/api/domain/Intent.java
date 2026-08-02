package com.paypal.oslo.feature.moneymovement.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/Intent;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, "CONTRIBUTE", "POOL", "BUY", "SELL", "ADD", "SENT", "REWARDS", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.ACCEPT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY, "PAID", "CONVERT", "RECEIVE", "TRANSFER", "ADDED", "SCHEDULED", "TRANSFERRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Intent {
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent ACCEPT;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent ADD;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent ADDED;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent BUY;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent CONTRIBUTE;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent CONVERT;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent PAID;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent PAY;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent POOL;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent RECEIVE;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent REQUEST;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent REWARDS;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent SCHEDULED;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent SELL;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent SEND;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent SENT;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent TRANSFER;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.Intent TRANSFERRED;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.Intent[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private Intent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent = new com.paypal.oslo.feature.moneymovement.api.domain.Intent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 0);
        SEND = intent;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent2 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, 1);
        REQUEST = intent2;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent3 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("CONTRIBUTE", 2);
        CONTRIBUTE = intent3;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent4 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("POOL", 3);
        POOL = intent4;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent5 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("BUY", 4);
        BUY = intent5;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent6 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("SELL", 5);
        SELL = intent6;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent7 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("ADD", 6);
        ADD = intent7;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent8 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("SENT", 7);
        SENT = intent8;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent9 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("REWARDS", 8);
        REWARDS = intent9;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent10 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.ACCEPT, 9);
        ACCEPT = intent10;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent11 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.PAY, 10);
        PAY = intent11;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent12 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("PAID", 11);
        PAID = intent12;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent13 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("CONVERT", 12);
        CONVERT = intent13;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent14 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("RECEIVE", 13);
        RECEIVE = intent14;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent15 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("TRANSFER", 14);
        TRANSFER = intent15;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent16 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("ADDED", 15);
        ADDED = intent16;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent17 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("SCHEDULED", 16);
        SCHEDULED = intent17;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent18 = new com.paypal.oslo.feature.moneymovement.api.domain.Intent("TRANSFERRED", 17);
        TRANSFERRED = intent18;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent[] intentArr = {intent, intent2, intent3, intent4, intent5, intent6, intent7, intent8, intent9, intent10, intent11, intent12, intent13, intent14, intent15, intent16, intent17, intent18};
        getHighResolutionOutputSizeshNQ4ISI = intentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(intentArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.Intent[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.domain.Intent[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.Intent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.domain.Intent) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.domain.Intent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.domain.Intent> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
