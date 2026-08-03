package com.helpshift.util;

/* loaded from: classes5.dex */
public class SdkURLs {
    public static java.lang.String AWS_CACHE_URLS_CONFIG = "https://webchat.helpshift.com/latest/android/android-mapping.json";
    public static java.lang.String AWS_WEBCHAT_JS = "https://webchat.helpshift.com/latest/android/webChat.js";
    private static final java.lang.String CACHE_URLS_CONFIG_PATH = "/latest/android/android-mapping.json";
    public static java.lang.String HC_CACHE_URLS_CONFIG = "https://d2duuy9yo5pldo.cloudfront.net/hc-android-mapping.json";
    private static final java.lang.String HC_CACHE_URLS_CONFIG_PATH = "/hc-android-mapping.json";
    private static final java.lang.String HELPCENTER_HOST = "https://d2duuy9yo5pldo.cloudfront.net";
    public static java.lang.String HELPCENTER_MIDDLEWARE_JS = "https://d2duuy9yo5pldo.cloudfront.net/android/helpcenter.js";
    private static final java.lang.String HELPCENTER_MIDDLEWARE_JS_PATH = "/android/helpcenter.js";
    private static final java.lang.String HTTPS_PREFIX = "https://";
    private static final java.lang.String WEBCHAT_HOST = "https://webchat.helpshift.com";
    private static final java.lang.String WEBCHAT_JS_PATH = "/latest/android/webChat.js";

    private SdkURLs() {
    }

    public static void updateHosts(java.lang.String str, java.lang.String str2) {
        if (!com.helpshift.util.Utils.isEmpty(str)) {
            AWS_WEBCHAT_JS = HTTPS_PREFIX + str + "/latest/android/webChat.js";
            AWS_CACHE_URLS_CONFIG = HTTPS_PREFIX + str + "/latest/android/android-mapping.json";
        }
        if (com.helpshift.util.Utils.isEmpty(str2)) {
            return;
        }
        HELPCENTER_MIDDLEWARE_JS = HTTPS_PREFIX + str2 + "/android/helpcenter.js";
        HC_CACHE_URLS_CONFIG = HTTPS_PREFIX + str2 + "/hc-android-mapping.json";
    }
}
