package com.inmobi.media;

/* renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2656p0 extends com.inmobi.media.D9 {
    public final com.inmobi.media.Rk b;
    public final com.inmobi.media.C2602n0 c;
    public final com.inmobi.media.Gk d;
    public final com.inmobi.media.C2565lf e;
    public final com.inmobi.media.C2799u9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2656p0(java.lang.String str, com.inmobi.media.Rk rk, com.inmobi.media.C2602n0 metaData, com.inmobi.media.Gk timeoutConfig, com.inmobi.media.C2565lf c2565lf, com.inmobi.media.C2799u9 c2799u9, boolean z) {
        super(str == null ? com.inmobi.media.core.config.models.AdConfig.DEFAULT_AD_SERVER_URL : str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metaData, "metaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.b = rk;
        this.c = metaData;
        this.d = timeoutConfig;
        this.e = c2565lf;
        this.f = c2799u9;
    }

    public final com.inmobi.media.Te a() {
        java.lang.String str;
        java.util.Map map;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str2 = com.inmobi.media.Xi.c;
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str2);
        linkedHashMap.putAll(com.inmobi.media.N5.c());
        java.lang.String str3 = com.inmobi.media.A1.b;
        if (str3 != null) {
        }
        linkedHashMap.put("client-request-id", this.c.f5345a);
        linkedHashMap.put("sdk-flavor", "row");
        this.c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        java.lang.String str4 = this.c.e;
        if (str4 != null) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        com.inmobi.media.C2441gl a2 = com.inmobi.media.AbstractC2415fl.a();
        java.lang.String str5 = a2.f5225a;
        if (str5 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", java.lang.String.valueOf(a2.b));
        long j = this.c.c;
        if (j != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", java.lang.String.valueOf(j));
        }
        com.inmobi.media.D9.d(linkedHashMap);
        linkedHashMap.putAll(com.inmobi.media.P2.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(com.inmobi.media.P2.b());
        linkedHashMap.putAll(com.inmobi.media.P2.c());
        com.inmobi.media.C2565lf c2565lf = this.e;
        if (c2565lf != null && (map = c2565lf.f5316a) != null) {
            linkedHashMap.putAll(map);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(com.inmobi.media.AbstractC2291b4.f5114a);
        linkedHashMap.putAll(hashMap);
        java.lang.String str6 = this.c.g;
        if (str6 != null) {
        }
        java.util.Map map2 = this.c.f;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        this.c.getClass();
        linkedHashMap.put("int-origin", "im");
        com.inmobi.media.D9.c(linkedHashMap);
        com.inmobi.media.D9.e(linkedHashMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        kotlin.Lazy lazy = com.inmobi.media.E0.c;
        if (!((java.util.concurrent.CopyOnWriteArrayList) lazy.getValue()).isEmpty()) {
            java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) lazy.getValue()).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            linkedHashMap.put("u-r-crid", jSONArray);
        }
        linkedHashMap.put("m10n_context", kotlin.jvm.internal.Intrinsics.areEqual("others", this.c.d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.s()) {
            if (com.inmobi.media.N5.e) {
                str = null;
            } else {
                str = com.inmobi.media.N5.c;
                if (str == null) {
                    android.content.Context context = com.inmobi.media.Xi.f5051a;
                    if (context == null) {
                        str = null;
                    } else {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                        com.inmobi.media.La a3 = com.inmobi.media.Ka.a(context, "display_info_store");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("gesture_margin", com.ironsource.X3.i.W);
                        str = a3.f4815a.getString("gesture_margin", null);
                    }
                    com.inmobi.media.N5.c = str;
                }
            }
            if (str != null) {
                linkedHashMap.put("d-device-gesture-margins", str);
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        org.json.JSONObject ext = ((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            java.lang.String jSONObject = ext.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            linkedHashMap.put("im-ext", jSONObject);
        }
        java.util.Map map3 = this.c.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (map3 != null) {
            for (java.util.Map.Entry entry : map3.entrySet()) {
                java.lang.String str7 = (java.lang.String) entry.getKey();
                java.lang.String str8 = (java.lang.String) entry.getValue();
                if (!linkedHashMap.containsKey(str7)) {
                    linkedHashMap.put(str7, str8);
                }
            }
        }
        com.inmobi.media.D9.a(linkedHashMap);
        com.inmobi.media.C2602n0 metaData = this.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metaData, "metaData");
        java.lang.String str9 = metaData.e;
        if (str9 != null && com.inmobi.media.D9.a(str9).length() > 0) {
            java.lang.String jSONObject2 = com.inmobi.media.D9.a(str9).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("audioObject", jSONObject2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        java.lang.String str10 = com.inmobi.media.AbstractC2383eh.f5181a;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.lang.String str11 = com.inmobi.media.AbstractC2383eh.f5181a;
        if (str11 != null) {
            linkedHashMap2.put("u-nip", str11);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(com.inmobi.media.AbstractC2332ch.a());
        com.google.android.gms.appset.AppSetIdInfo appSetIdInfo = com.inmobi.media.B1.f4611a;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        com.inmobi.media.B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (com.inmobi.media.O4.e() && com.inmobi.media.J3.a(com.inmobi.media.O4.d())) {
            linkedHashMap.put("ik", com.inmobi.media.O4.f);
            linkedHashMap.put("c_data", com.inmobi.media.O4.d());
            android.content.Context context2 = com.inmobi.media.Xi.f5051a;
            int i = 1;
            if (context2 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
                com.inmobi.media.La a4 = com.inmobi.media.Ka.a(context2, "c_data_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("akv", com.ironsource.X3.i.W);
                i = a4.f4815a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", java.lang.String.valueOf(i));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", java.lang.String.valueOf((int) com.inmobi.media.A1.f));
        com.inmobi.media.Rk rk = this.b;
        java.util.HashMap a5 = rk != null ? rk.a() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (a5 != null) {
            for (java.util.Map.Entry entry2 : a5.entrySet()) {
                linkedHashMap.put((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
            }
        }
        com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        if (((com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getPublisher().getEnableMCO()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            org.json.JSONObject e = com.inmobi.media.Xg.f5049a.e();
            if (e.length() > 0) {
                java.lang.String jSONObject3 = e.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
                linkedHashMap.put(com.ironsource.X3.i.l0, jSONObject3);
            }
        }
        com.inmobi.media.D9.b(linkedHashMap);
        boolean z = this.c.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(com.inmobi.media.A1.e);
        linkedHashMap.putAll(com.inmobi.media.B5.f4614a.a(z));
        linkedHashMap.putAll(com.inmobi.media.D8.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        org.json.JSONObject b = com.inmobi.media.AbstractC2268a7.b();
        if (b != null) {
            java.lang.String jSONObject4 = b.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject4, "toString(...)");
            linkedHashMap.put("consentObject", jSONObject4);
        }
        this.c.getClass();
        com.inmobi.media.C2799u9 c2799u9 = this.f;
        if (c2799u9 != null) {
            c2799u9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        java.lang.String str12 = this.f4657a;
        java.util.LinkedHashMap mHttpHeaders = new java.util.LinkedHashMap();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mHttpHeaders, "mHttpHeaders");
        mHttpHeaders.put(com.google.common.net.HttpHeaders.USER_AGENT, com.inmobi.media.Xi.c());
        return new com.inmobi.media.Te(str12, mHttpHeaders, this.d, new com.inmobi.media.C2321c7(linkedHashMap), null, 48);
    }
}
