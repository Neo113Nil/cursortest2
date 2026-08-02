package com.paypal.oslo.feature.smartroute.ui.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, "RETRY", "FATAL", "FEATURE_UNAVAILABLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SmartRouteErrorType {
    private static final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType FATAL;
    public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType FEATURE_UNAVAILABLE;
    public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType NO_NETWORK;
    public static final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType RETRY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private SmartRouteErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType(com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, 0);
        NO_NETWORK = smartRouteErrorType;
        com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType2 = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType("RETRY", 1);
        RETRY = smartRouteErrorType2;
        com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType3 = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType("FATAL", 2);
        FATAL = smartRouteErrorType3;
        com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType4 = new com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType("FEATURE_UNAVAILABLE", 3);
        FEATURE_UNAVAILABLE = smartRouteErrorType4;
        com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType[] smartRouteErrorTypeArr = {smartRouteErrorType, smartRouteErrorType2, smartRouteErrorType3, smartRouteErrorType4};
        Camera2StreamConfigurationMap = smartRouteErrorTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(smartRouteErrorTypeArr);
    }

    public static com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType[] values() {
        return (com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
