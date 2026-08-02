package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class HtmlContentSchemaData implements com.adobe.marketing.mobile.messaging.SchemaData {
    private java.lang.String getHighSpeedVideoFpsRanges;
    private com.adobe.marketing.mobile.messaging.ContentType getHighSpeedVideoFpsRangesFor;

    HtmlContentSchemaData(org.json.JSONObject jSONObject) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        try {
            java.lang.String optString = jSONObject.optString("format");
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.messaging.ContentType.TEXT_HTML;
            } else {
                this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.messaging.ContentType.getHighResolutionOutputSizeshNQ4ISI(optString);
            }
            this.getHighSpeedVideoFpsRanges = jSONObject.getString("content");
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "HtmlContentSchemaData", "Exception occurred creating HtmlContentSchemaData from json object: %s", e.getLocalizedMessage());
        }
    }

    @Override // com.adobe.marketing.mobile.messaging.SchemaData
    public java.lang.String getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.adobe.marketing.mobile.messaging.ContentType getFormat() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
