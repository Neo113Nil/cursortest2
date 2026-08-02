package com.paypal.oslo.feature.wallet.banks.connectsdk.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectEventType;", "", "<init>", "(Ljava/lang/String;I)V", "LOADED", "DONE", com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "ERROR", "ROUTE", "USER_EVENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConnectEventType {
    public static final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType CANCELLED;
    public static final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType DONE;
    public static final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType ERROR;
    public static final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType LOADED;
    public static final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType ROUTE;
    public static final com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType USER_EVENT;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ConnectEventType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType("LOADED", 0);
        LOADED = connectEventType;
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType2 = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType("DONE", 1);
        DONE = connectEventType2;
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType3 = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 2);
        CANCELLED = connectEventType3;
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType4 = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType("ERROR", 3);
        ERROR = connectEventType4;
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType5 = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType("ROUTE", 4);
        ROUTE = connectEventType5;
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType connectEventType6 = new com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType("USER_EVENT", 5);
        USER_EVENT = connectEventType6;
        com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType[] connectEventTypeArr = {connectEventType, connectEventType2, connectEventType3, connectEventType4, connectEventType5, connectEventType6};
        getHighSpeedVideoFpsRanges = connectEventTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(connectEventTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType[] values() {
        return (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectEventType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
