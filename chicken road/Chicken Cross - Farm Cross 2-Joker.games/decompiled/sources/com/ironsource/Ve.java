package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class Ve {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";
    static String N = "";
    static String O = "";

    /* renamed from: a, reason: collision with root package name */
    private static String f7974a = "https://i-sdk.mediation.unity3d.com/sdk/v";
    private static final String b = "?request=";
    private static final String c = "platform";
    private static final String d = "applicationKey";
    private static final String e = "applicationUserId";
    private static final String f = "sdkVersion";
    private static final String g = "pluginType";
    private static final String h = "pluginVersion";
    private static final String i = "plugin_fw_v";
    private static final String j = "advId";
    private static final String k = "auid";
    private static final String l = "isDemandOnly";
    private static final String m = "serr";
    private static final String n = "appVer";
    private static final String o = "osVer";
    private static final String p = "devModel";
    private static final String q = "devMake";
    private static final String r = "connType";
    private static final String s = "rawConnType";
    private static final String t = "mt";
    private static final String u = "fs";
    private static final String v = "coppa";
    private static final String w = "dff";
    private static final String x = "browserUserAgent";
    private static final String y = "deviceLang";
    private static final String z = "bundleId";

    public static String a() {
        return N;
    }

    public static String b() {
        return O;
    }

    public static void c(String str) {
        O = str;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z2, List<Pair<String, String>> list, boolean z3) throws UnsupportedEncodingException {
        String str5;
        List<String> list2;
        InterfaceC4673u7 a2 = Ib.a0().a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z2) {
            arrayList.add(new Pair(G, "1"));
        }
        if (!IronSourceUtils.g()) {
            arrayList.add(new Pair(m, "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(j, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String b2 = C1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(b2)) {
            arrayList.add(new Pair(n, b2));
        }
        arrayList.add(new Pair(o, Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(q, Build.MANUFACTURER));
        arrayList.add(new Pair(p, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.c(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> c2 = C4515la.b().c();
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.b)) {
            arrayList.add(new Pair("coppa", c2.get(com.ironsource.mediationsdk.metadata.a.b).get(0)));
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            String str6 = c2.get(com.ironsource.mediationsdk.metadata.a.f).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.k)) {
                arrayList.add(new Pair("ts", "1"));
            }
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.d)) {
            String str7 = c2.get(com.ironsource.mediationsdk.metadata.a.d).get(0);
            if (!TextUtils.isEmpty(str7) && str7.equalsIgnoreCase("true")) {
                arrayList.add(new Pair(w, "1"));
            }
        }
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.e) && (list2 = c2.get(com.ironsource.mediationsdk.metadata.a.e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.e, list2.get(0)));
        }
        String a3 = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(a3)) {
            arrayList.add(new Pair(r, a3));
        }
        String d2 = R3.d(context);
        if (!TextUtils.isEmpty(d2)) {
            arrayList.add(new Pair(s, d2));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String s2 = a2.s();
        if (s2.length() != 0) {
            arrayList.add(new Pair(x, s2));
        }
        try {
            str5 = a2.d(context) + "-" + a2.B(context);
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            str5 = null;
        }
        if (str5 != null && str5.length() != 0) {
            arrayList.add(new Pair(y, str5));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + Q3.b(context)));
        arrayList.add(new Pair("mnc", "" + Q3.c(context)));
        String H2 = a2.H(context);
        if (!TextUtils.isEmpty(H2)) {
            arrayList.add(new Pair("icc", H2));
        }
        String v2 = a2.v(context);
        if (!TextUtils.isEmpty(v2)) {
            arrayList.add(new Pair(D, v2));
        }
        String d3 = a2.d();
        if (!TextUtils.isEmpty(d3)) {
            arrayList.add(new Pair("tz", d3));
        }
        arrayList.add(new Pair(F, "" + a2.m()));
        String e3 = a2.e(context);
        if (!TextUtils.isEmpty(e3)) {
            arrayList.add(new Pair("auid", e3));
        }
        if (z3) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(L6.j0, String.valueOf(C4505l0.a())));
        String a4 = a(arrayList);
        N = a4;
        return a(LevelPlay.getSdkVersion()) + URLEncoder.encode(I9.e(C4457i5.b().c(), a4), "UTF-8");
    }

    private static void b(String str) {
        f7974a = str;
    }

    public static String a(String str, boolean z2, int i2) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z2)));
        arrayList.add(new Pair("placementId", Integer.toString(i2)));
        return str + "&" + a(arrayList);
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8");
        }
        return str;
    }

    private static String a(String str) {
        return f7974a + str + b;
    }
}
