package com.inmobi.media;

/* loaded from: classes5.dex */
public final class O4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.O4 f4868a;
    public static final kotlin.Lazy b;
    public static java.util.LinkedList c;
    public static java.util.LinkedList d;
    public static byte[] e;
    public static java.lang.String f;

    static {
        com.inmobi.media.O4 o4 = new com.inmobi.media.O4();
        f4868a = o4;
        b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.O4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.O4.b();
            }
        });
        java.util.LinkedList linkedList = new java.util.LinkedList();
        c = linkedList;
        java.lang.Object clone = linkedList.clone();
        kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        d = (java.util.LinkedList) clone;
        com.inmobi.media.L4 l4 = new com.inmobi.media.L4();
        com.inmobi.media.I4 i4 = new com.inmobi.media.I4();
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
        e = com.inmobi.media.AbstractC2293b6.a(((com.inmobi.media.core.config.models.SignalsConfig) c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getKA());
        java.util.List<java.lang.String> skipFields = c().getContextualData().getSkipFields();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(com.inmobi.media.P4.j);
        arrayList.removeAll(skipFields);
        f = kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "c_data_store");
            android.content.Context context2 = com.inmobi.media.Xi.f5051a;
            int i = 1;
            if (context2 != null) {
                com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context2, "c_data_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("akv", com.ironsource.X3.i.W);
                i = a3.f4815a.getInt("akv", 1);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
            if (((com.inmobi.media.core.config.models.SignalsConfig) c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getVAK() != i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
                a2.a("akv", ((com.inmobi.media.core.config.models.SignalsConfig) c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getVAK(), false);
                o4.f();
            }
        }
        com.inmobi.media.AbstractC2318c4.a("ads", i4);
        com.inmobi.media.AbstractC2318c4.a("signals", l4);
    }

    public static final com.inmobi.media.G4 b() {
        return new com.inmobi.media.G4(com.inmobi.media.AbstractC2639o9.b());
    }

    public static com.inmobi.media.core.config.models.AdConfig c() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        return (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
    }

    public static java.lang.String d() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
        if (f.length() == 0) {
            return "";
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        java.util.LinkedList linkedList = d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((com.inmobi.media.C2267a6) obj).b >= currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(kotlin.text.StringsKt.trim((java.lang.CharSequence) ((com.inmobi.media.C2267a6) it.next()).f5094a).toString());
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public static boolean e() {
        com.inmobi.media.core.config.models.AdConfig.ContextualDataConfig contextualData;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
            com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "c_data_store");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("isEnabled", com.ironsource.X3.i.W);
            if (!a2.f4815a.getBoolean("isEnabled", true)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
                return false;
            }
        }
        com.inmobi.media.core.config.models.AdConfig c2 = c();
        boolean z = c2 == null || (contextualData = c2.getContextualData()) == null || contextualData.getMaxAdRecords() > 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
        return z;
    }

    public final void a(boolean z) {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
            if (z != e()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La.a(com.inmobi.media.Ka.a(context, "c_data_store"), "isEnabled", z);
                if (z) {
                    return;
                }
                f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.K4(null), 1, null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            c = linkedList;
            java.lang.Object clone = linkedList.clone();
            kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            d = (java.util.LinkedList) clone;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static final void a() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        a(currentTimeMillis, c().getContextualData().getMaxAdRecords());
        java.lang.Object clone = c.clone();
        kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        d = (java.util.LinkedList) clone;
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.N4(currentTimeMillis, null), 1, null);
    }

    public static void a(long j, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
        for (int size = c.size(); size > i; size--) {
            c.remove();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("O4", "TAG");
        java.util.Iterator it = c.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (((com.inmobi.media.C2267a6) next).b >= j) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
