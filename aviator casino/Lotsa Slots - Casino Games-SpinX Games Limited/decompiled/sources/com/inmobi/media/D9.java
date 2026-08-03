package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class D9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4657a;

    public D9(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f4657a = url;
    }

    public static void b(java.util.LinkedHashMap linkedHashMap) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        kotlin.Pair k = com.inmobi.media.B5.k();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (k != null) {
            linkedHashMap.put(k.getFirst(), k.getSecond());
        }
        kotlin.Pair m = com.inmobi.media.B5.m();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (m != null) {
            linkedHashMap.put(m.getFirst(), m.getSecond());
        }
        kotlin.Pair pair2 = com.inmobi.media.B5.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair2 != null) {
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            android.content.Intent a2 = com.inmobi.media.J3.a(context, (android.content.BroadcastReceiver) null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new kotlin.Pair("d-bat-chrg", (a2 == null || a2.getIntExtra("status", -1) != 2) ? "0" : "1");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair != null) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        kotlin.Pair q = com.inmobi.media.B5.q();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (q != null) {
            linkedHashMap.put(q.getFirst(), q.getSecond());
        }
        kotlin.Pair h = com.inmobi.media.B5.h();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (h != null) {
            linkedHashMap.put(h.getFirst(), h.getSecond());
        }
        android.content.Context context2 = com.inmobi.media.Xi.f5051a;
        if (context2 != null) {
            android.content.Intent a3 = com.inmobi.media.J3.a(context2, (android.content.BroadcastReceiver) null, new android.content.IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (a3 == null || a3.getIntExtra("state", 0) != 1) ? new kotlin.Pair("d-w-h", "0") : new kotlin.Pair("d-w-h", "1");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair3 != null) {
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        kotlin.Pair i = com.inmobi.media.B5.i();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (i != null) {
            linkedHashMap.put(i.getFirst(), i.getSecond());
        }
        kotlin.Pair j = com.inmobi.media.B5.j();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (j != null) {
            linkedHashMap.put(j.getFirst(), j.getSecond());
        }
        kotlin.Pair f = com.inmobi.media.B5.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (f != null) {
            linkedHashMap.put(f.getFirst(), f.getSecond());
        }
        kotlin.Pair l = com.inmobi.media.B5.l();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (l != null) {
            linkedHashMap.put(l.getFirst(), l.getSecond());
        }
    }

    public static void d(java.util.LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        com.inmobi.media.C2801ub c2801ub = com.inmobi.media.C2801ub.f5486a;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.inmobi.media.C2935zh c2935zh = com.inmobi.media.AbstractC2676pj.f5394a;
        android.location.Location a2 = (com.inmobi.media.Xi.b() == null || com.inmobi.media.AbstractC2676pj.a().getLocationEnabled()) ? com.inmobi.media.C2801ub.a() : null;
        java.util.HashMap a3 = a2 != null ? com.inmobi.media.C2801ub.a(a2, true, com.inmobi.media.Sf.a(com.inmobi.media.Xi.f5051a, "android.permission.ACCESS_FINE_LOCATION") ? com.inmobi.media.C2801ub.a(1, 3) : null) : com.inmobi.media.C2801ub.a(com.inmobi.media.AbstractC2332ch.b(), false, null);
        for (java.util.Map.Entry entry : a3.entrySet()) {
            hashMap.put((java.lang.String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(hashMap);
        com.inmobi.media.C2801ub c2801ub2 = com.inmobi.media.C2801ub.f5486a;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String str = "DENIED";
        if (com.inmobi.media.C2801ub.d() && com.inmobi.media.C2801ub.e()) {
            str = "AUTHORISED";
        }
        java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        java.lang.String lowerCase = str.toLowerCase(ENGLISH);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(hashMap2);
    }

    public static void e(java.util.LinkedHashMap linkedHashMap) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        com.inmobi.media.C2386ej c2386ej = com.inmobi.media.C2386ej.f5183a;
        c2386ej.getClass();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        if (com.inmobi.media.C2386ej.a(0)) {
            linkedHashMap2.put("st", java.lang.Long.valueOf(com.inmobi.media.C2386ej.f));
        }
        if (com.inmobi.media.C2386ej.a(5)) {
            com.inmobi.media.I1 i1 = com.inmobi.media.C2386ej.j;
            kotlin.reflect.KProperty[] kPropertyArr = com.inmobi.media.C2386ej.b;
            if (((java.lang.Number) i1.getValue(c2386ej, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap2.put("cnt", java.lang.Integer.valueOf(((java.lang.Number) i1.getValue(c2386ej, kPropertyArr[0])).intValue()));
            }
        }
        if (com.inmobi.media.C2386ej.a(6)) {
            com.inmobi.media.I1 i12 = com.inmobi.media.C2386ej.k;
            kotlin.reflect.KProperty[] kPropertyArr2 = com.inmobi.media.C2386ej.b;
            if (((java.lang.Number) i12.getValue(c2386ej, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", java.lang.Integer.valueOf(((java.lang.Number) i12.getValue(c2386ej, kPropertyArr2[1])).intValue()));
            }
        }
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) com.inmobi.media.C2386ej.g);
        if (!com.inmobi.media.C2386ej.a(1)) {
            mutableList.set(0, -1);
        }
        if (!com.inmobi.media.C2386ej.a(2)) {
            mutableList.set(1, -1);
        }
        if (!com.inmobi.media.C2386ej.a(3)) {
            mutableList.set(2, -1);
        }
        if (!com.inmobi.media.C2386ej.a(4)) {
            mutableList.set(3, -1);
        }
        if (!(mutableList instanceof java.util.Collection) || !mutableList.isEmpty()) {
            java.util.Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                if (((java.lang.Number) it.next()).intValue() != -1) {
                    linkedHashMap2.put("dep", mutableList);
                    break;
                }
            }
        }
        try {
            jSONObject = new org.json.JSONObject(linkedHashMap2);
        } catch (java.lang.Exception unused) {
            jSONObject = new org.json.JSONObject();
        }
        if (jSONObject.length() > 0) {
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            linkedHashMap.put("sData", jSONObject2);
        }
    }

    public static void a(java.util.LinkedHashMap linkedHashMap) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (com.inmobi.media.AbstractC2528k5.a(com.inmobi.media.Xi.f5051a) != null) {
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
            if (((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getCctEnabled()) {
                z = true;
                linkedHashMap.put("cct-enabled", java.lang.String.valueOf(z));
            }
        }
        z = false;
        linkedHashMap.put("cct-enabled", java.lang.String.valueOf(z));
    }

    public static void c(java.util.LinkedHashMap linkedHashMap) {
        android.content.SharedPreferences a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        java.lang.String str = "";
        if (com.inmobi.media.Xi.f5051a != null && (a2 = com.inmobi.media.AbstractC2490ij.a()) != null && a2.contains("IABGPP_HDR_GppString")) {
            str = java.lang.String.valueOf(a2.getString("IABGPP_HDR_GppString", ""));
        }
        if (com.inmobi.media.J3.a(str)) {
            linkedHashMap.put("gpp", str);
        }
    }

    public static org.json.JSONObject a(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "banner")) {
            return com.inmobi.media.C2323c9.c.a();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("audio", str)) {
            com.inmobi.media.Z8 z8 = com.inmobi.media.Z8.c;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            long j = z8.f5190a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioPlayedTs", java.lang.String.valueOf(j));
            }
            int i = z8.b;
            if (i > 0) {
                jSONObject.put("a-audioFreq", java.lang.String.valueOf(i));
            }
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "audio_pref_file");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_mute_count", com.ironsource.X3.i.W);
                int i2 = a2.f4815a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-umc", java.lang.String.valueOf(i2));
                }
            }
            return jSONObject;
        }
        return new org.json.JSONObject();
    }
}
