package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.TrafficStats;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ҷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0540 {

    /* renamed from: ゥ, reason: contains not printable characters */
    public static JSONObject f1209;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1235 = StringFog.decrypt("ei/nRUtxHspXJuI=\n", "PkqRLCgUS74=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1234 = StringFog.decrypt("Wqqt7w==\n", "NN3en+UkwoQ=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1233 = StringFog.decrypt("iQ2BPw==\n", "53rzRzCjDQE=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1232 = StringFog.decrypt("kzUEYA==\n", "/lhlFrYJLsQ=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1231 = StringFog.decrypt("Wek8iA==\n", "NIRI4CktC4M=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1230 = StringFog.decrypt("WB1xJQ==\n", "NXAdUsWeIrg=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1229 = StringFog.decrypt("4MAf0w==\n", "ja1rp+bQogo=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1228 = StringFog.decrypt("ng==\n", "6YSgI/zdx/E=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1227 = StringFog.decrypt("SQ==\n", "IRXBapqbEhM=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f1226 = StringFog.decrypt("aT70IA==\n", "GleORWhHZbU=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f1225 = StringFog.decrypt("suOZRA==\n", "xYXqML9CZkk=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f1224 = StringFog.decrypt("GOiXFQ==\n", "b47lZiB3eNw=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f1223 = StringFog.decrypt("Rcozsg==\n", "MqxAwtVTZ98=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f1222 = StringFog.decrypt("LKJYBw==\n", "QcArc6Wb/P4=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f1221 = StringFog.decrypt("VpBc5lk=\n", "O/IoljB8pk0=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f1220 = StringFog.decrypt("aIJvTg==\n", "BeAbPos6Z30=\n");

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f1219 = StringFog.decrypt("1VLIahI=\n", "uDC7Gnvp4L0=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f1218 = StringFog.decrypt("V2Hteg==\n", "OgOeCgJTGEU=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1217 = StringFog.decrypt("cxFrPw==\n", "HnMFUIYffTs=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f1216 = StringFog.decrypt("KdojNA==\n", "RLhMWtRDjXI=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f1215 = StringFog.decrypt("PiEpRA==\n", "U0NKJwfLd+4=\n");

    /* renamed from: 丫, reason: contains not printable characters */
    public static final String f1214 = StringFog.decrypt("iD7+VQ==\n", "5VyNOl9OCi0=\n");

    /* renamed from: ヶ, reason: contains not printable characters */
    public static final String f1213 = StringFog.decrypt("he8VPA==\n", "6I1mUjKnteE=\n");

    /* renamed from: ヮ, reason: contains not printable characters */
    public static final String f1212 = StringFog.decrypt("8haZBg==\n", "kGLpalMcxQ4=\n");

    /* renamed from: リ, reason: contains not printable characters */
    public static final String f1211 = StringFog.decrypt("D7G+pQ==\n", "bcXS06rWOh4=\n");

    /* renamed from: ト, reason: contains not printable characters */
    public static JSONObject f1210 = null;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5495(JSONObject jSONObject) {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(f1234, Math.round((1000.0f / (currentTimeMillis2 - currentTimeMillis)) * (totalRxBytes2 - totalRxBytes)));
                jSONObject.put(f1233, totalRxBytes2);
            }
        } catch (Throwable th) {
            String str = f1235;
            AbstractC0544.m5511(str, str, StringFog.decrypt("MX/7QMX+FJ8AeeBB0P4QigEt6EHT/h2fAHrmXdz+BokVauw=\n", "dA2JL7fec/o=\n"), th, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized JSONObject m5496() {
        JSONObject jSONObject;
        synchronized (AbstractC0540.class) {
            if (f1210 == null) {
                JSONObject jSONObject2 = new JSONObject();
                f1210 = jSONObject2;
                try {
                    jSONObject2.put(f1228, -1);
                    f1210.put(f1227, -1);
                } catch (JSONException unused) {
                }
            }
            jSONObject = f1210;
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m5498(Activity activity) {
        synchronized (AbstractC0540.class) {
            if (activity != null) {
                m5499(activity.getApplicationContext());
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m5499(Context context) {
        DisplayMetrics displayMetrics;
        synchronized (AbstractC0540.class) {
            if (context != null) {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService(StringFog.decrypt("L3X0C2SW\n", "WByabwvhyzM=\n"));
                    if (windowManager != null && Build.VERSION.SDK_INT >= 30) {
                        try {
                            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                            if (bounds != null) {
                                m5497(bounds.height(), bounds.width());
                                return;
                            }
                        } catch (Throwable th) {
                            String str = f1235;
                            AbstractC0544.m5511(str, str, StringFog.decrypt("UGcrbvWr33g1cjx18+LYcTViMG/j5MFbcGEraOT4lnBnejQh8OLYcnpiFGDp7NNk\n", "FRVZAYeLthY=\n"), th, null, false);
                        }
                    }
                    Resources resources = context.getResources();
                    if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                        m5497(displayMetrics.heightPixels, displayMetrics.widthPixels);
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5497(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        try {
            JSONObject m5496 = m5496();
            m5496.put(f1228, i2);
            m5496.put(f1227, i);
        } catch (Throwable th) {
            String str = f1235;
            AbstractC0544.m5511(str, str, StringFog.decrypt("4mBEoAnnOKbTZl+hHOc4oNV3U6FbtCK5wg==\n", "pxI2z3vHS8M=\n"), th, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5500(Context context, JSONObject jSONObject) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(StringFog.decrypt("GggwRc9l2o0=\n", "e2tELLkMrvQ=\n"));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = 1048576;
            jSONObject.put(f1232, memoryInfo.availMem / j);
            jSONObject.put(f1231, memoryInfo.threshold / j);
            boolean z = memoryInfo.lowMemory;
            if (z) {
                jSONObject.put(f1230, z);
            }
            jSONObject.put(f1229, memoryInfo.totalMem / j);
        } catch (Throwable th) {
            AbstractC0544.m5502(f1235, StringFog.decrypt("Lu+qfRAQBnYf6bF8BRAMdgbyqmtCRRJyDPjiMg==\n", "a53YEmIwYRM=\n") + th.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5501(JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (AbstractC0540.class) {
            jSONObject2 = f1209;
        }
        AbstractC0647.m5608(jSONObject, AbstractC0647.m5606(jSONObject2, false), false);
    }
}
