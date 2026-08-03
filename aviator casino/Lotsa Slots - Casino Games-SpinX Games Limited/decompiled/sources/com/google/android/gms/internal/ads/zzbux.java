package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbux {
    public static final java.util.List zza(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
