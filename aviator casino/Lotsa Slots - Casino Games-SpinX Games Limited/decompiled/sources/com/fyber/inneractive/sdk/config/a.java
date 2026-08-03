package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public abstract class a {
    public static com.fyber.inneractive.sdk.config.r0 a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        java.util.HashMap hashMap = iAConfigManager.b;
        if (hashMap != null && hashMap.containsKey(str)) {
            return (com.fyber.inneractive.sdk.config.r0) iAConfigManager.b.get(str);
        }
        com.fyber.inneractive.sdk.util.IAlog.c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (java.util.regex.Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return "https://" + str + "/simpleM2M/" + str2;
        }
        return "https://" + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
