package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class t1 {
    public static com.dyneti.android.dyscan.t1 t;

    /* renamed from: a, reason: collision with root package name */
    public long f3341a;
    public java.lang.String c;
    public java.lang.Float d;
    public java.lang.Long g;
    public java.lang.Long h;
    public java.lang.Long i;
    public java.lang.Long j;
    public boolean b = false;
    public final java.util.ArrayList e = new java.util.ArrayList();
    public boolean f = false;
    public final com.dyneti.android.dyscan.q1 k = new com.dyneti.android.dyscan.q1();
    public final com.dyneti.android.dyscan.s1 l = new com.dyneti.android.dyscan.s1();
    public final com.dyneti.android.dyscan.s1 m = new com.dyneti.android.dyscan.s1();
    public final com.dyneti.android.dyscan.s1 n = new com.dyneti.android.dyscan.s1();

    /* renamed from: o, reason: collision with root package name */
    public final com.dyneti.android.dyscan.r1 f3342o = new com.dyneti.android.dyscan.r1(this);
    public final com.dyneti.android.dyscan.r1 p = new com.dyneti.android.dyscan.r1(this);
    public final com.dyneti.android.dyscan.r1 q = new com.dyneti.android.dyscan.r1(this);
    public final com.dyneti.android.dyscan.r1 r = new com.dyneti.android.dyscan.r1(this);
    public final com.dyneti.android.dyscan.r1 s = new com.dyneti.android.dyscan.r1(this);

    public static com.dyneti.android.dyscan.t1 a() {
        if (t == null) {
            synchronized (com.dyneti.android.dyscan.t1.class) {
                if (t == null) {
                    t = new com.dyneti.android.dyscan.t1();
                }
            }
        }
        return t;
    }

    public static void a(com.dyneti.android.dyscan.n2 n2Var) {
        n2Var.a("buildOS", com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
        n2Var.a("deviceLanguage", java.util.Locale.getDefault().getLanguage());
        java.lang.String str = com.dyneti.android.dyscan.DyScan.isFraudVersion() ? "1.7.23_fraud" : "1.7.23";
        com.dyneti.android.dyscan.DyScan.isFraudVersion();
        if (com.dyneti.android.dyscan.DyScan.isEuVersion()) {
            str = str.concat("_eu");
        }
        n2Var.a("buildVersion", str);
        n2Var.a("logScanOnly", com.dyneti.android.dyscan.DyScan.isEuVersion());
        n2Var.a("androidSdkInt", android.os.Build.VERSION.SDK_INT);
        n2Var.a("androidBuildBoard", android.os.Build.BOARD);
        n2Var.a("androidBuildBrand", android.os.Build.BRAND);
        n2Var.a("androidBuildDevice", android.os.Build.DEVICE);
        n2Var.a("androidBuildHardware", android.os.Build.HARDWARE);
        n2Var.a("androidBuildManufacturer", android.os.Build.MANUFACTURER);
        n2Var.a("androidBuildProduct", android.os.Build.PRODUCT);
        java.lang.String str2 = android.os.Build.TAGS;
        n2Var.a("androidBuildTags", str2);
        boolean z = false;
        if (!com.dyneti.android.dyscan.r2.d()) {
            if (str2 == null || !str2.contains("test-keys")) {
                for (java.lang.String str3 : java.lang.System.getenv("PATH").split(io.ktor.sse.ServerSentEventKt.COLON)) {
                    if (!new java.io.File(str3, "su").exists()) {
                    }
                }
            }
            z = true;
            break;
        }
        n2Var.a("androidIsRooted", z);
        n2Var.a("isEmulator", com.dyneti.android.dyscan.r2.d());
        android.util.DisplayMetrics displayMetrics = android.content.res.Resources.getSystem().getDisplayMetrics();
        n2Var.b("screenResolution", new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels});
        n2Var.b("preferredLanguages", com.dyneti.android.dyscan.r2.b());
        n2Var.a("timeZone", java.util.TimeZone.getDefault().getID());
        try {
            n2Var.f3326a.put("deviceTimestamp", java.util.Calendar.getInstance().getTimeInMillis());
        } catch (org.json.JSONException e) {
            n2Var.a("deviceTimestamp", e);
        }
        n2Var.a("activeProcessorCount", java.lang.Runtime.getRuntime().availableProcessors());
        try {
            n2Var.f3326a.put("uptime", android.os.SystemClock.uptimeMillis());
        } catch (org.json.JSONException e2) {
            n2Var.a("uptime", e2);
        }
        n2Var.a("processName", com.dyneti.android.dyscan.r2.a());
    }
}
