package com.adobe.marketing.mobile.messaging;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class FeedItemSchemaData implements com.adobe.marketing.mobile.messaging.SchemaData {
    com.adobe.marketing.mobile.messaging.PropositionItem Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private com.adobe.marketing.mobile.messaging.ContentType getHighSpeedVideoFpsRanges;
    private java.lang.Object getHighSpeedVideoFpsRangesFor;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes;
    private int getOutputFormats;

    FeedItemSchemaData(org.json.JSONObject jSONObject) {
        try {
            com.adobe.marketing.mobile.messaging.ContentType highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.ContentType.getHighResolutionOutputSizeshNQ4ISI(jSONObject.optString(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE));
            this.getHighSpeedVideoFpsRanges = highResolutionOutputSizeshNQ4ISI;
            if (highResolutionOutputSizeshNQ4ISI.equals(com.adobe.marketing.mobile.messaging.ContentType.APPLICATION_JSON)) {
                this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.getJSONObject("content"));
            } else {
                this.getHighSpeedVideoFpsRangesFor = jSONObject.getString("content");
            }
            this.getOutputFormats = jSONObject.optInt("publishedDate");
            this.getHighResolutionOutputSizeshNQ4ISI = jSONObject.optInt(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate);
            this.getHighSpeedVideoSizes = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.optJSONObject(com.adjust.sdk.Constants.REFERRER_API_META));
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "FeedItemSchemaData", "Exception occurred creating FeedItemSchemaData from json object: %s", e.getLocalizedMessage());
        }
    }

    @Override // com.adobe.marketing.mobile.messaging.SchemaData
    public java.lang.Object getContent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.adobe.marketing.mobile.messaging.ContentType getContentType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getPublishedDate() {
        return this.getOutputFormats;
    }

    public int getExpiryDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMeta() {
        return this.getHighSpeedVideoSizes;
    }

    public com.adobe.marketing.mobile.messaging.FeedItem getFeedItem() {
        if (!this.getHighSpeedVideoFpsRanges.equals(com.adobe.marketing.mobile.messaging.ContentType.APPLICATION_JSON)) {
            return null;
        }
        try {
            java.util.HashMap hashMap = (java.util.HashMap) this.getHighSpeedVideoFpsRangesFor;
            java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, "title", "");
            java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "");
            java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, "imageUrl", "");
            java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.ACTION_URL, "");
            return new com.adobe.marketing.mobile.messaging.FeedItem.Builder(optString, optString2).setImageUrl(optString3).setActionUrl(optString4).setActionTitle(com.adobe.marketing.mobile.util.DataReader.optString(hashMap, "actionTitle", "")).setParent(this).build();
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public void track(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
        com.adobe.marketing.mobile.messaging.PropositionItem propositionItem = this.Camera2StreamConfigurationMap;
        if (propositionItem == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "FeedItemSchemaData", "Unable to track FeedItemSchemaData, parent proposition item is unavailable.", new java.lang.Object[0]);
        } else {
            propositionItem.track(str, messagingEdgeEventType, null);
        }
    }
}
