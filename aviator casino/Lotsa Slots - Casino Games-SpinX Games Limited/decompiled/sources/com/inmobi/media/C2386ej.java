package com.inmobi.media;

/* renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2386ej {
    public static java.lang.String d;
    public static boolean e;
    public static long f;
    public static final com.inmobi.media.La i;
    public static final com.inmobi.media.I1 j;
    public static final com.inmobi.media.I1 k;
    public static final /* synthetic */ kotlin.reflect.KProperty[] b = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.C2386ej.class, "sessionCnt", "getSessionCnt()I", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.inmobi.media.C2386ej.class, "userRetention", "getUserRetention()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.C2386ej f5183a = new com.inmobi.media.C2386ej();
    public static final java.lang.String c = "ej";
    public static final java.util.List g = kotlin.collections.CollectionsKt.mutableListOf(0, 0, 0, 0);
    public static final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        com.inmobi.media.La la;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            la = com.inmobi.media.Ka.a(context, "session_pref_file");
        } else {
            la = null;
        }
        i = la;
        int i2 = 12;
        j = new com.inmobi.media.I1(-1, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.ej$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(com.inmobi.media.C2386ej.a());
            }
        }, i2);
        k = new com.inmobi.media.I1(-1, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.ej$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(com.inmobi.media.C2386ej.b());
            }
        }, i2);
    }

    public static boolean a(int i2) {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        return ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getSession().getSigControlList().contains(java.lang.Integer.valueOf(i2));
    }

    public static final int b() {
        f5183a.getClass();
        com.inmobi.media.La la = i;
        if (la == null) {
            return 0;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("u-ret", com.ironsource.X3.i.W);
        return java.lang.Math.min((int) ((currentTimeMillis - la.f4815a.getLong("u-ret", currentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void c() {
        if (h.getAndSet(true)) {
            return;
        }
        if (com.inmobi.media.AbstractC2676pj.a().getSessionEnabled()) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            d = uuid;
            java.lang.String TAG = c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        }
        f = java.lang.System.currentTimeMillis() - android.os.Process.getElapsedCpuTime();
        if (a(5)) {
            com.inmobi.media.La la = i;
            if (la != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("cnt", com.ironsource.X3.i.W);
                la.a("cnt", java.lang.Math.min(la.f4815a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false);
            }
            j.a();
        }
        if (a(6)) {
            com.inmobi.media.La la2 = i;
            if (la2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("u-ret", com.ironsource.X3.i.W);
                if (!la2.f4815a.contains("u-ret")) {
                    la2.a("u-ret", java.lang.System.currentTimeMillis(), false);
                }
            }
            k.a();
        }
    }

    public static final int a() {
        f5183a.getClass();
        com.inmobi.media.La la = i;
        if (la == null) {
            return 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("cnt", com.ironsource.X3.i.W);
        return la.f4815a.getInt("cnt", 0);
    }

    public static void a(java.lang.String adtype, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adtype, "adtype");
        if (kotlin.jvm.internal.Intrinsics.areEqual(adtype, "banner") && a(1)) {
            java.util.List list = g;
            list.set(0, java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(adtype, "int") && !kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE) && a(2)) {
            java.util.List list2 = g;
            list2.set(1, java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(adtype, "native") && a(4)) {
            java.util.List list3 = g;
            list3.set(3, java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE) && a(3)) {
            java.util.List list4 = g;
            list4.set(2, java.lang.Integer.valueOf(java.lang.Math.min(((java.lang.Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }
}
