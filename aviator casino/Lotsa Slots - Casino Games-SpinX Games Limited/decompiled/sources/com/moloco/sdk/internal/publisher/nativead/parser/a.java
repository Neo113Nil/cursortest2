package com.moloco.sdk.internal.publisher.nativead.parser;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7144a = 0;

    public final java.lang.Object a(java.lang.String nativeOrtbString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeOrtbString, "nativeOrtbString");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(nativeOrtbString);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("native");
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(new com.moloco.sdk.internal.publisher.nativead.model.b(jSONObject.has("ver") ? jSONObject.getString("ver") : null, a(jSONObject.optJSONArray("assets")), a(jSONObject.optJSONObject("link")), c(jSONObject.optJSONArray("imptrackers")), b(jSONObject.optJSONArray("eventtrackers")), jSONObject.has(com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY) ? jSONObject.getString(com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY) : null));
        } catch (java.lang.Exception e) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e));
        }
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b b(org.json.JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.Integer valueOf = jSONObject.has("type") ? java.lang.Integer.valueOf(jSONObject.getInt("type")) : null;
        java.lang.String string = jSONObject.getString("url");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new com.moloco.sdk.internal.publisher.nativead.model.b.a.C0196b(i, z, valueOf, string, jSONObject.has("w") ? java.lang.Integer.valueOf(jSONObject.getInt("w")) : null, jSONObject.has(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS) ? java.lang.Integer.valueOf(jSONObject.getInt(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)) : null);
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.b.a.c c(org.json.JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String string = jSONObject.getString("text");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new com.moloco.sdk.internal.publisher.nativead.model.b.a.c(i, z, string, jSONObject.has("len") ? java.lang.Integer.valueOf(jSONObject.getInt("len")) : null);
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.b.a.d d(org.json.JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String string = jSONObject.getString("vasttag");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new com.moloco.sdk.internal.publisher.nativead.model.b.a.d(i, z, string);
    }

    public final java.util.List<java.lang.String> c(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public final java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.C0197b> b(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new com.moloco.sdk.internal.publisher.nativead.model.b.C0197b(jSONObject.getInt(androidx.core.app.NotificationCompat.CATEGORY_EVENT), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public final java.util.List<com.moloco.sdk.internal.publisher.nativead.model.b.a> a(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("id")) {
                int i2 = jSONObject.getInt("id");
                boolean z = jSONObject.optInt("required", 0) == 1;
                java.lang.Object c = c(jSONObject.optJSONObject("title"), i2, z);
                if (c == null && (c = b(jSONObject.optJSONObject("img"), i2, z)) == null && (c = d(jSONObject.optJSONObject("video"), i2, z)) == null) {
                    c = a(jSONObject.optJSONObject("data"), i2, z);
                }
                if (c != null) {
                    arrayList.add(c);
                }
            }
        }
        return arrayList;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.b.a.C0195a a(org.json.JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.Integer valueOf = jSONObject.has("type") ? java.lang.Integer.valueOf(jSONObject.getInt("type")) : null;
        java.lang.Integer valueOf2 = jSONObject.has("len") ? java.lang.Integer.valueOf(jSONObject.getInt("len")) : null;
        java.lang.String string = jSONObject.getString("value");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new com.moloco.sdk.internal.publisher.nativead.model.b.a.C0195a(i, z, valueOf, valueOf2, string);
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.b.c a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String string = jSONObject.getString("url");
        java.lang.String string2 = jSONObject.has("fallback") ? jSONObject.getString("fallback") : null;
        java.util.List<java.lang.String> c = c(jSONObject.optJSONArray("clicktrackers"));
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        return new com.moloco.sdk.internal.publisher.nativead.model.b.c(string, c, string2);
    }
}
