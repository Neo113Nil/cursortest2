package com.bytedance.sdk.component.pcc;

import android.text.TextUtils;

/* loaded from: classes4.dex */
class gpj {
    private static boolean pcc;

    static String pcc(Throwable th) {
        return "{\"code\":" + (th instanceof dax ? ((dax) th).pcc : 0) + "}";
    }

    static String pcc(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (pcc && !z) {
            str2 = str.substring(1, str.length() - 1);
        } else {
            str2 = "";
        }
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!str2.isEmpty()) {
            return concat + "," + str2 + "}";
        }
        return concat + "}";
    }

    static String pcc() {
        return "";
    }

    static void pcc(boolean z) {
        pcc = z;
    }
}
