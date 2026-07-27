package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Q3;
import com.tiktok.util.UrlConst;

/* loaded from: classes4.dex */
public class lu {
    public static boolean pcc(Context context) {
        return gm(context) != 0;
    }

    public static int sf(Context context) {
        int gm = gm(context);
        if (gm == 1) {
            return 0;
        }
        if (gm == 4) {
            return 1;
        }
        if (gm == 5) {
            return 4;
        }
        if (gm != 6) {
            return gm;
        }
        return 6;
    }

    public static int gm(Context context) {
        return jsj.pcc(context, 60000L);
    }

    public static boolean oo(Context context) {
        return gm(context) == 4;
    }

    public static boolean vj(Context context) {
        return gm(context) == 5;
    }

    public static boolean wh(Context context) {
        return gm(context) == 6;
    }

    public static String qf(Context context) {
        int gm = gm(context);
        if (gm == 2) {
            return "2g";
        }
        if (gm == 3) {
            return Q3.f7855a;
        }
        if (gm == 4) {
            return Q3.b;
        }
        if (gm == 5) {
            return "4g";
        }
        if (gm == 6) {
            return "5g";
        }
        return "mobile";
    }

    public static boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith(UrlConst.HTTPS);
    }

    public static boolean kj(Context context) {
        if (context == null) {
            return false;
        }
        int gm = gm(context);
        return gm == 2 || gm == 3 || gm == 4 || gm == 5 || gm == 6;
    }
}
