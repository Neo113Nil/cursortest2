package com.ironsource.sdk;

/* loaded from: classes5.dex */
public class IronSourceNetwork {

    /* renamed from: a, reason: collision with root package name */
    static final java.lang.String f6590a = "IronSourceNetwork";
    private static com.ironsource.U9 b;
    private static java.util.List<com.ironsource.Lc> c = new java.util.ArrayList();
    private static com.ironsource.X9 d;

    private static void a(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        if (jSONObject != null) {
            com.ironsource.D5 a2 = com.ironsource.C3345w8.a(jSONObject);
            if (a2.a()) {
                com.ironsource.C3327v8.a(a2, com.ironsource.C3345w8.a(context, str, str2, str3, map));
            }
        }
    }

    public static synchronized void addInitListener(com.ironsource.Lc lc) {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            com.ironsource.X9 x9 = d;
            if (x9 == null) {
                c.add(lc);
            } else if (x9.b()) {
                lc.onSuccess();
            } else {
                lc.onFail(d.a());
            }
        }
    }

    public static synchronized void destroyAd(com.ironsource.J9 j9) throws java.lang.Exception {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            a();
            b.b(j9);
        }
    }

    public static synchronized com.ironsource.sdk.controller.e getControllerManager() {
        com.ironsource.sdk.controller.e a2;
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            a2 = b.a();
        }
        return a2;
    }

    public static java.lang.String getVersion() {
        return com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            if (android.text.TextUtils.isEmpty(str)) {
                com.ironsource.sdk.utils.Logger.e(f6590a, "applicationKey is NULL");
                return;
            }
            if (b == null) {
                com.ironsource.sdk.utils.SDKUtils.setInitSDKParams(map);
                try {
                    a(context, com.ironsource.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, com.ironsource.C3363x8.a(), map);
                } catch (java.lang.Exception e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.sdk.utils.Logger.e(f6590a, "Failed to init event tracker: " + e.getMessage());
                }
                b = com.ironsource.O9.a(context, str, str2);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(com.ironsource.J9 j9) {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            com.ironsource.U9 u9 = b;
            if (u9 == null) {
                return false;
            }
            return u9.a(j9);
        }
    }

    public static synchronized void loadAd(com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            a();
            b.a(j9, map);
        }
    }

    public static synchronized void loadAdView(android.app.Activity activity, com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            a();
            b.b(activity, j9, map);
        }
    }

    public static void onPause(android.app.Activity activity) {
        com.ironsource.U9 u9 = b;
        if (u9 == null) {
            return;
        }
        u9.b(activity);
    }

    public static void onResume(android.app.Activity activity) {
        com.ironsource.U9 u9 = b;
        if (u9 == null) {
            return;
        }
        u9.a(activity);
    }

    public static synchronized void release(android.app.Activity activity) {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            com.ironsource.U9 u9 = b;
            if (u9 == null) {
                return;
            }
            u9.c(activity);
        }
    }

    public static synchronized void showAd(android.app.Activity activity, com.ironsource.J9 j9, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            a();
            b.a(activity, j9, map);
        }
    }

    public static synchronized void updateInitFailed(com.ironsource.C3220p8 c3220p8) {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            d = new com.ironsource.X9(c3220p8);
            java.util.Iterator<com.ironsource.Lc> it = c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c3220p8);
            }
            c.clear();
        }
    }

    public static synchronized void updateInitSucceeded() {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            d = new com.ironsource.X9();
            java.util.Iterator<com.ironsource.Lc> it = c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            c.clear();
        }
    }

    private static synchronized void a() throws java.lang.Exception {
        synchronized (com.ironsource.sdk.IronSourceNetwork.class) {
            if (b == null) {
                throw new java.lang.NullPointerException("Call initSDK first");
            }
        }
    }
}
