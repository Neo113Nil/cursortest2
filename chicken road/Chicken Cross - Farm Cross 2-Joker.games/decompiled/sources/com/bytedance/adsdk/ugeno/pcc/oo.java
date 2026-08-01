package com.bytedance.adsdk.ugeno.pcc;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.pcc.gm;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo {
    public static int pcc(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return Integer.MIN_VALUE;
        }
        return i - 1;
    }

    public static List<gm> pcc(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(pcc(optJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static gm pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        gm gmVar = new gm();
        gmVar.sf(com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("delay"), jSONObject2), 0L));
        gmVar.gm(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("name"), jSONObject2));
        gmVar.sf(com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("playState"), jSONObject2), 1));
        gmVar.pcc(Math.max(com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString(IronSourceConstants.EVENTS_DURATION), jSONObject2), 0L), 0L));
        gmVar.pcc(com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("playCount"), jSONObject2), 1));
        gmVar.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("playDirection"), jSONObject2));
        gmVar.pcc(gm(jSONObject.optString("transformOrigin"), jSONObject2));
        gmVar.sf(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        gmVar.pcc(jSONObject.optJSONObject("effect"));
        gmVar.pcc(pcc(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return gmVar;
    }

    public static Map<String, TreeMap<Float, String>> pcc(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                float optDouble = (float) optJSONObject.optDouble("offset");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, "offset")) {
                        TreeMap treeMap = (TreeMap) hashMap.get(next);
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                            hashMap.put(next, treeMap);
                        }
                        treeMap.put(Float.valueOf(optDouble), oo(optJSONObject.optString(next), jSONObject));
                    }
                }
            }
        }
        return hashMap;
    }

    private static String oo(String str, JSONObject jSONObject) {
        String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(str, jSONObject);
        if (gm(pcc)) {
            return Arrays.toString(sf(pcc, jSONObject));
        }
        return com.bytedance.adsdk.ugeno.gm.sf.pcc(pcc, jSONObject);
    }

    public static int pcc(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (hashCode != -1039745817) {
            return 1;
        }
        str.equals(Constants.NORMAL);
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Interpolator sf(String str) {
        char c;
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new AccelerateInterpolator();
        }
        if (c == 1) {
            return new AccelerateDecelerateInterpolator();
        }
        if (c == 2) {
            return new DecelerateInterpolator();
        }
        return new LinearInterpolator();
    }

    public static float[] sf(String str, JSONObject jSONObject) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray pcc = com.bytedance.adsdk.ugeno.qf.sf.pcc(str, (JSONArray) null);
        if (pcc != null && pcc.length() == 2) {
            fArr[0] = (float) com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(pcc.optString(0), jSONObject), 0.0d);
            fArr[1] = (float) com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(pcc.optString(1), jSONObject), 0.0d);
        }
        return fArr;
    }

    public static boolean gm(String str) {
        JSONArray pcc = com.bytedance.adsdk.ugeno.qf.sf.pcc(str, (JSONArray) null);
        return pcc != null && pcc.length() > 0;
    }

    public static gm.pcc gm(String str, JSONObject jSONObject) {
        JSONArray pcc;
        if (TextUtils.isEmpty(str) || (pcc = com.bytedance.adsdk.ugeno.qf.sf.pcc(str, (JSONArray) null)) == null || pcc.length() != 2) {
            return null;
        }
        gm.pcc pccVar = new gm.pcc();
        pccVar.pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(pcc.optString(0), jSONObject);
        pccVar.sf = com.bytedance.adsdk.ugeno.gm.sf.pcc(pcc.optString(1), jSONObject);
        return pccVar;
    }

    public static int pcc(String str, int i) {
        int i2 = i / 2;
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        str.hashCode();
        switch (str) {
            case "bottom":
            case "right":
                return i;
            case "center":
                return i2;
            case "top":
            case "left":
                return 0;
            default:
                if (str.endsWith("%")) {
                    try {
                        return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                    } catch (NumberFormatException unused) {
                        return i2;
                    }
                }
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    return i2;
                }
        }
    }
}
