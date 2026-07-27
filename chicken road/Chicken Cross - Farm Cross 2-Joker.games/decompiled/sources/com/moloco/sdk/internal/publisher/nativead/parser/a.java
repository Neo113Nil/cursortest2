package com.moloco.sdk.internal.publisher.nativead.parser;

import androidx.core.app.NotificationCompat;
import com.facebook.share.internal.ShareConstants;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10659a = 0;

    public final Object a(String nativeOrtbString) {
        Intrinsics.checkNotNullParameter(nativeOrtbString, "nativeOrtbString");
        try {
            JSONObject jSONObject = new JSONObject(nativeOrtbString);
            JSONObject optJSONObject = jSONObject.optJSONObject("native");
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(new com.moloco.sdk.internal.publisher.nativead.model.b(jSONObject.has("ver") ? jSONObject.getString("ver") : null, a(jSONObject.optJSONArray("assets")), a(jSONObject.optJSONObject("link")), c(jSONObject.optJSONArray("imptrackers")), b(jSONObject.optJSONArray("eventtrackers")), jSONObject.has(ShareConstants.WEB_DIALOG_PARAM_PRIVACY) ? jSONObject.getString(ShareConstants.WEB_DIALOG_PARAM_PRIVACY) : null));
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(e));
        }
    }

    public final b.a.C1492b b(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        String string = jSONObject.getString("url");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.C1492b(i, z, valueOf, string, jSONObject.has("w") ? Integer.valueOf(jSONObject.getInt("w")) : null, jSONObject.has("h") ? Integer.valueOf(jSONObject.getInt("h")) : null);
    }

    public final b.a.c c(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("text");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.c(i, z, string, jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null);
    }

    public final b.a.d d(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("vasttag");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.d(i, z, string);
    }

    public final List<String> c(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public final List<b.C1493b> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(new b.C1493b(jSONObject.getInt(NotificationCompat.CATEGORY_EVENT), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public final List<b.a> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("id")) {
                int i2 = jSONObject.getInt("id");
                boolean z = jSONObject.optInt("required", 0) == 1;
                Object c = c(jSONObject.optJSONObject("title"), i2, z);
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

    public final b.a.C1491a a(JSONObject jSONObject, int i, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        Integer valueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        Integer valueOf2 = jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null;
        String string = jSONObject.getString("value");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b.a.C1491a(i, z, valueOf, valueOf2, string);
    }

    public final b.c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("url");
        String string2 = jSONObject.has("fallback") ? jSONObject.getString("fallback") : null;
        List<String> c = c(jSONObject.optJSONArray("clicktrackers"));
        Intrinsics.checkNotNull(string);
        return new b.c(string, c, string2);
    }
}
