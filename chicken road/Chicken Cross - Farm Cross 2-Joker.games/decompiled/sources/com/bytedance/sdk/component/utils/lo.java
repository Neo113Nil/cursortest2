package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.U3;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
public class lo {
    private static boolean pcc = false;
    private static String sf = "";

    public static void pcc() {
        pcc = true;
    }

    public static void sf() {
        pcc = false;
    }

    public static void pcc(String str, String str2) {
        if (pcc && str2 != null) {
            Log.d(sf(str), str2);
        }
    }

    public static void pcc(String str, Object... objArr) {
        if (pcc && objArr != null) {
            Log.d(sf(str), pcc(objArr));
        }
    }

    public static void sf(String str, String str2) {
        if (pcc && str2 != null) {
            Log.i(sf(str), str2);
        }
    }

    public static void sf(String str, Object... objArr) {
        if (pcc && objArr != null) {
            Log.i(sf(str), pcc(objArr));
        }
    }

    public static void gm(String str, String str2) {
        if (pcc && str2 != null) {
            Log.e(sf(str), str2);
        }
    }

    public static void gm(String str, Object... objArr) {
        if (pcc && objArr != null) {
            Log.e(sf(str), pcc(objArr));
        }
    }

    public static void pcc(String str, String str2, Throwable th) {
        if (pcc) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(sf(str), str2, th);
        }
    }

    public static void pcc(String str) {
        sf = str;
    }

    private static String sf(String str) {
        return TextUtils.isEmpty(sf) ? str : pcc(U3.j.d + sf + "]-[" + str + U3.j.e);
    }

    private static String pcc(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(ServerSentEventKt.SPACE);
        }
        return sb.toString();
    }
}
