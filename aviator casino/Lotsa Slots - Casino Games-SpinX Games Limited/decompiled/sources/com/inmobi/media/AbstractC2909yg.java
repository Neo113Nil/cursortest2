package com.inmobi.media;

/* renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2909yg {
    public static final android.content.ContentValues a(com.inmobi.media.Zf zf) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zf, "<this>");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("id", zf.b);
        contentValues.put("url", zf.f5085a);
        java.util.Map map = zf.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            jSONObject.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", java.lang.String.valueOf(zf.d));
        contentValues.put("priority", zf.e);
        contentValues.put("ack_required", java.lang.String.valueOf(zf.f));
        contentValues.put("time_created", java.lang.Long.valueOf(zf.i));
        contentValues.put("retry_count", java.lang.Integer.valueOf(zf.g));
        contentValues.put("owner", zf.h);
        java.lang.Long l = zf.j;
        contentValues.put("retryAfter", java.lang.Long.valueOf(l != null ? l.longValue() : 0L));
        com.inmobi.media.C2781ti c2781ti = zf.k;
        if (c2781ti != null) {
            java.lang.String jSONObject2 = new org.json.JSONObject().put("plType", c2781ti.f5469a.f).put("plId", c2781ti.f5469a.f5497a).put("adType", c2781ti.f5469a.e).put("markupType", c2781ti.b).put("networkType", com.inmobi.media.B5.g()).put("creativeType", c2781ti.f).put("creativeId", c2781ti.g).put("isRewarded", c2781ti.h).put("adPosition", c2781ti.i).put("metadataBlob", c2781ti.d).put("impressionId", c2781ti.c).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            contentValues.put("telemetry_metadata", jSONObject2);
        }
        return contentValues;
    }

    public static final com.inmobi.media.Zf a(android.content.ContentValues contentValues) {
        java.lang.String str;
        long j;
        com.inmobi.media.C2781ti c2781ti;
        org.json.JSONObject jSONObject;
        java.lang.String mAdType;
        java.lang.String uuid;
        long j2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "<this>");
        java.lang.String asString = contentValues.getAsString("id");
        java.lang.String asString2 = contentValues.getAsString("url");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(contentValues.getAsString("headers"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (true) {
            java.lang.String str2 = "";
            if (!keys.hasNext()) {
                break;
            }
            java.lang.String next = keys.next();
            java.lang.String string = jSONObject2.getString(next);
            if (string != null) {
                str2 = string;
            }
            linkedHashMap.put(next, str2);
        }
        boolean parseBoolean = java.lang.Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        java.lang.String asString3 = contentValues.getAsString("priority");
        boolean parseBoolean2 = java.lang.Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        java.lang.Integer asInteger = contentValues.getAsInteger("retry_count");
        int intValue = asInteger != null ? asInteger.intValue() : 0;
        java.lang.String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        java.lang.String str3 = asString4;
        java.lang.Long asLong = contentValues.getAsLong("retryAfter");
        java.lang.Long asLong2 = contentValues.getAsLong("time_created");
        kotlin.jvm.internal.Intrinsics.checkNotNull(asString2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asString);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asString3);
        kotlin.jvm.internal.Intrinsics.checkNotNull(asLong2);
        long longValue = asLong2.longValue();
        java.lang.String json = contentValues.getAsString("telemetry_metadata");
        if (json != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            try {
                jSONObject = new org.json.JSONObject(json);
                mAdType = jSONObject.getString("adType");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mAdType, "getString(...)");
                j = longValue;
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mAdType, "mAdType");
                    uuid = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    str = str3;
                    try {
                        j2 = jSONObject.getLong("plId");
                    } catch (org.json.JSONException unused) {
                    }
                } catch (org.json.JSONException unused2) {
                    str = str3;
                }
            } catch (org.json.JSONException unused3) {
            }
            if (j2 != Long.MIN_VALUE) {
                com.inmobi.media.C2816v0 c2816v0 = new com.inmobi.media.C2816v0(j2, "", mAdType, null);
                c2816v0.d = null;
                c2816v0.c = null;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "<set-?>");
                c2816v0.h = "";
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("activity", "<set-?>");
                c2816v0.i = "activity";
                c2816v0.g = uuid;
                c2816v0.j = false;
                c2816v0.k = null;
                java.lang.String string2 = jSONObject.getString("markupType");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                java.lang.String string3 = jSONObject.getString("impressionId");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                java.lang.String optString = jSONObject.optString("metadataBlob", "");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                java.lang.String string4 = jSONObject.getString("creativeType");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                java.lang.String string5 = jSONObject.getString("creativeId");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                c2781ti = new com.inmobi.media.C2781ti(c2816v0, string2, string3, optString, 0, string4, string5, jSONObject.getBoolean("isRewarded"), jSONObject.getInt("adPosition"), null, null, null, null);
                return new com.inmobi.media.Zf(asString2, asString, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str, j, asLong, c2781ti);
            }
            throw new java.lang.IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
        }
        str = str3;
        j = longValue;
        c2781ti = null;
        return new com.inmobi.media.Zf(asString2, asString, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str, j, asLong, c2781ti);
    }
}
