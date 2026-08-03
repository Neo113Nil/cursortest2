package com.ironsource;

/* loaded from: classes5.dex */
public class Xe {
    private static final java.lang.String A = "mcc";
    private static final java.lang.String B = "mnc";
    private static final java.lang.String C = "icc";
    private static final java.lang.String D = "mCar";
    private static final java.lang.String E = "tz";
    private static final java.lang.String F = "tzOff";
    private static final java.lang.String G = "rvManual";
    private static final java.lang.String H = "ts";
    private static final java.lang.String I = "android";
    private static final java.lang.String J = "impression";
    private static final java.lang.String K = "placementId";
    private static final java.lang.String L = "=";
    private static final java.lang.String M = "&";
    static java.lang.String N = "";
    static java.lang.String O = "";

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.String f6082a = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final java.lang.String b = "?request=";
    private static final java.lang.String c = "platform";
    private static final java.lang.String d = "applicationKey";
    private static final java.lang.String e = "applicationUserId";
    private static final java.lang.String f = "sdkVersion";
    private static final java.lang.String g = "pluginType";
    private static final java.lang.String h = "pluginVersion";
    private static final java.lang.String i = "plugin_fw_v";
    private static final java.lang.String j = "advId";
    private static final java.lang.String k = "auid";
    private static final java.lang.String l = "isDemandOnly";
    private static final java.lang.String m = "serr";
    private static final java.lang.String n = "appVer";
    private static final java.lang.String o = "osVer";
    private static final java.lang.String p = "devModel";
    private static final java.lang.String q = "devMake";
    private static final java.lang.String r = "connType";
    private static final java.lang.String s = "rawConnType";
    private static final java.lang.String t = "mt";
    private static final java.lang.String u = "fs";
    private static final java.lang.String v = "coppa";
    private static final java.lang.String w = "dff";
    private static final java.lang.String x = "browserUserAgent";
    private static final java.lang.String y = "deviceLang";
    private static final java.lang.String z = "bundleId";

    public static java.lang.String a() {
        return N;
    }

    public static java.lang.String b() {
        return O;
    }

