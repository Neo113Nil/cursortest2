package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class JsonContentSchemaData implements com.adobe.marketing.mobile.messaging.SchemaData {
    private com.adobe.marketing.mobile.messaging.ContentType getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    JsonContentSchemaData(org.json.JSONObject jSONObject) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = null;
        try {
            java.lang.String optString = jSONObject.optString("format");
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.ContentType.APPLICATION_JSON;
            } else {
                this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.ContentType.getHighResolutionOutputSizeshNQ4ISI(optString);
            }
            try {
                this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.getJSONObject("content"));
            } catch (org.json.JSONException unused) {
                this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.util.JSONUtils.toList(jSONObject.getJSONArray("content"));
            }
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "JsonContentSchemaData", "Exception occurred creating HtmlContentSchemaData from json object: %s", e.getLocalizedMessage());
        }
    }

    @Override // com.adobe.marketing.mobile.messaging.SchemaData
    public java.lang.Object getContent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
