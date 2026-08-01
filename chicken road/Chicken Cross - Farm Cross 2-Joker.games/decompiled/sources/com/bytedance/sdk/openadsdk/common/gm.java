package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.kun;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
public class gm {
    private static String pcc;

    public static int oo() {
        return BuildConfig.VERSION_CODE;
    }

    public static String pcc() {
        return "open_news";
    }

    public static String sf() {
        return "1371";
    }

    public static String gm() {
        return BuildConfig.VERSION_NAME;
    }

    public static long vj() {
        return kun.ork(BuildConfig.VERSION_NAME);
    }

    public static String wh() {
        return kun.kj();
    }

    public static String qf() {
        return com.bytedance.sdk.openadsdk.core.ork.sf().kj();
    }

    public static String kj() {
        return com.bytedance.sdk.component.utils.lu.qf(com.bytedance.sdk.openadsdk.core.lu.pcc());
    }

    public static String pcc(Context context) {
        return com.bytedance.sdk.openadsdk.core.hc.pcc(context);
    }

    public static String vy() {
        if (!TextUtils.isEmpty(pcc)) {
            return pcc;
        }
        String pcc2 = com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_app_sha1", 259200000L);
        pcc = pcc2;
        if (pcc(pcc2)) {
            return pcc;
        }
        String pcc3 = com.bytedance.sdk.component.utils.gm.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc());
        pcc = pcc3;
        if (pcc(pcc3)) {
            String upperCase = pcc.toUpperCase();
            pcc = upperCase;
            com.bytedance.sdk.openadsdk.core.ork.pcc("sdk_app_sha1", upperCase);
            return pcc;
        }
        return "";
    }

    private static boolean pcc(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(ServerSentEventKt.COLON)) == null || split.length < 20) {
            return false;
        }
        for (String str2 : split) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
