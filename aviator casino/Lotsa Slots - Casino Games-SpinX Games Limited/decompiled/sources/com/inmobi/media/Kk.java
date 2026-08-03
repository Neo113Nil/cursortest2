package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Kk {
    public static java.lang.String a(java.util.Map map, java.lang.String str) {
        java.util.Map map2;
        java.lang.String str2;
        com.inmobi.media.C2799u9 a2 = com.inmobi.media.Sh.a("getToken", "AB");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (map != null) {
            java.lang.String str3 = (java.lang.String) map.get("tp");
            if (!android.text.TextUtils.isEmpty(str3)) {
                com.inmobi.media.Yi.b = str3;
            }
            java.lang.String str4 = (java.lang.String) map.get("tp-v");
            if (!android.text.TextUtils.isEmpty(str4)) {
                com.inmobi.media.Yi.f5069a = str4;
            }
        }
        a();
        if (!com.inmobi.media.Xi.d()) {
            if (a2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Kk", "LOG_TAG");
                a2.b("com.inmobi.media.Kk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, currentTimeMillis, a2);
            return null;
        }
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        com.inmobi.media.C2619nf c2619nf = context != null ? new com.inmobi.media.C2619nf(context, a2) : null;
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
        com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
        if (((com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class)).getMonetizationDisabled()) {
            a(2012, currentTimeMillis, a2);
            if (a2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Kk", "LOG_TAG");
                a2.b("com.inmobi.media.Kk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        com.inmobi.media.Rk uidMap = new com.inmobi.media.Rk(((com.inmobi.media.core.config.models.AdConfig) c2580m42.a(com.inmobi.media.core.config.models.AdConfig.class)).getIncludeIds());
        com.inmobi.media.Lk metaData = new com.inmobi.media.Lk(str, map);
        com.inmobi.media.C2565lf a3 = c2619nf != null ? c2619nf.a() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metaData, "metaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        com.inmobi.media.C2580m4 c2580m43 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        com.inmobi.media.core.config.models.SignalsConfig signalsConfig = (com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class);
        java.util.LinkedHashMap payload = new java.util.LinkedHashMap();
        java.lang.String a4 = com.inmobi.media.B8.a();
        if (a4 != null) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        com.inmobi.media.C2441gl a5 = com.inmobi.media.AbstractC2415fl.a();
        java.lang.String str5 = a5.f5225a;
        if (str5 != null) {
        }
        payload.put("is-unifid-service-used", java.lang.String.valueOf(a5.b));
        com.inmobi.media.D9.d(payload);
        payload.put("d-media-volume", java.lang.String.valueOf(com.inmobi.media.B5.f4614a.a(com.inmobi.media.Xi.f5051a, false)));
        payload.putAll(uidMap.a());
        java.lang.String str6 = metaData.f4823a;
        if (str6 != null) {
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(com.inmobi.media.AbstractC2291b4.f5114a);
        payload.putAll(hashMap);
        java.util.Map map3 = metaData.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        if (map3 != null) {
            for (java.util.Map.Entry entry : map3.entrySet()) {
                java.lang.String str7 = (java.lang.String) entry.getKey();
                java.lang.String str8 = (java.lang.String) entry.getValue();
                if (!payload.containsKey(str7)) {
                    payload.put(str7, str8);
                }
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        com.inmobi.media.C2580m4 c2580m44 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        org.json.JSONObject ext = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            java.lang.String jSONObject = ext.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            payload.put("im-ext", jSONObject);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        com.inmobi.media.B5 b5 = com.inmobi.media.B5.f4614a;
        b5.getClass();
        if (com.inmobi.media.B5.s()) {
            if (com.inmobi.media.N5.e) {
                str2 = null;
            } else {
                str2 = com.inmobi.media.N5.c;
                if (str2 == null) {
                    android.content.Context context2 = com.inmobi.media.Xi.f5051a;
                    if (context2 == null) {
                        str2 = null;
                    } else {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                        com.inmobi.media.La a6 = com.inmobi.media.Ka.a(context2, "display_info_store");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("gesture_margin", com.ironsource.X3.i.W);
                        str2 = a6.f4815a.getString("gesture_margin", null);
                    }
                    com.inmobi.media.N5.c = str2;
                }
            }
            if (str2 != null) {
                payload.put("d-device-gesture-margins", str2);
            }
        }
        com.inmobi.media.D9.c(payload);
        com.inmobi.media.D9.e(payload);
        com.inmobi.media.D9.a(payload);
        com.inmobi.media.D9.b(payload);
        payload.put("h-user-agent", com.inmobi.media.Xi.c());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        java.lang.String str9 = com.inmobi.media.AbstractC2383eh.f5181a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str10 = com.inmobi.media.AbstractC2383eh.f5181a;
        if (str10 != null) {
            linkedHashMap.put("u-nip", str10);
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            payload.putAll(linkedHashMap);
        }
        payload.putAll(com.inmobi.media.AbstractC2332ch.a());
        payload.putAll(com.inmobi.media.N5.c());
        payload.putAll(com.inmobi.media.P2.a());
        if (a3 != null && (map2 = a3.f5316a) != null) {
            payload.putAll(map2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        kotlin.Lazy lazy = com.inmobi.media.E0.c;
        if (!((java.util.concurrent.CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) lazy.getValue()).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            payload.put("u-r-crid", jSONArray);
        }
        org.json.JSONObject a7 = com.inmobi.media.C2323c9.c.a();
        if (a7.length() > 0) {
            java.lang.String jSONObject2 = a7.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            payload.put("audioObject", jSONObject2);
        }
        com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = com.inmobi.media.B1.f4611a;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        com.inmobi.media.B1.a(linkedHashMap2);
        payload.putAll(linkedHashMap2);
        if (signalsConfig.getPublisher().getEnableAB()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
            org.json.JSONObject e = com.inmobi.media.Xg.f5049a.e();
            if (e.length() > 0) {
                java.lang.String jSONObject3 = e.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
                payload.put(com.ironsource.X3.i.l0, jSONObject3);
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.put("u-appsecure", java.lang.String.valueOf((int) com.inmobi.media.A1.f));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        if (com.inmobi.media.O4.e() && com.inmobi.media.J3.a(com.inmobi.media.O4.d())) {
            payload.put("ik", com.inmobi.media.O4.f);
            payload.put("c_data", com.inmobi.media.O4.d());
            android.content.Context context3 = com.inmobi.media.Xi.f5051a;
            int i = 1;
            if (context3 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
                com.inmobi.media.La a8 = com.inmobi.media.Ka.a(context3, "c_data_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("akv", com.ironsource.X3.i.W);
                i = a8.f4815a.getInt("akv", 1);
            }
            payload.put("aKV", java.lang.String.valueOf(i));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        org.json.JSONObject b = com.inmobi.media.AbstractC2268a7.b();
        if (b != null) {
            java.lang.String jSONObject4 = b.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
            payload.put("consentObject", jSONObject4);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.putAll(com.inmobi.media.A1.e);
        payload.putAll(b5.a(false));
        payload.putAll(com.inmobi.media.D8.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "mHttpHeaders");
        payload.put(com.google.common.net.HttpHeaders.USER_AGENT, com.inmobi.media.Xi.c());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        if (!com.inmobi.media.AbstractC2268a7.a()) {
            if (a2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Kk", "LOG_TAG");
                a2.b("com.inmobi.media.Kk", "get Signals failed - GDPR Compliance");
            }
            a(2141, currentTimeMillis, a2);
            return null;
        }
        a(currentTimeMillis, a2);
        if (a2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Kk", "LOG_TAG");
            a2.a("com.inmobi.media.Kk", "get signals success");
        }
        byte[] encode = android.util.Base64.encode(new okio.Buffer().writeUtf8(com.inmobi.media.J3.a(payload)).readByteArray(), 8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return new java.lang.String(encode, kotlin.text.Charsets.UTF_8);
    }

    public static final void b() {
        java.util.HashMap hashMapOf = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.o()), kotlin.TuplesKt.to("plType", "AB"));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdGetSignalsCalled", hashMapOf, com.inmobi.media.EnumC2728rk.f5431a);
    }

    public static void a(final int i, final long j, com.inmobi.media.C2799u9 c2799u9) {
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Kk", "LOG_TAG");
            c2799u9.c("com.inmobi.media.Kk", "submitAdGetSignalsFailed - errorCode - " + i + ", startTime - " + j);
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Kk$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Kk.a(j, i);
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
        if (c2799u9 != null) {
            c2799u9.a();
        }
    }

    public static final void a(long j, int i) {
        java.util.HashMap hashMapOf = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("latency", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j)), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.o()), kotlin.TuplesKt.to("errorCode", java.lang.Integer.valueOf(i)), kotlin.TuplesKt.to("plType", "AB"));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdGetSignalsFailed", hashMapOf, com.inmobi.media.EnumC2728rk.f5431a);
    }

    public static void a(final long j, com.inmobi.media.C2799u9 c2799u9) {
        if (c2799u9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("com.inmobi.media.Kk", "LOG_TAG");
            c2799u9.c("com.inmobi.media.Kk", "submitAdGetSignalsSucceeded - startTime - " + j);
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Kk$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Kk.a(j);
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
        if (c2799u9 != null) {
            c2799u9.a();
        }
    }

    public static final void a(long j) {
        java.util.HashMap hashMapOf = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("latency", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j)), kotlin.TuplesKt.to("networkType", com.inmobi.media.B5.o()), kotlin.TuplesKt.to("plType", "AB"));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("AdGetSignalsSucceeded", hashMapOf, com.inmobi.media.EnumC2728rk.f5431a);
    }

    public static void a() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Kk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.Kk.b();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }
}
