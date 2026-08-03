package com.helpshift.config;

/* loaded from: classes.dex */
public class HSJSGenerator {
    public static final java.lang.String backBtnClickJs = "Helpcenter( JSON.stringify({ \"eventType\": \"backBtnClick\", \"config\": {} }));";
    public static final java.lang.String reloadIframeJS = "Helpcenter( JSON.stringify({ \"eventType\": \"reloadHelpcenter\", \"config\": %helpshiftConfig }));";
    public static final java.lang.String sendForegroundEvent = "Helpcenter( JSON.stringify({ \"eventType\": \"sdkxIsInForeground\", \"config\": %foreground }));";
    public static final java.lang.String sendWebchatData = "Helpcenter( JSON.stringify({ \"eventType\": \"setWebchatData\", \"config\": %data }));";
    public static final java.lang.String showNotificationBadgeJS = "Helpcenter(JSON.stringify({ \"eventType\": \"showNotifBadge\", \"config\": { \"notifCount\": %count } }));";
    public static final java.lang.String updateHelpCenterConfig = "Helpcenter( JSON.stringify({ \"eventType\": \"updateHelpshiftConfig\", \"config\": %helpshiftConfig }));";
    public static final java.lang.String updateWebChatConfig = "window.helpshiftConfig = JSON.parse(JSON.stringify(%config));Helpshift('updateHelpshiftConfig')";
    private final com.helpshift.config.HSConfigManager configManager;

    public HSJSGenerator(com.helpshift.config.HSConfigManager hSConfigManager) {
        this.configManager = hSConfigManager;
    }

    public java.lang.String getWebchatEmbeddedCodeString(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (com.helpshift.util.Utils.isEmpty(str2)) {
            return "";
        }
        return str2.replace("%cdn", str).replace("%config", this.configManager.getWebchatConfigJs(z, str3));
    }

    public java.lang.String getHelpcenterEmbeddedCodeString(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5) {
        if (com.helpshift.util.Utils.isEmpty(str2)) {
            return "";
        }
        return str2.replace("%cdn", str).replace("%config", this.configManager.getHelpcenterConfigJs(str3, str4, z, str5));
    }
}
