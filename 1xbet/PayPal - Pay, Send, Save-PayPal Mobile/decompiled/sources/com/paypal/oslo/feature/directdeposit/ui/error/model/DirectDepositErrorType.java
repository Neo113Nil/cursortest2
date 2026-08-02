package com.paypal.oslo.feature.directdeposit.ui.error.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/error/model/DirectDepositErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "RETRY", com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, "FATAL", "FEATURE_UNAVAILABLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositErrorType {
    public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType FATAL;
    public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType FEATURE_UNAVAILABLE;
    public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType NO_NETWORK;
    public static final com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType RETRY;
    private static final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DirectDepositErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType("RETRY", 0);
        RETRY = directDepositErrorType;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType2 = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType(com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, 1);
        NO_NETWORK = directDepositErrorType2;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType3 = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType("FATAL", 2);
        FATAL = directDepositErrorType3;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType4 = new com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType("FEATURE_UNAVAILABLE", 3);
        FEATURE_UNAVAILABLE = directDepositErrorType4;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType[] directDepositErrorTypeArr = {directDepositErrorType, directDepositErrorType2, directDepositErrorType3, directDepositErrorType4};
        getHighSpeedVideoFpsRanges = directDepositErrorTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(directDepositErrorTypeArr);
    }

    public static com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType[] values() {
        return (com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
