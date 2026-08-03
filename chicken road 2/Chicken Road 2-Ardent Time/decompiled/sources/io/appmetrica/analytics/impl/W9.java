package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W9 {
    public static boolean a(org.json.JSONObject jSONObject, java.lang.String str, boolean z2) {
        return ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(jSONObject.has(str) ? java.lang.Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null, java.lang.Boolean.valueOf(z2))).booleanValue();
    }
}
