package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Xi {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.Context f5051a = null;
    public static java.lang.String b = "";
    public static java.lang.String c;
    public static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    public static final kotlin.Lazy e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Xi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.Xi.a();
        }
    });
    public static boolean f;
    public static final java.util.concurrent.ExecutorService g;
    public static final kotlinx.coroutines.CoroutineScope h;
    public static int i;

    public static final com.inmobi.media.Fc a() {
        return new com.inmobi.media.Fc();
    }

    public static java.lang.String b(android.content.Context context) {
        android.content.Context applicationContext;
        java.lang.String str = "";
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (java.lang.Exception e2) {
                try {
                    throw new com.inmobi.media.C2704ql(e2.getMessage());
                } catch (com.inmobi.media.C2704ql e3) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
                    e3.getMessage();
                    kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(new com.inmobi.media.M2(e3));
                    try {
                        java.lang.String property = java.lang.System.getProperty("http.agent");
                        if (property != null) {
                            str = property;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
                    } catch (java.lang.Exception e4) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
                        e4.getMessage();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
                        kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
                        com.inmobi.media.AbstractC2665p9.a(e4);
                    }
                    return str;
                } catch (java.lang.Exception e5) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
                    e5.getMessage();
                    return str;
                }
            }
        } else {
            applicationContext = null;
        }
        java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(applicationContext);
        kotlin.jvm.internal.Intrinsics.checkNotNull(defaultUserAgent);
        return defaultUserAgent;
    }

    public static final java.lang.String c() {
        if (b.length() == 0) {
            b = b(f5051a);
        }
        return b;
    }

    public static boolean c(android.content.Context context) {
        return true;
    }

    public static final boolean d() {
        return i == 2;
    }

    public static void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            com.inmobi.media.X6.a(new java.io.File(context != null ? context.getFilesDir() : null, "im_cached_content"));
        } catch (java.lang.Exception e2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
            e2.getMessage();
        }
    }

    public static final void a(android.content.Context context, android.app.Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Xi", "TAG");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Xi", "name");
        java.util.concurrent.ExecutorService COMPONENT_SERVICE = java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("Xi", false));
        g = COMPONENT_SERVICE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(COMPONENT_SERVICE, "COMPONENT_SERVICE");
        h = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(COMPONENT_SERVICE));
    }

    public static java.lang.String b() {
        android.content.Context context = f5051a;
        if (context == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "coppa_store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("im_accid", com.ironsource.X3.i.W);
        return a2.f4815a.getString("im_accid", null);
    }
}
