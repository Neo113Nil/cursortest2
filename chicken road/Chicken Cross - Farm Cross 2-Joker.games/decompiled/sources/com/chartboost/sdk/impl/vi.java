package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class vi {
    public final String a(JSONObject jSONObject) {
        String optString;
        return (jSONObject == null || (optString = jSONObject.optString("url", "")) == null) ? "" : optString;
    }

    public final k3 b(JSONObject jSONObject) {
        return new k3(a(jSONObject), c(jSONObject));
    }

    public final Boolean c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return y2.a(jSONObject, "shouldDismiss");
        }
        return null;
    }
}
