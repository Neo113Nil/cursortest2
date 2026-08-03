package com.ironsource.mediationsdk.utils;

/* loaded from: classes5.dex */
public class IronSourceUtils {
    private static int A = 1;
    private static java.util.concurrent.atomic.AtomicBoolean B = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static java.lang.String C = null;
    private static java.lang.Boolean D = null;
    private static com.ironsource.mediationsdk.utils.IronSourceUtils E = new com.ironsource.mediationsdk.utils.IronSourceUtils();

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6471a = "default_is_events_formatter_type";
    private static final java.lang.String b = "default_is_events_url";
    private static final java.lang.String c = "default_is_non_connectivity_events";
    private static final java.lang.String d = "default_is_opt_in_events";
    private static final java.lang.String e = "default_is_opt_out_events";
    private static final java.lang.String f = "default_is_trigger_events";
    private static final java.lang.String g = "default_rv_events_formatter_type";
    private static final java.lang.String h = "default_rv_events_url";
    private static final java.lang.String i = "default_rv_non_connectivity_events";
    private static final java.lang.String j = "default_rv_opt_in_events";
    private static final java.lang.String k = "default_rv_opt_out_events";
    private static final java.lang.String l = "default_rv_trigger_events";
    private static final java.lang.String m = "default_pxl_events_url";
    private static final java.lang.String n = "default_pxl_trigger_events";
    private static final java.lang.String o = "default_app_opt_in_events";
    private static final java.lang.String p = "default_app_opt_out_events";
    private static final java.lang.String q = "default_app_events_url";
    private static final java.lang.String r = "default_app_trigger_events";
    private static final java.lang.String s = "default_app_events_formatter_type";
    private static final java.lang.String t = "default_app_non_connectivity_events";
    private static final java.lang.String u = "general_properties";
    private static final java.lang.String v = "last_response";
    private static final java.lang.String w = "firstSessionTimestamp";
    private static final java.lang.String x = "providerPriority";
    private static final java.lang.String y = "9.4.0";
    private static final java.lang.String z = "Mediation_Shared_Preferences";

    public static java.lang.String a(long j2, java.lang.String str) {
        return h(java.lang.String.format("%s%s%s", java.lang.Long.valueOf(j2), com.ironsource.mediationsdk.p.h().i(), str));
    }

    public static com.ironsource.mediationsdk.utils.IronSourceUtils b() {
        return E;
    }

