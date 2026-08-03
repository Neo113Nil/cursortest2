package com.ironsource;

/* loaded from: classes5.dex */
public class K6 implements java.lang.Runnable {
    public static final java.lang.String M = "sdkVersion";
    public static final java.lang.String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private android.content.Context K;

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5801a = getClass().getSimpleName();
    private final java.lang.String b = "bundleId";
    private final java.lang.String c = "advertisingId";
    private final java.lang.String d = com.ironsource.X3.j.M;
    private final java.lang.String e = "appKey";
    private final java.lang.String f = com.ironsource.Va.o;
    private final java.lang.String g = "osVersion";
    private final java.lang.String h = "connectionType";
    private final java.lang.String i = "rawConnectionType";
    private final java.lang.String j = "language";
    private final java.lang.String k = "deviceOEM";
    private final java.lang.String l = "deviceModel";
    private final java.lang.String m = com.ironsource.X3.j.r;
    private final java.lang.String n = com.ironsource.Va.r;
    private final java.lang.String o = com.ironsource.Va.s;
    private final java.lang.String p = "battery";
    private final java.lang.String q = "gmtMinutesOffset";
    private final java.lang.String r = "appVersion";
    private final java.lang.String s = com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY;
    private final java.lang.String t = "pluginType";
    private final java.lang.String u = "pluginVersion";
    private final java.lang.String v = "plugin_fw_v";
    private final java.lang.String w = com.ironsource.Va.u;
    private final java.lang.String x = com.ironsource.Va.t;
    private final java.lang.String y = com.ironsource.M6.c1;
    private final java.lang.String z = com.ironsource.Va.w;
    private final java.lang.String A = "mcc";
    private final java.lang.String B = "mnc";
    private final java.lang.String C = "icc";
    private final java.lang.String D = "tz";
    private final java.lang.String E = "auid";
    private final java.lang.String F = "userLat";
    private final java.lang.String G = "publisherAPI";
    private final java.lang.String H = "missingDependencies";
    private final java.lang.String I = "missingManifest";
    private final java.lang.String J = "other";
    private final com.ironsource.InterfaceC3362x7 L = com.ironsource.Jb.Y().a();

    private K6() {
    }

