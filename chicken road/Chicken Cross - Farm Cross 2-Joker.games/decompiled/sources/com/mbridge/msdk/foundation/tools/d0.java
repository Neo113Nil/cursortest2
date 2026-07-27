package com.mbridge.msdk.foundation.tools;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.inmobi.unification.sdk.InitializationStatus;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonUtils.java */
/* loaded from: classes6.dex */
public class d0 {
    public static String a(int i, int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 0);
                jSONObject.put("message", InitializationStatus.SUCCESS);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("left", i2);
                jSONObject3.put("right", i3);
                jSONObject3.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, i4);
                jSONObject3.put("bottom", i5);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e) {
                q0.b("JSONUtils", e.getMessage());
            }
        } catch (Throwable th) {
            q0.b("JSONUtils", th.getMessage());
            try {
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, 1);
                jSONObject.put("message", "Fail");
            } catch (JSONException e2) {
                q0.b("JSONUtils", e2.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }
}
