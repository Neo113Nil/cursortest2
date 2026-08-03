package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfwe {
    private static android.view.WindowManager zzb;
    private static final java.lang.String[] zzc = {"x", "y", "width", "height"};
    static float zza = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    public static void zza(android.content.Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (android.view.WindowManager) context.getSystemService("window");
        }
    }

    public static org.json.JSONObject zzb(int i, int i2, int i3, int i4) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("x", i / zza);
            jSONObject.put("y", i2 / zza);
            jSONObject.put("width", i3 / zza);
            jSONObject.put("height", i4 / zza);
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfwf.zza("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void zzc(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (java.lang.NullPointerException | org.json.JSONException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append(com.ironsource.X3.j.e);
            com.google.android.gms.internal.ads.zzfwf.zza(sb.toString(), e);
        }
    }

    public static void zzd(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (org.json.JSONException e) {
            com.google.android.gms.internal.ads.zzfwf.zza("Error with setting ad session id", e);
        }
    }

    public static void zze(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    public static void zzf(org.json.JSONObject jSONObject) {
        float f;
        float f2;
        if (zzb != null) {
            zzb.getDefaultDisplay().getRealSize(new android.graphics.Point(0, 0));
            f = r0.x / zza;
            f2 = r0.y / zza;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean zzg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            java.lang.String[] strArr = zzc;
            int i = 0;
            while (true) {
                if (i < 4) {
                    java.lang.String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && java.lang.Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && java.lang.Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzh(optJSONArray, optJSONArray2)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    org.json.JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzh(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (zzg(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzh(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
