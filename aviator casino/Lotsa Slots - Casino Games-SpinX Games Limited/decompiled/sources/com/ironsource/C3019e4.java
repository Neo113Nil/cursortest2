package com.ironsource;

/* renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3019e4 {
    private static final java.lang.String b = "iads/";
    private static final java.lang.String c = "CONTROLLER_FROM_BUNDLE";
    private static final java.lang.String d = "controllerVersion";
    private static final java.lang.String e = "controller_html_loaded_from_bundle";
    private static volatile boolean g;

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3019e4 f6209a = new com.ironsource.C3019e4();
    private static final java.util.List<java.lang.String> f = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.ironsource.X3.f, com.ironsource.X3.g, "mobileController.min.css", "index.html", "index.css", "index.js"});

    private C3019e4() {
    }

    public static final java.util.List<java.lang.String> a() {
        return f;
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void b() {
    }

    @kotlin.jvm.JvmStatic
    public static final void a(android.content.Context context, boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        g = z;
        if (context != null) {
            com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, e, z);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean b(android.content.Context context) {
        if (context != null) {
            g = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, e, false);
        }
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [byte[]] */
    @kotlin.jvm.JvmStatic
    public static final byte[] a(android.content.Context context, java.lang.String fileName) {
        java.lang.Throwable th;
        ?? r0 = b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
        byte[] bArr = null;
        if (context == null) {
            return null;
        }
        try {
            try {
                java.io.InputStream inputStream = context.getAssets().open(b + fileName);
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
                    r0 = kotlin.io.ByteStreamsKt.readBytes(inputStream);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r0 = 0;
                }
                try {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(inputStream, null);
                    return r0;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        kotlin.io.CloseableKt.closeFinally(inputStream, th);
                        throw th4;
                    }
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
                e.printStackTrace();
                return bArr;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            bArr = r0;
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + fileName);
            e.printStackTrace();
            return bArr;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String a(android.content.Context context) {
        if (context != null) {
            try {
                byte[] a2 = a(context, d);
                java.lang.String obj = a2 != null ? kotlin.text.StringsKt.trim((java.lang.CharSequence) new java.lang.String(a2, kotlin.text.Charsets.UTF_8)).toString() : null;
                if (obj != null) {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: " + obj);
                    return obj;
                }
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (java.lang.Exception e2) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return null;
    }
}
