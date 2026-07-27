package com.bytedance.sdk.openadsdk.core.hc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.tiktok.util.UrlConst;

/* loaded from: classes4.dex */
public class oo {
    public static String pcc(String str) {
        return TextUtils.isEmpty(str) ? str : pcc(vh.sf().gpj(), str);
    }

    public static String pcc(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith(UrlConst.HTTPS)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
