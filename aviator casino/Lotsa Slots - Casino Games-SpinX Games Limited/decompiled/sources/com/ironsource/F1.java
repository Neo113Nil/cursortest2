package com.ironsource;

/* loaded from: classes5.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5694a;
    private final java.util.HashSet<java.lang.String> b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final boolean e;
    private final int f;
    private final boolean g;

    public F1(org.json.JSONObject applicationCrashReporterSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f5694a = applicationCrashReporterSettings.optBoolean("enabled", false);
        java.util.List<java.lang.String> b = com.ironsource.C3079ha.b(applicationCrashReporterSettings.optJSONArray(com.ironsource.H1.b));
        this.b = b != null ? kotlin.collections.CollectionsKt.toHashSet(b) : null;
        java.lang.String optString = applicationCrashReporterSettings.optString(com.ironsource.H1.c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.c = optString;
        java.lang.String optString2 = applicationCrashReporterSettings.optString(com.ironsource.H1.d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.d = optString2;
        this.e = applicationCrashReporterSettings.optBoolean(com.ironsource.H1.e, false);
        this.f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.g = applicationCrashReporterSettings.optBoolean(com.ironsource.H1.g, false);
    }

    public final int a() {
        return this.f;
    }

    public final java.util.HashSet<java.lang.String> b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.d;
    }

    public final java.lang.String d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f5694a;
    }

    public final boolean g() {
        return this.g;
    }
}
