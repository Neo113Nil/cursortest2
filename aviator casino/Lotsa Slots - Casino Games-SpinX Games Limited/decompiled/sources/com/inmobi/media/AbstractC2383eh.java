package com.inmobi.media;

/* renamed from: com.inmobi.media.eh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2383eh {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f5181a;
    public static com.inmobi.media.C2752sh b;
    public static int c;
    public static final kotlin.Lazy d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.eh$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(com.inmobi.media.AbstractC2383eh.c());
        }
    });

    public static void a() {
        com.inmobi.media.La la;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        java.lang.String str = null;
        if (context != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            la = com.inmobi.media.Ka.a(context, "purchase_store");
        } else {
            la = null;
        }
        if (la != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("purchase_pref", com.ironsource.X3.i.W);
            str = la.f4815a.getString("purchase_pref", null);
        }
        if (str != null) {
            f5181a = str;
        }
    }

    public static void b() {
        try {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context == null) {
                return;
            }
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
            if (((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    c = 1;
                    com.inmobi.media.C2752sh c2752sh = new com.inmobi.media.C2752sh();
                    b = c2752sh;
                    c2752sh.a(context, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.eh$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.inmobi.media.AbstractC2383eh.a((com.inmobi.media.C2410fh) obj);
                        }
                    });
                }
            }
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            e.getMessage();
        }
    }

    public static final boolean c() {
        try {
            java.lang.Class.forName("com.android.billingclient.api.BillingClient");
            return true;
        } catch (java.lang.ClassNotFoundException e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            return false;
        } catch (java.lang.Exception e2) {
            kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e2));
            e2.getMessage();
            return false;
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.C2410fh c2410fh) {
        com.inmobi.media.La la;
        c = 2;
        if (c2410fh == null) {
            com.inmobi.media.C2752sh c2752sh = b;
            if (c2752sh != null) {
                c2752sh.f5449a = null;
                com.android.billingclient.api.BillingClient billingClient = c2752sh.b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            b = null;
            return kotlin.Unit.INSTANCE;
        }
        java.util.Objects.toString(c2410fh);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i = c2410fh.f5202a;
        if (i > 0) {
            jSONObject.put("p", i);
        }
        int i2 = c2410fh.b;
        if (i2 > 0) {
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, i2);
        }
        java.lang.String nipMapJSON = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (nipMapJSON != null) {
            f5181a = nipMapJSON;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nipMapJSON, "nipMapJSON");
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                la = com.inmobi.media.Ka.a(context, "purchase_store");
            } else {
                la = null;
            }
            if (la != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
                la.a("purchase_pref", nipMapJSON, false);
            }
        }
        com.inmobi.media.C2752sh c2752sh2 = b;
        if (c2752sh2 != null) {
            c2752sh2.f5449a = null;
            com.android.billingclient.api.BillingClient billingClient2 = c2752sh2.b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        b = null;
        return kotlin.Unit.INSTANCE;
    }

    public static boolean a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.x()) {
            return false;
        }
        if (!((java.lang.Boolean) d.getValue()).booleanValue()) {
            com.inmobi.media.AbstractC2540kh.a(new com.inmobi.media.C2463hh((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i = c;
        if (i != 1 && i != 2) {
            return true;
        }
        com.inmobi.media.AbstractC2540kh.a(new com.inmobi.media.C2463hh(i != 1 ? i != 2 ? (short) 0 : (short) 2232 : (short) 2231));
        return false;
    }

    public static boolean b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            android.os.Bundle bundle = applicationInfo.metaData;
            java.lang.String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
            boolean contains = kotlin.collections.CollectionsKt.contains(((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!contains) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put("trigger", string);
                com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("BillingClientNotCompatible", linkedHashMap, com.inmobi.media.EnumC2728rk.f5431a);
            }
            return contains;
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            e.getMessage();
            return false;
        }
    }
}