    private static java.lang.String c(java.lang.String str) {
        return com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f6471a : (com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || com.ironsource.mediationsdk.utils.IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? g : com.ironsource.mediationsdk.utils.IronSourceConstants.APP_EVENT_TYPE.equals(str) ? s : "";
    }

    private static java.lang.String d(java.lang.String str) {
        return com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? c : com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? i : com.ironsource.mediationsdk.utils.IronSourceConstants.APP_EVENT_TYPE.equals(str) ? t : "";
    }

    private static java.lang.String e(java.lang.String str) {
        return com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? d : com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? j : com.ironsource.mediationsdk.utils.IronSourceConstants.APP_EVENT_TYPE.equals(str) ? o : "";
    }

    private static java.lang.String f(java.lang.String str) {
        return com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? e : com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? k : com.ironsource.mediationsdk.utils.IronSourceConstants.APP_EVENT_TYPE.equals(str) ? p : "";
    }

    public static boolean g() {
        return A == 1;
    }

    private static java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, java.util.Map<java.lang.String, org.json.JSONObject>> getAdUnitIds() {
        com.ironsource.Ua a2;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            a2 = com.ironsource.Jb.Y().f().a();
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e2);
        }
        if (a2 == null) {
            return hashMap;
        }
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : com.unity3d.mediation.LevelPlay.AdFormat.values()) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap.put(adFormat, hashMap2);
            for (java.lang.String str : a2.a(adFormat)) {
                if (!str.equals(com.ironsource.D1.e)) {
                    hashMap2.put(str, new org.json.JSONObject());
                }
            }
        }
        return hashMap;
    }

    @java.lang.Deprecated
    public static java.lang.String getSDKVersion() {
        return "9.4.0";
    }

    public static java.lang.String h(java.lang.String str) {
        try {
            return java.lang.String.format("%064x", new java.math.BigInteger(1, java.security.MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (java.security.NoSuchAlgorithmException e2) {
            com.ironsource.C3180n4.d().a(e2);
            if (str == null) {
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e2);
                return "";
            }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:" + str + ")", e2);
            return "";
        }
    }

    public static synchronized void i(java.lang.String str) {
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + java.lang.Long.toString(java.lang.System.currentTimeMillis()) + " text: " + str, 0);
        }
    }

    private static void setSerr(int i2) {
        A = i2;
    }

    private static java.lang.String b(java.lang.String str) {
        return com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? b : com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? h : com.ironsource.mediationsdk.utils.IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? m : com.ironsource.mediationsdk.utils.IronSourceConstants.APP_EVENT_TYPE.equals(str) ? q : "";
    }

    private static java.lang.String g(java.lang.String str) {
        return com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str) ? f : com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? l : com.ironsource.mediationsdk.utils.IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? n : com.ironsource.mediationsdk.utils.IronSourceConstants.APP_EVENT_TYPE.equals(str) ? r : "";
    }

    public static java.lang.String a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return com.ironsource.T3.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return com.ironsource.T3.g;
                }
            } else {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return com.ironsource.T3.b;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return com.ironsource.T3.g;
                    }
                }
            }
            return "none";
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.NATIVE.error("failed to connection type - exception = " + e2);
            return "none";
        }
    }

    public static synchronized void d(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String str2;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
                if (iArr != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                } else {
                    str2 = null;
                }
                edit.putString(g(str), str2);
                edit.apply();
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void e(android.content.Context context, java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
                edit.putString(b(str), str2);
                edit.apply();
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e2);
            }
        }
    }

    public static void f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static synchronized void c(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String str2;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
                if (iArr != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                } else {
                    str2 = null;
                }
                edit.putString(f(str), str2);
                edit.apply();
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e2);
            }
        }
    }

    public static synchronized void b(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String str2;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
                if (iArr != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                } else {
                    str2 = null;
                }
                edit.putString(e(str), str2);
                edit.apply();
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e2);
            }
        }
    }

    public static boolean g(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.NATIVE.error("failed to check if network is connected - exception = " + e2);
            return false;
        }
    }

    public static java.lang.String f() {
        java.lang.String a2 = com.ironsource.J6.a().a("userId");
        if (android.text.TextUtils.isEmpty(a2)) {
            return null;
        }
        return a2;
    }

    public static boolean f(android.content.Context context) {
        return com.ironsource.C2974bd.e(context);
    }

    public static synchronized void e(android.content.Context context, java.lang.String str) {
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
            try {
                java.lang.String e2 = com.ironsource.I9.e(com.ironsource.C3127k5.b().c(), str);
                if (!android.text.TextUtils.isEmpty(e2)) {
                    edit.putString(v, e2);
                } else {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("saveLastResponse: empty encrypted value, skipping cache write");
                }
            } catch (java.lang.Exception e3) {
                com.ironsource.C3180n4.d().a(e3);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("saveLastResponse: encryption failed, skipping cache write", e3);
            }
            edit.apply();
        }
    }

    public static synchronized void d(android.content.Context context, java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
                edit.putString(c(str), str2);
                edit.apply();
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e2);
            }
        }
    }

    public static synchronized int[] c(android.content.Context context, java.lang.String str) {
        int[] iArr;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            iArr = null;
            try {
                java.lang.String string = context.getSharedPreferences(z, 0).getString(f(str), null);
                if (!android.text.TextUtils.isEmpty(string)) {
                    java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static synchronized java.lang.String b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(z, 0).getString(b(str), str2);
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e2);
            }
        }
        return str2;
    }

    public static java.lang.String e(android.content.Context context) {
        java.lang.String string = context.getSharedPreferences(z, 0).getString(v, "");
        if (string != null && !string.isEmpty()) {
            try {
                java.lang.String b2 = com.ironsource.I9.b(com.ironsource.C3127k5.b().c(), string);
                if (b2 != null) {
                    if (!b2.isEmpty()) {
                        return b2;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            try {
                new org.json.JSONObject(string);
                return string;
            } catch (org.json.JSONException unused2) {
            }
        }
        return "";
    }

    public static synchronized int[] d(android.content.Context context, java.lang.String str) {
        int[] iArr;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            iArr = null;
            try {
                java.lang.String string = context.getSharedPreferences(z, 0).getString(g(str), null);
                if (!android.text.TextUtils.isEmpty(string)) {
                    java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static synchronized int[] b(android.content.Context context, java.lang.String str) {
        int[] iArr;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            iArr = null;
            try {
                java.lang.String string = context.getSharedPreferences(z, 0).getString(e(str), null);
                if (!android.text.TextUtils.isEmpty(string)) {
                    java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static void a(java.lang.Runnable runnable, java.lang.String str) {
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        thread.start();
    }

    public static synchronized void a(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String str2;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
                if (iArr != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    for (int i2 : iArr) {
                        sb.append(i2);
                        sb.append(",");
                    }
                    str2 = sb.toString();
                } else {
                    str2 = null;
                }
                edit.putString(d(str), str2);
                edit.apply();
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e2);
            }
        }
    }

    public static java.lang.String c(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getSharedPreferences(z, 0).getString(str, str2);
    }

    public static boolean c(android.content.Context context) {
        if (D == null) {
            D = java.lang.Boolean.valueOf(!com.ironsource.C3060g9.a(context));
        }
        return D.booleanValue();
    }

    public static long e() {
        return java.lang.System.currentTimeMillis();
    }

    public static java.lang.String c() {
        return com.ironsource.J6.a().a("userId");
    }

    public static org.json.JSONObject b(boolean z2) {
        return a(z2, false, 1);
    }

    public static void b(android.content.Context context, java.lang.String str, boolean z2) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
        edit.putBoolean(str, z2);
        edit.apply();
    }

    public static synchronized java.lang.String d() {
        java.lang.String str;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            if (B.compareAndSet(false, true)) {
                C = java.util.UUID.randomUUID().toString();
            }
            str = C;
        }
        return str;
    }

    public static void b(android.content.Context context, java.lang.String str, int i2) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
        edit.putInt(str, i2);
        edit.apply();
    }

    public static com.ironsource.P9 d(android.content.Context context) {
        java.lang.String str;
        com.ironsource.InterfaceC3362x7 a2 = com.ironsource.Jb.Y().a();
        if (context == null) {
            return null;
        }
        java.lang.String b2 = com.ironsource.mediationsdk.p.h().b(context);
        if (!android.text.TextUtils.isEmpty(b2)) {
            str = com.ironsource.mediationsdk.utils.IronSourceConstants.TYPE_GAID;
        } else {
            b2 = a2.a(context);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = com.ironsource.mediationsdk.utils.IronSourceConstants.TYPE_UUID;
        }
        return new com.ironsource.P9(b2, str);
    }

    public static synchronized java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            try {
                str2 = context.getSharedPreferences(z, 0).getString(c(str), str2);
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e2);
            }
        }
        return str2;
    }

    public static void b(android.content.Context context, java.lang.String str, long j2) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(z, 0).edit();
        edit.putLong(str, j2);
        edit.apply();
    }

    public static org.json.JSONObject b(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        if (jSONObject == null && jSONObject2 == null) {
            return new org.json.JSONObject();
        }
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        return jSONObject;
    }

    public static synchronized int[] a(android.content.Context context, java.lang.String str) {
        int[] iArr;
        synchronized (com.ironsource.mediationsdk.utils.IronSourceUtils.class) {
            iArr = null;
            try {
                java.lang.String string = context.getSharedPreferences(z, 0).getString(d(str), null);
                if (!android.text.TextUtils.isEmpty(string)) {
                    java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                    }
                    int size = arrayList.size();
                    iArr = new int[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        iArr[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
                    }
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e2);
            }
        }
        return iArr;
    }

    public static java.util.Map<java.lang.String, java.lang.String> b(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (jSONObject != org.json.JSONObject.NULL) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        hashMap.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return hashMap;
    }

    public static java.lang.String b(android.content.Context context) {
        if (com.ironsource.Jb.Y().a().b(context)) {
            return "Tablet";
        }
        return "Phone";
    }

    public static org.json.JSONObject a(boolean z2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z2) {
                jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
        }
        return jSONObject;
    }

    public static org.json.JSONObject a(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i2 = 0;
            for (int i3 = 0; i2 < list.size() && i3 < list2.size(); i3++) {
                java.lang.String str2 = list.get(i2);
                java.lang.String str3 = list2.get(i3);
                if (!android.text.TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i2++;
            }
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str + ";" + android.text.TextUtils.join(",", arrayList));
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
        }
        return jSONObject;
    }

    public static org.json.JSONObject a(boolean z2, boolean z3, int i2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z2) {
                jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z3 && i2 != -1) {
                jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, i2);
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
        }
        return jSONObject;
    }

    public static boolean a(android.content.Context context, java.lang.String str, boolean z2) {
        return context.getSharedPreferences(z, 0).getBoolean(str, z2);
    }

    public static int a(android.content.Context context, java.lang.String str, int i2) {
        return context.getSharedPreferences(z, 0).getInt(str, i2);
    }

    public static long a(android.content.Context context, java.lang.String str, long j2) {
        return context.getSharedPreferences(z, 0).getLong(str, j2);
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject.toString());
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject2.get(next);
            if ((obj instanceof org.json.JSONObject) && jSONObject3.optJSONObject(next) != null) {
                jSONObject3.put(next, a(jSONObject3.getJSONObject(next), (org.json.JSONObject) obj));
            } else {
                jSONObject3.put(next, obj);
            }
        }
        return jSONObject3;
    }

    public static java.util.List<android.util.Pair<java.lang.String, java.lang.String>> a(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (jSONObject != org.json.JSONObject.NULL) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new android.util.Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return arrayList;
    }

    public static boolean a(java.lang.String str) {
        try {
            java.lang.Class.forName(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static java.lang.String a() {
        try {
            return new java.lang.Throwable().getStackTrace()[1].getMethodName();
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            return "";
        }
    }
}
