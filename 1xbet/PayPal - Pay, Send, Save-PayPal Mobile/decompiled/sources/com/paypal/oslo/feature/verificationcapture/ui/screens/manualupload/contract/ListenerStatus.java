package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ListenerStatus;", "", "<init>", "(Ljava/lang/String;I)V", "WIDGET_SHOWN", "UPLOADING", "DOC_UPLOADED", "DOC_REMOVED", "DOC_ALL_REMOVED", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ListenerStatus {
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus DOC_ALL_REMOVED;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus DOC_REMOVED;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus DOC_UPLOADED;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus ERROR;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus UPLOADING;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus WIDGET_SHOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus[] getHighSpeedVideoFpsRangesFor;

    private ListenerStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus("WIDGET_SHOWN", 0);
        WIDGET_SHOWN = listenerStatus;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus("UPLOADING", 1);
        UPLOADING = listenerStatus2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus("DOC_UPLOADED", 2);
        DOC_UPLOADED = listenerStatus3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus4 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus("DOC_REMOVED", 3);
        DOC_REMOVED = listenerStatus4;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus5 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus("DOC_ALL_REMOVED", 4);
        DOC_ALL_REMOVED = listenerStatus5;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus listenerStatus6 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus("ERROR", 5);
        ERROR = listenerStatus6;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus[] listenerStatusArr = {listenerStatus, listenerStatus2, listenerStatus3, listenerStatus4, listenerStatus5, listenerStatus6};
        getHighSpeedVideoFpsRangesFor = listenerStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(listenerStatusArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
