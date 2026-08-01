package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class Hh {
    public static final ContentValues a(Vg vg) {
        Intrinsics.checkNotNullParameter(vg, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", vg.b);
        contentValues.put("url", vg.f6913a);
        Map map = vg.c;
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(vg.d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, vg.e);
        contentValues.put("ack_required", String.valueOf(vg.f));
        contentValues.put("time_created", Long.valueOf(vg.i));
        contentValues.put("retry_count", Integer.valueOf(vg.g));
        contentValues.put("owner", vg.h);
        Long l = vg.j;
        contentValues.put("retryAfter", Long.valueOf(l != null ? l.longValue() : 0L));
        Ij ij = vg.k;
        if (ij != null) {
            String jSONObject2 = new JSONObject().put("plType", ij.f6630a.f).put("plId", ij.f6630a.f7470a).put("adType", ij.f6630a.e).put("markupType", ij.b).put("networkType", Y5.g()).put("creativeType", ij.f).put("creativeId", ij.g).put("isRewarded", ij.h).put("adPosition", ij.i).put("metadataBlob", ij.d).put("impressionId", ij.c).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            contentValues.put("telemetry_metadata", jSONObject2);
        }
        contentValues.put("status", vg.l);
        return contentValues;
    }

    public static final Vg a(ContentValues contentValues) {
        long j;
        Long l;
        Ij ij;
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        while (true) {
            String str = "";
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            String string = jSONObject.getString(next);
            if (string != null) {
                str = string;
            }
            linkedHashMap.put(next, str);
        }
        boolean parseBoolean = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean parseBoolean2 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int intValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str2 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        String asString5 = contentValues.getAsString("status");
        if (asString5 == null) {
            asString5 = "idle";
        }
        String str3 = asString5;
        Intrinsics.checkNotNull(asString2);
        Intrinsics.checkNotNull(asString);
        Intrinsics.checkNotNull(asString3);
        Intrinsics.checkNotNull(asLong2);
        long longValue = asLong2.longValue();
        String json = contentValues.getAsString("telemetry_metadata");
        if (json != null) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject2 = new JSONObject(json);
                l = asLong;
                try {
                    String string2 = jSONObject2.getString("adType");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    C4147v0 c4147v0 = new C4147v0(string2);
                    j = longValue;
                    try {
                        c4147v0.b = jSONObject2.getLong("plId");
                        C4201x0 a2 = c4147v0.a();
                        String string3 = jSONObject2.getString("markupType");
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        String string4 = jSONObject2.getString("impressionId");
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        String optString = jSONObject2.optString("metadataBlob", "");
                        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                        String string5 = jSONObject2.getString("creativeType");
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        String string6 = jSONObject2.getString("creativeId");
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        ij = new Ij(a2, string3, string4, optString, 0, string5, string6, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null, null);
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    j = longValue;
                }
            } catch (JSONException unused3) {
            }
            return new Vg(asString2, asString, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str2, j, l, ij, str3);
        }
        j = longValue;
        l = asLong;
        ij = null;
        return new Vg(asString2, asString, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str2, j, l, ij, str3);
    }
}
