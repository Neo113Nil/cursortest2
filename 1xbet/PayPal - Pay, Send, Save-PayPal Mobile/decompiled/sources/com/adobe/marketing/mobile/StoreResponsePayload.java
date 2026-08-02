package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class StoreResponsePayload {
    private final java.lang.String Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;
    final java.lang.Integer getHighSpeedVideoSizes;

    private StoreResponsePayload(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = num;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(13, num.intValue());
        this.getHighResolutionOutputSizeshNQ4ISI = calendar.getTimeInMillis();
    }

    final org.json.JSONObject getHighSpeedVideoFpsRanges() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("key", this.getHighSpeedVideoFpsRanges);
            jSONObject.put(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, this.Camera2StreamConfigurationMap);
            jSONObject.put("maxAge", this.getHighSpeedVideoSizes);
            jSONObject.put(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, this.getHighResolutionOutputSizeshNQ4ISI);
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayload", "Failed to create the json object from payload: %s", e.getLocalizedMessage());
            return null;
        }
    }

    static com.adobe.marketing.mobile.StoreResponsePayload getHighSpeedVideoFpsRanges(org.json.JSONObject jSONObject) {
        try {
            java.lang.String string = jSONObject.getString("key");
            java.lang.String string2 = jSONObject.getString(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            int optInt = jSONObject.optInt("maxAge", Integer.MIN_VALUE);
            long optLong = jSONObject.optLong(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, Long.MIN_VALUE);
            if (string == null) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayload", "Failed to create the payload from payload json object, key does not exist in the payload", new java.lang.Object[0]);
                return null;
            }
            if (string2 == null) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayload", "Failed to create the payload from payload json object, value does not exist in the payload", new java.lang.Object[0]);
                return null;
            }
            if (optInt == Integer.MIN_VALUE) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayload", "Failed to create the payload from payload json object, maxAge does not exist in the payload", new java.lang.Object[0]);
                return null;
            }
            com.adobe.marketing.mobile.StoreResponsePayload storeResponsePayload = new com.adobe.marketing.mobile.StoreResponsePayload(string, string2, java.lang.Integer.valueOf(optInt));
            if (optLong != Long.MIN_VALUE) {
                storeResponsePayload.getHighResolutionOutputSizeshNQ4ISI = optLong;
            }
            return storeResponsePayload;
        } catch (org.json.JSONException e) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "StoreResponsePayload", "Failed to create the json object from payload: %s", e.getLocalizedMessage());
            return null;
        }
    }
}
