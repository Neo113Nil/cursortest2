package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class InAppSchemaData implements com.adobe.marketing.mobile.messaging.SchemaData {
    private int Camera2StreamConfigurationMap;
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private com.adobe.marketing.mobile.messaging.ContentType getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.lang.Object> getOutputFormats;
    private java.util.List<java.lang.String> getOutputMinFrameDuration;

    InAppSchemaData(org.json.JSONObject jSONObject) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
        this.getInputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputFormats = null;
        this.getOutputMinFrameDuration = null;
        try {
            java.lang.String optString = jSONObject.optString(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(optString)) {
                this.getHighSpeedVideoSizes = com.adobe.marketing.mobile.messaging.ContentType.getHighResolutionOutputSizeshNQ4ISI(optString);
                return;
            }
            com.adobe.marketing.mobile.messaging.ContentType highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.ContentType.getHighResolutionOutputSizeshNQ4ISI(optString);
            this.getHighSpeedVideoSizes = highResolutionOutputSizeshNQ4ISI;
            if (highResolutionOutputSizeshNQ4ISI.equals(com.adobe.marketing.mobile.messaging.ContentType.APPLICATION_JSON)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.getJSONObject("content"));
                } catch (org.json.JSONException unused) {
                    this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.util.JSONUtils.toList(jSONObject.getJSONArray("content"));
                }
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = jSONObject.getString("content");
            }
            this.getInputSizeshNQ4ISI = jSONObject.optInt("publishedDate");
            this.Camera2StreamConfigurationMap = jSONObject.optInt(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate);
            this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.optJSONObject(com.adjust.sdk.Constants.REFERRER_API_META));
            this.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.optJSONObject("mobileParameters"));
            this.getOutputFormats = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.optJSONObject("webParameters"));
            java.util.List<java.lang.Object> list = com.adobe.marketing.mobile.util.JSONUtils.toList(jSONObject.optJSONArray("remoteAssets"));
            if (com.adobe.marketing.mobile.messaging.MessagingUtils.Camera2StreamConfigurationMap(list)) {
                return;
            }
            this.getOutputMinFrameDuration = new java.util.ArrayList();
            java.util.Iterator<java.lang.Object> it = list.iterator();
            while (it.hasNext()) {
                this.getOutputMinFrameDuration.add(it.next().toString());
            }
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "InAppSchemaData", "Exception occurred creating InAppSchemaData from json object: %s", e.getLocalizedMessage());
        }
    }

    @Override // com.adobe.marketing.mobile.messaging.SchemaData
    public java.lang.Object getContent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.adobe.marketing.mobile.messaging.ContentType getContentType() {
        return this.getHighSpeedVideoSizes;
    }

    public int getPublishedDate() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getExpiryDate() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMeta() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMobileParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getWebParameters() {
        return this.getOutputFormats;
    }

    public java.util.List<java.lang.String> getRemoteAssets() {
        return this.getOutputMinFrameDuration;
    }
}
