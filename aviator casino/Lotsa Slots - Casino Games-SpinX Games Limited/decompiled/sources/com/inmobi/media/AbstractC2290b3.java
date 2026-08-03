package com.inmobi.media;

/* renamed from: com.inmobi.media.b3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2290b3 {
    public static final android.content.ContentValues a(com.inmobi.media.V2 v2) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v2, "<this>");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("id", java.lang.Integer.valueOf(v2.f5007a));
        contentValues.put("url", v2.b);
        contentValues.put("pending_attempts", java.lang.Integer.valueOf(v2.f));
        contentValues.put("ts", java.lang.Long.valueOf(v2.g));
        contentValues.put("created_ts", java.lang.Long.valueOf(v2.h));
        contentValues.put("follow_redirect", java.lang.Boolean.valueOf(v2.d));
        contentValues.put("ping_in_webview", java.lang.Boolean.valueOf(v2.e));
        java.util.Map map = v2.c;
        if (map != null && !map.isEmpty()) {
            try {
                java.util.Map map2 = v2.c;
                kotlin.jvm.internal.Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                str = new org.json.JSONObject(map2).toString();
            } catch (java.lang.Exception unused) {
                str = "";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            contentValues.put("track_extras", str);
        }
        return contentValues;
    }
}
