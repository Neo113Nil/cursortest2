package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.B5;
import com.ironsource.C4491k4;
import com.ironsource.C4549n8;
import com.ironsource.C4656t8;
import com.ironsource.C4674u8;
import com.ironsource.C4692v8;
import com.ironsource.J9;
import com.ironsource.Lc;
import com.ironsource.O9;
import com.ironsource.U9;
import com.ironsource.X9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceNetwork {

    /* renamed from: a, reason: collision with root package name */
    static final String f8529a = "IronSourceNetwork";
    private static U9 b;
    private static List<Lc> c = new ArrayList();
    private static X9 d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, String str3, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            B5 a2 = C4674u8.a(jSONObject);
            if (a2.a()) {
                C4656t8.a(a2, C4674u8.a(context, str, str2, str3, map));
            }
        }
    }

    public static synchronized void addInitListener(Lc lc) {
        synchronized (IronSourceNetwork.class) {
            X9 x9 = d;
            if (x9 == null) {
                c.add(lc);
            } else if (x9.b()) {
                lc.onSuccess();
            } else {
                lc.onFail(d.a());
            }
        }
    }

    public static synchronized void destroyAd(J9 j9) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.b(j9);
        }
    }

    public static synchronized e getControllerManager() {
        e a2;
        synchronized (IronSourceNetwork.class) {
            a2 = b.a();
        }
        return a2;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.e(f8529a, "applicationKey is NULL");
                return;
            }
            if (b == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, C4692v8.a(), map);
                } catch (Exception e) {
                    C4491k4.d().a(e);
                    Logger.e(f8529a, "Failed to init event tracker: " + e.getMessage());
                }
                b = O9.a(context, str, str2);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(J9 j9) {
        synchronized (IronSourceNetwork.class) {
            U9 u9 = b;
            if (u9 == null) {
                return false;
            }
            return u9.a(j9);
        }
    }

    public static synchronized void loadAd(J9 j9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.a(j9, map);
        }
    }

    public static synchronized void loadAdView(Activity activity, J9 j9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.b(activity, j9, map);
        }
    }

    public static void onPause(Activity activity) {
        U9 u9 = b;
        if (u9 == null) {
            return;
        }
        u9.b(activity);
    }

    public static void onResume(Activity activity) {
        U9 u9 = b;
        if (u9 == null) {
            return;
        }
        u9.a(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            U9 u9 = b;
            if (u9 == null) {
                return;
            }
            u9.c(activity);
        }
    }

    public static synchronized void showAd(Activity activity, J9 j9, Map<String, String> map) throws Exception {
        synchronized (IronSourceNetwork.class) {
            a();
            b.a(activity, j9, map);
        }
    }

    public static synchronized void updateInitFailed(C4549n8 c4549n8) {
        synchronized (IronSourceNetwork.class) {
            d = new X9(c4549n8);
            Iterator<Lc> it = c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c4549n8);
            }
            c.clear();
        }
    }

    public static synchronized void updateInitSucceeded() {
        synchronized (IronSourceNetwork.class) {
            d = new X9();
            Iterator<Lc> it = c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            c.clear();
        }
    }

    private static synchronized void a() throws Exception {
        synchronized (IronSourceNetwork.class) {
            if (b == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }
}
