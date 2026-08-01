package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class tmg {
    public static void pcc(String str) {
        pcc("any_door_id", str);
    }

    public static String pcc() {
        return sf("any_door_id", null);
    }

    private static void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }

    private static String sf(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf((String) null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
