package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class wd {
    public static final List a(JSONObject jSONObject) {
        List<JSONObject> asListSkipNull;
        vj vjVar;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONArray optJSONArray = jSONObject.optJSONArray("verification");
        if (optJSONArray == null || (asListSkipNull = g8.asListSkipNull(optJSONArray)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject2 : asListSkipNull) {
            try {
                String string = jSONObject2.getString("url");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject2.getString("vendor");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = jSONObject2.getString("params");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                vjVar = new vj(string, string2, string3);
            } catch (Exception unused) {
                vjVar = null;
            }
            if (vjVar != null) {
                arrayList.add(vjVar);
            }
        }
        return arrayList;
    }

    public static final vd b(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        List a2 = a(config);
        JSONObject optJSONObject = config.optJSONObject("viewabilitySettings");
        return optJSONObject != null ? new vd(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), optJSONObject.optInt("minVisibleDips", 1), optJSONObject.optInt("minVisibleDurationMs", 0), optJSONObject.optLong("visibilityCheckIntervalMs", 100L), optJSONObject.optInt("traversalLimit", 25), a2) : new vd(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), 0, 0, 0L, 0, a2, 60, null);
    }
}
