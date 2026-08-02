package com.amplitude.core.utilities;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0183, code lost:
    
        if (r3.length() != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0186, code lost:
    
        r5.put("version", r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(com.amplitude.core.events.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", event.a());
        x.a("user_id", jSONObject, event.a);
        x.a("device_id", jSONObject, event.b);
        x.a("time", jSONObject, event.c);
        x.a("event_properties", jSONObject, c(v.c(event.P)));
        x.a("user_properties", jSONObject, c(v.c(event.Q)));
        x.a("groups", jSONObject, c(v.c(event.R)));
        x.a("group_properties", jSONObject, c(v.c(event.S)));
        x.a("app_version", jSONObject, event.i);
        x.a("platform", jSONObject, event.k);
        x.a("os_name", jSONObject, event.l);
        x.a("os_version", jSONObject, event.m);
        x.a("device_brand", jSONObject, event.n);
        x.a("device_manufacturer", jSONObject, event.o);
        x.a("device_model", jSONObject, event.p);
        x.a("carrier", jSONObject, event.q);
        x.a("country", jSONObject, event.r);
        x.a("region", jSONObject, event.s);
        x.a("city", jSONObject, event.t);
        x.a("dma", jSONObject, event.u);
        x.a("language", jSONObject, event.A);
        x.a(FirebaseAnalytics.Param.PRICE, jSONObject, event.G);
        x.a(FirebaseAnalytics.Param.QUANTITY, jSONObject, event.H);
        x.a("revenue", jSONObject, event.F);
        x.a("productId", jSONObject, event.I);
        x.a("revenueType", jSONObject, event.J);
        x.a(FirebaseAnalytics.Param.CURRENCY, jSONObject, event.K);
        x.a("location_lat", jSONObject, event.g);
        x.a("location_lng", jSONObject, event.h);
        x.a("ip", jSONObject, event.C);
        x.a("version_name", jSONObject, event.j);
        x.a("idfa", jSONObject, event.v);
        x.a("idfv", jSONObject, event.w);
        x.a("adid", jSONObject, event.x);
        x.a("android_id", jSONObject, event.z);
        x.a("event_id", jSONObject, event.d);
        x.a("session_id", jSONObject, event.e);
        x.a("insert_id", jSONObject, event.f);
        x.a("library", jSONObject, event.B);
        x.a("partner_id", jSONObject, event.M);
        x.a("android_app_set_id", jSONObject, event.y);
        com.amplitude.core.events.f fVar = event.D;
        if (fVar != null) {
            String str = fVar.d;
            String str2 = fVar.c;
            String str3 = fVar.b;
            String str4 = fVar.a;
            JSONObject jSONObject2 = new JSONObject();
            if (str4 != null) {
                try {
                    if (str4.length() != 0) {
                        jSONObject2.put("branch", str4);
                    }
                } catch (JSONException unused) {
                    com.amplitude.common.jvm.a.Companion.getClass();
                    com.amplitude.common.jvm.a.b.b("JSON Serialization of tacking plan object failed");
                }
            }
            if (str3 != null && str3.length() != 0) {
                jSONObject2.put("source", str3);
            }
            if (str != null && str.length() != 0) {
                jSONObject2.put("versionId", str);
            }
            jSONObject.put("plan", jSONObject2);
        }
        com.amplitude.core.events.e eVar = event.E;
        if (eVar != null) {
            String str5 = eVar.b;
            String str6 = eVar.a;
            JSONObject jSONObject3 = new JSONObject();
            if (str6 != null) {
                try {
                    if (str6.length() != 0) {
                        jSONObject3.put("source_name", str6);
                    }
                } catch (JSONException unused2) {
                    com.amplitude.common.jvm.a.Companion.getClass();
                    com.amplitude.common.jvm.a.b.b("JSON Serialization of ingestion metadata object failed");
                }
            }
            if (str5 != null && str5.length() != 0) {
                jSONObject3.put("source_version", str5);
            }
            jSONObject.put("ingestion_metadata", jSONObject3);
        }
        return jSONObject;
    }

    public static JSONArray b(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (Intrinsics.areEqual(obj.getClass(), String.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                if (str.length() > 1024) {
                    str = str.substring(0, 1024);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
                jSONArray.put(i, str);
            } else if (Intrinsics.areEqual(obj.getClass(), JSONObject.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONArray.put(i, c((JSONObject) obj));
            } else if (Intrinsics.areEqual(obj.getClass(), JSONArray.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray2 = (JSONArray) obj;
                b(jSONArray2);
                jSONArray.put(i, jSONArray2);
            }
        }
        return jSONArray;
    }

    public static JSONObject c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
        }
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (Intrinsics.areEqual(obj.getClass(), String.class)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj;
                    if (str2.length() > 1024) {
                        str2 = str2.substring(0, 1024);
                        Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                    }
                    jSONObject.put(str, str2);
                } else if (Intrinsics.areEqual(obj.getClass(), JSONObject.class)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    jSONObject.put(str, c((JSONObject) obj));
                } else if (Intrinsics.areEqual(obj.getClass(), JSONArray.class)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    JSONArray jSONArray = (JSONArray) obj;
                    b(jSONArray);
                    jSONObject.put(str, jSONArray);
                }
            } catch (JSONException unused) {
                throw new IllegalArgumentException("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
            }
        }
        return jSONObject;
    }
}