    private java.util.Map<java.lang.String, java.lang.Object> a() {
        boolean z;
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, com.ironsource.mediationsdk.utils.IronSourceUtils.d());
        java.lang.String e = e();
        if (!android.text.TextUtils.isEmpty(e)) {
            hashMap.put("bundleId", e);
            java.lang.String b = com.ironsource.E1.b(this.K, e);
            if (!android.text.TextUtils.isEmpty(b)) {
                hashMap.put("appVersion", b);
            }
        }
        hashMap.put("appKey", c());
        java.lang.String J = this.L.J(this.K);
        java.lang.String c = this.L.c(this.K);
        boolean z2 = false;
        if (android.text.TextUtils.isEmpty(J)) {
            J = this.L.a(this.K);
            z = true;
            str = !android.text.TextUtils.isEmpty(J) ? com.ironsource.mediationsdk.utils.IronSourceConstants.TYPE_UUID : "";
        } else {
            str = com.ironsource.mediationsdk.utils.IronSourceConstants.TYPE_GAID;
            z = false;
        }
        if (!android.text.TextUtils.isEmpty(J)) {
            hashMap.put("advertisingId", J);
            hashMap.put(com.ironsource.Va.t, str);
        }
        if (!android.text.TextUtils.isEmpty(c)) {
            z2 = java.lang.Boolean.parseBoolean(c);
            hashMap.put(com.ironsource.X3.j.M, java.lang.Boolean.valueOf(z2));
        }
        if (z || z2) {
            hashMap.put(N, a(c));
        }
        hashMap.put(com.ironsource.Va.o, h());
        if (!android.text.TextUtils.isEmpty(b())) {
            hashMap.put("osVersion", b());
        }
        java.lang.String a2 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(this.K);
        if (!android.text.TextUtils.isEmpty(a2)) {
            hashMap.put("connectionType", a2);
        }
        java.lang.String d = com.ironsource.U3.d(this.K);
        if (!android.text.TextUtils.isEmpty(d)) {
            hashMap.put("rawConnectionType", d);
        }
        hashMap.put("sdkVersion", r());
        java.lang.String l = l();
        if (!android.text.TextUtils.isEmpty(l)) {
            hashMap.put("language", l);
        }
        java.lang.String g = g();
        if (!android.text.TextUtils.isEmpty(g)) {
            hashMap.put("deviceOEM", g);
        }
        java.lang.String f = f();
        if (!android.text.TextUtils.isEmpty(f)) {
            hashMap.put("deviceModel", f);
        }
        java.lang.String n = n();
        if (!android.text.TextUtils.isEmpty(n)) {
            hashMap.put(com.ironsource.X3.j.r, n);
        }
        hashMap.put(com.ironsource.Va.s, java.lang.Long.valueOf(k()));
        hashMap.put(com.ironsource.Va.r, java.lang.Long.valueOf(i()));
        hashMap.put("battery", java.lang.Integer.valueOf(d()));
        int j = j();
        if (a(j)) {
            hashMap.put("gmtMinutesOffset", java.lang.Integer.valueOf(j));
        }
        java.lang.String p = p();
        if (!android.text.TextUtils.isEmpty(p)) {
            hashMap.put("pluginType", p);
        }
        java.lang.String q = q();
        if (!android.text.TextUtils.isEmpty(q)) {
            hashMap.put("pluginVersion", q);
        }
        java.lang.String o = o();
        if (!android.text.TextUtils.isEmpty(o)) {
            hashMap.put("plugin_fw_v", o);
        }
        java.lang.String valueOf = java.lang.String.valueOf(this.L.p());
        if (!android.text.TextUtils.isEmpty(valueOf)) {
            hashMap.put(com.ironsource.Va.u, valueOf);
        }
        java.lang.String m = m();
        if (!android.text.TextUtils.isEmpty(m)) {
            hashMap.put(com.ironsource.M6.c1, m);
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(com.ironsource.mediationsdk.utils.IronSourceUtils.c(this.K));
        if (!android.text.TextUtils.isEmpty(valueOf2)) {
            hashMap.put(com.ironsource.Va.w, valueOf2);
        }
        java.lang.String e2 = this.L.e(this.K);
        if (!android.text.TextUtils.isEmpty(e2)) {
            hashMap.put("auid", e2);
        }
        hashMap.put("mcc", java.lang.Integer.valueOf(com.ironsource.T3.b(this.K)));
        hashMap.put("mnc", java.lang.Integer.valueOf(com.ironsource.T3.c(this.K)));
        java.lang.String H = this.L.H(this.K);
        if (!android.text.TextUtils.isEmpty(H)) {
            hashMap.put("icc", H);
        }
        java.lang.String d2 = this.L.d();
        if (!android.text.TextUtils.isEmpty(d2)) {
            hashMap.put("tz", d2);
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("collecting data for events: " + hashMap);
        return hashMap;
    }

    private java.lang.String b() {
        try {
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            return "" + android.os.Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    private java.lang.String c() {
        return com.ironsource.mediationsdk.p.h().i();
    }

    private int d() {
        try {
            android.content.Intent registerReceiver = this.K.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, this.f5801a + ":getBatteryLevel()", e);
            return -1;
        }
    }

    private java.lang.String e() {
        try {
            return this.K.getPackageName();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    private java.lang.String f() {
        try {
            return android.os.Build.MODEL;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    private java.lang.String g() {
        try {
            return android.os.Build.MANUFACTURER;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    private java.lang.String h() {
        return com.ironsource.X3.d;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private int j() {
        try {
            java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
            return java.lang.Math.round(((timeZone.getOffset(java.util.Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, this.f5801a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    private long k() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return -1L;
        }
    }

    private java.lang.String l() {
        try {
            return java.util.Locale.getDefault().getLanguage();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return "";
        }
    }

    private java.lang.String m() {
        return com.ironsource.mediationsdk.p.h().k();
    }

    private java.lang.String n() {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) this.K.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                return "";
            }
            java.lang.String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, this.f5801a + ":getMobileCarrier()", e);
            return "";
        }
    }

    private java.lang.String r() {
        return com.unity3d.mediation.LevelPlay.getSdkVersion();
    }

    private boolean s() {
        try {
            return android.os.Environment.getExternalStorageState().equals("mounted");
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.ironsource.J6.a().a(a());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e);
        }
    }

    private java.lang.String o() {
        try {
            return com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    private java.lang.String p() {
        try {
            return com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginType();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    private java.lang.String q() {
        try {
            return com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginVersion();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    public K6(android.content.Context context) {
        this.K = context.getApplicationContext();
    }

    private boolean a(int i) {
        return i <= P && i >= Q && i % 15 == 0;
    }

    private java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!com.ironsource.V4.f6012a.b()) {
            return "publisherAPI";
        }
        if (!this.L.h(this.K)) {
            return "missingManifest";
        }
        if (!java.lang.Boolean.parseBoolean(str)) {
            return "other";
        }
        return "userLat";
    }
}