    public static void c(java.lang.String str) {
        O = str;
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list, boolean z3) throws java.io.UnsupportedEncodingException {
        java.lang.String str5;
        java.util.List<java.lang.String> list2;
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("platform", "android"));
        arrayList.add(new android.util.Pair("applicationKey", str));
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(new android.util.Pair("applicationUserId", str2));
        }
        arrayList.add(new android.util.Pair("sdkVersion", com.unity3d.mediation.LevelPlay.getSdkVersion()));
        if (z2) {
            arrayList.add(new android.util.Pair(G, "1"));
        }
        if (!com.ironsource.mediationsdk.utils.IronSourceUtils.g()) {
            arrayList.add(new android.util.Pair(m, "0"));
        }
        if (!android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new android.util.Pair(g, com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginType()));
        }
        if (!android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new android.util.Pair(h, com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new android.util.Pair(i, com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            arrayList.add(new android.util.Pair(j, str3));
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            arrayList.add(new android.util.Pair("mt", str4));
        }
        java.lang.String b2 = com.ironsource.E1.b(context, context.getPackageName());
        if (!android.text.TextUtils.isEmpty(b2)) {
            arrayList.add(new android.util.Pair(n, b2));
        }
        arrayList.add(new android.util.Pair(o, android.os.Build.VERSION.SDK_INT + ""));
        arrayList.add(new android.util.Pair(q, android.os.Build.MANUFACTURER));
        arrayList.add(new android.util.Pair(p, android.os.Build.MODEL));
        arrayList.add(new android.util.Pair("fs", (com.ironsource.mediationsdk.utils.IronSourceUtils.c(context) ? 1 : 0) + ""));
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> c2 = com.ironsource.C3150la.b().c();
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.b)) {
            arrayList.add(new android.util.Pair("coppa", c2.get(com.ironsource.mediationsdk.metadata.a.b).get(0)));
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            java.lang.String str6 = c2.get(com.ironsource.mediationsdk.metadata.a.f).get(0);
            if (!android.text.TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.j)) {
                arrayList.add(new android.util.Pair("ts", "1"));
            }
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.d)) {
            java.lang.String str7 = c2.get(com.ironsource.mediationsdk.metadata.a.d).get(0);
            if (!android.text.TextUtils.isEmpty(str7) && str7.equalsIgnoreCase("true")) {
                arrayList.add(new android.util.Pair(w, "1"));
            }
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.e) && (list2 = c2.get(com.ironsource.mediationsdk.metadata.a.e)) != null) {
            arrayList.add(new android.util.Pair(com.ironsource.mediationsdk.metadata.a.e, list2.get(0)));
        }
        java.lang.String a3 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context);
        if (!android.text.TextUtils.isEmpty(a3)) {
            arrayList.add(new android.util.Pair(r, a3));
        }
        java.lang.String d2 = com.ironsource.U3.d(context);
        if (!android.text.TextUtils.isEmpty(d2)) {
            arrayList.add(new android.util.Pair(s, d2));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        java.lang.String s2 = a2.s();
        if (s2.length() != 0) {
            arrayList.add(new android.util.Pair(x, s2));
        }
        try {
            str5 = a2.d(context) + "-" + a2.B(context);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            arrayList.add(new android.util.Pair(y, str5));
        }
        arrayList.add(new android.util.Pair("bundleId", context.getPackageName()));
        arrayList.add(new android.util.Pair("mcc", "" + com.ironsource.T3.b(context)));
        arrayList.add(new android.util.Pair("mnc", "" + com.ironsource.T3.c(context)));
        java.lang.String H2 = a2.H(context);
        if (!android.text.TextUtils.isEmpty(H2)) {
            arrayList.add(new android.util.Pair("icc", H2));
        }
        java.lang.String v2 = a2.v(context);
        if (!android.text.TextUtils.isEmpty(v2)) {
            arrayList.add(new android.util.Pair(D, v2));
        }
        java.lang.String d3 = a2.d();
        if (!android.text.TextUtils.isEmpty(d3)) {
            arrayList.add(new android.util.Pair("tz", d3));
        }
        arrayList.add(new android.util.Pair(F, "" + a2.m()));
        java.lang.String e3 = a2.e(context);
        if (!android.text.TextUtils.isEmpty(e3)) {
            arrayList.add(new android.util.Pair("auid", e3));
        }
        if (z3) {
            arrayList.add(new android.util.Pair("isDemandOnly", "1"));
        }
        arrayList.add(new android.util.Pair(com.ironsource.M6.j0, java.lang.String.valueOf(com.ironsource.C3140l0.a())));
        java.lang.String a4 = a(arrayList);
        N = a4;
        return a(com.unity3d.mediation.LevelPlay.getSdkVersion()) + java.net.URLEncoder.encode(com.ironsource.I9.e(com.ironsource.C3127k5.b().c(), a4), "UTF-8");
    }

    private static void b(java.lang.String str) {
        f6082a = str;
    }

    public static java.lang.String a(java.lang.String str, boolean z2, int i2) throws java.io.UnsupportedEncodingException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("impression", java.lang.Boolean.toString(z2)));
        arrayList.add(new android.util.Pair("placementId", java.lang.Integer.toString(i2)));
        return str + "&" + a(arrayList);
    }

    private static java.lang.String a(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) throws java.io.UnsupportedEncodingException {
        java.lang.String str = "";
        for (android.util.Pair<java.lang.String, java.lang.String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((java.lang.String) pair.first) + "=" + java.net.URLEncoder.encode((java.lang.String) pair.second, "UTF-8");
        }
        return str;
    }

    private static java.lang.String a(java.lang.String str) {
        return f6082a + str + b;
    }
}
