package com.paypal.oslo.core.webview.config;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/webview/config/WebEnvironment;", "", "<init>", "(Ljava/lang/String;I)V", "Production", "Development"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebEnvironment {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.webview.config.WebEnvironment Development;
    public static final com.paypal.oslo.core.webview.config.WebEnvironment Production;
    private static final /* synthetic */ com.paypal.oslo.core.webview.config.WebEnvironment[] getHighSpeedVideoSizes;

    private WebEnvironment(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.webview.config.WebEnvironment webEnvironment = new com.paypal.oslo.core.webview.config.WebEnvironment("Production", 0);
        Production = webEnvironment;
        com.paypal.oslo.core.webview.config.WebEnvironment webEnvironment2 = new com.paypal.oslo.core.webview.config.WebEnvironment("Development", 1);
        Development = webEnvironment2;
        com.paypal.oslo.core.webview.config.WebEnvironment[] webEnvironmentArr = {webEnvironment, webEnvironment2};
        getHighSpeedVideoSizes = webEnvironmentArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(webEnvironmentArr);
    }

    public static com.paypal.oslo.core.webview.config.WebEnvironment[] values() {
        return (com.paypal.oslo.core.webview.config.WebEnvironment[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.webview.config.WebEnvironment valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.webview.config.WebEnvironment) java.lang.Enum.valueOf(com.paypal.oslo.core.webview.config.WebEnvironment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.webview.config.WebEnvironment> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
