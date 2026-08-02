package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class EventHistoryOperationSchemaData implements com.adobe.marketing.mobile.messaging.SchemaData {
    java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoSizes;

    EventHistoryOperationSchemaData(org.json.JSONObject jSONObject) {
        try {
            this.getHighSpeedVideoSizes = jSONObject.getString(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION);
            this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.util.JSONUtils.toMap(jSONObject.getJSONObject("content"));
        } catch (java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "EventHistoryOperationSchemaData", "Error parsing EventHistoryOperationSchemaData: %s", e.getMessage());
        }
    }

    @Override // com.adobe.marketing.mobile.messaging.SchemaData
    public java.lang.Object getContent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
