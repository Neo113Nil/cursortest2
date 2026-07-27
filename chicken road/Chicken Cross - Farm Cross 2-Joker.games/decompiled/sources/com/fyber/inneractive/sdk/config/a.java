package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import com.tiktok.util.UrlConst;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class a {
    public static w0 a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.R;
        HashMap hashMap = iAConfigManager.b;
        if (hashMap != null && hashMap.containsKey(str)) {
            return (w0) iAConfigManager.b.get(str);
        }
        IAlog.c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    public static String a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return UrlConst.HTTPS + str + "/simpleM2M/" + str2;
        }
        return UrlConst.HTTPS + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
