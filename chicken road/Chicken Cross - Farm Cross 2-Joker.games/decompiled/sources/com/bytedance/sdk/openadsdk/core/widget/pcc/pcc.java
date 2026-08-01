package com.bytedance.sdk.openadsdk.core.widget.pcc;

import android.util.Log;
import android.webkit.CookieManager;
import com.google.common.net.HttpHeaders;
import com.tiktok.util.UrlConst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc {
    public static Map<String, String> pcc(Map<String, List<String>> map, String str) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (key != null && value != null && !value.isEmpty()) {
                    if (key.equalsIgnoreCase("set-cookie")) {
                        arrayList.addAll(value);
                    } else {
                        hashMap.put(key, pcc(value));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                pcc(arrayList, str);
            }
        }
        return hashMap;
    }

    private static String pcc(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    private static void pcc(List<String> list, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        for (String str2 : list) {
            try {
                cookieManager.setCookie(UrlConst.HTTPS.concat(String.valueOf(str)), str2);
                cookieManager.flush();
                Log.d(HttpHeaders.COOKIE, "Set cookie for " + str + ": " + str2);
            } catch (Exception e) {
                Log.e(HttpHeaders.COOKIE, "Failed to set cookie", e);
            }
        }
    }
}
