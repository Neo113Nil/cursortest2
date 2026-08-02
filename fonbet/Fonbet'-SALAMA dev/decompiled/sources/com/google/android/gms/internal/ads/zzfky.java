package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfky {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i7, int i8, int i9, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i7 / zza);
            jSONObject.put("y", i8 / zza);
            jSONObject.put("width", i9 / zza);
            jSONObject.put("height", i10 / zza);
        } catch (JSONException e7) {
            zzfkz.zza("Error with creating viewStateObject", e7);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e7) {
            zzfkz.zza("Error with setting ad session id", e7);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    public static void zzd(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zze(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e7) {
            zzfkz.zza("JSONException during JSONObject.put for name [" + str + "]", e7);
        }
    }

    public static void zzf(JSONObject jSONObject) {
        float f7;
        float f8;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f9 = point.x;
            float f10 = zza;
            f7 = f9 / f10;
            f8 = point.y / f10;
        } else {
            f7 = 0.0f;
            f8 = 0.0f;
        }
        try {
            jSONObject.put("width", f7);
            jSONObject.put("height", f8);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    public static boolean zzg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i7 = 0;
            while (true) {
                if (i7 < 4) {
                    String str = strArr[i7];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i7++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzh(optJSONArray, optJSONArray2)) {
                            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                if (!optJSONArray.optString(i8, "").equals(optJSONArray2.optString(i8, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzh(optJSONArray3, optJSONArray4)) {
                            for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                                if (zzg(optJSONArray3.optJSONObject(i9), optJSONArray4.optJSONObject(i9))) {
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

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
