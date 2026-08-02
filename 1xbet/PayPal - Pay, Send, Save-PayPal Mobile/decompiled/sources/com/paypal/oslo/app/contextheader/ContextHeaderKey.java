package com.paypal.oslo.app.contextheader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/app/contextheader/ContextHeaderKey;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "APP_INFO", "DEVICE_INFO", "LOCALE", "SESSION_INFO", "FPTI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContextHeaderKey {
    public static final com.paypal.oslo.app.contextheader.ContextHeaderKey APP_INFO;
    public static final com.paypal.oslo.app.contextheader.ContextHeaderKey DEVICE_INFO;
    public static final com.paypal.oslo.app.contextheader.ContextHeaderKey FPTI;
    public static final com.paypal.oslo.app.contextheader.ContextHeaderKey LOCALE;
    public static final com.paypal.oslo.app.contextheader.ContextHeaderKey SESSION_INFO;
    private static final /* synthetic */ com.paypal.oslo.app.contextheader.ContextHeaderKey[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private ContextHeaderKey(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey = new com.paypal.oslo.app.contextheader.ContextHeaderKey("APP_INFO", 0, "X-PayPal-App-Info");
        APP_INFO = contextHeaderKey;
        com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey2 = new com.paypal.oslo.app.contextheader.ContextHeaderKey("DEVICE_INFO", 1, "X-PayPal-Device-Info");
        DEVICE_INFO = contextHeaderKey2;
        com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey3 = new com.paypal.oslo.app.contextheader.ContextHeaderKey("LOCALE", 2, "X-PayPal-Locale");
        LOCALE = contextHeaderKey3;
        com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey4 = new com.paypal.oslo.app.contextheader.ContextHeaderKey("SESSION_INFO", 3, "X-PayPal-Session-Info");
        SESSION_INFO = contextHeaderKey4;
        com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey5 = new com.paypal.oslo.app.contextheader.ContextHeaderKey("FPTI", 4, "x-paypal-fpti");
        FPTI = contextHeaderKey5;
        com.paypal.oslo.app.contextheader.ContextHeaderKey[] contextHeaderKeyArr = {contextHeaderKey, contextHeaderKey2, contextHeaderKey3, contextHeaderKey4, contextHeaderKey5};
        getHighSpeedVideoFpsRanges = contextHeaderKeyArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(contextHeaderKeyArr);
    }

    public static com.paypal.oslo.app.contextheader.ContextHeaderKey[] values() {
        return (com.paypal.oslo.app.contextheader.ContextHeaderKey[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.app.contextheader.ContextHeaderKey valueOf(java.lang.String str) {
        return (com.paypal.oslo.app.contextheader.ContextHeaderKey) java.lang.Enum.valueOf(com.paypal.oslo.app.contextheader.ContextHeaderKey.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.app.contextheader.ContextHeaderKey> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
