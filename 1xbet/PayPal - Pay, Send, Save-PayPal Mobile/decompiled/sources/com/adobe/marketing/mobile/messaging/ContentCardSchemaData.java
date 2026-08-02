package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
public class ContentCardSchemaData implements com.adobe.marketing.mobile.messaging.SchemaData {
    private java.lang.Object Camera2StreamConfigurationMap;
    private com.adobe.marketing.mobile.messaging.ContentType getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    com.adobe.marketing.mobile.messaging.PropositionItem getHighSpeedVideoSizes;
    private int getInputFormats;

    ContentCardSchemaData(org.json.JSONObject jSONObject) {
        try {
            com.adobe.marketing.mobile.messaging.ContentType highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.ContentType.getHighResolutionOutputSizeshNQ4ISI(jSONObject.optString(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE));
            this.getHighResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
            if (highResolutionOutputSizeshNQ4ISI.equals(com.adobe.marketing.mobile.messaging.ContentType.APPLICATION_JSON)) {
                this.Camera2StreamConfigurationMap = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.getJSONObject("content"));
            } else {
                this.Camera2StreamConfigurationMap = jSONObject.getString("content");
            }
            this.getInputFormats = jSONObject.optInt("publishedDate");
            this.getHighSpeedVideoFpsRanges = jSONObject.optInt(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate);
            this.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.optJSONObject(com.adjust.sdk.Constants.REFERRER_API_META));
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "ContentCardSchemaData", "Exception occurred creating FeedItemSchemaData from json object: %s", e.getLocalizedMessage());
        }
    }

    @Override // com.adobe.marketing.mobile.messaging.SchemaData
    public java.lang.Object getContent() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.adobe.marketing.mobile.messaging.ContentType getContentType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getPublishedDate() {
        return this.getInputFormats;
    }

    public int getExpiryDate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMeta() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @java.lang.Deprecated
    public com.adobe.marketing.mobile.messaging.ContentCard getContentCard() {
        java.lang.String str;
        java.lang.String str2;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.equals(com.adobe.marketing.mobile.messaging.ContentType.APPLICATION_JSON)) {
            return null;
        }
        try {
            java.util.HashMap hashMap = (java.util.HashMap) this.Camera2StreamConfigurationMap;
            java.lang.String optString = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, "title", "");
            java.lang.String optString2 = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "");
            java.lang.String optString3 = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, "imageUrl", "");
            java.lang.String optString4 = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.ACTION_URL, "");
            java.lang.String optString5 = com.adobe.marketing.mobile.util.DataReader.optString(hashMap, "actionTitle", "");
            com.adobe.marketing.mobile.messaging.ContentCard.Builder builder = new com.adobe.marketing.mobile.messaging.ContentCard.Builder(optString, optString2);
            if (!builder.getHighSpeedVideoFpsRanges) {
                builder.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor = optString3;
                if (!builder.getHighSpeedVideoFpsRanges) {
                    builder.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes = optString4;
                    if (!builder.getHighSpeedVideoFpsRanges) {
                        builder.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = optString5;
                        if (!builder.getHighSpeedVideoFpsRanges) {
                            builder.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = new java.lang.ref.SoftReference<>(this);
                            str = builder.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
                            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
                                return null;
                            }
                            str2 = builder.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                            if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
                                return null;
                            }
                            if (!builder.getHighSpeedVideoFpsRanges) {
                                builder.getHighSpeedVideoFpsRanges = true;
                                return builder.getHighSpeedVideoFpsRangesFor;
                            }
                            throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
                        }
                        throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
                    }
                    throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
                }
                throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
            }
            throw new java.lang.UnsupportedOperationException("Attempted to call methods on FeedItem.Builder after build() was invoked.");
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public void track(java.lang.String str, com.adobe.marketing.mobile.MessagingEdgeEventType messagingEdgeEventType) {
        com.adobe.marketing.mobile.messaging.PropositionItem propositionItem = this.getHighSpeedVideoSizes;
        if (propositionItem == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "ContentCardSchemaData", "Unable to track ContentCardSchemaData, parent proposition item is unavailable.", new java.lang.Object[0]);
        } else {
            propositionItem.track(str, messagingEdgeEventType, null);
        }
    }
}
