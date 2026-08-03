package com.ironsource;

/* loaded from: classes5.dex */
public final class D8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String optString = jSONObject.optString(str);
        if (optString.length() == 0) {
            return null;
        }
        return optString;
    }
}
