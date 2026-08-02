package com.paypal.oslo.feature.inappcheckout.features.javascript;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/javascript/WebViewMessageEventType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "CONTINUE_BUTTON_READY", "CONTINUE_BUTTON_CLICKED", "PAY_BUTTON_READY", "PAY_BUTTON_CLICKED", "RETURN_BUTTON_CLICKED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WebViewMessageEventType {
    public static final com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType CONTINUE_BUTTON_CLICKED;
    public static final com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType CONTINUE_BUTTON_READY;
    public static final com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType PAY_BUTTON_CLICKED;
    public static final com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType PAY_BUTTON_READY;
    public static final com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType RETURN_BUTTON_CLICKED;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String type;

    private WebViewMessageEventType(java.lang.String str, int i, java.lang.String str2) {
        this.type = str2;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType webViewMessageEventType = new com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType("CONTINUE_BUTTON_READY", 0, "continue_button_ready");
        CONTINUE_BUTTON_READY = webViewMessageEventType;
        com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType webViewMessageEventType2 = new com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType("CONTINUE_BUTTON_CLICKED", 1, "continue_button_clicked");
        CONTINUE_BUTTON_CLICKED = webViewMessageEventType2;
        com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType webViewMessageEventType3 = new com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType("PAY_BUTTON_READY", 2, "pay_button_ready");
        PAY_BUTTON_READY = webViewMessageEventType3;
        com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType webViewMessageEventType4 = new com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType("PAY_BUTTON_CLICKED", 3, "pay_button_clicked");
        PAY_BUTTON_CLICKED = webViewMessageEventType4;
        com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType webViewMessageEventType5 = new com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType("RETURN_BUTTON_CLICKED", 4, "return_button_clicked");
        RETURN_BUTTON_CLICKED = webViewMessageEventType5;
        com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType[] webViewMessageEventTypeArr = {webViewMessageEventType, webViewMessageEventType2, webViewMessageEventType3, webViewMessageEventType4, webViewMessageEventType5};
        getHighSpeedVideoFpsRanges = webViewMessageEventTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(webViewMessageEventTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.features.javascript.WebViewMessageEventType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
