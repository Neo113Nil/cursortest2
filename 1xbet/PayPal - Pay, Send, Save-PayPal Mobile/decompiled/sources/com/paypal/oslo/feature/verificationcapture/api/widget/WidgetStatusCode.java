package com.paypal.oslo.feature.verificationcapture.api.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/WidgetStatusCode;", "", "<init>", "(Ljava/lang/String;I)V", "WIDGET_SHOWN", "UPLOADING", "DOC_UPLOADED", "DOC_REMOVED", "DOC_ALL_REMOVED", "USER_CANCELED", "PERMISSION_DENIED", "DELETING", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WidgetStatusCode {
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode DELETING;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode DOC_ALL_REMOVED;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode DOC_REMOVED;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode DOC_UPLOADED;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode ERROR;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode PERMISSION_DENIED;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode UPLOADING;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode USER_CANCELED;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode WIDGET_SHOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode[] getHighSpeedVideoSizes;

    private WidgetStatusCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("WIDGET_SHOWN", 0);
        WIDGET_SHOWN = widgetStatusCode;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode2 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("UPLOADING", 1);
        UPLOADING = widgetStatusCode2;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode3 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("DOC_UPLOADED", 2);
        DOC_UPLOADED = widgetStatusCode3;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode4 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("DOC_REMOVED", 3);
        DOC_REMOVED = widgetStatusCode4;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode5 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("DOC_ALL_REMOVED", 4);
        DOC_ALL_REMOVED = widgetStatusCode5;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode6 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("USER_CANCELED", 5);
        USER_CANCELED = widgetStatusCode6;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode7 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("PERMISSION_DENIED", 6);
        PERMISSION_DENIED = widgetStatusCode7;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode8 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("DELETING", 7);
        DELETING = widgetStatusCode8;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode9 = new com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode("ERROR", 8);
        ERROR = widgetStatusCode9;
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode[] widgetStatusCodeArr = {widgetStatusCode, widgetStatusCode2, widgetStatusCode3, widgetStatusCode4, widgetStatusCode5, widgetStatusCode6, widgetStatusCode7, widgetStatusCode8, widgetStatusCode9};
        getHighSpeedVideoSizes = widgetStatusCodeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(widgetStatusCodeArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode[] values() {
        return (com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
