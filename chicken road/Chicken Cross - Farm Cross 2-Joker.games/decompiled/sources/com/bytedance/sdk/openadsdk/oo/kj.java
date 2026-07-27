package com.bytedance.sdk.openadsdk.oo;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.lo;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj {
    private static Method gm = null;
    private static Method oo = null;
    private static Method pcc = null;
    private static Class<?> sf = null;
    private static boolean vj = false;

    static {
        sf();
    }

    private static void sf() {
        if (vj || Build.VERSION.SDK_INT < 35) {
            return;
        }
        try {
            if (gm()) {
                pcc = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                sf = cls;
                oo = cls.getMethod("getReason", new Class[0]);
                if (Build.VERSION.SDK_INT >= 36) {
                    gm = sf.getMethod("getStartComponent", new Class[0]);
                }
                vj = true;
            }
        } catch (Throwable th) {
            lo.gm(th.getMessage(), new Object[0]);
        }
    }

    private static boolean gm() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("s_i_e", 0) == 1;
    }

    public static JSONObject pcc() {
        Throwable th;
        JSONObject jSONObject;
        Method method;
        List list;
        Method method2;
        Method method3;
        if (Build.VERSION.SDK_INT < 35 || !gm()) {
            return null;
        }
        sf();
        try {
            jSONObject = new JSONObject();
            try {
                ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService(ActivityManager.class);
                if (activityManager != null && (method = pcc) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                    Object obj = list.get(0);
                    if (Build.VERSION.SDK_INT >= 36 && obj != null && (method3 = gm) != null) {
                        jSONObject.put("start_component", ((Integer) method3.invoke(obj, new Object[0])).intValue());
                    }
                    if (obj != null && (method2 = oo) != null) {
                        jSONObject.put("start_reason", ((Integer) method2.invoke(obj, new Object[0])).intValue());
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                lo.gm(th.getMessage(), new Object[0]);
                return jSONObject;
            }
        } catch (Throwable th3) {
            th = th3;
            jSONObject = null;
        }
        return jSONObject;
    }
}
