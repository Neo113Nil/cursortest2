package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "UNABLE_TO_VERIFY_ADDRESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestVirtualCardErrorType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType UNABLE_TO_VERIFY_ADDRESS;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType[] getHighSpeedVideoFpsRanges;

    private RequestVirtualCardErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType requestVirtualCardErrorType = new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType("UNKNOWN", 0);
        UNKNOWN = requestVirtualCardErrorType;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType requestVirtualCardErrorType2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType("UNABLE_TO_VERIFY_ADDRESS", 1);
        UNABLE_TO_VERIFY_ADDRESS = requestVirtualCardErrorType2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType[] requestVirtualCardErrorTypeArr = {requestVirtualCardErrorType, requestVirtualCardErrorType2};
        getHighSpeedVideoFpsRanges = requestVirtualCardErrorTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(requestVirtualCardErrorTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardErrorType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
