package com.facetec.sdk;

/* loaded from: classes8.dex */
final class du {
    static org.json.JSONArray e = new org.json.JSONArray();

    du() {
    }

    static {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", com.facetec.sdk.Cdo.YOUR_ZOOM_IMAGE_OVERRIDE);
            jSONObject.put("overrideKey", "ac_ryzi");
            jSONObject.put("overrideValue", "cd0681bd-4522-4177-a3c7-1fa93e14734b");
            jSONObject.put("minValue", (java.lang.Object) null);
            jSONObject.put("maxValue", (java.lang.Object) null);
            e.put(jSONObject);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", com.facetec.sdk.Cdo.CLICKABLE_READY_SCREEN_SUBTEXT);
            jSONObject2.put("overrideKey", "ac_crs");
            jSONObject2.put("overrideValue", "6880e254-93ce-11ea-bb37-0242ac130002");
            jSONObject2.put("minValue", (java.lang.Object) null);
            jSONObject2.put("maxValue", (java.lang.Object) null);
            e.put(jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", com.facetec.sdk.Cdo.UNCONSTRAINED_GUIDANCE_STRING_LENGTHS);
            jSONObject3.put("overrideKey", "ac_ugsl");
            jSONObject3.put("overrideValue", "235dbd17-7bff-44de-a5ce-e59595d04799");
            jSONObject3.put("minValue", (java.lang.Object) null);
            jSONObject3.put("maxValue", (java.lang.Object) null);
            e.put(jSONObject3);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("type", com.facetec.sdk.Cdo.STANDALONE_IDSCAN_WATERMARK_CUSTOMIZATION);
            jSONObject4.put("overrideKey", "ac_idbic");
            jSONObject4.put("overrideValue", "f9c81685-ae63-47cc-a4fb-08469d7ea860");
            jSONObject4.put("minValue", (java.lang.Object) null);
            jSONObject4.put("maxValue", (java.lang.Object) null);
            e.put(jSONObject4);
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put("type", com.facetec.sdk.Cdo.ENABLE_SCREEN_CAPTURING);
            jSONObject5.put("overrideKey", "ac_esc");
            jSONObject5.put("overrideValue", "eb71b779-1756-49e8-ab9c-3dcca09b87b5");
            jSONObject5.put("minValue", (java.lang.Object) null);
            jSONObject5.put("maxValue", (java.lang.Object) null);
            e.put(jSONObject5);
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("type", com.facetec.sdk.Cdo.DEV_MODE_TAG);
            jSONObject6.put("overrideKey", "ac_dmt");
            jSONObject6.put("overrideValue", "44a72141-b436-44f4-b49d-4541445833ce");
            jSONObject6.put("minValue", (java.lang.Object) null);
            jSONObject6.put("maxValue", (java.lang.Object) null);
            e.put(jSONObject6);
        } catch (java.lang.Exception unused) {
        }
    }

    static void e(com.facetec.sdk.Cdo cdo) {
        if (cdo == com.facetec.sdk.Cdo.ENABLE_SCREEN_CAPTURING) {
            com.facetec.sdk.at.a("\n********************************************************************************************\n********************************************************************************************\n********************************************************************************************\n* WARNING: You have configured a development-only feature flag for FaceTecCustomization.   *\n* This is only supported for custom builds and cannot be released to Google Play.          *\n********************************************************************************************\n********************************************************************************************\n********************************************************************************************\n\n");
        }
    }
}
