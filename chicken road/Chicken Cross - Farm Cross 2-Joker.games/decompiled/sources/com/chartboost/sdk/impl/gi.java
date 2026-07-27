package com.chartboost.sdk.impl;

import com.ironsource.C4761z5;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class gi {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4782a = CollectionsKt.emptyList();

    public static final List a() {
        return f4782a;
    }

    public static final fi b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject optJSONObject = jSONObject.optJSONObject("tracking");
        if (optJSONObject == null) {
            return new fi(false, null, null, 0, 0, false, 0, false, 255, null);
        }
        boolean optBoolean = optJSONObject.optBoolean("enabled", false);
        String optString = optJSONObject.optString(C4761z5.r, "https://ssp-events.chartboost.com/track/sdk");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        return new fi(optBoolean, a(optJSONObject), optString, optJSONObject.optInt("eventLimit", 10), optJSONObject.optInt("windowDuration", 60), optJSONObject.optBoolean("persistenceEnabled", true), optJSONObject.optInt("persistenceMaxEvents", 100), optJSONObject.optBoolean("logContextEnabled", true));
    }

    public static final List a(JSONObject jSONObject) {
        List asList;
        List a2;
        JSONArray optJSONArray = jSONObject.optJSONArray("blacklist");
        return (optJSONArray == null || (asList = g8.asList(optJSONArray)) == null || (a2 = com.chartboost.sdk.tracking.h.a(asList)) == null) ? f4782a : a2;
    }
}
