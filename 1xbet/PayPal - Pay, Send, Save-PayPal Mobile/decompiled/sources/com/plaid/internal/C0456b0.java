package com.plaid.internal;

/* renamed from: com.plaid.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0456b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5998a;
    public final com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions b;
    public final com.plaid.internal.Y c;
    public final com.plaid.internal.H0 d;
    public final com.plaid.internal.P6<com.plaid.internal.core.crashreporting.internal.models.Breadcrumb> e;
    public java.util.UUID f;
    public final kotlin.Lazy g;

    public C0456b0(android.content.Context context, com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashApiOptions, com.plaid.internal.Y y) {
        com.plaid.internal.O4 o4 = com.plaid.internal.O4.f5870a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashApiOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o4, "");
        this.f5998a = context;
        this.b = crashApiOptions;
        this.c = y;
        this.d = o4;
        this.e = new com.plaid.internal.P6<>();
        this.g = kotlin.LazyKt.lazy(new com.plaid.internal.C0446a0(this));
    }

    public final com.plaid.internal.core.crashreporting.internal.models.Crash a(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        this.f = randomUUID;
        kotlin.jvm.internal.Intrinsics.checkNotNull(randomUUID);
        java.lang.String obj = randomUUID.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(obj, "-", "", false, 4, (java.lang.Object) null);
        java.lang.String format = ((java.text.SimpleDateFormat) this.g.getValue()).format(new java.util.Date());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.lang.String message = th.getMessage();
        com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel crashLogLevel = com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel.ERROR;
        java.lang.String release = this.b.getRelease();
        java.lang.String a2 = this.c.a();
        com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface exceptionInterface = new com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface(th);
        com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface debugMetaInterface = new com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface();
        debugMetaInterface.getDebugImages().add(new com.plaid.internal.core.crashreporting.internal.models.DebugImage("5641b9b3-9d23-51b6-bf80-f3d7843a9b55", null, 2, null));
        return a(new com.plaid.internal.core.crashreporting.internal.models.Crash(replace$default, message, format, crashLogLevel, null, null, null, null, null, null, null, release, null, a2, null, null, null, exceptionInterface, debugMetaInterface, 120816, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.plaid.internal.core.crashreporting.internal.models.Crash a(com.plaid.internal.core.crashreporting.internal.models.Crash crash) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        crash.getBreadcrumbs$crash_reporting_release().clear();
        crash.getBreadcrumbs$crash_reporting_release().addAll(this.e.a());
        crash.getContexts$crash_reporting_release().clear();
        java.util.Map<java.lang.String, com.plaid.internal.core.crashreporting.internal.models.CrashContext> contexts$crash_reporting_release = crash.getContexts$crash_reporting_release();
        java.util.UUID uuid = this.f;
        android.content.Context context = this.f5998a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = java.lang.String.valueOf(packageInfo.versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                e = e;
                str2 = null;
            }
            try {
                android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                str3 = java.lang.String.valueOf(applicationInfo != null ? applicationInfo.loadLabel(context.getPackageManager()) : null);
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                e = e2;
                e.printStackTrace();
                str3 = null;
                if (str != null) {
                }
                if (str2 != null) {
                }
                if (str3 != null) {
                }
                if (linkedHashMap3.isEmpty()) {
                }
                contexts$crash_reporting_release.put(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, new com.plaid.internal.core.crashreporting.internal.models.CrashContext(0, uuid, null, null, linkedHashMap3 == null ? kotlin.collections.MapsKt.toMutableMap(linkedHashMap3) : null, 13, null));
                java.util.Map<java.lang.String, com.plaid.internal.core.crashreporting.internal.models.CrashContext> contexts$crash_reporting_release2 = crash.getContexts$crash_reporting_release();
                java.util.UUID uuid2 = this.f;
                com.plaid.internal.H0 h0 = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "");
                linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("id", h0.getId());
                linkedHashMap.put("manufacturer", h0.a());
                linkedHashMap.put("model", h0.b());
                linkedHashMap.put("name", h0.g());
                linkedHashMap.put("type", h0.d());
                linkedHashMap.put("version", h0.e());
                if (linkedHashMap.isEmpty()) {
                }
                contexts$crash_reporting_release2.put("device", new com.plaid.internal.core.crashreporting.internal.models.CrashContext(0, uuid2, null, null, linkedHashMap == null ? kotlin.collections.MapsKt.toMutableMap(linkedHashMap) : null, 13, null));
                java.util.Map<java.lang.String, com.plaid.internal.core.crashreporting.internal.models.CrashContext> contexts$crash_reporting_release3 = crash.getContexts$crash_reporting_release();
                java.util.UUID uuid3 = this.f;
                com.plaid.internal.H0 h02 = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h02, "");
                linkedHashMap2 = new java.util.LinkedHashMap();
                linkedHashMap2.put("name", h02.c());
                linkedHashMap2.put("version", com.plaid.internal.C0465c.a(h02));
                if (linkedHashMap2.isEmpty()) {
                }
                contexts$crash_reporting_release3.put("os", new com.plaid.internal.core.crashreporting.internal.models.CrashContext(0, uuid3, null, null, linkedHashMap2 != null ? kotlin.collections.MapsKt.toMutableMap(linkedHashMap2) : null, 13, null));
                return crash;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
            e = e3;
            str = null;
            str2 = null;
        }
        if (str != null) {
            linkedHashMap3.put("version", str);
        }
        if (str2 != null) {
            linkedHashMap3.put("build", str2);
        }
        if (str3 != null) {
            linkedHashMap3.put("name", str3);
        }
        if (linkedHashMap3.isEmpty()) {
            linkedHashMap3 = null;
        }
        contexts$crash_reporting_release.put(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, new com.plaid.internal.core.crashreporting.internal.models.CrashContext(0, uuid, null, null, linkedHashMap3 == null ? kotlin.collections.MapsKt.toMutableMap(linkedHashMap3) : null, 13, null));
        java.util.Map<java.lang.String, com.plaid.internal.core.crashreporting.internal.models.CrashContext> contexts$crash_reporting_release22 = crash.getContexts$crash_reporting_release();
        java.util.UUID uuid22 = this.f;
        com.plaid.internal.H0 h03 = this.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h03, "");
        linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("id", h03.getId());
        linkedHashMap.put("manufacturer", h03.a());
        linkedHashMap.put("model", h03.b());
        linkedHashMap.put("name", h03.g());
        linkedHashMap.put("type", h03.d());
        linkedHashMap.put("version", h03.e());
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        contexts$crash_reporting_release22.put("device", new com.plaid.internal.core.crashreporting.internal.models.CrashContext(0, uuid22, null, null, linkedHashMap == null ? kotlin.collections.MapsKt.toMutableMap(linkedHashMap) : null, 13, null));
        java.util.Map<java.lang.String, com.plaid.internal.core.crashreporting.internal.models.CrashContext> contexts$crash_reporting_release32 = crash.getContexts$crash_reporting_release();
        java.util.UUID uuid32 = this.f;
        com.plaid.internal.H0 h022 = this.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h022, "");
        linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("name", h022.c());
        linkedHashMap2.put("version", com.plaid.internal.C0465c.a(h022));
        if (linkedHashMap2.isEmpty()) {
            linkedHashMap2 = null;
        }
        contexts$crash_reporting_release32.put("os", new com.plaid.internal.core.crashreporting.internal.models.CrashContext(0, uuid32, null, null, linkedHashMap2 != null ? kotlin.collections.MapsKt.toMutableMap(linkedHashMap2) : null, 13, null));
        return crash;
    }
}
