package com.amplitude.core.utilities;

import com.amplitude.core.events.e;
import com.amplitude.core.events.f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nJSONUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONUtil.kt\ncom/amplitude/core/utilities/JSONUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,280:1\n1855#2,2:281\n1855#2,2:283\n1855#2,2:285\n*S KotlinDebug\n*F\n+ 1 JSONUtil.kt\ncom/amplitude/core/utilities/JSONUtilKt\n*L\n224#1:281,2\n234#1:283,2\n246#1:285,2\n*E\n"})
/* loaded from: classes3.dex */
public final class x {
    public static final void a(String key, JSONObject jSONObject, Object obj) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            jSONObject.put(key, obj);
        }
    }

    public static final Set<Integer> b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (keys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(keys.next());
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            for (int i : h(jSONArray)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static final String c(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(Constants.IPC_BUNDLE_KEY_SEND_ERROR, io.flutter.plugins.firebase.crashlytics.Constants.KEY);
        Intrinsics.checkNotNullParameter("", "defaultValue");
        if (!jSONObject.has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
            return "";
        }
        String string = jSONObject.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final JSONObject d(String key, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return jSONObject.getJSONObject(key);
        }
        return null;
    }

    public static final String e(String key, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (jSONObject.has(key)) {
            return jSONObject.getString(key);
        }
        return null;
    }

    public static final com.amplitude.core.events.a f(JSONObject jSONObject) {
        com.amplitude.core.events.f fVar;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        com.amplitude.core.events.a aVar = new com.amplitude.core.events.a();
        String string = jSONObject.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        aVar.O = string;
        aVar.a = e("user_id", jSONObject);
        aVar.b = e("device_id", jSONObject);
        com.amplitude.core.events.e eVar = null;
        aVar.c = jSONObject.has("time") ? Long.valueOf(jSONObject.getLong("time")) : null;
        JSONObject d = d("event_properties", jSONObject);
        aVar.P = d != null ? MapsKt.toMutableMap(v.d(d)) : null;
        JSONObject d2 = d("user_properties", jSONObject);
        aVar.Q = d2 != null ? MapsKt.toMutableMap(v.d(d2)) : null;
        JSONObject d3 = d("groups", jSONObject);
        aVar.R = d3 != null ? MapsKt.toMutableMap(v.d(d3)) : null;
        JSONObject d4 = d("group_properties", jSONObject);
        aVar.S = d4 != null ? MapsKt.toMutableMap(v.d(d4)) : null;
        aVar.i = e("app_version", jSONObject);
        aVar.k = e("platform", jSONObject);
        aVar.l = e("os_name", jSONObject);
        aVar.m = e("os_version", jSONObject);
        aVar.n = e("device_brand", jSONObject);
        aVar.o = e("device_manufacturer", jSONObject);
        aVar.p = e("device_model", jSONObject);
        aVar.q = e("carrier", jSONObject);
        aVar.r = e("country", jSONObject);
        aVar.s = e("region", jSONObject);
        aVar.t = e("city", jSONObject);
        aVar.u = e("dma", jSONObject);
        aVar.A = e("language", jSONObject);
        aVar.G = jSONObject.has(FirebaseAnalytics.Param.PRICE) ? Double.valueOf(jSONObject.getDouble(FirebaseAnalytics.Param.PRICE)) : null;
        aVar.H = jSONObject.has(FirebaseAnalytics.Param.QUANTITY) ? Integer.valueOf(jSONObject.getInt(FirebaseAnalytics.Param.QUANTITY)) : null;
        aVar.F = jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null;
        aVar.I = e("productId", jSONObject);
        aVar.J = e("revenueType", jSONObject);
        aVar.g = jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null;
        aVar.h = jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null;
        aVar.C = e("ip", jSONObject);
        aVar.v = e("idfa", jSONObject);
        aVar.w = e("idfv", jSONObject);
        aVar.x = e("adid", jSONObject);
        aVar.z = e("android_id", jSONObject);
        aVar.y = jSONObject.optString("android_app_set_id", null);
        aVar.d = jSONObject.has("event_id") ? Long.valueOf(jSONObject.getLong("event_id")) : null;
        aVar.e = jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null;
        aVar.f = e("insert_id", jSONObject);
        aVar.B = jSONObject.has("library") ? jSONObject.getString("library") : null;
        aVar.M = e("partner_id", jSONObject);
        if (jSONObject.has("plan")) {
            f.a aVar2 = com.amplitude.core.events.f.Companion;
            JSONObject jsonObject = jSONObject.getJSONObject("plan");
            Intrinsics.checkNotNullExpressionValue(jsonObject, "getJSONObject(...)");
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            fVar = new com.amplitude.core.events.f(jsonObject.optString("branch", null), jsonObject.optString("source", null), jsonObject.optString("version", null), jsonObject.optString("versionId", null));
        } else {
            fVar = null;
        }
        aVar.D = fVar;
        if (jSONObject.has("ingestion_metadata")) {
            e.a aVar3 = com.amplitude.core.events.e.Companion;
            JSONObject jsonObject2 = jSONObject.getJSONObject("ingestion_metadata");
            Intrinsics.checkNotNullExpressionValue(jsonObject2, "getJSONObject(...)");
            aVar3.getClass();
            Intrinsics.checkNotNullParameter(jsonObject2, "jsonObject");
            eVar = new com.amplitude.core.events.e(jsonObject2.optString("source_name", null), jsonObject2.optString("source_version", null));
        }
        aVar.E = eVar;
        return aVar;
    }

    public static final ArrayList g(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((IntIterator) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(f(jSONObject));
        }
        return arrayList;
    }

    public static final int[] h(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = jSONArray.optInt(i);
        }
        return iArr;
    }

    public static final ArrayList i(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((IntIterator) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            arrayList.add(jSONObject);
        }
        return arrayList;
    }
}
