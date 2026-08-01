package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc {
    private static String gm;
    private static boolean oo;
    private static String pcc;
    private static String sf;

    private static Context oo(Context context) {
        return context == null ? lu.pcc() : context;
    }

    public static String pcc(Context context) {
        if (!TextUtils.isEmpty(pcc)) {
            return pcc;
        }
        wh(context);
        return pcc;
    }

    public static String sf(Context context) {
        if (sf == null && !oo) {
            synchronized (hc.class) {
                if (!oo) {
                    vj(context);
                }
            }
        }
        return sf;
    }

    public static String gm(Context context) {
        if (TextUtils.isEmpty(gm) && !oo) {
            synchronized (hc.class) {
                if (!oo) {
                    vj(context);
                }
            }
        }
        return gm;
    }

    public static void pcc(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(pcc)) {
                pcc = str;
            }
            pcc();
        }
        if (TextUtils.isEmpty(pcc)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.tmg.gm.sf(pcc);
        tmg.pcc(pcc);
    }

    private static void vj(Context context) {
        if (oo || oo(context) == null) {
            return;
        }
        sf = String.valueOf(Build.TIME);
        gm = gm.pcc().sf("uuid", (String) null);
        oo = true;
    }

    private static void wh(Context context) {
        if (oo(context) == null) {
            return;
        }
        String sf2 = gm.pcc().sf("abcd", (String) null);
        if (TextUtils.isEmpty(sf2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(sf2);
            int optInt = jSONObject.optInt("cypher", -1);
            String optString = jSONObject.optString("message");
            if (optInt == 3) {
                String gm2 = com.bytedance.sdk.component.utils.pcc.gm(optString);
                if (TextUtils.isEmpty(gm2)) {
                    return;
                }
                pcc = new JSONObject(gm2).optString("abcd");
                pcc();
            }
        } catch (Throwable unused) {
        }
    }

    public static void pcc() {
        if (TextUtils.isEmpty(pcc)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("update_did") { // from class: com.bytedance.sdk.openadsdk.core.hc.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time", SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", hc.pcc);
                    gm.pcc().pcc("abcd", com.bytedance.sdk.component.utils.pcc.pcc(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static String sf() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(locale2)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
