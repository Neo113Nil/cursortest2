package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Us {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f11828a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f11829b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f11830c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i5, int i6, int i7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f11830c);
            jSONObject.put("y", i5 / f11830c);
            jSONObject.put("width", i6 / f11830c);
            jSONObject.put("height", i7 / f11830c);
            return jSONObject;
        } catch (JSONException e3) {
            AbstractC1668us.q("Error with creating viewStateObject", e3);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e3) {
            AbstractC1668us.q("JSONException during JSONObject.put for name [" + str + "]", e3);
        }
    }

    public static void d(JSONObject jSONObject) {
        float f;
        float f5;
        if (f11828a != null) {
            Point point = new Point(0, 0);
            f11828a.getDefaultDisplay().getRealSize(point);
            float f6 = point.x;
            float f7 = f11830c;
            f = f6 / f7;
            f5 = point.y / f7;
        } else {
            f = 0.0f;
            f5 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f5);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f11829b;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                if (!optJSONArray.optString(i5, "").equals(optJSONArray2.optString(i5, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 == null && optJSONArray4 == null) {
                        return true;
                    }
                    if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                        for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                            if (e(optJSONArray3.optJSONObject(i6), optJSONArray4.optJSONObject(i6))) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
